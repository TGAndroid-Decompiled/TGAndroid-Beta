package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

public final class n70 implements Runnable {

    public final int f40678a;

    public final o70 f40679b;

    public final String f40680c;

    public n70(o70 o70Var, String str, int i10) {
        this.f40678a = i10;
        this.f40679b = o70Var;
        this.f40680c = str;
    }

    @Override
    public final void run() {
        switch (this.f40678a) {
            case 0:
                Utilities.searchQueue.postRunnable(new n70(this.f40679b, this.f40680c, 1));
                break;
            default:
                o70 o70Var = this.f40679b;
                String str = this.f40680c;
                p70 p70Var = o70Var.f41025b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    p70Var.getClass();
                    AndroidUtilities.runOnUIThread(new lq(p70Var, arrayList, arrayList2, 12));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i10 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < p70Var.f41292n.f42802w.size(); i11++) {
                        ContactsController.Contact contact = (ContactsController.Contact) p70Var.f41292n.f42802w.get(i11);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        boolean z10 = false;
                        for (int i12 = 0; i12 < i10; i12++) {
                            String str2 = strArr[i12];
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, translitString2)))) {
                                z10 = true;
                            }
                            if (z10) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                arrayList3.add(contact);
                            }
                            break;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new lq(p70Var, arrayList3, arrayList4, 12));
                }
                break;
        }
    }
}
