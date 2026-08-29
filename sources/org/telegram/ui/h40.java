package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38767a;
    public final boolean f38768b;
    public final r50 f38769c;

    public h40(r50 r50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f38769c = r50Var;
        this.f38767a = videoParticipant;
        this.f38768b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        r50 r50Var = this.f38769c;
        x40 x40Var = r50Var.M;
        x40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        r50Var.f41918m2 = null;
        j30 j30Var = r50Var.W1;
        ChatObject.VideoParticipant videoParticipant = this.f38767a;
        j30Var.j(videoParticipant);
        if (r50Var.f41925o0) {
            r50Var.f41925o0 = false;
            r50Var.O0(true);
            if (this.f38768b && videoParticipant != null) {
                x40Var.u0(0);
            }
            r50Var.f41925o0 = true;
        } else {
            r50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
