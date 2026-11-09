package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class hv extends org.telegram.ui.Components.lg0 {
    public final int f46412f0 = 0;
    public final Object f46413g0;

    public hv(y91 y91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f46413g0 = y91Var;
    }

    @Override
    public final float d() {
        switch (this.f46412f0) {
            case 0:
                return ((xw) this.f46413g0).f51772a.getViewOffset();
            default:
                return ((y91) this.f46413g0).N.f51001l3;
        }
    }

    public hv(String str, String str2, xw xwVar) {
        super(str, str2);
        this.f46413g0 = xwVar;
    }
}
