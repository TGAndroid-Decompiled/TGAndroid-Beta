package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class fv extends org.telegram.ui.Components.kg0 {
    public final int f45732f0 = 0;
    public final Object f45733g0;

    public fv(v91 v91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f45733g0 = v91Var;
    }

    @Override
    public final float d() {
        switch (this.f45732f0) {
            case 0:
                return ((vw) this.f45733g0).f50838a.getViewOffset();
            default:
                return ((v91) this.f45733g0).N.f49996l3;
        }
    }

    public fv(String str, String str2, vw vwVar) {
        super(str, str2);
        this.f45733g0 = vwVar;
    }
}
