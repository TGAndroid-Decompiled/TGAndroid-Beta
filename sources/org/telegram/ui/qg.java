package org.telegram.ui;
public final class qg implements q0.a {
    public final int f36927a;
    public final zn f36928b;

    public qg(zn znVar, int i10) {
        this.f36927a = i10;
        this.f36928b = znVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36927a) {
            case 0:
                Integer num = (Integer) obj;
                zn znVar = this.f36928b;
                znVar.getClass();
                if (num.intValue() == 0) {
                    znVar.l1 = 0;
                    znVar.Bc(true);
                    znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                    return;
                }
                znVar.Bc(true);
                znVar.E(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                zn znVar2 = this.f36928b;
                znVar2.getClass();
                if (num2.intValue() == 0) {
                    znVar2.f40412m1 = 0;
                    znVar2.Ac(true);
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.T5, znVar2.d());
                    return;
                }
                int i10 = znVar2.f40412m1 - 1;
                znVar2.f40412m1 = i10;
                if (i10 <= 0) {
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.T5, znVar2.d());
                }
                znVar2.Ac(true);
                znVar2.E(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                zn znVar3 = this.f36928b;
                znVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                znVar3.f7 = booleanValue;
                if (!booleanValue) {
                    znVar3.r8();
                    return;
                }
                return;
        }
    }
}
