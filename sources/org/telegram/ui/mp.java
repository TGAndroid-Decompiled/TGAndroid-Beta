package org.telegram.ui;
public final class mp implements i70 {
    public final up f39960a;

    public mp(up upVar) {
        this.f39960a = upVar;
    }

    @Override
    public final void a(j70 j70Var, long j3) {
        up upVar = this.f39960a;
        upVar.Y(upVar.getMessagesController().getChat(Long.valueOf(j3)), j70Var);
    }
}
