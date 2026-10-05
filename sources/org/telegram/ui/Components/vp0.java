package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class vp0 implements li.l, r0.n, org.telegram.ui.ActionBar.l1, li.m {
    public final int f32406a;
    public final br0 f32407b;

    public vp0(br0 br0Var, int i10) {
        this.f32406a = i10;
        this.f32407b = br0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        br0 br0Var = this.f32407b;
        br0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.f45624a.f(519);
        if (!br0Var.G0.equals(f7)) {
            br0Var.G0 = f7;
            br0Var.container.requestLayout();
        }
        return r0.l1.f45623b;
    }

    @Override
    public int f() {
        br0 br0Var = this.f32407b;
        br0Var.getClass();
        return br0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6);
    }

    @Override
    public void k(int i10) {
        br0.m(this.f32407b, i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f32406a) {
            case 2:
                br0 br0Var = this.f32407b;
                br0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = br0Var.J0) != null && n1Var.isShowing()) {
                    br0Var.J0.d(true);
                    return;
                }
                return;
            default:
                br0 br0Var2 = this.f32407b;
                br0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = br0Var2.J0) != null && n1Var2.isShowing()) {
                    br0Var2.J0.d(true);
                    return;
                }
                return;
        }
    }
}
