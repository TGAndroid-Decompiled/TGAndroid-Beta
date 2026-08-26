package org.telegram.ui.Components;

import android.view.View;

public final class ScrollSlidingTabStrip$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final ScrollSlidingTabStrip f$0;

    public ScrollSlidingTabStrip$$ExternalSyntheticLambda0(ScrollSlidingTabStrip scrollSlidingTabStrip, int i) {
        this.$r8$classId = i;
        this.f$0 = scrollSlidingTabStrip;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addStickerTab$2(view);
                break;
            case 1:
                this.f$0.lambda$addStickerTab$4(view);
                break;
            case 2:
                this.f$0.lambda$addEmojiTab$3(view);
                break;
            case 3:
                this.f$0.lambda$addIconTab$0(view);
                break;
            default:
                this.f$0.lambda$addStickerIconTab$1(view);
                break;
        }
    }
}
