package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a91 implements RequestDelegate {
    public final int f35734a;
    public final k91 f35735b;

    public a91(k91 k91Var, int i10) {
        this.f35734a = i10;
        this.f35735b = k91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35734a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                k91 k91Var = this.f35735b;
                k91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new a91(k91Var, 1));
                return;
            default:
                this.f35735b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
