package org.telegram.ui;

import android.widget.TextView;
public final class k5 implements org.telegram.ui.Components.jo0 {
    public final int f35569a;
    public final TextView f35570b;
    public final l5 f35571c;

    public k5(l5 l5Var, TextView textView, int i10) {
        this.f35569a = i10;
        this.f35571c = l5Var;
        this.f35570b = textView;
    }

    @Override
    public final void B() {
        int i10 = this.f35569a;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        switch (this.f35569a) {
            case 0:
                l5.f35957c = f10;
                this.f35570b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.qv0 qv0Var = this.f35571c.f35958b;
                qv0Var.N();
                qv0Var.M();
                return;
            default:
                this.f35570b.setText("Alpha " + l5.e);
                l5.e = f10;
                this.f35571c.f35958b.M();
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f35569a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int j0() {
        switch (this.f35569a) {
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
