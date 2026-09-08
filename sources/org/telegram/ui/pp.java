package org.telegram.ui;
public final class pp implements k70 {
    public final xp f39639a;

    public pp(xp xpVar) {
        this.f39639a = xpVar;
    }

    @Override
    public final void a(l70 l70Var, long j3) {
        xp xpVar = this.f39639a;
        xpVar.Y(xpVar.getMessagesController().getChat(Long.valueOf(j3)), l70Var);
    }
}
