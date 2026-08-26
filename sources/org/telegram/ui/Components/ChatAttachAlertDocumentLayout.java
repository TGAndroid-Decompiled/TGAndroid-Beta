package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipActivityHandler;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline1;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda25;

public final class ChatAttachAlertDocumentLayout extends ChatAttachAlert.AttachAlertLayout {
    public static final int $r8$clinit = 0;
    public float additionalTranslationY;
    public final boolean allowMusic;
    public final FillLastLinearLayoutManager backgroundLayoutManager;
    public final ListAdapter backgroundListAdapter;
    public final AnonymousClass4 backgroundListView;
    public boolean canSelectOnlyImageFiles;
    public int currentAnimationType;
    public File currentDir;
    public DocumentSelectActivityDelegate delegate;
    public final AnonymousClass3 emptyView;
    public final FiltersView filtersView;
    public AnimatorSet filtersViewAnimator;
    public boolean hasFiles;
    public boolean isSoundPicker;
    public final ChatAttachAlertPollLayout.AnonymousClass4 layoutManager;
    public final ListAdapter listAdapter;
    public ValueAnimator listAnimation;
    public final AnonymousClass4 listView;
    public final FlickerLoadingView loadingView;
    public int maxSelectedFiles;
    public final PipActivityHandler.AnonymousClass1 receiver;
    public boolean receiverRegistered;
    public boolean scrolling;
    public final SearchAdapter searchAdapter;
    public final ActionBarMenuItem searchItem;
    public boolean searching;
    public final HashMap selectedFiles;
    public final ArrayList selectedFilesOrder;
    public final HashMap selectedMessages;
    public boolean sendPressed;
    public boolean sortByName;
    public final ActionBarMenuItem sortItem;

    public final class AnonymousClass3 extends StickerEmptyView {
        public AnonymousClass3(Context context, FlickerLoadingView flickerLoadingView, Theme.ResourcesProvider resourcesProvider) {
            super(1, resourcesProvider, context, flickerLoadingView);
        }

