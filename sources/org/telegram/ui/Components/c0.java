package org.telegram.ui.Components;

import android.view.View;
public final class c0 implements View.OnClickListener {
    public final int f24945a;
    public final org.telegram.messenger.r20 f24946b;
    public final int f24947c;

    public c0(int i10, int i11, org.telegram.messenger.r20 r20Var) {
        this.f24945a = i11;
        this.f24946b = r20Var;
        this.f24947c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24945a) {
            case 0:
                this.f24946b.a(Integer.valueOf(this.f24947c));
                return;
            default:
                org.telegram.messenger.r20 r20Var = this.f24946b;
                if (r20Var != null) {
                    r20Var.a(Integer.valueOf(this.f24947c));
                    return;
                }
                return;
        }
    }
}
