package org.telegram.ui;
public final class gg implements q0.a {
    public final int f37237a;
    public final sn f37238b;

    public gg(sn snVar, int i10) {
        this.f37237a = i10;
        this.f37238b = snVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37237a) {
            case 0:
                Integer num = (Integer) obj;
                sn snVar = this.f37238b;
                snVar.getClass();
                if (num.intValue() == 0) {
                    snVar.l1 = 0;
                    snVar.Fc(true);
                    snVar.getMessagesController().markReactionsAsRead(snVar.T5, snVar.d());
                    return;
                }
                snVar.Fc(true);
                snVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                sn snVar2 = this.f37238b;
                snVar2.getClass();
                if (num2.intValue() == 0) {
                    snVar2.f41293m1 = 0;
                    snVar2.Ec(true);
                    snVar2.getMessagesController().markPollVotesAsRead(snVar2.T5, snVar2.d());
                    return;
                }
                int i10 = snVar2.f41293m1 - 1;
                snVar2.f41293m1 = i10;
                if (i10 <= 0) {
                    snVar2.getMessagesController().markPollVotesAsRead(snVar2.T5, snVar2.d());
                }
                snVar2.Ec(true);
                snVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                sn snVar3 = this.f37238b;
                snVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                snVar3.f7 = booleanValue;
                if (!booleanValue) {
                    snVar3.v8();
                    return;
                }
                return;
        }
    }
}
