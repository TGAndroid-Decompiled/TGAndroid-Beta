package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f32393a;
    public final org.telegram.messenger.c20 f32394b;
    public final int f32395c;

    public c0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.f32393a = i10;
        this.f32394b = c20Var;
        this.f32395c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32393a) {
            case 0:
                this.f32394b.a(Integer.valueOf(this.f32395c));
                return;
            default:
                org.telegram.messenger.c20 c20Var = this.f32394b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.f32395c));
                    return;
                }
                return;
        }
    }
}
