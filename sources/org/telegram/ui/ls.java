package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class ls implements Runnable {
    public final int f41353a;
    public final ContactsActivity f41354b;

    public ls(ContactsActivity contactsActivity, int i10) {
        this.f41353a = i10;
        this.f41354b = contactsActivity;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        switch (this.f41353a) {
            case 0:
                ContactsActivity contactsActivity = this.f41354b;
                oe.e eVar = contactsActivity.f35455a;
                if (contactsActivity.f35473r) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                eVar.c(f7);
                os osVar = contactsActivity.f35457b;
                float f10 = eVar.f19334f;
                ArrayList arrayList = osVar.N;
                osVar.L = f10;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((org.telegram.ui.Cells.v4) arrayList.get(i11)).setLetterProgress(f10);
                }
                os osVar2 = contactsActivity.f35457b;
                if (contactsActivity.f35473r) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                osVar2.Y(i10, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new ls(contactsActivity, 1));
                contactsActivity.f35462e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f35473r) {
                    eVar.e = 80L;
                    eVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f41354b.f35462e0 = null;
                return;
        }
    }
}
