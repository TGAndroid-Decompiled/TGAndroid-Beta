package org.telegram.ui;
public final class jg implements q0.a {
    public final int f38045a;
    public final xn f38046b;

    public jg(xn xnVar, int i10) {
        this.f38045a = i10;
        this.f38046b = xnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38045a) {
            case 0:
                Integer num = (Integer) obj;
                xn xnVar = this.f38046b;
                xnVar.getClass();
                if (num.intValue() == 0) {
                    xnVar.f43195i1 = 0;
                    xnVar.Bc(true);
                    xnVar.getMessagesController().markReactionsAsRead(xnVar.Q5, xnVar.b());
                    return;
                }
                xnVar.Bc(true);
                xnVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                xn xnVar2 = this.f38046b;
                xnVar2.getClass();
                if (num2.intValue() == 0) {
                    xnVar2.f43207j1 = 0;
                    xnVar2.Ac(true);
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.Q5, xnVar2.b());
                    return;
                }
                int i10 = xnVar2.f43207j1 - 1;
                xnVar2.f43207j1 = i10;
                if (i10 <= 0) {
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.Q5, xnVar2.b());
                }
                xnVar2.Ac(true);
                xnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                xn xnVar3 = this.f38046b;
                xnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xnVar3.f43124c7 = booleanValue;
                if (!booleanValue) {
                    xnVar3.r8();
                    return;
                }
                return;
        }
    }
}
