package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class n70 implements Runnable {
    public final int f39363a;
    public final o70 f39364b;
    public final String f39365c;

    public n70(o70 o70Var, String str, int i10) {
        this.f39363a = i10;
        this.f39364b = o70Var;
        this.f39365c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39363a) {
            case 0:
                Utilities.searchQueue.postRunnable(new n70(this.f39364b, this.f39365c, 1));
                return;
            default:
                o70 o70Var = this.f39364b;
                String str = this.f39365c;
                p70 p70Var = o70Var.f39678b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    p70Var.getClass();
                    AndroidUtilities.runOnUIThread(new lq(p70Var, arrayList, arrayList2, 12));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                    translitString = null;
                }
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
                while (i13 < p70Var.f39983n.f41609w.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) p70Var.f39983n.f41609w.get(i13);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i14 = i11;
                    int i15 = i14;
                    while (true) {
                        if (i14 < i12) {
                            String str2 = strArr[i14];
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.wh.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.wh.w(" ", str2, translitString2)))) {
                                i15 = 1;
                            }
                            if (i15 != 0) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                arrayList3.add(contact);
                            } else {
                                i14++;
                            }
                        }
                    }
                    i13++;
                    i11 = 0;
                }
                AndroidUtilities.runOnUIThread(new lq(p70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
