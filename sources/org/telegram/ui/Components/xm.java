package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class xm implements TextWatcher {
    public final wm f40319a;
    public final int f40320b;
    public final org.telegram.ui.l4 f40321c;

    public xm(org.telegram.ui.l4 l4Var, wm wmVar, int i7) {
        this.f40321c = l4Var;
        this.f40319a = wmVar;
        this.f40320b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        bn bnVar = (bn) this.f40321c.f47405e;
        wm wmVar = this.f40319a;
        if (wmVar.getTag() != null) {
            return;
        }
        int i10 = this.f40320b;
        if (i10 == 11) {
            i7 = bnVar.f32230n0;
        } else {
            i7 = bnVar.m0;
        }
        v4.d1 K = bnVar.f32239s.K(i7);
        if (K != null && bnVar.f32248y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, wmVar.getEditField().getPaint().getFontMetricsInt(), false);
            bnVar.f32248y.setDirection(1);
            bnVar.f32248y.setDelegate(wmVar);
            bnVar.f32248y.setTranslationY(K.f56951a.getY());
            bnVar.f32248y.e();
        }
        if (i10 == 11) {
            bnVar.O = editable;
        } else {
            bnVar.N = editable;
        }
        if (K != null) {
            bn.P(bnVar, K.f56951a, i7);
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
