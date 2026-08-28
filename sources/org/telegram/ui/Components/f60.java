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
public final class f60 implements Runnable {
    public final int f28314a;
    public final g60 f28315b;
    public final String f28316c;

    public f60(g60 g60Var, String str, int i9) {
        this.f28314a = i9;
        this.f28315b = g60Var;
        this.f28316c = str;
    }

    @Override
    public final void run() {
        int i9;
        String str;
        String publicUsername;
        ArrayList arrayList;
        char c10;
        Object obj;
        switch (this.f28314a) {
            case 0:
                g60 g60Var = this.f28315b;
                String str2 = this.f28316c;
                g60Var.getClass();
                AndroidUtilities.runOnUIThread(new f60(g60Var, str2, 1));
                return;
            case 1:
                g60 g60Var2 = this.f28315b;
                String str3 = this.f28316c;
                of.v1 v1Var = g60Var2.f28657e;
                org.telegram.ui.wt wtVar = g60Var2.f28659n.f29982i0;
                boolean z10 = false;
                if (wtVar != null) {
                    z10 = true;
                }
                boolean z11 = false;
                if (wtVar != null) {
                    z11 = true;
                }
                v1Var.g(str3, true, z10, true, z11, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                f60 f60Var = new f60(g60Var2, str3, 2);
                g60Var2.h = f60Var;
                dispatchQueue.postRunnable(f60Var);
                return;
            default:
                g60 g60Var3 = this.f28315b;
                String str4 = this.f28316c;
                ArrayList arrayList2 = g60Var3.f28659n.f29974a0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(g60Var3, new ArrayList(), new ArrayList(), 26));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
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
                        if (i10 < i11) {
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
                                    String d = ta.b.d("@", publicUsername);
                                    arrayList4.add(AndroidUtilities.generateSearchName(d, null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                i10++;
                                arrayList2 = arrayList2;
                                c11 = c10;
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                    }
                    i12++;
                    arrayList2 = arrayList;
                    i10 = 0;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(g60Var3, arrayList3, arrayList4, 26));
                return;
        }
    }
}
