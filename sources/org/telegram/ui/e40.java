package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;
public final class e40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f37816a;
    public final boolean f37817b;
    public final o50 f37818c;

    public e40(o50 o50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.f37818c = o50Var;
        this.f37816a = videoParticipant;
        this.f37817b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        o50 o50Var = this.f37818c;
        u40 u40Var = o50Var.M;
        u40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        o50Var.f40931m2 = null;
        g30 g30Var = o50Var.W1;
        ChatObject.VideoParticipant videoParticipant = this.f37816a;
        g30Var.j(videoParticipant);
        if (o50Var.f40938o0) {
            o50Var.f40938o0 = false;
            o50Var.O0(true);
            if (this.f37817b && videoParticipant != null) {
                u40Var.u0(0);
            }
            o50Var.f40938o0 = true;
        } else {
            o50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
