package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class fv extends org.telegram.ui.Components.kg0 {
    public final int f45733f0 = 0;
    public final Object f45734g0;

    public fv(v91 v91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f45734g0 = v91Var;
    }

    @Override
    public final float d() {
        switch (this.f45733f0) {
            case 0:
                return ((vw) this.f45734g0).f50839a.getViewOffset();
            default:
                return ((v91) this.f45734g0).N.f49997l3;
        }
    }

    public fv(String str, String str2, vw vwVar) {
        super(str, str2);
        this.f45734g0 = vwVar;
    }
}
