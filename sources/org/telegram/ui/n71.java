package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n71 implements RequestDelegate {
    public final int f39444a;
    public final x71 f39445b;

    public n71(x71 x71Var, int i10) {
        this.f39444a = i10;
        this.f39445b = x71Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39444a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                x71 x71Var = this.f39445b;
                x71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n71(x71Var, 1));
                return;
            default:
                this.f39445b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
