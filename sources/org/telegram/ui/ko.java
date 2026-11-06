package org.telegram.ui;
public final class ko implements c50 {
    public final so f47215a;

    public ko(so soVar) {
        this.f47215a = soVar;
    }

    @Override
    public final void e(d50 d50Var, long j3) {
        so soVar = this.f47215a;
        soVar.d0(soVar.getMessagesController().M0(Long.valueOf(j3)), d50Var);
    }
}
