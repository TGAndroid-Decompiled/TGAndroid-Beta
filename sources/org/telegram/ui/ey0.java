package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ey0 implements RequestDelegate {

    public final int f37879a;

    public final hy0 f37880b;

    public ey0(hy0 hy0Var, int i10) {
        this.f37879a = i10;
        this.f37880b = hy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37879a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                hy0 hy0Var = this.f37880b;
                hy0Var.f38911c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ey0(hy0Var, 1));
                break;
            default:
                this.f37880b.f38911c.getMessagesController().loadAppConfig();
                break;
        }
    }
}
