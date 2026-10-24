package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q71 implements RequestDelegate {
    public final int f40729a;
    public final b81 f40730b;

    public q71(b81 b81Var, int i10) {
        this.f40729a = i10;
        this.f40730b = b81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40729a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                b81 b81Var = this.f40730b;
                b81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new q71(b81Var, 1));
                return;
            default:
                this.f40730b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
