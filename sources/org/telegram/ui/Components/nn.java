package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class nn implements TextWatcher {
    public final mn f28837a;
    public final int f28838b;
    public final rn f28839c;

    public nn(rn rnVar, mn mnVar, int i10) {
        this.f28839c = rnVar;
        this.f28837a = mnVar;
        this.f28838b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        tn tnVar = this.f28839c.d;
        mn mnVar = this.f28837a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i11 = this.f28838b;
        if (i11 == 11) {
            i10 = tnVar.f30648n0;
        } else {
            i10 = tnVar.m0;
        }
        s4.c1 K = tnVar.f30654s.K(i10);
        if (K != null && tnVar.f30661x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            tnVar.f30661x.setDirection(1);
            tnVar.f30661x.setDelegate(mnVar);
            tnVar.f30661x.setTranslationY(K.f45738a.getY());
            tnVar.f30661x.e();
        }
        if (i11 == 11) {
            tnVar.O = editable;
        } else {
            tnVar.N = editable;
        }
        if (K != null) {
            tn.L(tnVar, K.f45738a, i10);
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
