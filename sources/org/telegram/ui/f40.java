package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class f40 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f38132a;
    public final o50 f38133b;

    public f40(o50 o50Var, ChatObject.VideoParticipant videoParticipant) {
        this.f38133b = o50Var;
        this.f38132a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        o50 o50Var = this.f38133b;
        o50Var.M.getViewTreeObserver().removeOnPreDrawListener(this);
        o50Var.f40931m2 = null;
        o50Var.W1.j(this.f38132a);
        AndroidUtilities.updateVisibleRows(o50Var.f40917i2);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
