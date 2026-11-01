package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class a10 implements ie.a {
    public final ViewGroup f24264a;
    public final dh.d f24265b;

    public a10(org.telegram.ui.Cells.a5 a5Var, GroupCallMessage groupCallMessage) {
        dh.d dVar = new dh.d(a5Var.getContext());
        this.f24265b = dVar;
        dVar.setBackgroundColor(i0.b.o(-16777216, 34));
        nh.p pVar = dVar.f5942w;
        pVar.setMaxLines(1);
        pVar.setSingleLine(true);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        dVar.set(groupCallMessage);
        dVar.setAlpha(0.0f);
        this.f24264a = a5Var;
        a5Var.addView(dVar);
    }

    @Override
    public final void a() {
        this.f24264a.removeView(this.f24265b);
    }
}
