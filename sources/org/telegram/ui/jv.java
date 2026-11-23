package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class jv extends org.telegram.ui.Components.zg0 {
    public final int f49102f0 = 0;
    public final Object f49103g0;

    public jv(y91 y91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f49103g0 = y91Var;
    }

    @Override
    public final float d() {
        switch (this.f49102f0) {
            case 0:
                return ((bx) this.f49103g0).f46325a.getViewOffset();
            default:
                return ((y91) this.f49103g0).O.f53042m3;
        }
    }

    public jv(String str, String str2, bx bxVar) {
        super(str, str2);
        this.f49103g0 = bxVar;
    }
}
