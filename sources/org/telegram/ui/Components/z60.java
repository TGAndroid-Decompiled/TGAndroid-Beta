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
public final class z60 implements Runnable {
    public final int f33809a;
    public final a70 f33810b;
    public final String f33811c;

    public z60(a70 a70Var, String str, int i10) {
        this.f33809a = i10;
        this.f33810b = a70Var;
        this.f33811c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c3;
        Object obj;
        switch (this.f33809a) {
            case 0:
                a70 a70Var = this.f33810b;
                String str2 = this.f33811c;
                a70Var.getClass();
                AndroidUtilities.runOnUIThread(new z60(a70Var, str2, 1));
                return;
            case 1:
                a70 a70Var2 = this.f33810b;
                String str3 = this.f33811c;
                uf.k1 k1Var = a70Var2.f25173e;
                org.telegram.ui.gu guVar = a70Var2.f25175n.f26476j0;
                boolean z4 = false;
                if (guVar != null) {
                    z4 = true;
                }
                boolean z10 = false;
                if (guVar != null) {
                    z10 = true;
                }
                k1Var.g(str3, true, z4, true, z10, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                z60 z60Var = new z60(a70Var2, str3, 2);
                a70Var2.h = z60Var;
                dispatchQueue.postRunnable(z60Var);
                return;
            default:
                a70 a70Var3 = this.f33810b;
                String str4 = this.f33811c;
                ArrayList arrayList2 = a70Var3.f25175n.f26468b0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new jp(a70Var3, new ArrayList(), new ArrayList(), 8));
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
                    boolean z11 = tLObject instanceof TLRPC.User;
                    if (z11) {
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
                    char c10 = 0;
                    while (true) {
                        if (i11 < i12) {
                            String str5 = strArr[i11];
                            if (!str.startsWith(str5) && !org.telegram.messenger.y3.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.y3.w(" ", str5, translitString2)))) {
                                if (publicUsername != null && publicUsername.startsWith(str5)) {
                                    c3 = 2;
                                } else {
                                    c3 = c10;
                                }
                            } else {
                                c3 = 1;
                            }
                            if (c3 != 0) {
                                arrayList = arrayList2;
                                if (c3 == 1) {
                                    if (z11) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    obj = null;
                                    String k10 = org.telegram.ui.yh.k("@", publicUsername);
                                    arrayList4.add(AndroidUtilities.generateSearchName(k10, null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                i11++;
                                arrayList2 = arrayList2;
                                c10 = c3;
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                    }
                    i13++;
                    arrayList2 = arrayList;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new jp(a70Var3, arrayList3, arrayList4, 8));
                return;
        }
    }
}
