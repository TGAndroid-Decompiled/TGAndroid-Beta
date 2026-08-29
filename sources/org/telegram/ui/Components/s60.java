package org.telegram.ui.Components;

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
public final class s60 implements Runnable {
    public final int f32530a;
    public final t60 f32531b;
    public final String f32532c;

    public s60(t60 t60Var, String str, int i10) {
        this.f32530a = i10;
        this.f32531b = t60Var;
        this.f32532c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c3;
        Object obj;
        switch (this.f32530a) {
            case 0:
                t60 t60Var = this.f32531b;
                String str2 = this.f32532c;
                t60Var.getClass();
                AndroidUtilities.runOnUIThread(new s60(t60Var, str2, 1));
                return;
            case 1:
                t60 t60Var2 = this.f32531b;
                String str3 = this.f32532c;
                rf.k1 k1Var = t60Var2.f32880e;
                org.telegram.ui.xt xtVar = t60Var2.f32882n.f34612i0;
                boolean z10 = false;
                if (xtVar != null) {
                    z10 = true;
                }
                boolean z11 = false;
                if (xtVar != null) {
                    z11 = true;
                }
                k1Var.g(str3, true, z10, true, z11, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                s60 s60Var = new s60(t60Var2, str3, 2);
                t60Var2.h = s60Var;
                dispatchQueue.postRunnable(s60Var);
                return;
            default:
                t60 t60Var3 = this.f32531b;
                String str4 = this.f32532c;
                ArrayList arrayList2 = t60Var3.f32882n.f34604a0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new g(t60Var3, new ArrayList(), new ArrayList(), 15));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
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
                    boolean z12 = tLObject instanceof TLRPC.User;
                    if (z12) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                        publicUsername = UserObject.getPublicUsername(user);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        str = chat.title;
                        publicUsername = ChatObject.getPublicUsername(chat);
                    }
                    String translitString2 = LocaleController.getInstance().getTranslitString(str);
                    if (str.equals(translitString2)) {
                        translitString2 = null;
                    }
                    char c6 = 0;
                    while (true) {
                        if (i11 < i12) {
                            String str5 = strArr[i11];
                            if (!str.startsWith(str5) && !org.telegram.messenger.x3.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.x3.w(" ", str5, translitString2)))) {
                                if (publicUsername != null && publicUsername.startsWith(str5)) {
                                    c3 = 2;
                                } else {
                                    c3 = c6;
                                }
                            } else {
                                c3 = 1;
                            }
                            if (c3 != 0) {
                                arrayList = arrayList2;
                                if (c3 == 1) {
                                    if (z12) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    obj = null;
                                    String e10 = u3.c.e("@", publicUsername);
                                    arrayList4.add(AndroidUtilities.generateSearchName(e10, null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                i11++;
                                arrayList2 = arrayList2;
                                c6 = c3;
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                    }
                    i13++;
                    arrayList2 = arrayList;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new g(t60Var3, arrayList3, arrayList4, 15));
                return;
        }
    }
}
