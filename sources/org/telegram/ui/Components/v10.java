package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class v10 implements ae.a {
    public final ViewGroup f31776a;
    public final zg.c f31777b;

    public v10(eh.d dVar, GroupCallMessage groupCallMessage) {
        zg.c cVar = new zg.c(dVar.getContext());
        this.f31777b = cVar;
        cVar.setBackgroundColor(i0.a.k(-16777216, 34));
        jh.s sVar = cVar.v;
        sVar.setMaxLines(1);
        sVar.setSingleLine(true);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f31776a = dVar;
        dVar.addView(cVar);
    }

    @Override
    public final void a() {
        this.f31776a.removeView(this.f31777b);
    }
}
