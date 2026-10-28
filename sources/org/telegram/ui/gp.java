package org.telegram.ui;
public final class gp implements y60 {
    public final pp f39664a;

    public gp(pp ppVar) {
        this.f39664a = ppVar;
    }

    @Override
    public final void a(z60 z60Var, long j10) {
        pp ppVar = this.f39664a;
        ppVar.Z(ppVar.getMessagesController().getChat(Long.valueOf(j10)), z60Var);
    }
}
