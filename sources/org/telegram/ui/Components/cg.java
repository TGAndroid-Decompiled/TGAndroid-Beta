package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cg extends org.telegram.ui.wn {
    public boolean f27151od;
    public final TLRPC.User f27152pd;
    public final TLRPC.User f27153qd;
    public final long f27154rd;

    public cg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.f27152pd = user;
        this.f27153qd = user2;
        this.f27154rd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f27151od) {
            this.f27151od = true;
            wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f27152pd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f27153qd)), new bi.r3(this, this.f27154rd, 23)), R.raw.contact_check).j();
        }
    }
}
