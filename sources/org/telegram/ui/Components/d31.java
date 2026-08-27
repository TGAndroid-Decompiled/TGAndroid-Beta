package org.telegram.ui.Components;

import android.view.View;

public final class d31 implements View.OnClickListener {

    public final int f27639a;

    public final m31 f27640b;

    public d31(m31 m31Var, int i10) {
        this.f27639a = i10;
        this.f27640b = m31Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27639a) {
            case 0:
                this.f27640b.dismiss();
                break;
            case 1:
                this.f27640b.dismiss();
                break;
            case 2:
                this.f27640b.dismiss();
                break;
            case 3:
                m31 m31Var = this.f27640b;
                CharSequence charSequence = m31Var.Y;
                if (charSequence != null) {
                    m31Var.Z.run(charSequence);
                }
                m31Var.dismiss();
                break;
            default:
                m31.P(this.f27640b, view);
                break;
        }
    }
}
