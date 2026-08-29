package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class c40 implements hu0 {
    public final r50 f36988a;

    public c40(r50 r50Var) {
        this.f36988a = r50Var;
    }

    @Override
    public final void D(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36988a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView b0() {
        return null;
    }

    @Override
    public final void x0(MessageObject messageObject) {
        ViewGroup viewGroup;
        r50 r50Var = this.f36988a;
        r50Var.M.I0(true);
        r50Var.Y1.f40293f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
    }
}
