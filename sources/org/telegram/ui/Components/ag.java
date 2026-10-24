package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class ag extends org.telegram.ui.sn {
    public boolean f24726ed;
    public final TLRPC.User f24727fd;
    public final TLRPC.User f24728gd;
    public final long f24729hd;

    public ag(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f24727fd = user;
        this.f24728gd = user2;
        this.f24729hd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f24726ed) {
            this.f24726ed = true;
            vc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f24727fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f24728gd)), new ai.v3(this, this.f24729hd, 23)), R.raw.contact_check).j();
        }
    }
}
