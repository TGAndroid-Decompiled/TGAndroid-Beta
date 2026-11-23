package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class iv extends org.telegram.ui.Components.yg0 {
    public final int f48925f0 = 0;
    public final Object f48926g0;

    public iv(w91 w91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f48926g0 = w91Var;
    }

    @Override
    public final float d() {
        switch (this.f48925f0) {
            case 0:
                return ((ax) this.f48926g0).f45822a.getViewOffset();
            default:
                return ((w91) this.f48926g0).O.f52600m3;
        }
    }

    public iv(String str, String str2, ax axVar) {
        super(str, str2);
        this.f48926g0 = axVar;
    }
}
