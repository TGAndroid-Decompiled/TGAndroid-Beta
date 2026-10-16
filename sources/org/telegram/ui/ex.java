package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ex extends org.telegram.ui.Components.jj0 {
    public final int f35396f0 = 0;
    public final Object f35397g0;

    public ex(kg1 kg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f35397g0 = kg1Var;
    }

    @Override
    public final float d() {
        switch (this.f35396f0) {
            case 0:
                return ((xy) this.f35397g0).f41679a.getViewOffset();
            default:
                return ((kg1) this.f35397g0).N.f36808d3;
        }
    }

    public ex(String str, String str2, xy xyVar) {
        super(str, str2);
        this.f35397g0 = xyVar;
    }
}
