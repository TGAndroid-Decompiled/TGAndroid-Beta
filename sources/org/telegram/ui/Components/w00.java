package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class w00 implements we.a {
    public final ViewGroup f41464a;
    public final nh.c f41465b;

    public w00(bi.v2 v2Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(v2Var.getContext());
        this.f41465b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f21629w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f41464a = v2Var;
        v2Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f41464a.removeView(this.f41465b);
    }
}
