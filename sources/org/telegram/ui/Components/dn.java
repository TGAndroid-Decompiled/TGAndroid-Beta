package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;

public final class dn implements TextWatcher {

    public final cn f27812a;

    public final int f27813b;

    public final gn f27814c;

    public dn(gn gnVar, cn cnVar, int i10) {
        this.f27814c = gnVar;
        this.f27812a = cnVar;
        this.f27813b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        in inVar = this.f27814c.d;
        cn cnVar = this.f27812a;
        if (cnVar.getTag() != null) {
            return;
        }
        int i10 = this.f27813b;
        int i11 = i10 == 11 ? inVar.f29427j0 : inVar.f29426i0;
        f2.o1 o1VarK = inVar.f29437s.K(i11);
        if (o1VarK != null && inVar.f29444x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, cnVar.getEditField().getPaint().getFontMetricsInt(), false);
            inVar.f29444x.setDirection(1);
            inVar.f29444x.setDelegate(cnVar);
            inVar.f29444x.setTranslationY(o1VarK.f5789a.getY());
            inVar.f29444x.e();
        }
        if (i10 == 11) {
            inVar.K = editable;
        } else {
            inVar.J = editable;
        }
        if (o1VarK != null) {
            in.L(inVar, o1VarK.f5789a, i11);
        }
        inVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
