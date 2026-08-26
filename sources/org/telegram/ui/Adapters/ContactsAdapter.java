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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatLoadingCell;
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
import org.telegram.ui.web.AddressBarList;

public abstract class ContactsAdapter extends RecyclerListView.SectionsAdapter {
    private static final int DIVIDER_CELL = 3;
    private static final int EMPTY_CELL = 4;
    private static final int GRAY_CELL = 2;
    private static final int HEADER_CELL = 7;
    public static final int ID_SEARCH = 9;
    private static final int INVITE_CELL = 8;
    private static final int SEARCH_CELL = 9;
    private static final int SHADOW_CELL = 5;
    public static final int SORT_TYPE_BY_NAME = 1;
    public static final int SORT_TYPE_BY_TIME = 2;
    public static final int SORT_TYPE_NONE = 0;
    private static final int TEXT_CELL = 1;
    private static final int USER_CELL = 0;
    private final int currentAccount = UserConfig.selectedAccount;
    private boolean disableSections;
    BaseFragment fragment;
    private boolean hasPhonebook;
    private final LongSparseArray ignoreUsers;
    public boolean includeSearch;
    private final boolean isAdmin;
    private final boolean isChannel;
    private boolean isEmpty;
    public boolean isEmptyWithMainTabs;
    private final Context mContext;
    private final boolean needPhonebook;
    private ArrayList<TLRPC.TL_contact> onlineContacts;
    private final int onlyUsers;
    private final LongSparseArray selectedContacts;
    private int sortType;

    public ContactsAdapter(Context context, BaseFragment baseFragment, int i, boolean z, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, int i2) {
        this.mContext = context;
        this.onlyUsers = i;
        this.needPhonebook = z;
        this.ignoreUsers = longSparseArray;
        this.selectedContacts = longSparseArray2;
        this.isAdmin = i2 != 0;
        this.isChannel = i2 == 2;
        this.fragment = baseFragment;
    }

