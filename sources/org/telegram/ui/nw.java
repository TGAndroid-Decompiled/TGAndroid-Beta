package org.telegram.ui;

import android.text.SpannableStringBuilder;

public final class nw extends org.telegram.ui.Components.wh0 {

    public final int f40948f0 = 0;

    public final Object f40949g0;

    public nw(we1 we1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f40949g0 = we1Var;
    }

    @Override
    public final float d() {
        switch (this.f40948f0) {
            case 0:
                return ((fy) this.f40949g0).f38225a.getViewOffset();
            default:
                return ((we1) this.f40949g0).J.f43209b3;
        }
    }

    public nw(String str, String str2, fy fyVar) {
        super(str, str2);
        this.f40949g0 = fyVar;
    }
}
