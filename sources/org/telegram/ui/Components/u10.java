package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class u10 implements oe.a {
    public final ViewGroup f28242a;
    public final lh.c f28243b;

    public u10(ai.x5 x5Var, GroupCallMessage groupCallMessage) {
        lh.c cVar = new lh.c(x5Var.getContext());
        this.f28243b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        vh.o oVar = cVar.v;
        oVar.setMaxLines(1);
        oVar.setSingleLine(true);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f28242a = x5Var;
        x5Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f28242a.removeView(this.f28243b);
    }
}
