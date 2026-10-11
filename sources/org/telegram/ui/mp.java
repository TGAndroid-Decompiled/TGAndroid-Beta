package org.telegram.ui;
public final class mp implements i70 {
    public final up f40046a;

    public mp(up upVar) {
        this.f40046a = upVar;
    }

    @Override
    public final void a(j70 j70Var, long j3) {
        up upVar = this.f40046a;
        upVar.Y(upVar.getMessagesController().getChat(Long.valueOf(j3)), j70Var);
    }
}
