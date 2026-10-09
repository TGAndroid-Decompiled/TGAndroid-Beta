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
public final class y70 implements Runnable {
    public final int f33133a;
    public final z70 f33134b;
    public final String f33135c;

    public y70(z70 z70Var, String str, int i10) {
        this.f33133a = i10;
        this.f33134b = z70Var;
        this.f33135c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String publicUsername;
        ArrayList arrayList;
        boolean z10;
        int i11;
        Object obj;
        switch (this.f33133a) {
            case 0:
                z70 z70Var = this.f33134b;
                String str2 = this.f33135c;
                z70Var.getClass();
                AndroidUtilities.runOnUIThread(new y70(z70Var, str2, 1));
                return;
            case 1:
                z70 z70Var2 = this.f33134b;
                String str3 = this.f33135c;
                gg.b2 b2Var = z70Var2.f33487e;
                org.telegram.ui.gu guVar = z70Var2.f33489n.m0;
                boolean z11 = false;
                boolean z12 = false;
                if (guVar != null) {
                    z11 = true;
                }
                if (guVar != null) {
                    z12 = true;
                }
                b2Var.g(str3, true, z11, true, z12, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                y70 y70Var = new y70(z70Var2, str3, 2);
                z70Var2.h = y70Var;
                dispatchQueue.postRunnable(y70Var);
                return;
            default:
                z70 z70Var3 = this.f33134b;
                String str4 = this.f33135c;
                ArrayList arrayList2 = z70Var3.f33489n.f25624e0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(z70Var3, new ArrayList(), new ArrayList(), 26));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
                int i12 = 0;
                boolean z13 = true;
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
                    boolean z14 = tLObject instanceof TLRPC.User;
                    if (z14) {
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
                    int i15 = i12;
                    while (true) {
                        if (i12 < i13) {
                            String str5 = strArr[i12];
                            if (!str.startsWith(str5) && !org.telegram.messenger.bi.w(" ", str5, str) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.bi.w(" ", str5, translitString2)))) {
                                if (publicUsername != null && publicUsername.startsWith(str5)) {
                                    i15 = 2;
                                }
                                i11 = i15;
                            } else {
                                i11 = 1;
                            }
                            if (i11 != 0) {
                                arrayList = arrayList2;
                                z10 = true;
                                if (i11 == 1) {
                                    if (z14) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(sc.v.i("@", publicUsername), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                i12++;
                                int i16 = i11;
                                z13 = true;
                                arrayList2 = arrayList2;
                                i15 = i16;
                            }
                        } else {
                            arrayList = arrayList2;
                            z10 = z13;
                        }
                    }
                    i14++;
                    z13 = z10;
                    arrayList2 = arrayList;
                    i12 = 0;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(z70Var3, arrayList3, arrayList4, 26));
                return;
        }
    }
}
