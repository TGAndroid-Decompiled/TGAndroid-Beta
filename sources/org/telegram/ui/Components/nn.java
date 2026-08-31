package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class nn implements TextWatcher {
    public final mn f29566a;
    public final int f29567b;
    public final qn f29568c;

    public nn(qn qnVar, mn mnVar, int i10) {
        this.f29568c = qnVar;
        this.f29566a = mnVar;
        this.f29567b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        sn snVar = this.f29568c.d;
        mn mnVar = this.f29566a;
        if (mnVar.getTag() != null) {
            return;
        }
        int i11 = this.f29567b;
        if (i11 == 11) {
            i10 = snVar.f31113k0;
        } else {
            i10 = snVar.f31112j0;
        }
        f2.m1 K = snVar.f31122s.K(i10);
        if (K != null && snVar.f31129x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
            snVar.f31129x.setDirection(1);
            snVar.f31129x.setDelegate(mnVar);
            snVar.f31129x.setTranslationY(K.f5875a.getY());
            snVar.f31129x.e();
        }
        if (i11 == 11) {
            snVar.L = editable;
        } else {
            snVar.K = editable;
        }
        if (K != null) {
            sn.K(snVar, K.f5875a, i10);
        }
        snVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
