package org.telegram.ui;

public final class LinkManager$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final LinkManager f$0;

    public LinkManager$$ExternalSyntheticLambda5(LinkManager linkManager, int i) {
        this.$r8$classId = i;
        this.f$0 = linkManager;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.cancel();
                break;
            default:
                this.f$0.lambda$handleInvoiceSlug$13();
                break;
        }
    }
}
