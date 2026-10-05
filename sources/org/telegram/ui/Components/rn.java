package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class rn implements TextWatcher {
    public final qn f30563a;
    public final int f30564b;
    public final vn f30565c;

    public rn(vn vnVar, qn qnVar, int i10) {
        this.f30565c = vnVar;
        this.f30563a = qnVar;
        this.f30564b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        xn xnVar = this.f30565c.d;
        qn qnVar = this.f30563a;
        if (qnVar.getTag() != null) {
            return;
        }
        int i11 = this.f30564b;
        if (i11 == 11) {
            i10 = xnVar.f33028n0;
        } else {
            i10 = xnVar.m0;
        }
        s4.c1 K = xnVar.f33034s.K(i10);
        if (K != null && xnVar.f33041x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
            xnVar.f33041x.setDirection(1);
            xnVar.f33041x.setDelegate(qnVar);
            xnVar.f33041x.setTranslationY(K.f46538a.getY());
            xnVar.f33041x.e();
        }
        if (i11 == 11) {
            xnVar.O = editable;
        } else {
            xnVar.N = editable;
        }
        if (K != null) {
            xn.J(xnVar, K.f46538a, i10);
        }
        xnVar.R();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
