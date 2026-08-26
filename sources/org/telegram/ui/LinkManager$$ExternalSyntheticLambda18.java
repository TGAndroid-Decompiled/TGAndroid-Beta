package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

public final class LinkManager$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final LinkManager f$0;

    public LinkManager$$ExternalSyntheticLambda18(LinkManager linkManager, int i) {
        this.$r8$classId = i;
        this.f$0 = linkManager;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = this.f$0;
                if (linkManager.currentRequestId >= 0) {
                    ConnectionsManager.getInstance(linkManager.currentAccount).cancelRequest(linkManager.currentRequestId, true);
                    linkManager.currentRequestId = -1;
                }
                break;
            default:
                this.f$0.done();
                break;
        }
    }
}
