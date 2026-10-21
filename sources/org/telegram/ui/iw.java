package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class iw extends org.telegram.ui.Components.fj0 {
    public final int f38122f0 = 0;
    public final Object f38123g0;

    public iw(re1 re1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f38123g0 = re1Var;
    }

    @Override
    public final float d() {
        switch (this.f38122f0) {
            case 0:
                return ((ay) this.f38123g0).f35443a.getViewOffset();
            default:
                return ((re1) this.f38123g0).N.f40205d3;
        }
    }

    public iw(String str, String str2, ay ayVar) {
        super(str, str2);
        this.f38123g0 = ayVar;
    }
}
