package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class un implements TextWatcher {
    public final tn f27720a;
    public final int f27721b;
    public final xn f27722c;

    public un(xn xnVar, tn tnVar, int i10) {
        this.f27722c = xnVar;
        this.f27720a = tnVar;
        this.f27721b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        zn znVar = this.f27722c.d;
        tn tnVar = this.f27720a;
        if (tnVar.getTag() != null) {
            return;
        }
        int i11 = this.f27721b;
        if (i11 == 11) {
            i10 = znVar.f29756n0;
        } else {
            i10 = znVar.m0;
        }
        s4.c1 K = znVar.f29762s.K(i10);
        if (K != null && znVar.f29769x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, tnVar.getEditField().getPaint().getFontMetricsInt(), false);
            znVar.f29769x.setDirection(1);
            znVar.f29769x.setDelegate(tnVar);
            znVar.f29769x.setTranslationY(K.f41610a.getY());
            znVar.f29769x.e();
        }
        if (i11 == 11) {
            znVar.O = editable;
        } else {
            znVar.N = editable;
        }
        if (K != null) {
            zn.L(znVar, K.f41610a, i10);
        }
        znVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
