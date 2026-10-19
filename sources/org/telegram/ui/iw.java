package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class iw extends org.telegram.ui.Components.ej0 {
    public final int f38113f0 = 0;
    public final Object f38114g0;

    public iw(re1 re1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f38114g0 = re1Var;
    }

    @Override
    public final float d() {
        switch (this.f38113f0) {
            case 0:
                return ((ay) this.f38114g0).f35452a.getViewOffset();
            default:
                return ((re1) this.f38114g0).N.f40208d3;
        }
    }

    public iw(String str, String str2, ay ayVar) {
        super(str, str2);
        this.f38114g0 = ayVar;
    }
}
