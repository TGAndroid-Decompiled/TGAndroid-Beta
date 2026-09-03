package org.telegram.ui;

import android.widget.TextView;
public final class m5 implements org.telegram.ui.Components.io0 {
    public final int f35977a;
    public final TextView f35978b;
    public final n5 f35979c;

    public m5(n5 n5Var, TextView textView, int i10) {
        this.f35977a = i10;
        this.f35979c = n5Var;
        this.f35978b = textView;
    }

    @Override
    public final void B() {
        int i10 = this.f35977a;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        switch (this.f35977a) {
            case 0:
                n5.f36387c = f10;
                this.f35978b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.qv0 qv0Var = this.f35979c.f36388b;
                qv0Var.N();
                qv0Var.M();
                return;
            default:
                this.f35978b.setText("Alpha " + n5.e);
                n5.e = f10;
                this.f35979c.f36388b.M();
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f35977a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int j0() {
        switch (this.f35977a) {
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
