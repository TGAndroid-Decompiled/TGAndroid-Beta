package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class iv extends org.telegram.ui.Components.kg0 {
    public final int f46756f0 = 0;
    public final Object f46757g0;

    public iv(z91 z91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f46757g0 = z91Var;
    }

    @Override
    public final float d() {
        switch (this.f46756f0) {
            case 0:
                return ((yw) this.f46757g0).f52125a.getViewOffset();
            default:
                return ((z91) this.f46757g0).N.f51656l3;
        }
    }

    public iv(String str, String str2, yw ywVar) {
        super(str, str2);
        this.f46757g0 = ywVar;
    }
}