        @Override
        public final float getTranslationY() {
            return super.getTranslationY() - ChatAttachAlertDocumentLayout.this.additionalTranslationY;
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f + ChatAttachAlertDocumentLayout.this.additionalTranslationY);
        }
    }

    public interface DocumentSelectActivityDelegate {
        void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2);

        void didSelectPhotos(long j, ArrayList arrayList, boolean z, int i);

        void startDocumentSelectActivity();

        void startMusicSelectActivity();
    }

    public final class HistoryEntry {
        public File dir;
        public String title;
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final ArrayList items = new ArrayList();
        public final ArrayList history = new ArrayList();
        public final ArrayList recentItems = new ArrayList();

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public final ListItem getItem(int i) {
            int iM;
            ArrayList arrayList = this.items;
            int size = arrayList.size();
            if (i < size) {
                return (ListItem) arrayList.get(i);
            }
            if (!this.history.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = this.recentItems;
            if (arrayList2.isEmpty() || i == size || i == size + 1 || (iM = zzki.m(2, i, arrayList)) >= arrayList2.size()) {
                return null;
            }
            return (ListItem) arrayList2.get(iM);
        }

        @Override
        public final int getItemCount() {
            int size = this.items.size();
            if (this.history.isEmpty()) {
                ArrayList arrayList = this.recentItems;
                if (!arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
            }
            return size + 1;
        }

        @Override
        public final int getItemViewType(int i) {
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
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 1;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            ChatAttachAlertDocumentLayout.this.updateEmptyView$6();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                if (chatAttachAlertDocumentLayout.sortByName) {
                    headerCell.setText(LocaleController.getString(R.string.RecentFilesAZ));
                    return;
                } else {
                    headerCell.setText(LocaleController.getString(R.string.RecentFiles));
                    return;
                }
            }
            if (i2 != 1) {
                return;
            }
            ListItem item = getItem(i);
            SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
            int i3 = item.icon;
            if (i3 != 0) {
                sharedDocumentCell.setTextAndValueAndTypeAndThumb(i != this.items.size() - 1, item.title, i3, item.subtitle, null, null);
            } else {
                sharedDocumentCell.setTextAndValueAndTypeAndThumb(false, item.title, 0, item.subtitle, item.ext.toUpperCase().substring(0, Math.min(item.ext.length(), 4)), item.thumb);
            }
            File file = item.file;
            if (file != null) {
                sharedDocumentCell.setChecked(chatAttachAlertDocumentLayout.selectedFiles.containsKey(file.toString()), !chatAttachAlertDocumentLayout.scrolling);
            } else {
                sharedDocumentCell.setChecked(false, !chatAttachAlertDocumentLayout.scrolling);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            View shadowSectionCell;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            Context context = this.mContext;
            if (i != 0) {
                if (i == 1) {
                    headerCell = new SharedDocumentCell(context, 1, chatAttachAlertDocumentLayout.resourcesProvider);
                } else if (i != 2) {
                    shadowSectionCell = new View(context);
                    shadowSectionCell.setTag(-33024);
                } else {
                    shadowSectionCell = new ShadowSectionCell(context, (Object) null);
                }
                return new RecyclerListView.Holder(shadowSectionCell);
            }
            headerCell = new HeaderCell(context, chatAttachAlertDocumentLayout.resourcesProvider);
            shadowSectionCell = headerCell;
            return new RecyclerListView.Holder(shadowSectionCell);
        }
    }

    public final class ListItem {
        public File file;
        public int icon;
        public String thumb;
        public String title;
        public String subtitle = "";
        public String ext = "";
    }

    public final class SearchAdapter extends RecyclerListView.SectionsAdapter {
        public String currentDataQuery;
        public long currentSearchDialogId;
        public FiltersView.MediaFilterData currentSearchFilter;
        public long currentSearchMaxDate;
        public long currentSearchMinDate;
        public boolean endReached;
        public boolean isLoading;
        public String lastMessagesSearchString;
        public String lastSearchFilterQueryString;
        public EmojiView$2$$ExternalSyntheticLambda1 localSearchRunnable;
        public final Context mContext;
        public int nextSearchRate;
        public int requestIndex;
        public ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda0 searchRunnable;
        public ArrayList searchResult = new ArrayList();
        public final FilteredSearchView.MessageHashId messageHashIdTmp = new FilteredSearchView.MessageHashId(0, 0);
        public final ArrayList localTipChats = new ArrayList();
        public final ArrayList localTipDates = new ArrayList();
        public final ArrayList messages = new ArrayList();
        public final SparseArray messagesById = new SparseArray();
        public final ArrayList sections = new ArrayList();
        public final HashMap sectionArrays = new HashMap();
        public final ArrayList currentSearchFilters = new ArrayList();
        public final AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
        public final BubbleActivity.AnonymousClass1 clearCurrentResultsRunnable = new BubbleActivity.AnonymousClass1(this, 13);

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getCountForSection(int i) {
            if (i == 0) {
                return this.searchResult.size();
            }
            int i2 = i - 1;
            ArrayList arrayList = this.sections;
            int i3 = 1;
            if (i2 >= arrayList.size()) {
                return 1;
            }
            ArrayList arrayList2 = (ArrayList) this.sectionArrays.get(arrayList.get(i2));
            if (arrayList2 == null) {
                return 0;
            }
            int size = arrayList2.size();
            if (i2 == 0 && this.searchResult.isEmpty()) {
                i3 = 0;
            }
            return size + i3;
        }

        @Override
        public final Object getItem(int i, int i2) {
            ArrayList arrayList;
            if (i == 0) {
                if (i2 < this.searchResult.size()) {
                    return this.searchResult.get(i2);
                }
                return null;
            }
            int i3 = i - 1;
            ArrayList arrayList2 = this.sections;
            if (i3 >= arrayList2.size() || (arrayList = (ArrayList) this.sectionArrays.get(arrayList2.get(i3))) == null) {
                return null;
            }
            int i4 = i2 - ((i3 == 0 && this.searchResult.isEmpty()) ? 0 : 1);
            if (i4 < 0 || i4 >= arrayList.size()) {
                return null;
            }
            return arrayList.get(i4);
        }

        @Override
        public final int getItemViewType(int i, int i2) {
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
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            ArrayList arrayList = this.sections;
            if (arrayList.isEmpty()) {
                return 2;
            }
            return arrayList.size() + (!this.endReached ? 1 : 0) + 2;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            GraySectionCell graySectionCell = (GraySectionCell) view;
            if (graySectionCell == null) {
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                graySectionCell = new GraySectionCell(this.mContext, 16, chatAttachAlertDocumentLayout.resourcesProvider);
                graySectionCell.setBackgroundColor(Theme.getColor(Theme.key_graySection, chatAttachAlertDocumentLayout.resourcesProvider) & (-218103809));
            }
            if (i == 0 || (i == 1 && this.searchResult.isEmpty())) {
                graySectionCell.setAlpha(0.0f);
                return graySectionCell;
            }
            int i2 = i - 1;
            ArrayList arrayList = this.sections;
            if (i2 < arrayList.size()) {
                graySectionCell.setAlpha(1.0f);
                ArrayList arrayList2 = (ArrayList) this.sectionArrays.get((String) arrayList.get(i2));
                if (arrayList2 != null) {
                    graySectionCell.setText((i2 != 0 || this.searchResult.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
                }
            }
            return view;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            int i3 = viewHolder.mItemViewType;
            return i3 == 1 || i3 == 4;
        }

        @Override
        public final void notifyDataSetChanged() {
            update(false);
            ChatAttachAlertDocumentLayout.this.updateEmptyView$6();
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            int i3 = i2;
            int i4 = viewHolder.mItemViewType;
            if (i4 == 2 || i4 == 3) {
                return;
            }
            HashMap map = this.sectionArrays;
            ArrayList arrayList = this.sections;
            boolean z = false;
            View view = viewHolder.itemView;
            if (i4 == 0) {
                int i5 = i - 1;
                ArrayList arrayList2 = (ArrayList) map.get((String) arrayList.get(i5));
                if (arrayList2 == null) {
                    return;
                }
                ((GraySectionCell) view).setText((i5 != 0 || this.searchResult.isEmpty()) ? LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date) : LocaleController.getString(R.string.GlobalSearch));
                return;
            }
            if (i4 == 1 || i4 == 4) {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                if (i == 0) {
                    ListItem listItem = (ListItem) getItem(getSectionForPosition(i3), getPositionInSectionForPosition(i3));
                    int i6 = listItem.icon;
                    if (i6 != 0) {
                        sharedDocumentCell.setTextAndValueAndTypeAndThumb(false, listItem.title, i6, listItem.subtitle, null, null);
                    } else {
                        sharedDocumentCell.setTextAndValueAndTypeAndThumb(false, listItem.title, 0, listItem.subtitle, listItem.ext.toUpperCase().substring(0, Math.min(listItem.ext.length(), 4)), listItem.thumb);
                    }
                    File file = listItem.file;
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                    if (file != null) {
                        sharedDocumentCell.setChecked(chatAttachAlertDocumentLayout.selectedFiles.containsKey(file.toString()), !chatAttachAlertDocumentLayout.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !chatAttachAlertDocumentLayout.scrolling);
                        return;
                    }
                }
                int i7 = i - 1;
                if (i7 != 0 || !this.searchResult.isEmpty()) {
                    i3--;
                }
                ArrayList arrayList3 = (ArrayList) map.get((String) arrayList.get(i7));
                if (arrayList3 == null) {
                    return;
                }
                MessageObject messageObject = (MessageObject) arrayList3.get(i3);
                boolean z2 = sharedDocumentCell.getMessage() != null && sharedDocumentCell.getMessage().getId() == messageObject.getId();
                if (i3 != arrayList3.size() - 1 || (i7 == arrayList.size() - 1 && this.isLoading)) {
                    z = true;
                }
                sharedDocumentCell.setDocument(messageObject, z);
                sharedDocumentCell.getViewTreeObserver().addOnPreDrawListener(new FilteredSearchView.SharedLinksAdapter.AnonymousClass2(this, sharedDocumentCell, messageObject, z2, 1));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            View view;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            Context context = this.mContext;
            if (i != 0) {
                if (i == 1) {
                    SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(context, i == 1 ? 1 : 2, chatAttachAlertDocumentLayout.resourcesProvider);
                    sharedDocumentCell.setDrawDownloadIcon(false);
                    view = sharedDocumentCell;
                } else if (i == 2) {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, chatAttachAlertDocumentLayout.resourcesProvider);
                    flickerLoadingView.setViewType(3);
                    flickerLoadingView.setIsSingleCell(true);
                    graySectionCell = flickerLoadingView;
                } else if (i != 4) {
                    View view2 = new View(context);
                    view2.setTag(-33024);
                    view = view2;
                } else {
                    SharedDocumentCell sharedDocumentCell2 = new SharedDocumentCell(context, i == 1 ? 1 : 2, chatAttachAlertDocumentLayout.resourcesProvider);
                    sharedDocumentCell2.setDrawDownloadIcon(false);
                    view = sharedDocumentCell2;
                }
                return zzkl.m(view, view);
            }
            graySectionCell = new GraySectionCell(context, 16, chatAttachAlertDocumentLayout.resourcesProvider);
            view = graySectionCell;
            return zzkl.m(view, view);
        }

        public final void search(String str, boolean z) {
            long j;
            EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = this.localSearchRunnable;
            if (emojiView$2$$ExternalSyntheticLambda1 != null) {
                AndroidUtilities.cancelRunOnUIThread(emojiView$2$$ExternalSyntheticLambda1);
                this.localSearchRunnable = null;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            if (zIsEmpty) {
                if (!this.searchResult.isEmpty()) {
                    this.searchResult.clear();
                }
                RecyclerView.Adapter adapter = chatAttachAlertDocumentLayout.listView.getAdapter();
                ListAdapter listAdapter = chatAttachAlertDocumentLayout.listAdapter;
                if (adapter != listAdapter) {
                    chatAttachAlertDocumentLayout.listView.setAdapter(listAdapter);
                }
                notifyDataSetChanged();
            } else {
                EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda2 = new EmojiView$2$$ExternalSyntheticLambda1(4, this, str);
                this.localSearchRunnable = emojiView$2$$ExternalSyntheticLambda2;
                AndroidUtilities.runOnUIThread(emojiView$2$$ExternalSyntheticLambda2, 300L);
            }
            if (chatAttachAlertDocumentLayout.canSelectOnlyImageFiles || !chatAttachAlertDocumentLayout.listAdapter.history.isEmpty()) {
                return;
            }
            int i = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            while (true) {
                ArrayList arrayList = this.currentSearchFilters;
                if (i >= arrayList.size()) {
                    searchGlobal(j2, j3, j4, FiltersView.filters[2], str, z);
                    return;
                }
                FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) arrayList.get(i);
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
                i++;
            }
        }

        public final void searchGlobal(final long j, final long j2, final long j3, FiltersView.MediaFilterData mediaFilterData, final String str, boolean z) {
            Locale locale = Locale.ENGLISH;
            final String str2 = j + j2 + j3 + mediaFilterData.filterType + str;
            String str3 = this.lastSearchFilterQueryString;
            boolean z2 = str3 != null && str3.equals(str2);
            boolean z3 = !z2 && z;
            this.currentSearchFilter = mediaFilterData;
            this.currentSearchDialogId = j;
            this.currentSearchMinDate = j2;
            this.currentSearchMaxDate = j3;
            ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda0 chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda0 = this.searchRunnable;
            if (chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda0);
            }
            BubbleActivity.AnonymousClass1 anonymousClass1 = this.clearCurrentResultsRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            if (z2 && z) {
                return;
            }
            ArrayList arrayList = this.localTipDates;
            ArrayList arrayList2 = this.localTipChats;
            ArrayList arrayList3 = this.messages;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            if (z3) {
                arrayList3.clear();
                this.sections.clear();
                this.sectionArrays.clear();
                this.isLoading = true;
                chatAttachAlertDocumentLayout.emptyView.setVisibility(0);
                notifyDataSetChanged();
                this.requestIndex++;
                AnonymousClass4 anonymousClass4 = chatAttachAlertDocumentLayout.listView;
                if (anonymousClass4.getPinnedHeader() != null) {
                    anonymousClass4.getPinnedHeader().setAlpha(0.0f);
                }
                arrayList2.clear();
                arrayList.clear();
            }
            this.isLoading = true;
            notifyDataSetChanged();
            if (!z2) {
                anonymousClass1.run();
                chatAttachAlertDocumentLayout.emptyView.showProgress(true, !z);
            }
            if (TextUtils.isEmpty(str)) {
                arrayList.clear();
                arrayList2.clear();
                updateFiltersView(null, null, false);
                return;
            }
            final int i = this.requestIndex + 1;
            this.requestIndex = i;
            final AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
            final boolean z4 = z2;
            ?? r0 = new Runnable() {
                @Override
                public final void run() throws Throwable {
                    String str4;
                    int i2;
                    ArrayList<Object> arrayList4;
                    long j4;
                    TLObject tLObject;
                    final ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = this.f$0;
                    ArrayList arrayList5 = searchAdapter.messages;
                    final long j5 = j;
                    String str5 = str;
                    final AccountInstance accountInstance2 = accountInstance;
                    final long j6 = j2;
                    long j7 = j3;
                    final boolean z5 = z4;
                    if (j5 != 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.q = str5;
                        tL_messages_search.limit = 20;
                        tL_messages_search.filter = searchAdapter.currentSearchFilter.filter;
                        tL_messages_search.peer = accountInstance2.getMessagesController().getInputPeer(j5);
                        if (j6 > 0) {
                            tL_messages_search.min_date = (int) (j6 / 1000);
                        }
                        if (j7 > 0) {
                            tL_messages_search.max_date = (int) (j7 / 1000);
                        }
                        if (z5 && str5.equals(searchAdapter.lastMessagesSearchString) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        str4 = str5;
                        arrayList4 = null;
                        tLObject = tL_messages_search;
                    } else {
                        if (TextUtils.isEmpty(str5)) {
                            str4 = str5;
                            i2 = 20;
                            arrayList4 = null;
                        } else {
                            ArrayList<Object> arrayList6 = new ArrayList<>();
                            str4 = str5;
                            i2 = 20;
                            accountInstance2.getMessagesStorage().localSearch(0, str4, arrayList6, new ArrayList<>(), new ArrayList<>(), null, -1);
                            arrayList4 = arrayList6;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal.limit = i2;
                        tL_messages_searchGlobal.q = str4;
                        tL_messages_searchGlobal.filter = searchAdapter.currentSearchFilter.filter;
                        if (j6 > 0) {
                            tL_messages_searchGlobal.min_date = (int) (j6 / 1000);
                        }
                        if (j7 > 0) {
                            tL_messages_searchGlobal.max_date = (int) (j7 / 1000);
                        }
                        if (z5 && str4.equals(searchAdapter.lastMessagesSearchString) && !arrayList5.isEmpty()) {
                            MessageObject messageObject = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList5);
                            tL_messages_searchGlobal.offset_id = messageObject.getId();
                            tL_messages_searchGlobal.offset_rate = searchAdapter.nextSearchRate;
                            TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                            long j8 = peer.channel_id;
                            if (j8 != 0) {
                                j4 = -j8;
                            } else {
                                j8 = peer.chat_id;
                                if (j8 != 0) {
                                    j4 = -j8;
                                } else {
                                    j4 = peer.user_id;
                                }
                            }
                            tL_messages_searchGlobal.offset_peer = accountInstance2.getMessagesController().getInputPeer(j4);
                            tLObject = tL_messages_searchGlobal;
                        } else {
                            tL_messages_searchGlobal.offset_rate = 0;
                            tL_messages_searchGlobal.offset_id = 0;
                            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                            tLObject = tL_messages_searchGlobal;
                        }
                    }
                    searchAdapter.lastMessagesSearchString = str4;
                    searchAdapter.lastSearchFilterQueryString = str2;
                    final ArrayList arrayList7 = new ArrayList();
                    FiltersView.fillTipDates(searchAdapter.lastMessagesSearchString, arrayList7);
                    ConnectionsManager connectionsManager = accountInstance2.getConnectionsManager();
                    final int i3 = i;
                    final String str6 = str4;
                    final ArrayList<Object> arrayList8 = arrayList4;
                    connectionsManager.sendRequest(tLObject, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter2 = searchAdapter;
                            searchAdapter2.getClass();
                            ArrayList arrayList9 = new ArrayList();
                            AccountInstance accountInstance3 = accountInstance2;
                            String str7 = str6;
                            if (tL_error == null) {
                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                int size = messages_messages.messages.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    MessageObject messageObject2 = new MessageObject(accountInstance3.getCurrentAccount(), messages_messages.messages.get(i4), false, true);
                                    messageObject2.setQuery(str7);
                                    arrayList9.add(messageObject2);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda25(searchAdapter2, i3, tL_error, tLObject2, accountInstance3, z5, str7, arrayList9, j5, j6, arrayList8, arrayList7));
                        }
                    });
                }
            };
            this.searchRunnable = r0;
            AndroidUtilities.runOnUIThread(r0, (!z4 || arrayList3.isEmpty()) ? 350L : 0L);
            chatAttachAlertDocumentLayout.loadingView.setViewType(3);
        }

        public final void updateFiltersView(ArrayList arrayList, ArrayList arrayList2, boolean z) {
            boolean z2;
            int i = 0;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                ArrayList arrayList3 = this.currentSearchFilters;
                if (i >= arrayList3.size()) {
                    break;
                }
                if (((FiltersView.MediaFilterData) arrayList3.get(i)).isMedia()) {
                    z3 = true;
                } else if (((FiltersView.MediaFilterData) arrayList3.get(i)).filterType == 4) {
                    z4 = true;
                } else if (((FiltersView.MediaFilterData) arrayList3.get(i)).filterType == 6) {
                    z5 = true;
                }
                i++;
            }
            boolean z6 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            if ((z3 || z6 || !z) && z6) {
                if (arrayList == null || arrayList.isEmpty() || z4) {
                    arrayList = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty() || z5) {
                    arrayList2 = null;
                }
                if (arrayList == null && arrayList2 == null) {
                    z2 = false;
                } else {
                    chatAttachAlertDocumentLayout.filtersView.setUsersAndDates(arrayList, arrayList2, false);
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                chatAttachAlertDocumentLayout.filtersView.setUsersAndDates(null, null, false);
            }
            chatAttachAlertDocumentLayout.filtersView.setEnabled(z2);
            FiltersView filtersView = chatAttachAlertDocumentLayout.filtersView;
            if (!z2 || filtersView.getTag() == null) {
                if (z2 || filtersView.getTag() != null) {
                    filtersView.setTag(z2 ? 1 : null);
                    AnimatorSet animatorSet = chatAttachAlertDocumentLayout.filtersViewAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z2) {
                        filtersView.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    chatAttachAlertDocumentLayout.filtersViewAnimator = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(chatAttachAlertDocumentLayout.listView, (Property<AnonymousClass4, Float>) property, z2 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(filtersView, (Property<FiltersView, Float>) property, z2 ? 0.0f : -AndroidUtilities.dp(44.0f)), ObjectAnimator.ofFloat(chatAttachAlertDocumentLayout.loadingView, (Property<FlickerLoadingView, Float>) property, z2 ? AndroidUtilities.dp(44.0f) : 0.0f), ObjectAnimator.ofFloat(chatAttachAlertDocumentLayout.emptyView, (Property<AnonymousClass3, Float>) property, z2 ? AndroidUtilities.dp(44.0f) : 0.0f));
                    chatAttachAlertDocumentLayout.filtersViewAnimator.addListener(new CheckBox.AnonymousClass1(this, 17));
                    chatAttachAlertDocumentLayout.filtersViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    chatAttachAlertDocumentLayout.filtersViewAnimator.setDuration(180L);
                    chatAttachAlertDocumentLayout.filtersViewAnimator.start();
                }
            }
        }
    }

    public ChatAttachAlertDocumentLayout(int i, Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) throws Throwable {
        int i2;
        IntentFilter intentFilter;
        super(context, resourcesProvider, chatAttachAlert);
        this.receiverRegistered = false;
        this.selectedFiles = new HashMap();
        this.selectedFilesOrder = new ArrayList();
        this.selectedMessages = new HashMap();
        this.maxSelectedFiles = -1;
        this.receiver = new PipActivityHandler.AnonymousClass1(this, 8);
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        this.allowMusic = i == 1;
        boolean z = i == 2;
        this.isSoundPicker = z;
        this.sortByName = SharedConfig.sortFilesByName;
        int i3 = 4;
        try {
            if (z) {
                try {
                    Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (cursorQuery.moveToNext()) {
                        try {
                            File file = new File(cursorQuery.getString(1));
                            long j = cursorQuery.getLong(2);
                            long j2 = cursorQuery.getLong(3);
                            String string = cursorQuery.getString(i3);
                            if (j <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000 && j2 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                ListItem listItem = new ListItem();
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
                            i3 = 4;
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
                            this.searching = false;
                            if (!this.receiverRegistered) {
                                this.receiverRegistered = true;
                                intentFilter = new IntentFilter();
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
                            ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
                            actionBarMenuItemAddItem.setIsSearchField$1();
                            actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 6);
                            this.searchItem = actionBarMenuItemAddItem;
                            int i4 = R.string.Search;
                            actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(i4));
                            actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(i4));
                            EditTextBoldCursor searchField = actionBarMenuItemAddItem.getSearchField();
                            int i5 = Theme.key_dialogTextBlack;
                            searchField.setTextColor(Theme.getColor(i5, this.resourcesProvider));
                            searchField.setCursorColor(Theme.getColor(i5, this.resourcesProvider));
                            searchField.setHintTextColor(Theme.getColor(Theme.key_chat_messagePanelHint, this.resourcesProvider));
                            if (this.sortByName) {
                                i2 = R.drawable.msg_contacts_time;
                            } else {
                                i2 = R.drawable.msg_contacts_name;
                            }
                            ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(6, i2);
                            this.sortItem = actionBarMenuItemAddItem2;
                            actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
                            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
                            this.loadingView = flickerLoadingView;
                            addView(flickerLoadingView);
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, flickerLoadingView, resourcesProvider);
                            this.emptyView = anonymousClass3;
                            addView(anonymousClass3, LayoutHelper.createFrame(-1.0f, -1));
                            anonymousClass3.setVisibility(8);
                            anonymousClass3.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(13));
                            ?? r6 = new RecyclerListView(this, context, resourcesProvider, 0) {
                                public final int $r8$classId;
                                public final Paint paint;
                                public final ChatAttachAlertDocumentLayout this$0;

                                {
                                    super(context, resourcesProvider);
                                    this.$r8$classId = i;
                                    switch (i) {
                                        case 1:
                                            this.this$0 = this;
                                            super(context, resourcesProvider);
                                            this.paint = new Paint();
                                            break;
                                        default:
                                            this.this$0 = this;
                                            this.paint = new Paint();
                                            break;
                                    }
                                }

                                @Override
                                public final void dispatchDraw(Canvas canvas) {
                                    switch (this.$r8$classId) {
                                        case 0:
                                            if (this.this$0.currentAnimationType == 2 && getChildCount() > 0) {
                                                float y = 2.1474836E9f;
                                                for (int i6 = 0; i6 < getChildCount(); i6++) {
                                                    if (getChildAt(i6).getY() < y) {
                                                        y = getChildAt(i6).getY();
                                                    }
                                                }
                                                this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                                            }
                                            super.dispatchDraw(canvas);
                                            break;
                                        default:
                                            if (this.this$0.currentAnimationType == 1 && getChildCount() > 0) {
                                                float y2 = 2.1474836E9f;
                                                for (int i7 = 0; i7 < getChildCount(); i7++) {
                                                    if (getChildAt(i7).getY() < y2) {
                                                        y2 = getChildAt(i7).getY();
                                                    }
                                                }
                                                this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                                            }
                                            super.dispatchDraw(canvas);
                                            break;
                                    }
                                }

                                @Override
                                public boolean onTouchEvent(MotionEvent motionEvent) {
                                    switch (this.$r8$classId) {
                                        case 0:
                                            if (this.this$0.currentAnimationType != 0) {
                                                return false;
                                            }
                                            return super.onTouchEvent(motionEvent);
                                        default:
                                            return super.onTouchEvent(motionEvent);
                                    }
                                }
                            };
                            this.backgroundListView = r6;
                            r6.setSectionsType(2);
                            r6.setVerticalScrollBarEnabled(false);
                            FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(AndroidUtilities.dp(56.0f), 0, r6);
                            this.backgroundLayoutManager = fillLastLinearLayoutManager;
                            r6.setLayoutManager(fillLastLinearLayoutManager);
                            r6.setClipToPadding(false);
                            ListAdapter listAdapter2 = new ListAdapter(context);
                            this.backgroundListAdapter = listAdapter2;
                            r6.setAdapter(listAdapter2);
                            addView((View) r6, LayoutHelper.createFrame(-1.0f, -1));
                            r6.setVisibility(8);
                            ?? r7 = new RecyclerListView(this, context, resourcesProvider, 1) {
                                public final int $r8$classId;
                                public final Paint paint;
                                public final ChatAttachAlertDocumentLayout this$0;

                                {
                                    super(context, resourcesProvider);
                                    this.$r8$classId = i;
                                    switch (i) {
                                        case 1:
                                            this.this$0 = this;
                                            super(context, resourcesProvider);
                                            this.paint = new Paint();
                                            break;
                                        default:
                                            this.this$0 = this;
                                            this.paint = new Paint();
                                            break;
                                    }
                                }

                                @Override
                                public final void dispatchDraw(Canvas canvas) {
                                    switch (this.$r8$classId) {
                                        case 0:
                                            if (this.this$0.currentAnimationType == 2 && getChildCount() > 0) {
                                                float y = 2.1474836E9f;
                                                for (int i6 = 0; i6 < getChildCount(); i6++) {
                                                    if (getChildAt(i6).getY() < y) {
                                                        y = getChildAt(i6).getY();
                                                    }
                                                }
                                                this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                                            }
                                            super.dispatchDraw(canvas);
                                            break;
                                        default:
                                            if (this.this$0.currentAnimationType == 1 && getChildCount() > 0) {
                                                float y2 = 2.1474836E9f;
                                                for (int i7 = 0; i7 < getChildCount(); i7++) {
                                                    if (getChildAt(i7).getY() < y2) {
                                                        y2 = getChildAt(i7).getY();
                                                    }
                                                }
                                                this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                                            }
                                            super.dispatchDraw(canvas);
                                            break;
                                    }
                                }

                                @Override
                                public boolean onTouchEvent(MotionEvent motionEvent) {
                                    switch (this.$r8$classId) {
                                        case 0:
                                            if (this.this$0.currentAnimationType != 0) {
                                                return false;
                                            }
                                            return super.onTouchEvent(motionEvent);
                                        default:
                                            return super.onTouchEvent(motionEvent);
                                    }
                                }
                            };
                            this.listView = r7;
                            r7.setSections();
                            this.iBlur3Capture = r7;
                            this.iBlur3CaptureView = r7;
                            this.occupyStatusBar = true;
                            this.occupyNavigationBar = true;
                            r7.setSectionsType(2);
                            r7.setVerticalScrollBarEnabled(false);
                            ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = new ChatAttachAlertPollLayout.AnonymousClass4(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, r7, 3);
                            this.layoutManager = anonymousClass4;
                            r7.setLayoutManager(anonymousClass4);
                            r7.setClipToPadding(false);
                            r7.setAdapter(this.listAdapter);
                            addView((View) r7, LayoutHelper.createFrame(-1.0f, -1));
                            this.searchAdapter = new SearchAdapter(context);
                            r7.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 18));
                            final int i6 = 0;
                            r7.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
                                public final ChatAttachAlertDocumentLayout f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onItemClick(int i7, View view) throws Throwable {
                                    switch (i6) {
                                        case 0:
                                            this.f$0.lambda$new$1$11(i7, view);
                                            break;
                                        default:
                                            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                                            FiltersView filtersView = chatAttachAlertDocumentLayout.filtersView;
                                            filtersView.cancelClickRunnables(true);
                                            ArrayList arrayList = filtersView.usersFilters;
                                            FiltersView.MediaFilterData mediaFilterData = arrayList.isEmpty() ? FiltersView.filters[i7] : (FiltersView.MediaFilterData) arrayList.get(i7);
                                            ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = chatAttachAlertDocumentLayout.searchAdapter;
                                            boolean zIsEmpty = searchAdapter.currentSearchFilters.isEmpty();
                                            ArrayList arrayList2 = searchAdapter.currentSearchFilters;
                                            if (!zIsEmpty) {
                                                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                                    FiltersView.MediaFilterData mediaFilterData2 = (FiltersView.MediaFilterData) arrayList2.get(i8);
                                                    if (mediaFilterData.filterType != mediaFilterData2.filterType) {
                                                        if (mediaFilterData.isMedia() && mediaFilterData2.isMedia()) {
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList2.add(mediaFilterData);
                                            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = ChatAttachAlertDocumentLayout.this;
                                            chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFilter(mediaFilterData);
                                            chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFieldText("");
                                            searchAdapter.updateFiltersView(null, null, true);
                                            break;
                                    }
                                }
                            });
                            r7.setOnItemLongClickListener(new ColorPicker$$ExternalSyntheticLambda6(this, 14));
                            FiltersView filtersView = new FiltersView(context, resourcesProvider);
                            this.filtersView = filtersView;
                            final int i7 = 1;
                            filtersView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
                                public final ChatAttachAlertDocumentLayout f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onItemClick(int i8, View view) throws Throwable {
                                    switch (i7) {
                                        case 0:
                                            this.f$0.lambda$new$1$11(i8, view);
                                            break;
                                        default:
                                            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                                            FiltersView filtersView2 = chatAttachAlertDocumentLayout.filtersView;
                                            filtersView2.cancelClickRunnables(true);
                                            ArrayList arrayList = filtersView2.usersFilters;
                                            FiltersView.MediaFilterData mediaFilterData = arrayList.isEmpty() ? FiltersView.filters[i8] : (FiltersView.MediaFilterData) arrayList.get(i8);
                                            ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = chatAttachAlertDocumentLayout.searchAdapter;
                                            boolean zIsEmpty = searchAdapter.currentSearchFilters.isEmpty();
                                            ArrayList arrayList2 = searchAdapter.currentSearchFilters;
                                            if (!zIsEmpty) {
                                                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                                    FiltersView.MediaFilterData mediaFilterData2 = (FiltersView.MediaFilterData) arrayList2.get(i9);
                                                    if (mediaFilterData.filterType != mediaFilterData2.filterType) {
                                                        if (mediaFilterData.isMedia() && mediaFilterData2.isMedia()) {
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList2.add(mediaFilterData);
                                            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = ChatAttachAlertDocumentLayout.this;
                                            chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFilter(mediaFilterData);
                                            chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFieldText("");
                                            searchAdapter.updateFiltersView(null, null, true);
                                            break;
                                    }
                                }
                            });
                            filtersView.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
                            addView(filtersView, LayoutHelper.createFrame(-1, 44, 48));
                            filtersView.setTranslationY(-AndroidUtilities.dp(44.0f));
                            filtersView.setVisibility(4);
                            listRoots();
                            updateSearchButton();
                            updateEmptyView$6();
                        }
                    }
                    cursorQuery.close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                checkDirectory(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort(listAdapter.recentItems, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3(this, 1));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.searching = false;
        if (!this.receiverRegistered) {
            this.receiverRegistered = true;
            intentFilter = new IntentFilter();
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
        ActionBarMenu actionBarMenuCreateMenu2 = this.parentAlert.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemAddItem3 = actionBarMenuCreateMenu2.addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem3.setIsSearchField$1();
        actionBarMenuItemAddItem3.listener = new TopicsFragment.AnonymousClass3(this, 6);
        this.searchItem = actionBarMenuItemAddItem3;
        int i8 = R.string.Search;
        actionBarMenuItemAddItem3.setSearchFieldHint(LocaleController.getString(i8));
        actionBarMenuItemAddItem3.setContentDescription(LocaleController.getString(i8));
        EditTextBoldCursor searchField2 = actionBarMenuItemAddItem3.getSearchField();
        int i9 = Theme.key_dialogTextBlack;
        searchField2.setTextColor(Theme.getColor(i9, this.resourcesProvider));
        searchField2.setCursorColor(Theme.getColor(i9, this.resourcesProvider));
        searchField2.setHintTextColor(Theme.getColor(Theme.key_chat_messagePanelHint, this.resourcesProvider));
        if (this.sortByName) {
            i2 = R.drawable.msg_contacts_time;
        } else {
            i2 = R.drawable.msg_contacts_name;
        }
        ActionBarMenuItem actionBarMenuItemAddItem4 = actionBarMenuCreateMenu2.addItem(6, i2);
        this.sortItem = actionBarMenuItemAddItem4;
        actionBarMenuItemAddItem4.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(context, resourcesProvider);
        this.loadingView = flickerLoadingView2;
        addView(flickerLoadingView2);
        AnonymousClass3 anonymousClass5 = new AnonymousClass3(context, flickerLoadingView2, resourcesProvider);
        this.emptyView = anonymousClass5;
        addView(anonymousClass5, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass5.setVisibility(8);
        anonymousClass5.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(13));
        ?? r8 = new RecyclerListView(this, context, resourcesProvider, 0) {
            public final int $r8$classId;
            public final Paint paint;
            public final ChatAttachAlertDocumentLayout this$0;

            {
                super(context, resourcesProvider);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        super(context, resourcesProvider);
                        this.paint = new Paint();
                        break;
                    default:
                        this.this$0 = this;
                        this.paint = new Paint();
                        break;
                }
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        if (this.this$0.currentAnimationType == 2 && getChildCount() > 0) {
                            float y = 2.1474836E9f;
                            for (int i10 = 0; i10 < getChildCount(); i10++) {
                                if (getChildAt(i10).getY() < y) {
                                    y = getChildAt(i10).getY();
                                }
                            }
                            this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        }
                        super.dispatchDraw(canvas);
                        break;
                    default:
                        if (this.this$0.currentAnimationType == 1 && getChildCount() > 0) {
                            float y2 = 2.1474836E9f;
                            for (int i11 = 0; i11 < getChildCount(); i11++) {
                                if (getChildAt(i11).getY() < y2) {
                                    y2 = getChildAt(i11).getY();
                                }
                            }
                            this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        }
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (this.$r8$classId) {
                    case 0:
                        if (this.this$0.currentAnimationType != 0) {
                            return false;
                        }
                        return super.onTouchEvent(motionEvent);
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.backgroundListView = r8;
        r8.setSectionsType(2);
        r8.setVerticalScrollBarEnabled(false);
        FillLastLinearLayoutManager fillLastLinearLayoutManager2 = new FillLastLinearLayoutManager(AndroidUtilities.dp(56.0f), 0, r8);
        this.backgroundLayoutManager = fillLastLinearLayoutManager2;
        r8.setLayoutManager(fillLastLinearLayoutManager2);
        r8.setClipToPadding(false);
        ListAdapter listAdapter3 = new ListAdapter(context);
        this.backgroundListAdapter = listAdapter3;
        r8.setAdapter(listAdapter3);
        addView((View) r8, LayoutHelper.createFrame(-1.0f, -1));
        r8.setVisibility(8);
        ?? r9 = new RecyclerListView(this, context, resourcesProvider, 1) {
            public final int $r8$classId;
            public final Paint paint;
            public final ChatAttachAlertDocumentLayout this$0;

            {
                super(context, resourcesProvider);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        super(context, resourcesProvider);
                        this.paint = new Paint();
                        break;
                    default:
                        this.this$0 = this;
                        this.paint = new Paint();
                        break;
                }
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        if (this.this$0.currentAnimationType == 2 && getChildCount() > 0) {
                            float y = 2.1474836E9f;
                            for (int i10 = 0; i10 < getChildCount(); i10++) {
                                if (getChildAt(i10).getY() < y) {
                                    y = getChildAt(i10).getY();
                                }
                            }
                            this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        }
                        super.dispatchDraw(canvas);
                        break;
                    default:
                        if (this.this$0.currentAnimationType == 1 && getChildCount() > 0) {
                            float y2 = 2.1474836E9f;
                            for (int i11 = 0; i11 < getChildCount(); i11++) {
                                if (getChildAt(i11).getY() < y2) {
                                    y2 = getChildAt(i11).getY();
                                }
                            }
                            this.paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        }
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (this.$r8$classId) {
                    case 0:
                        if (this.this$0.currentAnimationType != 0) {
                            return false;
                        }
                        return super.onTouchEvent(motionEvent);
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.listView = r9;
        r9.setSections();
        this.iBlur3Capture = r9;
        this.iBlur3CaptureView = r9;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        r9.setSectionsType(2);
        r9.setVerticalScrollBarEnabled(false);
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass6 = new ChatAttachAlertPollLayout.AnonymousClass4(this, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, r9, 3);
        this.layoutManager = anonymousClass6;
        r9.setLayoutManager(anonymousClass6);
        r9.setClipToPadding(false);
        r9.setAdapter(this.listAdapter);
        addView((View) r9, LayoutHelper.createFrame(-1.0f, -1));
        this.searchAdapter = new SearchAdapter(context);
        r9.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 18));
        final int i10 = 0;
        r9.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ChatAttachAlertDocumentLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i11, View view) throws Throwable {
                switch (i10) {
                    case 0:
                        this.f$0.lambda$new$1$11(i11, view);
                        break;
                    default:
                        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                        FiltersView filtersView2 = chatAttachAlertDocumentLayout.filtersView;
                        filtersView2.cancelClickRunnables(true);
                        ArrayList arrayList = filtersView2.usersFilters;
                        FiltersView.MediaFilterData mediaFilterData = arrayList.isEmpty() ? FiltersView.filters[i11] : (FiltersView.MediaFilterData) arrayList.get(i11);
                        ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = chatAttachAlertDocumentLayout.searchAdapter;
                        boolean zIsEmpty = searchAdapter.currentSearchFilters.isEmpty();
                        ArrayList arrayList2 = searchAdapter.currentSearchFilters;
                        if (!zIsEmpty) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                FiltersView.MediaFilterData mediaFilterData2 = (FiltersView.MediaFilterData) arrayList2.get(i12);
                                if (mediaFilterData.filterType != mediaFilterData2.filterType) {
                                    if (mediaFilterData.isMedia() && mediaFilterData2.isMedia()) {
                                    }
                                }
                            }
                        }
                        arrayList2.add(mediaFilterData);
                        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = ChatAttachAlertDocumentLayout.this;
                        chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFilter(mediaFilterData);
                        chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFieldText("");
                        searchAdapter.updateFiltersView(null, null, true);
                        break;
                }
            }
        });
        r9.setOnItemLongClickListener(new ColorPicker$$ExternalSyntheticLambda6(this, 14));
        FiltersView filtersView2 = new FiltersView(context, resourcesProvider);
        this.filtersView = filtersView2;
        final int i11 = 1;
        filtersView2.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ChatAttachAlertDocumentLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i12, View view) throws Throwable {
                switch (i11) {
                    case 0:
                        this.f$0.lambda$new$1$11(i12, view);
                        break;
                    default:
                        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                        FiltersView filtersView3 = chatAttachAlertDocumentLayout.filtersView;
                        filtersView3.cancelClickRunnables(true);
                        ArrayList arrayList = filtersView3.usersFilters;
                        FiltersView.MediaFilterData mediaFilterData = arrayList.isEmpty() ? FiltersView.filters[i12] : (FiltersView.MediaFilterData) arrayList.get(i12);
                        ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = chatAttachAlertDocumentLayout.searchAdapter;
                        boolean zIsEmpty = searchAdapter.currentSearchFilters.isEmpty();
                        ArrayList arrayList2 = searchAdapter.currentSearchFilters;
                        if (!zIsEmpty) {
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                FiltersView.MediaFilterData mediaFilterData2 = (FiltersView.MediaFilterData) arrayList2.get(i13);
                                if (mediaFilterData.filterType != mediaFilterData2.filterType) {
                                    if (mediaFilterData.isMedia() && mediaFilterData2.isMedia()) {
                                    }
                                }
                            }
                        }
                        arrayList2.add(mediaFilterData);
                        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = ChatAttachAlertDocumentLayout.this;
                        chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFilter(mediaFilterData);
                        chatAttachAlertDocumentLayout2.parentAlert.actionBar.setSearchFieldText("");
                        searchAdapter.updateFiltersView(null, null, true);
                        break;
                }
            }
        });
        filtersView2.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        addView(filtersView2, LayoutHelper.createFrame(-1, 44, 48));
        filtersView2.setTranslationY(-AndroidUtilities.dp(44.0f));
        filtersView2.setVisibility(4);
        listRoots();
        updateSearchButton();
        updateEmptyView$6();
    }

    private int getTopForScroll() {
        AnonymousClass4 anonymousClass4 = this.listView;
        View childAt = anonymousClass4.getChildAt(0);
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = anonymousClass4.findContainingViewHolder(childAt);
        int i = -anonymousClass4.getPaddingTop();
        return (viewHolderFindContainingViewHolder == null || viewHolderFindContainingViewHolder.getAdapterPosition() != 0) ? i : childAt.getTop() + i;
    }

    public final void checkDirectory(File file) {
        File[] fileArrListFiles = file.listFiles();
        File fileCheckDirectory = FileLoader.checkDirectory(6);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    checkDirectory(file2);
                } else if (!file2.equals(fileCheckDirectory)) {
                    ListItem listItem = new ListItem();
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

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        AnonymousClass4 anonymousClass4 = this.listView;
        if (anonymousClass4.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = anonymousClass4.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass4.findContainingViewHolder(childAt);
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
        return getPaddingTop();
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

    public final boolean isRingtone(File file) {
        int i;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !RingtoneDataStore.ringtoneSupportedMimeType.contains(mimeTypeFromExtension)) {
            BottomSheet.ContainerView container = this.parentAlert.getContainer();
            String string = LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]);
            String string2 = LocaleController.getString(R.string.ErrorRingtoneInvalidFormat);
            Context context = container != null ? container.getContext() : null;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(context, null);
            twoLineLottieLayout.setAnimation(R.raw.chats_infotip, 32, 32, new String[0]);
            twoLineLottieLayout.titleTextView.setText(string);
            twoLineLottieLayout.subtitleTextView.setText(string2);
            Bulletin.make(container, twoLineLottieLayout, 1500).show();
            return false;
        }
        if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            BottomSheet.ContainerView container2 = this.parentAlert.getContainer();
            String string3 = LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]);
            String string4 = LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024));
            Context context2 = container2 != null ? container2.getContext() : null;
            if (context2 == null) {
                context2 = ApplicationLoader.applicationContext;
            }
            Bulletin.TwoLineLottieLayout twoLineLottieLayout2 = new Bulletin.TwoLineLottieLayout(context2, null);
            twoLineLottieLayout2.setAnimation(R.raw.chats_infotip, 32, 32, new String[0]);
            twoLineLottieLayout2.titleTextView.setText(string3);
            twoLineLottieLayout2.subtitleTextView.setText(string4);
            Bulletin.make(container2, twoLineLottieLayout2, 1500).show();
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
        BottomSheet.ContainerView container3 = this.parentAlert.getContainer();
        String string5 = LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]);
        String string6 = LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax));
        Context context3 = container3 != null ? container3.getContext() : null;
        if (context3 == null) {
            context3 = ApplicationLoader.applicationContext;
        }
        Bulletin.TwoLineLottieLayout twoLineLottieLayout3 = new Bulletin.TwoLineLottieLayout(context3, null);
        twoLineLottieLayout3.setAnimation(R.raw.chats_infotip, 32, 32, new String[0]);
        twoLineLottieLayout3.titleTextView.setText(string5);
        twoLineLottieLayout3.subtitleTextView.setText(string6);
        Bulletin.make(container3, twoLineLottieLayout3, 1500).show();
        return false;
    }

    public final void lambda$new$1$11(int i, View view) throws Throwable {
        Object item;
        int i2;
        AnonymousClass4 anonymousClass4 = this.listView;
        RecyclerView.Adapter adapter = anonymousClass4.getAdapter();
        ListAdapter listAdapter = this.listAdapter;
        if (adapter == listAdapter) {
            item = listAdapter.getItem(i);
        } else {
            SearchAdapter searchAdapter = this.searchAdapter;
            item = searchAdapter.getItem(searchAdapter.getSectionForPosition(i), searchAdapter.getPositionInSectionForPosition(i));
        }
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
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (file != null) {
            if (!file.isDirectory()) {
                onItemClick(view, listItem);
                return;
            }
            HistoryEntry historyEntry = new HistoryEntry();
            View childAt = anonymousClass4.getChildAt(0);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder = anonymousClass4.findContainingViewHolder(childAt);
            if (viewHolderFindContainingViewHolder != null) {
                viewHolderFindContainingViewHolder.getAdapterPosition();
                childAt.getTop();
                historyEntry.dir = this.currentDir;
                historyEntry.title = chatAttachAlert.actionBar.getTitle();
                prepareAnimation();
                listAdapter.history.add(historyEntry);
                if (!listFiles(file)) {
                    listAdapter.history.remove(historyEntry);
                    return;
                } else {
                    runAnimation(1);
                    chatAttachAlert.actionBar.setTitle(listItem.title);
                    return;
                }
            }
            return;
        }
        int i3 = listItem.icon;
        if (i3 == R.drawable.files_gallery) {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
            PhotoPickerActivity photoPickerActivity = new PhotoPickerActivity(0, MediaController.allMediaAlbumEntry, map, arrayList, 0, chatActivity != null, chatActivity, false);
            photoPickerActivity.isDocumentsPicker = true;
            photoPickerActivity.delegate = new ChatActivity.AnonymousClass117(this, map, arrayList);
            photoPickerActivity.setMaxSelectedPhotos(this.maxSelectedFiles, false);
            BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
            if (baseFragment2 != null) {
                baseFragment2.presentFragment(photoPickerActivity);
            } else {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    lastFragment.presentFragment(photoPickerActivity);
                }
            }
            chatAttachAlert.dismiss(true);
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
        HistoryEntry historyEntry2 = (HistoryEntry) DiffUtil.m(listAdapter.history);
        chatAttachAlert.actionBar.setTitle(historyEntry2.title);
        File file2 = historyEntry2.dir;
        if (file2 != null) {
            listFiles(file2);
        } else {
            listRoots();
        }
        updateSearchButton();
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass5 = this.layoutManager;
        anonymousClass5.scrollToPositionWithOffset(0, topForScroll, anonymousClass5.mShouldReverseLayout);
        runAnimation(2);
    }

    public final boolean listFiles(File file) {
        ArrayList arrayList;
        File file2;
        this.hasFiles = false;
        boolean zCanRead = file.canRead();
        AnonymousClass4 anonymousClass4 = this.listView;
        ListAdapter listAdapter = this.listAdapter;
        if (!zCanRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                showErrorBox$2(LocaleController.getString(R.string.AccessError));
                return false;
            }
            this.currentDir = file;
            listAdapter.items.clear();
            Environment.getExternalStorageState();
            AndroidUtilities.clearDrawableAnimation(anonymousClass4);
            this.scrolling = true;
            listAdapter.notifyDataSetChanged();
            return true;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                showErrorBox$2(LocaleController.getString(R.string.UnknownError));
                return false;
            }
            this.currentDir = file;
            listAdapter.items.clear();
            File fileCheckDirectory = FileLoader.checkDirectory(6);
            int i = 0;
            while (true) {
                int length = fileArrListFiles.length;
                arrayList = listAdapter.items;
                if (i >= length) {
                    break;
                }
                File file3 = fileArrListFiles[i];
                if (file3.getName().indexOf(46) != 0 && !file3.equals(fileCheckDirectory)) {
                    ListItem listItem = new ListItem();
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
                    arrayList.add(listItem);
                }
                i++;
            }
            ListItem listItem2 = new ListItem();
            listItem2.title = "..";
            ArrayList arrayList2 = listAdapter.history;
            if (arrayList2.size() <= 0 || (file2 = ((HistoryEntry) zziq.m(1, arrayList2)).dir) == null) {
                listItem2.subtitle = LocaleController.getString(R.string.Folder);
            } else {
                listItem2.subtitle = file2.toString();
            }
            listItem2.icon = R.drawable.files_folder;
            listItem2.file = null;
            arrayList.add(0, listItem2);
            if (this.currentDir != null) {
                Collections.sort(listAdapter.items, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3(this, 0));
            }
            updateSearchButton();
            AndroidUtilities.clearDrawableAnimation(anonymousClass4);
            this.scrolling = true;
            int topForScroll = getTopForScroll();
            listAdapter.notifyDataSetChanged();
            ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass5 = this.layoutManager;
            anonymousClass5.scrollToPositionWithOffset(0, topForScroll, anonymousClass5.mShouldReverseLayout);
            return true;
        } catch (Exception e) {
            showErrorBox$2(e.getLocalizedMessage());
            return false;
        }
    }

    public final void listRoots() throws Throwable {
        BufferedReader bufferedReader;
        ChatAttachAlert chatAttachAlert;
        int iLastIndexOf;
        BufferedReader bufferedReader2 = null;
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
            ListItem listItem = new ListItem();
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
                                        ListItem listItem2 = new ListItem();
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
                ListItem listItem3 = new ListItem();
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
            ListItem listItem4 = new ListItem();
            listItem4.title = LocaleController.getString(R.string.Gallery);
            listItem4.subtitle = LocaleController.getString(R.string.GalleryInfo);
            listItem4.icon = R.drawable.files_gallery;
            listItem4.file = null;
            this.listAdapter.items.add(listItem4);
        }
        if (this.allowMusic) {
            ListItem listItem5 = new ListItem();
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

    @Override
    public final int needsActionBar() {
        return 1;
    }

    @Override
    public final boolean onBackPressed() throws Throwable {
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter.history.size() <= 0) {
            return false;
        }
        prepareAnimation();
        HistoryEntry historyEntry = (HistoryEntry) DiffUtil.m(listAdapter.history);
        this.parentAlert.actionBar.setTitle(historyEntry.title);
        int topForScroll = getTopForScroll();
        File file = historyEntry.dir;
        if (file != null) {
            listFiles(file);
        } else {
            listRoots();
        }
        updateSearchButton();
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(0, topForScroll, anonymousClass4.mShouldReverseLayout);
        runAnimation(2);
        return true;
    }

    @Override
    public final void onDestroy() {
        try {
            if (this.receiverRegistered) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.receiver);
                this.receiverRegistered = false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.parentAlert.actionBar.closeSearchField(true);
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        actionBarMenuCreateMenu.removeView(this.sortItem);
        actionBarMenuCreateMenu.removeView(this.searchItem);
    }

    @Override
    public final void onHide() {
        this.sortItem.setVisibility(8);
        this.searchItem.setVisibility(8);
    }

    public final boolean onItemClick(View view, Object obj) {
        int i;
        ArrayList arrayList;
        Iterator it;
        boolean z;
        boolean z2 = obj instanceof ListItem;
        ArrayList arrayList2 = this.selectedFilesOrder;
        HashMap map = this.selectedFiles;
        HashMap map2 = this.selectedMessages;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        boolean z3 = false;
        if (!z2) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                FilteredSearchView.MessageHashId messageHashId = new FilteredSearchView.MessageHashId(messageObject.getId(), messageObject.getDialogId());
                if (map2.containsKey(messageHashId)) {
                    map2.remove(messageHashId);
                } else if (map2.size() < 100) {
                    map2.put(messageHashId, messageObject);
                    z3 = true;
                }
                if (chatAttachAlert.isPollAttach) {
                    if (view instanceof SharedDocumentCell) {
                        ((SharedDocumentCell) view).setChecked(z3, true);
                    }
                    if (z3) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    chatAttachAlert.updateCountButton(i);
                    return true;
                }
                if (map.isEmpty()) {
                    arrayList = new ArrayList();
                    it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((MessageObject) map2.get((FilteredSearchView.MessageHashId) it.next()));
                    }
                    this.delegate.didSelectFiles(new ArrayList(arrayList2), null, null, arrayList, false, 0, 0L, false, 0L);
                } else {
                    arrayList = new ArrayList();
                    it = map2.keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((MessageObject) map2.get((FilteredSearchView.MessageHashId) it.next()));
                    }
                    this.delegate.didSelectFiles(new ArrayList(arrayList2), null, null, arrayList, false, 0, 0L, false, 0L);
                }
                return true;
            }
            return false;
        }
        ListItem listItem = (ListItem) obj;
        File file = listItem.file;
        if (file != null && !file.isDirectory()) {
            String absolutePath = listItem.file.getAbsolutePath();
            if (map.containsKey(absolutePath)) {
                map.remove(absolutePath);
                arrayList2.remove(absolutePath);
                z = false;
            } else {
                if (!listItem.file.canRead()) {
                    showErrorBox$2(LocaleController.getString(R.string.AccessError));
                    return false;
                }
                if (this.canSelectOnlyImageFiles && listItem.thumb == null) {
                    showErrorBox$2(LocaleController.formatString("PassportUploadNotImage", R.string.PassportUploadNotImage, new Object[0]));
                    return false;
                }
                if ((listItem.file.length() > 2097152000 && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || listItem.file.length() > 4194304000L) {
                    LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(6, UserConfig.selectedAccount, chatAttachAlert.getContainer().getContext(), chatAttachAlert.baseFragment, null);
                    limitReachedBottomSheet.isVeryLargeFile = true;
                    limitReachedBottomSheet.updatePremiumButtonText();
                    limitReachedBottomSheet.show();
                    return false;
                }
                if (this.maxSelectedFiles >= 0) {
                    int size = map.size();
                    int i2 = this.maxSelectedFiles;
                    if (size >= i2) {
                        showErrorBox$2(LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i2, new Object[0])));
                        return false;
                    }
                }
                if ((!this.isSoundPicker || isRingtone(listItem.file)) && listItem.file.length() != 0) {
                    boolean z4 = chatAttachAlert.storyMediaPicker;
                    map.put(absolutePath, listItem);
                    arrayList2.add(absolutePath);
                    z = true;
                }
            }
            this.scrolling = false;
            z3 = z;
            if (chatAttachAlert.isPollAttach) {
                if (view instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) view).setChecked(z3, true);
                }
                if (z3) {
                    i = 1;
                } else {
                    i = 2;
                }
                chatAttachAlert.updateCountButton(i);
                return true;
            }
            if ((map.isEmpty() || !map2.isEmpty()) && this.delegate != null && !this.sendPressed) {
                arrayList = new ArrayList();
                it = map2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((MessageObject) map2.get((FilteredSearchView.MessageHashId) it.next()));
                }
                this.delegate.didSelectFiles(new ArrayList(arrayList2), null, null, arrayList, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition$3();
    }

    @Override
    public final void onMenuItemClick(int i) {
        if (i == 6) {
            SharedConfig.toggleSortFilesByName();
            this.sortByName = SharedConfig.sortFilesByName;
            ListAdapter listAdapter = this.listAdapter;
            Collections.sort(listAdapter.recentItems, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3(this, 1));
            if (this.currentDir != null) {
                Collections.sort(listAdapter.items, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3(this, 0));
            }
            listAdapter.notifyDataSetChanged();
            this.sortItem.setIcon(this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.actionBar.isSearchFieldVisible || chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(56.0f);
            chatAttachAlert.setAllowNestedScroll(false);
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
            chatAttachAlert.setAllowNestedScroll(true);
        }
        setPaddingWithoutRequestLayout(0, iDp + AndroidUtilities.statusBarHeight, 0, this.listPaddingBottom);
        ((FrameLayout.LayoutParams) this.filtersView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
    }

    @Override
    public final void onResume() {
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
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) throws Throwable {
        this.selectedFiles.clear();
        this.selectedMessages.clear();
        this.searchAdapter.currentSearchFilters.clear();
        this.selectedFilesOrder.clear();
        this.listAdapter.history.clear();
        listRoots();
        updateSearchButton();
        updateEmptyView$6();
        this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.SelectFile));
        this.sortItem.setVisibility(0);
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(0, 0, anonymousClass4.mShouldReverseLayout);
    }

    public final void prepareAnimation() {
        View viewFindViewByPosition;
        ListAdapter listAdapter = this.backgroundListAdapter;
        listAdapter.history.clear();
        ArrayList arrayList = listAdapter.history;
        ListAdapter listAdapter2 = this.listAdapter;
        arrayList.addAll(listAdapter2.history);
        listAdapter.items.clear();
        listAdapter.items.addAll(listAdapter2.items);
        listAdapter.recentItems.clear();
        listAdapter.recentItems.addAll(listAdapter2.recentItems);
        listAdapter.notifyDataSetChanged();
        AnonymousClass4 anonymousClass4 = this.backgroundListView;
        anonymousClass4.setVisibility(0);
        AnonymousClass4 anonymousClass5 = this.listView;
        anonymousClass4.setPadding(anonymousClass5.getPaddingLeft(), anonymousClass5.getPaddingTop(), anonymousClass5.getPaddingRight(), anonymousClass5.getPaddingBottom());
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass6 = this.layoutManager;
        int iFindFirstVisibleItemPosition = anonymousClass6.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || (viewFindViewByPosition = anonymousClass6.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return;
        }
        FillLastLinearLayoutManager fillLastLinearLayoutManager = this.backgroundLayoutManager;
        fillLastLinearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, viewFindViewByPosition.getTop() - anonymousClass4.getPaddingTop(), fillLastLinearLayoutManager.mShouldReverseLayout);
    }

    public final void runAnimation(int i) {
        AnonymousClass4 anonymousClass4;
        float fDp;
        ValueAnimator valueAnimator = this.listAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimationType = i;
        int i2 = 0;
        while (true) {
            int childCount = getChildCount();
            anonymousClass4 = this.listView;
            if (i2 >= childCount) {
                i2 = 0;
                break;
            } else if (getChildAt(i2) == anonymousClass4) {
                break;
            } else {
                i2++;
            }
        }
        AnonymousClass4 anonymousClass5 = this.backgroundListView;
        if (i == 1) {
            fDp = AndroidUtilities.dp(150.0f);
            anonymousClass5.setAlpha(1.0f);
            anonymousClass5.setScaleX(1.0f);
            anonymousClass5.setScaleY(1.0f);
            anonymousClass5.setTranslationX(0.0f);
            removeView(anonymousClass5);
            addView(anonymousClass5, i2);
            anonymousClass5.setVisibility(0);
            anonymousClass4.setTranslationX(fDp);
            anonymousClass4.setAlpha(0.0f);
            this.listAnimation = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            fDp = AndroidUtilities.dp(150.0f);
            anonymousClass4.setAlpha(0.0f);
            anonymousClass4.setScaleX(0.95f);
            anonymousClass4.setScaleY(0.95f);
            anonymousClass5.setScaleX(1.0f);
            anonymousClass5.setScaleY(1.0f);
            anonymousClass5.setTranslationX(0.0f);
            anonymousClass5.setAlpha(1.0f);
            removeView(anonymousClass5);
            addView(anonymousClass5, i2 + 1);
            anonymousClass5.setVisibility(0);
            this.listAnimation = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.listAnimation.addUpdateListener(new MessagePreviewView$Page$$ExternalSyntheticLambda0(this, i, fDp, 1));
        this.listAnimation.addListener(new CheckBox.AnonymousClass1(this, 16));
        if (i == 1) {
            this.listAnimation.setDuration(220L);
        } else {
            this.listAnimation.setDuration(200L);
        }
        this.listAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.listAnimation.start();
    }

    @Override
    public final void scrollToTop() {
        smoothScrollToPosition(0);
    }

    @Override
    public final boolean sendSelectedItems(final int i, final boolean z, int i2, final boolean z2, final long j) {
        int size = this.selectedFiles.size();
        HashMap map = this.selectedMessages;
        if ((size == 0 && map.size() == 0) || this.delegate == null || this.sendPressed) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((MessageObject) map.get((FilteredSearchView.MessageHashId) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.selectedFilesOrder);
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        CharSequence[] charSequenceArr = {chatAttachAlert.getCommentView().getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr, true);
        final String string = charSequenceArr[0].toString();
        return AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + arrayList2.size() + (1 ^ (TextUtils.isEmpty(string) ? 1 : 0)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                chatAttachAlertDocumentLayout.sendPressed = true;
                chatAttachAlertDocumentLayout.delegate.didSelectFiles(arrayList2, string, entities, arrayList, z, i, j, z2, ((Long) obj).longValue());
                chatAttachAlertDocumentLayout.parentAlert.dismiss(true);
            }
        }, 0L);
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

    public final void showErrorBox$2(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = str;
        ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
    }

    public final void updateEmptyView$6() {
        RecyclerView.Adapter adapter = getAdapter();
        boolean z = true;
        SearchAdapter searchAdapter = this.searchAdapter;
        if (adapter != searchAdapter ? this.listAdapter.getItemCount() != 1 : !searchAdapter.searchResult.isEmpty() || !searchAdapter.sections.isEmpty()) {
            z = false;
        }
        this.emptyView.setVisibility(z ? 0 : 8);
        updateEmptyViewPosition$3();
    }

    public final void updateEmptyViewPosition$3() {
        View childAt;
        AnonymousClass3 anonymousClass3 = this.emptyView;
        if (anonymousClass3.getVisibility() == 0 && (childAt = getChildAt(0)) != null) {
            float translationY = anonymousClass3.getTranslationY();
            this.additionalTranslationY = (childAt.getTop() + (anonymousClass3.getMeasuredHeight() - getMeasuredHeight())) / 2;
            anonymousClass3.setTranslationY(translationY);
        }
    }

    public final void updateSearchButton() {
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem == null) {
            return;
        }
        ActionBarMenuItem.AnonymousClass7 anonymousClass7 = actionBarMenuItem.searchContainer;
        if (anonymousClass7 == null || anonymousClass7.getVisibility() != 0) {
            actionBarMenuItem.setVisibility((this.hasFiles || this.listAdapter.history.isEmpty()) ? 0 : 8);
        }
    }
}
