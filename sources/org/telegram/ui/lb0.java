package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class lb0 extends tn {
    public boolean Mc;
    public final TLRPC.User Nc;
    public final TLRPC.User[] Oc;
    public final long Pc;

    public lb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.Nc = user;
        this.Oc = userArr;
        this.Pc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Mc) {
            this.Mc = true;
            org.telegram.ui.Components.tc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Oc[0])), new eg.z1(this, this.Pc, 25)), R.raw.contact_check).j();
        }
    }
}
