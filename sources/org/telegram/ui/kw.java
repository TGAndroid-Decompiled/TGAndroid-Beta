package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class kw extends org.telegram.ui.Components.ej0 {
    public final int f38692f0 = 0;
    public final Object f38693g0;

    public kw(te1 te1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f38693g0 = te1Var;
    }

    @Override
    public final float d() {
        switch (this.f38692f0) {
            case 0:
                return ((dy) this.f38693g0).f36333a.getViewOffset();
            default:
                return ((te1) this.f38693g0).N.f40715d3;
        }
    }

    public kw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.f38693g0 = dyVar;
    }
}
