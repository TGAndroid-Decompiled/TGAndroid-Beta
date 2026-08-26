package org.telegram.ui.Components;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;

public final class TranslateAlert3$$ExternalSyntheticLambda7 implements LinkSpanDrawable.LinksTextView.OnLinkPress {
    public final int $r8$classId;
    public final BottomSheetWithRecyclerListView f$0;

    public TranslateAlert3$$ExternalSyntheticLambda7(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
    }

    @Override
    public final void run(ClickableSpan clickableSpan) {
        switch (this.$r8$classId) {
            case 0:
                ((TranslateAlert3) this.f$0).onLinkPressed(clickableSpan);
                break;
            default:
                ((PremiumPreviewBottomSheet) this.f$0).lambda$setTitle$6();
                break;
        }
    }
}
