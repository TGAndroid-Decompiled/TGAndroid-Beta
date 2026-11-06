package org.telegram.ui.Components;
public final class sw0 implements db0, fb0 {
    public final uw0 f38143a;

    @Override
    public String h(int i7) {
        return this.f38143a.f38740n[i7];
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        uw0 uw0Var = this.f38143a;
        uw0Var.b();
        org.telegram.messenger.iz.f23412r1 = i7;
        org.telegram.messenger.t0.f25563b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.iz.f23412r1).apply();
        uw0Var.invalidate();
        try {
            hb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
