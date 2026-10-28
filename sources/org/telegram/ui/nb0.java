package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class nb0 extends wn {
    public boolean f41731od;
    public final TLRPC.User f41732pd;
    public final TLRPC.User[] f41733qd;
    public final long f41734rd;

    public nb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f41732pd = user;
        this.f41733qd = userArr;
        this.f41734rd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f41731od) {
            this.f41731od = true;
            org.telegram.ui.Components.wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f41732pd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f41733qd[0])), new bi.r3(this, this.f41734rd, 29)), R.raw.contact_check).j();
        }
    }
}
