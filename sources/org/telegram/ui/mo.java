package org.telegram.ui;

public final class mo implements Runnable {

    public final int f40552a;

    public final xo f40553b;

    public mo(xo xoVar, int i10) {
        this.f40552a = i10;
        this.f40553b = xoVar;
    }

    @Override
    public final void run() {
        switch (this.f40552a) {
            case 0:
                xo xoVar = this.f40553b;
                xoVar.Y = true;
                xoVar.b0();
                break;
            case 1:
                xo xoVar2 = this.f40553b;
                xoVar2.T = xoVar2.getMessagesController().getChat(Long.valueOf(xoVar2.V));
                xoVar2.Y();
                break;
            case 2:
                this.f40553b.a0(false);
                break;
            case 3:
                xo xoVar3 = this.f40553b;
                xoVar3.Y = true;
                if (xoVar3.f44548a.length() > 0) {
                    xoVar3.W(xoVar3.f44548a.getText().toString());
                }
                xoVar3.b0();
                break;
            case 4:
                this.f40553b.Y();
                break;
            default:
                this.f40553b.a0(true);
                break;
        }
    }
}
