package org.telegram.ui;

public final class LaunchActivity$12$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public LaunchActivity$12$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity.AnonymousClass12) this.f$0).lambda$onAcceptTerms$0();
                break;
            default:
                ((WallpapersListActivity) this.f$0).lambda$createView$1();
                break;
        }
    }
}
