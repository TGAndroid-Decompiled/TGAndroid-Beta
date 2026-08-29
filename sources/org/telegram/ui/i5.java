package org.telegram.ui;

import android.widget.TextView;
public final class i5 implements org.telegram.ui.Components.zn0 {
    public final int f39125a;
    public final TextView f39126b;
    public final j5 f39127c;

    public i5(j5 j5Var, TextView textView, int i10) {
        this.f39125a = i10;
        this.f39127c = j5Var;
        this.f39126b = textView;
    }

    @Override
    public final void W(float f9, boolean z10) {
        switch (this.f39125a) {
            case 0:
                j5.f39431c = f9;
                this.f39126b.setText("Saturation " + (f9 * 5.0f));
                org.telegram.ui.Components.hv0 hv0Var = this.f39127c.f39433b;
                hv0Var.N();
                hv0Var.M();
                return;
            default:
                this.f39126b.setText("Alpha " + j5.f39432e);
                j5.f39432e = f9;
                this.f39127c.f39433b.M();
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f39125a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int k0() {
        switch (this.f39125a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void v() {
        int i10 = this.f39125a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
