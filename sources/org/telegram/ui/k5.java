package org.telegram.ui;

import android.widget.TextView;
public final class k5 implements org.telegram.ui.Components.jo0 {
    public final int f38189a;
    public final TextView f38190b;
    public final l5 f38191c;

    public k5(l5 l5Var, TextView textView, int i10) {
        this.f38189a = i10;
        this.f38191c = l5Var;
        this.f38190b = textView;
    }

    @Override
    public final void A() {
        int i10 = this.f38189a;
    }

    @Override
    public final void X(float f10, boolean z4) {
        switch (this.f38189a) {
            case 0:
                l5.f38538c = f10;
                this.f38190b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.pv0 pv0Var = this.f38191c.f38540b;
                pv0Var.N();
                pv0Var.M();
                return;
            default:
                this.f38190b.setText("Alpha " + l5.f38539e);
                l5.f38539e = f10;
                this.f38191c.f38540b.M();
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f38189a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int m0() {
        switch (this.f38189a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
