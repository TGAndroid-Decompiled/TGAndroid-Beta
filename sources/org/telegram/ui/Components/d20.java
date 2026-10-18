package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class d20 implements qe.a {
    public final ViewGroup f25457a;
    public final mh.c f25458b;

    public d20(ci.h4 h4Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(h4Var.getContext());
        this.f25458b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        wh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f25457a = h4Var;
        h4Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f25457a.removeView(this.f25458b);
    }
}
