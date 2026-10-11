package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class fo implements TextWatcher {
    public final eo f26404a;
    public final int f26405b;
    public final jo f26406c;

    public fo(jo joVar, eo eoVar, int i10) {
        this.f26406c = joVar;
        this.f26404a = eoVar;
        this.f26405b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        lo loVar = this.f26406c.d;
        eo eoVar = this.f26404a;
        if (eoVar.getTag() != null) {
            return;
        }
        int i11 = this.f26405b;
        if (i11 == 11) {
            i10 = loVar.f28397n0;
        } else {
            i10 = loVar.m0;
        }
        s4.d1 K = loVar.f28403s.K(i10);
        if (K != null && loVar.f28410x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, eoVar.getEditField().getPaint().getFontMetricsInt(), false);
            loVar.f28410x.setDirection(1);
            loVar.f28410x.setDelegate(eoVar);
            loVar.f28410x.setTranslationY(K.f47748a.getY());
            loVar.f28410x.e();
        }
        if (i11 == 11) {
            loVar.O = editable;
        } else {
            loVar.N = editable;
        }
        if (K != null) {
            lo.O(loVar, K.f47748a, i10);
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
