package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ng1 implements Runnable {

    public final int f40829a;

    public final og1 f40830b;

    public final String f40831c;
    public final boolean d;

    public final boolean f40832e;

    public ng1(og1 og1Var, String str, boolean z10, boolean z11, int i10) {
        this.f40829a = i10;
        this.f40830b = og1Var;
        this.f40831c = str;
        this.d = z10;
        this.f40832e = z11;
    }

    @Override
    public final void run() {
        String str;
        char c10;
        String publicUsername;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        String translitString;
        int i10;
        char c11;
        String str2;
        int i11;
        String str3;
        String str4;
        switch (this.f40829a) {
            case 0:
                og1 og1Var = this.f40830b;
                String str5 = this.f40831c;
                boolean z12 = this.d;
                boolean z13 = this.f40832e;
                og1Var.getClass();
                AndroidUtilities.runOnUIThread(new ng1(og1Var, str5, z12, z13, 1));
                break;
            case 1:
                og1 og1Var2 = this.f40830b;
                String str6 = this.f40831c;
                boolean z14 = this.d;
                boolean z15 = this.f40832e;
                og1Var2.f41094f.g(str6, true, z14, z14, og1Var2.v.C, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                ng1 ng1Var = new ng1(og1Var2, str6, z15, z14, 2);
                og1Var2.h = ng1Var;
                dispatchQueue.postRunnable(ng1Var);
                break;
            default:
                og1 og1Var3 = this.f40830b;
                String str7 = this.f40831c;
                boolean z16 = this.d;
                boolean z17 = this.f40832e;
                ArrayList arrayList2 = og1Var3.f41096r;
                String lowerCase = str7.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new pc1(og1Var3, new ArrayList(), new ArrayList(), 6));
                } else {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i12 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (translitString2 != null) {
                        strArr[1] = translitString2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i13);
                        String[] strArr2 = new String[3];
                        boolean z18 = tLObject instanceof TLRPC.User;
                        if (z18) {
                            str = null;
                            TLRPC.User user = (TLRPC.User) tLObject;
                            c10 = 1;
                            strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            publicUsername = UserObject.getPublicUsername(user);
                            if (UserObject.isReplyUser(user)) {
                                strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                            } else if (UserObject.isUserSelf(user)) {
                                if (og1Var3.v.C) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                i13++;
                                arrayList2 = arrayList;
                                z16 = z10;
                                z17 = z11;
                            } else {
                                if (!user.bot || z16) {
                                }
                                i13++;
                                arrayList2 = arrayList;
                                z16 = z10;
                                z17 = z11;
                            }
                            translitString = LocaleController.getInstance().getTranslitString(strArr2[0]);
                            strArr2[c10] = translitString;
                            if (strArr2[0].equals(translitString)) {
                                strArr2[c10] = str;
                            }
                            i10 = 0;
                            c11 = 0;
                            while (true) {
                                if (i10 < i12) {
                                    z10 = z16;
                                    str2 = strArr[i10];
                                    z11 = z17;
                                    arrayList = arrayList2;
                                    for (i11 = 0; i11 < 3; i11++) {
                                        str4 = strArr2[i11];
                                        if (str4 != null && (str4.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, str4))) {
                                            c11 = 1;
                                            if (c11 == 0 && publicUsername != null && publicUsername.toLowerCase().startsWith(str2)) {
                                                c11 = 2;
                                            }
                                            if (c11 != 0) {
                                                if (c11 == 1) {
                                                    str3 = str;
                                                    arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), str3, "@" + str2));
                                                } else if (z18) {
                                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                                    arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                                    str3 = str;
                                                } else {
                                                    str3 = str;
                                                    arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str2));
                                                }
                                                arrayList3.add(tLObject);
                                            }
                                            i10++;
                                            arrayList2 = arrayList;
                                            z16 = z10;
                                            z17 = z11;
                                        }
                                        break;
                                    }
                                    if (c11 == 0) {
                                        c11 = 2;
                                    }
                                    if (c11 != 0) {
                                        if (c11 == 1) {
                                            str3 = str;
                                            arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), str3, "@" + str2));
                                        } else if (z18) {
                                            TLRPC.User user3 = (TLRPC.User) tLObject;
                                            arrayList4.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str2));
                                            str3 = str;
                                        } else {
                                            str3 = str;
                                            arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str2));
                                        }
                                        arrayList3.add(tLObject);
                                    }
                                    i10++;
                                    arrayList2 = arrayList;
                                    z16 = z10;
                                    z17 = z11;
                                    break;
                                }
                            }
                            i13++;
                            arrayList2 = arrayList;
                            z16 = z10;
                            z17 = z11;
                        } else {
                            str = null;
                            c10 = 1;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[0] = chat.title.toLowerCase();
                            publicUsername = chat.username;
                            if (z17) {
                                translitString = LocaleController.getInstance().getTranslitString(strArr2[0]);
                                strArr2[c10] = translitString;
                                if (strArr2[0].equals(translitString)) {
                                    strArr2[c10] = str;
                                }
                                i10 = 0;
                                c11 = 0;
                                while (true) {
                                    if (i10 < i12) {
                                        z10 = z16;
                                        str2 = strArr[i10];
                                        z11 = z17;
                                        arrayList = arrayList2;
                                        while (i11 < 3) {
                                            str4 = strArr2[i11];
                                            if (str4 != null) {
                                                c11 = 1;
                                                if (c11 == 0) {
                                                    c11 = 2;
                                                }
                                                if (c11 != 0) {
                                                    if (c11 == 1) {
                                                        str3 = str;
                                                        arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), str3, "@" + str2));
                                                    } else if (z18) {
                                                        TLRPC.User user4 = (TLRPC.User) tLObject;
                                                        arrayList4.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str2));
                                                        str3 = str;
                                                    } else {
                                                        str3 = str;
                                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str2));
                                                    }
                                                    arrayList3.add(tLObject);
                                                }
                                                i10++;
                                                arrayList2 = arrayList;
                                                z16 = z10;
                                                z17 = z11;
                                                break;
                                            }
                                        }
                                        if (c11 == 0) {
                                            c11 = 2;
                                        }
                                        if (c11 != 0) {
                                            if (c11 == 1) {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), str3, "@" + str2));
                                            } else if (z18) {
                                                TLRPC.User user5 = (TLRPC.User) tLObject;
                                                arrayList4.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str2));
                                                str3 = str;
                                            } else {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str2));
                                            }
                                            arrayList3.add(tLObject);
                                        }
                                        i10++;
                                        arrayList2 = arrayList;
                                        z16 = z10;
                                        z17 = z11;
                                        break;
                                    }
                                }
                            }
                            i13++;
                            arrayList2 = arrayList;
                            z16 = z10;
                            z17 = z11;
                        }
                        z10 = z16;
                        z11 = z17;
                        arrayList = arrayList2;
                        i13++;
                        arrayList2 = arrayList;
                        z16 = z10;
                        z17 = z11;
                    }
                    AndroidUtilities.runOnUIThread(new pc1(og1Var3, arrayList3, arrayList4, 6));
                }
                break;
        }
    }
}
