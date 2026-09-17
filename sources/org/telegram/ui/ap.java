package org.telegram.ui;
public final class ap implements Runnable {
    public final int f34528a;
    public final lp f34529b;

    public ap(lp lpVar, int i10) {
        this.f34528a = i10;
        this.f34529b = lpVar;
    }

    @Override
    public final void run() {
        switch (this.f34528a) {
            case 0:
                lp lpVar = this.f34529b;
                lpVar.f38456c0 = true;
                lpVar.b0();
                return;
            case 1:
                lp lpVar2 = this.f34529b;
                lpVar2.X = lpVar2.getMessagesController().getChat(Long.valueOf(lpVar2.Z));
                lpVar2.Y();
                return;
            case 2:
                this.f34529b.a0(false);
                return;
            case 3:
                lp lpVar3 = this.f34529b;
                lpVar3.f38456c0 = true;
                if (lpVar3.f38451a.length() > 0) {
                    lpVar3.W(lpVar3.f38451a.getText().toString());
                }
                lpVar3.b0();
                return;
            case 4:
                this.f34529b.Y();
                return;
            default:
                this.f34529b.a0(true);
                return;
        }
    }
}
