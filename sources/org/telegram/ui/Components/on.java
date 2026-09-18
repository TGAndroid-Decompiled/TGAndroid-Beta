package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class on implements TextWatcher {
    public final nn f26826a;
    public final int f26827b;
    public final sn f26828c;

    public on(sn snVar, nn nnVar, int i10) {
        this.f26828c = snVar;
        this.f26826a = nnVar;
        this.f26827b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        un unVar = this.f26828c.d;
        nn nnVar = this.f26826a;
        if (nnVar.getTag() != null) {
            return;
        }
        int i11 = this.f26827b;
        if (i11 == 11) {
            i10 = unVar.f28438n0;
        } else {
            i10 = unVar.m0;
        }
        s4.c1 L = unVar.f28444s.L(i10);
        if (L != null && unVar.f28451x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
            unVar.f28451x.setDirection(1);
            unVar.f28451x.setDelegate(nnVar);
            unVar.f28451x.setTranslationY(L.f42702a.getY());
            unVar.f28451x.e();
        }
        if (i11 == 11) {
            unVar.O = editable;
        } else {
            unVar.N = editable;
        }
        if (L != null) {
            un.L(unVar, L.f42702a, i10);
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
