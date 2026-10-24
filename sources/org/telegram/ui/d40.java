package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class d40 implements tu0 {
    public final u50 f36465a;

    public d40(u50 u50Var) {
        this.f36465a = u50Var;
    }

    @Override
    public final TextureView U() {
        return null;
    }

    @Override
    public final void m0(MessageObject messageObject) {
        ViewGroup viewGroup;
        u50 u50Var = this.f36465a;
        u50Var.Q.I0(true);
        u50Var.f42227c2.f43680f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void z(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f36465a).containerView;
        viewGroup.invalidate();
    }
}
