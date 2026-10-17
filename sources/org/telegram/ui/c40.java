package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class c40 implements tu0 {
    public final s50 f35812a;

    public c40(s50 s50Var) {
        this.f35812a = s50Var;
    }

    @Override
    public final TextureView U() {
        return null;
    }

    @Override
    public final void m0(MessageObject messageObject) {
        ViewGroup viewGroup;
        s50 s50Var = this.f35812a;
        s50Var.Q.I0(true);
        s50Var.f40923c2.f43259f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void z(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35812a).containerView;
        viewGroup.invalidate();
    }
}
