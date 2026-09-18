package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class h80 implements Runnable {
    public final int f34211a;
    public final i80 f34212b;
    public final String f34213c;

    public h80(i80 i80Var, String str, int i10) {
        this.f34211a = i10;
        this.f34212b = i80Var;
        this.f34213c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34211a) {
            case 0:
                Utilities.searchQueue.postRunnable(new h80(this.f34212b, this.f34213c, 1));
                return;
            default:
                i80 i80Var = this.f34212b;
                String str = this.f34213c;
                j80 j80Var = i80Var.f34512b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    j80Var.getClass();
                    AndroidUtilities.runOnUIThread(new xq(j80Var, arrayList, arrayList2, 12));
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
                for (int i12 = 0; i12 < j80Var.f34820n.f35979w.size(); i12++) {
                    ContactsController.Contact contact = (ContactsController.Contact) j80Var.f34820n.f35979w.get(i12);
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
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.w1.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.w1.w(" ", str2, translitString2)))) {
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
                AndroidUtilities.runOnUIThread(new xq(j80Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
