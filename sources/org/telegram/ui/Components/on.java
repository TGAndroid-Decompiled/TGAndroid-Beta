package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class on implements TextWatcher {
    public final nn f27157a;
    public final int f27158b;
    public final sn f27159c;

    public on(sn snVar, nn nnVar, int i10) {
        this.f27159c = snVar;
        this.f27157a = nnVar;
        this.f27158b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        un unVar = this.f27159c.d;
        nn nnVar = this.f27157a;
        if (nnVar.getTag() != null) {
            return;
        }
        int i11 = this.f27158b;
        if (i11 == 11) {
            i10 = unVar.f28829n0;
        } else {
            i10 = unVar.m0;
        }
        s4.c1 L = unVar.f28835s.L(i10);
        if (L != null && unVar.f28842x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
            unVar.f28842x.setDirection(1);
            unVar.f28842x.setDelegate(nnVar);
            unVar.f28842x.setTranslationY(L.f42995a.getY());
            unVar.f28842x.e();
        }
        if (i11 == 11) {
            unVar.O = editable;
        } else {
            unVar.N = editable;
        }
        if (L != null) {
            un.L(unVar, L.f42995a, i10);
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
