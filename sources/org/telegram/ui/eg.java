package org.telegram.ui;
public final class eg implements q0.a {
    public final int f36655a;
    public final qn f36656b;

    public eg(qn qnVar, int i10) {
        this.f36655a = i10;
        this.f36656b = qnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36655a) {
            case 0:
                Integer num = (Integer) obj;
                qn qnVar = this.f36656b;
                qnVar.getClass();
                if (num.intValue() == 0) {
                    qnVar.l1 = 0;
                    qnVar.Fc(true);
                    qnVar.getMessagesController().markReactionsAsRead(qnVar.T5, qnVar.d());
                    return;
                }
                qnVar.Fc(true);
                qnVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                qn qnVar2 = this.f36656b;
                qnVar2.getClass();
                if (num2.intValue() == 0) {
                    qnVar2.f40763m1 = 0;
                    qnVar2.Ec(true);
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.T5, qnVar2.d());
                    return;
                }
                int i10 = qnVar2.f40763m1 - 1;
                qnVar2.f40763m1 = i10;
                if (i10 <= 0) {
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.T5, qnVar2.d());
                }
                qnVar2.Ec(true);
                qnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f36656b;
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
