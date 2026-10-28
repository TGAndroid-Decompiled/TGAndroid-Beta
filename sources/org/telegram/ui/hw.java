package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class hw extends org.telegram.ui.Components.ij0 {
    public final int f39997f0 = 0;
    public final Object f39998g0;

    public hw(cf1 cf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39998g0 = cf1Var;
    }

    @Override
    public final float d() {
        switch (this.f39997f0) {
            case 0:
                return ((dy) this.f39998g0).f38702a.getViewOffset();
            default:
                return ((cf1) this.f39998g0).N.f37768m3;
        }
    }

    public hw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.f39998g0 = dyVar;
    }
}
