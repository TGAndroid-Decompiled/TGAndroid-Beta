package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class p00 implements we.a {
    public final ViewGroup f38136a;
    public final nh.c f38137b;

    public p00(bi.v1 v1Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(v1Var.getContext());
        this.f38137b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f21172w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f38136a = v1Var;
        v1Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f38136a.removeView(this.f38137b);
    }
}
