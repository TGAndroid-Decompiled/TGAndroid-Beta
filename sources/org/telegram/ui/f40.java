package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class f40 implements yu0 {
    public final v50 f39251a;

    public f40(v50 v50Var) {
        this.f39251a = v50Var;
    }

    @Override
    public final void B0(MessageObject messageObject) {
        ViewGroup viewGroup;
        v50 v50Var = this.f39251a;
        v50Var.Q.I0(true);
        v50Var.f44620c2.f38537f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void E(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f39251a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView f0() {
        return null;
    }
}
