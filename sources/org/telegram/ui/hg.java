package org.telegram.ui;
public final class hg implements q0.a {
    public final int f40001a;
    public final un f40002b;

    public hg(un unVar, int i10) {
        this.f40001a = i10;
        this.f40002b = unVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f40001a) {
            case 0:
                Integer num = (Integer) obj;
                un unVar = this.f40002b;
                unVar.getClass();
                if (num.intValue() == 0) {
                    unVar.f44469x1 = 0;
                    unVar.Oc(true);
                    unVar.getMessagesController().markReactionsAsRead(unVar.f44249f6, unVar.b());
                    return;
                }
                unVar.Oc(true);
                unVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                un unVar2 = this.f40002b;
                unVar2.getClass();
                if (num2.intValue() == 0) {
                    unVar2.f44482y1 = 0;
                    unVar2.Nc(true);
                    unVar2.getMessagesController().markPollVotesAsRead(unVar2.f44249f6, unVar2.b());
                    return;
                }
                int i10 = unVar2.f44482y1 - 1;
                unVar2.f44482y1 = i10;
                if (i10 <= 0) {
                    unVar2.getMessagesController().markPollVotesAsRead(unVar2.f44249f6, unVar2.b());
                }
                unVar2.Nc(true);
                unVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f40002b;
                unVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                unVar3.f44395r7 = booleanValue;
                if (!booleanValue) {
                    unVar3.z8();
                    return;
                }
                return;
        }
    }
}
