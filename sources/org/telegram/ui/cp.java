package org.telegram.ui;
public final class cp implements Runnable {
    public final int f34752a;
    public final np f34753b;

    public cp(np npVar, int i10) {
        this.f34752a = i10;
        this.f34753b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f34752a) {
            case 0:
                np npVar = this.f34753b;
                npVar.f38437c0 = true;
                npVar.b0();
                return;
            case 1:
                np npVar2 = this.f34753b;
                npVar2.X = npVar2.getMessagesController().getChat(Long.valueOf(npVar2.Z));
                npVar2.Y();
                return;
            case 2:
                this.f34753b.a0(false);
                return;
            case 3:
                np npVar3 = this.f34753b;
                npVar3.f38437c0 = true;
                if (npVar3.f38432a.length() > 0) {
                    npVar3.W(npVar3.f38432a.getText().toString());
                }
                npVar3.b0();
                return;
            case 4:
                this.f34753b.Y();
                return;
            default:
                this.f34753b.a0(true);
                return;
        }
    }
}
