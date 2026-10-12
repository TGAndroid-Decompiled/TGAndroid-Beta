package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class bo implements TextWatcher {
    public final ao f23832a;
    public final int f23833b;
    public final go f23834c;

    public bo(go goVar, ao aoVar, int i10) {
        this.f23834c = goVar;
        this.f23832a = aoVar;
        this.f23833b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        io ioVar = this.f23834c.d;
        ao aoVar = this.f23832a;
        if (aoVar.getTag() != null) {
            return;
        }
        int i11 = this.f23833b;
        if (i11 == 11) {
            i10 = ioVar.f26025n0;
        } else {
            i10 = ioVar.m0;
        }
        s4.b1 K = ioVar.f26031s.K(i10);
        if (K != null && ioVar.f26038x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, aoVar.getEditField().getPaint().getFontMetricsInt(), false);
            ioVar.f26038x.setDirection(1);
            ioVar.f26038x.setDelegate(aoVar);
            ioVar.f26038x.setTranslationY(K.f44838a.getY());
            ioVar.f26038x.e();
        }
        if (i11 == 11) {
            ioVar.O = editable;
        } else {
            ioVar.N = editable;
        }
        if (K != null) {
            io.O(ioVar, K.f44838a, i10);
        }
        ioVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
