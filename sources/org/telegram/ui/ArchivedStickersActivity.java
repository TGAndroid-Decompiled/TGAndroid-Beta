package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
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

public final class ArchivedStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int archiveInfoRow;
    public final int currentType;
    public ArticleViewer$$ExternalSyntheticLambda8 doOnTransitionEnd;
    public EmptyTextProgressView emptyView;
    public boolean endReached;
    public boolean firstLoaded;
    public final LongSparseArray installingStickerSets;
    public boolean isInTransition;
    public LinearLayoutManager layoutManager;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public final HashSet loadedSets;
    public boolean loadingStickers;
    public int rowCount;
    public final ArrayList sets;
    public int stickersEndRow;
    public int stickersLoadingRow;
    public int stickersShadowRow;
    public int stickersStartRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return ArchivedStickersActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            ArchivedStickersActivity archivedStickersActivity = ArchivedStickersActivity.this;
            if (i >= archivedStickersActivity.stickersStartRow && i < archivedStickersActivity.stickersEndRow) {
                return 0;
            }
            if (i == archivedStickersActivity.stickersLoadingRow) {
                return 1;
            }
            return (i == archivedStickersActivity.stickersShadowRow || i == archivedStickersActivity.archiveInfoRow) ? 2 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            ArchivedStickersActivity archivedStickersActivity = ArchivedStickersActivity.this;
            View view = viewHolder.itemView;
            if (itemViewType != 0) {
                if (getItemViewType(i) == 2) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i == archivedStickersActivity.archiveInfoRow) {
                        textInfoPrivacyCell.setTopPadding(17);
                        textInfoPrivacyCell.setBottomPadding(10);
                        textInfoPrivacyCell.setText(LocaleController.getString(archivedStickersActivity.currentType == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
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
            int i2 = i - archivedStickersActivity.stickersStartRow;
            ArchivedStickerSetCell archivedStickerSetCell = (ArchivedStickerSetCell) view;
            ArrayList arrayList = archivedStickersActivity.sets;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i2);
            archivedStickerSetCell.setStickersSet(stickerSetCovered, i2 != arrayList.size() - 1);
            boolean zIsStickerPackInstalled = MediaDataController.getInstance(((BaseFragment) archivedStickersActivity).currentAccount).isStickerPackInstalled(stickerSetCovered.set.id);
            archivedStickerSetCell.setChecked(zIsStickerPackInstalled, false, false);
            LongSparseArray longSparseArray = archivedStickersActivity.installingStickerSets;
            ProgressButton progressButton = archivedStickerSetCell.addButton;
            if (zIsStickerPackInstalled) {
                longSparseArray.remove(stickerSetCovered.set.id);
                if (progressButton != null) {
                    progressButton.setDrawProgress(false, false);
                }
            } else {
                boolean z = longSparseArray.indexOfKey(stickerSetCovered.set.id) >= 0;
                if (progressButton != null) {
                    progressButton.setDrawProgress(z, false);
                }
            }
            archivedStickerSetCell.setOnCheckedChangeListener(new ArticleViewer$$ExternalSyntheticLambda16(18, this, stickerSetCovered));
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = this.mContext;
            View loadingCell = null;
            if (i == 0) {
                ArchivedStickerSetCell archivedStickerSetCell = new ArchivedStickerSetCell(context, true);
                archivedStickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                loadingCell = archivedStickerSetCell;
            } else if (i == 1) {
                loadingCell = new LoadingCell(context);
            } else if (i == 2) {
                loadingCell = new TextInfoPrivacyCell(context, 24, null);
            }
            loadingCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(loadingCell);
        }
    }

    public ArchivedStickersActivity(int i) {
        super(null);
        this.installingStickerSets = new LongSparseArray();
        this.loadedSets = new HashSet();
        this.sets = new ArrayList();
        this.currentType = i;
    }

    @Override
    public final View createView(Context context) {
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
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 3));
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        if (i == 0) {
            emptyTextProgressView.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            emptyTextProgressView.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        if (this.loadingStickers) {
            this.emptyView.showProgress();
        } else {
            this.emptyView.showTextView();
        }
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setFocusable(true);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 3));
        this.listView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 2));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        ArchivedStickerSetCell archivedStickerSetCell;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
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
        ArrayList arrayList2 = new ArrayList((List) objArr[0]);
        int size = arrayList2.size() - 1;
        while (true) {
            arrayList = this.sets;
            if (size < 0) {
                break;
            }
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((TLRPC.StickerSetCovered) arrayList.get(i4)).set.id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.id) {
                    arrayList2.remove(size);
                    break;
                }
            }
            size--;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.addAll(0, arrayList2);
        updateRows();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyItemRangeInserted(this.stickersStartRow, arrayList2.size());
        }
    }

    public final void getStickers() {
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
            listAdapter.mObservable.notifyChanged();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.sets;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i = this.currentType;
        tL_messages_getArchivedStickers.masks = i == 1;
        tL_messages_getArchivedStickers.emojis = i == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new CallLogActivity$$ExternalSyntheticLambda1(this, 5)), this.classGuid);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getStickers();
        updateRows();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.isInTransition = false;
        ArticleViewer$$ExternalSyntheticLambda8 articleViewer$$ExternalSyntheticLambda8 = this.doOnTransitionEnd;
        if (articleViewer$$ExternalSyntheticLambda8 != null) {
            articleViewer$$ExternalSyntheticLambda8.run();
            this.doOnTransitionEnd = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        this.isInTransition = true;
    }

    public final void processResponse(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.isInTransition) {
            this.doOnTransitionEnd = new ArticleViewer$$ExternalSyntheticLambda8(7, this, tL_messages_archivedStickers);
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
            HashSet hashSet = this.loadedSets;
            if (!hashSet.contains(Long.valueOf(stickerSetCovered2.set.id))) {
                hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
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
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void updateRows() {
        int i;
        this.rowCount = 0;
        ArrayList arrayList = this.sets;
        if (arrayList.isEmpty()) {
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
        this.stickersEndRow = arrayList.size() + i3;
        int size = arrayList.size() + this.rowCount;
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
}
