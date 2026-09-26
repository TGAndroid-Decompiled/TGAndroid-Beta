package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class o40 implements dv0 {
    public final d60 f36046a;

    public o40(d60 d60Var) {
        this.f36046a = d60Var;
    }

    @Override
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        d60 d60Var = this.f36046a;
        d60Var.Q.I0(true);
        d60Var.f32944c2.f34297f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36046a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView j0() {
        return null;
    }
}
