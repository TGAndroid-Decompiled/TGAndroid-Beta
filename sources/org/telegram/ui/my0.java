package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my0 implements RequestDelegate {
    public final int f39261a;
    public final py0 f39262b;

    public my0(py0 py0Var, int i10) {
        this.f39261a = i10;
        this.f39262b = py0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39261a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                py0 py0Var = this.f39262b;
                py0Var.f40238c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new my0(py0Var, 1));
                return;
            default:
                this.f39262b.f40238c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
