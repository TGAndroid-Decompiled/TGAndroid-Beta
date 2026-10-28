package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class m40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f41327a;
    public final boolean f41328b;
    public final x50 f41329c;

    public m40(x50 x50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f41329c = x50Var;
        this.f41327a = videoParticipant;
        this.f41328b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        x50 x50Var = this.f41329c;
        d50 d50Var = x50Var.Q;
        d50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        x50Var.f45557q2 = null;
        o30 o30Var = x50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f41327a;
        o30Var.j(videoParticipant);
        if (x50Var.f45565s0) {
            x50Var.f45565s0 = false;
            x50Var.O0(true);
            if (this.f41328b && videoParticipant != null) {
                d50Var.v0(0);
            }
            x50Var.f45565s0 = true;
        } else {
            x50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
