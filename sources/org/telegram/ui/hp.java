package org.telegram.ui;
public final class hp implements b60 {
    public final qp f38010a;

    public hp(qp qpVar) {
        this.f38010a = qpVar;
    }

    @Override
    public final void f(c60 c60Var, long j10) {
        qp qpVar = this.f38010a;
        qpVar.c0(qpVar.getMessagesController().L0(Long.valueOf(j10)), c60Var);
    }
}
