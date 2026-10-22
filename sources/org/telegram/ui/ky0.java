package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ky0 implements RequestDelegate {
    public final int f38700a;
    public final ny0 f38701b;

    public ky0(ny0 ny0Var, int i10) {
        this.f38700a = i10;
        this.f38701b = ny0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38700a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ny0 ny0Var = this.f38701b;
                ny0Var.f39725c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ky0(ny0Var, 1));
                return;
            default:
                this.f38701b.f39725c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
