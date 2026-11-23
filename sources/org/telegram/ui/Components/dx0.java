package org.telegram.ui.Components;
public final class dx0 implements mb0, ob0 {
    public final fx0 f34479a;

    @Override
    public String e(int i7) {
        return this.f34479a.f35224n[i7];
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        fx0 fx0Var = this.f34479a;
        fx0Var.b();
        org.telegram.messenger.bz.f23318r1 = i7;
        org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.bz.f23318r1).apply();
        fx0Var.invalidate();
        try {
            qb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
