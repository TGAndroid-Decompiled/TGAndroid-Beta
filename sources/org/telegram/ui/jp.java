package org.telegram.ui;
public final class jp implements f70 {
    public final rp f34846a;

    public jp(rp rpVar) {
        this.f34846a = rpVar;
    }

    @Override
    public final void a(g70 g70Var, long j3) {
        rp rpVar = this.f34846a;
        rpVar.Y(rpVar.getMessagesController().getChat(Long.valueOf(j3)), g70Var);
    }
}
