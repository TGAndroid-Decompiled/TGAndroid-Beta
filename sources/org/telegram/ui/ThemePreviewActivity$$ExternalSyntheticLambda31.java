package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class ThemePreviewActivity$$ExternalSyntheticLambda31 implements Consumer {
    public final int $r8$classId;
    public final ThemePreviewActivity f$0;

    public ThemePreviewActivity$$ExternalSyntheticLambda31(ThemePreviewActivity themePreviewActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = themePreviewActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkBoostsLevel$1((TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                this.f$0.lambda$applyWallpaperBackground$20((ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
