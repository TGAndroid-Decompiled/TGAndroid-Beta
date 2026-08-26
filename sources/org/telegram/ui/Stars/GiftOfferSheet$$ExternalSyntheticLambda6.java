package org.telegram.ui.Stars;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class GiftOfferSheet$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final int $r8$classId = 1;
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final Object f$2;
    public final Theme.ResourcesProvider f$3;
    public final long f$4;

    public GiftOfferSheet$$ExternalSyntheticLambda6(int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, Theme.ResourcesProvider resourcesProvider) {
        this.f$1 = i;
        this.f$0 = buttonWithCounterView;
        this.f$2 = bottomSheet;
        this.f$4 = j;
        this.f$3 = resourcesProvider;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                int i = this.f$1;
                Context context = (Context) this.f$2;
                ((GiftOfferSheet) this.f$0).lambda$new$5(i, this.f$4, context, this.f$3);
                break;
            default:
                AlertsCreator.lambda$showCallsForbidden$261(this.f$1, (ButtonWithCounterView) this.f$0, (BottomSheet) this.f$2, this.f$4, this.f$3, view);
                break;
        }
    }

    public GiftOfferSheet$$ExternalSyntheticLambda6(GiftOfferSheet giftOfferSheet, int i, Context context, Theme.ResourcesProvider resourcesProvider, long j) {
        this.f$0 = giftOfferSheet;
        this.f$1 = i;
        this.f$2 = context;
        this.f$3 = resourcesProvider;
        this.f$4 = j;
    }
}
