package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class zn implements TextWatcher {
    public final yn f35379a;
    public final int f35380b;
    public final eo f35381c;

    public zn(eo eoVar, yn ynVar, int i10) {
        this.f35381c = eoVar;
        this.f35379a = ynVar;
        this.f35380b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        go goVar = this.f35381c.d;
        yn ynVar = this.f35379a;
        if (ynVar.getTag() != null) {
            return;
        }
        int i11 = this.f35380b;
        if (i11 == 11) {
            i10 = goVar.f28639n0;
        } else {
            i10 = goVar.m0;
        }
        s4.e1 K = goVar.f28649s.K(i10);
        if (K != null && goVar.f28656x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, ynVar.getEditField().getPaint().getFontMetricsInt(), false);
            goVar.f28656x.setDirection(1);
            goVar.f28656x.setDelegate(ynVar);
            goVar.f28656x.setTranslationY(K.f47738a.getY());
            goVar.f28656x.e();
        }
        if (i11 == 11) {
            goVar.O = editable;
        } else {
            goVar.N = editable;
        }
        if (K != null) {
            go.O(goVar, K.f47738a, i10);
        }
        goVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
