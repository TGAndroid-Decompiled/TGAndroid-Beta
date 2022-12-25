package org.telegram.p009ui.Adapters;

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
import org.telegram.PhoneFormat.C0933PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.Adapters.SearchAdapterHelper;
import org.telegram.p009ui.Cells.GraySectionCell;
import org.telegram.p009ui.Cells.ProfileSearchCell;
import org.telegram.p009ui.Cells.TextCell;
import org.telegram.p009ui.Cells.UserCell;
import org.telegram.p009ui.Components.ForegroundColorSpanThemable;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$User;

public class SearchAdapter extends RecyclerListView.SelectionAdapter {
    private boolean allowBots;
    private boolean allowChats;
    private boolean allowPhoneNumbers;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private long channelId;
    private LongSparseArray<?> checkedMap;
    private LongSparseArray<TLRPC$User> ignoreUsers;
    private Context mContext;
    private boolean onlyMutual;
    private SearchAdapterHelper searchAdapterHelper;
    private boolean searchInProgress;
    private int searchPointer;
    private int searchReqId;
    private ArrayList<Object> searchResult = new ArrayList<>();
    private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
    private Timer searchTimer;
    private boolean useUserCell;

    protected void onSearchProgressChanged() {
        throw null;
    }

    public SearchAdapter(Context context, LongSparseArray<TLRPC$User> longSparseArray, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.mContext = context;
        this.ignoreUsers = longSparseArray;
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
            FileLog.m31e(e);
        }
        this.searchResult.clear();
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
                    FileLog.m31e(e2);
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
        String str2;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            updateSearchResults(i, new ArrayList<>(), new ArrayList<>());
            return;
        }
        String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
        String str3 = null;
        if (lowerCase.equals(translitString) || translitString.length() == 0) {
            translitString = null;
        }
        char c = 0;
        char c2 = 1;
        int i4 = (translitString != null ? 1 : 0) + 1;
        String[] strArr = new String[i4];
        strArr[0] = lowerCase;
        if (translitString != null) {
            strArr[1] = translitString;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>();
        ArrayList<CharSequence> arrayList3 = new ArrayList<>();
        int i5 = 0;
        while (i5 < arrayList.size()) {
            TLRPC$TL_contact tLRPC$TL_contact = (TLRPC$TL_contact) arrayList.get(i5);
            TLRPC$User user = MessagesController.getInstance(i2).getUser(Long.valueOf(tLRPC$TL_contact.user_id));
            if ((this.allowSelf || !user.self) && ((!this.onlyMutual || user.mutual_contact) && ((longSparseArray = this.ignoreUsers) == null || longSparseArray.indexOfKey(tLRPC$TL_contact.user_id) < 0))) {
                int i6 = 3;
                String[] strArr2 = new String[3];
                strArr2[c] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                strArr2[c2] = LocaleController.getInstance().getTranslitString(strArr2[c]);
                if (strArr2[c].equals(strArr2[c2])) {
                    strArr2[c2] = str3;
                }
                if (UserObject.isReplyUser(user)) {
                    strArr2[2] = LocaleController.getString("RepliesTitle", C1010R.string.RepliesTitle).toLowerCase();
                } else if (user.self) {
                    strArr2[2] = LocaleController.getString("SavedMessages", C1010R.string.SavedMessages).toLowerCase();
                }
                int i7 = 0;
                char c3 = 0;
                while (i7 < i4) {
                    String str4 = strArr[i7];
                    int i8 = 0;
                    while (i8 < i6) {
                        String str5 = strArr2[i8];
                        if (str5 != null) {
                            if (str5.startsWith(str4)) {
                                i3 = i4;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                i3 = i4;
                                sb.append(" ");
                                sb.append(str4);
                                if (str5.contains(sb.toString())) {
                                }
                            }
                            c3 = 1;
                            break;
                        }
                        i3 = i4;
                        i8++;
                        i4 = i3;
                        i6 = 3;
                    }
                    i3 = i4;
                    String publicUsername = UserObject.getPublicUsername(user);
                    if (c3 == 0 && publicUsername != null && publicUsername.startsWith(str4)) {
                        c3 = 2;
                    }
                    if (c3 != 0) {
                        if (c3 == 1) {
                            arrayList3.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                            str2 = null;
                        } else {
                            str2 = null;
                            arrayList3.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                        }
                        arrayList2.add(user);
                        i5++;
                        str3 = str2;
                        i4 = i3;
                        c = 0;
                        c2 = 1;
                    } else {
                        i7++;
                        str3 = null;
                        i4 = i3;
                        i6 = 3;
                    }
                }
            }
            i3 = i4;
            str2 = str3;
            i5++;
            str3 = str2;
            i4 = i3;
            c = 0;
            c2 = 1;
        }
        updateSearchResults(i, arrayList2, arrayList3);
    }

    private void updateSearchResults(final int i, final ArrayList<Object> arrayList, final ArrayList<CharSequence> arrayList2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SearchAdapter.this.lambda$updateSearchResults$2(i, arrayList, arrayList2);
            }
        });
    }

    public void lambda$updateSearchResults$2(int i, ArrayList arrayList, ArrayList arrayList2) {
        if (i == this.searchReqId) {
            this.searchResult = arrayList;
            this.searchResultNames = arrayList2;
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
        return itemViewType == 0 || itemViewType == 2;
    }

    @Override
    public int getItemCount() {
        int size = this.searchResult.size();
        int size2 = this.searchAdapterHelper.getGlobalSearch().size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        return size3 != 0 ? size + size3 : size;
    }

    public boolean isGlobalSearch(int i) {
        int size = this.searchResult.size();
        int size2 = this.searchAdapterHelper.getGlobalSearch().size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (i < 0 || i >= size) {
            return (i <= size || i >= size + size3) && i > size + size3 && i <= (size2 + size3) + size;
        }
        return false;
    }

    public Object getItem(int i) {
        int size = this.searchResult.size();
        int size2 = this.searchAdapterHelper.getGlobalSearch().size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (i < 0 || i >= size) {
            int i2 = i - size;
            if (i2 < 0 || i2 >= size3) {
                int i3 = i2 - size3;
                if (i3 <= 0 || i3 > size2) {
                    return null;
                }
                return this.searchAdapterHelper.getGlobalSearch().get(i3 - 1);
            }
            return this.searchAdapterHelper.getPhoneSearch().get(i2);
        }
        return this.searchResult.get(i);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View profileSearchCell;
        if (i != 0) {
            if (i == 1) {
                profileSearchCell = new GraySectionCell(this.mContext);
            } else {
                profileSearchCell = new TextCell(this.mContext, 16, false);
            }
        } else if (this.useUserCell) {
            UserCell userCell = new UserCell(this.mContext, 1, 1, false);
            if (this.checkedMap != null) {
                userCell.setChecked(false, false);
            }
            profileSearchCell = userCell;
        } else {
            profileSearchCell = new ProfileSearchCell(this.mContext);
        }
        return new RecyclerListView.Holder(profileSearchCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        int indexOfIgnoreCase;
        int itemViewType = viewHolder.getItemViewType();
        String str2 = null;
        boolean z2 = false;
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (getItem(i) == null) {
                    graySectionCell.setText(LocaleController.getString("GlobalSearch", C1010R.string.GlobalSearch));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString("PhoneNumberSearch", C1010R.string.PhoneNumberSearch));
                    return;
                }
            } else if (itemViewType != 2) {
                return;
            } else {
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.setColors(null, "windowBackgroundWhiteBlueText2");
                textCell.setText(LocaleController.formatString("AddContactByPhone", C1010R.string.AddContactByPhone, C0933PhoneFormat.getInstance().format("+" + ((String) getItem(i)))), false);
                return;
            }
        }
        TLObject tLObject = (TLObject) getItem(i);
        if (tLObject != null) {
            long j = 0;
            if (tLObject instanceof TLRPC$User) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                str = tLRPC$User.username;
                j = tLRPC$User.f986id;
                z = tLRPC$User.self;
            } else {
                if (tLObject instanceof TLRPC$Chat) {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
                    str = ChatObject.getPublicUsername(tLRPC$Chat);
                    j = tLRPC$Chat.f848id;
                } else {
                    str = null;
                }
                z = false;
            }
            if (i < this.searchResult.size()) {
                CharSequence charSequence = this.searchResultNames.get(i);
                if (charSequence != null && str != null && str.length() > 0) {
                    if (charSequence.toString().startsWith("@" + str)) {
                        spannableStringBuilder = charSequence;
                    }
                }
                spannableStringBuilder = null;
                str2 = charSequence;
            } else if (i <= this.searchResult.size() || str == null) {
                spannableStringBuilder = null;
            } else {
                String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                if (lastFoundUsername != null && lastFoundUsername.startsWith("@")) {
                    lastFoundUsername = lastFoundUsername.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "@");
                    spannableStringBuilder2.append((CharSequence) str);
                    if (lastFoundUsername != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, lastFoundUsername)) != -1) {
                        int length = lastFoundUsername.length();
                        if (indexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            indexOfIgnoreCase++;
                        }
                        spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable("windowBackgroundWhiteBlueText4"), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    spannableStringBuilder = spannableStringBuilder2;
                } catch (Exception e) {
                    FileLog.m31e(e);
                    spannableStringBuilder = str;
                }
            }
            if (this.useUserCell) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                userCell.setData(tLObject, str2, spannableStringBuilder, 0);
                LongSparseArray<?> longSparseArray = this.checkedMap;
                if (longSparseArray != null) {
                    userCell.setChecked(longSparseArray.indexOfKey(j) >= 0, false);
                    return;
                }
                return;
            }
            ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
            profileSearchCell.setData(tLObject, null, z ? LocaleController.getString("SavedMessages", C1010R.string.SavedMessages) : str2, spannableStringBuilder, false, z);
            if (i != getItemCount() - 1 && i != this.searchResult.size() - 1) {
                z2 = true;
            }
            profileSearchCell.useSeparator = z2;
        }
    }

    @Override
    public int getItemViewType(int i) {
        Object item = getItem(i);
        if (item == null) {
            return 1;
        }
        if (item instanceof String) {
            return "section".equals((String) item) ? 1 : 2;
        }
        return 0;
    }
}
