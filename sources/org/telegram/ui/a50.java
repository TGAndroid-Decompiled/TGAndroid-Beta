package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f30803a;
    public final j60 f30804b;

    public a50(j60 j60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f30804b = j60Var;
        this.f30803a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        j60 j60Var = this.f30804b;
        j60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        j60Var.f34001q2 = null;
        j60Var.a2.j(this.f30803a);
        AndroidUtilities.updateVisibleRows(j60Var.f33984m2);
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
