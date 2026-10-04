package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class eg extends org.telegram.ui.yn {
    public boolean Kc;
    public final TLRPC.User Lc;
    public final TLRPC.User Mc;
    public final long Nc;

    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.Lc = user;
        this.Mc = user2;
        this.Nc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Kc) {
            this.Kc = true;
            yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Lc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Mc)), new ai.j(this, this.Nc, 20)), R.raw.contact_check).j();
        }
    }
}
