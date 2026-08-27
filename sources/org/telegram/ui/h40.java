package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

public final class h40 implements ViewTreeObserver.OnPreDrawListener {

    public final ChatObject.VideoParticipant f38676a;

    public final boolean f38677b;

    public final s50 f38678c;

    public h40(s50 s50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f38678c = s50Var;
        this.f38676a = videoParticipant;
        this.f38677b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        s50 s50Var = this.f38678c;
        y40 y40Var = s50Var.M;
        y40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.f42460m2 = null;
        j30 j30Var = s50Var.W1;
        ChatObject.VideoParticipant videoParticipant = this.f38676a;
        j30Var.j(videoParticipant);
        if (s50Var.f42467o0) {
            s50Var.f42467o0 = false;
            s50Var.O0(true);
            if (this.f38677b && videoParticipant != null) {
                y40Var.u0(0);
            }
            s50Var.f42467o0 = true;
        } else {
            s50Var.O0(true);
        }
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.requestLayout();
        return false;
    }
}
