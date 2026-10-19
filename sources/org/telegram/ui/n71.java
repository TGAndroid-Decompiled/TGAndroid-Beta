package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n71 implements RequestDelegate {
    public final int f39440a;
    public final x71 f39441b;

    public n71(x71 x71Var, int i10) {
        this.f39440a = i10;
        this.f39441b = x71Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39440a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                x71 x71Var = this.f39441b;
                x71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n71(x71Var, 1));
                return;
            default:
                this.f39441b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
