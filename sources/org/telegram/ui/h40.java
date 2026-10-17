package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f37417a;
    public final boolean f37418b;
    public final s50 f37419c;

    public h40(s50 s50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f37419c = s50Var;
        this.f37417a = videoParticipant;
        this.f37418b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.f37419c;
        y40 y40Var = s50Var.Q;
        y40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.f40979q2 = null;
        j30 j30Var = s50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f37417a;
        j30Var.j(videoParticipant);
        if (s50Var.f40987s0) {
            s50Var.f40987s0 = false;
            s50Var.P0(true);
            if (this.f37418b && videoParticipant != null) {
                y40Var.u0(0);
            }
            s50Var.f40987s0 = true;
        } else {
            s50Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
