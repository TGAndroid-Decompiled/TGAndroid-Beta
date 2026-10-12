package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class h20 implements qe.a {
    public final ViewGroup f25491a;
    public final mh.c f25492b;

    public h20(bi.i5 i5Var, GroupCallMessage groupCallMessage) {
        mh.c cVar = new mh.c(i5Var.getContext());
        this.f25492b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        wh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f25491a = i5Var;
        i5Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f25491a.removeView(this.f25492b);
    }
}
