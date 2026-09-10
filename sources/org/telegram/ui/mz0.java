package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mz0 implements RequestDelegate {
    public final int f35079a;
    public final pz0 f35080b;

    public mz0(pz0 pz0Var, int i10) {
        this.f35079a = i10;
        this.f35080b = pz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35079a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                pz0 pz0Var = this.f35080b;
                pz0Var.f35936c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new mz0(pz0Var, 1));
                return;
            default:
                this.f35080b.f35936c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
