package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f35151a;
    public final n60 f35152b;

    public d50(n60 n60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f35152b = n60Var;
        this.f35151a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        n60 n60Var = this.f35152b;
        n60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        n60Var.f38508q2 = null;
        n60Var.a2.j(this.f35151a);
        AndroidUtilities.updateVisibleRows(n60Var.f38491m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
