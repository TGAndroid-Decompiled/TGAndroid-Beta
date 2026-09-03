package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class v10 implements ae.a {
    public final ViewGroup f29344a;
    public final yg.c f29345b;

    public v10(dh.d dVar, GroupCallMessage groupCallMessage) {
        yg.c cVar = new yg.c(dVar.getContext());
        this.f29345b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        ih.s sVar = cVar.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f29344a = dVar;
        dVar.addView(cVar);
    }

    @Override
    public final void a() {
        this.f29344a.removeView(this.f29345b);
    }
}
