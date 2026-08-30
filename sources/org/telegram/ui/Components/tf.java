package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class tf extends org.telegram.ui.xn {
    public boolean Nc;
    public final TLRPC.User Oc;
    public final TLRPC.User Pc;
    public final long Qc;

    public tf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.Oc = user;
        this.Pc = user2;
        this.Qc = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.Nc) {
            this.Nc = true;
            qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc)), new gg.y1(this, this.Qc, 17)), R.raw.contact_check).j();
        }
    }
}
