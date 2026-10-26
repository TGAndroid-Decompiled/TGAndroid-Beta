package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class kb0 extends un {
    public boolean f40875kd;
    public final TLRPC.User f40876ld;
    public final TLRPC.User[] f40877md;
    public final long f40878nd;

    public kb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f40876ld = user;
        this.f40877md = userArr;
        this.f40878nd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f40875kd) {
            this.f40875kd = true;
            org.telegram.ui.Components.wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.f40876ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.f40877md[0])), new bi.r3(this, this.f40878nd, 29)), R.raw.contact_check).j();
        }
    }
}
