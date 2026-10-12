package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class ho implements TextWatcher {
    public final go f26836a;
    public final int f26837b;
    public final lo f26838c;

    public ho(lo loVar, go goVar, int i10) {
        this.f26838c = loVar;
        this.f26836a = goVar;
        this.f26837b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        no noVar = this.f26838c.d;
        go goVar = this.f26836a;
        if (goVar.getTag() != null) {
            return;
        }
        int i11 = this.f26837b;
        if (i11 == 11) {
            i10 = noVar.f28901n0;
        } else {
            i10 = noVar.m0;
        }
        s4.d1 K = noVar.f28907s.K(i10);
        if (K != null && noVar.f28914x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, goVar.getEditField().getPaint().getFontMetricsInt(), false);
            noVar.f28914x.setDirection(1);
            noVar.f28914x.setDelegate(goVar);
            noVar.f28914x.setTranslationY(K.f47897a.getY());
            noVar.f28914x.e();
        }
        if (i11 == 11) {
            noVar.O = editable;
        } else {
            noVar.N = editable;
        }
        if (K != null) {
            no.O(noVar, K.f47897a, i10);
        }
        noVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
