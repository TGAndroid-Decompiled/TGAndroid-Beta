package org.telegram.ui;
public final class ap implements Runnable {
    public final int f35915a;
    public final lp f35916b;

    public ap(lp lpVar, int i10) {
        this.f35915a = i10;
        this.f35916b = lpVar;
    }

    @Override
    public final void run() {
        switch (this.f35915a) {
            case 0:
                lp lpVar = this.f35916b;
                lpVar.f39805c0 = true;
                lpVar.b0();
                return;
            case 1:
                lp lpVar2 = this.f35916b;
                lpVar2.X = lpVar2.getMessagesController().getChat(Long.valueOf(lpVar2.Z));
                lpVar2.Y();
                return;
            case 2:
                this.f35916b.a0(false);
                return;
            case 3:
                lp lpVar3 = this.f35916b;
                lpVar3.f39805c0 = true;
                if (lpVar3.f39800a.length() > 0) {
                    lpVar3.W(lpVar3.f39800a.getText().toString());
                }
                lpVar3.b0();
                return;
            case 4:
                this.f35916b.Y();
                return;
            default:
                this.f35916b.a0(true);
                return;
        }
    }
}
