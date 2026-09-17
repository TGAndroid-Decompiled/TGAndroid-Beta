package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ax extends org.telegram.ui.Components.ii0 {
    public final int f34589f0 = 0;
    public final Object f34590g0;

    public ax(eg1 eg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f34590g0 = eg1Var;
    }

    @Override
    public final float d() {
        switch (this.f34589f0) {
            case 0:
                return ((ty) this.f34590g0).f40886a.getViewOffset();
            default:
                return ((eg1) this.f34590g0).N.f35135f3;
        }
    }

    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.f34590g0 = tyVar;
    }
}
