package org.telegram.ui.Components;

import android.view.View;
public final class b31 implements View.OnClickListener {
    public final int f27030a;
    public final k31 f27031b;

    public b31(k31 k31Var, int i9) {
        this.f27030a = i9;
        this.f27031b = k31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27030a) {
            case 0:
                this.f27031b.dismiss();
                return;
            case 1:
                this.f27031b.dismiss();
                return;
            case 2:
                this.f27031b.dismiss();
                return;
            case 3:
                k31 k31Var = this.f27031b;
                CharSequence charSequence = k31Var.Y;
                if (charSequence != null) {
                    k31Var.Z.run(charSequence);
                }
                k31Var.dismiss();
                return;
            default:
                k31.O(this.f27031b, view);
                return;
        }
    }
}
