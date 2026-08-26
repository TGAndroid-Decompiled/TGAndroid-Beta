package org.telegram.ui;

import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final UsersSelectActivity.GroupCreateAdapter f$0;
    public final String f$1;
    public final boolean f$2;
    public final boolean f$3;

    public UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(UsersSelectActivity.GroupCreateAdapter groupCreateAdapter, String str, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateAdapter;
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = z2;
    }

    @Override
    public final void run() {
        char c;
        String publicUsername;
        String str;
        String translitString;
        int i;
        char c2;
        String str2;
        int i2;
        String str3;
        switch (this.$r8$classId) {
            case 0:
                UsersSelectActivity.GroupCreateAdapter groupCreateAdapter = this.f$0;
                groupCreateAdapter.getClass();
                AndroidUtilities.runOnUIThread(new UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(groupCreateAdapter, this.f$1, this.f$2, this.f$3, 1));
                break;
            case 1:
                UsersSelectActivity.GroupCreateAdapter groupCreateAdapter2 = this.f$0;
                String str4 = this.f$1;
                boolean z = this.f$2;
                boolean z2 = this.f$3;
                groupCreateAdapter2.searchAdapterHelper.queryServerSearch(str4, true, z, z, UsersSelectActivity.this.allowSelf, false, 0L, false, 0, 0, 0L, null);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 usersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1 = new UsersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1(groupCreateAdapter2, str4, z2, z, 2);
                groupCreateAdapter2.searchRunnable = usersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1;
                dispatchQueue.postRunnable(usersSelectActivity$GroupCreateAdapter$$ExternalSyntheticLambda1);
                break;
            default:
                UsersSelectActivity.GroupCreateAdapter groupCreateAdapter3 = this.f$0;
                groupCreateAdapter3.getClass();
                String lowerCase = this.f$1.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    String str5 = null;
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    char c3 = 1;
                    int i3 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr[1] = translitString2;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList3 = groupCreateAdapter3.contacts;
                        if (i4 >= arrayList3.size()) {
                            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(groupCreateAdapter3, arrayList, arrayList2, 23));
                        } else {
                            TLObject tLObject = (TLObject) arrayList3.get(i4);
                            int i5 = 3;
                            String[] strArr2 = new String[3];
                            boolean z3 = tLObject instanceof TLRPC.User;
                            if (z3) {
                                TLRPC.User user = (TLRPC.User) tLObject;
                                c = 0;
                                strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user);
                                if (UserObject.isReplyUser(user)) {
                                    strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                } else if (UserObject.isUserSelf(user)) {
                                    if (UsersSelectActivity.this.allowSelf) {
                                        strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                    }
                                    i4++;
                                    str5 = str;
                                } else {
                                    if (!user.bot || this.f$2) {
                                    }
                                    i4++;
                                    str5 = str;
                                }
                                translitString = LocaleController.getInstance().getTranslitString(strArr2[c]);
                                strArr2[c3] = translitString;
                                if (strArr2[c].equals(translitString)) {
                                    strArr2[c3] = str5;
                                }
                                i = 0;
                                c2 = 0;
                                while (true) {
                                    if (i < i3) {
                                        str2 = strArr[i];
                                        i2 = 0;
                                        while (i2 < i5) {
                                            str3 = strArr2[i2];
                                            if (str3 != null && (str3.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, str3))) {
                                                c2 = 1;
                                                if (c2 == 0 && publicUsername != null && publicUsername.toLowerCase().startsWith(str2)) {
                                                    c2 = 2;
                                                }
                                                if (c2 != 0) {
                                                    c3 = 1;
                                                    if (c2 == 1) {
                                                        str = null;
                                                        arrayList2.add(AndroidUtilities.generateSearchName(zzil.m("@", publicUsername), null, "@" + str2));
                                                    } else if (z3) {
                                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                                        arrayList2.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                                        str = null;
                                                    } else {
                                                        str = null;
                                                        arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                                                    }
                                                    arrayList.add(tLObject);
                                                }
                                                c3 = 1;
                                                i++;
                                                str5 = null;
                                                i5 = 3;
                                            }
                                            i2++;
                                            i5 = 3;
                                            break;
                                        }
                                        if (c2 == 0) {
                                            c2 = 2;
                                        }
                                        if (c2 != 0) {
                                            c3 = 1;
                                            if (c2 == 1) {
                                                str = null;
                                                arrayList2.add(AndroidUtilities.generateSearchName(zzil.m("@", publicUsername), null, "@" + str2));
                                            } else if (z3) {
                                                TLRPC.User user3 = (TLRPC.User) tLObject;
                                                arrayList2.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str2));
                                                str = null;
                                            } else {
                                                str = null;
                                                arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                                            }
                                            arrayList.add(tLObject);
                                        }
                                        c3 = 1;
                                        i++;
                                        str5 = null;
                                        i5 = 3;
                                        break;
                                    }
                                }
                                i4++;
                                str5 = str;
                            } else {
                                c = 0;
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                strArr2[0] = chat.title.toLowerCase();
                                publicUsername = chat.username;
                                if (this.f$3) {
                                    translitString = LocaleController.getInstance().getTranslitString(strArr2[c]);
                                    strArr2[c3] = translitString;
                                    if (strArr2[c].equals(translitString)) {
                                        strArr2[c3] = str5;
                                    }
                                    i = 0;
                                    c2 = 0;
                                    while (true) {
                                        if (i < i3) {
                                            str2 = strArr[i];
                                            i2 = 0;
                                            while (i2 < i5) {
                                                str3 = strArr2[i2];
                                                if (str3 != null) {
                                                    c2 = 1;
                                                    if (c2 == 0) {
                                                        c2 = 2;
                                                    }
                                                    if (c2 != 0) {
                                                        c3 = 1;
                                                        if (c2 == 1) {
                                                            str = null;
                                                            arrayList2.add(AndroidUtilities.generateSearchName(zzil.m("@", publicUsername), null, "@" + str2));
                                                        } else if (z3) {
                                                            TLRPC.User user4 = (TLRPC.User) tLObject;
                                                            arrayList2.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str2));
                                                            str = null;
                                                        } else {
                                                            str = null;
                                                            arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                                                        }
                                                        arrayList.add(tLObject);
                                                    }
                                                    c3 = 1;
                                                    i++;
                                                    str5 = null;
                                                    i5 = 3;
                                                    break;
                                                }
                                                i2++;
                                                i5 = 3;
                                            }
                                            if (c2 == 0) {
                                                c2 = 2;
                                            }
                                            if (c2 != 0) {
                                                c3 = 1;
                                                if (c2 == 1) {
                                                    str = null;
                                                    arrayList2.add(AndroidUtilities.generateSearchName(zzil.m("@", publicUsername), null, "@" + str2));
                                                } else if (z3) {
                                                    TLRPC.User user5 = (TLRPC.User) tLObject;
                                                    arrayList2.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str2));
                                                    str = null;
                                                } else {
                                                    str = null;
                                                    arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str2));
                                                }
                                                arrayList.add(tLObject);
                                            }
                                            c3 = 1;
                                            i++;
                                            str5 = null;
                                            i5 = 3;
                                            break;
                                        }
                                    }
                                }
                                i4++;
                                str5 = str;
                            }
                            str = str5;
                            i4++;
                            str5 = str;
                        }
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda8(groupCreateAdapter3, new ArrayList(), new ArrayList(), 23));
                }
                break;
        }
    }
}
