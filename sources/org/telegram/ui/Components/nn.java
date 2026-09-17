package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class nn implements TextWatcher {
    public final mn f28838a;
    public final int f28839b;
    public final rn f28840c;

    public nn(rn rnVar, mn mnVar, int i10) {
        this.f28840c = rnVar;
        this.f28838a = mnVar;
        this.f28839b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        tn tnVar = this.f28840c.d;
        mn mnVar = this.f28838a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i11 = this.f28839b;
        if (i11 == 11) {
            i10 = tnVar.f30649n0;
        } else {
            i10 = tnVar.m0;
        }
        s4.c1 K = tnVar.f30655s.K(i10);
        if (K != null && tnVar.f30662x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f30662x.setDirection(1);
            tnVar.f30662x.setDelegate(mnVar);
            tnVar.f30662x.setTranslationY(K.f45739a.getY());
            tnVar.f30662x.e();
        }
        if (i11 == 11) {
            tnVar.O = editable;
        } else {
            tnVar.N = editable;
        }
        if (K != null) {
            tn.L(tnVar, K.f45739a, i10);
        }
        tnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
