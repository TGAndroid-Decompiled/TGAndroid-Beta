package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kz0 implements RequestDelegate {
    public final int f35381a;
    public final nz0 f35382b;

    public kz0(nz0 nz0Var, int i10) {
        this.f35381a = i10;
        this.f35382b = nz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35381a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                nz0 nz0Var = this.f35382b;
                nz0Var.f36186c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new kz0(nz0Var, 1));
                return;
            default:
                this.f35382b.f36186c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
