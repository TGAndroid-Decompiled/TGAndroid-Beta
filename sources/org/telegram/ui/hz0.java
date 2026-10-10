package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hz0 implements RequestDelegate {
    public final int f38465a;
    public final kz0 f38466b;

    public hz0(kz0 kz0Var, int i10) {
        this.f38465a = i10;
        this.f38466b = kz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38465a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                kz0 kz0Var = this.f38466b;
                kz0Var.f39425c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new hz0(kz0Var, 1));
                return;
            default:
                this.f38466b.f39425c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
