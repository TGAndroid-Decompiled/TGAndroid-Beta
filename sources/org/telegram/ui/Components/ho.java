package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class ho implements TextWatcher {
    public final go f26850a;
    public final int f26851b;
    public final lo f26852c;

    public ho(lo loVar, go goVar, int i10) {
        this.f26852c = loVar;
        this.f26850a = goVar;
        this.f26851b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        no noVar = this.f26852c.d;
        go goVar = this.f26850a;
        if (goVar.getTag() != null) {
            return;
        }
        int i11 = this.f26851b;
        if (i11 == 11) {
            i10 = noVar.f28897n0;
        } else {
            i10 = noVar.m0;
        }
        s4.d1 K = noVar.f28903s.K(i10);
        if (K != null && noVar.f28910x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, goVar.getEditField().getPaint().getFontMetricsInt(), false);
            noVar.f28910x.setDirection(1);
            noVar.f28910x.setDelegate(goVar);
            noVar.f28910x.setTranslationY(K.f47889a.getY());
            noVar.f28910x.e();
        }
        if (i11 == 11) {
            noVar.O = editable;
        } else {
            noVar.N = editable;
        }
        if (K != null) {
            no.O(noVar, K.f47889a, i10);
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
