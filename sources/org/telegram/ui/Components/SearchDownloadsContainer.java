package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

public class SearchDownloadsContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    DownloadsAdapter adapter;
    boolean checkingFilesExist;
    private final int currentAccount;
    ArrayList currentLoadingFiles;
    ArrayList currentLoadingFilesTmp;
    int downloadingFilesEndRow;
    int downloadingFilesHeader;
    int downloadingFilesStartRow;
    StickerEmptyView emptyView;
    private boolean hasCurrentDownload;
    private boolean ignoreRequestLayout;
    RecyclerItemsEnterAnimator itemsEnterAnimator;
    String lastQueryString;
    Runnable lastSearchRunnable;
    private final FlickerLoadingView loadingView;
    private final FilteredSearchView.MessageHashId messageHashIdTmp;
    Activity parentActivity;
    BaseFragment parentFragment;
    int recentFilesEndRow;
    int recentFilesHeader;
    int recentFilesStartRow;
    ArrayList recentLoadingFiles;
    ArrayList recentLoadingFilesTmp;
    public final RecyclerListView recyclerListView;
    int rowCount;
    String searchQuery;
    FilteredSearchView.UiCallback uiCallback;

    public SearchDownloadsContainer(BaseFragment baseFragment, final int i) {
        super(baseFragment.getParentActivity());
        this.adapter = new DownloadsAdapter();
        this.currentLoadingFiles = new ArrayList();
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
        RecyclerListView recyclerListView = new RecyclerListView(getContext()) {
            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                SearchDownloadsContainer.this.checkItemsFloodWait();
            }
        };
        this.recyclerListView = recyclerListView;
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(recyclerListView);
        addView(recyclerListView);
        recyclerListView.setLayoutManager(new LinearLayoutManager(baseFragment.getParentActivity()) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }
        });
        recyclerListView.setAdapter(this.adapter);
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 1) {
                    AndroidUtilities.hideKeyboard(SearchDownloadsContainer.this.parentActivity.getCurrentFocus());
                }
                SearchDownloadsContainer.this.checkItemsFloodWait();
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerListView.setItemAnimator(defaultItemAnimator);
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                SearchDownloadsContainer.$r8$lambda$6H0ECteTyLxDXlHO3DbM8yYhSwY(this.f$0, i, view, i2);
            }
        });
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                return SearchDownloadsContainer.$r8$lambda$GFph80b_QD4Y5hqTUxAsWx2ClSk(this.f$0, view, i2);
            }
        });
        this.itemsEnterAnimator = new RecyclerItemsEnterAnimator(recyclerListView, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext());
        this.loadingView = flickerLoadingView;
        addView(flickerLoadingView);
        flickerLoadingView.setUseHeaderOffset(true);
        flickerLoadingView.setViewType(3);
        flickerLoadingView.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(getContext(), flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        addView(stickerEmptyView);
        recyclerListView.setEmptyView(this.emptyView);
        FileLoader.getInstance(i).getCurrentLoadingFiles(this.currentLoadingFiles);
    }

    public static void $r8$lambda$6H0ECteTyLxDXlHO3DbM8yYhSwY(SearchDownloadsContainer searchDownloadsContainer, int i, View view, int i2) {
        MessageObject message = searchDownloadsContainer.adapter.getMessage(i2);
        if (message == null) {
            return;
        }
        boolean z = false;
        if (searchDownloadsContainer.uiCallback.actionModeShowing()) {
            searchDownloadsContainer.uiCallback.toggleItemSelection(message, view, 0);
            searchDownloadsContainer.messageHashIdTmp.set(message.getId(), message.getDialogId());
            searchDownloadsContainer.adapter.notifyItemChanged(i2);
            if (searchDownloadsContainer.uiCallback.actionModeShowing()) {
                return;
            }
            DownloadsAdapter downloadsAdapter = searchDownloadsContainer.adapter;
            downloadsAdapter.notifyItemRangeChanged(0, downloadsAdapter.getItemCount());
            return;
        }
        if (view instanceof Cell) {
            SharedDocumentCell sharedDocumentCell = ((Cell) view).sharedDocumentCell;
            MessageObject message2 = sharedDocumentCell.getMessage();
            TLRPC.Document document = message2.getDocument();
            if (sharedDocumentCell.isLoaded()) {
                if (message2.isRoundVideo() || message2.isVoice()) {
                    MediaController.getInstance().playMessage(message2);
                    return;
                }
                boolean zCanPreviewDocument = message2.canPreviewDocument();
                if (zCanPreviewDocument) {
                    z = zCanPreviewDocument;
                } else {
                    TLRPC.Message message3 = message2.messageOwner;
                    boolean z2 = message3 != null && message3.noforwards;
                    TLRPC.Chat chat = null;
                    TLRPC.Chat chat2 = message.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(message.messageOwner.peer_id.channel_id)) : null;
                    if (chat2 != null) {
                        chat = chat2;
                    } else if (message.messageOwner.peer_id.chat_id != 0) {
                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(message.messageOwner.peer_id.chat_id));
                    }
                    if (chat != null) {
                        z2 = chat.noforwards;
                    }
                    if (zCanPreviewDocument || z2) {
                        z = true;
                    }
                }
                if (z) {
                    PhotoViewer.getInstance().setParentActivity(searchDownloadsContainer.parentFragment);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(message2);
                    PhotoViewer.getInstance().setParentActivity(searchDownloadsContainer.parentFragment);
                    PhotoViewer.getInstance().openPhoto(arrayList, 0, 0L, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider());
                    return;
                }
                AndroidUtilities.openDocument(message2, searchDownloadsContainer.parentActivity, searchDownloadsContainer.parentFragment);
            } else if (!sharedDocumentCell.isLoading()) {
                message.putInDownloadsStore = true;
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                sharedDocumentCell.updateFileExistIcon(true);
                DownloadController.getInstance(i).updateFilesLoadingPriority();
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                sharedDocumentCell.updateFileExistIcon(true);
            }
            searchDownloadsContainer.update(true);
        }
        if (view instanceof SharedAudioCell) {
            ((SharedAudioCell) view).didPressedButton();
        }
    }

    public static boolean $r8$lambda$GFph80b_QD4Y5hqTUxAsWx2ClSk(SearchDownloadsContainer searchDownloadsContainer, View view, int i) {
        MessageObject message = searchDownloadsContainer.adapter.getMessage(i);
        if (message == null) {
            return false;
        }
        if (!searchDownloadsContainer.uiCallback.actionModeShowing()) {
            searchDownloadsContainer.uiCallback.showActionMode();
            DownloadsAdapter downloadsAdapter = searchDownloadsContainer.adapter;
            downloadsAdapter.notifyItemRangeChanged(0, downloadsAdapter.getItemCount());
        }
        if (!searchDownloadsContainer.uiCallback.actionModeShowing()) {
            return true;
        }
        searchDownloadsContainer.uiCallback.toggleItemSelection(message, view, 0);
        if (!searchDownloadsContainer.uiCallback.actionModeShowing()) {
            DownloadsAdapter downloadsAdapter2 = searchDownloadsContainer.adapter;
            downloadsAdapter2.notifyItemRangeChanged(0, downloadsAdapter2.getItemCount());
        }
        searchDownloadsContainer.messageHashIdTmp.set(message.getId(), message.getDialogId());
        return true;
    }

    public void setPagesPaddings(int i, int i2) {
        setPagesPaddings(i, i2, false);
    }

    public void setPagesPaddings(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.ignoreRequestLayout = z;
        setPadding(0, i, 0, i2);
        this.recyclerListView.setPadding(0, i, 0, i2, z);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.recyclerListView.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.ignoreRequestLayout = false;
    }

    @Override
    public void requestLayout() {
        if (this.ignoreRequestLayout) {
            return;
        }
        super.requestLayout();
    }

    private void checkFilesExist() {
        if (this.checkingFilesExist) {
            return;
        }
        this.checkingFilesExist = true;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchDownloadsContainer.$r8$lambda$ps5HHDyM1bs_lVPToQMRbFPiDtc(this.f$0);
            }
        });
    }

    public static void $r8$lambda$ps5HHDyM1bs_lVPToQMRbFPiDtc(final SearchDownloadsContainer searchDownloadsContainer) {
        searchDownloadsContainer.getClass();
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        FileLoader.getInstance(searchDownloadsContainer.currentAccount).getCurrentLoadingFiles(arrayList);
        FileLoader.getInstance(searchDownloadsContainer.currentAccount).getRecentLoadingFiles(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            if (FileLoader.getInstance(searchDownloadsContainer.currentAccount).getPathToMessage(arrayList.get(i).messageOwner).exists()) {
                arrayList3.add(arrayList.get(i));
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (!FileLoader.getInstance(searchDownloadsContainer.currentAccount).getPathToMessage(arrayList2.get(i2).messageOwner).exists()) {
                arrayList4.add(arrayList2.get(i2));
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchDownloadsContainer.$r8$lambda$1i1Z2ImwlvK4Nrj6eEZ63i5A2Nw(this.f$0, arrayList3, arrayList4);
            }
        });
    }

    public static void $r8$lambda$1i1Z2ImwlvK4Nrj6eEZ63i5A2Nw(SearchDownloadsContainer searchDownloadsContainer, ArrayList arrayList, ArrayList arrayList2) {
        searchDownloadsContainer.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            DownloadController.getInstance(searchDownloadsContainer.currentAccount).onDownloadComplete((MessageObject) arrayList.get(i));
        }
        if (!arrayList2.isEmpty()) {
            DownloadController.getInstance(searchDownloadsContainer.currentAccount).deleteRecentFiles(arrayList2);
        }
        searchDownloadsContainer.checkingFilesExist = false;
        searchDownloadsContainer.update(true);
    }

    public void update(boolean z) {
        DownloadsAdapter downloadsAdapter = this.adapter;
        downloadsAdapter.notifyItemRangeChanged(0, downloadsAdapter.getItemCount());
        if (TextUtils.isEmpty(this.searchQuery) || isEmptyDownloads()) {
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
            updateListInternal(z, this.currentLoadingFilesTmp, this.recentLoadingFilesTmp);
            if (this.rowCount == 0) {
                this.emptyView.showProgress(false, false);
                this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
                this.emptyView.subtitle.setVisibility(8);
            }
            this.emptyView.setStickerType(9);
            return;
        }
        this.emptyView.setStickerType(1);
        final ArrayList<MessageObject> arrayList = new ArrayList<>();
        final ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        FileLoader.getInstance(this.currentAccount).getCurrentLoadingFiles(arrayList);
        FileLoader.getInstance(this.currentAccount).getRecentLoadingFiles(arrayList2);
        final String lowerCase = this.searchQuery.toLowerCase();
        boolean zEquals = lowerCase.equals(this.lastQueryString);
        this.lastQueryString = lowerCase;
        Utilities.searchQueue.cancelRunnable(this.lastSearchRunnable);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                SearchDownloadsContainer.$r8$lambda$60aQvv3asNXvmZCLHUHIZiZpF2o(this.f$0, arrayList, lowerCase, arrayList2);
            }
        };
        this.lastSearchRunnable = runnable;
        dispatchQueue.postRunnable(runnable, zEquals ? 0L : 300L);
        this.recentLoadingFilesTmp.clear();
        this.currentLoadingFilesTmp.clear();
        if (zEquals) {
            return;
        }
        this.emptyView.showProgress(true, true);
        updateListInternal(z, this.currentLoadingFilesTmp, this.recentLoadingFilesTmp);
    }

    public static void $r8$lambda$60aQvv3asNXvmZCLHUHIZiZpF2o(final SearchDownloadsContainer searchDownloadsContainer, ArrayList arrayList, final String str, ArrayList arrayList2) {
        searchDownloadsContainer.getClass();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList.get(i)).getDocument());
            if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                MessageObject messageObject = new MessageObject(searchDownloadsContainer.currentAccount, ((MessageObject) arrayList.get(i)).messageOwner, false, false);
                messageObject.mediaExists = ((MessageObject) arrayList.get(i)).mediaExists;
                messageObject.setQuery(searchDownloadsContainer.searchQuery);
                arrayList3.add(messageObject);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList2.get(i2)).getDocument());
            if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                MessageObject messageObject2 = new MessageObject(searchDownloadsContainer.currentAccount, ((MessageObject) arrayList2.get(i2)).messageOwner, false, false);
                messageObject2.mediaExists = ((MessageObject) arrayList2.get(i2)).mediaExists;
                messageObject2.setQuery(searchDownloadsContainer.searchQuery);
                arrayList4.add(messageObject2);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchDownloadsContainer.m2727$r8$lambda$9lAt6Se6w2h2oiX0QNRmd9b9lA(this.f$0, str, arrayList3, arrayList4);
            }
        });
    }

    public static void m2727$r8$lambda$9lAt6Se6w2h2oiX0QNRmd9b9lA(SearchDownloadsContainer searchDownloadsContainer, String str, ArrayList arrayList, ArrayList arrayList2) {
        if (str.equals(searchDownloadsContainer.lastQueryString)) {
            if (searchDownloadsContainer.rowCount == 0) {
                searchDownloadsContainer.itemsEnterAnimator.showItemsAnimated(0);
            }
            searchDownloadsContainer.updateListInternal(true, arrayList, arrayList2);
            if (searchDownloadsContainer.rowCount == 0) {
                searchDownloadsContainer.emptyView.showProgress(false, true);
                searchDownloadsContainer.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                searchDownloadsContainer.emptyView.subtitle.setVisibility(0);
                searchDownloadsContainer.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            }
        }
    }

    private boolean isEmptyDownloads() {
        return DownloadController.getInstance(this.currentAccount).downloadingFiles.isEmpty() && DownloadController.getInstance(this.currentAccount).recentDownloadingFiles.isEmpty();
    }

    private void updateListInternal(boolean z, ArrayList arrayList, ArrayList arrayList2) {
        RecyclerView.ViewHolder childViewHolder;
        if (z) {
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
            DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return i7;
                }

                @Override
                public int getNewListSize() {
                    return SearchDownloadsContainer.this.rowCount;
                }

                @Override
                public boolean areItemsTheSame(int i8, int i9) {
                    MessageObject messageObject;
                    if (i8 >= 0 && i9 >= 0) {
                        if (i8 == i && i9 == SearchDownloadsContainer.this.downloadingFilesHeader) {
                            return true;
                        }
                        if (i8 == i4 && i9 == SearchDownloadsContainer.this.recentFilesHeader) {
                            return true;
                        }
                    }
                    int i10 = i2;
                    MessageObject messageObject2 = null;
                    if (i8 >= i10 && i8 < i3) {
                        messageObject = (MessageObject) arrayList3.get(i8 - i10);
                    } else {
                        int i11 = i5;
                        messageObject = (i8 < i11 || i8 >= i6) ? null : (MessageObject) arrayList4.get(i8 - i11);
                    }
                    SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
                    int i12 = searchDownloadsContainer.downloadingFilesStartRow;
                    if (i9 >= i12 && i9 < searchDownloadsContainer.downloadingFilesEndRow) {
                        messageObject2 = (MessageObject) searchDownloadsContainer.currentLoadingFiles.get(i9 - i12);
                    } else {
                        int i13 = searchDownloadsContainer.recentFilesStartRow;
                        if (i9 >= i13 && i9 < searchDownloadsContainer.recentFilesEndRow) {
                            messageObject2 = (MessageObject) searchDownloadsContainer.recentLoadingFiles.get(i9 - i13);
                        }
                    }
                    return (messageObject2 == null || messageObject == null || messageObject2.getDocument() == null || messageObject.getDocument() == null || messageObject2.getDocument().id != messageObject.getDocument().id) ? false : true;
                }

                @Override
                public boolean areContentsTheSame(int i8, int i9) {
                    return areItemsTheSame(i8, i9);
                }
            }).dispatchUpdatesTo(this.adapter);
            for (int i8 = 0; i8 < this.recyclerListView.getChildCount(); i8++) {
                View childAt = this.recyclerListView.getChildAt(i8);
                int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && (childViewHolder = this.recyclerListView.getChildViewHolder(childAt)) != null && !childViewHolder.shouldIgnore()) {
                    if (childAt instanceof GraySectionCell) {
                        this.adapter.onBindViewHolder(childViewHolder, childAdapterPosition);
                    } else if (childAt instanceof Cell) {
                        Cell cell = (Cell) childAt;
                        cell.sharedDocumentCell.updateFileExistIcon(true);
                        this.messageHashIdTmp.set(cell.sharedDocumentCell.getMessage().getId(), cell.sharedDocumentCell.getMessage().getDialogId());
                        cell.sharedDocumentCell.setChecked(this.uiCallback.isSelected(this.messageHashIdTmp), true);
                    }
                }
            }
            return;
        }
        updateRows(arrayList, arrayList2);
        this.adapter.notifyDataSetChanged();
    }

    private void updateRows(ArrayList arrayList, ArrayList arrayList2) {
        this.currentLoadingFiles.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                this.currentLoadingFiles.add(messageObject);
            }
        }
        this.recentLoadingFiles.clear();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                this.recentLoadingFiles.add(messageObject2);
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
        if (!this.currentLoadingFiles.isEmpty()) {
            int i3 = this.rowCount;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.downloadingFilesHeader = i3;
            this.downloadingFilesStartRow = i4;
            int size3 = i4 + this.currentLoadingFiles.size();
            this.rowCount = size3;
            this.downloadingFilesEndRow = size3;
            for (int i5 = 0; i5 < this.currentLoadingFiles.size(); i5++) {
                if (FileLoader.getInstance(this.currentAccount).isLoadingFile(((MessageObject) this.currentLoadingFiles.get(i5)).getFileName())) {
                    this.hasCurrentDownload = true;
                    break;
                }
            }
        }
        if (this.recentLoadingFiles.isEmpty()) {
            return;
        }
        int i6 = this.rowCount;
        int i7 = i6 + 1;
        this.rowCount = i7;
        this.recentFilesHeader = i6;
        this.recentFilesStartRow = i7;
        int size4 = i7 + this.recentLoadingFiles.size();
        this.rowCount = size4;
        this.recentFilesEndRow = size4;
    }

    public void search(String str) {
        this.searchQuery = str;
        update(false);
    }

    class DownloadsAdapter extends RecyclerListView.SelectionAdapter {
        private DownloadsAdapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View cell;
            if (i == 0) {
                cell = new GraySectionCell(viewGroup.getContext());
            } else if (i == 1) {
                cell = SearchDownloadsContainer.this.new Cell(viewGroup.getContext());
            } else {
                cell = new SharedAudioCell(viewGroup.getContext()) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        return MediaController.getInstance().playMessage(messageObject);
                    }
                };
            }
            cell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(cell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
                if (i == searchDownloadsContainer.downloadingFilesHeader) {
                    String string = LocaleController.getString(R.string.Downloading);
                    if (graySectionCell.getText().equals(string)) {
                        graySectionCell.setRightText(LocaleController.getString(SearchDownloadsContainer.this.hasCurrentDownload ? R.string.PauseAll : R.string.ResumeAll), SearchDownloadsContainer.this.hasCurrentDownload);
                        return;
                    } else {
                        graySectionCell.setText(string, LocaleController.getString(SearchDownloadsContainer.this.hasCurrentDownload ? R.string.PauseAll : R.string.ResumeAll), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                for (int i2 = 0; i2 < SearchDownloadsContainer.this.currentLoadingFiles.size(); i2++) {
                                    MessageObject messageObject = (MessageObject) SearchDownloadsContainer.this.currentLoadingFiles.get(i2);
                                    if (SearchDownloadsContainer.this.hasCurrentDownload) {
                                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
                                    } else {
                                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                                        DownloadController.getInstance(SearchDownloadsContainer.this.currentAccount).updateFilesLoadingPriority();
                                    }
                                }
                                SearchDownloadsContainer.this.update(true);
                            }
                        });
                        return;
                    }
                }
                if (i == searchDownloadsContainer.recentFilesHeader) {
                    graySectionCell.setText(LocaleController.getString(R.string.RecentlyDownloaded), LocaleController.getString(R.string.Settings), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            SearchDownloadsContainer.DownloadsAdapter.$r8$lambda$9okgf1Ocn_hRZOCaYmxiGLY2dmw(this.f$0, view);
                        }
                    });
                    return;
                }
                return;
            }
            MessageObject message = getMessage(i);
            if (message != null) {
                if (SearchDownloadsContainer.this.uiCallback.actionModeShowing()) {
                    SearchDownloadsContainer searchDownloadsContainer2 = SearchDownloadsContainer.this;
                    if (i < searchDownloadsContainer2.downloadingFilesStartRow || i >= searchDownloadsContainer2.downloadingFilesEndRow) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (itemViewType == 1) {
                    Cell cell = (Cell) viewHolder.itemView;
                    cell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    int id = cell.sharedDocumentCell.getMessage() == null ? 0 : cell.sharedDocumentCell.getMessage().getId();
                    cell.sharedDocumentCell.setDocument(message, true);
                    SearchDownloadsContainer.this.messageHashIdTmp.set(cell.sharedDocumentCell.getMessage().getId(), cell.sharedDocumentCell.getMessage().getDialogId());
                    SharedDocumentCell sharedDocumentCell = cell.sharedDocumentCell;
                    SearchDownloadsContainer searchDownloadsContainer3 = SearchDownloadsContainer.this;
                    sharedDocumentCell.setChecked(searchDownloadsContainer3.uiCallback.isSelected(searchDownloadsContainer3.messageHashIdTmp), id == message.getId());
                    cell.sharedDocumentCell.showReorderIcon(z, id == message.getId());
                    return;
                }
                if (itemViewType == 2) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) viewHolder.itemView;
                    int id2 = sharedAudioCell.getMessage() == null ? 0 : sharedAudioCell.getMessage().getId();
                    sharedAudioCell.setMessageObject(message, true);
                    SearchDownloadsContainer.this.messageHashIdTmp.set(sharedAudioCell.getMessage().getId(), sharedAudioCell.getMessage().getDialogId());
                    SearchDownloadsContainer searchDownloadsContainer4 = SearchDownloadsContainer.this;
                    sharedAudioCell.setChecked(searchDownloadsContainer4.uiCallback.isSelected(searchDownloadsContainer4.messageHashIdTmp), id2 == message.getId());
                    sharedAudioCell.showReorderIcon(z, id2 == message.getId());
                }
            }
        }

        public static void $r8$lambda$9okgf1Ocn_hRZOCaYmxiGLY2dmw(DownloadsAdapter downloadsAdapter, View view) {
            SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
            DownloadsInfoBottomSheet.show(searchDownloadsContainer.parentActivity, searchDownloadsContainer.parentFragment);
        }

        @Override
        public int getItemViewType(int i) {
            SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
            if (i == searchDownloadsContainer.downloadingFilesHeader || i == searchDownloadsContainer.recentFilesHeader) {
                return 0;
            }
            MessageObject message = getMessage(i);
            return (message != null && message.isMusic()) ? 2 : 1;
        }

        public MessageObject getMessage(int i) {
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
        public int getItemCount() {
            return SearchDownloadsContainer.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 2;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.currentAccount).clearUnviewedDownloads();
        }
        checkFilesExist();
        update(false);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.currentAccount).clearUnviewedDownloads();
            }
            update(true);
        } else if (i == NotificationCenter.premiumFloodWaitReceived) {
            checkItemsFloodWait();
        }
    }

    class Cell extends FrameLayout {
        SharedDocumentCell sharedDocumentCell;

        public Cell(Context context) {
            super(context);
            SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(context, 2);
            this.sharedDocumentCell = sharedDocumentCell;
            sharedDocumentCell.rightDateTextView.setVisibility(8);
            addView(this.sharedDocumentCell);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.sharedDocumentCell.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        }
    }

    public void setUiCallback(FilteredSearchView.UiCallback uiCallback) {
        this.uiCallback = uiCallback;
    }

    public void setKeyboardHeight(int i, boolean z) {
        this.emptyView.setKeyboardHeight(i, z);
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public TouchHelperCallback() {
        }

        @Override
        public boolean isLongPressDragEnabled() {
            return SearchDownloadsContainer.this.uiCallback.actionModeShowing();
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() < SearchDownloadsContainer.this.downloadingFilesStartRow || viewHolder.getAdapterPosition() >= SearchDownloadsContainer.this.downloadingFilesEndRow) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder2.getAdapterPosition() >= SearchDownloadsContainer.this.downloadingFilesStartRow && viewHolder2.getAdapterPosition() < SearchDownloadsContainer.this.downloadingFilesEndRow) {
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                SearchDownloadsContainer searchDownloadsContainer = SearchDownloadsContainer.this;
                int i = searchDownloadsContainer.downloadingFilesStartRow;
                int i2 = adapterPosition - i;
                int i3 = adapterPosition2 - i;
                searchDownloadsContainer.currentLoadingFiles.indexOf(Integer.valueOf(i2));
                SearchDownloadsContainer searchDownloadsContainer2 = SearchDownloadsContainer.this;
                searchDownloadsContainer2.currentLoadingFiles.get(adapterPosition - searchDownloadsContainer2.downloadingFilesStartRow);
                MessageObject messageObject = (MessageObject) SearchDownloadsContainer.this.currentLoadingFiles.get(i2);
                MessageObject messageObject2 = (MessageObject) SearchDownloadsContainer.this.currentLoadingFiles.get(i3);
                SearchDownloadsContainer.this.currentLoadingFiles.set(i2, messageObject2);
                SearchDownloadsContainer.this.currentLoadingFiles.set(i3, messageObject);
                DownloadController.getInstance(SearchDownloadsContainer.this.currentAccount).swapLoadingPriority(messageObject, messageObject2);
                SearchDownloadsContainer.this.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return false;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                SearchDownloadsContainer.this.recyclerListView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
        }
    }

    public void checkItemsFloodWait() {
        MessageObject message;
        if (UserConfig.getInstance(this.currentAccount).isPremium() || this.recyclerListView == null) {
            return;
        }
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            try {
                View childAt = this.recyclerListView.getChildAt(i);
                if ((childAt instanceof Cell) && (message = ((Cell) childAt).sharedDocumentCell.getMessage()) != null) {
                    if (FileLoader.getInstance(this.currentAccount).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        showPremiumFloodWaitBulletin(false);
                        return;
                    } else if (FileLoader.getInstance(this.currentAccount).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        showPremiumFloodWaitBulletin(true);
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void showPremiumFloodWaitBulletin(final boolean z) {
        float f;
        if (this.parentFragment == null || !this.recyclerListView.isAttachedToWindow()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown < ((long) MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupNotifyPeriod) * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = jCurrentTimeMillis;
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            return;
        }
        if (z) {
            f = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupUpload;
        } else {
            f = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupDownload;
        }
        SpannableString spannableString = new SpannableString(Double.toString(((double) Math.round(f * 10.0f)) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (this.parentFragment.hasStoryViewer()) {
            return;
        }
        BulletinFactory.of(this.parentFragment).createSimpleBulletin(R.raw.speed_limit, LocaleController.getString(z ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new Runnable() {
            @Override
            public final void run() {
                this.f$0.parentFragment.presentFragment(new PremiumPreviewFragment(z ? "upload_speed" : "download_speed"));
            }
        }), spannableString)).setDuration(8000).show(false);
    }
}
