package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ku0 implements RequestDelegate {
    public final int f47023a;
    public final mu0 f47024b;

    public ku0(mu0 mu0Var, int i3) {
        this.f47023a = i3;
        this.f47024b = mu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47023a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                mu0 mu0Var = this.f47024b;
                mu0Var.f47791c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ku0(mu0Var, 1));
                return;
            default:
                this.f47024b.f47791c.getMessagesController().R2(true);
                return;
        }
    }
}
