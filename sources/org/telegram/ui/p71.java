package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p71 implements RequestDelegate {
    public final int f39964a;
    public final z71 f39965b;

    public p71(z71 z71Var, int i10) {
        this.f39964a = i10;
        this.f39965b = z71Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39964a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                z71 z71Var = this.f39965b;
                z71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new p71(z71Var, 1));
                return;
            default:
                this.f39965b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
