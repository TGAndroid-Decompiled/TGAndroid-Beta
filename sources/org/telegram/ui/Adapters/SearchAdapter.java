package org.telegram.ui.Adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.RecyclerListView;

public class SearchAdapter extends RecyclerListView.SelectionAdapter {
    private ArrayList<ContactEntry> allUnregistredContacts;
    private boolean allowBots;
    private boolean allowChats;
    private boolean allowPhoneNumbers;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private long channelId;
    private LongSparseArray<TLRPC$User> ignoreUsers;
    private String lastQuery;
    private Context mContext;
    private boolean onlyMutual;
    private SearchAdapterHelper searchAdapterHelper;
    private boolean searchInProgress;
    private int searchPointer;
    private int searchReqId;
    private Timer searchTimer;
    private LongSparseArray<TLRPC$User> selectedUsers;
    int unregistredContactsHeaderRow;
    private boolean useUserCell;
    private ArrayList<Object> searchResult = new ArrayList<>();
    private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
    private ArrayList<ContactsController.Contact> unregistredContacts = new ArrayList<>();

    protected void onSearchProgressChanged() {
        throw null;
    }

    public SearchAdapter(Context context, LongSparseArray<TLRPC$User> longSparseArray, LongSparseArray<TLRPC$User> longSparseArray2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
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
            public boolean canApplySearchResults(int i2) {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i2);
            }

