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

public final class k60 implements Runnable {

    public final int f30004a;

    public final l60 f30005b;

    public final String f30006c;

    public k60(l60 l60Var, String str, int i10) {
        this.f30004a = i10;
        this.f30005b = l60Var;
        this.f30006c = str;
    }

    @Override
    public final void run() {
        String lowerCase;
        String publicUsername;
        Object obj;
        switch (this.f30004a) {
            case 0:
                l60 l60Var = this.f30005b;
                String str = this.f30006c;
                l60Var.getClass();
                AndroidUtilities.runOnUIThread(new k60(l60Var, str, 1));
                break;
            case 1:
                l60 l60Var2 = this.f30005b;
                String str2 = this.f30006c;
                pf.j1 j1Var = l60Var2.f30303e;
                org.telegram.ui.zt ztVar = l60Var2.f30305n.f31522i0;
                j1Var.g(str2, true, ztVar != null, true, ztVar != null, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                k60 k60Var = new k60(l60Var2, str2, 2);
                l60Var2.h = k60Var;
                dispatchQueue.postRunnable(k60Var);
                break;
            default:
                l60 l60Var3 = this.f30005b;
                String str3 = this.f30006c;
                ArrayList arrayList = l60Var3.f30305n.f31514a0;
                String lowerCase2 = str3.trim().toLowerCase();
                if (lowerCase2.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i10 = 0;
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase2;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TLObject tLObject = (TLObject) arrayList.get(i12);
                        boolean z10 = tLObject instanceof TLRPC.User;
                        if (z10) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            lowerCase = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            publicUsername = UserObject.getPublicUsername(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            lowerCase = chat.title;
                            publicUsername = ChatObject.getPublicUsername(chat);
                        }
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        char c10 = 0;
                        while (i10 < i11) {
                            String str4 = strArr[i10];
                            char c11 = (lowerCase.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, lowerCase) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.y1.x(" ", str4, translitString2)))) ? (char) 1 : (publicUsername == null || !publicUsername.startsWith(str4)) ? c10 : (char) 2;
                            if (c11 != 0) {
                                if (c11 != 1) {
                                    obj = null;
                                    arrayList3.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), null, "@" + str4));
                                } else if (z10) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList3.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str4));
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList3.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str4));
                                }
                                arrayList2.add(tLObject);
                            }
                            i10++;
                            arrayList = arrayList;
                            c10 = c11;
                            break;
                        }
                        i12++;
                        arrayList = arrayList;
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(l60Var3, arrayList2, arrayList3, 20));
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(l60Var3, new ArrayList(), new ArrayList(), 20));
                }
                break;
        }
    }
}
