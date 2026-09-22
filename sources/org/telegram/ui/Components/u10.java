package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class u10 implements oe.a {
    public final ViewGroup f28580a;
    public final lh.c f28581b;

    public u10(ai.x5 x5Var, GroupCallMessage groupCallMessage) {
        lh.c cVar = new lh.c(x5Var.getContext());
        this.f28581b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        vh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f28580a = x5Var;
        x5Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f28580a.removeView(this.f28581b);
    }
}
