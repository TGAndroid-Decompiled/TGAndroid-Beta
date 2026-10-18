package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f37435a;
    public final boolean f37436b;
    public final s50 f37437c;

    public h40(s50 s50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f37437c = s50Var;
        this.f37435a = videoParticipant;
        this.f37436b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.f37437c;
        y40 y40Var = s50Var.Q;
        y40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.f41000q2 = null;
        j30 j30Var = s50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f37435a;
        j30Var.j(videoParticipant);
        if (s50Var.f41008s0) {
            s50Var.f41008s0 = false;
            s50Var.P0(true);
            if (this.f37436b && videoParticipant != null) {
                y40Var.u0(0);
            }
            s50Var.f41008s0 = true;
        } else {
            s50Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
