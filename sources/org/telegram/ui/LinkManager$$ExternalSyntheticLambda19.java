package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class LinkManager$$ExternalSyntheticLambda19 implements Utilities.Callback {
    public final int $r8$classId;
    public final Runnable f$0;

    public LinkManager$$ExternalSyntheticLambda19(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                LinkManager.lambda$handleInvoiceSlug$14(this.f$0, (String) obj);
                break;
            default:
                LaunchActivity.lambda$runLinkRequest$56(this.f$0, (String) obj);
                break;
        }
    }
}
