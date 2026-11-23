package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class y00 implements we.a {
    public final ViewGroup f42294a;
    public final nh.c f42295b;

    public y00(bi.t2 t2Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(t2Var.getContext());
        this.f42295b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f21564w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f42294a = t2Var;
        t2Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f42294a.removeView(this.f42295b);
    }
}
