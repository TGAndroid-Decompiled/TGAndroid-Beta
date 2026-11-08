package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class m00 implements we.a {
    public final ViewGroup f35834a;
    public final nh.c f35835b;

    public m00(di.a4 a4Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(a4Var.getContext());
        this.f35835b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.l lVar = cVar.f20602w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f35834a = a4Var;
        a4Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f35834a.removeView(this.f35835b);
    }
}
