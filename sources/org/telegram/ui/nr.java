package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class nr implements Runnable {
    public final int f48114a;
    public final ContactsActivity f48115b;

    public nr(ContactsActivity contactsActivity, int i3) {
        this.f48114a = i3;
        this.f48115b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i3;
        switch (this.f48114a) {
            case 0:
                ContactsActivity contactsActivity = this.f48115b;
                qe.c cVar = contactsActivity.f41207a;
                if (contactsActivity.f41227r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                qr qrVar = contactsActivity.f41209b;
                float f11 = cVar.f53846f;
                ArrayList arrayList = qrVar.O;
                qrVar.M = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                qr qrVar2 = contactsActivity.f41209b;
                if (contactsActivity.f41227r) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                qrVar2.Y(i3, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new nr(contactsActivity, 1));
                contactsActivity.f41217f0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f41227r) {
                    cVar.f53845e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f48115b.f41217f0 = null;
                return;
        }
    }
}
