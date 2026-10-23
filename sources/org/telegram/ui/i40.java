package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38068a;
    public final boolean f38069b;
    public final u50 f38070c;

    public i40(u50 u50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f38070c = u50Var;
        this.f38068a = videoParticipant;
        this.f38069b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        u50 u50Var = this.f38070c;
        z40 z40Var = u50Var.Q;
        z40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        u50Var.f42237q2 = null;
        k30 k30Var = u50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f38068a;
        k30Var.j(videoParticipant);
        if (u50Var.f42245s0) {
            u50Var.f42245s0 = false;
            u50Var.O0(true);
            if (this.f38069b && videoParticipant != null) {
                z40Var.u0(0);
            }
            u50Var.f42245s0 = true;
        } else {
            u50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
