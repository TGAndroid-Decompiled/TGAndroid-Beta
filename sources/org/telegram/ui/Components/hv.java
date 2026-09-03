package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class hv implements Runnable {
    public final int f25504a;
    public final iv f25505b;

    public hv(iv ivVar, int i10) {
        this.f25504a = i10;
        this.f25505b = ivVar;
    }

    @Override
    public final void run() {
        switch (this.f25504a) {
            case 0:
                this.f25505b.f25777f.dismiss();
                return;
            default:
                lv lvVar = this.f25505b.f25777f;
                lvVar.dismiss();
                org.telegram.ui.ActionBar.p2 p2Var = lvVar.f26879c;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    org.telegram.messenger.y3.s(R.string.AddEmojiNotFound, qc.a0(p2Var), null);
                    return;
                }
                return;
        }
    }
}
