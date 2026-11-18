package org.telegram.ui.Components;
public final class cx0 implements ob0, qb0 {
    public final ex0 f34193a;

    @Override
    public String i(int i7) {
        return this.f34193a.f34829n[i7];
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        ex0 ex0Var = this.f34193a;
        ex0Var.b();
        org.telegram.messenger.bz.f23196r1 = i7;
        org.telegram.messenger.t0.f26915b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.bz.f23196r1).apply();
        ex0Var.invalidate();
        try {
            sb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
