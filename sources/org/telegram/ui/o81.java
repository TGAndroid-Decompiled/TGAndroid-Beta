package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o81 implements RequestDelegate {
    public final int f36082a;
    public final z81 f36083b;

    public o81(z81 z81Var, int i10) {
        this.f36082a = i10;
        this.f36083b = z81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36082a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                z81 z81Var = this.f36083b;
                z81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new o81(z81Var, 1));
                return;
            default:
                this.f36083b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
