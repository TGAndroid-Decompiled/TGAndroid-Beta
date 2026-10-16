package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz0 implements RequestDelegate {
    public final int f38492a;
    public final qz0 f38493b;

    public nz0(qz0 qz0Var, int i10) {
        this.f38492a = i10;
        this.f38493b = qz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38492a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                qz0 qz0Var = this.f38493b;
                qz0Var.f39247c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new nz0(qz0Var, 1));
                return;
            default:
                this.f38493b.f39247c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
