package org.telegram.ui;
public final class ep implements w60 {
    public final np f39151a;

    public ep(np npVar) {
        this.f39151a = npVar;
    }

    @Override
    public final void a(x60 x60Var, long j10) {
        np npVar = this.f39151a;
        npVar.Z(npVar.getMessagesController().getChat(Long.valueOf(j10)), x60Var);
    }
}
