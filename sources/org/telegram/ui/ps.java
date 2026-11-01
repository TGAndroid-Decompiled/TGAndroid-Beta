package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f40588a;
    public final ContactsActivity f40589b;

    public ps(ContactsActivity contactsActivity, int i10) {
        this.f40588a = i10;
        this.f40589b = contactsActivity;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        switch (this.f40588a) {
            case 0:
                ContactsActivity contactsActivity = this.f40589b;
                fe.f fVar = contactsActivity.f33285a;
                if (contactsActivity.f33303r) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                fVar.c(f7);
                ss ssVar = contactsActivity.f33287b;
                float f10 = fVar.f7032f;
                ArrayList arrayList = ssVar.N;
                ssVar.L = f10;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((org.telegram.ui.Cells.u4) arrayList.get(i11)).setLetterProgress(f10);
                }
                ss ssVar2 = contactsActivity.f33287b;
                if (contactsActivity.f33303r) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                ssVar2.Y(i10, false);
                contactsActivity.d.v0(0);
                ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new ps(contactsActivity, 1));
                contactsActivity.f33292e0 = withEndAction;
                withEndAction.start();
                if (contactsActivity.f33303r) {
                    fVar.e = 80L;
                    fVar.a(1.0f);
                    return;
                }
                return;
            default:
                this.f40589b.f33292e0 = null;
                return;
        }
    }
}
