package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e81 implements RequestDelegate {
    public final int f33928a;
    public final o81 f33929b;

    public e81(o81 o81Var, int i10) {
        this.f33928a = i10;
        this.f33929b = o81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33928a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                o81 o81Var = this.f33929b;
                o81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new e81(o81Var, 1));
                return;
            default:
                this.f33929b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
