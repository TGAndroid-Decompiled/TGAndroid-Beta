package org.telegram.ui;
public final class kp implements i70 {
    public final sp f35128a;

    public kp(sp spVar) {
        this.f35128a = spVar;
    }

    @Override
    public final void a(j70 j70Var, long j3) {
        sp spVar = this.f35128a;
        spVar.Y(spVar.getMessagesController().getChat(Long.valueOf(j3)), j70Var);
    }
}
