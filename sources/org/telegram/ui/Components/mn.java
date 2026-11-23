package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class mn implements TextWatcher {
    public final ln f37502a;
    public final int f37503b;
    public final org.telegram.ui.l4 f37504c;

    public mn(org.telegram.ui.l4 l4Var, ln lnVar, int i7) {
        this.f37504c = l4Var;
        this.f37502a = lnVar;
        this.f37503b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        qn qnVar = (qn) this.f37504c.f49583e;
        ln lnVar = this.f37502a;
        if (lnVar.getTag() != null) {
            return;
        }
        int i10 = this.f37503b;
        if (i10 == 11) {
            i7 = qnVar.f38935o0;
        } else {
            i7 = qnVar.f38934n0;
        }
        v4.f1 K = qnVar.f38944s.K(i7);
        if (K != null && qnVar.f38953y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
            qnVar.f38953y.setDirection(1);
            qnVar.f38953y.setDelegate(lnVar);
            qnVar.f38953y.setTranslationY(K.f59245a.getY());
            qnVar.f38953y.e();
        }
        if (i10 == 11) {
            qnVar.P = editable;
        } else {
            qnVar.O = editable;
        }
        if (K != null) {
            qn.Q(qnVar, K.f59245a, i7);
        }
        qnVar.Y();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
