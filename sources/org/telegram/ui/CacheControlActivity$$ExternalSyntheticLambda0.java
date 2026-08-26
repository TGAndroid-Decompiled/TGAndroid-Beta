package org.telegram.ui;

public final class CacheControlActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CacheControlActivity f$0;

    public CacheControlActivity$$ExternalSyntheticLambda0(CacheControlActivity cacheControlActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cacheControlActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFragmentCreate$5();
                break;
            case 1:
                this.f$0.lambda$onFragmentCreate$4();
                break;
            default:
                this.f$0.lambda$loadDialogEntities$8();
                break;
        }
    }
}
