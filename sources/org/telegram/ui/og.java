package org.telegram.ui;
public final class og implements q0.a {
    public final int f35864a;
    public final xn f35865b;

    public og(xn xnVar, int i10) {
        this.f35864a = i10;
        this.f35865b = xnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35864a) {
            case 0:
                Integer num = (Integer) obj;
                xn xnVar = this.f35865b;
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
                xn xnVar2 = this.f35865b;
                xnVar2.getClass();
                if (num2.intValue() == 0) {
                    xnVar2.f39457m1 = 0;
                    xnVar2.Ac(true);
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.T5, xnVar2.d());
                    return;
                }
                int i10 = xnVar2.f39457m1 - 1;
                xnVar2.f39457m1 = i10;
                if (i10 <= 0) {
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.T5, xnVar2.d());
                }
                xnVar2.Ac(true);
                xnVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                xn xnVar3 = this.f35865b;
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
