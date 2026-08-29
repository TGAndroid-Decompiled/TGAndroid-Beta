package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class jn implements TextWatcher {
    public final in f29761a;
    public final int f29762b;
    public final mn f29763c;

    public jn(mn mnVar, in inVar, int i10) {
        this.f29763c = mnVar;
        this.f29761a = inVar;
        this.f29762b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        on onVar = this.f29763c.d;
        in inVar = this.f29761a;
        if (inVar.getTag() != null) {
            return;
        }
        int i11 = this.f29762b;
        if (i11 == 11) {
            i10 = onVar.f31417j0;
        } else {
            i10 = onVar.f31416i0;
        }
        f2.n1 K = onVar.f31427s.K(i10);
        if (K != null && onVar.f31434x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, inVar.getEditField().getPaint().getFontMetricsInt(), false);
            onVar.f31434x.setDirection(1);
            onVar.f31434x.setDelegate(inVar);
            onVar.f31434x.setTranslationY(K.f6432a.getY());
            onVar.f31434x.e();
        }
        if (i11 == 11) {
            onVar.K = editable;
        } else {
            onVar.J = editable;
        }
        if (K != null) {
            on.K(onVar, K.f6432a, i10);
        }
        onVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
