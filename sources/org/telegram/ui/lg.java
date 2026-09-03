package org.telegram.ui;
public final class lg implements q0.a {
    public final int f35760a;
    public final zn f35761b;

    public lg(zn znVar, int i10) {
        this.f35760a = i10;
        this.f35761b = znVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35760a) {
            case 0:
                Integer num = (Integer) obj;
                zn znVar = this.f35761b;
                znVar.getClass();
                if (num.intValue() == 0) {
                    znVar.f40614i1 = 0;
                    znVar.Bc(true);
                    znVar.getMessagesController().markReactionsAsRead(znVar.Q5, znVar.d());
                    return;
                }
                znVar.Bc(true);
                znVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                zn znVar2 = this.f35761b;
                znVar2.getClass();
                if (num2.intValue() == 0) {
                    znVar2.f40626j1 = 0;
                    znVar2.Ac(true);
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.Q5, znVar2.d());
                    return;
                }
                int i10 = znVar2.f40626j1 - 1;
                znVar2.f40626j1 = i10;
                if (i10 <= 0) {
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.Q5, znVar2.d());
                }
                znVar2.Ac(true);
                znVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                zn znVar3 = this.f35761b;
                znVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                znVar3.f40544c7 = booleanValue;
                if (!booleanValue) {
                    znVar3.r8();
                    return;
                }
                return;
        }
    }
}
