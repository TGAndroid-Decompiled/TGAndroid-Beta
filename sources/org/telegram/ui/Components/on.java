package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class on implements TextWatcher {
    public final nn f26865a;
    public final int f26866b;
    public final sn f26867c;

    public on(sn snVar, nn nnVar, int i10) {
        this.f26867c = snVar;
        this.f26865a = nnVar;
        this.f26866b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        un unVar = this.f26867c.d;
        nn nnVar = this.f26865a;
        if (nnVar.getTag() != null) {
            return;
        }
        int i11 = this.f26866b;
        if (i11 == 11) {
            i10 = unVar.f28457n0;
        } else {
            i10 = unVar.m0;
        }
        s4.c1 K = unVar.f28463s.K(i10);
        if (K != null && unVar.f28470x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
            unVar.f28470x.setDirection(1);
            unVar.f28470x.setDelegate(nnVar);
            unVar.f28470x.setTranslationY(K.f42675a.getY());
            unVar.f28470x.e();
        }
        if (i11 == 11) {
            unVar.O = editable;
        } else {
            unVar.N = editable;
        }
        if (K != null) {
            un.L(unVar, K.f42675a, i10);
        }
        unVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
