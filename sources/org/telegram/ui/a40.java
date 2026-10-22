package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class a40 implements ru0 {
    public final q50 f35275a;

    public a40(q50 q50Var) {
        this.f35275a = q50Var;
    }

    @Override
    public final TextureView U() {
        return null;
    }

    @Override
    public final void m0(MessageObject messageObject) {
        ViewGroup viewGroup;
        q50 q50Var = this.f35275a;
        q50Var.Q.I0(true);
        q50Var.f40389c2.f42384f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void z(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35275a).containerView;
        viewGroup.invalidate();
    }
}
