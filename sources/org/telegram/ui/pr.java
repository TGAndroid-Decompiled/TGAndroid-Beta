package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class pr implements Runnable {
    public final int f48913a;
    public final ContactsActivity f48914b;

    public pr(ContactsActivity contactsActivity, int i7) {
        this.f48913a = i7;
        this.f48914b = contactsActivity;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        switch (this.f48913a) {
            case 0:
                ContactsActivity contactsActivity = this.f48914b;
                te.c cVar = contactsActivity.f41179a;
                if (contactsActivity.f41198r) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cVar.c(f10);
                sr srVar = contactsActivity.f41181b;
                float f11 = cVar.f55493f;
                ArrayList arrayList = srVar.N;
                srVar.L = f11;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Cells.s4) arrayList.get(i10)).setLetterProgress(f11);
                }
                sr srVar2 = contactsActivity.f41181b;
                if (contactsActivity.f41198r) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                srVar2.Y(i7, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new pr(contactsActivity, 1));
                contactsActivity.f41187e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f41198r) {
                    cVar.f55492e = 80L;
                    cVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f48914b.f41187e0 = null;
                return;
        }
    }
}
