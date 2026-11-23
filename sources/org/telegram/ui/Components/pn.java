package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class pn implements TextWatcher {
    public final on f38639a;
    public final int f38640b;
    public final org.telegram.ui.l4 f38641c;

    public pn(org.telegram.ui.l4 l4Var, on onVar, int i7) {
        this.f38641c = l4Var;
        this.f38639a = onVar;
        this.f38640b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        tn tnVar = (tn) this.f38641c.f49474e;
        on onVar = this.f38639a;
        if (onVar.getTag() != null) {
            return;
        }
        int i10 = this.f38640b;
        if (i10 == 11) {
            i7 = tnVar.f39974o0;
        } else {
            i7 = tnVar.f39973n0;
        }
        v4.f1 K = tnVar.f39983s.K(i7);
        if (K != null && tnVar.f39992y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f39992y.setDirection(1);
            tnVar.f39992y.setDelegate(onVar);
            tnVar.f39992y.setTranslationY(K.f59165a.getY());
            tnVar.f39992y.e();
        }
        if (i10 == 11) {
            tnVar.P = editable;
        } else {
            tnVar.O = editable;
        }
        if (K != null) {
            tn.Q(tnVar, K.f59165a, i7);
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
