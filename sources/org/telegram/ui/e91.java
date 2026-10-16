package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e91 implements RequestDelegate {
    public final int f35230a;
    public final o91 f35231b;

    public e91(o91 o91Var, int i10) {
        this.f35230a = i10;
        this.f35231b = o91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35230a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                o91 o91Var = this.f35231b;
                o91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new e91(o91Var, 1));
                return;
            default:
                this.f35231b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
