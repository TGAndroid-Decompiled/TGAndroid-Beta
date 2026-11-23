package org.telegram.ui.Components;
public final class gc implements Runnable {
    public final int f35400a;
    public final nb f35401b;

    public gc(nb nbVar, int i7) {
        this.f35400a = i7;
        this.f35401b = nbVar;
    }

    @Override
    public final void run() {
        switch (this.f35400a) {
            case 0:
                this.f35401b.performHapticFeedback(3, 2);
                return;
            default:
                this.f35401b.performHapticFeedback(3, 2);
                return;
        }
    }
}
