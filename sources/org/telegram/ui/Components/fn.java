package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class fn implements TextWatcher {
    public final en f26106a;
    public final int f26107b;
    public final fg.j f26108c;

    public fn(fg.j jVar, en enVar, int i10) {
        this.f26108c = jVar;
        this.f26106a = enVar;
        this.f26107b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        jn jnVar = (jn) this.f26108c.e;
        en enVar = this.f26106a;
        if (enVar.getTag() != null) {
            return;
        }
        int i11 = this.f26107b;
        if (i11 == 11) {
            i10 = jnVar.f27435n0;
        } else {
            i10 = jnVar.m0;
        }
        s4.c1 K = jnVar.f27445s.K(i10);
        if (K != null && jnVar.f27454y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.k6.l(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.f27454y.setDirection(1);
            jnVar.f27454y.setDelegate(enVar);
            jnVar.f27454y.setTranslationY(K.f47898a.getY());
            jnVar.f27454y.e();
        }
        if (i11 == 11) {
            jnVar.O = editable;
        } else {
            jnVar.N = editable;
        }
        if (K != null) {
            jn.O(jnVar, K.f47898a, i10);
        }
        jnVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
