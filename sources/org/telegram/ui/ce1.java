package org.telegram.ui;
public final class ce1 implements Runnable {
    public final int f36452a;
    public final Object f36453b;

    public ce1(Object obj, int i10) {
        this.f36452a = i10;
        this.f36453b = obj;
    }

    @Override
    public final void run() {
        switch (this.f36452a) {
            case 0:
                ((VoIPPermissionActivity) this.f36453b).finish();
                return;
            default:
                ((WallpapersListActivity) this.f36453b).F0(false);
                return;
        }
    }
}
