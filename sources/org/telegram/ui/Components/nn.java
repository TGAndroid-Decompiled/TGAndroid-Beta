package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class nn implements TextWatcher {
    public final mn f37829a;
    public final int f37830b;
    public final org.telegram.ui.l4 f37831c;

    public nn(org.telegram.ui.l4 l4Var, mn mnVar, int i7) {
        this.f37831c = l4Var;
        this.f37829a = mnVar;
        this.f37830b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        rn rnVar = (rn) this.f37831c.f49426e;
        mn mnVar = this.f37829a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i10 = this.f37830b;
        if (i10 == 11) {
            i7 = rnVar.f39233o0;
        } else {
            i7 = rnVar.f39232n0;
        }
        v4.f1 K = rnVar.f39242s.K(i7);
        if (K != null && rnVar.f39251y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            rnVar.f39251y.setDirection(1);
            rnVar.f39251y.setDelegate(mnVar);
            rnVar.f39251y.setTranslationY(K.f59122a.getY());
            rnVar.f39251y.e();
        }
        if (i10 == 11) {
            rnVar.P = editable;
        } else {
            rnVar.O = editable;
        }
        if (K != null) {
            rn.Q(rnVar, K.f59122a, i7);
        }
        rnVar.Y();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
