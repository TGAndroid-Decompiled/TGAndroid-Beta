package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class l70 implements Runnable {
    public final int f38836a;
    public final m70 f38837b;
    public final String f38838c;

    public l70(m70 m70Var, String str, int i10) {
        this.f38836a = i10;
        this.f38837b = m70Var;
        this.f38838c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38836a) {
            case 0:
                Utilities.searchQueue.postRunnable(new l70(this.f38837b, this.f38838c, 1));
                return;
            default:
                m70 m70Var = this.f38837b;
                String str = this.f38838c;
                n70 n70Var = m70Var.f39136b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    n70Var.getClass();
                    AndroidUtilities.runOnUIThread(new jq(n70Var, arrayList, arrayList2, 12));
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
                while (i13 < n70Var.f39449n.f41085w.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) n70Var.f39449n.f41085w.get(i13);
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
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.g0.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.g0.w(" ", str2, translitString2)))) {
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
                AndroidUtilities.runOnUIThread(new jq(n70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
