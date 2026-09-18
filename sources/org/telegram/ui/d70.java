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
public final class d70 implements Runnable {
    public final int f33031a;
    public final e70 f33032b;
    public final String f33033c;

    public d70(e70 e70Var, String str, int i10) {
        this.f33031a = i10;
        this.f33032b = e70Var;
        this.f33033c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c10;
        Object obj;
        switch (this.f33031a) {
            case 0:
                e70 e70Var = this.f33032b;
                String str2 = this.f33033c;
                e70Var.getClass();
                AndroidUtilities.runOnUIThread(new d70(e70Var, str2, 1));
                return;
            case 1:
                e70 e70Var2 = this.f33032b;
                String str3 = this.f33033c;
                gg.c2 c2Var = e70Var2.f33308f;
                g70 g70Var = e70Var2.I;
                if (!g70Var.O && !g70Var.P) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                c2Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                d70 d70Var = new d70(e70Var2, str3, 2);
                e70Var2.h = d70Var;
                dispatchQueue.postRunnable(d70Var);
                return;
            default:
                e70 e70Var3 = this.f33032b;
                String str4 = this.f33033c;
                ArrayList arrayList2 = e70Var3.f33310r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new xq(e70Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                int i11 = 0;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i12 = i10 + 1;
                String[] strArr = new String[i12];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i13 = 0;
                while (i13 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i13);
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
                        i13++;
                        arrayList2 = arrayList;
                        i11 = 0;
                    }
                    String translitString2 = LocaleController.getInstance().getTranslitString(str);
                    if (str.equals(translitString2)) {
                        translitString2 = null;
                    }
                    char c11 = 0;
                    while (i11 < i12) {
                        String str5 = strArr[i11];
                        if (!str.startsWith(str5) && !org.telegram.messenger.w1.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.w1.w(" ", str5, translitString2)))) {
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
                                String i14 = org.telegram.ui.Cells.p6.i("@", publicUsername);
                                arrayList4.add(AndroidUtilities.generateSearchName(i14, null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i13++;
                            arrayList2 = arrayList;
                            i11 = 0;
                        } else {
                            i11++;
                            arrayList2 = arrayList2;
                            c11 = c10;
                        }
                    }
                    arrayList = arrayList2;
                    i13++;
                    arrayList2 = arrayList;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new xq(e70Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
