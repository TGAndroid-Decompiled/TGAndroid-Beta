package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class o40 implements ru0 {
    public final c60 f36789a;

    public o40(c60 c60Var) {
        this.f36789a = c60Var;
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f36789a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView f0() {
        return null;
    }

    @Override
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        c60 c60Var = this.f36789a;
        c60Var.N.I0(true);
        c60Var.Z1.f39252f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
    }
}
