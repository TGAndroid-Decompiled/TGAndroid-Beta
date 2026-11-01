package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
public final class j41 extends UndoView {
    public final SessionsActivity f38273j0;

    public j41(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f38273j0 = sessionsActivity;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.k2) this.f38273j0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new sl0(9, this, tL_authorization));
        }
        super.d(i10, z10);
    }
}
