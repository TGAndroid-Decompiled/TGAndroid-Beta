package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iz0 implements RequestDelegate {
    public final int f34644a;
    public final lz0 f34645b;

    public iz0(lz0 lz0Var, int i10) {
        this.f34644a = i10;
        this.f34645b = lz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34644a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                lz0 lz0Var = this.f34645b;
                lz0Var.f35477c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new iz0(lz0Var, 1));
                return;
            default:
                this.f34645b.f35477c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
