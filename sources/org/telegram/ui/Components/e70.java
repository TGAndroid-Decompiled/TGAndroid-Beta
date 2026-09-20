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
public final class e70 implements Runnable {
    public final int f23755a;
    public final f70 f23756b;
    public final String f23757c;

    public e70(f70 f70Var, String str, int i10) {
        this.f23755a = i10;
        this.f23756b = f70Var;
        this.f23757c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c10;
        Object obj;
        switch (this.f23755a) {
            case 0:
                f70 f70Var = this.f23756b;
                String str2 = this.f23757c;
                f70Var.getClass();
                AndroidUtilities.runOnUIThread(new e70(f70Var, str2, 1));
                return;
            case 1:
                f70 f70Var2 = this.f23756b;
                String str3 = this.f23757c;
                gg.c2 c2Var = f70Var2.e;
                org.telegram.ui.fu fuVar = f70Var2.f24020n.m0;
                boolean z10 = false;
                if (fuVar != null) {
                    z10 = true;
                }
                boolean z11 = false;
                if (fuVar != null) {
                    z11 = true;
                }
                c2Var.g(str3, true, z10, true, z11, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                e70 e70Var = new e70(f70Var2, str3, 2);
                f70Var2.h = e70Var;
                dispatchQueue.postRunnable(e70Var);
                return;
            default:
                f70 f70Var3 = this.f23756b;
                String str4 = this.f23757c;
                ArrayList arrayList2 = f70Var3.f24020n.f25253e0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(f70Var3, new ArrayList(), new ArrayList(), 24));
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
                            if (!str.startsWith(str5) && !org.telegram.messenger.l0.v(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.l0.v(" ", str5, translitString2)))) {
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
                                    String g10 = v7.j0.g("@", publicUsername);
                                    arrayList4.add(AndroidUtilities.generateSearchName(g10, null, "@" + str5));
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
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(f70Var3, arrayList3, arrayList4, 24));
                return;
        }
    }
}
