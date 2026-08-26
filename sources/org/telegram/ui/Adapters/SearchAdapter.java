package org.telegram.ui.Adapters;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda153;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.web.AddressBarList;

public abstract class SearchAdapter extends RecyclerListView.SelectionAdapter {
    private ArrayList<ContactEntry> allUnregistredContacts;
    private boolean allowBots;
    private boolean allowChats;
    private boolean allowPhoneNumbers;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private long channelId;
    private LongSparseArray ignoreUsers;
    public boolean includeLoading;
    public boolean includeSearch;
    private String lastQuery;
    private Context mContext;
    private boolean onlyMutual;
    private SearchAdapterHelper searchAdapterHelper;
    private boolean searchInProgress;
    private int searchPointer;
    private int searchReqId;
    private Timer searchTimer;
    private LongSparseArray selectedUsers;
    int unregistredContactsHeaderRow;
    private boolean useUserCell;
    private ArrayList<Object> searchResult = new ArrayList<>();
    private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
    private ArrayList<ContactsController.Contact> unregistredContacts = new ArrayList<>();

    public final class ContactEntry {
        public ContactsController.Contact contact;
        public String q1;
    }

    public SearchAdapter(Context context, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.mContext = context;
        this.ignoreUsers = longSparseArray;
        this.selectedUsers = longSparseArray2;
        this.onlyMutual = z2;
        this.allowUsernameSearch = z;
        this.allowChats = z3;
        this.allowBots = z4;
        this.channelId = i;
        this.allowSelf = z5;
        this.allowPhoneNumbers = z6;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
            @Override
            public final boolean canApplySearchResults(int i2) {
                return true;
            }

            @Override
            public final LongSparseArray getExcludeCallParticipants() {
                return null;
            }

            @Override
            public final LongSparseArray getExcludeUsers() {
                return SearchAdapter.this.ignoreUsers;
            }

            @Override
            public final void onDataSetChanged(int i2) {
                SearchAdapter searchAdapter = SearchAdapter.this;
                searchAdapter.notifyDataSetChanged();
                if (i2 != 0) {
                    searchAdapter.onSearchProgressChanged();
                }
            }

            @Override
            public final void onSetHashtags(ArrayList arrayList, HashMap map) {
            }
        });
    }

    public Object getItem(int i) {
        int size = this.searchResult.size();
        int size2 = this.unregistredContacts.size();
        int size3 = this.searchAdapterHelper.getGlobalSearch().size();
        int size4 = this.searchAdapterHelper.getPhoneSearch().size();
        if (i >= 0 && i < size) {
            return this.searchResult.get(i);
        }
        int i2 = i - size;
        if (size2 > 0) {
            if (i2 == 0) {
                return null;
            }
            if (i2 > 0 && i2 <= size2) {
                return this.unregistredContacts.get(i2 - 1);
            }
            i2 -= size2 + 1;
        }
        if (i2 >= 0 && i2 < size4) {
            return this.searchAdapterHelper.getPhoneSearch().get(i2);
        }
        int i3 = i2 - size4;
        if (i3 <= 0 || i3 > size3) {
            return null;
        }
        return this.searchAdapterHelper.getGlobalSearch().get(i3 - 1);
    }

    @Override
    public int getItemCount() {
        this.unregistredContactsHeaderRow = -1;
        int size = this.searchResult.size();
        if (this.includeSearch) {
            size++;
        }
        if (!this.unregistredContacts.isEmpty()) {
            this.unregistredContactsHeaderRow = size;
            size += this.unregistredContacts.size() + 1;
        }
        int size2 = this.searchAdapterHelper.getGlobalSearch().size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 != 0) {
            size += size3;
        }
        return (this.includeLoading && searchInProgress()) ? size + 3 : size;
    }

    @Override
    public int getItemViewType(int i) {
        if (this.includeSearch) {
            if (i == 0) {
                return 4;
            }
            i--;
        }
        if (this.includeLoading && searchInProgress() && i >= (getItemCount() - (this.includeSearch ? 1 : 0)) - 3) {
            return 5;
        }
        Object item = getItem(i);
        if (item == null) {
            return 1;
        }
        if (item instanceof String) {
            return "section".equals((String) item) ? 1 : 2;
        }
        return item instanceof ContactsController.Contact ? 3 : 0;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 0 || itemViewType == 2 || itemViewType == 3;
    }

    public boolean isGlobalSearch(int i) {
        int size = this.searchResult.size();
        int size2 = this.unregistredContacts.size();
        int size3 = this.searchAdapterHelper.getGlobalSearch().size();
        int size4 = this.searchAdapterHelper.getPhoneSearch().size();
        if (i >= 0 && i < size) {
            return false;
        }
        if (i <= size || i >= size + size2 + 1) {
            return (i <= (size + size2) + 1 || i >= ((size + size4) + size2) + 1) && i > ((size + size4) + size2) + 1 && i <= (((size3 + size4) + size) + size2) + 1;
        }
        return false;
    }

    public final void lambda$processSearch$0(String str, int i, ArrayList arrayList, int i2) {
        int i3;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            updateSearchResults(i, new ArrayList(), new ArrayList(), this.unregistredContacts);
            return;
        }
        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
        if (lowerCase.equals(translitString) || translitString.length() == 0) {
            translitString = null;
        }
        int i4 = (translitString != null ? 1 : 0) + 1;
        String[] strArr = new String[i4];
        strArr[0] = lowerCase;
        if (translitString != null) {
            strArr[1] = translitString;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5 = i3 + 1) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i5);
            TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(tL_contact.user_id));
            if ((this.allowSelf || !user.self) && (!this.onlyMutual || user.mutual_contact)) {
                LongSparseArray longSparseArray = this.ignoreUsers;
                int i6 = i5;
                if (longSparseArray == null || longSparseArray.indexOfKey(tL_contact.user_id) < 0) {
                    int i7 = 3;
                    String[] strArr2 = new String[3];
                    strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                    strArr2[1] = translitString2;
                    if (strArr2[0].equals(translitString2)) {
                        strArr2[1] = null;
                    }
                    if (UserObject.isReplyUser(user)) {
                        strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                    } else if (user.self) {
                        strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                    }
                    int i8 = 0;
                    char c = 0;
                    while (true) {
                        if (i8 < i4) {
                            String str2 = strArr[i8];
                            i3 = i6;
                            int i9 = 0;
                            while (i9 < i7) {
                                String str3 = strArr2[i9];
                                if (str3 != null && (str3.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, str3))) {
                                    c = 1;
                                    break;
                                } else {
                                    i9++;
                                    i7 = 3;
                                }
                            }
                            String publicUsername = UserObject.getPublicUsername(user);
                            char c2 = (c == 0 && publicUsername != null && publicUsername.startsWith(str2)) ? (char) 2 : c;
                            if (c2 != 0) {
                                if (c2 == 1) {
                                    arrayList3.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str2));
                                } else {
                                    arrayList3.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str2));
                                }
                                arrayList2.add(user);
                            } else {
                                i8++;
                                c = c2;
                                i6 = i3;
                                i7 = 3;
                            }
                        }
                    }
                }
                i3 = i6;
            } else {
                i3 = i5;
            }
        }
        if (this.allUnregistredContacts == null) {
            this.allUnregistredContacts = new ArrayList<>();
            ArrayList<ContactsController.Contact> arrayList5 = ContactsController.getInstance(i2).phoneBookContacts;
            int size = arrayList5.size();
            int i10 = 0;
            while (i10 < size) {
                ContactsController.Contact contact = arrayList5.get(i10);
                i10++;
                ContactsController.Contact contact2 = contact;
                ContactEntry contactEntry = new ContactEntry();
                contactEntry.contact = contact2;
                contactEntry.q1 = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                (contact2.last_name + " " + contact2.first_name).toLowerCase();
                this.allUnregistredContacts.add(contactEntry);
            }
        }
        for (int i11 = 0; i11 < this.allUnregistredContacts.size(); i11++) {
            ContactEntry contactEntry2 = this.allUnregistredContacts.get(i11);
            if ((translitString != null && (contactEntry2.q1.toLowerCase().contains(translitString) || contactEntry2.q1.toLowerCase().contains(translitString))) || contactEntry2.q1.toLowerCase().contains(lowerCase) || contactEntry2.q1.toLowerCase().contains(lowerCase)) {
                arrayList4.add(contactEntry2.contact);
            }
        }
        updateSearchResults(i, arrayList2, arrayList3, arrayList4);
    }

    public final void lambda$processSearch$1(String str) {
        this.lastQuery = str;
        if (this.allowUsernameSearch) {
            this.searchAdapterHelper.queryServerSearch(str, true, this.allowChats, this.allowBots, this.allowSelf, false, this.channelId, this.allowPhoneNumbers, -1, 1);
        }
        int i = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(i).contacts);
        this.searchInProgress = true;
        int i2 = this.searchPointer;
        this.searchPointer = i2 + 1;
        this.searchReqId = i2;
        notifyDataSetChanged();
        Utilities.searchQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda153(this, str, i2, arrayList, i, 2));
    }

    public final void lambda$updateSearchResults$2(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        if (i == this.searchReqId) {
            this.searchResult = arrayList;
            this.searchResultNames = arrayList2;
            this.unregistredContacts = arrayList3;
            this.searchAdapterHelper.mergeResults(arrayList);
            this.searchInProgress = false;
            notifyDataSetChanged();
            onSearchProgressChanged();
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        String publicUsername;
        long j2;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        int iIndexOfIgnoreCase;
        if (this.includeSearch) {
            if (i == 0) {
                return;
            } else {
                i--;
            }
        }
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (i == this.unregistredContactsHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.InviteToTelegramShort));
                    return;
                } else if (getItem(i) == null) {
                    graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.PhoneNumberSearch));
                    return;
                }
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                ContactsController.Contact contact = (ContactsController.Contact) getItem(i);
                profileSearchCell.setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), contact.shortPhones.get(0), PhoneFormat.getInstance()), false, false);
                return;
            }
            String str = (String) getItem(i);
            TextCell textCell = (TextCell) viewHolder.itemView;
            textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText2);
            textCell.setText(LocaleController.formatString(R.string.AddContactByPhone, PhoneFormat.getInstance().format("+" + str)), false);
            return;
        }
        TLObject tLObject = (TLObject) getItem(i);
        if (tLObject != null) {
            CharSequence string = null;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                publicUsername = UserObject.getPublicUsername(user);
                if (publicUsername != null && this.lastQuery != null && !publicUsername.toLowerCase().contains(this.lastQuery.toLowerCase()) && user.usernames != null) {
                    for (int i2 = 0; i2 < user.usernames.size(); i2++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i2);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.lastQuery.toLowerCase())) {
                            publicUsername = tL_username.username;
                        }
                    }
                }
                long j3 = user.id;
                z = user.self;
                j2 = j3;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    publicUsername = ChatObject.getPublicUsername(chat);
                    j = chat.id;
                } else {
                    j = 0;
                    publicUsername = null;
                }
                j2 = j;
                z = false;
            }
            if (i < this.searchResult.size()) {
                charSequence = this.searchResultNames.get(i);
                if (charSequence == null || publicUsername == null || publicUsername.length() <= 0 || !charSequence.toString().startsWith("@".concat(publicUsername))) {
                    charSequence2 = string;
                    string = charSequence;
                } else {
                    charSequence2 = charSequence;
                }
            } else {
                if (i <= this.searchResult.size() || publicUsername == null) {
                    charSequence = null;
                } else {
                    String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                    if (lastFoundUsername != null && lastFoundUsername.startsWith("@")) {
                        lastFoundUsername = lastFoundUsername.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        if (lastFoundUsername != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername)) != -1) {
                            int length = lastFoundUsername.length();
                            if (iIndexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                iIndexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                        }
                        charSequence = null;
                        string = spannableStringBuilder;
                    } catch (Exception e) {
                        FileLog.e(e);
                        charSequence2 = publicUsername;
                    }
                }
                charSequence2 = string;
                string = charSequence;
            }
            if (this.useUserCell) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                userCell.setData(tLObject, string, charSequence2, 0);
                userCell.setChecked(this.selectedUsers.indexOfKey(j2) >= 0, false);
                return;
            }
            ProfileSearchCell profileSearchCell2 = (ProfileSearchCell) viewHolder.itemView;
            if (z) {
                string = LocaleController.getString(R.string.SavedMessages);
            }
            profileSearchCell2.setData(tLObject, null, string, charSequence2, false, z);
            boolean z2 = this.selectedUsers.indexOfKey(j2) >= 0;
            CheckBox2 checkBox2 = profileSearchCell2.checkBox;
            if (checkBox2 == null) {
                return;
            }
            checkBox2.setChecked(z2, false);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View userCell;
        if (i != 0) {
            if (i == 1) {
                GraySectionCell graySectionCell = new GraySectionCell(this.mContext, 26, null);
                graySectionCell.setNoBackground(true);
                userCell = graySectionCell;
            } else if (i == 3) {
                ProfileSearchCell profileSearchCell = new ProfileSearchCell(this.mContext, null);
                profileSearchCell.callCellStyle = true;
                profileSearchCell.customPaints = true;
                userCell = profileSearchCell;
            } else if (i == 4) {
                AddressBarList.AnonymousClass2 anonymousClass2 = new AddressBarList.AnonymousClass2(this.mContext, 4);
                anonymousClass2.setId(9);
                anonymousClass2.setTag(-33024);
                userCell = anonymousClass2;
            } else if (i != 5) {
                userCell = new TextCell(16, this.mContext, null, false, false);
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(29);
                flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                userCell = flickerLoadingView;
            }
        } else if (this.useUserCell) {
            userCell = new UserCell(1, 1, this.mContext, null, false, false);
        } else {
            ProfileSearchCell profileSearchCell2 = new ProfileSearchCell(this.mContext, null);
            profileSearchCell2.callCellStyle = true;
            profileSearchCell2.customPaints = true;
            userCell = profileSearchCell2;
        }
        return new RecyclerListView.Holder(userCell);
    }

    public abstract void onSearchProgressChanged();

    public final void processSearch(String str) {
        AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(4, this, str));
    }

    public void searchDialogs(final String str) {
        try {
            Timer timer = this.searchTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.searchResult.clear();
        this.unregistredContacts.clear();
        this.searchResultNames.clear();
        if (this.allowUsernameSearch) {
            this.searchAdapterHelper.queryServerSearch(null, true, this.allowChats, this.allowBots, this.allowSelf, false, this.channelId, this.allowPhoneNumbers, 0, 0);
        }
        notifyDataSetChanged();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.searchTimer = timer2;
        timer2.schedule(new TimerTask() {
            @Override
            public final void run() {
                SearchAdapter searchAdapter = SearchAdapter.this;
                try {
                    searchAdapter.searchTimer.cancel();
                    searchAdapter.searchTimer = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                searchAdapter.processSearch(str);
            }
        }, 200L, 300L);
    }

    public boolean searchInProgress() {
        return this.searchInProgress || this.searchAdapterHelper.isSearchInProgress();
    }

    public void setUseUserCell(boolean z) {
        this.useUserCell = z;
    }

    public final void updateSearchResults(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(this, i, arrayList, arrayList2, arrayList3, 9));
    }
}
