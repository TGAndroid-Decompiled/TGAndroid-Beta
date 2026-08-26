package org.telegram.ui.Components.Premium;

import android.view.KeyEvent;
import android.view.View;
import java.io.FileNotFoundException;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.PremiumPreviewFragment;

public final class LimitReachedBottomSheet$5$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public LimitReachedBottomSheet$5$$ExternalSyntheticLambda1(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void onClick(View view) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((LinkSpanDrawable.LinksTextView) this.f$0).performClick();
                break;
            default:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = (PremiumPreviewBottomSheet) this.f$0;
                premiumPreviewBottomSheet.getClass();
                PremiumPreviewFragment.sentPremiumButtonClick();
                PremiumPreviewFragment.buyPremium(premiumPreviewBottomSheet.fragment, "profile");
                break;
        }
    }
}
