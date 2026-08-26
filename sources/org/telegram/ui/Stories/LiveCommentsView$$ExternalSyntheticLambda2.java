package org.telegram.ui.Stories;

import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;

public final class LiveCommentsView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass10 f$0;

    public LiveCommentsView$$ExternalSyntheticLambda2(PeerStoriesView.AnonymousClass10 anonymousClass10, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass10;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = this.f$0;
                if (anonymousClass10.inputCall != null && !anonymousClass10.polling) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass10.pollStarsRunnable);
                    anonymousClass10.polling = true;
                    TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
                    getgroupcallstars.call = anonymousClass10.inputCall;
                    ConnectionsManager.getInstance(anonymousClass10.currentAccount).sendRequestTyped(getgroupcallstars, new AiTonesController$$ExternalSyntheticLambda0(), new BotBiometry$$ExternalSyntheticLambda10(9, anonymousClass10, getgroupcallstars));
                    break;
                }
                break;
            case 1:
                this.f$0.cancelStars();
                break;
            case 2:
                this.f$0.lambda$new$12$2$1();
                break;
            default:
                PeerStoriesView.AnonymousClass10 anonymousClass11 = this.f$0;
                anonymousClass11.adapter.update(true);
                anonymousClass11.topAdapter.update(true);
                break;
        }
    }
}
