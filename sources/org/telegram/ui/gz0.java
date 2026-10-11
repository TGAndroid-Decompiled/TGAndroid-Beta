package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gz0 implements RequestDelegate {
    public final int f38216a;
    public final jz0 f38217b;

    public gz0(jz0 jz0Var, int i10) {
        this.f38216a = i10;
        this.f38217b = jz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38216a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                jz0 jz0Var = this.f38217b;
                jz0Var.f39187c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new gz0(jz0Var, 1));
                return;
            default:
                this.f38217b.f39187c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
