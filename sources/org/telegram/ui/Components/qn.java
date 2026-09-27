package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class qn implements TextWatcher {
    public final pn f27807a;
    public final int f27808b;
    public final un f27809c;

    public qn(un unVar, pn pnVar, int i10) {
        this.f27809c = unVar;
        this.f27807a = pnVar;
        this.f27808b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        wn wnVar = this.f27809c.d;
        pn pnVar = this.f27807a;
        if (pnVar.getTag() != null) {
            return;
        }
        int i11 = this.f27808b;
        if (i11 == 11) {
            i10 = wnVar.f30100n0;
        } else {
            i10 = wnVar.m0;
        }
        s4.c1 L = wnVar.f30106s.L(i10);
        if (L != null && wnVar.f30113x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
            wnVar.f30113x.setDirection(1);
            wnVar.f30113x.setDelegate(pnVar);
            wnVar.f30113x.setTranslationY(L.f43005a.getY());
            wnVar.f30113x.e();
        }
        if (i11 == 11) {
            wnVar.O = editable;
        } else {
            wnVar.N = editable;
        }
        if (L != null) {
            wn.L(wnVar, L.f43005a, i10);
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
