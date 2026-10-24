package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements RequestDelegate {
    public final int f40278a;
    public final ry0 f40279b;

    public oy0(ry0 ry0Var, int i10) {
        this.f40278a = i10;
        this.f40279b = ry0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40278a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ry0 ry0Var = this.f40279b;
                ry0Var.f41253c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new oy0(ry0Var, 1));
                return;
            default:
                this.f40279b.f41253c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
