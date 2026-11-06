package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nt implements RequestDelegate {
    public final int f48131a;
    public final qt f48132b;

    public nt(qt qtVar, int i7) {
        this.f48131a = i7;
        this.f48132b = qtVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48131a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                qt qtVar = this.f48132b;
                qtVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new nt(qtVar, 1));
                return;
            default:
                this.f48132b.getMessagesController().R2(true);
                return;
        }
    }
}
