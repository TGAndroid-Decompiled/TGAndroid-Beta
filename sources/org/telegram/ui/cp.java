package org.telegram.ui;
public final class cp implements s60 {
    public final kp f37187a;

    public cp(kp kpVar) {
        this.f37187a = kpVar;
    }

    @Override
    public final void a(t60 t60Var, long j10) {
        kp kpVar = this.f37187a;
        kpVar.Y(kpVar.getMessagesController().getChat(Long.valueOf(j10)), t60Var);
    }
}
