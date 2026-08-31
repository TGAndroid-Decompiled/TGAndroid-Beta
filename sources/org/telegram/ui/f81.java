package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f81 implements RequestDelegate {
    public final int f36788a;
    public final p81 f36789b;

    public f81(p81 p81Var, int i10) {
        this.f36788a = i10;
        this.f36789b = p81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36788a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                p81 p81Var = this.f36789b;
                p81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new f81(p81Var, 1));
                return;
            default:
                this.f36789b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
