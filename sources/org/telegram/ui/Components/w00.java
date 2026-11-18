package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class w00 implements we.a {
    public final ViewGroup f41513a;
    public final nh.c f41514b;

    public w00(bi.p2 p2Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(p2Var.getContext());
        this.f41514b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f21533w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f41513a = p2Var;
        p2Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f41513a.removeView(this.f41514b);
    }
}
