package org.telegram.ui;
public final class qg implements q0.a {
    public final int f39866a;
    public final co f39867b;

    public qg(co coVar, int i10) {
        this.f39866a = i10;
        this.f39867b = coVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39866a) {
            case 0:
                Integer num = (Integer) obj;
                co coVar = this.f39867b;
                coVar.getClass();
                if (num.intValue() == 0) {
                    coVar.l1 = 0;
                    coVar.Bc(true);
                    coVar.getMessagesController().markReactionsAsRead(coVar.T5, coVar.d());
                    return;
                }
                coVar.Bc(true);
                coVar.F(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                co coVar2 = this.f39867b;
                coVar2.getClass();
                if (num2.intValue() == 0) {
                    coVar2.f35334m1 = 0;
                    coVar2.Ac(true);
                    coVar2.getMessagesController().markPollVotesAsRead(coVar2.T5, coVar2.d());
                    return;
                }
                int i10 = coVar2.f35334m1 - 1;
                coVar2.f35334m1 = i10;
                if (i10 <= 0) {
                    coVar2.getMessagesController().markPollVotesAsRead(coVar2.T5, coVar2.d());
                }
                coVar2.Ac(true);
                coVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                co coVar3 = this.f39867b;
                coVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                coVar3.f7 = booleanValue;
                if (!booleanValue) {
                    coVar3.r8();
                    return;
                }
                return;
        }
    }
}
