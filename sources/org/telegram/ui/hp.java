package org.telegram.ui;
public final class hp implements a60 {
    public final qp f37846a;

    public hp(qp qpVar) {
        this.f37846a = qpVar;
    }

    @Override
    public final void f(b60 b60Var, long j10) {
        qp qpVar = this.f37846a;
        qpVar.d0(qpVar.getMessagesController().L0(Long.valueOf(j10)), b60Var);
    }
}
