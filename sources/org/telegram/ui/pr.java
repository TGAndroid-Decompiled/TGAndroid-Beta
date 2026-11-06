package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class pr implements Runnable {
    public final int f48910a;
    public final ContactsActivity f48911b;

    public pr(ContactsActivity contactsActivity, int i7) {
        this.f48910a = i7;
        this.f48911b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f48910a) {
            case 0:
                ContactsActivity contactsActivity = this.f48911b;
                te.c cVar = contactsActivity.f41175a;
                if (contactsActivity.f41194r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                sr srVar = contactsActivity.f41177b;
                float f11 = cVar.f55400f;
                ArrayList arrayList = srVar.N;
                srVar.L = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                sr srVar2 = contactsActivity.f41177b;
                if (contactsActivity.f41194r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                srVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new pr(contactsActivity, 1));
                contactsActivity.f41183e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f41194r) {
                    cVar.f55399e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f48911b.f41183e0 = null;
                return;
        }
    }
}
