package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hz0 implements RequestDelegate {
    public final int f38421a;
    public final kz0 f38422b;

    public hz0(kz0 kz0Var, int i10) {
        this.f38421a = i10;
        this.f38422b = kz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38421a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                kz0 kz0Var = this.f38422b;
                kz0Var.f39381c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new hz0(kz0Var, 1));
                return;
            default:
                this.f38422b.f39381c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
