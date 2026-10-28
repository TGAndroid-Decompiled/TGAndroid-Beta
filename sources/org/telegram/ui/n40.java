package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class n40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f41630a;
    public final x50 f41631b;

    public n40(x50 x50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f41631b = x50Var;
        this.f41630a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        x50 x50Var = this.f41631b;
        x50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        x50Var.f45557q2 = null;
        x50Var.a2.j(this.f41630a);
        AndroidUtilities.updateVisibleRows(x50Var.f45540m2);
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
