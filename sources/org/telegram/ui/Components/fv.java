package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class fv implements Runnable {
    public final int f28555a;
    public final gv f28556b;

    public fv(gv gvVar, int i10) {
        this.f28555a = i10;
        this.f28556b = gvVar;
    }

    @Override
    public final void run() {
        switch (this.f28555a) {
            case 0:
                this.f28556b.f29003f.dismiss();
                return;
            default:
                jv jvVar = this.f28556b.f29003f;
                jvVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.x3.s(R.string.AddEmojiNotFound, tc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
