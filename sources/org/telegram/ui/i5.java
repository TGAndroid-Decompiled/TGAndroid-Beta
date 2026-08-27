package org.telegram.ui;

import android.widget.TextView;

public final class i5 implements org.telegram.ui.Components.pn0 {

    public final int f38980a;

    public final TextView f38981b;

    public final j5 f38982c;

    public i5(j5 j5Var, TextView textView, int i10) {
        this.f38980a = i10;
        this.f38982c = j5Var;
        this.f38981b = textView;
    }

    @Override
    public final void P(float f10, boolean z10) {
        switch (this.f38980a) {
            case 0:
                j5.f39252c = f10;
                this.f38981b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.zu0 zu0Var = this.f38982c.f39254b;
                zu0Var.N();
                zu0Var.M();
                break;
            default:
                this.f38981b.setText("Alpha " + j5.f39253e);
                j5.f39253e = f10;
                this.f38982c.f39254b.M();
                break;
        }
    }

    @Override
    public final int a0() {
        switch (this.f38980a) {
        }
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f38980a) {
        }
        return null;
    }

    @Override
    public final void r() {
        int i10 = this.f38980a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
