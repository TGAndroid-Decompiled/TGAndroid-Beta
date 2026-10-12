package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class c50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f34735a;
    public final boolean f34736b;
    public final n60 f34737c;

    public c50(n60 n60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f34737c = n60Var;
        this.f34735a = videoParticipant;
        this.f34736b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        n60 n60Var = this.f34737c;
        t50 t50Var = n60Var.Q;
        t50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        n60Var.f38508q2 = null;
        e40 e40Var = n60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.f34735a;
        e40Var.j(videoParticipant);
        if (n60Var.f38516s0) {
            n60Var.f38516s0 = false;
            n60Var.P0(true);
            if (this.f34736b && videoParticipant != null) {
                t50Var.u0(0);
            }
            n60Var.f38516s0 = true;
        } else {
            n60Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
