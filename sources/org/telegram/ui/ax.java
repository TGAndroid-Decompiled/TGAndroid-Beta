package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ax extends org.telegram.ui.Components.ii0 {
    public final int f31985f0 = 0;
    public final Object f31986g0;

    public ax(eg1 eg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f31986g0 = eg1Var;
    }

    @Override
    public final float d() {
        switch (this.f31985f0) {
            case 0:
                return ((ty) this.f31986g0).f37752a.getViewOffset();
            default:
                return ((eg1) this.f31986g0).N.f32788f3;
        }
    }

    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.f31986g0 = tyVar;
    }
}
