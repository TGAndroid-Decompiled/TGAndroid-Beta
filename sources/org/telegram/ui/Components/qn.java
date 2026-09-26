package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class qn implements TextWatcher {
    public final pn f27739a;
    public final int f27740b;
    public final un f27741c;

    public qn(un unVar, pn pnVar, int i10) {
        this.f27741c = unVar;
        this.f27739a = pnVar;
        this.f27740b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        wn wnVar = this.f27741c.d;
        pn pnVar = this.f27739a;
        if (pnVar.getTag() != null) {
            return;
        }
        int i11 = this.f27740b;
        if (i11 == 11) {
            i10 = wnVar.f30131n0;
        } else {
            i10 = wnVar.m0;
        }
        s4.c1 K = wnVar.f30137s.K(i10);
        if (K != null && wnVar.f30144x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
            wnVar.f30144x.setDirection(1);
            wnVar.f30144x.setDelegate(pnVar);
            wnVar.f30144x.setTranslationY(K.f42959a.getY());
            wnVar.f30144x.e();
        }
        if (i11 == 11) {
            wnVar.O = editable;
        } else {
            wnVar.N = editable;
        }
        if (K != null) {
            wn.L(wnVar, K.f42959a, i10);
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
