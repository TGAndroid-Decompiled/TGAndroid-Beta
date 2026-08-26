package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;

public final class InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final InviteContactsActivity.InviteAdapter.AnonymousClass1 f$0;
    public final String f$1;

    public InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0(InviteContactsActivity.InviteAdapter.AnonymousClass1 anonymousClass1, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.searchQueue.postRunnable(new InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0(this.f$0, this.f$1, 1));
                break;
            default:
                InviteContactsActivity.InviteAdapter.AnonymousClass1 anonymousClass1 = this.f$0;
                String lowerCase = this.f$1.trim().toLowerCase();
                boolean zIsEmpty = lowerCase.isEmpty();
                InviteContactsActivity.InviteAdapter inviteAdapter = InviteContactsActivity.InviteAdapter.this;
                if (zIsEmpty) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    inviteAdapter.getClass();
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(inviteAdapter, arrayList, arrayList2, 28));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i2 = 0; i2 < InviteContactsActivity.this.phoneBookContacts.size(); i2++) {
                        ContactsController.Contact contact = (ContactsController.Contact) InviteContactsActivity.this.phoneBookContacts.get(i2);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        boolean z = false;
                        for (int i3 = 0; i3 < i; i3++) {
                            String str = strArr[i3];
                            if (lowerCase2.startsWith(str) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, translitString2)))) {
                                z = true;
                            }
                            if (z) {
                                arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str));
                                arrayList3.add(contact);
                            }
                            break;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(inviteAdapter, arrayList3, arrayList4, 28));
                }
                break;
        }
    }
}
