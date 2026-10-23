package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class kw extends org.telegram.ui.Components.ij0 {
    public final int f39080f0 = 0;
    public final Object f39081g0;

    public kw(ye1 ye1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39081g0 = ye1Var;
    }

    @Override
    public final float d() {
        switch (this.f39080f0) {
            case 0:
                return ((dy) this.f39081g0).f36750a.getViewOffset();
            default:
                return ((ye1) this.f39081g0).N.f43021g3;
        }
    }

    public kw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.f39081g0 = dyVar;
    }
}
