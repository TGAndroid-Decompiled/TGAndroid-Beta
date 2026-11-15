package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class gv extends org.telegram.ui.Components.ng0 {
    public final int f47518f0 = 0;
    public final Object f47519g0;

    public gv(u91 u91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f47519g0 = u91Var;
    }

    @Override
    public final float d() {
        switch (this.f47518f0) {
            case 0:
                return ((xw) this.f47519g0).f53335a.getViewOffset();
            default:
                return ((u91) this.f47519g0).O.f51163m3;
        }
    }

    public gv(String str, String str2, xw xwVar) {
        super(str, str2);
        this.f47519g0 = xwVar;
    }
}
