package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class f10 implements wd.a {
    public final ViewGroup f28228a;
    public final tg.d f28229b;

    public f10(dh.g gVar, GroupCallMessage groupCallMessage) {
        tg.d dVar = new tg.d(gVar.getContext());
        this.f28229b = dVar;
        dVar.setBackgroundColor(i0.a.k(-16777216, 34));
        dh.u uVar = dVar.v;
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setEllipsize(TextUtils.TruncateAt.END);
        dVar.set(groupCallMessage);
        dVar.setAlpha(0.0f);
        this.f28228a = gVar;
        gVar.addView(dVar);
    }

    @Override
    public final void a() {
        this.f28228a.removeView(this.f28229b);
    }
}
