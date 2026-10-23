package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class yn implements TextWatcher {
    public final xn f32708a;
    public final int f32709b;
    public final co f32710c;

    public yn(co coVar, xn xnVar, int i10) {
        this.f32710c = coVar;
        this.f32708a = xnVar;
        this.f32709b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        fo foVar = this.f32710c.d;
        xn xnVar = this.f32708a;
        if (xnVar.getTag() != null) {
            return;
        }
        int i11 = this.f32709b;
        if (i11 == 11) {
            i10 = foVar.f26311n0;
        } else {
            i10 = foVar.m0;
        }
        s4.b1 K = foVar.f26317s.K(i10);
        if (K != null && foVar.f26324x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, xnVar.getEditField().getPaint().getFontMetricsInt(), false);
            foVar.f26324x.setDirection(1);
            foVar.f26324x.setDelegate(xnVar);
            foVar.f26324x.setTranslationY(K.f45921a.getY());
            foVar.f26324x.e();
        }
        if (i11 == 11) {
            foVar.O = editable;
        } else {
            foVar.N = editable;
        }
        if (K != null) {
            fo.O(foVar, K.f45921a, i10);
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
