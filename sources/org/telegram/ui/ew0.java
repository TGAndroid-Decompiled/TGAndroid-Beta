package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ew0 implements RequestDelegate {
    public final int f37122a;
    public final gw0 f37123b;

    public ew0(gw0 gw0Var, int i10) {
        this.f37122a = i10;
        this.f37123b = gw0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37122a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                gw0 gw0Var = this.f37123b;
                gw0Var.f37660c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ew0(gw0Var, 1));
                return;
            default:
                this.f37123b.f37660c.getMessagesController().P2(true);
                return;
        }
    }
}
