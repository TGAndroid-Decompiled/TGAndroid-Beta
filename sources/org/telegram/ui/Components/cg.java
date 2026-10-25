package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cg extends org.telegram.ui.un {
    public boolean f27138kd;
    public final TLRPC.User f27139ld;
    public final TLRPC.User f27140md;
    public final long f27141nd;

    public cg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f27139ld = user;
        this.f27140md = user2;
        this.f27141nd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f27138kd) {
            this.f27138kd = true;
            wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f27139ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f27140md)), new bi.r3(this, this.f27141nd, 23)), R.raw.contact_check).j();
        }
    }
}
