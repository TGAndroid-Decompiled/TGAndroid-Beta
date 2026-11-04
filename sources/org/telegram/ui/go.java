package org.telegram.ui;
public final class go implements x40 {
    public final qo f45684a;

    public go(qo qoVar) {
        this.f45684a = qoVar;
    }

    @Override
    public final void d(y40 y40Var, long j10) {
        qo qoVar = this.f45684a;
        qoVar.d0(qoVar.getMessagesController().M0(Long.valueOf(j10)), y40Var);
    }
}
