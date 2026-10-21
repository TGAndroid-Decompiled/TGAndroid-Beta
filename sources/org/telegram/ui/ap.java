package org.telegram.ui;
public final class ap implements r60 {
    public final ip f35401a;

    public ap(ip ipVar) {
        this.f35401a = ipVar;
    }

    @Override
    public final void a(s60 s60Var, long j10) {
        ip ipVar = this.f35401a;
        ipVar.Y(ipVar.getMessagesController().getChat(Long.valueOf(j10)), s60Var);
    }
}
