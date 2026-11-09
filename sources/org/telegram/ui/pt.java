package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pt implements RequestDelegate {
    public final int f48802a;
    public final st f48803b;

    public pt(st stVar, int i7) {
        this.f48802a = i7;
        this.f48803b = stVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48802a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                st stVar = this.f48803b;
                stVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new pt(stVar, 1));
                return;
            default:
                this.f48803b.getMessagesController().R2(true);
                return;
        }
    }
}
