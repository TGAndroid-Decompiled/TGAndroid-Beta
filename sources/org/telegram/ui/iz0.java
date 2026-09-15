package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iz0 implements RequestDelegate {
    public final int f34751a;
    public final lz0 f34752b;

    public iz0(lz0 lz0Var, int i10) {
        this.f34751a = i10;
        this.f34752b = lz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34751a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                lz0 lz0Var = this.f34752b;
                lz0Var.f35587c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new iz0(lz0Var, 1));
                return;
            default:
                this.f34752b.f35587c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
