package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class gc0 extends zn {
    public boolean Pc;
    public final TLRPC.User Qc;
    public final TLRPC.User[] Rc;
    public final long Sc;

    public gc0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.Qc = user;
        this.Rc = userArr;
        this.Sc = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Pc) {
            this.Pc = true;
            org.telegram.ui.Components.xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Rc[0])), new ai.j(this, this.Sc, 25)), R.raw.contact_check).j();
        }
    }
}
