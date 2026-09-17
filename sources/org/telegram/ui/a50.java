package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f31720a;
    public final boolean f31721b;
    public final k60 f31722c;

    public a50(k60 k60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f31722c = k60Var;
        this.f31720a = videoParticipant;
        this.f31721b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f31722c;
        q50 q50Var = k60Var.Q;
        q50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.f35077q2 = null;
        c40 c40Var = k60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f31720a;
        c40Var.j(videoParticipant);
        if (k60Var.f35085s0) {
            k60Var.f35085s0 = false;
            k60Var.O0(true);
            if (this.f31721b && videoParticipant != null) {
                q50Var.v0(0);
            }
            k60Var.f35085s0 = true;
        } else {
            k60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
