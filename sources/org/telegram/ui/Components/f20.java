package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.voip.GroupCallMessage;
public final class f20 implements re.a {
    public final ViewGroup f28039a;
    public final nh.c f28040b;

    public f20(di.i4 i4Var, GroupCallMessage groupCallMessage) {
        nh.c cVar = new nh.c(i4Var.getContext());
        this.f28040b = cVar;
        cVar.setBackgroundColor(i0.a.o(-16777216, 34));
        xh.n nVar = cVar.v;
        nVar.setMaxLines(1);
        nVar.setSingleLine(true);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        cVar.set(groupCallMessage);
        cVar.setAlpha(0.0f);
        this.f28039a = i4Var;
        i4Var.addView(cVar);
    }

    @Override
    public final void a() {
        this.f28039a.removeView(this.f28040b);
    }
}
