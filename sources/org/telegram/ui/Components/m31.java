package org.telegram.ui.Components;

import android.view.View;
public final class m31 implements View.OnClickListener {
    public final int f30565a;
    public final v31 f30566b;

    public m31(v31 v31Var, int i10) {
        this.f30565a = i10;
        this.f30566b = v31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30565a) {
            case 0:
                this.f30566b.dismiss();
                return;
            case 1:
                this.f30566b.dismiss();
                return;
            case 2:
                this.f30566b.dismiss();
                return;
            case 3:
                v31 v31Var = this.f30566b;
                CharSequence charSequence = v31Var.Y;
                if (charSequence != null) {
                    v31Var.Z.run(charSequence);
                }
                v31Var.dismiss();
                return;
            default:
                v31.P(this.f30566b, view);
                return;
        }
    }
}
