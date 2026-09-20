package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class ax extends org.telegram.ui.Components.si0 {
    public final int f32213f0 = 0;
    public final Object f32214g0;

    public ax(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f32214g0 = fg1Var;
    }

    @Override
    public final float d() {
        switch (this.f32213f0) {
            case 0:
                return ((ty) this.f32214g0).f37904a.getViewOffset();
            default:
                return ((fg1) this.f32214g0).N.f33041f3;
        }
    }

    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.f32214g0 = tyVar;
    }
}
