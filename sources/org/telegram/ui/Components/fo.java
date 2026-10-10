package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class fo implements TextWatcher {
    public final eo f26466a;
    public final int f26467b;
    public final jo f26468c;

    public fo(jo joVar, eo eoVar, int i10) {
        this.f26468c = joVar;
        this.f26466a = eoVar;
        this.f26467b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        lo loVar = this.f26468c.d;
        eo eoVar = this.f26466a;
        if (eoVar.getTag() != null) {
            return;
        }
        int i11 = this.f26467b;
        if (i11 == 11) {
            i10 = loVar.f28458n0;
        } else {
            i10 = loVar.m0;
        }
        s4.d1 K = loVar.f28464s.K(i10);
        if (K != null && loVar.f28471x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, eoVar.getEditField().getPaint().getFontMetricsInt(), false);
            loVar.f28471x.setDirection(1);
            loVar.f28471x.setDelegate(eoVar);
            loVar.f28471x.setTranslationY(K.f47702a.getY());
            loVar.f28471x.e();
        }
        if (i11 == 11) {
            loVar.O = editable;
        } else {
            loVar.N = editable;
        }
        if (K != null) {
            lo.O(loVar, K.f47702a, i10);
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
