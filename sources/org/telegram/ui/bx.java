package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class bx extends org.telegram.ui.Components.qj0 {
    public final int f36272f0 = 0;
    public final Object f36273g0;

    public bx(hg1 hg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f36273g0 = hg1Var;
    }

    @Override
    public final float d() {
        switch (this.f36272f0) {
            case 0:
                return ((uy) this.f36273g0).f42613a.getViewOffset();
            default:
                return ((hg1) this.f36273g0).N.f37778d3;
        }
    }

    public bx(String str, String str2, uy uyVar) {
        super(str, str2);
        this.f36273g0 = uyVar;
    }
}
