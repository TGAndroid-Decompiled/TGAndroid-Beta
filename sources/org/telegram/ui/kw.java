package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class kw extends org.telegram.ui.Components.mh0 {
    public final int f38961f0 = 0;
    public final Object f38962g0;

    public kw(pb1 pb1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f38962g0 = pb1Var;
    }

    @Override
    public final float d() {
        switch (this.f38961f0) {
            case 0:
                return ((zx) this.f38962g0).f44239a.getViewOffset();
            default:
                return ((pb1) this.f38962g0).N.f39899l3;
        }
    }

    public kw(String str, String str2, zx zxVar) {
        super(str, str2);
        this.f38962g0 = zxVar;
    }
}
