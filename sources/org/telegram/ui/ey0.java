package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ey0 implements RequestDelegate {
    public final int f37932a;
    public final hy0 f37933b;

    public ey0(hy0 hy0Var, int i10) {
        this.f37932a = i10;
        this.f37933b = hy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37932a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                hy0 hy0Var = this.f37933b;
                hy0Var.f39072c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ey0(hy0Var, 1));
                return;
            default:
                this.f37933b.f39072c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
