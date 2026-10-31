package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pu implements RequestDelegate {
    public final int f40788a;
    public final su f40789b;

    public pu(su suVar, int i10) {
        this.f40788a = i10;
        this.f40789b = suVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40788a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                su suVar = this.f40789b;
                suVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new pu(suVar, 1));
                return;
            default:
                this.f40789b.getMessagesController().P2(true);
                return;
        }
    }
}
