package org.telegram.ui;
public final class qg implements q0.a {
    public final int f41327a;
    public final eo f41328b;

    public qg(eo eoVar, int i10) {
        this.f41327a = i10;
        this.f41328b = eoVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41327a) {
            case 0:
                Integer num = (Integer) obj;
                eo eoVar = this.f41328b;
                eoVar.getClass();
                if (num.intValue() == 0) {
                    eoVar.l1 = 0;
                    eoVar.Fc(true);
                    eoVar.getMessagesController().markReactionsAsRead(eoVar.T5, eoVar.d());
                    return;
                }
                eoVar.Fc(true);
                eoVar.F(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                eo eoVar2 = this.f41328b;
                eoVar2.getClass();
                if (num2.intValue() == 0) {
                    eoVar2.f37343m1 = 0;
                    eoVar2.Ec(true);
                    eoVar2.getMessagesController().markPollVotesAsRead(eoVar2.T5, eoVar2.d());
                    return;
                }
                int i10 = eoVar2.f37343m1 - 1;
                eoVar2.f37343m1 = i10;
                if (i10 <= 0) {
                    eoVar2.getMessagesController().markPollVotesAsRead(eoVar2.T5, eoVar2.d());
                }
                eoVar2.Ec(true);
                eoVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                eo eoVar3 = this.f41328b;
                eoVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eoVar3.f7 = booleanValue;
                if (!booleanValue) {
                    eoVar3.v8();
                    return;
                }
                return;
        }
    }
}
