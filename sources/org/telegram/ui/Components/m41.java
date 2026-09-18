package org.telegram.ui.Components;

import android.view.View;
public final class m41 implements View.OnClickListener {
    public final int f26326a;
    public final v41 f26327b;

    public m41(v41 v41Var, int i10) {
        this.f26326a = i10;
        this.f26327b = v41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26326a) {
            case 0:
                this.f26327b.dismiss();
                return;
            case 1:
                this.f26327b.dismiss();
                return;
            case 2:
                this.f26327b.dismiss();
                return;
            case 3:
                v41 v41Var = this.f26327b;
                CharSequence charSequence = v41Var.f28917c0;
                if (charSequence != null) {
                    v41Var.f28918d0.run(charSequence);
                }
                v41Var.dismiss();
                return;
            default:
                v41.P(this.f26327b, view);
                return;
        }
    }
}
