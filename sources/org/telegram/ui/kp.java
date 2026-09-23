package org.telegram.ui;
public final class kp implements h70 {
    public final sp f34778a;

    public kp(sp spVar) {
        this.f34778a = spVar;
    }

    @Override
    public final void a(i70 i70Var, long j3) {
        sp spVar = this.f34778a;
        spVar.Y(spVar.getMessagesController().getChat(Long.valueOf(j3)), i70Var);
    }
}
