package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ky0 implements RequestDelegate {
    public final int f38692a;
    public final ny0 f38693b;

    public ky0(ny0 ny0Var, int i10) {
        this.f38692a = i10;
        this.f38693b = ny0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38692a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ny0 ny0Var = this.f38693b;
                ny0Var.f39717c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ky0(ny0Var, 1));
                return;
            default:
                this.f38693b.f39717c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
