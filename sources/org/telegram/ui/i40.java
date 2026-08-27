package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

public final class i40 implements ViewTreeObserver.OnPreDrawListener {

    public final ChatObject.VideoParticipant f38975a;

    public final s50 f38976b;

    public i40(s50 s50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f38976b = s50Var;
        this.f38975a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        s50 s50Var = this.f38976b;
        s50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.f42460m2 = null;
        s50Var.W1.j(this.f38975a);
        AndroidUtilities.updateVisibleRows(s50Var.f42446i2);
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.requestLayout();
        return false;
    }
}
