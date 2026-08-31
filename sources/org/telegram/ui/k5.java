package org.telegram.ui;

import android.widget.TextView;
public final class k5 implements org.telegram.ui.Components.ko0 {
    public final int f38279a;
    public final TextView f38280b;
    public final l5 f38281c;

    public k5(l5 l5Var, TextView textView, int i10) {
        this.f38279a = i10;
        this.f38281c = l5Var;
        this.f38280b = textView;
    }

    @Override
    public final void A() {
        int i10 = this.f38279a;
    }

    @Override
    public final void X(float f10, boolean z4) {
        switch (this.f38279a) {
            case 0:
                l5.f38637c = f10;
                this.f38280b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.qv0 qv0Var = this.f38281c.f38639b;
                qv0Var.N();
                qv0Var.M();
                return;
            default:
                this.f38280b.setText("Alpha " + l5.f38638e);
                l5.f38638e = f10;
                this.f38281c.f38639b.M();
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f38279a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int m0() {
        switch (this.f38279a) {
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
