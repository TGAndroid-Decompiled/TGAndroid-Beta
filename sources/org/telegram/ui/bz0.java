package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bz0 implements RequestDelegate {
    public final int f32462a;
    public final ez0 f32463b;

    public bz0(ez0 ez0Var, int i10) {
        this.f32462a = i10;
        this.f32463b = ez0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32462a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ez0 ez0Var = this.f32463b;
                ez0Var.f33370c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new bz0(ez0Var, 1));
                return;
            default:
                this.f32463b.f33370c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
