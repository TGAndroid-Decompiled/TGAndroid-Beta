package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class q10 implements yd.a {
    public final ViewGroup f31825a;
    public final wg.c f31826b;

    public q10(bh.d dVar, GroupCallMessage groupCallMessage) {
        wg.c cVar = new wg.c(dVar.getContext());
        this.f31826b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        gh.s sVar = cVar.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f31825a = dVar;
        dVar.addView(cVar);
    }

    @Override
    public final void a() {
        this.f31825a.removeView(this.f31826b);
    }
}
