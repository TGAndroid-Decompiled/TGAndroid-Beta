package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class ec0 extends eo {
    public boolean Qc;
    public final TLRPC.User Rc;
    public final TLRPC.User[] Sc;
    public final long Tc;

    public ec0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.Rc = user;
        this.Sc = userArr;
        this.Tc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Qc) {
            this.Qc = true;
            org.telegram.ui.Components.wc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc[0])), new bi.va(this, this.Tc, 20)), R.raw.contact_check).j();
        }
    }
}
