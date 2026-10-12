package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class eg extends org.telegram.ui.fo {
    public boolean Qc;
    public final TLRPC.User Rc;
    public final TLRPC.User Sc;
    public final long Tc;

    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.Rc = user;
        this.Sc = user2;
        this.Tc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            zc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc)), new bi.g(this, this.Tc, 21)), R.raw.contact_check).j();
        }
    }
}
