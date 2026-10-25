package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class fw extends org.telegram.ui.Components.hj0 {
    public final int f39479f0 = 0;
    public final Object f39480g0;

    public fw(af1 af1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39480g0 = af1Var;
    }

    @Override
    public final float d() {
        switch (this.f39479f0) {
            case 0:
                return ((ay) this.f39480g0).f37910a.getViewOffset();
            default:
                return ((af1) this.f39480g0).N.f46051m3;
        }
    }

    public fw(String str, String str2, ay ayVar) {
        super(str, str2);
        this.f39480g0 = ayVar;
    }
}
