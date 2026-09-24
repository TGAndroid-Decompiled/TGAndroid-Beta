package org.telegram.ui;
public final class jp implements f70 {
    public final rp f34834a;

    public jp(rp rpVar) {
        this.f34834a = rpVar;
    }

    @Override
    public final void a(g70 g70Var, long j3) {
        rp rpVar = this.f34834a;
        rpVar.Y(rpVar.getMessagesController().getChat(Long.valueOf(j3)), g70Var);
    }
}
