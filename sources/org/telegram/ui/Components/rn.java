package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class rn implements TextWatcher {
    public final qn f30475a;
    public final int f30476b;
    public final vn f30477c;

    public rn(vn vnVar, qn qnVar, int i10) {
        this.f30477c = vnVar;
        this.f30475a = qnVar;
        this.f30476b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        xn xnVar = this.f30477c.d;
        qn qnVar = this.f30475a;
        if (qnVar.getTag() != null) {
            return;
        }
        int i11 = this.f30476b;
        if (i11 == 11) {
            i10 = xnVar.f32931n0;
        } else {
            i10 = xnVar.m0;
        }
        s4.c1 K = xnVar.f32937s.K(i10);
        if (K != null && xnVar.f32944x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
            xnVar.f32944x.setDirection(1);
            xnVar.f32944x.setDelegate(qnVar);
            xnVar.f32944x.setTranslationY(K.f46524a.getY());
            xnVar.f32944x.e();
        }
        if (i11 == 11) {
            xnVar.O = editable;
        } else {
            xnVar.N = editable;
        }
        if (K != null) {
            xn.J(xnVar, K.f46524a, i10);
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