            @Override
            public LongSparseArray getExcludeCallParticipants() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
            }

            @Override
            public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, hashMap);
            }

            @Override
            public void onDataSetChanged(int i2) {
                SearchAdapter.this.notifyDataSetChanged();
                if (i2 != 0) {
                    SearchAdapter.this.onSearchProgressChanged();
                }
            }

            @Override
            public LongSparseArray<TLRPC$User> getExcludeUsers() {
                return SearchAdapter.this.ignoreUsers;
            }
        });
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
            public void run() {
                try {
                    SearchAdapter.this.searchTimer.cancel();
                    SearchAdapter.this.searchTimer = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                SearchAdapter.this.processSearch(str);
            }
        }, 200L, 300L);
    }

    public void processSearch(final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchAdapter.this.lambda$processSearch$1(str);
            }
        });
    }

    public void lambda$processSearch$1(final String str) {
        this.lastQuery = str;
        if (this.allowUsernameSearch) {
            this.searchAdapterHelper.queryServerSearch(str, true, this.allowChats, this.allowBots, this.allowSelf, false, this.channelId, this.allowPhoneNumbers, -1, 1);
        }
        final int i = UserConfig.selectedAccount;
        final ArrayList arrayList = new ArrayList(ContactsController.getInstance(i).contacts);
        this.searchInProgress = true;
        final int i2 = this.searchPointer;
        this.searchPointer = i2 + 1;
        this.searchReqId = i2;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SearchAdapter.this.lambda$processSearch$0(str, i2, arrayList, i);
            }
        });
    }

    public void lambda$processSearch$0(String str, int i, ArrayList arrayList, int i2) {
        LongSparseArray<TLRPC$User> longSparseArray;
        int i3;
        String[] strArr;
        String[] strArr2;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            updateSearchResults(i, new ArrayList<>(), new ArrayList<>(), this.unregistredContacts);
            return;
        }
        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
        if (lowerCase.equals(translitString) || translitString.length() == 0) {
            translitString = null;
        }
        int i4 = (translitString != null ? 1 : 0) + 1;
        String[] strArr3 = new String[i4];
        strArr3[0] = lowerCase;
        if (translitString != null) {
            strArr3[1] = translitString;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>();
        ArrayList<CharSequence> arrayList3 = new ArrayList<>();
        ArrayList<ContactsController.Contact> arrayList4 = new ArrayList<>();
        int i5 = 0;
        while (i5 < arrayList.size()) {
            TLRPC$TL_contact tLRPC$TL_contact = (TLRPC$TL_contact) arrayList.get(i5);
            int i6 = i4;
            TLRPC$User user = MessagesController.getInstance(i2).getUser(Long.valueOf(tLRPC$TL_contact.user_id));
            if ((this.allowSelf || !user.self) && ((!this.onlyMutual || user.mutual_contact) && ((longSparseArray = this.ignoreUsers) == null || longSparseArray.indexOfKey(tLRPC$TL_contact.user_id) < 0))) {
                String[] strArr4 = new String[3];
                strArr4[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                String translitString2 = LocaleController.getInstance().getTranslitString(strArr4[0]);
                strArr4[1] = translitString2;
                if (strArr4[0].equals(translitString2)) {
                    strArr4[1] = null;
                }
                if (UserObject.isReplyUser(user)) {
                    strArr4[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                } else if (user.self) {
                    strArr4[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                }
                int i7 = i6;
                int i8 = 0;
                char c = 0;
                while (true) {
                    i3 = i7;
                    if (i8 >= i7) {
                        strArr = strArr3;
                        break;
                    }
                    String str2 = strArr3[i8];
                    strArr = strArr3;
                    int i9 = 0;
                    while (i9 < 3) {
                        String str3 = strArr4[i9];
                        if (str3 != null) {
                            if (str3.startsWith(str2)) {
                                strArr2 = strArr4;
                            } else {
                                strArr2 = strArr4;
                                if (str3.contains(" " + str2)) {
                                }
                            }
                            c = 1;
                            break;
                        }
                        strArr2 = strArr4;
                        i9++;
                        strArr4 = strArr2;
                    }
                    strArr2 = strArr4;
                    String publicUsername = UserObject.getPublicUsername(user);
                    if (c == 0 && publicUsername != null && publicUsername.startsWith(str2)) {
                        c = 2;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            arrayList3.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str2));
                        } else {
                            arrayList3.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str2));
                        }
                        arrayList2.add(user);
                    } else {
                        i8++;
                        i7 = i3;
                        strArr3 = strArr;
                        strArr4 = strArr2;
                    }
                }
            } else {
                strArr = strArr3;
                i3 = i6;
            }
            i5++;
            i4 = i3;
            strArr3 = strArr;
        }
        if (this.allUnregistredContacts == null) {
            this.allUnregistredContacts = new ArrayList<>();
            Iterator<ContactsController.Contact> it = ContactsController.getInstance(i2).phoneBookContacts.iterator();
            while (it.hasNext()) {
                ContactsController.Contact next = it.next();
                ContactEntry contactEntry = new ContactEntry();
                contactEntry.contact = next;
                contactEntry.q1 = (next.first_name + " " + next.last_name).toLowerCase();
                contactEntry.q2 = (next.last_name + " " + next.first_name).toLowerCase();
                this.allUnregistredContacts.add(contactEntry);
            }
        }
        for (int i10 = 0; i10 < this.allUnregistredContacts.size(); i10++) {
            ContactEntry contactEntry2 = this.allUnregistredContacts.get(i10);
            if ((translitString != null && (contactEntry2.q1.toLowerCase().contains(translitString) || contactEntry2.q1.toLowerCase().contains(translitString))) || contactEntry2.q1.toLowerCase().contains(lowerCase) || contactEntry2.q1.toLowerCase().contains(lowerCase)) {
                arrayList4.add(contactEntry2.contact);
            }
        }
        updateSearchResults(i, arrayList2, arrayList3, arrayList4);
    }

    private void updateSearchResults(final int i, final ArrayList<Object> arrayList, final ArrayList<CharSequence> arrayList2, final ArrayList<ContactsController.Contact> arrayList3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchAdapter.this.lambda$updateSearchResults$2(i, arrayList, arrayList2, arrayList3);
            }
        });
    }

    public void lambda$updateSearchResults$2(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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

    public boolean searchInProgress() {
        return this.searchInProgress || this.searchAdapterHelper.isSearchInProgress();
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 0 || itemViewType == 2 || itemViewType == 3;
    }

    @Override
    public int getItemCount() {
        this.unregistredContactsHeaderRow = -1;
        int size = this.searchResult.size();
        if (!this.unregistredContacts.isEmpty()) {
            this.unregistredContactsHeaderRow = size;
            size += this.unregistredContacts.size() + 1;
        }
        int size2 = this.searchAdapterHelper.getGlobalSearch().size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        return size3 != 0 ? size + size3 : size;
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
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View profileSearchCell;
        if (i != 0) {
            if (i == 1) {
                profileSearchCell = new GraySectionCell(this.mContext);
            } else if (i != 3) {
                profileSearchCell = new TextCell(this.mContext, 16, false);
            } else {
                profileSearchCell = new ProfileSearchCell(this.mContext);
            }
        } else if (this.useUserCell) {
            profileSearchCell = new UserCell(this.mContext, 1, 1, false);
        } else {
            profileSearchCell = new ProfileSearchCell(this.mContext);
        }
        return new RecyclerListView.Holder(profileSearchCell);
    }

    @Override
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.SearchAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override
    public int getItemViewType(int i) {
        Object item = getItem(i);
        if (item == null) {
            return 1;
        }
        return item instanceof String ? "section".equals((String) item) ? 1 : 2 : item instanceof ContactsController.Contact ? 3 : 0;
    }

    public static class ContactEntry {
        ContactsController.Contact contact;
        String q1;
        String q2;

        private ContactEntry() {
        }
    }
}
