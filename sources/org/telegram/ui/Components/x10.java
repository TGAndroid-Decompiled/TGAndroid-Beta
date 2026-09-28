package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class x10 implements oe.a {
    public final ViewGroup f30222a;
    public final lh.c f30223b;

    public x10(ai.w5 w5Var, GroupCallMessage groupCallMessage) {
        lh.c cVar = new lh.c(w5Var.getContext());
        this.f30223b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        vh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f30222a = w5Var;
        w5Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f30222a.removeView(this.f30223b);
    }
}
