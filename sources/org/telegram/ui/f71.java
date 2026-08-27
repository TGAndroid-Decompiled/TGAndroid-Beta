package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

public final class f71 extends UndoView {

    public final SessionsActivity f37957b0;

    public f71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f37957b0 = sessionsActivity;
    }

    @Override
    public final void e(int i10, boolean z10) {
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) this.f37957b0).currentAccount).sendRequest(resetauthorization, new v80(23, this, tL_authorization));
        }
        super.e(i10, z10);
    }
}
