package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
public final class ln implements TextWatcher {
    public final kn f26814a;
    public final int f26815b;
    public final on f26816c;

    public ln(on onVar, kn knVar, int i10) {
        this.f26816c = onVar;
        this.f26814a = knVar;
        this.f26815b = i10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        qn qnVar = this.f26816c.d;
        kn knVar = this.f26814a;
        if (knVar.getTag() != null) {
            return;
        }
        int i11 = this.f26815b;
        if (i11 == 11) {
            i10 = qnVar.f28179k0;
        } else {
            i10 = qnVar.f28178j0;
        }
        f2.l1 K = qnVar.f28188s.K(i10);
        if (K != null && qnVar.f28195x != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, knVar.getEditField().getPaint().getFontMetricsInt(), false);
            qnVar.f28195x.setDirection(1);
            qnVar.f28195x.setDelegate(knVar);
            qnVar.f28195x.setTranslationY(K.f5785a.getY());
            qnVar.f28195x.e();
        }
        if (i11 == 11) {
            qnVar.L = editable;
        } else {
            qnVar.K = editable;
        }
        if (K != null) {
            qn.K(qnVar, K.f5785a, i10);
        }
        qnVar.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
