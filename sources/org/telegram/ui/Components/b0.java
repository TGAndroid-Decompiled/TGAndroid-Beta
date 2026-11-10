package org.telegram.ui.Components;

import android.view.View;
public final class b0 implements View.OnClickListener {
    public final int f32063a;
    public final org.telegram.messenger.c20 f32064b;
    public final int f32065c;

    public b0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.f32063a = i10;
        this.f32064b = c20Var;
        this.f32065c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32063a) {
            case 0:
                this.f32064b.a(Integer.valueOf(this.f32065c));
                return;
            default:
                org.telegram.messenger.c20 c20Var = this.f32064b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.f32065c));
                    return;
                }
                return;
        }
    }
}
