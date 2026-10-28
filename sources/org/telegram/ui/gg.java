package org.telegram.ui;
public final class gg implements q0.a {
    public final int f39610a;
    public final wn f39611b;

    public gg(wn wnVar, int i10) {
        this.f39610a = i10;
        this.f39611b = wnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39610a) {
            case 0:
                Integer num = (Integer) obj;
                wn wnVar = this.f39611b;
                wnVar.getClass();
                if (num.intValue() == 0) {
                    wnVar.f45340x1 = 0;
                    wnVar.Sc(true);
                    wnVar.getMessagesController().markReactionsAsRead(wnVar.f45168j6, wnVar.b());
                    return;
                }
                wnVar.Sc(true);
                wnVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                wn wnVar2 = this.f39611b;
                wnVar2.getClass();
                if (num2.intValue() == 0) {
                    wnVar2.f45353y1 = 0;
                    wnVar2.Rc(true);
                    wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.f45168j6, wnVar2.b());
                    return;
                }
                int i10 = wnVar2.f45353y1 - 1;
                wnVar2.f45353y1 = i10;
                if (i10 <= 0) {
                    wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.f45168j6, wnVar2.b());
                }
                wnVar2.Rc(true);
                wnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                wn wnVar3 = this.f39611b;
                wnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wnVar3.f45319v7 = booleanValue;
                if (!booleanValue) {
                    wnVar3.C8();
                    return;
                }
                return;
        }
    }
}
