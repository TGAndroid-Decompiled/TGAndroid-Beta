package org.telegram.ui.Components;
public final class tw0 implements eb0, gb0 {
    public final vw0 f38524a;

    @Override
    public String h(int i7) {
        return this.f38524a.f39825n[i7];
    }

    @Override
    public void n(ib0 ib0Var, int i7) {
        vw0 vw0Var = this.f38524a;
        vw0Var.b();
        org.telegram.messenger.iz.f23433r1 = i7;
        org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.iz.f23433r1).apply();
        vw0Var.invalidate();
        try {
            ib0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
