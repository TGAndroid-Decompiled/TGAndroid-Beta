package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dw0 implements RequestDelegate {
    public final int f36690a;
    public final fw0 f36691b;

    public dw0(fw0 fw0Var, int i10) {
        this.f36690a = i10;
        this.f36691b = fw0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36690a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                fw0 fw0Var = this.f36691b;
                fw0Var.f37246c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new dw0(fw0Var, 1));
                return;
            default:
                this.f36691b.f37246c.getMessagesController().P2(true);
                return;
        }
    }
}
