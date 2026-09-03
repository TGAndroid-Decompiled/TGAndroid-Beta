package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class kn implements TextWatcher {
    public final jn f26354a;
    public final int f26355b;
    public final nn f26356c;

    public kn(nn nnVar, jn jnVar, int i10) {
        this.f26356c = nnVar;
        this.f26354a = jnVar;
        this.f26355b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        pn pnVar = this.f26356c.d;
        jn jnVar = this.f26354a;
        if (jnVar.getTag() != null) {
            return;
        }
        int i11 = this.f26355b;
        if (i11 == 11) {
            i10 = pnVar.f27951k0;
        } else {
            i10 = pnVar.f27950j0;
        }
        f2.l1 K = pnVar.f27960s.K(i10);
        if (K != null && pnVar.f27967x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, jnVar.getEditField().getPaint().getFontMetricsInt(), false);
            pnVar.f27967x.setDirection(1);
            pnVar.f27967x.setDelegate(jnVar);
            pnVar.f27967x.setTranslationY(K.f5774a.getY());
            pnVar.f27967x.e();
        }
        if (i11 == 11) {
            pnVar.L = editable;
        } else {
            pnVar.K = editable;
        }
        if (K != null) {
            pn.K(pnVar, K.f5774a, i10);
        }
        pnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
