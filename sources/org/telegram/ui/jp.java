package org.telegram.ui;
public final class jp implements f70 {
    public final rp f34847a;

    public jp(rp rpVar) {
        this.f34847a = rpVar;
    }

    @Override
    public final void a(g70 g70Var, long j3) {
        rp rpVar = this.f34847a;
        rpVar.Y(rpVar.getMessagesController().getChat(Long.valueOf(j3)), g70Var);
    }
}
