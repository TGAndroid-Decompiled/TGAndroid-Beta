package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
public final class d81 extends UndoView {
    public final SessionsActivity f36122c0;

    public d81(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f36122c0 = sessionsActivity;
    }

    @Override
    public final void e(int i10, boolean z4) {
        int i11;
        if (!z4 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.p2) this.f36122c0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new tb0(19, this, tL_authorization));
        }
        super.e(i10, z4);
    }
}
