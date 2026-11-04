package org.telegram.ui;

import android.text.SpannableStringBuilder;
public final class cv extends org.telegram.ui.Components.ng0 {
    public final int f44438f0 = 0;
    public final Object f44439g0;

    public cv(m91 m91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.f44439g0 = m91Var;
    }

    @Override
    public final float d() {
        switch (this.f44438f0) {
            case 0:
                return ((tw) this.f44439g0).f49897a.getViewOffset();
            default:
                return ((m91) this.f44439g0).O.f46836m3;
        }
    }

    public cv(String str, String str2, tw twVar) {
        super(str, str2);
        this.f44439g0 = twVar;
    }
}
