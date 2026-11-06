package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f32360a;
    public final org.telegram.messenger.c20 f32361b;
    public final int f32362c;

    public c0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.f32360a = i10;
        this.f32361b = c20Var;
        this.f32362c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32360a) {
            case 0:
                this.f32361b.a(Integer.valueOf(this.f32362c));
                return;
            default:
                org.telegram.messenger.c20 c20Var = this.f32361b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.f32362c));
                    return;
                }
                return;
        }
    }
}
