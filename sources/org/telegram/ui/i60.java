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
public final class i60 implements Runnable {
    public final int f37870a;
    public final j60 f37871b;
    public final String f37872c;

    public i60(j60 j60Var, String str, int i10) {
        this.f37870a = i10;
        this.f37871b = j60Var;
        this.f37872c = str;
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
        switch (this.f37870a) {
            case 0:
                j60 j60Var = this.f37871b;
                String str2 = this.f37872c;
                j60Var.getClass();
                AndroidUtilities.runOnUIThread(new i60(j60Var, str2, 1));
                return;
            case 1:
                j60 j60Var2 = this.f37871b;
                String str3 = this.f37872c;
                hg.a2 a2Var = j60Var2.f38182f;
                l60 l60Var = j60Var2.I;
                if (!l60Var.O && !l60Var.P) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                a2Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                i60 i60Var = new i60(j60Var2, str3, 2);
                j60Var2.h = i60Var;
                dispatchQueue.postRunnable(i60Var);
                return;
            default:
                j60 j60Var3 = this.f37871b;
                String str4 = this.f37872c;
                ArrayList arrayList2 = j60Var3.f38184r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new jq(j60Var3, new ArrayList(), new ArrayList(), 10));
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
                        if (!str.startsWith(str5) && !org.telegram.messenger.g0.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.g0.w(" ", str5, translitString2)))) {
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
                                arrayList4.add(AndroidUtilities.generateSearchName(r4.c.h("@", publicUsername), null, "@" + str5));
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
                AndroidUtilities.runOnUIThread(new jq(j60Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
