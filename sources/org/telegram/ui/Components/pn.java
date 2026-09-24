package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class pn implements TextWatcher {
    public final on f27393a;
    public final int f27394b;
    public final tn f27395c;

    public pn(tn tnVar, on onVar, int i10) {
        this.f27395c = tnVar;
        this.f27393a = onVar;
        this.f27394b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        vn vnVar = this.f27395c.d;
        on onVar = this.f27393a;
        if (onVar.getTag() != null) {
            return;
        }
        int i11 = this.f27394b;
        if (i11 == 11) {
            i10 = vnVar.f29199n0;
        } else {
            i10 = vnVar.m0;
        }
        s4.c1 K = vnVar.f29205s.K(i10);
        if (K != null && vnVar.f29212x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
            vnVar.f29212x.setDirection(1);
            vnVar.f29212x.setDelegate(onVar);
            vnVar.f29212x.setTranslationY(K.f42946a.getY());
            vnVar.f29212x.e();
        }
        if (i11 == 11) {
            vnVar.O = editable;
        } else {
            vnVar.N = editable;
        }
        if (K != null) {
            vn.L(vnVar, K.f42946a, i10);
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
