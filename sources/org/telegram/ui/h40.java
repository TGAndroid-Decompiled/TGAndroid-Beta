package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class h40 implements av0 {
    public final x50 f39772a;

    public h40(x50 x50Var) {
        this.f39772a = x50Var;
    }

    @Override
    public final void B0(MessageObject messageObject) {
        ViewGroup viewGroup;
        x50 x50Var = this.f39772a;
        x50Var.Q.I0(true);
        x50Var.f45501c2.f38949f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void E(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f39772a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView f0() {
        return null;
    }
}
