package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bz0 implements RequestDelegate {
    public final int f35216a;
    public final ez0 f35217b;

    public bz0(ez0 ez0Var, int i10) {
        this.f35216a = i10;
        this.f35217b = ez0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35216a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ez0 ez0Var = this.f35217b;
                ez0Var.f36119c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new bz0(ez0Var, 1));
                return;
            default:
                this.f35217b.f36119c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
