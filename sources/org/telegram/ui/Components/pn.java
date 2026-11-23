package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class pn implements TextWatcher {
    public final on f38594a;
    public final int f38595b;
    public final org.telegram.ui.l4 f38596c;

    public pn(org.telegram.ui.l4 l4Var, on onVar, int i7) {
        this.f38596c = l4Var;
        this.f38594a = onVar;
        this.f38595b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        tn tnVar = (tn) this.f38596c.f49452e;
        on onVar = this.f38594a;
        if (onVar.getTag() != null) {
            return;
        }
        int i10 = this.f38595b;
        if (i10 == 11) {
            i7 = tnVar.f39953o0;
        } else {
            i7 = tnVar.f39952n0;
        }
        v4.e1 K = tnVar.f39962s.K(i7);
        if (K != null && tnVar.f39971y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f39971y.setDirection(1);
            tnVar.f39971y.setDelegate(onVar);
            tnVar.f39971y.setTranslationY(K.f59111a.getY());
            tnVar.f39971y.e();
        }
        if (i10 == 11) {
            tnVar.P = editable;
        } else {
            tnVar.O = editable;
        }
        if (K != null) {
            tn.Q(tnVar, K.f59111a, i7);
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
