package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oz0 implements RequestDelegate {
    public final int f39065a;
    public final rz0 f39066b;

    public oz0(rz0 rz0Var, int i10) {
        this.f39065a = i10;
        this.f39066b = rz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39065a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                rz0 rz0Var = this.f39066b;
                rz0Var.f39903c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new oz0(rz0Var, 1));
                return;
            default:
                this.f39066b.f39903c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
