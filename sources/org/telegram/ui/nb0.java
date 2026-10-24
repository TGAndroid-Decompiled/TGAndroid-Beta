package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class nb0 extends sn {
    public boolean f39791ed;
    public final TLRPC.User f39792fd;
    public final TLRPC.User[] f39793gd;
    public final long f39794hd;

    public nb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f39792fd = user;
        this.f39793gd = userArr;
        this.f39794hd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f39791ed) {
            this.f39791ed = true;
            org.telegram.ui.Components.vc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f39792fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f39793gd[0])), new ai.v3(this, this.f39794hd, 29)), R.raw.contact_check).j();
        }
    }
}
