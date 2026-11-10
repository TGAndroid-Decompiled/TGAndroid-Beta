package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class wm implements TextWatcher {
    public final vm f40017a;
    public final int f40018b;
    public final org.telegram.ui.l4 f40019c;

    public wm(org.telegram.ui.l4 l4Var, vm vmVar, int i7) {
        this.f40019c = l4Var;
        this.f40017a = vmVar;
        this.f40018b = i7;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        an anVar = (an) this.f40019c.f47512e;
        vm vmVar = this.f40017a;
        if (vmVar.getTag() != null) {
            return;
        }
        int i10 = this.f40018b;
        if (i10 == 11) {
            i7 = anVar.f31913n0;
        } else {
            i7 = anVar.m0;
        }
        v4.d1 K = anVar.f31922s.K(i7);
        if (K != null && anVar.f31931y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, vmVar.getEditField().getPaint().getFontMetricsInt(), false);
            anVar.f31931y.setDirection(1);
            anVar.f31931y.setDelegate(vmVar);
            anVar.f31931y.setTranslationY(K.f57052a.getY());
            anVar.f31931y.e();
        }
        if (i10 == 11) {
            anVar.O = editable;
        } else {
            anVar.N = editable;
        }
        if (K != null) {
            an.P(anVar, K.f57052a, i7);
        }
        anVar.X();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
