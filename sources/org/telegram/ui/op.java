package org.telegram.ui;
public final class op implements m70 {
    public final wp f36395a;

    public op(wp wpVar) {
        this.f36395a = wpVar;
    }

    @Override
    public final void a(n70 n70Var, long j3) {
        wp wpVar = this.f36395a;
        wpVar.Y(wpVar.getMessagesController().getChat(Long.valueOf(j3)), n70Var);
    }
}
