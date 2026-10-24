package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class g90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final int f26595a;
    public final p90 f26596b;

    public g90(p90 p90Var, int i10) {
        this.f26595a = i10;
        this.f26596b = p90Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26595a) {
            case 0:
                o90 o90Var = this.f26596b.f29521r;
                if (o90Var != null) {
                    o90Var.k();
                    return;
                }
                return;
            default:
                o90 o90Var2 = this.f26596b.f29521r;
                if (o90Var2 != null) {
                    o90Var2.c();
                    return;
                }
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        p90 p90Var = this.f26596b;
        p90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p90Var.f29522s.isShowing()) {
            p90Var.f29522s.d(true);
        }
    }
}
