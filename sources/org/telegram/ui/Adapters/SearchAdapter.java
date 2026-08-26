package org.telegram.ui.Adapters;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.PaymentFormActivity;

public abstract class SearchAdapter extends RecyclerListView.SelectionAdapter {
    public ArrayList allUnregistredContacts;
    public final boolean allowBots;
    public final boolean allowSelf;
    public final boolean allowUsernameSearch;
    public String lastQuery;
    public final Context mContext;
    public final SearchAdapterHelper searchAdapterHelper;
    public boolean searchInProgress;
    public int searchPointer;
    public int searchReqId;
    public Timer searchTimer;
    public final LongSparseArray selectedUsers;
    public int unregistredContactsHeaderRow;
    public ArrayList searchResult = new ArrayList();
    public ArrayList searchResultNames = new ArrayList();
    public ArrayList unregistredContacts = new ArrayList();
    public final long channelId = 0;
    public final boolean allowPhoneNumbers = true;

    public final class AnonymousClass2 extends TimerTask {
        public final int $r8$classId;
        public final RecyclerListView.SelectionAdapter this$0;
        public final String val$query;

        public AnonymousClass2(RecyclerListView.SelectionAdapter selectionAdapter, String str, int i) {
            this.$r8$classId = i;
            this.this$0 = selectionAdapter;
            this.val$query = str;
        }

        @Override
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    SearchAdapter searchAdapter = (SearchAdapter) this.this$0;
                    try {
                        searchAdapter.searchTimer.cancel();
                        searchAdapter.searchTimer = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    searchAdapter.getClass();
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(5, searchAdapter, this.val$query));
                    break;
                default:
                    try {
                        ((CountrySelectActivity.CountrySearchAdapter) this.this$0).searchTimer.cancel();
                        ((CountrySelectActivity.CountrySearchAdapter) this.this$0).searchTimer = null;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    CountrySelectActivity.CountrySearchAdapter countrySearchAdapter = (CountrySelectActivity.CountrySearchAdapter) this.this$0;
                    String str = this.val$query;
                    countrySearchAdapter.getClass();
                    Utilities.searchQueue.postRunnable(new DialogsActivity$$ExternalSyntheticLambda8(14, countrySearchAdapter, str));
                    break;
            }
        }
    }

    public final class ContactEntry {
        public ContactsController.Contact contact;
        public String q1;
    }

    public SearchAdapter(Context context, LongSparseArray longSparseArray, boolean z, boolean z2, boolean z3) {
        this.mContext = context;
        this.selectedUsers = longSparseArray;
        this.allowUsernameSearch = z;
        this.allowBots = z2;
        this.allowSelf = z3;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.delegate = new SearchAdapterHelper.SearchAdapterHelperDelegate() {
            @Override
            public final boolean canApplySearchResults(int i) {
                return true;
            }

            @Override
            public final LongSparseArray getExcludeCallParticipants() {
                return null;
            }

            @Override
            public final void getExcludeUsers() {
                SearchAdapter.this.getClass();
            }

            @Override
            public final void onDataSetChanged(int i) {
                SearchAdapter searchAdapter = SearchAdapter.this;
                searchAdapter.mObservable.notifyChanged();
                if (i != 0) {
                    ContactsActivity.AnonymousClass3 anonymousClass3 = (ContactsActivity.AnonymousClass3) searchAdapter;
                    if (anonymousClass3.searchInProgress || anonymousClass3.searchAdapterHelper.isSearchInProgress() || anonymousClass3.getItemCount() != 0) {
                        return;
                    }
                    ContactsActivity.this.emptyView.showProgress(false, true);
                }
            }

            @Override
            public final void onSetHashtags(ArrayList arrayList) {
            }
        };
    }

    public final Object getItem(int i) {
        int size = this.searchResult.size();
        int size2 = this.unregistredContacts.size();
        SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
        int size3 = searchAdapterHelper.globalSearch.size();
        int size4 = searchAdapterHelper.phonesSearch.size();
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
            return searchAdapterHelper.phonesSearch.get(i2);
        }
        int i3 = i2 - size4;
        if (i3 <= 0 || i3 > size3) {
            return null;
        }
        return searchAdapterHelper.globalSearch.get(i3 - 1);
    }

    @Override
    public final int getItemCount() {
        this.unregistredContactsHeaderRow = -1;
        int size = this.searchResult.size();
        if (!this.unregistredContacts.isEmpty()) {
            this.unregistredContactsHeaderRow = size;
            size += this.unregistredContacts.size() + 1;
        }
        SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
        int size2 = searchAdapterHelper.globalSearch.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = searchAdapterHelper.phonesSearch.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override
    public final int getItemViewType(int i) {
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
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mItemViewType;
        return i == 0 || i == 2 || i == 3;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        String publicUsername;
        long j2;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        int iIndexOfIgnoreCase;
        int i2 = viewHolder.mItemViewType;
        View view = viewHolder.itemView;
        if (i2 != 0) {
            if (i2 == 1) {
                GraySectionCell graySectionCell = (GraySectionCell) view;
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
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                ContactsController.Contact contact = (ContactsController.Contact) getItem(i);
                ((ProfileSearchCell) view).setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), contact.shortPhones.get(0), PhoneFormat.getInstance()), false, false);
                return;
            }
            String str = (String) getItem(i);
            TextCell textCell = (TextCell) view;
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
                    for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i3);
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
                charSequence = (CharSequence) this.searchResultNames.get(i);
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
                    String strSubstring = this.searchAdapterHelper.lastFoundUsername;
                    if (strSubstring != null && strSubstring.startsWith("@")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        if (strSubstring != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring)) != -1) {
                            int length = strSubstring.length();
                            if (iIndexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                iIndexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, null), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
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
            ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
            if (z) {
                string = LocaleController.getString(R.string.SavedMessages);
            }
            profileSearchCell.setData(tLObject, null, string, charSequence2, false, z);
            profileSearchCell.setChecked(this.selectedUsers.indexOfKey(j2) >= 0, false);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View textCell;
        Context context = this.mContext;
        if (i == 0) {
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, null);
            profileSearchCell.callCellStyle = true;
            profileSearchCell.customPaints = true;
            textCell = profileSearchCell;
        } else if (i == 1) {
            GraySectionCell graySectionCell = new GraySectionCell(context, 26, null);
            graySectionCell.setNoBackground(true);
            textCell = graySectionCell;
        } else if (i == 3) {
            ProfileSearchCell profileSearchCell2 = new ProfileSearchCell(context, null);
            profileSearchCell2.callCellStyle = true;
            profileSearchCell2.customPaints = true;
            textCell = profileSearchCell2;
        } else if (i == 4) {
            PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context, 5);
            anonymousClass2.setId(9);
            anonymousClass2.setTag(-33024);
            textCell = anonymousClass2;
        } else if (i != 5) {
            textCell = new TextCell(16, this.mContext, null, false, false);
        } else {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
            flickerLoadingView.setIsSingleCell(true);
            flickerLoadingView.setViewType(29);
            flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            textCell = flickerLoadingView;
        }
        return new RecyclerListView.Holder(textCell);
    }

    public final void searchDialogs(String str) {
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
            this.searchAdapterHelper.queryServerSearch(null, true, false, this.allowBots, this.allowSelf, false, this.channelId, this.allowPhoneNumbers, 0, 0, 0L, null);
        }
        this.mObservable.notifyChanged();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.searchTimer = timer2;
        timer2.schedule(new AnonymousClass2(this, str, 0), 200L, 300L);
    }
}
