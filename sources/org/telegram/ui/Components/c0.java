package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f32471a;
    public final org.telegram.messenger.c20 f32472b;
    public final int f32473c;

    public c0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.f32471a = i10;
        this.f32472b = c20Var;
        this.f32473c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32471a) {
            case 0:
                this.f32472b.a(Integer.valueOf(this.f32473c));
                return;
            default:
                org.telegram.messenger.c20 c20Var = this.f32472b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.f32473c));
                    return;
                }
                return;
        }
    }
}
