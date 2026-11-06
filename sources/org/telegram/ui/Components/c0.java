package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f32341a;
    public final org.telegram.messenger.c20 f32342b;
    public final int f32343c;

    public c0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.f32341a = i10;
        this.f32342b = c20Var;
        this.f32343c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32341a) {
            case 0:
                this.f32342b.a(Integer.valueOf(this.f32343c));
                return;
            default:
                org.telegram.messenger.c20 c20Var = this.f32342b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.f32343c));
                    return;
                }
                return;
        }
    }
}
