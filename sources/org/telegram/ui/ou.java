package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ou implements RequestDelegate {
    public final int f40269a;
    public final ru f40270b;

    public ou(ru ruVar, int i10) {
        this.f40269a = i10;
        this.f40270b = ruVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40269a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ru ruVar = this.f40270b;
                ruVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ou(ruVar, 1));
                return;
            default:
                this.f40270b.getMessagesController().P2(true);
                return;
        }
    }
}
