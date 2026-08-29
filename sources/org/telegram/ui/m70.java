package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class m70 implements Runnable {
    public final int f40479a;
    public final n70 f40480b;
    public final String f40481c;

    public m70(n70 n70Var, String str, int i10) {
        this.f40479a = i10;
        this.f40480b = n70Var;
        this.f40481c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40479a) {
            case 0:
                Utilities.searchQueue.postRunnable(new m70(this.f40480b, this.f40481c, 1));
                return;
            default:
                n70 n70Var = this.f40480b;
                String str = this.f40481c;
                o70 o70Var = n70Var.f40735b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    o70Var.getClass();
                    AndroidUtilities.runOnUIThread(new lq(o70Var, arrayList, arrayList2, 12));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i11 = i10 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i12 = 0; i12 < o70Var.f40997n.f42301w.size(); i12++) {
                    ContactsController.Contact contact = (ContactsController.Contact) o70Var.f40997n.f42301w.get(i12);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i13 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i13 < i11) {
                            String str2 = strArr[i13];
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.x3.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.x3.w(" ", str2, translitString2)))) {
                                z10 = true;
                            }
                            if (z10) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                arrayList3.add(contact);
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new lq(o70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
