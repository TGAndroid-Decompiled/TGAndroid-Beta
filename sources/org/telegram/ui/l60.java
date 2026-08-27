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

public final class l60 implements Runnable {

    public final int f39956a;

    public final m60 f39957b;

    public final String f39958c;

    public l60(m60 m60Var, String str, int i10) {
        this.f39956a = i10;
        this.f39957b = m60Var;
        this.f39958c = str;
    }

    @Override
    public final void run() {
        String lowerCase;
        String publicUsername;
        ArrayList arrayList;
        Object obj;
        switch (this.f39956a) {
            case 0:
                m60 m60Var = this.f39957b;
                String str = this.f39958c;
                m60Var.getClass();
                AndroidUtilities.runOnUIThread(new l60(m60Var, str, 1));
                break;
            case 1:
                m60 m60Var2 = this.f39957b;
                String str2 = this.f39958c;
                pf.j1 j1Var = m60Var2.f40376f;
                o60 o60Var = m60Var2.E;
                j1Var.g(str2, true, o60Var.K || o60Var.L, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                l60 l60Var = new l60(m60Var2, str2, 2);
                m60Var2.h = l60Var;
                dispatchQueue.postRunnable(l60Var);
                break;
            default:
                m60 m60Var3 = this.f39957b;
                String str3 = this.f39958c;
                ArrayList arrayList2 = m60Var3.f40378r;
                String lowerCase2 = str3.trim().toLowerCase();
                if (!lowerCase2.isEmpty()) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i10 = 0;
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase2;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i12);
                        boolean z10 = tLObject instanceof TLRPC.User;
                        if (z10) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            publicUsername = UserObject.getPublicUsername(user);
                        } else {
                            if (!(tLObject instanceof TLRPC.Chat)) {
                                arrayList = arrayList2;
                            } else {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                lowerCase = chat.title;
                                publicUsername = ChatObject.getPublicUsername(chat);
                            }
                            i12++;
                            arrayList2 = arrayList;
                            i10 = 0;
                        }
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        char c10 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                arrayList = arrayList2;
                            }
                            String str4 = strArr[i10];
                            char c11 = (lowerCase.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, lowerCase) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, translitString2)))) ? (char) 1 : (publicUsername == null || !publicUsername.startsWith(str4)) ? c10 : (char) 2;
                            if (c11 != 0) {
                                arrayList = arrayList2;
                                if (c11 == 1) {
                                    if (z10) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str4));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str4));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), null, "@" + str4));
                                }
                                arrayList3.add(tLObject);
                            }
                            i10++;
                            arrayList2 = arrayList2;
                            c10 = c11;
                            break;
                            break;
                        }
                        i12++;
                        arrayList2 = arrayList;
                        i10 = 0;
                        break;
                    }
                    AndroidUtilities.runOnUIThread(new lq(m60Var3, arrayList3, arrayList4, 10));
                } else {
                    AndroidUtilities.runOnUIThread(new lq(m60Var3, new ArrayList(), new ArrayList(), 10));
                }
                break;
        }
    }
}
