package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class xm implements TextWatcher {
    public final wm f40284a;
    public final int f40285b;
    public final org.telegram.ui.l4 f40286c;

    public xm(org.telegram.ui.l4 l4Var, wm wmVar, int i7) {
        this.f40286c = l4Var;
        this.f40284a = wmVar;
        this.f40285b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        bn bnVar = (bn) this.f40286c.f47379e;
        wm wmVar = this.f40284a;
        if (wmVar.getTag() != null) {
            return;
        }
        int i10 = this.f40285b;
        if (i10 == 11) {
            i7 = bnVar.f32202n0;
        } else {
            i7 = bnVar.m0;
        }
        v4.d1 K = bnVar.f32211s.K(i7);
        if (K != null && bnVar.f32220y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, wmVar.getEditField().getPaint().getFontMetricsInt(), false);
            bnVar.f32220y.setDirection(1);
            bnVar.f32220y.setDelegate(wmVar);
            bnVar.f32220y.setTranslationY(K.f56927a.getY());
            bnVar.f32220y.e();
        }
        if (i10 == 11) {
            bnVar.O = editable;
        } else {
            bnVar.N = editable;
        }
        if (K != null) {
            bn.P(bnVar, K.f56927a, i7);
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
