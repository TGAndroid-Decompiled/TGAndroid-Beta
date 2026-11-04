package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class wm implements TextWatcher {
    public final vm f40028a;
    public final int f40029b;
    public final org.telegram.ui.n4 f40030c;

    public wm(org.telegram.ui.n4 n4Var, vm vmVar, int i3) {
        this.f40030c = n4Var;
        this.f40028a = vmVar;
        this.f40029b = i3;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3;
        an anVar = (an) this.f40030c.f47865e;
        vm vmVar = this.f40028a;
        if (vmVar.getTag() != null) {
            return;
        }
        int i10 = this.f40029b;
        if (i10 == 11) {
            i3 = anVar.f31930o0;
        } else {
            i3 = anVar.f31928n0;
        }
        u4.d1 K = anVar.f31939s.K(i3);
        if (K != null && anVar.f31948y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, vmVar.getEditField().getPaint().getFontMetricsInt(), false);
            anVar.f31948y.setDirection(1);
            anVar.f31948y.setDelegate(vmVar);
            anVar.f31948y.setTranslationY(K.f55540a.getY());
            anVar.f31948y.e();
        }
        if (i10 == 11) {
            anVar.P = editable;
        } else {
            anVar.O = editable;
        }
        if (K != null) {
            an.P(anVar, K.f55540a, i3);
        }
        anVar.X();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
