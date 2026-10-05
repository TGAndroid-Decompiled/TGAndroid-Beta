package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n81 implements RequestDelegate {
    public final int f38832a;
    public final y81 f38833b;

    public n81(y81 y81Var, int i10) {
        this.f38832a = i10;
        this.f38833b = y81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38832a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                y81 y81Var = this.f38833b;
                y81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n81(y81Var, 1));
                return;
            default:
                this.f38833b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
