package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class k70 implements Runnable {
    public final int f39762a;
    public final l70 f39763b;
    public final String f39764c;

    public k70(l70 l70Var, String str, int i9) {
        this.f39762a = i9;
        this.f39763b = l70Var;
        this.f39764c = str;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f39762a) {
            case 0:
                Utilities.searchQueue.postRunnable(new k70(this.f39763b, this.f39764c, 1));
                return;
            default:
                l70 l70Var = this.f39763b;
                String str = this.f39764c;
                m70 m70Var = l70Var.f40072b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    m70Var.getClass();
                    AndroidUtilities.runOnUIThread(new jq(m70Var, arrayList, arrayList2, 12));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.isEmpty()) ? null : null;
                if (translitString != null) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                int i10 = i9 + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < m70Var.f40344n.f41708w.size(); i11++) {
                    ContactsController.Contact contact = (ContactsController.Contact) m70Var.f40344n.f41708w.get(i11);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i12 = 0;
                    boolean z10 = false;
                    while (true) {
                        if (i12 < i10) {
                            String str2 = strArr[i12];
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.l0.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.l0.w(" ", str2, translitString2)))) {
                                z10 = true;
                            }
                            if (z10) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                arrayList3.add(contact);
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new jq(m70Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
