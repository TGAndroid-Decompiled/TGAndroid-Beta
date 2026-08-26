package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PeerColorActivity$Page$$ExternalSyntheticLambda0;
import org.telegram.ui.PhotoViewer;

public final class SearchDownloadsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final DownloadsAdapter adapter;
    public boolean checkingFilesExist;
    public final int currentAccount;
    public final ArrayList currentLoadingFiles;
    public final ArrayList currentLoadingFilesTmp;
    public int downloadingFilesEndRow;
    public int downloadingFilesHeader;
    public int downloadingFilesStartRow;
    public final StickerEmptyView emptyView;
    public boolean hasCurrentDownload;
    public boolean ignoreRequestLayout;
    public final RecyclerItemsEnterAnimator itemsEnterAnimator;
    public String lastQueryString;
    public SearchDownloadsContainer$$ExternalSyntheticLambda0 lastSearchRunnable;
    public final FilteredSearchView.MessageHashId messageHashIdTmp;
    public final Activity parentActivity;
    public final BaseFragment parentFragment;
    public int recentFilesEndRow;
    public int recentFilesHeader;
    public int recentFilesStartRow;
    public final ArrayList recentLoadingFiles;
    public final ArrayList recentLoadingFilesTmp;
    public final ChatActivity.AnonymousClass34 recyclerListView;
    public int rowCount;
    public String searchQuery;
    public FilteredSearchView.UiCallback uiCallback;

    public final class Cell extends FrameLayout {
        public final SharedDocumentCell sharedDocumentCell;

        public Cell(Context context) {
            super(context);
            SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(context, 2, null);
            this.sharedDocumentCell = sharedDocumentCell;
            sharedDocumentCell.rightDateTextView.setVisibility(8);
            addView(sharedDocumentCell);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.sharedDocumentCell.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        }
    }

    public final class DownloadsAdapter extends RecyclerListView.SelectionAdapter {

        public final class AnonymousClass1 extends SharedAudioCell {
            @Override
            public final boolean needPlayMessage(MessageObject messageObject) {
                return MediaController.getInstance().playMessage(messageObject);
            }
        }

        public DownloadsAdapter() {
        }

        @Override
        public final int getItemCount() {
            return SearchDownloadsContainer.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
            if (i == searchDownloadsContainer.downloadingFilesHeader || i == searchDownloadsContainer.recentFilesHeader) {
                return 0;
            }
            MessageObject message = getMessage(i);
            return (message != null && message.isMusic()) ? 2 : 1;
        }

        public final MessageObject getMessage(int i) {
            SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
            int i2 = searchDownloadsContainer.downloadingFilesStartRow;
            if (i >= i2 && i < searchDownloadsContainer.downloadingFilesEndRow) {
                return (MessageObject) searchDownloadsContainer.currentLoadingFiles.get(i - i2);
            }
            int i3 = searchDownloadsContainer.recentFilesStartRow;
            if (i < i3 || i >= searchDownloadsContainer.recentFilesEndRow) {
                return null;
            }
            return (MessageObject) searchDownloadsContainer.recentLoadingFiles.get(i - i3);
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 1 || i == 2;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2 = viewHolder.mItemViewType;
            SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) view;
                if (i != searchDownloadsContainer.downloadingFilesHeader) {
                    if (i == searchDownloadsContainer.recentFilesHeader) {
                        graySectionCell.setText(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new SearchField$$ExternalSyntheticLambda0(this, 25));
                        return;
                    }
                    return;
                }
                String string = LocaleController.getString(R.string.Downloading);
                if (!graySectionCell.getText().equals(string)) {
                    graySectionCell.setText(string, LocaleController.getString(searchDownloadsContainer.hasCurrentDownload ? R.string.PauseAll : R.string.ResumeAll), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            int i3 = 0;
                            while (true) {
                                SearchDownloadsContainer searchDownloadsContainer2 = SearchDownloadsContainer.this;
                                if (i3 >= searchDownloadsContainer2.currentLoadingFiles.size()) {
                                    searchDownloadsContainer2.update(true);
                                    return;
                                }
                                MessageObject messageObject = (MessageObject) searchDownloadsContainer2.currentLoadingFiles.get(i3);
                                if (searchDownloadsContainer2.hasCurrentDownload) {
                                    AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
                                } else {
                                    AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                                    DownloadController.getInstance(searchDownloadsContainer2.currentAccount).updateFilesLoadingPriority();
                                }
                                i3++;
                            }
                        }
                    });
                    return;
                }
                String string2 = LocaleController.getString(searchDownloadsContainer.hasCurrentDownload ? R.string.PauseAll : R.string.ResumeAll);
                boolean z2 = searchDownloadsContainer.hasCurrentDownload;
                GraySectionCell.AnonymousClass1 anonymousClass1 = graySectionCell.rightTextView;
                anonymousClass1.setText(string2, true, z2);
                anonymousClass1.setVisibility(0);
                return;
            }
            MessageObject message = getMessage(i);
            if (message != null) {
                boolean z3 = searchDownloadsContainer.uiCallback.actionModeShowing() && i >= searchDownloadsContainer.downloadingFilesStartRow && i < searchDownloadsContainer.downloadingFilesEndRow;
                FilteredSearchView.MessageHashId messageHashId = searchDownloadsContainer.messageHashIdTmp;
                if (i2 == 1) {
                    Cell cell = (Cell) view;
                    cell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    SharedDocumentCell sharedDocumentCell = cell.sharedDocumentCell;
                    int id = sharedDocumentCell.getMessage() == null ? 0 : sharedDocumentCell.getMessage().getId();
                    sharedDocumentCell.setDocument(message, true);
                    int id2 = sharedDocumentCell.getMessage().getId();
                    messageHashId.dialogId = sharedDocumentCell.getMessage().getDialogId();
                    messageHashId.messageId = id2;
                    sharedDocumentCell.setChecked(searchDownloadsContainer.uiCallback.isSelected(messageHashId), id == message.getId());
                    z = id == message.getId();
                    if (sharedDocumentCell.showReorderIcon == z3) {
                        return;
                    }
                    sharedDocumentCell.showReorderIcon = z3;
                    if (!z) {
                        sharedDocumentCell.showReorderIconProgress = z3 ? 1.0f : 0.0f;
                    }
                    sharedDocumentCell.invalidate();
                    return;
                }
                if (i2 == 2) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
                    int id3 = sharedAudioCell.getMessage() == null ? 0 : sharedAudioCell.getMessage().getId();
                    sharedAudioCell.setMessageObject(message, true);
                    int id4 = sharedAudioCell.getMessage().getId();
                    messageHashId.dialogId = sharedAudioCell.getMessage().getDialogId();
                    messageHashId.messageId = id4;
                    sharedAudioCell.setChecked(searchDownloadsContainer.uiCallback.isSelected(messageHashId), id3 == message.getId());
                    z = id3 == message.getId();
                    if (sharedAudioCell.showReorderIcon == z3) {
                        return;
                    }
                    sharedAudioCell.showReorderIcon = z3;
                    if (!z) {
                        sharedAudioCell.showReorderIconProgress = z3 ? 1.0f : 0.0f;
                    }
                    sharedAudioCell.invalidate();
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View cell;
            if (i == 0) {
                cell = new GraySectionCell(viewGroup.getContext(), 16, null);
            } else {
                cell = i == 1 ? new Cell(viewGroup.getContext()) : new AnonymousClass1(viewGroup.getContext(), 0, null);
            }
            cell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(cell);
        }
    }

    public SearchDownloadsContainer(int i, BaseFragment baseFragment) {
        super(baseFragment.getParentActivity());
        DownloadsAdapter downloadsAdapter = new DownloadsAdapter();
        this.adapter = downloadsAdapter;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.currentLoadingFiles = arrayList;
        this.recentLoadingFiles = new ArrayList();
        this.currentLoadingFilesTmp = new ArrayList();
        this.recentLoadingFilesTmp = new ArrayList();
        this.downloadingFilesHeader = -1;
        this.downloadingFilesStartRow = -1;
        this.downloadingFilesEndRow = -1;
        this.recentFilesHeader = -1;
        this.recentFilesStartRow = -1;
        this.recentFilesEndRow = -1;
        this.messageHashIdTmp = new FilteredSearchView.MessageHashId(0, 0L);
        this.parentFragment = baseFragment;
        this.parentActivity = baseFragment.getParentActivity();
        this.currentAccount = i;
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, getContext(), 15);
        this.recyclerListView = anonymousClass34;
        new ItemTouchHelper(new ViewPagerFixed.TabsView.AnonymousClass6(this, 3)).attachToRecyclerView(anonymousClass34);
        addView(anonymousClass34);
        baseFragment.getParentActivity();
        anonymousClass34.setLayoutManager(new PhotoViewer.AnonymousClass36(1, 9, false));
        anonymousClass34.setAdapter(downloadsAdapter);
        anonymousClass34.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 6));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        anonymousClass34.setItemAnimator(defaultItemAnimator);
        anonymousClass34.setOnItemClickListener(new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 1));
        anonymousClass34.setOnItemLongClickListener(new ProfileGooeyView$$ExternalSyntheticLambda0(this, 21));
        this.itemsEnterAnimator = new RecyclerItemsEnterAnimator(anonymousClass34, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), null);
        addView(flickerLoadingView);
        flickerLoadingView.setUseHeaderOffset(true);
        flickerLoadingView.setViewType(3);
        flickerLoadingView.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, getContext(), flickerLoadingView);
        this.emptyView = stickerEmptyView;
        addView(stickerEmptyView);
        anonymousClass34.setEmptyView(stickerEmptyView);
        FileLoader.getInstance(i).getCurrentLoadingFiles(arrayList);
    }

    public final void checkItemsFloodWait() {
        ChatActivity.AnonymousClass34 anonymousClass34;
        MessageObject message;
        int i = this.currentAccount;
        if (UserConfig.getInstance(i).isPremium() || (anonymousClass34 = this.recyclerListView) == null) {
            return;
        }
        for (int i2 = 0; i2 < anonymousClass34.getChildCount(); i2++) {
            try {
                View childAt = anonymousClass34.getChildAt(i2);
                if ((childAt instanceof Cell) && (message = ((Cell) childAt).sharedDocumentCell.getMessage()) != null) {
                    if (FileLoader.getInstance(i).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        showPremiumFloodWaitBulletin(false);
                        return;
                    } else if (FileLoader.getInstance(i).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        showPremiumFloodWaitBulletin(true);
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.currentAccount).clearUnviewedDownloads();
            }
            update(true);
        } else if (i == NotificationCenter.premiumFloodWaitReceived) {
            checkItemsFloodWait();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.currentAccount).clearUnviewedDownloads();
        }
        if (!this.checkingFilesExist) {
            this.checkingFilesExist = true;
            Utilities.searchQueue.postRunnable(new SeekBarView$$ExternalSyntheticLambda1(this, 6));
        }
        update(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreRequestLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(FilteredSearchView.UiCallback uiCallback) {
        this.uiCallback = uiCallback;
    }

    public final void showPremiumFloodWaitBulletin(boolean z) {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || !this.recyclerListView.mIsAttached) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i = this.currentAccount;
        if (j < ((long) MessagesController.getInstance(i).uploadPremiumSpeedupNotifyPeriod) * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = jCurrentTimeMillis;
        if (UserConfig.getInstance(i).isPremium() || MessagesController.getInstance(i).premiumFeaturesBlocked()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(((double) Math.round((z ? MessagesController.getInstance(i).uploadPremiumSpeedupUpload : MessagesController.getInstance(i).uploadPremiumSpeedupDownload) * 10.0f)) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (baseFragment.hasStoryViewer()) {
            return;
        }
        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(baseFragment).createSimpleBulletin(LocaleController.getString(z ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new FileLoader$$ExternalSyntheticLambda1(21, this, z)), spannableString), R.raw.speed_limit);
        bulletinCreateSimpleBulletin.duration = 8000;
        bulletinCreateSimpleBulletin.show(false);
    }

    public final void update(boolean z) {
        DownloadsAdapter downloadsAdapter = this.adapter;
        downloadsAdapter.mObservable.notifyItemRangeChanged(0, SearchDownloadsContainer.this.rowCount, null);
        if (!TextUtils.isEmpty(this.searchQuery) && (!DownloadController.getInstance(this.currentAccount).downloadingFiles.isEmpty() || !DownloadController.getInstance(this.currentAccount).recentDownloadingFiles.isEmpty())) {
            this.emptyView.setStickerType(1);
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            FileLoader.getInstance(this.currentAccount).getCurrentLoadingFiles(arrayList);
            FileLoader.getInstance(this.currentAccount).getRecentLoadingFiles(arrayList2);
            String lowerCase = this.searchQuery.toLowerCase();
            boolean zEquals = lowerCase.equals(this.lastQueryString);
            this.lastQueryString = lowerCase;
            Utilities.searchQueue.cancelRunnable(this.lastSearchRunnable);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            SearchDownloadsContainer$$ExternalSyntheticLambda0 searchDownloadsContainer$$ExternalSyntheticLambda0 = new SearchDownloadsContainer$$ExternalSyntheticLambda0(this, arrayList, lowerCase, arrayList2);
            this.lastSearchRunnable = searchDownloadsContainer$$ExternalSyntheticLambda0;
            dispatchQueue.postRunnable(searchDownloadsContainer$$ExternalSyntheticLambda0, zEquals ? 0L : 300L);
            this.recentLoadingFilesTmp.clear();
            this.currentLoadingFilesTmp.clear();
            if (zEquals) {
                return;
            }
            this.emptyView.showProgress(true, true);
            updateListInternal(this.currentLoadingFilesTmp, this.recentLoadingFilesTmp, z);
            return;
        }
        if (this.rowCount == 0) {
            this.itemsEnterAnimator.showItemsAnimated(0);
        }
        if (this.checkingFilesExist) {
            this.currentLoadingFilesTmp.clear();
            this.recentLoadingFilesTmp.clear();
        }
        FileLoader.getInstance(this.currentAccount).getCurrentLoadingFiles(this.currentLoadingFilesTmp);
        FileLoader.getInstance(this.currentAccount).getRecentLoadingFiles(this.recentLoadingFilesTmp);
        for (int i = 0; i < this.currentLoadingFiles.size(); i++) {
            ((MessageObject) this.currentLoadingFiles.get(i)).setQuery(null);
        }
        for (int i2 = 0; i2 < this.recentLoadingFiles.size(); i2++) {
            ((MessageObject) this.recentLoadingFiles.get(i2)).setQuery(null);
        }
        this.lastQueryString = null;
        updateListInternal(this.currentLoadingFilesTmp, this.recentLoadingFilesTmp, z);
        if (this.rowCount == 0) {
            this.emptyView.showProgress(false, false);
            this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.emptyView.subtitle.setVisibility(8);
        }
        this.emptyView.setStickerType(9);
    }

    public final void updateListInternal(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        RecyclerView.ViewHolder childViewHolder;
        DownloadsAdapter downloadsAdapter = this.adapter;
        if (!z) {
            updateRows(arrayList, arrayList2);
            downloadsAdapter.mObservable.notifyChanged();
            return;
        }
        final int i = this.downloadingFilesHeader;
        final int i2 = this.downloadingFilesStartRow;
        final int i3 = this.downloadingFilesEndRow;
        final int i4 = this.recentFilesHeader;
        final int i5 = this.recentFilesStartRow;
        final int i6 = this.recentFilesEndRow;
        final int i7 = this.rowCount;
        final ArrayList arrayList3 = new ArrayList(this.currentLoadingFiles);
        final ArrayList arrayList4 = new ArrayList(this.recentLoadingFiles);
        updateRows(arrayList, arrayList2);
        DiffUtil.calculateDiff(new DiffUtil() {
            @Override
            public final boolean areContentsTheSame(int i8, int i9) {
                return areItemsTheSame(i8, i9);
            }

            @Override
            public final boolean areItemsTheSame(int i8, int i9) {
                MessageObject messageObject;
                SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
                if (i8 >= 0 && i9 >= 0) {
                    if (i8 == i && i9 == searchDownloadsContainer.downloadingFilesHeader) {
                        return true;
                    }
                    if (i8 == i4 && i9 == searchDownloadsContainer.recentFilesHeader) {
                        return true;
                    }
                }
                MessageObject messageObject2 = null;
                int i10 = i2;
                if (i8 < i10 || i8 >= i3) {
                    int i11 = i5;
                    messageObject = (i8 < i11 || i8 >= i6) ? null : (MessageObject) arrayList4.get(i8 - i11);
                } else {
                    messageObject = (MessageObject) arrayList3.get(i8 - i10);
                }
                int i12 = searchDownloadsContainer.downloadingFilesStartRow;
                if (i9 < i12 || i9 >= searchDownloadsContainer.downloadingFilesEndRow) {
                    int i13 = searchDownloadsContainer.recentFilesStartRow;
                    if (i9 >= i13 && i9 < searchDownloadsContainer.recentFilesEndRow) {
                        messageObject2 = (MessageObject) searchDownloadsContainer.recentLoadingFiles.get(i9 - i13);
                    }
                } else {
                    messageObject2 = (MessageObject) searchDownloadsContainer.currentLoadingFiles.get(i9 - i12);
                }
                return (messageObject2 == null || messageObject == null || messageObject2.getDocument() == null || messageObject.getDocument() == null || messageObject2.getDocument().id != messageObject.getDocument().id) ? false : true;
            }

            @Override
            public final int getNewListSize() {
                return SearchDownloadsContainer.this.rowCount;
            }

            @Override
            public final int getOldListSize() {
                return i7;
            }
        }, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(downloadsAdapter, 1));
        int i8 = 0;
        while (true) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
            if (i8 >= anonymousClass34.getChildCount()) {
                return;
            }
            View childAt = anonymousClass34.getChildAt(i8);
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0 && (childViewHolder = anonymousClass34.getChildViewHolder(childAt)) != null && !childViewHolder.shouldIgnore()) {
                if (childAt instanceof GraySectionCell) {
                    downloadsAdapter.onBindViewHolder(childViewHolder, childAdapterPosition);
                } else if (childAt instanceof Cell) {
                    SharedDocumentCell sharedDocumentCell = ((Cell) childAt).sharedDocumentCell;
                    sharedDocumentCell.updateFileExistIcon(true);
                    int id = sharedDocumentCell.getMessage().getId();
                    long dialogId = sharedDocumentCell.getMessage().getDialogId();
                    FilteredSearchView.MessageHashId messageHashId = this.messageHashIdTmp;
                    messageHashId.dialogId = dialogId;
                    messageHashId.messageId = id;
                    sharedDocumentCell.setChecked(this.uiCallback.isSelected(messageHashId), true);
                }
            }
            i8++;
        }
    }

    public final void updateRows(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.currentLoadingFiles;
        arrayList3.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.recentLoadingFiles;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.rowCount = 0;
        this.downloadingFilesHeader = -1;
        this.downloadingFilesStartRow = -1;
        this.downloadingFilesEndRow = -1;
        this.recentFilesHeader = -1;
        this.recentFilesStartRow = -1;
        this.recentFilesEndRow = -1;
        this.hasCurrentDownload = false;
        if (!arrayList3.isEmpty()) {
            int i3 = this.rowCount;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.downloadingFilesHeader = i3;
            this.downloadingFilesStartRow = i4;
            int size3 = arrayList3.size() + i4;
            this.rowCount = size3;
            this.downloadingFilesEndRow = size3;
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                if (FileLoader.getInstance(this.currentAccount).isLoadingFile(((MessageObject) arrayList3.get(i5)).getFileName())) {
                    this.hasCurrentDownload = true;
                    break;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        int i6 = this.rowCount;
        int i7 = i6 + 1;
        this.rowCount = i7;
        this.recentFilesHeader = i6;
        this.recentFilesStartRow = i7;
        int size4 = arrayList4.size() + i7;
        this.rowCount = size4;
        this.recentFilesEndRow = size4;
    }
}
