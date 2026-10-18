package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f37750a;
    public final s50 f37751b;

    public i40(s50 s50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f37751b = s50Var;
        this.f37750a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.f37751b;
        s50Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.f41000q2 = null;
        s50Var.a2.j(this.f37750a);
        AndroidUtilities.updateVisibleRows(s50Var.f40983m2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
