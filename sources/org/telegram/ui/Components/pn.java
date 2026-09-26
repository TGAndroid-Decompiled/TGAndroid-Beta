package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class pn implements TextWatcher {
    public final on f27407a;
    public final int f27408b;
    public final tn f27409c;

    public pn(tn tnVar, on onVar, int i10) {
        this.f27409c = tnVar;
        this.f27407a = onVar;
        this.f27408b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        vn vnVar = this.f27409c.d;
        on onVar = this.f27407a;
        if (onVar.getTag() != null) {
            return;
        }
        int i11 = this.f27408b;
        if (i11 == 11) {
            i10 = vnVar.f29208n0;
        } else {
            i10 = vnVar.m0;
        }
        s4.c1 K = vnVar.f29214s.K(i10);
        if (K != null && vnVar.f29221x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            vnVar.f29221x.setDirection(1);
            vnVar.f29221x.setDelegate(onVar);
            vnVar.f29221x.setTranslationY(K.f42960a.getY());
            vnVar.f29221x.e();
        }
        if (i11 == 11) {
            vnVar.O = editable;
        } else {
            vnVar.N = editable;
        }
        if (K != null) {
            vn.L(vnVar, K.f42960a, i10);
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
