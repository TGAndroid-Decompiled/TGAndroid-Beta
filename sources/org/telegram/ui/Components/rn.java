package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class rn implements TextWatcher {
    public final qn f28090a;
    public final int f28091b;
    public final vn f28092c;

    public rn(vn vnVar, qn qnVar, int i10) {
        this.f28092c = vnVar;
        this.f28090a = qnVar;
        this.f28091b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        xn xnVar = this.f28092c.d;
        qn qnVar = this.f28090a;
        if (qnVar.getTag() != null) {
            return;
        }
        int i11 = this.f28091b;
        if (i11 == 11) {
            i10 = xnVar.f30408n0;
        } else {
            i10 = xnVar.m0;
        }
        s4.c1 K = xnVar.f30414s.K(i10);
        if (K != null && xnVar.f30421x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
            xnVar.f30421x.setDirection(1);
            xnVar.f30421x.setDelegate(qnVar);
            xnVar.f30421x.setTranslationY(K.f43068a.getY());
            xnVar.f30421x.e();
        }
        if (i11 == 11) {
            xnVar.O = editable;
        } else {
            xnVar.N = editable;
        }
        if (K != null) {
            xn.L(xnVar, K.f43068a, i10);
        }
        xnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