    public static int lambda$sortOnlineContacts$0(MessagesController messagesController, int i, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        int i2;
        int i3;
        TLRPC.User user = messagesController.getUser(Long.valueOf(tL_contact2.user_id));
        TLRPC.User user2 = messagesController.getUser(Long.valueOf(tL_contact.user_id));
        if (user == null) {
            i2 = 0;
        } else if (user.self) {
            i2 = i + 50000;
        } else {
            TLRPC.UserStatus userStatus = user.status;
            if (userStatus != null) {
                i2 = userStatus.expires;
            } else {
                i2 = 0;
            }
        }
        if (user2 == null) {
            i3 = 0;
        } else if (user2.self) {
            i3 = i + 50000;
        } else {
            TLRPC.UserStatus userStatus2 = user2.status;
            if (userStatus2 != null) {
                i3 = userStatus2.expires;
            } else {
                i3 = 0;
            }
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

    @Override
    public int getCountForSection(int i) {
        if (this.isEmptyWithMainTabs) {
            if (i == 0) {
                return (this.includeSearch ? 1 : 0) + 1;
            }
            if (i == 1) {
                return ContactsController.getInstance(this.currentAccount).phoneBookContacts.size() + 2;
            }
            return 0;
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).usersMutualSectionsDict : ContactsController.getInstance(this.currentAccount).usersSectionsDict;
        ArrayList<String> arrayList = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
        if (this.onlyUsers == 0 || this.isAdmin) {
            if (i == 0) {
                if (this.isEmpty) {
                    return (this.includeSearch ? 1 : 0) + 2;
                }
                if (this.isAdmin) {
                    return (this.includeSearch ? 1 : 0) + 3;
                }
                return this.needPhonebook ? (this.includeSearch ? 1 : 0) + 4 : (this.includeSearch ? 1 : 0) + 4;
            }
            if (this.isEmpty) {
                return 1;
            }
            if (this.sortType != 2) {
                int i2 = i - 1;
                if (i2 < arrayList.size()) {
                    int size = map.get(arrayList.get(i2)).size();
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
                return (i != arrayList.size() - 1 || this.needPhonebook) ? size2 + 1 : size2;
            }
        }
        if (this.needPhonebook) {
            return ContactsController.getInstance(this.currentAccount).phoneBookContacts.size();
        }
        return 0;
    }

    @Override
    public int getHash(int i, int i2) {
        return Objects.hash(Integer.valueOf(i * (-49612)), getItem(i, i2));
    }

    @Override
    public Object getItem(int i, int i2) {
        int i3;
        if (this.isEmptyWithMainTabs && i == 1 && i2 > 1 && (i3 = i2 - 2) < ContactsController.getInstance(this.currentAccount).phoneBookContacts.size()) {
            return ContactsController.getInstance(this.currentAccount).phoneBookContacts.get(i3);
        }
        if (getItemViewType(i, i2) == 2) {
            return "Header";
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).usersMutualSectionsDict : ContactsController.getInstance(this.currentAccount).usersSectionsDict;
        ArrayList<String> arrayList = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
        if (this.onlyUsers != 0 && !this.isAdmin) {
            if (i < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList2 = map.get(arrayList.get(i));
                if (i2 < arrayList2.size()) {
                    return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList2.get(i2).user_id));
                }
            }
            return null;
        }
        if (i == 0) {
            return null;
        }
        if (this.sortType != 2) {
            int i4 = i - 1;
            if (i4 < arrayList.size()) {
                ArrayList<TLRPC.TL_contact> arrayList3 = map.get(arrayList.get(i4));
                if (i2 < arrayList3.size()) {
                    return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList3.get(i2).user_id));
                }
                return null;
            }
        } else if (i == 1) {
            if (i2 < this.onlineContacts.size()) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.onlineContacts.get(i2).user_id));
            }
            return null;
        }
        if (!this.needPhonebook || i2 < 0 || i2 >= ContactsController.getInstance(this.currentAccount).phoneBookContacts.size()) {
            return null;
        }
        return ContactsController.getInstance(this.currentAccount).phoneBookContacts.get(i2);
    }

    @Override
    public int getItemViewType(int i, int i2) {
        if (i == 0 && this.includeSearch) {
            if (i2 == 0) {
                return 9;
            }
            i2--;
        }
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
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).usersMutualSectionsDict : ContactsController.getInstance(this.currentAccount).usersSectionsDict;
        ArrayList<String> arrayList = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
        if (this.onlyUsers != 0 && !this.isAdmin) {
            if (this.isEmpty) {
                return 4;
            }
            return i2 < map.get(arrayList.get(i)).size() ? 0 : 3;
        }
        if (i == 0) {
            if (this.isAdmin) {
                if (i2 == 1) {
                    return 5;
                }
                if (i2 == 2) {
                    int i3 = this.sortType;
                    return (i3 == 1 || i3 == 2) ? 7 : 2;
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
                    int i4 = this.sortType;
                    return (i4 == 1 || i4 == 2) ? 7 : 2;
                }
            } else {
                if (i2 == 2) {
                    return 5;
                }
                if (i2 == 3) {
                    if (this.isEmpty) {
                        return 5;
                    }
                    int i5 = this.sortType;
                    return (i5 == 1 || i5 == 2) ? 7 : 2;
                }
            }
        } else {
            if (this.isEmpty) {
                return 4;
            }
            if (this.sortType != 2) {
                int i6 = i - 1;
                if (i6 < arrayList.size()) {
                    return i2 < map.get(arrayList.get(i6)).size() ? 0 : 3;
                }
            } else if (i == 1) {
                return i2 < this.onlineContacts.size() ? 0 : 3;
            }
        }
        return 1;
    }

    @Override
    public String getLetter(int i) {
        if (this.includeSearch) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        if (this.sortType != 2 && !this.isEmpty) {
            ArrayList<String> arrayList = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
            int sectionForPosition = getSectionForPosition(i);
            if (sectionForPosition == -1) {
                sectionForPosition = arrayList.size() - 1;
            }
            if (this.onlyUsers == 0 || this.isAdmin) {
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
    public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
        iArr[0] = (int) (getItemCount() * f);
        iArr[1] = 0;
    }

    @Override
    public int getSectionCount() {
        int size;
        boolean zIsEmpty;
        boolean z = false;
        this.isEmpty = false;
        if (this.sortType != 2) {
            size = (this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray).size();
            if (size == 0) {
                this.isEmpty = true;
            }
            if (this.onlyUsers == 0) {
                size++;
            }
            if (this.isAdmin) {
                size++;
            }
            zIsEmpty = ContactsController.getInstance(this.currentAccount).phoneBookContacts.isEmpty();
            this.hasPhonebook = !zIsEmpty;
            if (this.isEmpty && this.needPhonebook && !this.isAdmin && this.onlyUsers == 0) {
                z = true;
            }
            this.isEmptyWithMainTabs = z;
            if (z) {
                return size;
            }
            if (zIsEmpty) {
                return 1;
            }
            return 2;
        }
        this.isEmpty = this.onlineContacts.isEmpty();
        size = 1;
        if (this.onlyUsers == 0) {
            size++;
        }
        if (this.isAdmin) {
            size++;
        }
        zIsEmpty = ContactsController.getInstance(this.currentAccount).phoneBookContacts.isEmpty();
        this.hasPhonebook = !zIsEmpty;
        if (this.isEmpty) {
            z = true;
        }
        this.isEmptyWithMainTabs = z;
        if (z) {
            return size;
        }
        if (zIsEmpty) {
            return 2;
        }
        return 1;
    }

    @Override
    public View getSectionHeaderView(int i, View view) {
        if (this.onlyUsers == 2) {
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = ContactsController.getInstance(this.currentAccount).usersMutualSectionsDict;
        } else {
            HashMap<String, ArrayList<TLRPC.TL_contact>> map2 = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
        }
        ArrayList<String> arrayList = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
        if (view == null) {
            view = new LetterSectionCell(this.mContext);
        }
        LetterSectionCell letterSectionCell = (LetterSectionCell) view;
        if (this.sortType == 2 || this.disableSections || this.isEmpty) {
            letterSectionCell.setLetter("");
            return view;
        }
        if (this.onlyUsers != 0 && !this.isAdmin) {
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
        int i2 = i - 1;
        if (i2 < arrayList.size()) {
            letterSectionCell.setLetter(arrayList.get(i2));
            return view;
        }
        letterSectionCell.setLetter("");
        return view;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        if (this.isEmptyWithMainTabs) {
            return i == 1 && i2 > 1;
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).usersMutualSectionsDict : ContactsController.getInstance(this.currentAccount).usersSectionsDict;
        ArrayList<String> arrayList = this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
        if (this.onlyUsers != 0 && !this.isAdmin) {
            return !this.isEmpty && i2 < map.get(arrayList.get(i)).size();
        }
        if (i == 0) {
            if (this.isAdmin) {
                return i2 < 1;
            }
            if (this.needPhonebook) {
                return i2 < 2;
            }
            return i2 < 3;
        }
        if (this.isEmpty) {
            return false;
        }
        if (this.sortType == 2) {
            return i != 1 || i2 < this.onlineContacts.size();
        }
        int i3 = i - 1;
        return i3 >= arrayList.size() || i2 < map.get(arrayList.get(i3)).size();
        return true;
    }

    @Override
    public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
        int i3;
        ArrayList<TLRPC.TL_contact> arrayList;
        if (i != 0 || !this.includeSearch) {
            i3 = i2;
        } else if (i2 == 0) {
            return;
        } else {
            i3 = i2 - 1;
        }
        int itemViewType = viewHolder.getItemViewType();
        int i4 = 7;
        if (itemViewType == 0) {
            UserCell userCell = (UserCell) viewHolder.itemView;
            userCell.storyParams.drawSegments = false;
            if (this.sortType != 2 && !this.disableSections) {
                i4 = 58;
            }
            userCell.setAvatarPadding(i4, 1);
            if (this.sortType == 2) {
                arrayList = this.onlineContacts;
            } else {
                arrayList = (this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).usersMutualSectionsDict : ContactsController.getInstance(this.currentAccount).usersSectionsDict).get((this.onlyUsers == 2 ? ContactsController.getInstance(this.currentAccount).sortedUsersMutualSectionsArray : ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray).get(i - ((this.onlyUsers == 0 || this.isAdmin) ? 1 : 0)));
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i3).user_id));
            userCell.setData(user, null, null, 0);
            userCell.setChecked(this.selectedContacts.indexOfKey(user.id) >= 0, false);
            LongSparseArray longSparseArray = this.ignoreUsers;
            if (longSparseArray != null) {
                if (longSparseArray.indexOfKey(user.id) >= 0) {
                    userCell.setAlpha(0.5f);
                    return;
                } else {
                    userCell.setAlpha(1.0f);
                    return;
                }
            }
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType == 2) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                int i5 = this.sortType;
                if (i5 == 0) {
                    graySectionCell.setText(LocaleController.getString(R.string.Contacts));
                    return;
                } else if (i5 == 1) {
                    graySectionCell.setText(LocaleController.getString(R.string.SortedByName));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.SortedByLastSeen));
                    return;
                }
            }
            if (itemViewType == 4) {
                viewHolder.itemView.setPadding(0, AndroidUtilities.dp(!this.hasPhonebook ? 96.0f : 25.0f), 0, AndroidUtilities.dp(18.0f));
                return;
            }
            if (itemViewType != 7) {
                if (itemViewType != 8) {
                    return;
                }
                InviteUserCell inviteUserCell = (InviteUserCell) viewHolder.itemView;
                int i6 = i3 - 2;
                if (i6 < 0 || i6 >= ContactsController.getInstance(this.currentAccount).phoneBookContacts.size()) {
                    return;
                }
                inviteUserCell.currentContact = ContactsController.getInstance(this.currentAccount).phoneBookContacts.get(i6);
                inviteUserCell.currentName = null;
                inviteUserCell.update();
                return;
            }
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            if (this.isEmptyWithMainTabs && i3 == 1 && i == 1) {
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
        TextCell textCell = (TextCell) viewHolder.itemView;
        if (this.needPhonebook || !this.isAdmin) {
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            textCell.setColors(i7, i7);
        } else {
            int i8 = Theme.key_telegram_color_text;
            textCell.setColors(i8, i8);
        }
        if (i != 0) {
            ContactsController.Contact contact = ContactsController.getInstance(this.currentAccount).phoneBookContacts.get(i3);
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
        if (this.needPhonebook) {
            if (i3 == 0) {
                textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.InviteFriends), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i3 == 1) {
                    textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.RecentCalls), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (this.isAdmin) {
            if (this.isChannel) {
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ChannelInviteViaLink), R.drawable.msg_link2, false);
                return;
            } else {
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.InviteToGroupByLink), R.drawable.msg_link2, false);
                return;
            }
        }
        if (i3 == 0) {
            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NewGroup), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i3 == 1) {
            textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.NewChannel), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View headerCell;
        View view;
        if (i == 0) {
            UserCell userCell = new UserCell(58, 1, this.mContext, null, false, false);
            userCell.setCallCellStyle(58);
            headerCell = userCell;
        } else if (i == 1) {
            headerCell = new TextCell(this.mContext);
        } else if (i == 2) {
            headerCell = new GraySectionCell(this.mContext, 16, null);
        } else if (i != 3) {
            if (i == 4) {
                ChatLoadingCell.AnonymousClass1 anonymousClass1 = new ChatLoadingCell.AnonymousClass1(this, this.mContext, viewGroup, 1);
                anonymousClass1.addView(new ContactsEmptyView(this.mContext), LayoutHelper.createFrame(-1, -2, 17));
                anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                anonymousClass1.setTag(-33024);
                view = anonymousClass1;
            } else if (i == 7) {
                headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 14, 5, false, false, null);
            } else if (i == 8) {
                headerCell = new InviteUserCell(this.mContext, false);
            } else if (i != 9) {
                headerCell = new ShadowSectionCell(this.mContext, null, 0);
            } else {
                AddressBarList.AnonymousClass2 anonymousClass2 = new AddressBarList.AnonymousClass2(this.mContext, 1);
                anonymousClass2.setId(9);
                anonymousClass2.setTag(-33024);
                view = anonymousClass2;
            }
            headerCell = view;
        } else {
            DividerCell dividerCell = new DividerCell(this.mContext, null);
            dividerCell.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : 72.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 28.0f), AndroidUtilities.dp(8.0f));
            headerCell = dividerCell;
        }
        return new RecyclerListView.Holder(headerCell);
    }

    public void setDisableSections(boolean z) {
        this.disableSections = z;
    }

    public void setSortType(int i, boolean z) {
        this.sortType = i;
        if (i != 2) {
            notifyDataSetChanged();
            return;
        }
        if (this.onlineContacts == null || z) {
            this.onlineContacts = new ArrayList<>(ContactsController.getInstance(this.currentAccount).contacts);
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size = this.onlineContacts.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.onlineContacts.get(i2).user_id == j) {
                    this.onlineContacts.remove(i2);
                    break;
                }
            }
        }
        sortOnlineContacts();
    }

    public void sortOnlineContacts() {
        if (this.onlineContacts == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            Collections.sort(this.onlineContacts, new DialogsAdapter$$ExternalSyntheticLambda0(MessagesController.getInstance(this.currentAccount), currentTime, 1));
            notifyDataSetChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
