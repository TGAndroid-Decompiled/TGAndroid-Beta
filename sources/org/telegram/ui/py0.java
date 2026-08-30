package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py0 implements RequestDelegate {
    public final int f37556a;
    public final sy0 f37557b;

    public py0(sy0 sy0Var, int i10) {
        this.f37556a = i10;
        this.f37557b = sy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37556a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                sy0 sy0Var = this.f37557b;
                sy0Var.f38459c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new py0(sy0Var, 1));
                return;
            default:
                this.f37557b.f38459c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
