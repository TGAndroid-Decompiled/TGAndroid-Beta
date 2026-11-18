package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class jv extends org.telegram.ui.Components.xg0 {
    public final int f49088f0 = 0;
    public final Object f49089g0;

    public jv(y91 y91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f49089g0 = y91Var;
    }

    @Override
    public final float d() {
        switch (this.f49088f0) {
            case 0:
                return ((bx) this.f49089g0).f46307a.getViewOffset();
            default:
                return ((y91) this.f49089g0).O.f53036m3;
        }
    }

    public jv(String str, String str2, bx bxVar) {
        super(str, str2);
        this.f49089g0 = bxVar;
    }
}
