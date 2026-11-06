package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f32347a;
    public final org.telegram.messenger.c20 f32348b;
    public final int f32349c;

    public c0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.f32347a = i10;
        this.f32348b = c20Var;
        this.f32349c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32347a) {
            case 0:
                this.f32348b.a(Integer.valueOf(this.f32349c));
                return;
            default:
                org.telegram.messenger.c20 c20Var = this.f32348b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.f32349c));
                    return;
                }
                return;
        }
    }
}
