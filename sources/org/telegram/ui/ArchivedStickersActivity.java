package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;

public class ArchivedStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int archiveInfoRow;
    private int currentType;
    private Runnable doOnTransitionEnd;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private boolean firstLoaded;
    private final LongSparseArray installingStickerSets;
    private boolean isInTransition;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private HashSet<Long> loadedSets;
    private boolean loadingStickers;
    private int rowCount;
    private ArrayList<TLRPC.StickerSetCovered> sets;
    private int stickersEndRow;
    private int stickersLoadingRow;
    private int stickersShadowRow;
    private int stickersStartRow;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onBindViewHolder$0(TLRPC.StickerSetCovered stickerSetCovered, ArchivedStickerSetCell archivedStickerSetCell, boolean z) {
            if (z) {
                archivedStickerSetCell.setChecked(false, false, false);
                if (ArchivedStickersActivity.this.installingStickerSets.indexOfKey(stickerSetCovered.set.id) >= 0) {
                    return;
                }
                ProgressButton progressButton = archivedStickerSetCell.addButton;
                if (progressButton != null) {
                    progressButton.setDrawProgress(true, true);
                }
                ArchivedStickersActivity.this.installingStickerSets.put(stickerSetCovered, stickerSetCovered.set.id);
            }
            MediaDataController.getInstance(((BaseFragment) ArchivedStickersActivity.this).currentAccount).toggleStickerSet(ArchivedStickersActivity.this.getParentActivity(), stickerSetCovered, !z ? 1 : 2, ArchivedStickersActivity.this, false, false);
        }

        @Override
        public int getItemCount() {
            return ArchivedStickersActivity.this.rowCount;
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

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (getItemViewType(i) != 0) {
                if (getItemViewType(i) == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == ArchivedStickersActivity.this.archiveInfoRow) {
                        textInfoPrivacyCell.setTopPadding(17);
                        textInfoPrivacyCell.setBottomPadding(10);
                        textInfoPrivacyCell.setText(LocaleController.getString(ArchivedStickersActivity.this.currentType == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                        return;
                    } else {
                        textInfoPrivacyCell.setTopPadding(10);
                        textInfoPrivacyCell.setBottomPadding(17);
                        textInfoPrivacyCell.setText(null);
                        return;
                    }
                }
                return;
            }
            int i2 = i - ArchivedStickersActivity.this.stickersStartRow;
            ArchivedStickerSetCell archivedStickerSetCell = (ArchivedStickerSetCell) viewHolder.itemView;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) ArchivedStickersActivity.this.sets.get(i2);
            archivedStickerSetCell.setStickersSet(stickerSetCovered, i2 != ArchivedStickersActivity.this.sets.size() - 1);
            boolean zIsStickerPackInstalled = MediaDataController.getInstance(((BaseFragment) ArchivedStickersActivity.this).currentAccount).isStickerPackInstalled(stickerSetCovered.set.id);
            archivedStickerSetCell.setChecked(zIsStickerPackInstalled, false, false);
            ProgressButton progressButton = archivedStickerSetCell.addButton;
            if (zIsStickerPackInstalled) {
                ArchivedStickersActivity.this.installingStickerSets.remove(stickerSetCovered.set.id);
                if (progressButton != null) {
                    progressButton.setDrawProgress(false, false);
                }
            } else {
                boolean z = ArchivedStickersActivity.this.installingStickerSets.indexOfKey(stickerSetCovered.set.id) >= 0;
                if (progressButton != null) {
                    progressButton.setDrawProgress(z, false);
                }
            }
            archivedStickerSetCell.setOnCheckedChangeListener(new WearAuthSheet$$ExternalSyntheticLambda3(1, this, stickerSetCovered));
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View loadingCell = null;
            if (i == 0) {
                ArchivedStickerSetCell archivedStickerSetCell = new ArchivedStickerSetCell(this.mContext, true);
                archivedStickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                loadingCell = archivedStickerSetCell;
            } else if (i == 1) {
                loadingCell = new LoadingCell(this.mContext);
            } else if (i == 2) {
                loadingCell = new TextInfoPrivacyCell(this.mContext, 24, null);
            }
            loadingCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(loadingCell);
        }
    }

    public ArchivedStickersActivity(int i) {
        super(null);
        this.installingStickerSets = new LongSparseArray();
        this.loadedSets = new HashSet<>();
        this.sets = new ArrayList<>();
        this.currentType = i;
    }

    public void getStickers() {
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
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.offset_id = this.sets.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) zzin.m(1, this.sets)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i = this.currentType;
        tL_messages_getArchivedStickers.masks = i == 1;
        tL_messages_getArchivedStickers.emojis = i == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new LinkManager$$ExternalSyntheticLambda10(this, 5)), this.classGuid);
    }

    public void lambda$createView$0(final View view, int i) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        if (i < this.stickersStartRow || i >= this.stickersEndRow || getParentActivity() == null) {
            return;
        }
        final TLRPC.StickerSetCovered stickerSetCovered = this.sets.get(i - this.stickersStartRow);
        if (stickerSetCovered.set.id != 0) {
            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
        } else {
            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
        }
        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
        inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, inputStickerSet, null, null, false);
        stickersAlert.setInstallDelegate(new StickersAlert.StickersAlertInstallDelegate() {
            @Override
            public void onStickerSetInstalled() {
                ProgressButton progressButton = ((ArchivedStickerSetCell) view).addButton;
                if (progressButton != null) {
                    progressButton.setDrawProgress(true, true);
                }
                LongSparseArray longSparseArray = ArchivedStickersActivity.this.installingStickerSets;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                longSparseArray.put(stickerSetCovered2, stickerSetCovered2.set.id);
            }

            @Override
            public void onStickerSetUninstalled() {
            }
        });
        showDialog(stickersAlert);
    }

    public void lambda$getStickers$1(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            lambda$processResponse$3((TLRPC.TL_messages_archivedStickers) tLObject);
        }
    }

    public void lambda$getStickers$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, tL_error, tLObject, 23));
    }

    public void lambda$processResponse$3(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.isInTransition) {
            this.doOnTransitionEnd = new PhotoViewer$7$$ExternalSyntheticLambda0(16, this, tL_messages_archivedStickers);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i);
            i++;
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            if (!this.loadedSets.contains(Long.valueOf(stickerSetCovered2.set.id))) {
                this.loadedSets.add(Long.valueOf(stickerSetCovered2.set.id));
                this.sets.add(stickerSetCovered2);
                i2++;
            }
        }
        this.endReached = i2 <= 0;
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
        }
    }

    private void updateRows() {
        int i;
        this.rowCount = 0;
        if (this.sets.isEmpty()) {
            this.archiveInfoRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
            this.stickersLoadingRow = -1;
            this.stickersShadowRow = -1;
            return;
        }
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
        this.stickersEndRow = this.sets.size() + i3;
        int size = this.sets.size() + this.rowCount;
        this.rowCount = size;
        if (this.endReached) {
            this.rowCount = size + 1;
            this.stickersShadowRow = size;
            this.stickersLoadingRow = -1;
        } else {
            this.rowCount = size + 1;
            this.stickersLoadingRow = size;
            this.stickersShadowRow = -1;
        }
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    ArchivedStickersActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        if (this.currentType == 0) {
            emptyTextProgressView.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            emptyTextProgressView.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 8));
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

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        ArchivedStickerSetCell archivedStickerSetCell;
        TLRPC.StickerSetCovered stickersSet;
        if (i != NotificationCenter.needAddArchivedStickers) {
            if (i != NotificationCenter.stickersDidLoad || (recyclerListView = this.listView) == null) {
                return;
            }
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                if ((childAt instanceof ArchivedStickerSetCell) && (stickersSet = (archivedStickerSetCell = (ArchivedStickerSetCell) childAt).getStickersSet()) != null) {
                    boolean zIsStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.id);
                    if (zIsStickerPackInstalled) {
                        this.installingStickerSets.remove(stickersSet.set.id);
                        ProgressButton progressButton = archivedStickerSetCell.addButton;
                        if (progressButton != null) {
                            progressButton.setDrawProgress(false, true);
                        }
                    }
                    archivedStickerSetCell.setChecked(zIsStickerPackInstalled, true, false);
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList((List) objArr[0]);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int size2 = this.sets.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (this.sets.get(i4).set.id == ((TLRPC.StickerSetCovered) arrayList.get(size)).set.id) {
                    arrayList.remove(size);
                    break;
                }
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
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{ArchivedStickerSetCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        int i = Theme.key_progressCircle;
        arrayList.add(new ThemeDescription(emptyTextProgressView, 2048, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_featuredStickers_removeButtonText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"deleteButton"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{ArchivedStickerSetCell.class}, new String[]{"deleteButton"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ArchivedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, 131072, new Class[]{ArchivedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{ArchivedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_addButtonPressed));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
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
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
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
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.isInTransition = false;
        Runnable runnable = this.doOnTransitionEnd;
        if (runnable != null) {
            runnable.run();
            this.doOnTransitionEnd = null;
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        this.isInTransition = true;
    }
}
