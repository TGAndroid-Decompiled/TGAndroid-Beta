package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class iw extends org.telegram.ui.Components.fj0 {
    public final int f38126f0 = 0;
    public final Object f38127g0;

    public iw(re1 re1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f38127g0 = re1Var;
    }

    @Override
    public final float d() {
        switch (this.f38126f0) {
            case 0:
                return ((ay) this.f38127g0).f35447a.getViewOffset();
            default:
                return ((re1) this.f38127g0).N.f40209d3;
        }
    }

    public iw(String str, String str2, ay ayVar) {
        super(str, str2);
        this.f38127g0 = ayVar;
    }
}
