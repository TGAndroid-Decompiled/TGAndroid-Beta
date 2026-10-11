package org.telegram.ui.Components;

import android.view.View;
public final class e51 implements View.OnClickListener {
    public final int f25995a;
    public final n51 f25996b;

    public e51(n51 n51Var, int i10) {
        this.f25995a = i10;
        this.f25996b = n51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25995a) {
            case 0:
                this.f25996b.dismiss();
                return;
            case 1:
                this.f25996b.dismiss();
                return;
            case 2:
                this.f25996b.dismiss();
                return;
            case 3:
                n51 n51Var = this.f25996b;
                CharSequence charSequence = n51Var.f29037c0;
                if (charSequence != null) {
                    n51Var.f29038d0.run(charSequence);
                }
                n51Var.dismiss();
                return;
            default:
                n51.Q(this.f25996b, view);
                return;
        }
    }
}
