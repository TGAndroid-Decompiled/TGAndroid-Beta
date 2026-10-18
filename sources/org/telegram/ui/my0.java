package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my0 implements RequestDelegate {
    public final int f39302a;
    public final py0 f39303b;

    public my0(py0 py0Var, int i10) {
        this.f39302a = i10;
        this.f39303b = py0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39302a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                py0 py0Var = this.f39303b;
                py0Var.f40280c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new my0(py0Var, 1));
                return;
            default:
                this.f39303b.f40280c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
