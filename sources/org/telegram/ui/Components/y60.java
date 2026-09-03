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
public final class y60 implements Runnable {
    public final int f30911a;
    public final z60 f30912b;
    public final String f30913c;

    public y60(z60 z60Var, String str, int i10) {
        this.f30911a = i10;
        this.f30912b = z60Var;
        this.f30913c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c3;
        Object obj;
        switch (this.f30911a) {
            case 0:
                z60 z60Var = this.f30912b;
                String str2 = this.f30913c;
                z60Var.getClass();
                AndroidUtilities.runOnUIThread(new y60(z60Var, str2, 1));
                return;
            case 1:
                z60 z60Var2 = this.f30912b;
                String str3 = this.f30913c;
                tf.j1 j1Var = z60Var2.e;
                org.telegram.ui.hu huVar = z60Var2.f31264n.f24197j0;
                boolean z4 = false;
                if (huVar != null) {
                    z4 = true;
                }
                boolean z10 = false;
                if (huVar != null) {
                    z10 = true;
                }
                j1Var.g(str3, true, z4, true, z10, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                y60 y60Var = new y60(z60Var2, str3, 2);
                z60Var2.h = y60Var;
                dispatchQueue.postRunnable(y60Var);
                return;
            default:
                z60 z60Var3 = this.f30912b;
                String str4 = this.f30913c;
                ArrayList arrayList2 = z60Var3.f31264n.f24189b0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gp(z60Var3, new ArrayList(), new ArrayList(), 8));
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
                                    String e = vh.w2.e("@", publicUsername);
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
                AndroidUtilities.runOnUIThread(new gp(z60Var3, arrayList3, arrayList4, 8));
                return;
        }
    }
}
