package org.telegram.ui;
public final class mg implements q0.a {
    public final int f39903a;
    public final zn f39904b;

    public mg(zn znVar, int i10) {
        this.f39903a = i10;
        this.f39904b = znVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39903a) {
            case 0:
                Integer num = (Integer) obj;
                zn znVar = this.f39904b;
                znVar.getClass();
                if (num.intValue() == 0) {
                    znVar.l1 = 0;
                    znVar.Fc(true);
                    znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                    return;
                }
                znVar.Fc(true);
                znVar.F(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                zn znVar2 = this.f39904b;
                znVar2.getClass();
                if (num2.intValue() == 0) {
                    znVar2.f44850m1 = 0;
                    znVar2.Ec(true);
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.T5, znVar2.d());
                    return;
                }
                int i10 = znVar2.f44850m1 - 1;
                znVar2.f44850m1 = i10;
                if (i10 <= 0) {
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.T5, znVar2.d());
                }
                znVar2.Ec(true);
                znVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                zn znVar3 = this.f39904b;
                znVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                znVar3.f7 = booleanValue;
                if (!booleanValue) {
                    znVar3.v8();
                    return;
                }
                return;
        }
    }
}
