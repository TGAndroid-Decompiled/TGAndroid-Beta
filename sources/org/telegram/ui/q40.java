package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class q40 implements yu0 {
    public final e60 f37298a;

    public q40(e60 e60Var) {
        this.f37298a = e60Var;
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f37298a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView e0() {
        return null;
    }

    @Override
    public final void w0(MessageObject messageObject) {
        ViewGroup viewGroup;
        e60 e60Var = this.f37298a;
        e60Var.N.I0(true);
        e60Var.Z1.f33228f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
    }
}
