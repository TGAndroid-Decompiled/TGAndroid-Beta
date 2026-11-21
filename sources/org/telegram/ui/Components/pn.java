package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class pn implements TextWatcher {
    public final on f38641a;
    public final int f38642b;
    public final org.telegram.ui.l4 f38643c;

    public pn(org.telegram.ui.l4 l4Var, on onVar, int i7) {
        this.f38643c = l4Var;
        this.f38641a = onVar;
        this.f38642b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        tn tnVar = (tn) this.f38643c.f49470e;
        on onVar = this.f38641a;
        if (onVar.getTag() != null) {
            return;
        }
        int i10 = this.f38642b;
        if (i10 == 11) {
            i7 = tnVar.f39982o0;
        } else {
            i7 = tnVar.f39981n0;
        }
        v4.f1 K = tnVar.f39991s.K(i7);
        if (K != null && tnVar.f40000y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f40000y.setDirection(1);
            tnVar.f40000y.setDelegate(onVar);
            tnVar.f40000y.setTranslationY(K.f59161a.getY());
            tnVar.f40000y.e();
        }
        if (i10 == 11) {
            tnVar.P = editable;
        } else {
            tnVar.O = editable;
        }
        if (K != null) {
            tn.Q(tnVar, K.f59161a, i7);
        }
        tnVar.Y();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
