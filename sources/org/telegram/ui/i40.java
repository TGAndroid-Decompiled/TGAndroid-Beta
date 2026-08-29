package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f39122a;
    public final r50 f39123b;

    public i40(r50 r50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f39123b = r50Var;
        this.f39122a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        r50 r50Var = this.f39123b;
        r50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        r50Var.f41918m2 = null;
        r50Var.W1.j(this.f39122a);
        AndroidUtilities.updateVisibleRows(r50Var.f41904i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
