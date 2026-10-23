package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class yn implements TextWatcher {
    public final xn f33001a;
    public final int f33002b;
    public final co f33003c;

    public yn(co coVar, xn xnVar, int i10) {
        this.f33003c = coVar;
        this.f33001a = xnVar;
        this.f33002b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        fo foVar = this.f33003c.d;
        xn xnVar = this.f33001a;
        if (xnVar.getTag() != null) {
            return;
        }
        int i11 = this.f33002b;
        if (i11 == 11) {
            i10 = foVar.f26410n0;
        } else {
            i10 = foVar.m0;
        }
        s4.b1 K = foVar.f26420s.K(i10);
        if (K != null && foVar.f26427x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, xnVar.getEditField().getPaint().getFontMetricsInt(), false);
            foVar.f26427x.setDirection(1);
            foVar.f26427x.setDelegate(xnVar);
            foVar.f26427x.setTranslationY(K.f46343a.getY());
            foVar.f26427x.e();
        }
        if (i11 == 11) {
            foVar.O = editable;
        } else {
            foVar.N = editable;
        }
        if (K != null) {
            fo.O(foVar, K.f46343a, i10);
        }
        foVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
