package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class mn implements TextWatcher {
    public final ln f29181a;
    public final int f29182b;
    public final pn f29183c;

    public mn(pn pnVar, ln lnVar, int i10) {
        this.f29183c = pnVar;
        this.f29181a = lnVar;
        this.f29182b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        rn rnVar = this.f29183c.d;
        ln lnVar = this.f29181a;
        if (lnVar.getTag() != null) {
            return;
        }
        int i11 = this.f29182b;
        if (i11 == 11) {
            i10 = rnVar.f30833k0;
        } else {
            i10 = rnVar.f30832j0;
        }
        f2.m1 K = rnVar.f30842s.K(i10);
        if (K != null && rnVar.f30849x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
            rnVar.f30849x.setDirection(1);
            rnVar.f30849x.setDelegate(lnVar);
            rnVar.f30849x.setTranslationY(K.f5875a.getY());
            rnVar.f30849x.e();
        }
        if (i11 == 11) {
            rnVar.L = editable;
        } else {
            rnVar.K = editable;
        }
        if (K != null) {
            rn.K(rnVar, K.f5875a, i10);
        }
        rnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
