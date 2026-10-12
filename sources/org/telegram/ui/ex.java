package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ex extends org.telegram.ui.Components.jj0 {
    public final int f35684f0 = 0;
    public final Object f35685g0;

    public ex(lg1 lg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f35685g0 = lg1Var;
    }

    @Override
    public final float d() {
        switch (this.f35684f0) {
            case 0:
                return ((xy) this.f35685g0).f41980a.getViewOffset();
            default:
                return ((lg1) this.f35685g0).N.f37378d3;
        }
    }

    public ex(String str, String str2, xy xyVar) {
        super(str, str2);
        this.f35685g0 = xyVar;
    }
}
