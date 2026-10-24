package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class wn implements TextWatcher {
    public final vn f32299a;
    public final int f32300b;
    public final ao f32301c;

    public wn(ao aoVar, vn vnVar, int i10) {
        this.f32301c = aoVar;
        this.f32299a = vnVar;
        this.f32300b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        co coVar = this.f32301c.d;
        vn vnVar = this.f32299a;
        if (vnVar.getTag() != null) {
            return;
        }
        int i11 = this.f32300b;
        if (i11 == 11) {
            i10 = coVar.f25382n0;
        } else {
            i10 = coVar.m0;
        }
        s4.b1 K = coVar.f25392s.K(i10);
        if (K != null && coVar.f25399x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, vnVar.getEditField().getPaint().getFontMetricsInt(), false);
            coVar.f25399x.setDirection(1);
            coVar.f25399x.setDelegate(vnVar);
            coVar.f25399x.setTranslationY(K.f46342a.getY());
            coVar.f25399x.e();
        }
        if (i11 == 11) {
            coVar.O = editable;
        } else {
            coVar.N = editable;
        }
        if (K != null) {
            co.O(coVar, K.f46342a, i10);
        }
        coVar.W();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
