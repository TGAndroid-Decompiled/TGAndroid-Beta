package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class cx extends org.telegram.ui.Components.si0 {
    public final int f31784f0 = 0;
    public final Object f31785g0;

    public cx(ig1 ig1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f31785g0 = ig1Var;
    }

    @Override
    public final float d() {
        switch (this.f31784f0) {
            case 0:
                return ((vy) this.f31785g0).f37645a.getViewOffset();
            default:
                return ((ig1) this.f31785g0).N.f33098f3;
        }
    }

    public cx(String str, String str2, vy vyVar) {
        super(str, str2);
        this.f31785g0 = vyVar;
    }
}
