package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class h00 implements te.a {
    public final ViewGroup f34251a;
    public final oh.c f34252b;

    public h00(ai.d2 d2Var, GroupCallMessage groupCallMessage) {
        oh.c cVar = new oh.c(d2Var.getContext());
        this.f34252b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        yh.l lVar = cVar.f21119w;
        lVar.setMaxLines(1);
        lVar.setSingleLine(true);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f34251a = d2Var;
        d2Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f34251a.removeView(this.f34252b);
    }
}
