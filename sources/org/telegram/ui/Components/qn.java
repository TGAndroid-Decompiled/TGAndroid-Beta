package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class qn implements TextWatcher {
    public final pn f27794a;
    public final int f27795b;
    public final un f27796c;

    public qn(un unVar, pn pnVar, int i10) {
        this.f27796c = unVar;
        this.f27794a = pnVar;
        this.f27795b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        wn wnVar = this.f27796c.d;
        pn pnVar = this.f27794a;
        if (pnVar.getTag() != null) {
            return;
        }
        int i11 = this.f27795b;
        if (i11 == 11) {
            i10 = wnVar.f30081n0;
        } else {
            i10 = wnVar.m0;
        }
        s4.c1 K = wnVar.f30087s.K(i10);
        if (K != null && wnVar.f30094x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
            wnVar.f30094x.setDirection(1);
            wnVar.f30094x.setDelegate(pnVar);
            wnVar.f30094x.setTranslationY(K.f42961a.getY());
            wnVar.f30094x.e();
        }
        if (i11 == 11) {
            wnVar.O = editable;
        } else {
            wnVar.N = editable;
        }
        if (K != null) {
            wn.L(wnVar, K.f42961a, i10);
        }
        wnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
