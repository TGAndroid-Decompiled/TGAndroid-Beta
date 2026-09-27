package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q81 implements RequestDelegate {
    public final int f36628a;
    public final a91 f36629b;

    public q81(a91 a91Var, int i10) {
        this.f36628a = i10;
        this.f36629b = a91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36628a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                a91 a91Var = this.f36629b;
                a91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new q81(a91Var, 1));
                return;
            default:
                this.f36629b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
