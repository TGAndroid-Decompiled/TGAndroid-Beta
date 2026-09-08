package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class nn implements TextWatcher {
    public final mn f28864a;
    public final int f28865b;
    public final rn f28866c;

    public nn(rn rnVar, mn mnVar, int i10) {
        this.f28866c = rnVar;
        this.f28864a = mnVar;
        this.f28865b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        tn tnVar = this.f28866c.d;
        mn mnVar = this.f28864a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i11 = this.f28865b;
        if (i11 == 11) {
            i10 = tnVar.f30675n0;
        } else {
            i10 = tnVar.m0;
        }
        s4.c1 K = tnVar.f30681s.K(i10);
        if (K != null && tnVar.f30688x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f30688x.setDirection(1);
            tnVar.f30688x.setDelegate(mnVar);
            tnVar.f30688x.setTranslationY(K.f45766a.getY());
            tnVar.f30688x.e();
        }
        if (i11 == 11) {
            tnVar.O = editable;
        } else {
            tnVar.N = editable;
        }
        if (K != null) {
            tn.L(tnVar, K.f45766a, i10);
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
