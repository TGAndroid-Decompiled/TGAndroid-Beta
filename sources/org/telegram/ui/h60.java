package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h60 implements Runnable {
    public final int f38690a;
    public final i60 f38691b;
    public final String f38692c;

    public h60(i60 i60Var, String str, int i9) {
        this.f38690a = i9;
        this.f38691b = i60Var;
        this.f38692c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        int i9;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c10;
        Object obj;
        switch (this.f38690a) {
            case 0:
                i60 i60Var = this.f38691b;
                String str2 = this.f38692c;
                i60Var.getClass();
                AndroidUtilities.runOnUIThread(new h60(i60Var, str2, 1));
                return;
            case 1:
                i60 i60Var2 = this.f38691b;
                String str3 = this.f38692c;
                of.v1 v1Var = i60Var2.f39034f;
                k60 k60Var = i60Var2.E;
                if (!k60Var.K && !k60Var.L) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                v1Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                h60 h60Var = new h60(i60Var2, str3, 2);
                i60Var2.h = h60Var;
                dispatchQueue.postRunnable(h60Var);
                return;
            default:
                i60 i60Var3 = this.f38691b;
                String str4 = this.f38692c;
                ArrayList arrayList2 = i60Var3.f39036r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new jq(i60Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                int i10 = 0;
                if (translitString != null) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                int i11 = i9 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i12);
                    boolean z11 = tLObject instanceof TLRPC.User;
                    if (z11) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        publicUsername = UserObject.getPublicUsername(user);
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            publicUsername = ChatObject.getPublicUsername(chat);
                        }
                        arrayList = arrayList2;
                        i12++;
                        arrayList2 = arrayList;
                        i10 = 0;
                    }
                    String translitString2 = LocaleController.getInstance().getTranslitString(str);
                    if (str.equals(translitString2)) {
                        translitString2 = null;
                    }
                    char c11 = 0;
                    while (i10 < i11) {
                        String str5 = strArr[i10];
                        if (!str.startsWith(str5) && !org.telegram.messenger.l0.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.l0.w(" ", str5, translitString2)))) {
                            if (publicUsername != null && publicUsername.startsWith(str5)) {
                                c10 = 2;
                            } else {
                                c10 = c11;
                            }
                        } else {
                            c10 = 1;
                        }
                        if (c10 != 0) {
                            arrayList = arrayList2;
                            if (c10 == 1) {
                                if (z11) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                String d = ta.b.d("@", publicUsername);
                                arrayList4.add(AndroidUtilities.generateSearchName(d, null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i12++;
                            arrayList2 = arrayList;
                            i10 = 0;
                        } else {
                            i10++;
                            arrayList2 = arrayList2;
                            c11 = c10;
                        }
                    }
                    arrayList = arrayList2;
                    i12++;
                    arrayList2 = arrayList;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new jq(i60Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
