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
    public final int f30585a;
    public final y60 f30586b;
    public final String f30587c;

    public x60(y60 y60Var, String str, int i10) {
        this.f30585a = i10;
        this.f30586b = y60Var;
        this.f30587c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c3;
        Object obj;
        switch (this.f30585a) {
            case 0:
                y60 y60Var = this.f30586b;
                String str2 = this.f30587c;
                y60Var.getClass();
                AndroidUtilities.runOnUIThread(new x60(y60Var, str2, 1));
                return;
            case 1:
                y60 y60Var2 = this.f30586b;
                String str3 = this.f30587c;
                tf.k1 k1Var = y60Var2.e;
                org.telegram.ui.fu fuVar = y60Var2.f30891n.f23872j0;
                boolean z4 = false;
                if (fuVar != null) {
                    z4 = true;
                }
                boolean z10 = false;
                if (fuVar != null) {
                    z10 = true;
                }
                k1Var.g(str3, true, z4, true, z10, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                x60 x60Var = new x60(y60Var2, str3, 2);
                y60Var2.h = x60Var;
                dispatchQueue.postRunnable(x60Var);
                return;
            default:
                y60 y60Var3 = this.f30586b;
                String str4 = this.f30587c;
                ArrayList arrayList2 = y60Var3.f30891n.f23864b0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new hp(y60Var3, new ArrayList(), new ArrayList(), 8));
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
                                    String e = vh.v2.e("@", publicUsername);
                                    arrayList4.add(AndroidUtilities.generateSearchName(e, null, "@" + str5));
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
                AndroidUtilities.runOnUIThread(new hp(y60Var3, arrayList3, arrayList4, 8));
                return;
        }
    }
}
