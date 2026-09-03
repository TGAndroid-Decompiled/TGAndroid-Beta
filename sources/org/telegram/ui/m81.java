package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m81 implements RequestDelegate {
    public final int f35997a;
    public final w81 f35998b;

    public m81(w81 w81Var, int i10) {
        this.f35997a = i10;
        this.f35998b = w81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35997a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                w81 w81Var = this.f35998b;
                w81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new m81(w81Var, 1));
                return;
            default:
                this.f35998b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
