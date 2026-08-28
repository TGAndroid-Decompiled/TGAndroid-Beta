package org.telegram.ui;
public final class fg implements q0.a {
    public final int f38256a;
    public final qn f38257b;

    public fg(qn qnVar, int i9) {
        this.f38256a = i9;
        this.f38257b = qnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38256a) {
            case 0:
                Integer num = (Integer) obj;
                qn qnVar = this.f38257b;
                qnVar.getClass();
                if (num.intValue() == 0) {
                    qnVar.f41930h1 = 0;
                    qnVar.Bc(true);
                    qnVar.getMessagesController().markReactionsAsRead(qnVar.P5, qnVar.b());
                    return;
                }
                qnVar.Bc(true);
                qnVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                qn qnVar2 = this.f38257b;
                qnVar2.getClass();
                if (num2.intValue() == 0) {
                    qnVar2.f41943i1 = 0;
                    qnVar2.Ac(true);
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.P5, qnVar2.b());
                    return;
                }
                int i9 = qnVar2.f41943i1 - 1;
                qnVar2.f41943i1 = i9;
                if (i9 <= 0) {
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.P5, qnVar2.b());
                }
                qnVar2.Ac(true);
                qnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f38257b;
                qnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qnVar3.f41859b7 = booleanValue;
                if (!booleanValue) {
                    qnVar3.r8();
                    return;
                }
                return;
        }
    }
}
