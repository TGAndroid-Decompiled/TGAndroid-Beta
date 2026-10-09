package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class fo implements TextWatcher {
    public final eo f26440a;
    public final int f26441b;
    public final jo f26442c;

    public fo(jo joVar, eo eoVar, int i10) {
        this.f26442c = joVar;
        this.f26440a = eoVar;
        this.f26441b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        lo loVar = this.f26442c.d;
        eo eoVar = this.f26440a;
        if (eoVar.getTag() != null) {
            return;
        }
        int i11 = this.f26441b;
        if (i11 == 11) {
            i10 = loVar.f28519n0;
        } else {
            i10 = loVar.m0;
        }
        s4.d1 K = loVar.f28525s.K(i10);
        if (K != null && loVar.f28532x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, eoVar.getEditField().getPaint().getFontMetricsInt(), false);
            loVar.f28532x.setDirection(1);
            loVar.f28532x.setDelegate(eoVar);
            loVar.f28532x.setTranslationY(K.f47658a.getY());
            loVar.f28532x.e();
        }
        if (i11 == 11) {
            loVar.O = editable;
        } else {
            loVar.N = editable;
        }
        if (K != null) {
            lo.O(loVar, K.f47658a, i10);
        }
        loVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
