package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cc0 extends yn {
    public boolean Kc;
    public final TLRPC.User Lc;
    public final TLRPC.User[] Mc;
    public final long Nc;

    public cc0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.Lc = user;
        this.Mc = userArr;
        this.Nc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Kc) {
            this.Kc = true;
            org.telegram.ui.Components.yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Lc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Mc[0])), new ai.j(this, this.Nc, 25)), R.raw.contact_check).j();
        }
    }
}
