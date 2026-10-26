package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class l40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f41134a;
    public final v50 f41135b;

    public l40(v50 v50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f41135b = v50Var;
        this.f41134a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        v50 v50Var = this.f41135b;
        v50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        v50Var.f44676q2 = null;
        v50Var.a2.j(this.f41134a);
        AndroidUtilities.updateVisibleRows(v50Var.f44659m2);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
