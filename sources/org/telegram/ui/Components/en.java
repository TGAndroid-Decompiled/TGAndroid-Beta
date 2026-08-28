package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class en implements TextWatcher {
    public final dn f28086a;
    public final int f28087b;
    public final hn f28088c;

    public en(hn hnVar, dn dnVar, int i9) {
        this.f28088c = hnVar;
        this.f28086a = dnVar;
        this.f28087b = i9;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i9;
        jn jnVar = this.f28088c.d;
        dn dnVar = this.f28086a;
        if (dnVar.getTag() != null) {
            return;
        }
        int i10 = this.f28087b;
        if (i10 == 11) {
            i9 = jnVar.f29781j0;
        } else {
            i9 = jnVar.f29780i0;
        }
        f2.q1 K = jnVar.f29791s.K(i9);
        if (K != null && jnVar.f29798x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, dnVar.getEditField().getPaint().getFontMetricsInt(), false);
            jnVar.f29798x.setDirection(1);
            jnVar.f29798x.setDelegate(dnVar);
            jnVar.f29798x.setTranslationY(K.f5501a.getY());
            jnVar.f29798x.e();
        }
        if (i10 == 11) {
            jnVar.K = editable;
        } else {
            jnVar.J = editable;
        }
        if (K != null) {
            jn.K(jnVar, K.f5501a, i9);
        }
        jnVar.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
