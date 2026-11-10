package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mn implements org.telegram.messenger.lc {
    public boolean f36018a;
    public final kg.g f36019b;
    public final on f36020c;

    public mn(kg.i iVar, kg.g gVar) {
        this.f36020c = iVar;
        this.f36019b = gVar;
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
        zg0 zg0Var;
        bg.i iVar;
        if (!this.f36018a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f36018a = true;
                boolean z9 = drawable instanceof zg0;
                kg.g gVar = this.f36019b;
                if (z9 && (iVar = (zg0Var = (zg0) drawable).B0) != null && iVar.g()) {
                    zg0Var.A0 = new org.telegram.ui.fq(28, this, gVar);
                    return;
                }
                on.a(this.f36020c);
                gVar.run();
            }
        }
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
    }

    @Override
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }
}
