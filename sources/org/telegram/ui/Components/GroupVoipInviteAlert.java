package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter$$ExternalSyntheticLambda0;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;
import org.telegram.ui.UsersSelectActivity;

public final class GroupVoipInviteAlert extends UsersAlertBase {
    public int addNewRow;
    public final ArrayList contacts;
    public boolean contactsEndReached;
    public int contactsEndRow;
    public int contactsHeaderRow;
    public final LongSparseArray contactsMap;
    public int contactsStartRow;
    public final TLRPC.Chat currentChat;
    public int delayResults;
    public GroupCallActivity.AnonymousClass13 delegate;
    public boolean firstLoaded;
    public int flickerProgressRow;
    public final LongSparseArray ignoredUsers;
    public final TLRPC.ChatFull info;
    public final HashSet invitedUsers;
    public int lastRow;
    public boolean loadingUsers;
    public int membersHeaderRow;
    public final ArrayList participants;
    public int participantsEndRow;
    public final LongSparseArray participantsMap;
    public int participantsStartRow;
    public int rowCount;
    public final SearchAdapter searchAdapter;
    public boolean showContacts;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return GroupVoipInviteAlert.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            GroupVoipInviteAlert groupVoipInviteAlert = GroupVoipInviteAlert.this;
            if ((i >= groupVoipInviteAlert.participantsStartRow && i < groupVoipInviteAlert.participantsEndRow) || (i >= groupVoipInviteAlert.contactsStartRow && i < groupVoipInviteAlert.contactsEndRow)) {
                return 0;
            }
            if (i == groupVoipInviteAlert.addNewRow) {
                return 1;
            }
            if (i == groupVoipInviteAlert.membersHeaderRow || i == groupVoipInviteAlert.contactsHeaderRow) {
                return 2;
            }
            if (i == 0) {
                return 3;
            }
            if (i == groupVoipInviteAlert.lastRow) {
                return 4;
            }
            return i == groupVoipInviteAlert.flickerProgressRow ? 5 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if ((view instanceof ManageChatUserCell) && GroupVoipInviteAlert.this.invitedUsers.contains(Long.valueOf(((ManageChatUserCell) view).getUserId()))) {
                return false;
            }
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            int i2;
            long peerId;
            int i3 = viewHolder.mItemViewType;
            boolean z = false;
            GroupVoipInviteAlert groupVoipInviteAlert = GroupVoipInviteAlert.this;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                manageChatUserCell.setTag(Integer.valueOf(i));
                int i4 = groupVoipInviteAlert.participantsStartRow;
                if (i < i4 || i >= groupVoipInviteAlert.participantsEndRow) {
                    int i5 = groupVoipInviteAlert.contactsStartRow;
                    tLObject = (i < i5 || i >= groupVoipInviteAlert.contactsEndRow) ? null : (TLObject) groupVoipInviteAlert.contacts.get(i - i5);
                } else {
                    tLObject = (TLObject) groupVoipInviteAlert.participants.get(i - i4);
                }
                if (i < groupVoipInviteAlert.participantsStartRow || i >= (i2 = groupVoipInviteAlert.participantsEndRow)) {
                    i2 = groupVoipInviteAlert.contactsEndRow;
                }
                if (tLObject instanceof TLRPC.TL_contact) {
                    peerId = ((TLRPC.TL_contact) tLObject).user_id;
                } else if (tLObject instanceof TLRPC.User) {
                    peerId = ((TLRPC.User) tLObject).id;
                } else {
                    peerId = tLObject instanceof TLRPC.ChannelParticipant ? MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id;
                }
                TLRPC.User user = MessagesController.getInstance(((BottomSheet) groupVoipInviteAlert).currentAccount).getUser(Long.valueOf(peerId));
                if (user != null) {
                    manageChatUserCell.setCustomImageVisible(groupVoipInviteAlert.invitedUsers.contains(Long.valueOf(user.id)));
                    manageChatUserCell.setData(user, null, null, i != i2 - 1);
                    return;
                }
                return;
            }
            if (i3 == 1) {
                ManageChatTextCell manageChatTextCell = (ManageChatTextCell) view;
                if (i == groupVoipInviteAlert.addNewRow) {
                    if ((!groupVoipInviteAlert.loadingUsers || groupVoipInviteAlert.firstLoaded) && groupVoipInviteAlert.membersHeaderRow == -1 && !groupVoipInviteAlert.participants.isEmpty()) {
                        z = true;
                    }
                    manageChatTextCell.setText(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z);
                    return;
                }
                return;
            }
            if (i3 != 2) {
                return;
            }
            GraySectionCell graySectionCell = (GraySectionCell) view;
            if (i == groupVoipInviteAlert.membersHeaderRow) {
                graySectionCell.setText(LocaleController.getString(R.string.ChannelOtherMembers));
            } else if (i == groupVoipInviteAlert.contactsHeaderRow) {
                if (groupVoipInviteAlert.showContacts) {
                    graySectionCell.setText(LocaleController.getString(R.string.YourContactsToInvite));
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.GroupContacts));
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                Context context = this.mContext;
                if (i == 1) {
                    ManageChatTextCell manageChatTextCell = new ManageChatTextCell(context);
                    int i2 = Theme.key_voipgroup_listeningText;
                    manageChatTextCell.setColors(i2, i2);
                    manageChatTextCell.setDividerColor(Theme.key_voipgroup_actionBar);
                    view = manageChatTextCell;
                } else if (i == 2) {
                    GraySectionCell graySectionCell = new GraySectionCell(context, 16, null);
                    graySectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_actionBarUnscrolled, false));
                    graySectionCell.setTextColor(Theme.key_voipgroup_searchPlaceholder);
                    view = graySectionCell;
                } else if (i == 3) {
                    View view2 = new View(context);
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                    view = view2;
                } else if (i != 5) {
                    view = new View(context);
                } else {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setViewType(6);
                    flickerLoadingView.setIsSingleCell(true);
                    int i3 = Theme.key_voipgroup_inviteMembersBackground;
                    int i4 = Theme.key_voipgroup_searchBackground;
                    int i5 = Theme.key_voipgroup_actionBarUnscrolled;
                    flickerLoadingView.colorKey1 = i3;
                    flickerLoadingView.colorKey2 = i4;
                    flickerLoadingView.colorKey3 = i5;
                    flickerLoadingView.invalidate();
                    view = flickerLoadingView;
                }
            } else {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, null);
                manageChatUserCell.setCustomRightImage(R.drawable.msg_invited);
                manageChatUserCell.setNameColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
                int color = Theme.getColor(null, Theme.key_voipgroup_lastSeenTextUnscrolled, false);
                int color2 = Theme.getColor(null, Theme.key_voipgroup_listeningText, false);
                manageChatUserCell.statusColor = color;
                manageChatUserCell.statusOnlineColor = color2;
                manageChatUserCell.setDividerColor(Theme.key_voipgroup_actionBar);
                view = manageChatUserCell;
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int globalStartRow;
        public int groupStartRow;
        public int lastRow;
        public int lastSearchId;
        public final Context mContext;
        public final SearchAdapterHelper searchAdapterHelper;
        public boolean searchInProgress;
        public GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 searchRunnable;
        public int totalCount;

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.delegate = new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public final boolean canApplySearchResults(int i) {
                    return true;
                }

                @Override
                public final LongSparseArray getExcludeCallParticipants() {
                    return GroupVoipInviteAlert.this.ignoredUsers;
                }

                @Override
                public final void getExcludeUsers() {
                }

                @Override
                public final void onDataSetChanged(int i) {
                    if (i >= 0) {
                        SearchAdapter searchAdapter = SearchAdapter.this;
                        if (i != searchAdapter.lastSearchId || searchAdapter.searchInProgress) {
                            return;
                        }
                        int i2 = searchAdapter.totalCount - 1;
                        GroupVoipInviteAlert groupVoipInviteAlert = GroupVoipInviteAlert.this;
                        boolean z = groupVoipInviteAlert.emptyView.getVisibility() == 0;
                        searchAdapter.notifyDataSetChanged();
                        if (searchAdapter.totalCount > i2) {
                            groupVoipInviteAlert.showItemsAnimated$2(i2);
                        }
                        if (searchAdapter.searchAdapterHelper.isSearchInProgress() || !groupVoipInviteAlert.listView.emptyViewIsVisible()) {
                            return;
                        }
                        groupVoipInviteAlert.emptyView.showProgress(false, z);
                    }
                }

                @Override
                public final void onSetHashtags(ArrayList arrayList) {
                }
            };
        }

        @Override
        public final int getItemCount() {
            return this.totalCount;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 2;
            }
            if (i == this.lastRow) {
                return 3;
            }
            return (i == this.globalStartRow || i == this.groupStartRow) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            return !((view instanceof ManageChatUserCell) && GroupVoipInviteAlert.this.invitedUsers.contains(Long.valueOf(((ManageChatUserCell) view).getUserId()))) && viewHolder.mItemViewType == 0;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.totalCount = 1;
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size = searchAdapterHelper.groupSearch.size();
            if (size != 0) {
                int i = this.totalCount;
                this.groupStartRow = i;
                this.totalCount = size + 1 + i;
            } else {
                this.groupStartRow = -1;
            }
            int size2 = searchAdapterHelper.globalSearch.size();
            if (size2 != 0) {
                int i2 = this.totalCount;
                this.globalStartRow = i2;
                this.totalCount = size2 + 1 + i2;
            } else {
                this.globalStartRow = -1;
            }
            int i3 = this.totalCount;
            this.totalCount = i3 + 1;
            this.lastRow = i3;
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            TLObject tLObject;
            TLRPC.User user;
            String str;
            boolean z;
            CharSequence charSequence;
            int size;
            int i3 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i3 != 0) {
                if (i3 != 1) {
                    return;
                }
                GraySectionCell graySectionCell = (GraySectionCell) view;
                if (i == this.groupStartRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelMembers));
                    return;
                } else {
                    if (i == this.globalStartRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                        return;
                    }
                    return;
                }
            }
            int i4 = this.groupStartRow;
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            SpannableStringBuilder spannableStringBuilder = null;
            if (i4 < 0 || i <= i4) {
                i2 = this.globalStartRow;
                if (i2 >= 0 || i <= i2) {
                    tLObject = null;
                } else if (i < searchAdapterHelper.globalSearch.size() + i2 + 1) {
                    tLObject = (TLObject) searchAdapterHelper.globalSearch.get((i - this.globalStartRow) - 1);
                } else {
                    tLObject = null;
                }
            } else if (i < searchAdapterHelper.groupSearch.size() + i4 + 1) {
                tLObject = (TLObject) searchAdapterHelper.groupSearch.get((i - this.groupStartRow) - 1);
            } else {
                i2 = this.globalStartRow;
                if (i2 >= 0) {
                    tLObject = null;
                } else {
                    tLObject = null;
                }
            }
            boolean z2 = tLObject instanceof TLRPC.User;
            GroupVoipInviteAlert groupVoipInviteAlert = GroupVoipInviteAlert.this;
            if (z2) {
                user = (TLRPC.User) tLObject;
            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                user = MessagesController.getInstance(((BottomSheet) groupVoipInviteAlert).currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
            } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                user = MessagesController.getInstance(((BottomSheet) groupVoipInviteAlert).currentAccount).getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            int size2 = searchAdapterHelper.groupSearch.size();
            if (size2 == 0) {
                str = null;
                z = false;
            } else {
                int i5 = size2 + 1;
                if (i5 > i) {
                    str = searchAdapterHelper.lastFoundChannel;
                    z = true;
                } else {
                    i -= i5;
                    str = null;
                    z = false;
                }
            }
            if (z || publicUsername == null || (size = searchAdapterHelper.globalSearch.size()) == 0 || size + 1 <= i) {
                charSequence = null;
            } else {
                String strSubstring = searchAdapterHelper.lastFoundUsername;
                if (strSubstring.startsWith("@")) {
                    strSubstring = strSubstring.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "@");
                    spannableStringBuilder2.append((CharSequence) publicUsername);
                    int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                    if (iIndexOfIgnoreCase != -1) {
                        int length = strSubstring.length();
                        if (iIndexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            iIndexOfIgnoreCase++;
                        }
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_voipgroup_listeningText, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder2;
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence = publicUsername;
                }
            }
            if (str != null) {
                String userName = UserObject.getUserName(user);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(userName);
                int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(userName, str);
                if (iIndexOfIgnoreCase2 != -1) {
                    spannableStringBuilder3.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_voipgroup_listeningText, false)), iIndexOfIgnoreCase2, str.length() + iIndexOfIgnoreCase2, 33);
                }
                spannableStringBuilder = spannableStringBuilder3;
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
            manageChatUserCell.setTag(Integer.valueOf(i));
            manageChatUserCell.setCustomImageVisible(groupVoipInviteAlert.invitedUsers.contains(Long.valueOf(user.id)));
            manageChatUserCell.setData(user, spannableStringBuilder, charSequence, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                Context context = this.mContext;
                if (i == 1) {
                    GraySectionCell graySectionCell = new GraySectionCell(context, 16, null);
                    graySectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_actionBarUnscrolled, false));
                    graySectionCell.setTextColor(Theme.key_voipgroup_searchPlaceholder);
                    view = graySectionCell;
                } else if (i != 2) {
                    view = new View(context);
                } else {
                    view = new View(context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                }
            } else {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 2, 2, false, null);
                manageChatUserCell.setCustomRightImage(R.drawable.msg_invited);
                manageChatUserCell.setNameColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
                int color = Theme.getColor(null, Theme.key_voipgroup_lastSeenTextUnscrolled, false);
                int color2 = Theme.getColor(null, Theme.key_voipgroup_listeningText, false);
                manageChatUserCell.statusColor = color;
                manageChatUserCell.statusOnlineColor = color2;
                manageChatUserCell.setDividerColor(Theme.key_voipgroup_listViewBackground);
                view = manageChatUserCell;
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public GroupVoipInviteAlert(Context context, int i, TLRPC.Chat chat, TLRPC.ChatFull chatFull, LongSparseArray longSparseArray, HashSet hashSet) {
        super(context, i, null);
        this.participants = new ArrayList();
        this.contacts = new ArrayList();
        this.participantsMap = new LongSparseArray();
        this.contactsMap = new LongSparseArray();
        setDimBehindAlpha(75);
        this.currentChat = chat;
        this.info = chatFull;
        this.ignoredUsers = longSparseArray;
        this.invitedUsers = hashSet;
        this.listView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 19));
        SearchAdapter searchAdapter = new SearchAdapter(context);
        this.searchAdapter = searchAdapter;
        this.searchListViewAdapter = searchAdapter;
        UsersAlertBase.AnonymousClass1 anonymousClass1 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        anonymousClass1.setAdapter(listAdapter);
        if (!this.loadingUsers) {
            this.contactsEndReached = false;
            loadChatParticipants$1$1();
        }
        updateRows$23();
        setColorProgress$1(0.0f);
    }

    public final void fillContacts() {
        if (this.showContacts) {
            ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
            ArrayList arrayList2 = this.contacts;
            arrayList2.addAll(arrayList);
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TLObject tLObject = (TLObject) arrayList2.get(i);
                if (tLObject instanceof TLRPC.TL_contact) {
                    long j2 = ((TLRPC.TL_contact) tLObject).user_id;
                    if (j2 == j || this.ignoredUsers.indexOfKey(j2) >= 0) {
                        arrayList2.remove(i);
                        i--;
                        size--;
                    } else {
                        if (this.invitedUsers.contains(Long.valueOf(j2))) {
                            arrayList2.remove(i);
                            i--;
                            size--;
                        }
                    }
                }
                i++;
            }
            Collections.sort(arrayList2, new DialogsAdapter$$ExternalSyntheticLambda0(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
        }
    }

    public final int lambda$loadChatParticipants$2(int i, TLObject tLObject, TLObject tLObject2) {
        int i2;
        int i3;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
        if (user == null || (userStatus2 = user.status) == null) {
            i2 = 0;
        } else {
            i2 = user.self ? i + 50000 : userStatus2.expires;
        }
        if (user2 == null || (userStatus = user2.status) == null) {
            i3 = 0;
        } else {
            i3 = user2.self ? i + 50000 : userStatus.expires;
        }
        if (i2 > 0 && i3 > 0) {
            if (i2 > i3) {
                return 1;
            }
            return i2 < i3 ? -1 : 0;
        }
        if (i2 < 0 && i3 < 0) {
            if (i2 > i3) {
                return 1;
            }
            return i2 < i3 ? -1 : 0;
        }
        if ((i2 >= 0 || i3 <= 0) && (i2 != 0 || i3 == 0)) {
            return ((i3 >= 0 || i2 <= 0) && (i3 != 0 || i2 == 0)) ? 0 : 1;
        }
        return -1;
    }

    public final void lambda$loadChatParticipants$3(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int itemCount;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        LongSparseArray longSparseArray2;
        ArrayList arrayList2 = this.participants;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i).peer) == clientUserId) {
                    tL_channels_channelParticipants.participants.remove(i);
                    break;
                }
            }
            this.delayResults--;
            boolean z = tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts;
            LongSparseArray longSparseArray3 = this.participantsMap;
            LongSparseArray longSparseArray4 = this.contactsMap;
            if (z) {
                arrayList = this.contacts;
                longSparseArray = longSparseArray4;
            } else {
                longSparseArray = longSparseArray3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i2);
                longSparseArray.put(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i3)).peer);
                boolean z2 = longSparseArray4.get(peerId) != null || ((longSparseArray2 = this.ignoredUsers) != null && longSparseArray2.indexOfKey(peerId) >= 0);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.remove(i3);
                    longSparseArray3.remove(peerId);
                    i3--;
                    size2--;
                }
                i3++;
            }
            try {
                if (this.info.participants_count <= 200) {
                    Collections.sort(arrayList, new ChatUsersActivity$$ExternalSyntheticLambda10(this, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (this.delayResults <= 0) {
            this.loadingUsers = false;
            this.firstLoaded = true;
            if (this.flickerProgressRow == 1) {
                itemCount = 1;
            } else {
                RecyclerListView.SelectionAdapter selectionAdapter = this.listViewAdapter;
                itemCount = selectionAdapter != null ? selectionAdapter.getItemCount() - 1 : 0;
            }
            showItemsAnimated$2(itemCount);
            if (arrayList2.isEmpty()) {
                this.showContacts = true;
                fillContacts();
            }
        }
        updateRows$23();
        RecyclerListView.SelectionAdapter selectionAdapter2 = this.listViewAdapter;
        if (selectionAdapter2 != null) {
            selectionAdapter2.notifyDataSetChanged();
            StickerEmptyView stickerEmptyView = this.emptyView;
            if (stickerEmptyView != null && this.listViewAdapter.getItemCount() == 0 && this.firstLoaded) {
                stickerEmptyView.showProgress(false, true);
            }
        }
    }

    public final void loadChatParticipants$1$1() {
        LongSparseArray longSparseArray;
        TLRPC.Chat chat = this.currentChat;
        boolean zIsChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.info;
        if (zIsChannel) {
            this.loadingUsers = true;
            StickerEmptyView stickerEmptyView = this.emptyView;
            if (stickerEmptyView != null) {
                stickerEmptyView.showProgress(true, false);
            }
            RecyclerListView.SelectionAdapter selectionAdapter = this.listViewAdapter;
            if (selectionAdapter != null) {
                selectionAdapter.notifyDataSetChanged();
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
            if ((chatFull == null || chatFull.participants_count > 200) && !this.contactsEndReached) {
                this.delayResults = 2;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.contactsEndReached = true;
                loadChatParticipants$1$1();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
            tL_channels_getParticipants.filter.q = "";
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 200;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new LinkManager$$ExternalSyntheticLambda8(1, this, tL_channels_getParticipants));
            return;
        }
        this.loadingUsers = false;
        ArrayList arrayList = this.participants;
        arrayList.clear();
        this.contacts.clear();
        LongSparseArray longSparseArray2 = this.participantsMap;
        longSparseArray2.clear();
        this.contactsMap.clear();
        if (chatFull != null) {
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = chatFull.participants.participants.size();
            for (int i = 0; i < size; i++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i);
                long j2 = chatParticipant.user_id;
                if (j2 != j && ((longSparseArray = this.ignoredUsers) == null || longSparseArray.indexOfKey(j2) < 0)) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                    if (!UserObject.isDeleted(user) && !user.bot) {
                        arrayList.add(chatParticipant);
                        longSparseArray2.put(chatParticipant, chatParticipant.user_id);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.showContacts = true;
                fillContacts();
            }
        }
        updateRows$23();
        RecyclerListView.SelectionAdapter selectionAdapter2 = this.listViewAdapter;
        if (selectionAdapter2 != null) {
            selectionAdapter2.notifyDataSetChanged();
        }
    }

    @Override
    public final void onSearchViewTouched(MotionEvent motionEvent, UsersSelectActivity.AnonymousClass4 anonymousClass4) {
        GroupCallActivity.AnonymousClass13 anonymousClass13 = this.delegate;
        if (GroupCallActivity.this.enterEventSent) {
            return;
        }
        float x = motionEvent.getX();
        float left = anonymousClass4.getLeft();
        GroupCallActivity groupCallActivity = GroupCallActivity.this;
        if (x <= left || motionEvent.getX() >= anonymousClass4.getRight() || motionEvent.getY() <= anonymousClass4.getTop() || motionEvent.getY() >= anonymousClass4.getBottom()) {
            groupCallActivity.makeFocusable(groupCallActivity.groupVoipInviteAlert, anonymousClass4, false, null);
        } else {
            groupCallActivity.makeFocusable(groupCallActivity.groupVoipInviteAlert, anonymousClass4, true, null);
        }
    }

    @Override
    public final void search(String str) {
        SearchAdapter searchAdapter = this.searchAdapter;
        GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 groupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 = searchAdapter.searchRunnable;
        if (groupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 != null) {
            AndroidUtilities.cancelRunOnUIThread(groupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0);
            searchAdapter.searchRunnable = null;
        }
        SearchAdapterHelper searchAdapterHelper = searchAdapter.searchAdapterHelper;
        searchAdapterHelper.mergeResults(null, null);
        GroupVoipInviteAlert groupVoipInviteAlert = GroupVoipInviteAlert.this;
        searchAdapterHelper.queryServerSearch(null, true, false, true, false, false, groupVoipInviteAlert.currentChat.id, false, 2, -1, 0L, null);
        if (TextUtils.isEmpty(str)) {
            searchAdapter.lastSearchId = -1;
            return;
        }
        groupVoipInviteAlert.emptyView.showProgress(true, true);
        UsersAlertBase.AnonymousClass1 anonymousClass1 = groupVoipInviteAlert.listView;
        anonymousClass1.animateEmptyView = false;
        anonymousClass1.emptyViewAnimationType = 0;
        searchAdapter.notifyDataSetChanged();
        anonymousClass1.animateEmptyView = true;
        anonymousClass1.emptyViewAnimationType = 0;
        searchAdapter.searchInProgress = true;
        int i = searchAdapter.lastSearchId + 1;
        searchAdapter.lastSearchId = i;
        GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0 groupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda1 = new GroupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, str, i, 0);
        searchAdapter.searchRunnable = groupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda1;
        AndroidUtilities.runOnUIThread(groupVoipInviteAlert$SearchAdapter$$ExternalSyntheticLambda1, 300L);
        RecyclerView.Adapter adapter = anonymousClass1.getAdapter();
        RecyclerListView.SelectionAdapter selectionAdapter = groupVoipInviteAlert.searchListViewAdapter;
        if (adapter != selectionAdapter) {
            anonymousClass1.setAdapter(selectionAdapter);
        }
    }

    @Override
    public final void updateColorKeys() {
        this.keyScrollUp = Theme.key_voipgroup_scrollUp;
        this.keyListSelector = Theme.key_voipgroup_listSelector;
        this.keyInviteMembersBackground = Theme.key_voipgroup_inviteMembersBackground;
        this.keyListViewBackground = Theme.key_voipgroup_listViewBackground;
        this.keyNameText = Theme.key_voipgroup_nameText;
        this.keyLastSeenText = Theme.key_voipgroup_lastSeenText;
        this.keyLastSeenTextUnscrolled = Theme.key_voipgroup_lastSeenTextUnscrolled;
        this.keySearchIcon = Theme.key_voipgroup_mutedIcon;
        this.keySearchIconUnscrolled = Theme.key_voipgroup_mutedIconUnscrolled;
    }

    public final void updateRows$23() {
        this.addNewRow = -1;
        this.participantsStartRow = -1;
        this.participantsEndRow = -1;
        this.contactsHeaderRow = -1;
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.membersHeaderRow = -1;
        this.lastRow = -1;
        boolean z = true;
        this.rowCount = 1;
        TLRPC.Chat chat = this.currentChat;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.addNewRow = i;
        }
        if (!this.loadingUsers || this.firstLoaded) {
            ArrayList arrayList = this.contacts;
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                int i2 = this.rowCount;
                int i3 = i2 + 1;
                this.rowCount = i3;
                this.contactsHeaderRow = i2;
                this.contactsStartRow = i3;
                int size = arrayList.size() + i3;
                this.rowCount = size;
                this.contactsEndRow = size;
            }
            ArrayList arrayList2 = this.participants;
            if (!arrayList2.isEmpty()) {
                if (z) {
                    int i4 = this.rowCount;
                    this.rowCount = i4 + 1;
                    this.membersHeaderRow = i4;
                }
                int i5 = this.rowCount;
                this.participantsStartRow = i5;
                int size2 = arrayList2.size() + i5;
                this.rowCount = size2;
                this.participantsEndRow = size2;
            }
        }
        if (this.loadingUsers) {
            int i6 = this.rowCount;
            this.rowCount = i6 + 1;
            this.flickerProgressRow = i6;
        }
        int i7 = this.rowCount;
        this.rowCount = i7 + 1;
        this.lastRow = i7;
    }
}
