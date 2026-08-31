package org.telegram.ui;
public final class ip implements e70 {
    public final rp f37903a;

    public ip(rp rpVar) {
        this.f37903a = rpVar;
    }

    @Override
    public final void a(f70 f70Var, long j10) {
        rp rpVar = this.f37903a;
        rpVar.Y(rpVar.getMessagesController().getChat(Long.valueOf(j10)), f70Var);
    }
}
