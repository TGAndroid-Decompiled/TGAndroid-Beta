package org.telegram.ui;
public final class jp implements f70 {
    public final sp f35332a;

    public jp(sp spVar) {
        this.f35332a = spVar;
    }

    @Override
    public final void a(g70 g70Var, long j10) {
        sp spVar = this.f35332a;
        spVar.Y(spVar.getMessagesController().getChat(Long.valueOf(j10)), g70Var);
    }
}
