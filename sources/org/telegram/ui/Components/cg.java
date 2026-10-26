package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cg extends org.telegram.ui.un {
    public boolean f27140kd;
    public final TLRPC.User f27141ld;
    public final TLRPC.User f27142md;
    public final long f27143nd;

    public cg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f27141ld = user;
        this.f27142md = user2;
        this.f27143nd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f27140kd) {
            this.f27140kd = true;
            wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f27141ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f27142md)), new bi.r3(this, this.f27143nd, 23)), R.raw.contact_check).j();
        }
    }
}
