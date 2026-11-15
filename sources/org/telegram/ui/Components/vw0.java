package org.telegram.ui.Components;
public final class vw0 implements eb0, gb0 {
    public final xw0 f41171a;

    @Override
    public String e(int i7) {
        return this.f41171a.f41784n[i7];
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        xw0 xw0Var = this.f41171a;
        xw0Var.b();
        org.telegram.messenger.gz.f23977r1 = i7;
        org.telegram.messenger.t0.f26600b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.gz.f23977r1).apply();
        xw0Var.invalidate();
        try {
            ib0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
