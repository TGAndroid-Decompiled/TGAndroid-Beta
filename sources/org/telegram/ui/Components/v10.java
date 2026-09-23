package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class v10 implements oe.a {
    public final ViewGroup f28619a;
    public final lh.c f28620b;

    public v10(ai.w5 w5Var, GroupCallMessage groupCallMessage) {
        lh.c cVar = new lh.c(w5Var.getContext());
        this.f28620b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        vh.o oVar = cVar.v;
        oVar.setMaxLines(1);
        oVar.setSingleLine(true);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f28619a = w5Var;
        w5Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f28619a.removeView(this.f28620b);
    }
}
