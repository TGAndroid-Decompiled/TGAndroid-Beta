package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class xm implements TextWatcher {
    public final wm f40340a;
    public final int f40341b;
    public final org.telegram.ui.l4 f40342c;

    public xm(org.telegram.ui.l4 l4Var, wm wmVar, int i7) {
        this.f40342c = l4Var;
        this.f40340a = wmVar;
        this.f40341b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        bn bnVar = (bn) this.f40342c.f47410e;
        wm wmVar = this.f40340a;
        if (wmVar.getTag() != null) {
            return;
        }
        int i10 = this.f40341b;
        if (i10 == 11) {
            i7 = bnVar.f32251n0;
        } else {
            i7 = bnVar.m0;
        }
        v4.d1 K = bnVar.f32260s.K(i7);
        if (K != null && bnVar.f32269y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, wmVar.getEditField().getPaint().getFontMetricsInt(), false);
            bnVar.f32269y.setDirection(1);
            bnVar.f32269y.setDelegate(wmVar);
            bnVar.f32269y.setTranslationY(K.f57043a.getY());
            bnVar.f32269y.e();
        }
        if (i10 == 11) {
            bnVar.O = editable;
        } else {
            bnVar.N = editable;
        }
        if (K != null) {
            bn.P(bnVar, K.f57043a, i7);
        }
        bnVar.X();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
