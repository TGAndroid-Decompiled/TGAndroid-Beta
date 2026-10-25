package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class ls implements Runnable {
    public final int f41350a;
    public final ContactsActivity f41351b;

    public ls(ContactsActivity contactsActivity, int i10) {
        this.f41350a = i10;
        this.f41351b = contactsActivity;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        switch (this.f41350a) {
            case 0:
                ContactsActivity contactsActivity = this.f41351b;
                oe.e eVar = contactsActivity.f35452a;
                if (contactsActivity.f35470r) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                eVar.c(f7);
                os osVar = contactsActivity.f35454b;
                float f10 = eVar.f19334f;
                ArrayList arrayList = osVar.N;
                osVar.L = f10;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((org.telegram.ui.Cells.v4) arrayList.get(i11)).setLetterProgress(f10);
                }
                os osVar2 = contactsActivity.f35454b;
                if (contactsActivity.f35470r) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                osVar2.Y(i10, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new ls(contactsActivity, 1));
                contactsActivity.f35459e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f35470r) {
                    eVar.e = 80L;
                    eVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f41351b.f35459e0 = null;
                return;
        }
    }
}
