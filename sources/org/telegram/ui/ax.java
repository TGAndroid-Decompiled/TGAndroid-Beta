package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ax extends org.telegram.ui.Components.ii0 {
    public final int f32002f0 = 0;
    public final Object f32003g0;

    public ax(dg1 dg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f32003g0 = dg1Var;
    }

    @Override
    public final float d() {
        switch (this.f32002f0) {
            case 0:
                return ((ty) this.f32003g0).f37803a.getViewOffset();
            default:
                return ((dg1) this.f32003g0).N.f32162f3;
        }
    }

    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.f32003g0 = tyVar;
    }
}
