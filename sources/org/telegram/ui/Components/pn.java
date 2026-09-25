package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class pn implements TextWatcher {
    public final on f27408a;
    public final int f27409b;
    public final tn f27410c;

    public pn(tn tnVar, on onVar, int i10) {
        this.f27410c = tnVar;
        this.f27408a = onVar;
        this.f27409b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        vn vnVar = this.f27410c.d;
        on onVar = this.f27408a;
        if (onVar.getTag() != null) {
            return;
        }
        int i11 = this.f27409b;
        if (i11 == 11) {
            i10 = vnVar.f29209n0;
        } else {
            i10 = vnVar.m0;
        }
        s4.c1 K = vnVar.f29215s.K(i10);
        if (K != null && vnVar.f29222x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            vnVar.f29222x.setDirection(1);
            vnVar.f29222x.setDelegate(onVar);
            vnVar.f29222x.setTranslationY(K.f42961a.getY());
            vnVar.f29222x.e();
        }
        if (i11 == 11) {
            vnVar.O = editable;
        } else {
            vnVar.N = editable;
        }
        if (K != null) {
            vn.L(vnVar, K.f42961a, i10);
        }
        vnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
