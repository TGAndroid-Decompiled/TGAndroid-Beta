package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37824a;
    public boolean f37825b;
    public final Object f37826c;

    public k4(Object obj, int i10) {
        this.f37824a = i10;
        this.f37826c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37824a) {
            case 0:
                this.f37825b = false;
                ((l4) this.f37826c).getClass();
                return;
            default:
                if (!this.f37825b) {
                    this.f37825b = true;
                    ((yn) this.f37826c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
