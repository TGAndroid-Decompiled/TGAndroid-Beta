package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class jw extends org.telegram.ui.Components.nh0 {
    public final int f38567f0 = 0;
    public final Object f38568g0;

    public jw(nb1 nb1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f38568g0 = nb1Var;
    }

    @Override
    public final float d() {
        switch (this.f38567f0) {
            case 0:
                return ((yx) this.f38568g0).f43733a.getViewOffset();
            default:
                return ((nb1) this.f38568g0).N.f39185l3;
        }
    }

    public jw(String str, String str2, yx yxVar) {
        super(str, str2);
        this.f38568g0 = yxVar;
    }
}
