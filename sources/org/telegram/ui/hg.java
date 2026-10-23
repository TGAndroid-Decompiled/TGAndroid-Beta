package org.telegram.ui;
public final class hg implements q0.a {
    public final int f37843a;
    public final sn f37844b;

    public hg(sn snVar, int i10) {
        this.f37843a = i10;
        this.f37844b = snVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37843a) {
            case 0:
                Integer num = (Integer) obj;
                sn snVar = this.f37844b;
                snVar.getClass();
                if (num.intValue() == 0) {
                    snVar.f41738x1 = 0;
                    snVar.Ic(true);
                    snVar.getMessagesController().markReactionsAsRead(snVar.f41519f6, snVar.d());
                    return;
                }
                snVar.Ic(true);
                snVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                sn snVar2 = this.f37844b;
                snVar2.getClass();
                if (num2.intValue() == 0) {
                    snVar2.f41752y1 = 0;
                    snVar2.Hc(true);
                    snVar2.getMessagesController().markPollVotesAsRead(snVar2.f41519f6, snVar2.d());
                    return;
                }
                int i10 = snVar2.f41752y1 - 1;
                snVar2.f41752y1 = i10;
                if (i10 <= 0) {
                    snVar2.getMessagesController().markPollVotesAsRead(snVar2.f41519f6, snVar2.d());
                }
                snVar2.Hc(true);
                snVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                sn snVar3 = this.f37844b;
                snVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                snVar3.f41665r7 = booleanValue;
                if (!booleanValue) {
                    snVar3.v8();
                    return;
                }
                return;
        }
    }
}
