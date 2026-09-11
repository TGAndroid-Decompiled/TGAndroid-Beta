package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class u10 implements oe.a {
    public final ViewGroup f30767a;
    public final mh.c f30768b;

    public u10(bi.g5 g5Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(g5Var.getContext());
        this.f30768b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        wh.p pVar = cVar.v;
        pVar.setMaxLines(1);
        pVar.setSingleLine(true);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f30767a = g5Var;
        g5Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f30767a.removeView(this.f30768b);
    }
}
