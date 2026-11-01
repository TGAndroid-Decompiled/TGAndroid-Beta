package org.telegram.ui.Components;
public final class xx0 implements wb0, yb0 {
    public final zx0 f32654a;

    @Override
    public String e(int i10) {
        return this.f32654a.f33258n[i10];
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        zx0 zx0Var = this.f32654a;
        zx0Var.b();
        org.telegram.messenger.uz.f18548r1 = i10;
        org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", org.telegram.messenger.uz.f18548r1).apply();
        zx0Var.invalidate();
        try {
            ac0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
