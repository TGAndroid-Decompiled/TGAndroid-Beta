package org.telegram.ui.Components;
public final class sw0 implements ya0, ab0 {
    public final uw0 f38132a;

    @Override
    public String e(int i3) {
        return this.f38132a.f38897n[i3];
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        uw0 uw0Var = this.f38132a;
        uw0Var.b();
        org.telegram.messenger.az.f21660r1 = i3;
        org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.az.f21660r1).apply();
        uw0Var.invalidate();
        try {
            cb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
