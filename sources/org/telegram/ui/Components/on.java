package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class on implements TextWatcher {
    public final nn f26862a;
    public final int f26863b;
    public final sn f26864c;

    public on(sn snVar, nn nnVar, int i10) {
        this.f26864c = snVar;
        this.f26862a = nnVar;
        this.f26863b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        un unVar = this.f26864c.d;
        nn nnVar = this.f26862a;
        if (nnVar.getTag() != null) {
            return;
        }
        int i11 = this.f26863b;
        if (i11 == 11) {
            i10 = unVar.f28454n0;
        } else {
            i10 = unVar.m0;
        }
        s4.c1 K = unVar.f28460s.K(i10);
        if (K != null && unVar.f28467x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
            unVar.f28467x.setDirection(1);
            unVar.f28467x.setDelegate(nnVar);
            unVar.f28467x.setTranslationY(K.f42671a.getY());
            unVar.f28467x.e();
        }
        if (i11 == 11) {
            unVar.O = editable;
        } else {
            unVar.N = editable;
        }
        if (K != null) {
            un.L(unVar, K.f42671a, i10);
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
