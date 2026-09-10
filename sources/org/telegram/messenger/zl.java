package org.telegram.messenger;
public final class zl implements Runnable {
    public final int f17189a;
    public final UnconfirmedAuthController f17190b;

    public zl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17189a = i10;
        this.f17190b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17189a) {
            case 0:
                UnconfirmedAuthController.h(this.f17190b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17190b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17190b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17190b);
                return;
        }
    }
}
