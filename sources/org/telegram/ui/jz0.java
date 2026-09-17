package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jz0 implements RequestDelegate {
    public final int f37868a;
    public final mz0 f37869b;

    public jz0(mz0 mz0Var, int i10) {
        this.f37868a = i10;
        this.f37869b = mz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37868a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                mz0 mz0Var = this.f37869b;
                mz0Var.f38794c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new jz0(mz0Var, 1));
                return;
            default:
                this.f37869b.f38794c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
