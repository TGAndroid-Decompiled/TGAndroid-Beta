package org.telegram.ui;
public final class og implements q0.a {
    public final int f39182a;
    public final yn f39183b;

    public og(yn ynVar, int i10) {
        this.f39182a = i10;
        this.f39183b = ynVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39182a) {
            case 0:
                Integer num = (Integer) obj;
                yn ynVar = this.f39183b;
                ynVar.getClass();
                if (num.intValue() == 0) {
                    ynVar.f43378j1 = 0;
                    ynVar.Ac(true);
                    ynVar.getMessagesController().markReactionsAsRead(ynVar.R5, ynVar.d());
                    return;
                }
                ynVar.Ac(true);
                ynVar.D(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                yn ynVar2 = this.f39183b;
                ynVar2.getClass();
                if (num2.intValue() == 0) {
                    ynVar2.f43390k1 = 0;
                    ynVar2.zc(true);
                    ynVar2.getMessagesController().markPollVotesAsRead(ynVar2.R5, ynVar2.d());
                    return;
                }
                int i10 = ynVar2.f43390k1 - 1;
                ynVar2.f43390k1 = i10;
                if (i10 <= 0) {
                    ynVar2.getMessagesController().markPollVotesAsRead(ynVar2.R5, ynVar2.d());
                }
                ynVar2.zc(true);
                ynVar2.D(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                yn ynVar3 = this.f39183b;
                ynVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ynVar3.f43309d7 = booleanValue;
                if (!booleanValue) {
                    ynVar3.r8();
                    return;
                }
                return;
        }
    }
}
