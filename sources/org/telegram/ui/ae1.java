package org.telegram.ui;
public final class ae1 implements Runnable {
    public final int f35769a;
    public final Object f35770b;

    public ae1(Object obj, int i10) {
        this.f35769a = i10;
        this.f35770b = obj;
    }

    @Override
    public final void run() {
        switch (this.f35769a) {
            case 0:
                ((VoIPPermissionActivity) this.f35770b).finish();
                return;
            default:
                ((WallpapersListActivity) this.f35770b).G0(false);
                return;
        }
    }
}
