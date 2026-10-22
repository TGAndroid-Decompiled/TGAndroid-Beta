package org.telegram.ui;
public final class eg implements q0.a {
    public final int f36656a;
    public final qn f36657b;

    public eg(qn qnVar, int i10) {
        this.f36656a = i10;
        this.f36657b = qnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36656a) {
            case 0:
                Integer num = (Integer) obj;
                qn qnVar = this.f36657b;
                qnVar.getClass();
                if (num.intValue() == 0) {
                    qnVar.l1 = 0;
                    qnVar.Gc(true);
                    qnVar.getMessagesController().markReactionsAsRead(qnVar.T5, qnVar.d());
                    return;
                }
                qnVar.Gc(true);
                qnVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                qn qnVar2 = this.f36657b;
                qnVar2.getClass();
                if (num2.intValue() == 0) {
                    qnVar2.f40764m1 = 0;
                    qnVar2.Fc(true);
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.T5, qnVar2.d());
                    return;
                }
                int i10 = qnVar2.f40764m1 - 1;
                qnVar2.f40764m1 = i10;
                if (i10 <= 0) {
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.T5, qnVar2.d());
                }
                qnVar2.Fc(true);
                qnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f36657b;
                qnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qnVar3.f7 = booleanValue;
                if (!booleanValue) {
                    qnVar3.v8();
                    return;
                }
                return;
        }
    }
}
