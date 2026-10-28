package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class ns implements Runnable {
    public final int f41876a;
    public final ContactsActivity f41877b;

    public ns(ContactsActivity contactsActivity, int i10) {
        this.f41876a = i10;
        this.f41877b = contactsActivity;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        switch (this.f41876a) {
            case 0:
                ContactsActivity contactsActivity = this.f41877b;
                oe.e eVar = contactsActivity.f35479a;
                if (contactsActivity.f35497r) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                eVar.c(f7);
                qs qsVar = contactsActivity.f35481b;
                float f10 = eVar.f19333f;
                ArrayList arrayList = qsVar.N;
                qsVar.L = f10;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((org.telegram.ui.Cells.v4) arrayList.get(i11)).setLetterProgress(f10);
                }
                qs qsVar2 = contactsActivity.f35481b;
                if (contactsActivity.f35497r) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                qsVar2.Y(i10, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new ns(contactsActivity, 1));
                contactsActivity.f35486e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f35497r) {
                    eVar.e = 80L;
                    eVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f41877b.f35486e0 = null;
                return;
        }
    }
}
