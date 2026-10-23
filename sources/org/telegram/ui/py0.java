package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py0 implements RequestDelegate {
    public final int f40574a;
    public final sy0 f40575b;

    public py0(sy0 sy0Var, int i10) {
        this.f40574a = i10;
        this.f40575b = sy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40574a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                sy0 sy0Var = this.f40575b;
                sy0Var.f41824c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new py0(sy0Var, 1));
                return;
            default:
                this.f40575b.f41824c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
