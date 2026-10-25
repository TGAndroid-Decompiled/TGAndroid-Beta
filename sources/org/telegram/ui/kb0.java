package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class kb0 extends un {
    public boolean f40872kd;
    public final TLRPC.User f40873ld;
    public final TLRPC.User[] f40874md;
    public final long f40875nd;

    public kb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f40873ld = user;
        this.f40874md = userArr;
        this.f40875nd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f40872kd) {
            this.f40872kd = true;
            org.telegram.ui.Components.wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f40873ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f40874md[0])), new bi.r3(this, this.f40875nd, 29)), R.raw.contact_check).j();
        }
    }
}
