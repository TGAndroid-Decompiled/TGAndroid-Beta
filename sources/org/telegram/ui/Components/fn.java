package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class fn implements TextWatcher {
    public final en f34647a;
    public final int f34648b;
    public final org.telegram.ui.l4 f34649c;

    public fn(org.telegram.ui.l4 l4Var, en enVar, int i7) {
        this.f34649c = l4Var;
        this.f34647a = enVar;
        this.f34648b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        jn jnVar = (jn) this.f34649c.f48827e;
        en enVar = this.f34647a;
        if (enVar.getTag() != null) {
            return;
        }
        int i10 = this.f34648b;
        if (i10 == 11) {
            i7 = jnVar.f36098o0;
        } else {
            i7 = jnVar.f36097n0;
        }
        v4.e1 K = jnVar.f36107s.K(i7);
        if (K != null && jnVar.f36116y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.f36116y.setDirection(1);
            jnVar.f36116y.setDelegate(enVar);
            jnVar.f36116y.setTranslationY(K.f58535a.getY());
            jnVar.f36116y.e();
        }
        if (i10 == 11) {
            jnVar.P = editable;
        } else {
            jnVar.O = editable;
        }
        if (K != null) {
            jn.Q(jnVar, K.f58535a, i7);
        }
        jnVar.Y();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
