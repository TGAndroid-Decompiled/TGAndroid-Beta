package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class kw extends org.telegram.ui.Components.hj0 {
    public final int f39060f0 = 0;
    public final Object f39061g0;

    public kw(xe1 xe1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f39061g0 = xe1Var;
    }

    @Override
    public final float d() {
        switch (this.f39060f0) {
            case 0:
                return ((dy) this.f39061g0).f36737a.getViewOffset();
            default:
                return ((xe1) this.f39061g0).N.f42715g3;
        }
    }

    public kw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.f39061g0 = dyVar;
    }
}
