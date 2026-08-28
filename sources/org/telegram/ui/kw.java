package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class kw extends org.telegram.ui.Components.uh0 {
    public final int f39936f0 = 0;
    public final Object f39937g0;

    public kw(we1 we1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39937g0 = we1Var;
    }

    @Override
    public final float d() {
        switch (this.f39936f0) {
            case 0:
                return ((cy) this.f39937g0).f37350a.getViewOffset();
            default:
                return ((we1) this.f39937g0).J.f43240b3;
        }
    }

    public kw(String str, String str2, cy cyVar) {
        super(str, str2);
        this.f39937g0 = cyVar;
    }
}
