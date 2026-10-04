package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class rn implements TextWatcher {
    public final qn f30481a;
    public final int f30482b;
    public final vn f30483c;

    public rn(vn vnVar, qn qnVar, int i10) {
        this.f30483c = vnVar;
        this.f30481a = qnVar;
        this.f30482b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        xn xnVar = this.f30483c.d;
        qn qnVar = this.f30481a;
        if (qnVar.getTag() != null) {
            return;
        }
        int i11 = this.f30482b;
        if (i11 == 11) {
            i10 = xnVar.f32937n0;
        } else {
            i10 = xnVar.m0;
        }
        s4.c1 K = xnVar.f32943s.K(i10);
        if (K != null && xnVar.f32950x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
            xnVar.f32950x.setDirection(1);
            xnVar.f32950x.setDelegate(qnVar);
            xnVar.f32950x.setTranslationY(K.f46531a.getY());
            xnVar.f32950x.e();
        }
        if (i11 == 11) {
            xnVar.O = editable;
        } else {
            xnVar.N = editable;
        }
        if (K != null) {
            xn.J(xnVar, K.f46531a, i10);
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
