package org.telegram.ui;

public final class hg implements q0.a {

    public final int f38802a;

    public final rn f38803b;

    public hg(rn rnVar, int i10) {
        this.f38802a = i10;
        this.f38803b = rnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f38802a) {
            case 0:
                Integer num = (Integer) obj;
                rn rnVar = this.f38803b;
                rnVar.getClass();
                if (num.intValue() != 0) {
                    rnVar.Bc(true);
                    rnVar.j(num.intValue(), 0, false, 0, true, 0);
                } else {
                    rnVar.f42065h1 = 0;
                    rnVar.Bc(true);
                    rnVar.getMessagesController().markReactionsAsRead(rnVar.P5, rnVar.b());
                }
                break;
            case 1:
                Integer num2 = (Integer) obj;
                rn rnVar2 = this.f38803b;
                rnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = rnVar2.f42078i1 - 1;
                    rnVar2.f42078i1 = i10;
                    if (i10 <= 0) {
                        rnVar2.getMessagesController().markPollVotesAsRead(rnVar2.P5, rnVar2.b());
                    }
                    rnVar2.Ac(true);
                    rnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                } else {
                    rnVar2.f42078i1 = 0;
                    rnVar2.Ac(true);
                    rnVar2.getMessagesController().markPollVotesAsRead(rnVar2.P5, rnVar2.b());
                }
                break;
            default:
                rn rnVar3 = this.f38803b;
                rnVar3.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rnVar3.f41994b7 = zBooleanValue;
                if (!zBooleanValue) {
                    rnVar3.r8();
                }
                break;
        }
    }
}
