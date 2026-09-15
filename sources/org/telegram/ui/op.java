package org.telegram.ui;
public final class op implements k70 {
    public final wp f36316a;

    public op(wp wpVar) {
        this.f36316a = wpVar;
    }

    @Override
    public final void a(l70 l70Var, long j3) {
        wp wpVar = this.f36316a;
        wpVar.Y(wpVar.getMessagesController().getChat(Long.valueOf(j3)), l70Var);
    }
}
