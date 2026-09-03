package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l81 implements RequestDelegate {
    public final int f38569a;
    public final v81 f38570b;

    public l81(v81 v81Var, int i10) {
        this.f38569a = i10;
        this.f38570b = v81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38569a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                v81 v81Var = this.f38570b;
                v81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new l81(v81Var, 1));
                return;
            default:
                this.f38570b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
