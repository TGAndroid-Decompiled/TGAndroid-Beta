package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class d20 implements oe.a {
    public final ViewGroup f22275a;
    public final kh.c f22276b;

    public d20(bi.l4 l4Var, GroupCallMessage groupCallMessage) {
        kh.c cVar = new kh.c(l4Var.getContext());
        this.f22276b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        uh.o oVar = cVar.v;
        oVar.setMaxLines(1);
        oVar.setSingleLine(true);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f22275a = l4Var;
        l4Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f22275a.removeView(this.f22276b);
    }
}
