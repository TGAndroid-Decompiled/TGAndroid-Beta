package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class bx extends org.telegram.ui.Components.pj0 {
    public final int f36270f0 = 0;
    public final Object f36271g0;

    public bx(hg1 hg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f36271g0 = hg1Var;
    }

    @Override
    public final float d() {
        switch (this.f36270f0) {
            case 0:
                return ((uy) this.f36271g0).f42611a.getViewOffset();
            default:
                return ((hg1) this.f36271g0).N.f37781d3;
        }
    }

    public bx(String str, String str2, uy uyVar) {
        super(str, str2);
        this.f36271g0 = uyVar;
    }
}
