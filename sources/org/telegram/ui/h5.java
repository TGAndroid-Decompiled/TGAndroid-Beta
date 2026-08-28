package org.telegram.ui;

import android.widget.TextView;
public final class h5 implements org.telegram.ui.Components.on0 {
    public final int f38683a;
    public final TextView f38684b;
    public final i5 f38685c;

    public h5(i5 i5Var, TextView textView, int i9) {
        this.f38683a = i9;
        this.f38685c = i5Var;
        this.f38684b = textView;
    }

    @Override
    public final void Q(float f10, boolean z10) {
        switch (this.f38683a) {
            case 0:
                i5.f39007c = f10;
                this.f38684b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.xu0 xu0Var = this.f38685c.f39009b;
                xu0Var.N();
                xu0Var.M();
                return;
            default:
                this.f38684b.setText("Alpha " + i5.f39008e);
                i5.f39008e = f10;
                this.f38685c.f39009b.M();
                return;
        }
    }

    @Override
    public final int c0() {
        switch (this.f38683a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f38683a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final void n() {
        int i9 = this.f38683a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
