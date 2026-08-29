package org.telegram.ui;
public final class dg implements q0.a {
    public final int f37538a;
    public final tn f37539b;

    public dg(tn tnVar, int i10) {
        this.f37538a = i10;
        this.f37539b = tnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37538a) {
            case 0:
                Integer num = (Integer) obj;
                tn tnVar = this.f37539b;
                tnVar.getClass();
                if (num.intValue() == 0) {
                    tnVar.f42827h1 = 0;
                    tnVar.Bc(true);
                    tnVar.getMessagesController().markReactionsAsRead(tnVar.P5, tnVar.b());
                    return;
                }
                tnVar.Bc(true);
                tnVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                tn tnVar2 = this.f37539b;
                tnVar2.getClass();
                if (num2.intValue() == 0) {
                    tnVar2.f42839i1 = 0;
                    tnVar2.Ac(true);
                    tnVar2.getMessagesController().markPollVotesAsRead(tnVar2.P5, tnVar2.b());
                    return;
                }
                int i10 = tnVar2.f42839i1 - 1;
                tnVar2.f42839i1 = i10;
                if (i10 <= 0) {
                    tnVar2.getMessagesController().markPollVotesAsRead(tnVar2.P5, tnVar2.b());
                }
                tnVar2.Ac(true);
                tnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                tn tnVar3 = this.f37539b;
                tnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tnVar3.f42757b7 = booleanValue;
                if (!booleanValue) {
                    tnVar3.r8();
                    return;
                }
                return;
        }
    }
}
