package org.telegram.ui;
public final class qg implements q0.a {
    public final int f36738a;
    public final xn f36739b;

    public qg(xn xnVar, int i10) {
        this.f36738a = i10;
        this.f36739b = xnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36738a) {
            case 0:
                Integer num = (Integer) obj;
                xn xnVar = this.f36739b;
                xnVar.getClass();
                if (num.intValue() == 0) {
                    xnVar.l1 = 0;
                    xnVar.Bc(true);
                    xnVar.getMessagesController().markReactionsAsRead(xnVar.T5, xnVar.d());
                    return;
                }
                xnVar.Bc(true);
                xnVar.F(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                xn xnVar2 = this.f36739b;
                xnVar2.getClass();
                if (num2.intValue() == 0) {
                    xnVar2.f39838m1 = 0;
                    xnVar2.Ac(true);
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.T5, xnVar2.d());
                    return;
                }
                int i10 = xnVar2.f39838m1 - 1;
                xnVar2.f39838m1 = i10;
                if (i10 <= 0) {
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.T5, xnVar2.d());
                }
                xnVar2.Ac(true);
                xnVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                xn xnVar3 = this.f36739b;
                xnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xnVar3.f7 = booleanValue;
                if (!booleanValue) {
                    xnVar3.r8();
                    return;
                }
                return;
        }
    }
}
