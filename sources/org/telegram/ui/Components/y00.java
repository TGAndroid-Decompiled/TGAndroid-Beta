package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class y00 implements we.a {
    public final ViewGroup f42272a;
    public final nh.c f42273b;

    public y00(bi.v2 v2Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(v2Var.getContext());
        this.f42273b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f21530w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f42272a = v2Var;
        v2Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f42272a.removeView(this.f42273b);
    }
}
