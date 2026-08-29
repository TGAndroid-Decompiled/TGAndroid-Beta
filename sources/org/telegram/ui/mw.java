package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class mw extends org.telegram.ui.Components.ei0 {
    public final int f40641f0 = 0;
    public final Object f40642g0;

    public mw(ze1 ze1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f40642g0 = ze1Var;
    }

    @Override
    public final float d() {
        switch (this.f40641f0) {
            case 0:
                return ((ey) this.f40642g0).f37921a.getViewOffset();
            default:
                return ((ze1) this.f40642g0).J.f44580b3;
        }
    }

    public mw(String str, String str2, ey eyVar) {
        super(str, str2);
        this.f40642g0 = eyVar;
    }
}
