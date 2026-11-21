package org.telegram.ui.Components;
public final class ex0 implements pb0, rb0 {
    public final gx0 f35010a;

    @Override
    public String i(int i7) {
        return this.f35010a.f35687n[i7];
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        gx0 gx0Var = this.f35010a;
        gx0Var.b();
        org.telegram.messenger.bz.f23221r1 = i7;
        org.telegram.messenger.t0.f26941b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.bz.f23221r1).apply();
        gx0Var.invalidate();
        try {
            tb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
