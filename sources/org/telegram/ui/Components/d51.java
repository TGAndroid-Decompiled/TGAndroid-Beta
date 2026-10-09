package org.telegram.ui.Components;

import android.view.View;
public final class d51 implements View.OnClickListener {
    public final int f25604a;
    public final m51 f25605b;

    public d51(m51 m51Var, int i10) {
        this.f25604a = i10;
        this.f25605b = m51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25604a) {
            case 0:
                this.f25605b.dismiss();
                return;
            case 1:
                this.f25605b.dismiss();
                return;
            case 2:
                this.f25605b.dismiss();
                return;
            case 3:
                m51 m51Var = this.f25605b;
                CharSequence charSequence = m51Var.f28695c0;
                if (charSequence != null) {
                    m51Var.f28696d0.run(charSequence);
                }
                m51Var.dismiss();
                return;
            default:
                m51.Q(this.f25605b, view);
                return;
        }
    }
}
