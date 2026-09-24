package org.telegram.ui;
public final class ng implements q0.a {
    public final int f35861a;
    public final wn f35862b;

    public ng(wn wnVar, int i10) {
        this.f35861a = i10;
        this.f35862b = wnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f35861a) {
            case 0:
                Integer num = (Integer) obj;
                wn wnVar = this.f35862b;
                wnVar.getClass();
                if (num.intValue() == 0) {
                    wnVar.l1 = 0;
                    wnVar.Bc(true);
                    wnVar.getMessagesController().markReactionsAsRead(wnVar.T5, wnVar.d());
                    return;
                }
                wnVar.Bc(true);
                wnVar.F(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                wn wnVar2 = this.f35862b;
                wnVar2.getClass();
                if (num2.intValue() == 0) {
                    wnVar2.f39541m1 = 0;
                    wnVar2.Ac(true);
                    wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.T5, wnVar2.d());
                    return;
                }
                int i10 = wnVar2.f39541m1 - 1;
                wnVar2.f39541m1 = i10;
                if (i10 <= 0) {
                    wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.T5, wnVar2.d());
                }
                wnVar2.Ac(true);
                wnVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                wn wnVar3 = this.f35862b;
                wnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wnVar3.f7 = booleanValue;
                if (!booleanValue) {
                    wnVar3.r8();
                    return;
                }
                return;
        }
    }
}
