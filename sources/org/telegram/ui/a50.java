package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f31724a;
    public final boolean f31725b;
    public final k60 f31726c;

    public a50(k60 k60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f31726c = k60Var;
        this.f31724a = videoParticipant;
        this.f31725b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f31726c;
        q50 q50Var = k60Var.Q;
        q50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.f35082q2 = null;
        c40 c40Var = k60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f31724a;
        c40Var.j(videoParticipant);
        if (k60Var.f35090s0) {
            k60Var.f35090s0 = false;
            k60Var.O0(true);
            if (this.f31725b && videoParticipant != null) {
                q50Var.v0(0);
            }
            k60Var.f35090s0 = true;
        } else {
            k60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
