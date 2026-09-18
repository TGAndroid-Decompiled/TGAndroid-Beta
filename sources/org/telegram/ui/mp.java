package org.telegram.ui;
public final class mp implements k70 {
    public final up f35706a;

    public mp(up upVar) {
        this.f35706a = upVar;
    }

    @Override
    public final void a(l70 l70Var, long j3) {
        up upVar = this.f35706a;
        upVar.Y(upVar.getMessagesController().getChat(Long.valueOf(j3)), l70Var);
    }
}
