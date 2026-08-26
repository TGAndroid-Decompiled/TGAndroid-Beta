package org.telegram.ui;

public final class LinkManager$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LinkManager f$0;
    public final String f$1;

    public LinkManager$$ExternalSyntheticLambda8(LinkManager linkManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = linkManager;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleSettings$9(this.f$1);
                break;
            default:
                this.f$0.lambda$handleSettings$8(this.f$1);
                break;
        }
    }
}
