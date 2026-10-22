package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class f40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f36892a;
    public final boolean f36893b;
    public final q50 f36894c;

    public f40(q50 q50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f36894c = q50Var;
        this.f36892a = videoParticipant;
        this.f36893b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        q50 q50Var = this.f36894c;
        w40 w40Var = q50Var.Q;
        w40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        q50Var.f40445q2 = null;
        h30 h30Var = q50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f36892a;
        h30Var.j(videoParticipant);
        if (q50Var.f40453s0) {
            q50Var.f40453s0 = false;
            q50Var.P0(true);
            if (this.f36893b && videoParticipant != null) {
                w40Var.u0(0);
            }
            q50Var.f40453s0 = true;
        } else {
            q50Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
