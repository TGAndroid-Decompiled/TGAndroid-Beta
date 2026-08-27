package org.telegram.ui;

public final class bp implements t60 {

    public final jp f36862a;

    public bp(jp jpVar) {
        this.f36862a = jpVar;
    }

    @Override
    public final void a(u60 u60Var, long j10) {
        jp jpVar = this.f36862a;
        jpVar.Y(jpVar.getMessagesController().getChat(Long.valueOf(j10)), u60Var);
    }
}
