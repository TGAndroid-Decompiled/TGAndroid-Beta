package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
public final class k71 extends UndoView {
    public final SessionsActivity f40676j0;

    public k71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f40676j0 = sessionsActivity;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.r2) this.f40676j0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new l10(28, this, tL_authorization));
        }
        super.d(i10, z10);
    }
}
