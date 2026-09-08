package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
public final class p81 extends UndoView {
    public final SessionsActivity f39460f0;

    public p81(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f39460f0 = sessionsActivity;
    }

    @Override
    public final void e(int i10, boolean z10) {
        int i11;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.n2) this.f39460f0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new bc0(19, this, tL_authorization));
        }
        super.e(i10, z10);
    }
}
