package org.telegram.ui;
public final class cp implements t60 {
    public final kp f35983a;

    public cp(kp kpVar) {
        this.f35983a = kpVar;
    }

    @Override
    public final void a(u60 u60Var, long j10) {
        kp kpVar = this.f35983a;
        kpVar.Y(kpVar.getMessagesController().getChat(Long.valueOf(j10)), u60Var);
    }
}
