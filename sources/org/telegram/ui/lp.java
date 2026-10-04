package org.telegram.ui;
public final class lp implements j70 {
    public final tp f38319a;

    public lp(tp tpVar) {
        this.f38319a = tpVar;
    }

    @Override
    public final void a(k70 k70Var, long j3) {
        tp tpVar = this.f38319a;
        tpVar.X(tpVar.getMessagesController().getChat(Long.valueOf(j3)), k70Var);
    }
}
