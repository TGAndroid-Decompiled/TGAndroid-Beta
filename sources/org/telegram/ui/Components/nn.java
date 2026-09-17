package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class nn implements TextWatcher {
    public final mn f28865a;
    public final int f28866b;
    public final rn f28867c;

    public nn(rn rnVar, mn mnVar, int i10) {
        this.f28867c = rnVar;
        this.f28865a = mnVar;
        this.f28866b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        tn tnVar = this.f28867c.d;
        mn mnVar = this.f28865a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i11 = this.f28866b;
        if (i11 == 11) {
            i10 = tnVar.f30676n0;
        } else {
            i10 = tnVar.m0;
        }
        s4.c1 K = tnVar.f30682s.K(i10);
        if (K != null && tnVar.f30689x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f30689x.setDirection(1);
            tnVar.f30689x.setDelegate(mnVar);
            tnVar.f30689x.setTranslationY(K.f45767a.getY());
            tnVar.f30689x.e();
        }
        if (i11 == 11) {
            tnVar.O = editable;
        } else {
            tnVar.N = editable;
        }
        if (K != null) {
            tn.L(tnVar, K.f45767a, i10);
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
