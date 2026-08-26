package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.Stories.PeerStoriesView$22$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda26;

public class ChatAttachAlertDocumentLayout extends ChatAttachAlert.AttachAlertLayout {
    private static final int ANIMATION_BACKWARD = 2;
    private static final int ANIMATION_FORWARD = 1;
    private static final int ANIMATION_NONE = 0;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_MUSIC = 1;
    public static final int TYPE_RINGTONE = 2;
    private static final int search_button = 0;
    private static final int sort_button = 6;
    private float additionalTranslationY;
    private boolean allowMusic;
    private LinearLayoutManager backgroundLayoutManager;
    private ListAdapter backgroundListAdapter;
    private RecyclerListView backgroundListView;
    private boolean canSelectOnlyImageFiles;
    private int currentAnimationType;
    private File currentDir;
    private DocumentSelectActivityDelegate delegate;
    private StickerEmptyView emptyView;
    private FiltersView filtersView;
    private AnimatorSet filtersViewAnimator;
    private boolean hasFiles;
    public boolean isSoundPicker;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    ValueAnimator listAnimation;
    private RecyclerListView listView;
    private FlickerLoadingView loadingView;
    private int maxSelectedFiles;
    private BroadcastReceiver receiver;
    private boolean receiverRegistered;
    private boolean scrolling;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private boolean searching;
    private HashMap<String, ListItem> selectedFiles;
    public ArrayList<String> selectedFilesOrder;
    private HashMap<FilteredSearchView.MessageHashId, MessageObject> selectedMessages;
    private boolean sendPressed;
    private boolean sortByName;
    private ActionBarMenuItem sortItem;
    private int type;

    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        public void lambda$onReceive$0() throws Throwable {
            try {
                if (ChatAttachAlertDocumentLayout.this.currentDir == null) {
                    ChatAttachAlertDocumentLayout.this.listRoots();
                } else {
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                    chatAttachAlertDocumentLayout.listFiles(chatAttachAlertDocumentLayout.currentDir);
                }
                ChatAttachAlertDocumentLayout.this.updateSearchButton();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = new Bulletin$2$$ExternalSyntheticLambda1(this, 5);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                ChatAttachAlertDocumentLayout.this.listView.postDelayed(bulletin$2$$ExternalSyntheticLambda1, 1000L);
            } else {
                bulletin$2$$ExternalSyntheticLambda1.run();
            }
        }
    }

    public static class HistoryEntry {
        File dir;
        int scrollItem;
        int scrollOffset;
        String title;

        private HistoryEntry() {
        }

        public HistoryEntry(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private ArrayList<ListItem> items = new ArrayList<>();
        private ArrayList<HistoryEntry> history = new ArrayList<>();
        private ArrayList<ListItem> recentItems = new ArrayList<>();

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public ListItem getItem(int i) {
            int size;
            int size2 = this.items.size();
            if (i < size2) {
                return this.items.get(i);
            }
            if (!this.history.isEmpty() || this.recentItems.isEmpty() || i == size2 || i == size2 + 1 || (size = i - (this.items.size() + 2)) >= this.recentItems.size()) {
                return null;
            }
            return this.recentItems.get(size);
        }

        @Override
        public int getItemCount() {
            int size = this.items.size();
            if (this.history.isEmpty() && !this.recentItems.isEmpty()) {
                size += this.recentItems.size() + 2;
            }
            return size + 1;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                return 3;
            }
            int size = this.items.size();
            if (i == size) {
                return 2;
            }
            return i == size + 1 ? 0 : 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertDocumentLayout.this.updateEmptyView();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (ChatAttachAlertDocumentLayout.this.sortByName) {
                    headerCell.setText(LocaleController.getString(R.string.RecentFilesAZ));
                    return;
                } else {
                    headerCell.setText(LocaleController.getString(R.string.RecentFiles));
                    return;
                }
            }
            if (itemViewType != 1) {
                return;
            }
            ListItem item = getItem(i);
            SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
            int i2 = item.icon;
            if (i2 != 0) {
                sharedDocumentCell.setTextAndValueAndTypeAndThumb(i != this.items.size() - 1, item.title, i2, item.subtitle, null, null);
            } else {
                sharedDocumentCell.setTextAndValueAndTypeAndThumb(false, item.title, 0, item.subtitle, item.ext.toUpperCase().substring(0, Math.min(item.ext.length(), 4)), item.thumb);
            }
            if (item.file != null) {
                sharedDocumentCell.setChecked(ChatAttachAlertDocumentLayout.this.selectedFiles.containsKey(item.file.toString()), !ChatAttachAlertDocumentLayout.this.scrolling);
            } else {
                sharedDocumentCell.setChecked(false, !ChatAttachAlertDocumentLayout.this.scrolling);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            if (i == 0) {
                headerCell = new HeaderCell(this.mContext, ChatAttachAlertDocumentLayout.this.resourcesProvider);
            } else if (i == 1) {
                headerCell = new SharedDocumentCell(this.mContext, 1, ChatAttachAlertDocumentLayout.this.resourcesProvider);
            } else if (i != 2) {
                headerCell = new View(this.mContext);
                headerCell.setTag(-33024);
            } else {
                headerCell = new ShadowSectionCell(this.mContext, null, 0);
            }
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public class SearchAdapter extends RecyclerListView.SectionsAdapter {
        private String currentDataQuery;
        private long currentSearchDialogId;
        private FiltersView.MediaFilterData currentSearchFilter;
        private long currentSearchMaxDate;
        private long currentSearchMinDate;
        private boolean endReached;
        private boolean isLoading;
        private String lastMessagesSearchString;
        private String lastSearchFilterQueryString;
        private Runnable localSearchRunnable;
        private Context mContext;
        private int nextSearchRate;
        private int requestIndex;
        private int searchIndex;
        private Runnable searchRunnable;
        private ArrayList<ListItem> searchResult = new ArrayList<>();
        private final FilteredSearchView.MessageHashId messageHashIdTmp = new FilteredSearchView.MessageHashId(0, 0);
        private ArrayList<Object> localTipChats = new ArrayList<>();
        private ArrayList<FiltersView.DateData> localTipDates = new ArrayList<>();
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public SparseArray<MessageObject> messagesById = new SparseArray<>();
        public ArrayList<String> sections = new ArrayList<>();
        public HashMap<String, ArrayList<MessageObject>> sectionArrays = new HashMap<>();
        private ArrayList<FiltersView.MediaFilterData> currentSearchFilters = new ArrayList<>();
        private boolean firstLoading = true;
        private AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
        private Runnable clearCurrentResultsRunnable = new Runnable() {
            @Override
            public void run() {
                if (SearchAdapter.this.isLoading) {
                    SearchAdapter.this.messages.clear();
                    SearchAdapter.this.sections.clear();
                    SearchAdapter.this.sectionArrays.clear();
                    SearchAdapter.this.notifyDataSetChanged();
                }
            }
        };

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        public void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
            if (!this.currentSearchFilters.isEmpty()) {
                for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                    FiltersView.MediaFilterData mediaFilterData2 = this.currentSearchFilters.get(i);
                    if (mediaFilterData.filterType == mediaFilterData2.filterType) {
                        return;
                    }
                    if (mediaFilterData.isMedia() && mediaFilterData2.isMedia()) {
                        return;
                    }
                }
            }
            this.currentSearchFilters.add(mediaFilterData);
            ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.setSearchFilter(mediaFilterData);
            ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.setSearchFieldText("");
            updateFiltersView(true, null, null, true);
        }

        public void lambda$search$0(String str, boolean z, ArrayList arrayList) {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), str);
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<ListItem> arrayList2 = new ArrayList<>();
            if (!z) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ListItem listItem = (ListItem) arrayList.get(i2);
                    File file = listItem.file;
                    if (file != null && !file.isDirectory()) {
                        for (int i3 = 0; i3 < i; i3++) {
                            String str2 = strArr[i3];
                            String str3 = listItem.title;
                            if (str3 != null ? str3.toLowerCase().contains(str2) : false) {
                                arrayList2.add(listItem);
                                break;
                            }
                        }
                    }
                }
            }
            updateSearchResults(arrayList2, str);
        }

        public void lambda$search$1(String str) {
            ArrayList arrayList = new ArrayList(ChatAttachAlertDocumentLayout.this.listAdapter.items);
            if (ChatAttachAlertDocumentLayout.this.listAdapter.history.isEmpty()) {
                arrayList.addAll(0, ChatAttachAlertDocumentLayout.this.listAdapter.recentItems);
            }
            Utilities.searchQueue.postRunnable(new JoinGroupAlert$$ExternalSyntheticLambda3(this, str, !this.currentSearchFilters.isEmpty(), arrayList, 3));
        }

        public void lambda$searchGlobal$2(int i, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
            if (i != this.requestIndex) {
                return;
            }
            this.isLoading = false;
            if (tL_error != null) {
                ChatAttachAlertDocumentLayout.this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setVisibility(0);
                ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                ChatAttachAlertDocumentLayout.this.emptyView.showProgress(false, true);
                return;
            }
            ChatAttachAlertDocumentLayout.this.emptyView.showProgress(false);
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            this.nextSearchRate = messages_messages.next_rate;
            accountInstance.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            accountInstance.getMessagesController().putUsers(messages_messages.users, false);
            accountInstance.getMessagesController().putChats(messages_messages.chats, false);
            if (!z) {
                this.messages.clear();
                this.messagesById.clear();
                this.sections.clear();
                this.sectionArrays.clear();
            }
            int size = messages_messages.count;
            this.currentDataQuery = str;
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                ArrayList<MessageObject> arrayList4 = this.sectionArrays.get(messageObject.monthKey);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList<>();
                    this.sectionArrays.put(messageObject.monthKey, arrayList4);
                    this.sections.add(messageObject.monthKey);
                }
                arrayList4.add(messageObject);
                this.messages.add(messageObject);
                this.messagesById.put(messageObject.getId(), messageObject);
            }
            if (this.messages.size() > size) {
                size = this.messages.size();
            }
            this.endReached = this.messages.size() >= size;
            if (this.messages.isEmpty()) {
                if (TextUtils.isEmpty(this.currentDataQuery) && j == 0 && j2 == 0) {
                    ChatAttachAlertDocumentLayout.this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setVisibility(0);
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                } else {
                    ChatAttachAlertDocumentLayout.this.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setVisibility(0);
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                }
            }
            if (!z) {
                this.localTipChats.clear();
                if (arrayList2 != null) {
                    this.localTipChats.addAll(arrayList2);
                }
                if (str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.localTipChats.size()) {
                            this.localTipChats.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                            break;
                        } else if ((this.localTipChats.get(i3) instanceof TLRPC.User) && UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC.User) this.localTipChats.get(i3)).id) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                this.localTipDates.clear();
                this.localTipDates.addAll(arrayList3);
                updateFiltersView(TextUtils.isEmpty(this.currentDataQuery), this.localTipChats, this.localTipDates, true);
            }
            this.firstLoading = false;
            final View view = null;
            final int childAdapterPosition = -1;
            for (int i4 = 0; i4 < size2; i4++) {
                View childAt = ChatAttachAlertDocumentLayout.this.listView.getChildAt(i4);
                if (childAt instanceof FlickerLoadingView) {
                    childAdapterPosition = ChatAttachAlertDocumentLayout.this.listView.getChildAdapterPosition(childAt);
                    view = childAt;
                }
            }
            if (view != null) {
                ChatAttachAlertDocumentLayout.this.listView.removeView(view);
            }
            if ((ChatAttachAlertDocumentLayout.this.loadingView.getVisibility() == 0 && ChatAttachAlertDocumentLayout.this.listView.getChildCount() <= 1) || view != null) {
                ChatAttachAlertDocumentLayout.this.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        ChatAttachAlertDocumentLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        int childCount = ChatAttachAlertDocumentLayout.this.listView.getChildCount();
                        AnimatorSet animatorSet = new AnimatorSet();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt2 = ChatAttachAlertDocumentLayout.this.listView.getChildAt(i5);
                            if (view == null || ChatAttachAlertDocumentLayout.this.listView.getChildAdapterPosition(childAt2) >= childAdapterPosition) {
                                childAt2.setAlpha(0.0f);
                                int iMin = (int) ((Math.min(ChatAttachAlertDocumentLayout.this.listView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ChatAttachAlertDocumentLayout.this.listView.getMeasuredHeight()) * 100.0f);
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                                objectAnimatorOfFloat.setStartDelay(iMin);
                                objectAnimatorOfFloat.setDuration(200L);
                                animatorSet.playTogether(objectAnimatorOfFloat);
                            }
                        }
                        animatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                SearchAdapter.this.notificationsLocker.unlock();
                            }
                        });
                        SearchAdapter.this.notificationsLocker.lock();
                        animatorSet.start();
                        View view2 = view;
                        if (view2 != null && view2.getParent() == null) {
                            ChatAttachAlertDocumentLayout.this.listView.addView(view);
                            final RecyclerView.LayoutManager layoutManager = ChatAttachAlertDocumentLayout.this.listView.getLayoutManager();
                            if (layoutManager != null) {
                                layoutManager.ignoreView(view);
                                View view3 = view;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
                                objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animator) {
                                        view.setAlpha(1.0f);
                                        layoutManager.stopIgnoringView(view);
                                        ChatAttachAlertDocumentLayout.this.listView.removeView(view);
                                    }
                                });
                                objectAnimatorOfFloat2.start();
                            }
                        }
                        return true;
                    }
                });
            }
            notifyDataSetChanged();
        }

        public void lambda$searchGlobal$3(AccountInstance accountInstance, String str, int i, boolean z, long j, long j2, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject, TLRPC.TL_error tL_error) {
            ArrayList arrayList3 = new ArrayList();
            if (tL_error == null) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int size = messages_messages.messages.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MessageObject messageObject = new MessageObject(accountInstance.getCurrentAccount(), messages_messages.messages.get(i2), false, true);
                    messageObject.setQuery(str);
                    arrayList3.add(messageObject);
                }
            }
            AndroidUtilities.runOnUIThread(new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda26(this, i, tL_error, tLObject, accountInstance, z, str, arrayList3, j, j2, arrayList, arrayList2));
        }

        public void lambda$searchGlobal$4(final long j, final String str, final AccountInstance accountInstance, final long j2, long j3, final boolean z, String str2, final int i) throws Throwable {
            long j4;
            TLObject tLObject;
            ArrayList<Object> arrayList = null;
            if (j != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.q = str;
                tL_messages_search.limit = 20;
                tL_messages_search.filter = this.currentSearchFilter.filter;
                tL_messages_search.peer = accountInstance.getMessagesController().getInputPeer(j);
                if (j2 > 0) {
                    tL_messages_search.min_date = (int) (j2 / 1000);
                }
                if (j3 > 0) {
                    tL_messages_search.max_date = (int) (j3 / 1000);
                }
                if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                    tL_messages_search.offset_id = ((MessageObject) zzin.m(1, this.messages)).getId();
                    tLObject = tL_messages_search;
                } else {
                    tL_messages_search.offset_id = 0;
                    tLObject = tL_messages_search;
                }
            } else {
                if (!TextUtils.isEmpty(str)) {
                    ArrayList<Object> arrayList2 = new ArrayList<>();
                    accountInstance.getMessagesStorage().localSearch(0, str, arrayList2, new ArrayList<>(), new ArrayList<>(), null, -1);
                    arrayList = arrayList2;
                }
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = this.currentSearchFilter.filter;
                if (j2 > 0) {
                    tL_messages_searchGlobal.min_date = (int) (j2 / 1000);
                }
                if (j3 > 0) {
                    tL_messages_searchGlobal.max_date = (int) (j3 / 1000);
                }
                if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                    MessageObject messageObject = (MessageObject) zzin.m(1, this.messages);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                    TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                    long j5 = peer.channel_id;
                    if (j5 != 0) {
                        j4 = -j5;
                    } else {
                        j5 = peer.chat_id;
                        if (j5 != 0) {
                            j4 = -j5;
                        } else {
                            j4 = peer.user_id;
                        }
                    }
                    tL_messages_searchGlobal.offset_peer = accountInstance.getMessagesController().getInputPeer(j4);
                    tLObject = tL_messages_searchGlobal;
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tLObject = tL_messages_searchGlobal;
                }
            }
            TLObject tLObject2 = tLObject;
            this.lastMessagesSearchString = str;
            this.lastSearchFilterQueryString = str2;
            final ArrayList arrayList3 = new ArrayList();
            FiltersView.fillTipDates(this.lastMessagesSearchString, arrayList3);
            final ArrayList<Object> arrayList4 = arrayList;
            accountInstance.getConnectionsManager().sendRequest(tLObject2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                    ArrayList arrayList5 = arrayList3;
                    this.f$0.lambda$searchGlobal$3(accountInstance, str, i, z, j, j2, arrayList4, arrayList5, tLObject3, tL_error);
                }
            });
        }

        public void lambda$updateSearchResults$5(ArrayList arrayList) {
            if (ChatAttachAlertDocumentLayout.this.searching && ChatAttachAlertDocumentLayout.this.listView.getAdapter() != ChatAttachAlertDocumentLayout.this.searchAdapter) {
                ChatAttachAlertDocumentLayout.this.listView.setAdapter(ChatAttachAlertDocumentLayout.this.searchAdapter);
            }
            this.searchResult = arrayList;
            notifyDataSetChanged();
        }

        private void searchGlobal(final long j, final long j2, final long j3, FiltersView.MediaFilterData mediaFilterData, final String str, boolean z) {
            Locale locale = Locale.ENGLISH;
            final String str2 = j + j2 + j3 + mediaFilterData.filterType + str;
            String str3 = this.lastSearchFilterQueryString;
            boolean z2 = str3 != null && str3.equals(str2);
            boolean z3 = !z2 && z;
            this.currentSearchFilter = mediaFilterData;
            this.currentSearchDialogId = j;
            this.currentSearchMinDate = j2;
            this.currentSearchMaxDate = j3;
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            AndroidUtilities.cancelRunOnUIThread(this.clearCurrentResultsRunnable);
            if (z2 && z) {
                return;
            }
            if (z3) {
                this.messages.clear();
                this.sections.clear();
                this.sectionArrays.clear();
                this.isLoading = true;
                ChatAttachAlertDocumentLayout.this.emptyView.setVisibility(0);
                notifyDataSetChanged();
                this.requestIndex++;
                this.firstLoading = true;
                if (ChatAttachAlertDocumentLayout.this.listView.getPinnedHeader() != null) {
                    ChatAttachAlertDocumentLayout.this.listView.getPinnedHeader().setAlpha(0.0f);
                }
                this.localTipChats.clear();
                this.localTipDates.clear();
            }
            this.isLoading = true;
            notifyDataSetChanged();
            if (!z2) {
                this.clearCurrentResultsRunnable.run();
                ChatAttachAlertDocumentLayout.this.emptyView.showProgress(true, !z);
            }
            if (TextUtils.isEmpty(str)) {
                this.localTipDates.clear();
                this.localTipChats.clear();
                updateFiltersView(false, null, null, true);
                return;
            }
            final int i = this.requestIndex + 1;
            this.requestIndex = i;
            final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
            final boolean z4 = z2;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$searchGlobal$4(j, str, accountInstance, j2, j3, z4, str2, i);
                }
            };
            this.searchRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, (!z4 || this.messages.isEmpty()) ? 350L : 0L);
            ChatAttachAlertDocumentLayout.this.loadingView.setViewType(3);
        }

        public void updateFiltersView(boolean z, ArrayList<Object> arrayList, ArrayList<FiltersView.DateData> arrayList2, boolean z2) {
            boolean z3;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                if (this.currentSearchFilters.get(i).isMedia()) {
                    z4 = true;
                } else if (this.currentSearchFilters.get(i).filterType == 4) {
                    z5 = true;
                } else if (this.currentSearchFilters.get(i).filterType == 6) {
                    z6 = true;
                }
            }
            boolean z7 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
            if ((z4 || z7 || !z) && z7) {
                if (arrayList == null || arrayList.isEmpty() || z5) {
                    arrayList = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty() || z6) {
                    arrayList2 = null;
                }
                if (arrayList == null && arrayList2 == null) {
                    z3 = false;
                } else {
                    ChatAttachAlertDocumentLayout.this.filtersView.setUsersAndDates(arrayList, arrayList2, false);
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                ChatAttachAlertDocumentLayout.this.filtersView.setUsersAndDates(null, null, false);
            }
            ChatAttachAlertDocumentLayout.this.filtersView.setEnabled(z3);
            if (!z3 || ChatAttachAlertDocumentLayout.this.filtersView.getTag() == null) {
                if (z3 || ChatAttachAlertDocumentLayout.this.filtersView.getTag() != null) {
                    ChatAttachAlertDocumentLayout.this.filtersView.setTag(z3 ? 1 : null);
                    if (ChatAttachAlertDocumentLayout.this.filtersViewAnimator != null) {
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator.cancel();
                    }
                    if (!z2) {
                        ChatAttachAlertDocumentLayout.this.filtersView.getAdapter().notifyDataSetChanged();
                        ChatAttachAlertDocumentLayout.this.listView.setTranslationY(z3 ? AndroidUtilities.dp(44.0f) : 0.0f);
                        ChatAttachAlertDocumentLayout.this.filtersView.setTranslationY(z3 ? 0.0f : -AndroidUtilities.dp(44.0f));
                        ChatAttachAlertDocumentLayout.this.loadingView.setTranslationY(z3 ? AndroidUtilities.dp(44.0f) : 0.0f);
                        ChatAttachAlertDocumentLayout.this.emptyView.setTranslationY(z3 ? AndroidUtilities.dp(44.0f) : 0.0f);
                        ChatAttachAlertDocumentLayout.this.filtersView.setVisibility(z3 ? 0 : 4);
                        return;
                    }
                    if (z3) {
                        ChatAttachAlertDocumentLayout.this.filtersView.setVisibility(0);
                    }
                    ChatAttachAlertDocumentLayout.this.filtersViewAnimator = new AnimatorSet();
                    AnimatorSet animatorSet = ChatAttachAlertDocumentLayout.this.filtersViewAnimator;
                    RecyclerListView recyclerListView = ChatAttachAlertDocumentLayout.this.listView;
                    Property property = View.TRANSLATION_Y;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property, z3 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(ChatAttachAlertDocumentLayout.this.filtersView, (Property<FiltersView, Float>) property, z3 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(ChatAttachAlertDocumentLayout.this.loadingView, (Property<FlickerLoadingView, Float>) property, z3 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(ChatAttachAlertDocumentLayout.this.emptyView, (Property<StickerEmptyView, Float>) property, z3 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    ChatAttachAlertDocumentLayout.this.filtersViewAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ChatAttachAlertDocumentLayout.this.filtersView.getTag() == null) {
                                ChatAttachAlertDocumentLayout.this.filtersView.setVisibility(4);
                            }
                            ChatAttachAlertDocumentLayout.this.filtersViewAnimator = null;
                        }
                    });
                    ChatAttachAlertDocumentLayout.this.filtersViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    ChatAttachAlertDocumentLayout.this.filtersViewAnimator.setDuration(180L);
                    ChatAttachAlertDocumentLayout.this.filtersViewAnimator.start();
                }
            }
        }

        private void updateSearchResults(ArrayList<ListItem> arrayList, String str) {
            AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(13, this, arrayList));
        }

        public void clear() {
            this.currentSearchFilters.clear();
        }

        @Override
        public int getCountForSection(int i) {
            if (i == 0) {
                return this.searchResult.size();
            }
            int i2 = i - 1;
            int i3 = 1;
            if (i2 >= this.sections.size()) {
                return 1;
            }
            ArrayList<MessageObject> arrayList = this.sectionArrays.get(this.sections.get(i2));
            if (arrayList == null) {
                return 0;
            }
            int size = arrayList.size();
            if (i2 == 0 && this.searchResult.isEmpty()) {
                i3 = 0;
            }
            return size + i3;
        }

        @Override
        public Object getItem(int i, int i2) {
            ArrayList<MessageObject> arrayList;
            if (i == 0) {
                if (i2 < this.searchResult.size()) {
                    return this.searchResult.get(i2);
                }
                return null;
            }
            int i3 = i - 1;
            if (i3 >= this.sections.size() || (arrayList = this.sectionArrays.get(this.sections.get(i3))) == null) {
                return null;
            }
            int i4 = i2 - ((i3 == 0 && this.searchResult.isEmpty()) ? 0 : 1);
            if (i4 < 0 || i4 >= arrayList.size()) {
                return null;
            }
            return arrayList.get(i4);
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            if (i == getSectionCount() - 1) {
                return 3;
            }
            int i3 = i - 1;
            if (i3 < this.sections.size()) {
                return (!(i3 == 0 && this.searchResult.isEmpty()) && i2 == 0) ? 0 : 4;
            }
            return 2;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public int getSectionCount() {
            if (this.sections.isEmpty()) {
                return 2;
            }
            return this.sections.size() + (!this.endReached ? 1 : 0) + 2;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            GraySectionCell graySectionCell = (GraySectionCell) view;
            if (graySectionCell == null) {
                graySectionCell = new GraySectionCell(this.mContext, 16, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                graySectionCell.setBackgroundColor(ChatAttachAlertDocumentLayout.this.getThemedColor(Theme.key_graySection) & (-218103809));
            }
            if (i == 0 || (i == 1 && this.searchResult.isEmpty())) {
                graySectionCell.setAlpha(0.0f);
                return graySectionCell;
            }
            int i2 = i - 1;
            if (i2 < this.sections.size()) {
                graySectionCell.setAlpha(1.0f);
                ArrayList<MessageObject> arrayList = this.sectionArrays.get(this.sections.get(i2));
                if (arrayList != null) {
                    graySectionCell.setText((i2 != 0 || this.searchResult.isEmpty()) ? LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
                }
            }
            return view;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 1 || itemViewType == 4;
        }

        public void loadMore() {
            FiltersView.MediaFilterData mediaFilterData;
            if (ChatAttachAlertDocumentLayout.this.searchAdapter.isLoading || ChatAttachAlertDocumentLayout.this.searchAdapter.endReached || (mediaFilterData = this.currentSearchFilter) == null) {
                return;
            }
            searchGlobal(this.currentSearchDialogId, this.currentSearchMinDate, this.currentSearchMaxDate, mediaFilterData, this.lastMessagesSearchString, false);
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertDocumentLayout.this.updateEmptyView();
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 2 || itemViewType == 3) {
                return;
            }
            boolean z = false;
            if (itemViewType == 0) {
                int i3 = i - 1;
                ArrayList<MessageObject> arrayList = this.sectionArrays.get(this.sections.get(i3));
                if (arrayList == null) {
                    return;
                }
                ((GraySectionCell) viewHolder.itemView).setText((i3 != 0 || this.searchResult.isEmpty()) ? LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
                return;
            }
            if (itemViewType == 1 || itemViewType == 4) {
                final SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                if (i == 0) {
                    ListItem listItem = (ListItem) getItem(i2);
                    SharedDocumentCell sharedDocumentCell2 = (SharedDocumentCell) viewHolder.itemView;
                    int i4 = listItem.icon;
                    if (i4 != 0) {
                        sharedDocumentCell2.setTextAndValueAndTypeAndThumb(false, listItem.title, i4, listItem.subtitle, null, null);
                    } else {
                        sharedDocumentCell2.setTextAndValueAndTypeAndThumb(false, listItem.title, 0, listItem.subtitle, listItem.ext.toUpperCase().substring(0, Math.min(listItem.ext.length(), 4)), listItem.thumb);
                    }
                    if (listItem.file != null) {
                        sharedDocumentCell2.setChecked(ChatAttachAlertDocumentLayout.this.selectedFiles.containsKey(listItem.file.toString()), !ChatAttachAlertDocumentLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell2.setChecked(false, !ChatAttachAlertDocumentLayout.this.scrolling);
                        return;
                    }
                }
                int i5 = i - 1;
                if (i5 != 0 || !this.searchResult.isEmpty()) {
                    i2--;
                }
                ArrayList<MessageObject> arrayList2 = this.sectionArrays.get(this.sections.get(i5));
                if (arrayList2 == null) {
                    return;
                }
                final MessageObject messageObject = arrayList2.get(i2);
                final boolean z2 = sharedDocumentCell.getMessage() != null && sharedDocumentCell.getMessage().getId() == messageObject.getId();
                if (i2 != arrayList2.size() - 1 || (i5 == this.sections.size() - 1 && this.isLoading)) {
                    z = true;
                }
                sharedDocumentCell.setDocument(messageObject, z);
                sharedDocumentCell.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        sharedDocumentCell.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (!ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.isActionModeShowed()) {
                            sharedDocumentCell.setChecked(false, z2);
                            return true;
                        }
                        SearchAdapter.this.messageHashIdTmp.set(messageObject.getId(), messageObject.getDialogId());
                        sharedDocumentCell.setChecked(ChatAttachAlertDocumentLayout.this.selectedMessages.containsKey(SearchAdapter.this.messageHashIdTmp), z2);
                        return true;
                    }
                });
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            if (i != 0) {
                if (i == 1) {
                    SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(this.mContext, i == 1 ? 1 : 2, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                    sharedDocumentCell.setDrawDownloadIcon(false);
                    graySectionCell = sharedDocumentCell;
                } else if (i == 2) {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                    flickerLoadingView.setViewType(3);
                    flickerLoadingView.setIsSingleCell(true);
                    graySectionCell = flickerLoadingView;
                } else if (i != 4) {
                    View view = new View(this.mContext);
                    view.setTag(-33024);
                    graySectionCell = view;
                } else {
                    SharedDocumentCell sharedDocumentCell2 = new SharedDocumentCell(this.mContext, i == 1 ? 1 : 2, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                    sharedDocumentCell2.setDrawDownloadIcon(false);
                    graySectionCell = sharedDocumentCell2;
                }
            } else {
                graySectionCell = new GraySectionCell(this.mContext, 16, ChatAttachAlertDocumentLayout.this.resourcesProvider);
            }
            return zzkd.m(graySectionCell, graySectionCell, -2);
        }

        public void removeSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
            this.currentSearchFilters.remove(mediaFilterData);
        }

        public void search(String str, boolean z) {
            long j;
            Runnable runnable = this.localSearchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.localSearchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (!this.searchResult.isEmpty()) {
                    this.searchResult.clear();
                }
                if (ChatAttachAlertDocumentLayout.this.listView.getAdapter() != ChatAttachAlertDocumentLayout.this.listAdapter) {
                    ChatAttachAlertDocumentLayout.this.listView.setAdapter(ChatAttachAlertDocumentLayout.this.listAdapter);
                }
                notifyDataSetChanged();
            } else {
                FilterGLThread$$ExternalSyntheticLambda7 filterGLThread$$ExternalSyntheticLambda7 = new FilterGLThread$$ExternalSyntheticLambda7(14, this, str);
                this.localSearchRunnable = filterGLThread$$ExternalSyntheticLambda7;
                AndroidUtilities.runOnUIThread(filterGLThread$$ExternalSyntheticLambda7, 300L);
            }
            if (ChatAttachAlertDocumentLayout.this.canSelectOnlyImageFiles || !ChatAttachAlertDocumentLayout.this.listAdapter.history.isEmpty()) {
                return;
            }
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                FiltersView.MediaFilterData mediaFilterData = this.currentSearchFilters.get(i);
                int i2 = mediaFilterData.filterType;
                if (i2 == 4) {
                    TLObject tLObject = mediaFilterData.chat;
                    if (tLObject instanceof TLRPC.User) {
                        j = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        j = -((TLRPC.Chat) tLObject).id;
                    }
                    j2 = j;
                } else if (i2 == 6) {
                    FiltersView.DateData dateData = mediaFilterData.dateData;
                    j3 = dateData.minDate;
                    j4 = dateData.maxDate;
                }
            }
            searchGlobal(j2, j3, j4, FiltersView.filters[2], str, z);
        }
    }

    public ChatAttachAlertDocumentLayout(ChatAttachAlert chatAttachAlert, Context context, int i, Theme.ResourcesProvider resourcesProvider) throws Throwable {
        super(chatAttachAlert, context, resourcesProvider);
        this.receiverRegistered = false;
        this.selectedFiles = new HashMap<>();
        this.selectedFilesOrder = new ArrayList<>();
        this.selectedMessages = new HashMap<>();
        this.maxSelectedFiles = -1;
        this.receiver = new AnonymousClass1();
        this.listAdapter = new ListAdapter(context);
        this.allowMusic = i == 1;
        this.isSoundPicker = i == 2;
        this.sortByName = SharedConfig.sortFilesByName;
        loadRecentFiles();
        this.searching = false;
        if (!this.receiverRegistered) {
            this.receiverRegistered = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_NOFS");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_SHARED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addDataScheme("file");
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(this.receiver, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(this.receiver, intentFilter);
            }
        }
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                ChatAttachAlertDocumentLayout.this.searching = false;
                ChatAttachAlertDocumentLayout.this.sortItem.setVisibility(0);
                if (ChatAttachAlertDocumentLayout.this.listView.getAdapter() != ChatAttachAlertDocumentLayout.this.listAdapter) {
                    ChatAttachAlertDocumentLayout.this.listView.setAdapter(ChatAttachAlertDocumentLayout.this.listAdapter);
                }
                ChatAttachAlertDocumentLayout.this.listAdapter.notifyDataSetChanged();
                ChatAttachAlertDocumentLayout.this.searchAdapter.search(null, true);
            }

            @Override
            public void onSearchExpand() {
                ChatAttachAlertDocumentLayout.this.searching = true;
                ChatAttachAlertDocumentLayout.this.sortItem.setVisibility(8);
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                chatAttachAlertDocumentLayout.parentAlert.makeFocusable(chatAttachAlertDocumentLayout.searchItem.getSearchField(), true);
            }

            @Override
            public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
                ChatAttachAlertDocumentLayout.this.searchAdapter.removeSearchFilter(mediaFilterData);
                ChatAttachAlertDocumentLayout.this.searchAdapter.search(ChatAttachAlertDocumentLayout.this.searchItem.getSearchField().getText().toString(), false);
                ChatAttachAlertDocumentLayout.this.searchAdapter.updateFiltersView(true, null, null, true);
            }

            @Override
            public void onTextChanged(EditText editText) {
                ChatAttachAlertDocumentLayout.this.searchAdapter.search(editText.getText().toString(), false);
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        int i2 = R.string.Search;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(i2));
        this.searchItem.setContentDescription(LocaleController.getString(i2));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        int i3 = Theme.key_dialogTextBlack;
        searchField.setTextColor(getThemedColor(i3));
        searchField.setCursorColor(getThemedColor(i3));
        searchField.setHintTextColor(getThemedColor(Theme.key_chat_messagePanelHint));
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(6, this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.sortItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
        this.loadingView = flickerLoadingView;
        addView(flickerLoadingView);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, this.loadingView, 1, resourcesProvider) {
            @Override
            public float getTranslationY() {
                return super.getTranslationY() - ChatAttachAlertDocumentLayout.this.additionalTranslationY;
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(ChatAttachAlertDocumentLayout.this.additionalTranslationY + f);
            }
        };
        this.emptyView = stickerEmptyView;
        addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setVisibility(8);
        this.emptyView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(19));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            Paint paint = new Paint();

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (ChatAttachAlertDocumentLayout.this.currentAnimationType == 2 && getChildCount() > 0) {
                    float y = 2.1474836E9f;
                    for (int i4 = 0; i4 < getChildCount(); i4++) {
                        if (getChildAt(i4).getY() < y) {
                            y = getChildAt(i4).getY();
                        }
                    }
                    this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlertDocumentLayout.this.currentAnimationType != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.backgroundListView = recyclerListView;
        recyclerListView.setSectionsType(2);
        this.backgroundListView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.backgroundListView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(56.0f), this.backgroundListView);
        this.backgroundLayoutManager = fillLastLinearLayoutManager;
        recyclerListView2.setLayoutManager(fillLastLinearLayoutManager);
        this.backgroundListView.setClipToPadding(false);
        RecyclerListView recyclerListView3 = this.backgroundListView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.backgroundListAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        addView(this.backgroundListView, LayoutHelper.createFrame(-1, -1.0f));
        this.backgroundListView.setVisibility(8);
        RecyclerListView recyclerListView4 = new RecyclerListView(context, resourcesProvider) {
            Paint paint = new Paint();

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (ChatAttachAlertDocumentLayout.this.currentAnimationType == 1 && getChildCount() > 0) {
                    float y = 2.1474836E9f;
                    for (int i4 = 0; i4 < getChildCount(); i4++) {
                        if (getChildAt(i4).getY() < y) {
                            y = getChildAt(i4).getY();
                        }
                    }
                    this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                }
                super.dispatchDraw(canvas);
            }
        };
        this.listView = recyclerListView4;
        recyclerListView4.setSections();
        RecyclerListView recyclerListView5 = this.listView;
        this.iBlur3Capture = recyclerListView5;
        this.iBlur3CaptureView = recyclerListView5;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        recyclerListView5.setSectionsType(2);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView6 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager2 = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, this.listView) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i5) {
                        return super.calculateDyToMakeVisible(view, i5) - ((ChatAttachAlertDocumentLayout.this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f));
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i5) {
                        return super.calculateTimeForDeceleration(i5) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i4);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = fillLastLinearLayoutManager2;
        recyclerListView6.setLayoutManager(fillLastLinearLayoutManager2);
        this.listView.setClipToPadding(false);
        this.listView.setAdapter(this.listAdapter);
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.searchAdapter = new SearchAdapter(context);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                RecyclerListView.Holder holder;
                int top;
                if (i4 == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = ChatAttachAlertDocumentLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertDocumentLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp) + backgroundPaddingTop < ActionBar.getCurrentActionBarHeight() && (holder = (RecyclerListView.Holder) ChatAttachAlertDocumentLayout.this.listView.findViewHolderForAdapterPosition(0)) != null && (top = (holder.itemView.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ChatAttachAlertDocumentLayout.this.listView.smoothScrollBy(0, top);
                    }
                }
                if (i4 == 1 && ChatAttachAlertDocumentLayout.this.searching && ChatAttachAlertDocumentLayout.this.listView.getAdapter() == ChatAttachAlertDocumentLayout.this.searchAdapter) {
                    AndroidUtilities.hideKeyboard(ChatAttachAlertDocumentLayout.this.parentAlert.getCurrentFocus());
                }
                ChatAttachAlertDocumentLayout.this.scrolling = i4 != 0;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                chatAttachAlertDocumentLayout.parentAlert.updateLayout(chatAttachAlertDocumentLayout, true, i5);
                ChatAttachAlertDocumentLayout.this.updateEmptyViewPosition();
                if (ChatAttachAlertDocumentLayout.this.listView.getAdapter() == ChatAttachAlertDocumentLayout.this.searchAdapter) {
                    int iFindFirstVisibleItemPosition = ChatAttachAlertDocumentLayout.this.layoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = ChatAttachAlertDocumentLayout.this.layoutManager.findLastVisibleItemPosition();
                    int iAbs = Math.abs(iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
                    int itemCount = recyclerView.getAdapter().getItemCount();
                    if (iAbs <= 0 || iFindLastVisibleItemPosition < itemCount - 10) {
                        return;
                    }
                    ChatAttachAlertDocumentLayout.this.searchAdapter.loadMore();
                }
            }
        });
        RecyclerListView recyclerListView7 = this.listView;
        final Object[] objArr = 0 == true ? 1 : 0;
        recyclerListView7.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ChatAttachAlertDocumentLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i4) throws Throwable {
                switch (objArr) {
                    case 0:
                        this.f$0.lambda$new$1(view, i4);
                        break;
                    default:
                        this.f$0.lambda$new$3(view, i4);
                        break;
                }
            }
        });
        this.listView.setOnItemLongClickListener(new EmojiView$$ExternalSyntheticLambda21(this, 28));
        FiltersView filtersView = new FiltersView(context, resourcesProvider);
        this.filtersView = filtersView;
        final int i4 = 1;
        filtersView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ChatAttachAlertDocumentLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i5) throws Throwable {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$1(view, i5);
                        break;
                    default:
                        this.f$0.lambda$new$3(view, i5);
                        break;
                }
            }
        });
        this.filtersView.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        addView(this.filtersView, LayoutHelper.createFrame(-1, 44, 48));
        this.filtersView.setTranslationY(-AndroidUtilities.dp(44.0f));
        this.filtersView.setVisibility(4);
        listRoots();
        updateSearchButton();
        updateEmptyView();
    }

    private boolean canClosePicker() throws Throwable {
        if (this.listAdapter.history.size() <= 0) {
            return true;
        }
        prepareAnimation();
        HistoryEntry historyEntry = (HistoryEntry) this.listAdapter.history.remove(this.listAdapter.history.size() - 1);
        this.parentAlert.actionBar.setTitle(historyEntry.title);
        int topForScroll = getTopForScroll();
        File file = historyEntry.dir;
        if (file != null) {
            listFiles(file);
        } else {
            listRoots();
        }
        updateSearchButton();
        this.layoutManager.scrollToPositionWithOffset(0, topForScroll);
        runAnimation(2);
        return false;
    }

    private void checkDirectory(File file) {
        File[] fileArrListFiles = file.listFiles();
        File fileCheckDirectory = FileLoader.checkDirectory(6);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    checkDirectory(file2);
                } else if (!file2.equals(fileCheckDirectory)) {
                    ListItem listItem = new ListItem(null);
                    listItem.title = file2.getName();
                    listItem.file = file2;
                    String name = file2.getName();
                    String[] strArrSplit = name.split("\\.");
                    listItem.ext = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
                    listItem.subtitle = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        listItem.thumb = file2.getAbsolutePath();
                    }
                    this.listAdapter.recentItems.add(listItem);
                }
            }
        }
    }

    private String getRootSubtitle(String str) {
        try {
            StatFs statFs = new StatFs(str);
            long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            return blockCount == 0 ? "" : LocaleController.formatString("FreeOfTotal", R.string.FreeOfTotal, AndroidUtilities.formatFileSize(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())), AndroidUtilities.formatFileSize(blockCount));
        } catch (Exception e) {
            FileLog.e(e);
            return str;
        }
    }

    private int getTopForScroll() {
        View childAt = this.listView.getChildAt(0);
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt);
        int i = -this.listView.getPaddingTop();
        return (viewHolderFindContainingViewHolder == null || viewHolderFindContainingViewHolder.getAdapterPosition() != 0) ? i : childAt.getTop() + i;
    }

    public static boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$new$1(View view, int i) throws Throwable {
        int i2;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ListAdapter listAdapter = this.listAdapter;
        Object item = adapter == listAdapter ? listAdapter.getItem(i) : this.searchAdapter.getItem(i);
        if (!(item instanceof ListItem)) {
            onItemClick(view, item);
            return;
        }
        ListItem listItem = (ListItem) item;
        File file = listItem.file;
        boolean zIsExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        if (!BuildVars.NO_SCOPED_STORAGE && (((i2 = listItem.icon) == R.drawable.files_storage || i2 == R.drawable.files_internal) && !zIsExternalStorageManager)) {
            this.delegate.startDocumentSelectActivity();
            return;
        }
        Object[] objArr = 0;
        if (file != null) {
            if (!file.isDirectory()) {
                onItemClick(view, listItem);
                return;
            }
            HistoryEntry historyEntry = new HistoryEntry(objArr == true ? 1 : 0);
            View childAt = this.listView.getChildAt(0);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt);
            if (viewHolderFindContainingViewHolder != null) {
                historyEntry.scrollItem = viewHolderFindContainingViewHolder.getAdapterPosition();
                historyEntry.scrollOffset = childAt.getTop();
                historyEntry.dir = this.currentDir;
                historyEntry.title = this.parentAlert.actionBar.getTitle();
                prepareAnimation();
                this.listAdapter.history.add(historyEntry);
                if (!listFiles(file)) {
                    this.listAdapter.history.remove(historyEntry);
                    return;
                } else {
                    runAnimation(1);
                    this.parentAlert.actionBar.setTitle(listItem.title);
                    return;
                }
            }
            return;
        }
        int i3 = listItem.icon;
        if (i3 == R.drawable.files_gallery) {
            final HashMap map = new HashMap();
            final ArrayList arrayList = new ArrayList();
            BaseFragment baseFragment = this.parentAlert.baseFragment;
            ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
            PhotoPickerActivity photoPickerActivity = new PhotoPickerActivity(0, MediaController.allMediaAlbumEntry, map, arrayList, 0, chatActivity != null, chatActivity, false);
            photoPickerActivity.setDocumentsPicker(true);
            photoPickerActivity.setDelegate(new PhotoPickerActivity.PhotoPickerActivityDelegate() {
                @Override
                public void actionButtonPressed(boolean z, boolean z2, int i4, int i5) {
                    if (z) {
                        return;
                    }
                    ChatAttachAlertDocumentLayout.this.sendSelectedPhotos(map, arrayList, z2, i4);
                }

                @Override
                public final boolean canFinishFragment() {
                    return PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$canFinishFragment(this);
                }

                @Override
                public void onCaptionChanged(CharSequence charSequence) {
                }

                @Override
                public void onOpenInPressed() {
                    ChatAttachAlertDocumentLayout.this.delegate.startDocumentSelectActivity();
                }

                @Override
                public void selectedPhotosChanged() {
                }
            });
            photoPickerActivity.setMaxSelectedPhotos(this.maxSelectedFiles, false);
            this.parentAlert.presentFragment(photoPickerActivity);
            this.parentAlert.dismiss(true);
            return;
        }
        if (i3 == R.drawable.files_music) {
            DocumentSelectActivityDelegate documentSelectActivityDelegate = this.delegate;
            if (documentSelectActivityDelegate != null) {
                documentSelectActivityDelegate.startMusicSelectActivity();
                return;
            }
            return;
        }
        int topForScroll = getTopForScroll();
        prepareAnimation();
        HistoryEntry historyEntry2 = (HistoryEntry) this.listAdapter.history.remove(this.listAdapter.history.size() - 1);
        this.parentAlert.actionBar.setTitle(historyEntry2.title);
        File file2 = historyEntry2.dir;
        if (file2 != null) {
            listFiles(file2);
        } else {
            listRoots();
        }
        updateSearchButton();
        this.layoutManager.scrollToPositionWithOffset(0, topForScroll);
        runAnimation(2);
    }

    public boolean lambda$new$2(View view, int i) {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ListAdapter listAdapter = this.listAdapter;
        return onItemClick(view, adapter == listAdapter ? listAdapter.getItem(i) : this.searchAdapter.getItem(i));
    }

    public void lambda$new$3(View view, int i) {
        this.filtersView.cancelClickRunnables(true);
        SearchAdapter searchAdapter = this.searchAdapter;
        FiltersView filtersView = this.filtersView;
        searchAdapter.addSearchFilter(filtersView.usersFilters.isEmpty() ? FiltersView.filters[i] : (FiltersView.MediaFilterData) filtersView.usersFilters.get(i));
    }

    public void lambda$runAnimation$4(int i, float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i == 1) {
            this.listView.setTranslationX(f * fFloatValue);
            this.listView.setAlpha(1.0f - fFloatValue);
            this.listView.invalidate();
            this.backgroundListView.setAlpha(fFloatValue);
            float f2 = (fFloatValue * 0.05f) + 0.95f;
            this.backgroundListView.setScaleX(f2);
            this.backgroundListView.setScaleY(f2);
            return;
        }
        this.backgroundListView.setTranslationX(f * fFloatValue);
        this.backgroundListView.setAlpha(Math.max(0.0f, 1.0f - fFloatValue));
        this.backgroundListView.invalidate();
        this.listView.setAlpha(fFloatValue);
        float f3 = (fFloatValue * 0.05f) + 0.95f;
        this.listView.setScaleX(f3);
        this.listView.setScaleY(f3);
        this.backgroundListView.invalidate();
    }

    public void lambda$sendSelectedItems$5(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, Long l) {
        this.sendPressed = true;
        this.delegate.didSelectFiles(arrayList, str, arrayList2, arrayList3, z, i, 0, j, z2, l.longValue());
        this.parentAlert.dismiss(true);
    }

    public void lambda$sendSelectedPhotos$6(ArrayList arrayList, boolean z, int i, Long l) {
        this.delegate.didSelectPhotos(arrayList, z, i, 0, l.longValue());
    }

    public int lambda$sortFileItems$8(ListItem listItem, ListItem listItem2) {
        File file = listItem.file;
        if (file == null) {
            return -1;
        }
        if (listItem2.file == null) {
            return 1;
        }
        boolean zIsDirectory = file.isDirectory();
        if (zIsDirectory != listItem2.file.isDirectory()) {
            return zIsDirectory ? -1 : 1;
        }
        if (zIsDirectory || this.sortByName) {
            return listItem.file.getName().compareToIgnoreCase(listItem2.file.getName());
        }
        long jLastModified = listItem.file.lastModified();
        long jLastModified2 = listItem2.file.lastModified();
        if (jLastModified == jLastModified2) {
            return 0;
        }
        return jLastModified > jLastModified2 ? -1 : 1;
    }

    public int lambda$sortRecentItems$7(ListItem listItem, ListItem listItem2) {
        if (this.sortByName) {
            return listItem.file.getName().compareToIgnoreCase(listItem2.file.getName());
        }
        long jLastModified = listItem.file.lastModified();
        long jLastModified2 = listItem2.file.lastModified();
        if (jLastModified == jLastModified2) {
            return 0;
        }
        return jLastModified > jLastModified2 ? -1 : 1;
    }

    public boolean listFiles(File file) {
        AnonymousClass1 anonymousClass1;
        File file2;
        this.hasFiles = false;
        if (!file.canRead()) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                showErrorBox(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.currentDir = file;
            this.listAdapter.items.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(this.listView);
            this.scrolling = true;
            this.listAdapter.notifyDataSetChanged();
            return true;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                showErrorBox(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.currentDir = file;
            this.listAdapter.items.clear();
            File fileCheckDirectory = FileLoader.checkDirectory(6);
            int i = 0;
            while (true) {
                anonymousClass1 = null;
                if (i >= fileArrListFiles.length) {
                    break;
                }
                File file3 = fileArrListFiles[i];
                if (file3.getName().indexOf(46) != 0 && !file3.equals(fileCheckDirectory)) {
                    ListItem listItem = new ListItem(anonymousClass1);
                    listItem.title = file3.getName();
                    listItem.file = file3;
                    if (file3.isDirectory()) {
                        listItem.icon = R.drawable.files_folder;
                        listItem.subtitle = LocaleController.getString(R.string.Folder);
                    } else {
                        this.hasFiles = true;
                        String name = file3.getName();
                        String[] strArrSplit = name.split("\\.");
                        listItem.ext = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
                        listItem.subtitle = AndroidUtilities.formatFileSize(file3.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            listItem.thumb = file3.getAbsolutePath();
                        }
                    }
                    this.listAdapter.items.add(listItem);
                }
                i++;
            }
            ListItem listItem2 = new ListItem(anonymousClass1);
            listItem2.title = "..";
            if (this.listAdapter.history.size() <= 0 || (file2 = ((HistoryEntry) this.listAdapter.history.get(this.listAdapter.history.size() - 1)).dir) == null) {
                listItem2.subtitle = LocaleController.getString(R.string.Folder);
            } else {
                listItem2.subtitle = file2.toString();
            }
            listItem2.icon = R.drawable.files_folder;
            listItem2.file = null;
            this.listAdapter.items.add(0, listItem2);
            sortFileItems();
            updateSearchButton();
            AndroidUtilities.clearDrawableAnimation(this.listView);
            this.scrolling = true;
            int topForScroll = getTopForScroll();
            this.listAdapter.notifyDataSetChanged();
            this.layoutManager.scrollToPositionWithOffset(0, topForScroll);
            return true;
        } catch (Exception e) {
            showErrorBox(e.getLocalizedMessage());
            return false;
        }
    }

    public void listRoots() throws Throwable {
        BufferedReader bufferedReader;
        ChatAttachAlert chatAttachAlert;
        int iLastIndexOf;
        BufferedReader bufferedReader2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        this.currentDir = null;
        this.hasFiles = false;
        this.listAdapter.items.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            ListItem listItem = new ListItem(objArr == true ? 1 : 0);
            if (Environment.isExternalStorageRemovable()) {
                listItem.title = LocaleController.getString(R.string.SdCard);
                listItem.icon = R.drawable.files_internal;
                listItem.subtitle = LocaleController.getString(R.string.ExternalFolderInfo);
            } else {
                listItem.title = LocaleController.getString(R.string.InternalStorage);
                listItem.icon = R.drawable.files_storage;
                listItem.subtitle = LocaleController.getString(R.string.InternalFolderInfo);
            }
            listItem.file = Environment.getExternalStorageDirectory();
            this.listAdapter.items.add(listItem);
            hashSet.add(path);
        }
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.contains("vfat") || line.contains("/mnt")) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d(line);
                                }
                                StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
                                stringTokenizer.nextToken();
                                String strNextToken = stringTokenizer.nextToken();
                                if (!hashSet.contains(strNextToken) && line.contains("/dev/block/vold") && !line.contains("/mnt/secure") && !line.contains("/mnt/asec") && !line.contains("/mnt/obb") && !line.contains("/dev/mapper") && !line.contains("tmpfs")) {
                                    if (!new File(strNextToken).isDirectory() && (iLastIndexOf = strNextToken.lastIndexOf(47)) != -1) {
                                        String str = "/storage/" + strNextToken.substring(iLastIndexOf + 1);
                                        if (new File(str).isDirectory()) {
                                            strNextToken = str;
                                        }
                                    }
                                    hashSet.add(strNextToken);
                                    try {
                                        ListItem listItem2 = new ListItem(objArr5 == true ? 1 : 0);
                                        if (strNextToken.toLowerCase().contains("sd")) {
                                            listItem2.title = LocaleController.getString(R.string.SdCard);
                                        } else {
                                            listItem2.title = LocaleController.getString(R.string.ExternalStorage);
                                        }
                                        listItem2.subtitle = LocaleController.getString(R.string.ExternalFolderInfo);
                                        listItem2.icon = R.drawable.files_internal;
                                        listItem2.file = new File(strNextToken);
                                        this.listAdapter.items.add(listItem2);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        try {
                            FileLog.e(e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                }
                bufferedReader.close();
            } catch (Exception e4) {
                FileLog.e(e4);
            }
        } catch (Exception e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = bufferedReader2;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        try {
            File file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                ListItem listItem3 = new ListItem(objArr4 == true ? 1 : 0);
                listItem3.title = "Telegram";
                listItem3.subtitle = LocaleController.getString(R.string.AppFolderInfo);
                listItem3.icon = R.drawable.files_folder;
                listItem3.file = file;
                this.listAdapter.items.add(listItem3);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (!this.isSoundPicker && ((chatAttachAlert = this.parentAlert) == null || !chatAttachAlert.isPollAttach)) {
            ListItem listItem4 = new ListItem(objArr3 == true ? 1 : 0);
            listItem4.title = LocaleController.getString(R.string.Gallery);
            listItem4.subtitle = LocaleController.getString(R.string.GalleryInfo);
            listItem4.icon = R.drawable.files_gallery;
            listItem4.file = null;
            this.listAdapter.items.add(listItem4);
        }
        if (this.allowMusic) {
            ListItem listItem5 = new ListItem(objArr2 == true ? 1 : 0);
            listItem5.title = LocaleController.getString(R.string.AttachMusic);
            listItem5.subtitle = LocaleController.getString(R.string.MusicInfo);
            listItem5.icon = R.drawable.files_music;
            listItem5.file = null;
            this.listAdapter.items.add(listItem5);
        }
        if (!this.listAdapter.recentItems.isEmpty()) {
            this.hasFiles = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.listView);
        this.scrolling = true;
        this.listAdapter.notifyDataSetChanged();
    }

    private boolean onItemClick(View view, Object obj) {
        boolean z;
        boolean z2 = false;
        if (obj instanceof ListItem) {
            ListItem listItem = (ListItem) obj;
            File file = listItem.file;
            if (file == null || file.isDirectory()) {
                return false;
            }
            String absolutePath = listItem.file.getAbsolutePath();
            if (this.selectedFiles.containsKey(absolutePath)) {
                this.selectedFiles.remove(absolutePath);
                this.selectedFilesOrder.remove(absolutePath);
                z = false;
            } else {
                if (!listItem.file.canRead()) {
                    showErrorBox(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.canSelectOnlyImageFiles && listItem.thumb == null) {
                    showErrorBox(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((listItem.file.length() > 2097152000 && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || listItem.file.length() > 4194304000L) {
                    ChatAttachAlert chatAttachAlert = this.parentAlert;
                    LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(6, chatAttachAlert.baseFragment, chatAttachAlert.getContainer().getContext(), UserConfig.selectedAccount, null);
                    limitReachedBottomSheet.setVeryLargeFile(true);
                    limitReachedBottomSheet.show();
                    return false;
                }
                if (this.maxSelectedFiles >= 0) {
                    int size = this.selectedFiles.size();
                    int i = this.maxSelectedFiles;
                    if (size >= i) {
                        showErrorBox(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i, new Object[0])));
                        return false;
                    }
                }
                if ((this.isSoundPicker && !isRingtone(listItem.file)) || listItem.file.length() == 0) {
                    return false;
                }
                boolean z3 = this.parentAlert.storyMediaPicker;
                this.selectedFiles.put(absolutePath, listItem);
                this.selectedFilesOrder.add(absolutePath);
                z = true;
            }
            this.scrolling = false;
            z2 = z;
        } else {
            if (!(obj instanceof MessageObject)) {
                return false;
            }
            MessageObject messageObject = (MessageObject) obj;
            FilteredSearchView.MessageHashId messageHashId = new FilteredSearchView.MessageHashId(messageObject.getId(), messageObject.getDialogId());
            if (this.selectedMessages.containsKey(messageHashId)) {
                this.selectedMessages.remove(messageHashId);
            } else {
                if (this.selectedMessages.size() >= 100) {
                    return false;
                }
                this.selectedMessages.put(messageHashId, messageObject);
                z2 = true;
            }
        }
        if (!this.parentAlert.isPollAttach) {
            if (view instanceof SharedDocumentCell) {
                ((SharedDocumentCell) view).setChecked(z2, true);
            }
            this.parentAlert.updateCountButton(z2 ? 1 : 2);
            return true;
        }
        if ((!this.selectedFiles.isEmpty() || !this.selectedMessages.isEmpty()) && this.delegate != null && !this.sendPressed) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            Iterator<FilteredSearchView.MessageHashId> it = this.selectedMessages.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(this.selectedMessages.get(it.next()));
            }
            this.delegate.didSelectFiles(new ArrayList<>(this.selectedFilesOrder), null, null, arrayList, false, 0, 0, 0L, false, 0L);
        }
        return true;
    }

    private void prepareAnimation() {
        View viewFindViewByPosition;
        this.backgroundListAdapter.history.clear();
        this.backgroundListAdapter.history.addAll(this.listAdapter.history);
        this.backgroundListAdapter.items.clear();
        this.backgroundListAdapter.items.addAll(this.listAdapter.items);
        this.backgroundListAdapter.recentItems.clear();
        this.backgroundListAdapter.recentItems.addAll(this.listAdapter.recentItems);
        this.backgroundListAdapter.notifyDataSetChanged();
        this.backgroundListView.setVisibility(0);
        this.backgroundListView.setPadding(this.listView.getPaddingLeft(), this.listView.getPaddingTop(), this.listView.getPaddingRight(), this.listView.getPaddingBottom());
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || (viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        this.backgroundLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, viewFindViewByPosition.getTop() - this.backgroundListView.getPaddingTop());
    }

    private void runAnimation(int i) {
        float fDp;
        int i2 = 1;
        ValueAnimator valueAnimator = this.listAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimationType = i;
        int i3 = 0;
        while (true) {
            if (i3 >= getChildCount()) {
                i3 = 0;
                break;
            } else if (getChildAt(i3) == this.listView) {
                break;
            } else {
                i3++;
            }
        }
        if (i == 1) {
            fDp = AndroidUtilities.dp(150.0f);
            this.backgroundListView.setAlpha(1.0f);
            this.backgroundListView.setScaleX(1.0f);
            this.backgroundListView.setScaleY(1.0f);
            this.backgroundListView.setTranslationX(0.0f);
            removeView(this.backgroundListView);
            addView(this.backgroundListView, i3);
            this.backgroundListView.setVisibility(0);
            this.listView.setTranslationX(fDp);
            this.listView.setAlpha(0.0f);
            this.listAnimation = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            fDp = AndroidUtilities.dp(150.0f);
            this.listView.setAlpha(0.0f);
            this.listView.setScaleX(0.95f);
            this.listView.setScaleY(0.95f);
            this.backgroundListView.setScaleX(1.0f);
            this.backgroundListView.setScaleY(1.0f);
            this.backgroundListView.setTranslationX(0.0f);
            this.backgroundListView.setAlpha(1.0f);
            removeView(this.backgroundListView);
            addView(this.backgroundListView, i3 + 1);
            this.backgroundListView.setVisibility(0);
            this.listAnimation = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.listAnimation.addUpdateListener(new MessagePreviewView$Page$$ExternalSyntheticLambda18(this, i, fDp, i2));
        this.listAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ChatAttachAlertDocumentLayout.this.backgroundListView.setVisibility(8);
                ChatAttachAlertDocumentLayout.this.currentAnimationType = 0;
                ChatAttachAlertDocumentLayout.this.listView.setAlpha(1.0f);
                ChatAttachAlertDocumentLayout.this.listView.setScaleX(1.0f);
                ChatAttachAlertDocumentLayout.this.listView.setScaleY(1.0f);
                ChatAttachAlertDocumentLayout.this.listView.setTranslationX(0.0f);
                ChatAttachAlertDocumentLayout.this.listView.invalidate();
            }
        });
        if (i == 1) {
            this.listAnimation.setDuration(220L);
        } else {
            this.listAnimation.setDuration(200L);
        }
        this.listAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.listAnimation.start();
    }

    public void sendSelectedPhotos(HashMap<Object, Object> map, ArrayList<Object> arrayList, boolean z, int i) {
        if (map.isEmpty() || this.delegate == null || this.sendPressed) {
            return;
        }
        this.sendPressed = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = map.get(arrayList.get(i2));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            }
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + arrayList2.size(), new PeerStoriesView$22$$ExternalSyntheticLambda0(this, arrayList2, z, i, 1));
    }

    private void showErrorBox(String str) {
        ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.AppName)).setMessage(str), null);
    }

    private void sortFileItems() {
        if (this.currentDir == null) {
            return;
        }
        Collections.sort(this.listAdapter.items, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda8(this, 0));
    }

    private void sortRecentItems() {
        Collections.sort(this.listAdapter.recentItems, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda8(this, 1));
    }

    public void updateEmptyView() {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        boolean z = true;
        if (adapter != searchAdapter ? this.listAdapter.getItemCount() != 1 : !searchAdapter.searchResult.isEmpty() || !this.searchAdapter.sections.isEmpty()) {
            z = false;
        }
        this.emptyView.setVisibility(z ? 0 : 8);
        updateEmptyViewPosition();
    }

    public void updateEmptyViewPosition() {
        View childAt;
        if (this.emptyView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            float translationY = this.emptyView.getTranslationY();
            this.additionalTranslationY = (childAt.getTop() + (this.emptyView.getMeasuredHeight() - getMeasuredHeight())) / 2;
            this.emptyView.setTranslationY(translationY);
        }
    }

    public void updateSearchButton() {
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem == null || actionBarMenuItem.isSearchFieldVisible()) {
            return;
        }
        this.searchItem.setVisibility((this.hasFiles || this.listAdapter.history.isEmpty()) ? 0 : 8);
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int y = ((((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(8.0f);
        if (y > 0 && holder != null && holder.getAdapterPosition() == 0) {
            i = y;
        }
        if (y < 0 || holder == null || holder.getAdapterPosition() != 0) {
            y = i;
        }
        return AndroidUtilities.dp(13.0f) + y;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return this.selectedMessages.size() + this.selectedFiles.size();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.searchItem.getSearchField(), 16777216, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 8192, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, 16384, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, null, null, -1, null, Theme.key_files_folderIcon));
        arrayList.add(new ThemeDescription(this.listView, 40, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, null, null, -1, null, Theme.key_files_folderIconBackground));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, null, null, -1, null, Theme.key_files_iconText));
        return arrayList;
    }

    public boolean isRingtone(File file) {
        int i;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !RingtoneDataStore.ringtoneSupportedMimeType.contains(mimeTypeFromExtension)) {
            BulletinFactory.of(this.parentAlert.getContainer(), null).createErrorBulletinSubtitle(LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat), null).show();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            BulletinFactory.of(this.parentAlert.getContainer(), null).createErrorBulletinSubtitle(LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).show();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i = Integer.MAX_VALUE;
        }
        if (i <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
            return true;
        }
        BulletinFactory.of(this.parentAlert.getContainer(), null).createErrorBulletinSubtitle(LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).show();
        return false;
    }

    public void loadRecentFiles() {
        try {
            if (!this.isSoundPicker) {
                checkDirectory(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                sortRecentItems();
                return;
            }
            try {
                Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                while (cursorQuery.moveToNext()) {
                    try {
                        File file = new File(cursorQuery.getString(1));
                        long j = cursorQuery.getLong(2);
                        long j2 = cursorQuery.getLong(3);
                        String string = cursorQuery.getString(4);
                        if (j <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000 && j2 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                            ListItem listItem = new ListItem(null);
                            listItem.title = file.getName();
                            listItem.file = file;
                            String name = file.getName();
                            String[] strArrSplit = name.split("\\.");
                            listItem.ext = strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "?";
                            listItem.subtitle = AndroidUtilities.formatFileSize(file.length());
                            String lowerCase = name.toLowerCase();
                            if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                listItem.thumb = file.getAbsolutePath();
                            }
                            this.listAdapter.recentItems.add(listItem);
                        }
                    } catch (Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                cursorQuery.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    @Override
    public boolean onBackPressed() {
        if (canClosePicker()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override
    public void onDestroy() {
        try {
            if (this.receiverRegistered) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.receiver);
                this.receiverRegistered = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.parentAlert.actionBar.closeSearchField();
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        actionBarMenuCreateMenu.removeView(this.sortItem);
        actionBarMenuCreateMenu.removeView(this.searchItem);
    }

    @Override
    public void onHide() {
        this.sortItem.setVisibility(8);
        this.searchItem.setVisibility(8);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition();
    }

    @Override
    public void onMenuItemClick(int i) {
        if (i == 6) {
            SharedConfig.toggleSortFilesByName();
            this.sortByName = SharedConfig.sortFilesByName;
            sortRecentItems();
            sortFileItems();
            this.listAdapter.notifyDataSetChanged();
            this.sortItem.setIcon(this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        if (this.parentAlert.actionBar.isSearchFieldVisible() || this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(56.0f);
            this.parentAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i3 = (i2 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                } else {
                    i3 = (i2 / 5) * 2;
                }
            }
            iDp = i3 - AndroidUtilities.dp(1.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            this.parentAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp + AndroidUtilities.statusBarHeight, 0, this.listPaddingBottom);
        ((FrameLayout.LayoutParams) this.filtersView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        SearchAdapter searchAdapter = this.searchAdapter;
        if (searchAdapter != null) {
            searchAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) throws Throwable {
        this.selectedFiles.clear();
        this.selectedMessages.clear();
        this.searchAdapter.currentSearchFilters.clear();
        this.selectedFilesOrder.clear();
        this.listAdapter.history.clear();
        listRoots();
        updateSearchButton();
        updateEmptyView();
        this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.SelectFile));
        this.sortItem.setVisibility(0);
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public boolean sendSelectedItems(final boolean z, final int i, int i2, final long j, final boolean z2) {
        if ((this.selectedFiles.size() == 0 && this.selectedMessages.size() == 0) || this.delegate == null || this.sendPressed) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<FilteredSearchView.MessageHashId> it = this.selectedMessages.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.selectedMessages.get(it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.selectedFilesOrder);
        CharSequence[] charSequenceArr = {this.parentAlert.getCommentView().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.parentAlert.currentAccount).getEntities(charSequenceArr, true);
        final String string = charSequenceArr[0].toString();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        return AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), this.parentAlert.getAdditionalMessagesCount() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(string) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = arrayList;
                int i3 = i;
                long j2 = j;
                chatAttachAlertDocumentLayout.lambda$sendSelectedItems$5(arrayList3, string, entities, arrayList4, z, i3, j2, z2, (Long) obj);
            }
        });
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.canSelectOnlyImageFiles = z;
    }

    public void setDelegate(DocumentSelectActivityDelegate documentSelectActivityDelegate) {
        this.delegate = documentSelectActivityDelegate;
    }

    public void setMaxSelectedFiles(int i) {
        this.maxSelectedFiles = i;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    public static class ListItem {
        public String ext;
        public File file;
        public int icon;
        public String subtitle;
        public String thumb;
        public String title;

        private ListItem() {
            this.subtitle = "";
            this.ext = "";
        }

        public ListItem(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public interface DocumentSelectActivityDelegate {
        void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<TLRPC.MessageEntity> arrayList2, ArrayList<MessageObject> arrayList3, boolean z, int i, int i2, long j, boolean z2, long j2);

        void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i, int i2, long j);

        void startDocumentSelectActivity();

        void startMusicSelectActivity();

        public abstract class CC {
            public static void $default$startDocumentSelectActivity(DocumentSelectActivityDelegate documentSelectActivityDelegate) {
            }

            public static void $default$startMusicSelectActivity(DocumentSelectActivityDelegate documentSelectActivityDelegate) {
            }

            public static void $default$didSelectPhotos(DocumentSelectActivityDelegate documentSelectActivityDelegate, ArrayList arrayList, boolean z, int i, int i2, long j) {
            }
        }
    }
}
