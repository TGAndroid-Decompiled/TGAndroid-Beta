package org.telegram.ui;
public final class ko implements c50 {
    public final so f47220a;

    public ko(so soVar) {
        this.f47220a = soVar;
    }

    @Override
    public final void e(d50 d50Var, long j3) {
        so soVar = this.f47220a;
        soVar.d0(soVar.getMessagesController().M0(Long.valueOf(j3)), d50Var);
    }
}
