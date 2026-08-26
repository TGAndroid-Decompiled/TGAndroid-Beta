package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;

public final class QrActivity$5$$ExternalSyntheticLambda1 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public QrActivity$5$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                QrActivity.AnonymousClass5.lambda$didFindQr$1((BaseFragment) this.f$0, (Long) obj);
                break;
            case 1:
                ((PeerColorActivity.Page) this.f$0).lambda$updateColors$2((View) obj);
                break;
            case 2:
                ((ChannelBoostLayout) this.f$0).lambda$loadStatistic$2((TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 3:
                ((ChannelMonetizationLayout) this.f$0).lambda$initLevel$30((TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 4:
                ((ChannelWallpaperActivity) this.f$0).updateColors((View) obj);
                break;
            case 5:
                ((LaunchActivity$$ExternalSyntheticLambda105) this.f$0).run();
                break;
            case 6:
                ((ProfileActivity2) this.f$0).lambda$setLoadingSpan$2((View) obj);
                break;
            default:
                ((TopicsFragment) this.f$0).lambda$createView$10((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
