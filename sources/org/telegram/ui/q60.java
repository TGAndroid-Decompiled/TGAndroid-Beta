package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q60 implements Runnable {
    public final int f42621a;
    public final r60 f42622b;
    public final String f42623c;

    public q60(r60 r60Var, String str, int i10) {
        this.f42621a = i10;
        this.f42622b = r60Var;
        this.f42623c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        boolean z11;
        int i11;
        Object obj;
        switch (this.f42621a) {
            case 0:
                r60 r60Var = this.f42622b;
                String str2 = this.f42623c;
                r60Var.getClass();
                AndroidUtilities.runOnUIThread(new q60(r60Var, str2, 1));
                return;
            case 1:
                r60 r60Var2 = this.f42622b;
                String str3 = this.f42623c;
                ig.a2 a2Var = r60Var2.f42862f;
                t60 t60Var = r60Var2.I;
                if (!t60Var.O && !t60Var.P) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                a2Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
                q60 q60Var = new q60(r60Var2, str3, 2);
                r60Var2.h = q60Var;
                dispatchQueue2.postRunnable(q60Var);
                return;
            default:
                r60 r60Var3 = this.f42622b;
                String str4 = this.f42623c;
                ArrayList arrayList2 = r60Var3.f42864r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new pq(r60Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                int i12 = 0;
                boolean z12 = true;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i13 = i10 + 1;
                String[] strArr = new String[i13];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i14);
                    boolean z13 = tLObject instanceof TLRPC.User;
                    if (z13) {
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
                        z11 = z12;
                        i14++;
                        z12 = z11;
                        arrayList2 = arrayList;
                        i12 = 0;
                    }
                    String translitString2 = LocaleController.getInstance().getTranslitString(str);
                    if (str.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i15 = i12;
                    while (i12 < i13) {
                        String str5 = strArr[i12];
                        if (!str.startsWith(str5) && !org.telegram.messenger.wh.u(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.wh.u(" ", str5, translitString2)))) {
                            if (publicUsername != null && publicUsername.startsWith(str5)) {
                                i15 = 2;
                            }
                            i11 = i15;
                        } else {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            arrayList = arrayList2;
                            z11 = true;
                            if (i11 == 1) {
                                if (z13) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                arrayList4.add(AndroidUtilities.generateSearchName(org.telegram.ui.Components.b10.j("@", publicUsername), null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i14++;
                            z12 = z11;
                            arrayList2 = arrayList;
                            i12 = 0;
                        } else {
                            i12++;
                            int i16 = i11;
                            z12 = true;
                            arrayList2 = arrayList2;
                            i15 = i16;
                        }
                    }
                    arrayList = arrayList2;
                    z11 = z12;
                    i14++;
                    z12 = z11;
                    arrayList2 = arrayList;
                    i12 = 0;
                }
                AndroidUtilities.runOnUIThread(new pq(r60Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
