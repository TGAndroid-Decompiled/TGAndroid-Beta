package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class k40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f40796a;
    public final boolean f40797b;
    public final v50 f40798c;

    public k40(v50 v50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f40798c = v50Var;
        this.f40796a = videoParticipant;
        this.f40797b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        v50 v50Var = this.f40798c;
        b50 b50Var = v50Var.Q;
        b50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        v50Var.f44676q2 = null;
        m30 m30Var = v50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f40796a;
        m30Var.j(videoParticipant);
        if (v50Var.f44684s0) {
            v50Var.f44684s0 = false;
            v50Var.O0(true);
            if (this.f40797b && videoParticipant != null) {
                b50Var.v0(0);
            }
            v50Var.f44684s0 = true;
        } else {
            v50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
