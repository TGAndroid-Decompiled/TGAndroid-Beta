package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.InviteUserCell;
import org.telegram.ui.Cells.LetterSectionCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.ContactsEmptyView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.PaymentFormActivity;

public abstract class ContactsAdapter extends RecyclerListView.SectionsAdapter {
    public final int currentAccount = UserConfig.selectedAccount;
    public boolean disableSections;
    public boolean hasPhonebook;
    public final boolean isAdmin;
    public final boolean isChannel;
    public boolean isEmpty;
    public boolean isEmptyWithMainTabs;
    public final Context mContext;
    public final boolean needPhonebook;
    public ArrayList onlineContacts;
    public final int onlyUsers;
    public final LongSparseArray selectedContacts;
    public int sortType;

    public ContactsAdapter(Context context, int i, boolean z, LongSparseArray longSparseArray, int i2) {
        this.mContext = context;
        this.onlyUsers = i;
        this.needPhonebook = z;
        this.selectedContacts = longSparseArray;
        this.isAdmin = i2 != 0;
        this.isChannel = i2 == 2;
    }

    @Override
    public final int getCountForSection(int i) {
        boolean z = this.isEmptyWithMainTabs;
        int i2 = this.currentAccount;
        if (z) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return ContactsController.getInstance(i2).phoneBookContacts.size() + 2;
            }
            return 0;
        }
        int i3 = this.onlyUsers;
        ContactsController contactsController = ContactsController.getInstance(i2);
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = i3 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i2);
        ArrayList<String> arrayList = i3 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z2 = this.needPhonebook;
        boolean z3 = this.isAdmin;
        if (i3 == 0 || z3) {
            if (i == 0) {
                if (this.isEmpty) {
                    return 2;
                }
                return z3 ? 3 : 4;
            }
            if (this.isEmpty) {
                return 1;
            }
            if (this.sortType != 2) {
                int i4 = i - 1;
                if (i4 < arrayList.size()) {
                    int size = map.get(arrayList.get(i4)).size();
                    arrayList.size();
                    return size;
                }
            } else if (i == 1) {
                if (this.onlineContacts.isEmpty()) {
                    return 0;
                }
                return this.onlineContacts.size();
            }
        } else {
            if (this.isEmpty) {
                return 1;
            }
            if (i < arrayList.size()) {
                int size2 = map.get(arrayList.get(i)).size();
                return (i != arrayList.size() - 1 || z2) ? size2 + 1 : size2;
            }
        }
        if (z2) {
            return ContactsController.getInstance(i2).phoneBookContacts.size();
        }
        return 0;
    }

    @Override
    public final int getHash(int i, int i2) {
        return Objects.hash(Integer.valueOf(i * (-49612)), getItem(i, i2));
    }

    @Override
    public final Object getItem(int i, int i2) {
        int i3;
        boolean z = this.isEmptyWithMainTabs;
        int i4 = this.currentAccount;
        if (z && i == 1 && i2 > 1 && (i3 = i2 - 2) < ContactsController.getInstance(i4).phoneBookContacts.size()) {
            return ContactsController.getInstance(i4).phoneBookContacts.get(i3);
        }
        if (getItemViewType(i, i2) == 2) {
            return "Header";
        }
        int i5 = this.onlyUsers;
        ContactsController contactsController = ContactsController.getInstance(i4);
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = i5 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i4);
        ArrayList<String> arrayList = i5 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (i5 != 0 && !this.isAdmin) {
            if (i < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = map.get(arrayList.get(i));
                if (i2 < arrayList2.size()) {
                    return MessagesController.getInstance(i4).getUser(Long.valueOf(arrayList2.get(i2).user_id));
                }
            }
            return null;
        }
        if (i == 0) {
            return null;
        }
        if (this.sortType != 2) {
            int i6 = i - 1;
            if (i6 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList3 = map.get(arrayList.get(i6));
                if (i2 < arrayList3.size()) {
                    return MessagesController.getInstance(i4).getUser(Long.valueOf(arrayList3.get(i2).user_id));
                }
                return null;
            }
        } else if (i == 1) {
            if (i2 < this.onlineContacts.size()) {
                return MessagesController.getInstance(i4).getUser(Long.valueOf(((TLRPC.TL_contact) this.onlineContacts.get(i2)).user_id));
            }
            return null;
        }
        if (!this.needPhonebook || i2 < 0 || i2 >= ContactsController.getInstance(i4).phoneBookContacts.size()) {
            return null;
        }
        return ContactsController.getInstance(i4).phoneBookContacts.get(i2);
    }

    @Override
    public final int getItemViewType(int i, int i2) {
        if (this.isEmptyWithMainTabs) {
            if (i == 0) {
                return 4;
            }
            if (i != 1) {
                return 8;
            }
            if (i2 == 0) {
                return 5;
            }
            return i2 == 1 ? 7 : 8;
        }
        int i3 = this.onlyUsers;
        int i4 = this.currentAccount;
        ContactsController contactsController = ContactsController.getInstance(i4);
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = i3 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
        ContactsController contactsController2 = ContactsController.getInstance(i4);
        ArrayList<String> arrayList = i3 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        boolean z = this.isAdmin;
        if (i3 != 0 && !z) {
            if (this.isEmpty) {
                return 4;
            }
            return i2 < map.get(arrayList.get(i)).size() ? 0 : 3;
        }
        if (i == 0) {
            if (z) {
                if (i2 == 1) {
                    return 5;
                }
                if (i2 == 2) {
                    int i5 = this.sortType;
                    return (i5 == 1 || i5 == 2) ? 7 : 2;
                }
            } else if (this.needPhonebook) {
                if (i2 < 2) {
                    return 1;
                }
                if (i2 == 2) {
                    return 5;
                }
                if (i2 == 3) {
                    if (this.isEmpty) {
                        return 5;
                    }
                    int i6 = this.sortType;
                    return (i6 == 1 || i6 == 2) ? 7 : 2;
                }
            } else {
                if (i2 == 2) {
                    return 5;
                }
                if (i2 == 3) {
                    if (this.isEmpty) {
                        return 5;
                    }
                    int i7 = this.sortType;
                    return (i7 == 1 || i7 == 2) ? 7 : 2;
                }
            }
        } else {
            if (this.isEmpty) {
                return 4;
            }
            if (this.sortType != 2) {
                int i8 = i - 1;
                if (i8 < arrayList.size()) {
                    return i2 < map.get(arrayList.get(i8)).size() ? 0 : 3;
                }
            } else if (i == 1) {
                return i2 < this.onlineContacts.size() ? 0 : 3;
            }
        }
        return 1;
    }

    @Override
    public final String getLetter(int i) {
        if (this.sortType != 2 && !this.isEmpty) {
            int i2 = this.currentAccount;
            int i3 = this.onlyUsers;
            ContactsController contactsController = ContactsController.getInstance(i2);
            ArrayList<String> arrayList = i3 == 2 ? contactsController.sortedUsersMutualSectionsArray : contactsController.sortedUsersSectionsArray;
            int sectionForPosition = getSectionForPosition(i);
            if (sectionForPosition == -1) {
                sectionForPosition = arrayList.size() - 1;
            }
            if (i3 == 0 || this.isAdmin) {
                if (sectionForPosition > 0 && sectionForPosition <= arrayList.size()) {
                    return arrayList.get(sectionForPosition - 1);
                }
            } else if (sectionForPosition >= 0 && sectionForPosition < arrayList.size()) {
                return arrayList.get(sectionForPosition);
            }
        }
        return null;
    }

    @Override
    public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
        iArr[0] = (int) (getItemCount() * f);
        iArr[1] = 0;
    }

    @Override
    public final View getSectionHeaderView$1(int i, View view) {
        int i2 = this.currentAccount;
        int i3 = this.onlyUsers;
        ContactsController contactsController = ContactsController.getInstance(i2);
        if (i3 == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = contactsController.usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> map2 = contactsController.usersSectionsDict;
        }
        ContactsController contactsController2 = ContactsController.getInstance(i2);
        ArrayList<String> arrayList = i3 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
        if (view == null) {
            view = new LetterSectionCell(this.mContext);
        }
        LetterSectionCell letterSectionCell = (LetterSectionCell) view;
        if (this.sortType == 2 || this.disableSections || this.isEmpty) {
            letterSectionCell.setLetter("");
            return view;
        }
        if (i3 != 0 && !this.isAdmin) {
            if (i < arrayList.size()) {
                letterSectionCell.setLetter(arrayList.get(i));
                return view;
            }
            letterSectionCell.setLetter("");
            return view;
        }
        if (i == 0) {
            letterSectionCell.setLetter("");
            return view;
        }
        int i4 = i - 1;
        if (i4 < arrayList.size()) {
            letterSectionCell.setLetter(arrayList.get(i4));
            return view;
        }
        letterSectionCell.setLetter("");
        return view;
    }

    @Override
    public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
        if (!this.isEmptyWithMainTabs) {
            int i3 = this.onlyUsers;
            int i4 = this.currentAccount;
            ContactsController contactsController = ContactsController.getInstance(i4);
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = i3 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict;
            ContactsController contactsController2 = ContactsController.getInstance(i4);
            ArrayList<String> arrayList = i3 == 2 ? contactsController2.sortedUsersMutualSectionsArray : contactsController2.sortedUsersSectionsArray;
            boolean z = this.isAdmin;
            if (i3 == 0 || z) {
                if (i == 0) {
                    if (z) {
                        if (i2 >= 1) {
                            return false;
                        }
                    } else if (this.needPhonebook) {
                        if (i2 >= 2) {
                            return false;
                        }
                    } else if (i2 >= 3) {
                        return false;
                    }
                } else {
                    if (this.isEmpty) {
                        return false;
                    }
                    if (this.sortType != 2) {
                        int i5 = i - 1;
                        if (i5 < arrayList.size() && i2 >= map.get(arrayList.get(i5)).size()) {
                            return false;
                        }
                    } else if (i == 1 && i2 >= this.onlineContacts.size()) {
                        return false;
                    }
                }
            } else if (this.isEmpty || i2 >= map.get(arrayList.get(i)).size()) {
                return false;
            }
        } else if (i != 1 || i2 <= 1) {
            return false;
        }
        return true;
    }

    @Override
    public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
        ArrayList<TLRPC.TL_contact> arrayList;
        int i3 = viewHolder.mItemViewType;
        int i4 = 7;
        boolean z = this.isAdmin;
        int i5 = this.currentAccount;
        View view = viewHolder.itemView;
        if (i3 == 0) {
            UserCell userCell = (UserCell) view;
            userCell.storyParams.drawSegments = false;
            if (this.sortType != 2 && !this.disableSections) {
                i4 = 58;
            }
            userCell.setAvatarPadding(i4, 1);
            if (this.sortType == 2) {
                arrayList = this.onlineContacts;
            } else {
                int i6 = this.onlyUsers;
                ContactsController contactsController = ContactsController.getInstance(i5);
                arrayList = (i6 == 2 ? contactsController.usersMutualSectionsDict : contactsController.usersSectionsDict).get((i6 == 2 ? ContactsController.getInstance(i5).sortedUsersMutualSectionsArray : ContactsController.getInstance(i5).sortedUsersSectionsArray).get(i - ((i6 == 0 || z) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(i5).getUser(Long.valueOf(arrayList.get(i2).user_id));
            userCell.setData(user, null, null, false);
            userCell.setChecked(this.selectedContacts.indexOfKey(user.id) >= 0, false);
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                GraySectionCell graySectionCell = (GraySectionCell) view;
                int i7 = this.sortType;
                if (i7 == 0) {
                    graySectionCell.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i7 == 1) {
                    graySectionCell.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (i3 == 4) {
                view.setPadding(0, AndroidUtilities.dp(!this.hasPhonebook ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (i3 != 7) {
                if (i3 != 8) {
                    return;
                }
                InviteUserCell inviteUserCell = (InviteUserCell) view;
                int i8 = i2 - 2;
                if (i8 < 0 || i8 >= ContactsController.getInstance(i5).phoneBookContacts.size()) {
                    return;
                }
                inviteUserCell.currentContact = ContactsController.getInstance(i5).phoneBookContacts.get(i8);
                inviteUserCell.currentName = null;
                inviteUserCell.update();
                return;
            }
            HeaderCell headerCell = (HeaderCell) view;
            if (this.isEmptyWithMainTabs && i2 == 1 && i == 1) {
                headerCell.setText(LocaleController.getString(R.string.InviteFriends));
                return;
            } else if (this.sortType == 1) {
                headerCell.setText(LocaleController.getString(R.string.SortedByName));
                return;
            } else {
                headerCell.setText(LocaleController.getString(R.string.SortedByLastSeen));
                return;
            }
        }
        TextCell textCell = (TextCell) view;
        boolean z2 = this.needPhonebook;
        if (z2 || !z) {
            int i9 = Theme.key_windowBackgroundWhiteBlackText;
            textCell.setColors(i9, i9);
        } else {
            int i10 = Theme.key_telegram_color_text;
            textCell.setColors(i10, i10);
        }
        if (i != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(i5).phoneBookContacts.get(i2);
            String str = contact.first_name;
            if (str == null || contact.last_name == null) {
                if (str == null || contact.last_name != null) {
                    textCell.setText(contact.last_name, false);
                    return;
                } else {
                    textCell.setText(str, false);
                    return;
                }
            }
            textCell.setText(contact.first_name + " " + contact.last_name, false);
            return;
        }
        if (z2) {
            if (i2 == 0) {
                textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i2 == 1) {
                    textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z) {
            if (this.isChannel) {
                textCell.setTextAndIcon(R.drawable.msg_link2, (CharSequence) LocaleController.getString(R.string.ChannelInviteViaLink), false);
                return;
            } else {
                textCell.setTextAndIcon(R.drawable.msg_link2, (CharSequence) LocaleController.getString(R.string.InviteToGroupByLink), false);
                return;
            }
        }
        if (i2 == 0) {
            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i2 == 1) {
            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View headerCell;
        View textCell;
        View view;
        if (i != 0) {
            Context context = this.mContext;
            if (i == 1) {
                textCell = new TextCell(context);
            } else if (i == 2) {
                textCell = new GraySectionCell(context, 16, null);
            } else if (i != 3) {
                if (i == 4) {
                    IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, context, viewGroup, 1);
                    anonymousClass1.addView(new ContactsEmptyView(context), LayoutHelper.createFrame(-1, -2, 17));
                    anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    anonymousClass1.setTag(-33024);
                    view = anonymousClass1;
                } else if (i == 7) {
                    headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 14, 5, false, false, null);
                } else if (i == 8) {
                    textCell = new InviteUserCell(context, false);
                } else if (i != 9) {
                    textCell = new ShadowSectionCell(context, (Object) null);
                } else {
                    PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(context, 2);
                    anonymousClass2.setId(9);
                    anonymousClass2.setTag(-33024);
                    view = anonymousClass2;
                }
                textCell = view;
            } else {
                DividerCell dividerCell = new DividerCell(context, null);
                dividerCell.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
                textCell = dividerCell;
            }
            return new RecyclerListView.Holder(textCell);
        }
        UserCell userCell = new UserCell(58, 1, this.mContext, null, false, false);
        userCell.setCallCellStyle(58);
        headerCell = userCell;
        textCell = headerCell;
        return new RecyclerListView.Holder(textCell);
    }

    public final void setSortType(int i, boolean z) {
        this.sortType = i;
        if (i != 2) {
            notifyDataSetChanged();
            return;
        }
        if (this.onlineContacts == null || z) {
            int i2 = this.currentAccount;
            this.onlineContacts = new ArrayList(ContactsController.getInstance(i2).contacts);
            long j = UserConfig.getInstance(i2).clientUserId;
            int size = this.onlineContacts.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((TLRPC.TL_contact) this.onlineContacts.get(i3)).user_id == j) {
                    this.onlineContacts.remove(i3);
                    break;
                }
            }
        }
        sortOnlineContacts();
    }

    public final void sortOnlineContacts() {
        int i = this.currentAccount;
        if (this.onlineContacts == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            Collections.sort(this.onlineContacts, new DialogsAdapter$$ExternalSyntheticLambda0(MessagesController.getInstance(i), currentTime, 1));
            notifyDataSetChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
