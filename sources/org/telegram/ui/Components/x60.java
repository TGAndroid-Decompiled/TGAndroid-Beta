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
public final class x60 implements Runnable {
    public final int f29926a;
    public final y60 f29927b;
    public final String f29928c;

    public x60(y60 y60Var, String str, int i10) {
        this.f29926a = i10;
        this.f29927b = y60Var;
        this.f29928c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c10;
        Object obj;
        switch (this.f29926a) {
            case 0:
                y60 y60Var = this.f29927b;
                String str2 = this.f29928c;
                y60Var.getClass();
                AndroidUtilities.runOnUIThread(new x60(y60Var, str2, 1));
                return;
            case 1:
                y60 y60Var2 = this.f29927b;
                String str3 = this.f29928c;
                gg.c2 c2Var = y60Var2.e;
                org.telegram.ui.eu euVar = y60Var2.f30170n.m0;
                boolean z10 = false;
                if (euVar != null) {
                    z10 = true;
                }
                boolean z11 = false;
                if (euVar != null) {
                    z11 = true;
                }
                c2Var.g(str3, true, z10, true, z11, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                x60 x60Var = new x60(y60Var2, str3, 2);
                y60Var2.h = x60Var;
                dispatchQueue.postRunnable(x60Var);
                return;
            default:
                y60 y60Var3 = this.f29927b;
                String str4 = this.f29928c;
                ArrayList arrayList2 = y60Var3.f30170n.f22955e0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(y60Var3, new ArrayList(), new ArrayList(), 21));
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
                    char c11 = 0;
                    while (true) {
                        if (i11 < i12) {
                            String str5 = strArr[i11];
                            if (!str.startsWith(str5) && !org.telegram.messenger.z0.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.z0.w(" ", str5, translitString2)))) {
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
                                    String i14 = org.telegram.ui.Cells.q3.i("@", publicUsername);
                                    arrayList4.add(AndroidUtilities.generateSearchName(i14, null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                i11++;
                                arrayList2 = arrayList2;
                                c11 = c10;
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                    }
                    i13++;
                    arrayList2 = arrayList;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(y60Var3, arrayList3, arrayList4, 21));
                return;
        }
    }
}
