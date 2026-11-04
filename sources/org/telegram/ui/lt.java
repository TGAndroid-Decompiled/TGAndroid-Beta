package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lt implements RequestDelegate {
    public final int f47434a;
    public final ot f47435b;

    public lt(ot otVar, int i3) {
        this.f47434a = i3;
        this.f47435b = otVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47434a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ot otVar = this.f47435b;
                otVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new lt(otVar, 1));
                return;
            default:
                this.f47435b.getMessagesController().R2(true);
                return;
        }
    }
}
