package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class cx extends org.telegram.ui.Components.ji0 {
    public final int f32965f0 = 0;
    public final Object f32966g0;

    public cx(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f32966g0 = fg1Var;
    }

    @Override
    public final float d() {
        switch (this.f32965f0) {
            case 0:
                return ((vy) this.f32966g0).f38522a.getViewOffset();
            default:
                return ((fg1) this.f32966g0).N.f33121f3;
        }
    }

    public cx(String str, String str2, vy vyVar) {
        super(str, str2);
        this.f32966g0 = vyVar;
    }
}
