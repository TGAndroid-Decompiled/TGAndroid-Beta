package org.telegram.ui;
public final class ep implements w60 {
    public final np f39154a;

    public ep(np npVar) {
        this.f39154a = npVar;
    }

    @Override
    public final void a(x60 x60Var, long j10) {
        np npVar = this.f39154a;
        npVar.Z(npVar.getMessagesController().getChat(Long.valueOf(j10)), x60Var);
    }
}
