package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class l00 implements we.a {
    public final ViewGroup f35477a;
    public final nh.c f35478b;

    public l00(di.b4 b4Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(b4Var.getContext());
        this.f35478b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f20607w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f35477a = b4Var;
        b4Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f35477a.removeView(this.f35478b);
    }
}
