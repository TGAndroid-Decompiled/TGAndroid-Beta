package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f32053a;
    public final k60 f32054b;

    public b50(k60 k60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f32054b = k60Var;
        this.f32053a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f32054b;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.f35082q2 = null;
        k60Var.a2.j(this.f32053a);
        AndroidUtilities.updateVisibleRows(k60Var.f35065m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
