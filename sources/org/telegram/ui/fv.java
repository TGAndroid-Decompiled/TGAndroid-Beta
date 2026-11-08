package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class fv extends org.telegram.ui.Components.kg0 {
    public final int f45709f0 = 0;
    public final Object f45710g0;

    public fv(w91 w91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f45710g0 = w91Var;
    }

    @Override
    public final float d() {
        switch (this.f45709f0) {
            case 0:
                return ((vw) this.f45710g0).f50782a.getViewOffset();
            default:
                return ((w91) this.f45710g0).N.f50274l3;
        }
    }

    public fv(String str, String str2, vw vwVar) {
        super(str, str2);
        this.f45710g0 = vwVar;
    }
}
