package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class j80 implements Runnable {
    public final int f37313a;
    public final k80 f37314b;
    public final String f37315c;

    public j80(k80 k80Var, String str, int i10) {
        this.f37313a = i10;
        this.f37314b = k80Var;
        this.f37315c = str;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37313a) {
            case 0:
                Utilities.searchQueue.postRunnable(new j80(this.f37314b, this.f37315c, 1));
                return;
            default:
                k80 k80Var = this.f37314b;
                String str = this.f37315c;
                l80 l80Var = k80Var.f37604b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    l80Var.getClass();
                    AndroidUtilities.runOnUIThread(new br(l80Var, arrayList, arrayList2, 12));
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
                while (i13 < l80Var.f37890n.f39149w.size()) {
                    ContactsController.Contact contact = (ContactsController.Contact) l80Var.f37890n.f39149w.get(i13);
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
                            if (lowerCase2.startsWith(str2) || org.telegram.messenger.yh.v(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.yh.v(" ", str2, translitString2)))) {
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
                AndroidUtilities.runOnUIThread(new br(l80Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
