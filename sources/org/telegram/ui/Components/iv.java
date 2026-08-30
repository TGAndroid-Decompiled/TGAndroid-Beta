package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class iv implements Runnable {
    public final int f25787a;
    public final jv f25788b;

    public iv(jv jvVar, int i10) {
        this.f25787a = i10;
        this.f25788b = jvVar;
    }

    @Override
    public final void run() {
        switch (this.f25787a) {
            case 0:
                this.f25788b.f26051f.dismiss();
                return;
            default:
                mv mvVar = this.f25788b.f26051f;
                mvVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = mvVar.f27124c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    return;
                }
                return;
        }
    }
}
