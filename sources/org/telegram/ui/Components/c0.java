package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f24922a;
    public final org.telegram.messenger.q20 f24923b;
    public final int f24924c;

    public c0(int i10, int i11, org.telegram.messenger.q20 q20Var) {
        this.f24922a = i11;
        this.f24923b = q20Var;
        this.f24924c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24922a) {
            case 0:
                this.f24923b.a(Integer.valueOf(this.f24924c));
                return;
            default:
                org.telegram.messenger.q20 q20Var = this.f24923b;
                if (q20Var != null) {
                    q20Var.a(Integer.valueOf(this.f24924c));
                    return;
                }
                return;
        }
    }
}
