package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class fn implements TextWatcher {
    public final en f26192a;
    public final int f26193b;
    public final fg.j f26194c;

    public fn(fg.j jVar, en enVar, int i10) {
        this.f26194c = jVar;
        this.f26192a = enVar;
        this.f26193b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        jn jnVar = (jn) this.f26194c.e;
        en enVar = this.f26192a;
        if (enVar.getTag() != null) {
            return;
        }
        int i11 = this.f26193b;
        if (i11 == 11) {
            i10 = jnVar.f27501n0;
        } else {
            i10 = jnVar.m0;
        }
        s4.c1 K = jnVar.f27511s.K(i10);
        if (K != null && jnVar.f27520y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.k6.l(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.f27520y.setDirection(1);
            jnVar.f27520y.setDelegate(enVar);
            jnVar.f27520y.setTranslationY(K.f47909a.getY());
            jnVar.f27520y.e();
        }
        if (i11 == 11) {
            jnVar.O = editable;
        } else {
            jnVar.N = editable;
        }
        if (K != null) {
            jn.O(jnVar, K.f47909a, i10);
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
