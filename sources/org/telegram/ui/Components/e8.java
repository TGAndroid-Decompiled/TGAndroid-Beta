package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;
public final class e8 implements Runnable {
    public final int f33310a;
    public final r8 f33311b;

    public e8(r8 r8Var, int i3) {
        this.f33310a = i3;
        this.f33311b = r8Var;
    }

    @Override
    public final void run() {
        switch (this.f33310a) {
            case 0:
                r8 r8Var = this.f33311b;
                if (!r8Var.V) {
                    if (r8Var.O > 0.0f) {
                        if (r8Var.N != null) {
                            r8Var.F = 1.0f;
                            r8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(r8Var.fragmentView);
                        return;
                    }
                    r8Var.l0(!r8Var.f37667a.f37377w, true, false);
                    return;
                }
                return;
            default:
                r8 r8Var2 = this.f33311b;
                r8Var2.getClass();
                r8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                return;
        }
    }
}
