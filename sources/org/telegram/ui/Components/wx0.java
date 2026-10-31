package org.telegram.ui.Components;
public final class wx0 implements wb0, yb0 {
    public final yx0 f32270a;

    @Override
    public String e(int i10) {
        return this.f32270a.f32826n[i10];
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        yx0 yx0Var = this.f32270a;
        yx0Var.b();
        org.telegram.messenger.tz.f18179r1 = i10;
        org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.tz.f18179r1).apply();
        yx0Var.invalidate();
        try {
            ac0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
