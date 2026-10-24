package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class uv implements Runnable {
    public final int f31229a;
    public final vv f31230b;

    public uv(vv vvVar, int i10) {
        this.f31229a = i10;
        this.f31230b = vvVar;
    }

    @Override
    public final void run() {
        switch (this.f31229a) {
            case 0:
                this.f31230b.f32052f.dismiss();
                return;
            default:
                yv yvVar = this.f31230b.f32052f;
                yvVar.dismiss();
                org.telegram.ui.ActionBar.o2 o2Var = yvVar.f33049c;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    org.telegram.messenger.tl.q(R.string.AddEmojiNotFound, vc.a0(o2Var), null);
                    return;
                }
                return;
        }
    }
}
