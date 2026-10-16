package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f34880a;
    public final n60 f34881b;

    public d50(n60 n60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f34881b = n60Var;
        this.f34880a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        n60 n60Var = this.f34881b;
        n60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        n60Var.f38223q2 = null;
        n60Var.a2.j(this.f34880a);
        AndroidUtilities.updateVisibleRows(n60Var.f38206m2);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
