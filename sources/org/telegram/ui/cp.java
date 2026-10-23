package org.telegram.ui;
public final class cp implements v60 {
    public final kp f36413a;

    public cp(kp kpVar) {
        this.f36413a = kpVar;
    }

    @Override
    public final void a(w60 w60Var, long j10) {
        kp kpVar = this.f36413a;
        kpVar.Y(kpVar.getMessagesController().getChat(Long.valueOf(j10)), w60Var);
    }
}
