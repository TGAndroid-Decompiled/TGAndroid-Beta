package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cg extends org.telegram.ui.sn {
    public boolean f25325ed;
    public final TLRPC.User f25326fd;
    public final TLRPC.User f25327gd;
    public final long f25328hd;

    public cg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f25326fd = user;
        this.f25327gd = user2;
        this.f25328hd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f25325ed) {
            this.f25325ed = true;
            xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f25326fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f25327gd)), new ai.v3(this, this.f25328hd, 23)), R.raw.contact_check).j();
        }
    }
}
