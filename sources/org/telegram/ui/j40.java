package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class j40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38456a;
    public final u50 f38457b;

    public j40(u50 u50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f38457b = u50Var;
        this.f38456a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        u50 u50Var = this.f38457b;
        u50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        u50Var.f42237q2 = null;
        u50Var.a2.j(this.f38456a);
        AndroidUtilities.updateVisibleRows(u50Var.f42220m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
