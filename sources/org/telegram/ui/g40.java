package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class g40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f37175a;
    public final q50 f37176b;

    public g40(q50 q50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f37176b = q50Var;
        this.f37175a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        q50 q50Var = this.f37176b;
        q50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        q50Var.f40436q2 = null;
        q50Var.a2.j(this.f37175a);
        AndroidUtilities.updateVisibleRows(q50Var.f40419m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
