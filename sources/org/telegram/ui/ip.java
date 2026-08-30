package org.telegram.ui;
public final class ip implements d70 {
    public final qp f35145a;

    public ip(qp qpVar) {
        this.f35145a = qpVar;
    }

    @Override
    public final void a(e70 e70Var, long j10) {
        qp qpVar = this.f35145a;
        qpVar.Y(qpVar.getMessagesController().getChat(Long.valueOf(j10)), e70Var);
    }
}
