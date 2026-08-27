package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;

public final class i10 implements xd.a {

    public final ViewGroup f29198a;

    public final ug.d f29199b;

    public i10(ag.d dVar, GroupCallMessage groupCallMessage) {
        ug.d dVar2 = new ug.d(dVar.getContext());
        this.f29199b = dVar2;
        dVar2.setBackgroundColor(i0.b.k(-16777216, 34));
        eh.s sVar = dVar2.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        dVar2.set(groupCallMessage);
        dVar2.setAlpha(0.0f);
        this.f29198a = dVar;
        dVar.addView(dVar2);
    }

    @Override
    public final void a() {
        this.f29198a.removeView(this.f29199b);
    }
}
