package org.telegram.ui;
public final class hg implements q0.a {
    public final int f40004a;
    public final un f40005b;

    public hg(un unVar, int i10) {
        this.f40004a = i10;
        this.f40005b = unVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f40004a) {
            case 0:
                Integer num = (Integer) obj;
                un unVar = this.f40005b;
                unVar.getClass();
                if (num.intValue() == 0) {
                    unVar.f44472x1 = 0;
                    unVar.Oc(true);
                    unVar.getMessagesController().markReactionsAsRead(unVar.f44252f6, unVar.b());
                    return;
                }
                unVar.Oc(true);
                unVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                un unVar2 = this.f40005b;
                unVar2.getClass();
                if (num2.intValue() == 0) {
                    unVar2.f44485y1 = 0;
                    unVar2.Nc(true);
                    unVar2.getMessagesController().markPollVotesAsRead(unVar2.f44252f6, unVar2.b());
                    return;
                }
                int i10 = unVar2.f44485y1 - 1;
                unVar2.f44485y1 = i10;
                if (i10 <= 0) {
                    unVar2.getMessagesController().markPollVotesAsRead(unVar2.f44252f6, unVar2.b());
                }
                unVar2.Nc(true);
                unVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f40005b;
                unVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                unVar3.f44398r7 = booleanValue;
                if (!booleanValue) {
                    unVar3.z8();
                    return;
                }
                return;
        }
    }
}
