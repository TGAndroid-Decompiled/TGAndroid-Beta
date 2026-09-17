package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class b50 implements ViewTreeObserver.OnPreDrawListener {
    public final ChatObject.VideoParticipant f32049a;
    public final k60 f32050b;

    public b50(k60 k60Var, ChatObject.VideoParticipant videoParticipant) {
        this.f32050b = k60Var;
        this.f32049a = videoParticipant;
    }

    @Override
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.f32050b;
        k60Var.Q.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.f35077q2 = null;
        k60Var.a2.j(this.f32049a);
        AndroidUtilities.updateVisibleRows(k60Var.f35060m2);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
