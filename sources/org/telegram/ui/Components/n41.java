package org.telegram.ui.Components;

import android.view.View;
public final class n41 implements View.OnClickListener {
    public final int f26629a;
    public final w41 f26630b;

    public n41(w41 w41Var, int i10) {
        this.f26629a = i10;
        this.f26630b = w41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26629a) {
            case 0:
                this.f26630b.dismiss();
                return;
            case 1:
                this.f26630b.dismiss();
                return;
            case 2:
                this.f26630b.dismiss();
                return;
            case 3:
                w41 w41Var = this.f26630b;
                CharSequence charSequence = w41Var.f29919c0;
                if (charSequence != null) {
                    w41Var.f29920d0.run(charSequence);
                }
                w41Var.dismiss();
                return;
            default:
                w41.P(this.f26630b, view);
                return;
        }
    }
}
