package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m81 implements RequestDelegate {
    public final int f35181a;
    public final x81 f35182b;

    public m81(x81 x81Var, int i10) {
        this.f35181a = i10;
        this.f35182b = x81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35181a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                x81 x81Var = this.f35182b;
                x81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new m81(x81Var, 1));
                return;
            default:
                this.f35182b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
