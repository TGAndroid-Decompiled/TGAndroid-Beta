package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_messages_archivedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getArchivedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ArchivedStickersActivity;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;

public class ArchivedStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int archiveInfoRow;
    private int currentType;
    private Runnable doOnTransitionEnd;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private boolean firstLoaded;
    private boolean isInTransition;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loadingStickers;
    private int rowCount;
    private int stickersEndRow;
    private int stickersLoadingRow;
    private int stickersShadowRow;
    private int stickersStartRow;
    private final LongSparseArray<TLRPC$StickerSetCovered> installingStickerSets = new LongSparseArray<>();
    private HashSet<Long> loadedSets = new HashSet<>();
    private ArrayList<TLRPC$StickerSetCovered> sets = new ArrayList<>();

    public ArchivedStickersActivity(int i) {
        this.currentType = i;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getStickers();
        updateRows();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString("ArchivedStickers", R.string.ArchivedStickers));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString("ArchivedEmojiPacks", R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString("ArchivedMasks", R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    ArchivedStickersActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        if (this.currentType == 0) {
            emptyTextProgressView.setText(LocaleController.getString("ArchivedStickersEmpty", R.string.ArchivedStickersEmpty));
        } else {
            emptyTextProgressView.setText(LocaleController.getString("ArchivedMasksEmpty", R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        if (this.loadingStickers) {
            this.emptyView.showProgress();
        } else {
            this.emptyView.showTextView();
        }
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFocusable(true);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ArchivedStickersActivity.this.lambda$createView$0(view, i2);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (ArchivedStickersActivity.this.loadingStickers || ArchivedStickersActivity.this.endReached || ArchivedStickersActivity.this.layoutManager.findLastVisibleItemPosition() <= ArchivedStickersActivity.this.stickersLoadingRow - 2) {
                    return;
                }
                ArchivedStickersActivity.this.getStickers();
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$0(final View view, int i) {
        TLRPC$InputStickerSet tLRPC$TL_inputStickerSetShortName;
        if (i < this.stickersStartRow || i >= this.stickersEndRow || getParentActivity() == null) {
            return;
        }
        final TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.sets.get(i - this.stickersStartRow);
        if (tLRPC$StickerSetCovered.set.id != 0) {
            tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_inputStickerSetShortName.id = tLRPC$StickerSetCovered.set.id;
        } else {
            tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_inputStickerSetShortName.short_name = tLRPC$StickerSetCovered.set.short_name;
        }
        TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$TL_inputStickerSetShortName;
        tLRPC$InputStickerSet.access_hash = tLRPC$StickerSetCovered.set.access_hash;
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, tLRPC$InputStickerSet, (TLRPC$TL_messages_stickerSet) null, (StickersAlert.StickersAlertDelegate) null);
        stickersAlert.setInstallDelegate(new StickersAlert.StickersAlertInstallDelegate() {
            @Override
            public void onStickerSetUninstalled() {
            }

            @Override
            public void onStickerSetInstalled() {
                ((ArchivedStickerSetCell) view).setDrawProgress(true, true);
                LongSparseArray longSparseArray = ArchivedStickersActivity.this.installingStickerSets;
                TLRPC$StickerSetCovered tLRPC$StickerSetCovered2 = tLRPC$StickerSetCovered;
                longSparseArray.put(tLRPC$StickerSetCovered2.set.id, tLRPC$StickerSetCovered2);
            }
        });
        showDialog(stickersAlert);
    }

    private void updateRows() {
        int i;
        this.rowCount = 0;
        if (!this.sets.isEmpty()) {
            int i2 = this.currentType;
            if (i2 == 0 || i2 == 5) {
                i = this.rowCount;
                this.rowCount = i + 1;
            } else {
                i = -1;
            }
            this.archiveInfoRow = i;
            int i3 = this.rowCount;
            this.stickersStartRow = i3;
            this.stickersEndRow = i3 + this.sets.size();
            int size = this.rowCount + this.sets.size();
            this.rowCount = size;
            if (!this.endReached) {
                this.rowCount = size + 1;
                this.stickersLoadingRow = size;
                this.stickersShadowRow = -1;
                return;
            } else {
                this.rowCount = size + 1;
                this.stickersShadowRow = size;
                this.stickersLoadingRow = -1;
                return;
            }
        }
        this.archiveInfoRow = -1;
        this.stickersStartRow = -1;
        this.stickersEndRow = -1;
        this.stickersLoadingRow = -1;
        this.stickersShadowRow = -1;
    }

    public void getStickers() {
        long j;
        if (this.loadingStickers || this.endReached) {
            return;
        }
        this.loadingStickers = true;
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView != null && !this.firstLoaded) {
            emptyTextProgressView.showProgress();
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        TLRPC$TL_messages_getArchivedStickers tLRPC$TL_messages_getArchivedStickers = new TLRPC$TL_messages_getArchivedStickers();
        if (this.sets.isEmpty()) {
            j = 0;
        } else {
            ArrayList<TLRPC$StickerSetCovered> arrayList = this.sets;
            j = arrayList.get(arrayList.size() - 1).set.id;
        }
        tLRPC$TL_messages_getArchivedStickers.offset_id = j;
        tLRPC$TL_messages_getArchivedStickers.limit = 15;
        int i = this.currentType;
        tLRPC$TL_messages_getArchivedStickers.masks = i == 1;
        tLRPC$TL_messages_getArchivedStickers.emojis = i == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getArchivedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArchivedStickersActivity.this.lambda$getStickers$2(tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$getStickers$2(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArchivedStickersActivity.this.lambda$getStickers$1(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$getStickers$1(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            lambda$processResponse$3((TLRPC$TL_messages_archivedStickers) tLObject);
        }
    }

    public void lambda$processResponse$3(final TLRPC$TL_messages_archivedStickers tLRPC$TL_messages_archivedStickers) {
        if (!this.isInTransition) {
            Iterator<TLRPC$StickerSetCovered> it = tLRPC$TL_messages_archivedStickers.sets.iterator();
            int i = 0;
            while (it.hasNext()) {
                TLRPC$StickerSetCovered next = it.next();
                if (!this.loadedSets.contains(Long.valueOf(next.set.id))) {
                    this.loadedSets.add(Long.valueOf(next.set.id));
                    this.sets.add(next);
                    i++;
                }
            }
            this.endReached = i <= 0;
            this.loadingStickers = false;
            this.firstLoaded = true;
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
            updateRows();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.doOnTransitionEnd = new Runnable() {
            @Override
            public final void run() {
                ArchivedStickersActivity.this.lambda$processResponse$3(tLRPC$TL_messages_archivedStickers);
            }
        };
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        this.isInTransition = true;
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.isInTransition = false;
        Runnable runnable = this.doOnTransitionEnd;
        if (runnable != null) {
            runnable.run();
            this.doOnTransitionEnd = null;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        ArchivedStickerSetCell archivedStickerSetCell;
        TLRPC$StickerSetCovered stickersSet;
        if (i == NotificationCenter.needAddArchivedStickers) {
            ArrayList arrayList = new ArrayList((List) objArr[0]);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int size2 = this.sets.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (this.sets.get(i3).set.id == ((TLRPC$StickerSetCovered) arrayList.get(size)).set.id) {
                        arrayList.remove(size);
                        break;
                    }
                    i3++;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.sets.addAll(0, arrayList);
            updateRows();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyItemRangeInserted(this.stickersStartRow, arrayList.size());
                return;
            }
            return;
        }
        if (i != NotificationCenter.stickersDidLoad || (recyclerListView = this.listView) == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.listView.getChildAt(i4);
            if ((childAt instanceof ArchivedStickerSetCell) && (stickersSet = (archivedStickerSetCell = (ArchivedStickerSetCell) childAt).getStickersSet()) != null) {
                boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.id);
                if (isStickerPackInstalled) {
                    this.installingStickerSets.remove(stickersSet.set.id);
                    archivedStickerSetCell.setDrawProgress(false, true);
                }
                archivedStickerSetCell.setChecked(isStickerPackInstalled, true, false);
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return ArchivedStickersActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            String str;
            if (getItemViewType(i) == 0) {
                int i3 = i - ArchivedStickersActivity.this.stickersStartRow;
                ArchivedStickerSetCell archivedStickerSetCell = (ArchivedStickerSetCell) viewHolder.itemView;
                final TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) ArchivedStickersActivity.this.sets.get(i3);
                archivedStickerSetCell.setStickersSet(tLRPC$StickerSetCovered, i3 != ArchivedStickersActivity.this.sets.size() - 1);
                boolean isStickerPackInstalled = MediaDataController.getInstance(((BaseFragment) ArchivedStickersActivity.this).currentAccount).isStickerPackInstalled(tLRPC$StickerSetCovered.set.id);
                archivedStickerSetCell.setChecked(isStickerPackInstalled, false, false);
                if (isStickerPackInstalled) {
                    ArchivedStickersActivity.this.installingStickerSets.remove(tLRPC$StickerSetCovered.set.id);
                    archivedStickerSetCell.setDrawProgress(false, false);
                } else {
                    archivedStickerSetCell.setDrawProgress(ArchivedStickersActivity.this.installingStickerSets.indexOfKey(tLRPC$StickerSetCovered.set.id) >= 0, false);
                }
                archivedStickerSetCell.setOnCheckedChangeListener(new ArchivedStickerSetCell.OnCheckedChangeListener() {
                    @Override
                    public final void onCheckedChanged(ArchivedStickerSetCell archivedStickerSetCell2, boolean z) {
                        ArchivedStickersActivity.ListAdapter.this.lambda$onBindViewHolder$0(tLRPC$StickerSetCovered, archivedStickerSetCell2, z);
                    }
                });
                return;
            }
            if (getItemViewType(i) == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == ArchivedStickersActivity.this.archiveInfoRow) {
                    textInfoPrivacyCell.setTopPadding(17);
                    textInfoPrivacyCell.setBottomPadding(10);
                    if (ArchivedStickersActivity.this.currentType == 5) {
                        i2 = R.string.ArchivedEmojiInfo;
                        str = "ArchivedEmojiInfo";
                    } else {
                        i2 = R.string.ArchivedStickersInfo;
                        str = "ArchivedStickersInfo";
                    }
                    textInfoPrivacyCell.setText(LocaleController.getString(str, i2));
                    return;
                }
                textInfoPrivacyCell.setTopPadding(10);
                textInfoPrivacyCell.setBottomPadding(17);
                textInfoPrivacyCell.setText(null);
            }
        }

        public void lambda$onBindViewHolder$0(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, ArchivedStickerSetCell archivedStickerSetCell, boolean z) {
            if (z) {
                archivedStickerSetCell.setChecked(false, false, false);
                if (ArchivedStickersActivity.this.installingStickerSets.indexOfKey(tLRPC$StickerSetCovered.set.id) >= 0) {
                    return;
                }
                archivedStickerSetCell.setDrawProgress(true, true);
                ArchivedStickersActivity.this.installingStickerSets.put(tLRPC$StickerSetCovered.set.id, tLRPC$StickerSetCovered);
            }
            MediaDataController.getInstance(((BaseFragment) ArchivedStickersActivity.this).currentAccount).toggleStickerSet(ArchivedStickersActivity.this.getParentActivity(), tLRPC$StickerSetCovered, !z ? 1 : 2, ArchivedStickersActivity.this, false, false);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                ArchivedStickerSetCell archivedStickerSetCell = new ArchivedStickerSetCell(this.mContext, true);
                archivedStickerSetCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                view = archivedStickerSetCell;
            } else if (i == 1) {
                view = new LoadingCell(this.mContext);
                view.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i != 2) {
                view = null;
            } else {
                view = new TextInfoPrivacyCell(this.mContext);
                view.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public int getItemViewType(int i) {
            if (i >= ArchivedStickersActivity.this.stickersStartRow && i < ArchivedStickersActivity.this.stickersEndRow) {
                return 0;
            }
            if (i == ArchivedStickersActivity.this.stickersLoadingRow) {
                return 1;
            }
            return (i == ArchivedStickersActivity.this.stickersShadowRow || i == ArchivedStickersActivity.this.archiveInfoRow) ? 2 : 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ArchivedStickerSetCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LoadingCell.class, TextInfoPrivacyCell.class}, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = ThemeDescription.FLAG_BACKGROUND;
        int i3 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        int i4 = ThemeDescription.FLAG_PROGRESSBAR;
        int i5 = Theme.key_progressCircle;
        arrayList.add(new ThemeDescription(emptyTextProgressView, i4, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i6 = Theme.key_featuredStickers_removeButtonText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"deleteButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{ArchivedStickerSetCell.class}, new String[]{"deleteButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"addButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{ArchivedStickerSetCell.class}, new String[]{"addButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{ArchivedStickerSetCell.class}, new String[]{"addButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButtonPressed));
        return arrayList;
    }
}
