package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class nb0 extends sn {
    public boolean f39841ed;
    public final TLRPC.User f39842fd;
    public final TLRPC.User[] f39843gd;
    public final long f39844hd;

    public nb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f39842fd = user;
        this.f39843gd = userArr;
        this.f39844hd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f39841ed) {
            this.f39841ed = true;
            org.telegram.ui.Components.xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f39842fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f39843gd[0])), new ai.v3(this, this.f39844hd, 29)), R.raw.contact_check).j();
        }
    }
}
