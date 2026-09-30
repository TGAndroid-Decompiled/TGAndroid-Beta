package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class qn implements TextWatcher {
    public final pn f27785a;
    public final int f27786b;
    public final un f27787c;

    public qn(un unVar, pn pnVar, int i10) {
        this.f27787c = unVar;
        this.f27785a = pnVar;
        this.f27786b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        wn wnVar = this.f27787c.d;
        pn pnVar = this.f27785a;
        if (pnVar.getTag() != null) {
            return;
        }
        int i11 = this.f27786b;
        if (i11 == 11) {
            i10 = wnVar.f30072n0;
        } else {
            i10 = wnVar.m0;
        }
        s4.c1 K = wnVar.f30078s.K(i10);
        if (K != null && wnVar.f30085x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
            wnVar.f30085x.setDirection(1);
            wnVar.f30085x.setDelegate(pnVar);
            wnVar.f30085x.setTranslationY(K.f42962a.getY());
            wnVar.f30085x.e();
        }
        if (i11 == 11) {
            wnVar.O = editable;
        } else {
            wnVar.N = editable;
        }
        if (K != null) {
            wn.L(wnVar, K.f42962a, i10);
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
