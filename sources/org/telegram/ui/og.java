package org.telegram.ui;
public final class og implements q0.a {
    public final int f39187a;
    public final yn f39188b;

    public og(yn ynVar, int i10) {
        this.f39187a = i10;
        this.f39188b = ynVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39187a) {
            case 0:
                Integer num = (Integer) obj;
                yn ynVar = this.f39188b;
                ynVar.getClass();
                if (num.intValue() == 0) {
                    ynVar.f43385j1 = 0;
                    ynVar.Ac(true);
                    ynVar.getMessagesController().markReactionsAsRead(ynVar.R5, ynVar.d());
                    return;
                }
                ynVar.Ac(true);
                ynVar.D(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                yn ynVar2 = this.f39188b;
                ynVar2.getClass();
                if (num2.intValue() == 0) {
                    ynVar2.f43397k1 = 0;
                    ynVar2.zc(true);
                    ynVar2.getMessagesController().markPollVotesAsRead(ynVar2.R5, ynVar2.d());
                    return;
                }
                int i10 = ynVar2.f43397k1 - 1;
                ynVar2.f43397k1 = i10;
                if (i10 <= 0) {
                    ynVar2.getMessagesController().markPollVotesAsRead(ynVar2.R5, ynVar2.d());
                }
                ynVar2.zc(true);
                ynVar2.D(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                yn ynVar3 = this.f39188b;
                ynVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ynVar3.f43316d7 = booleanValue;
                if (!booleanValue) {
                    ynVar3.r8();
                    return;
                }
                return;
        }
    }
}
