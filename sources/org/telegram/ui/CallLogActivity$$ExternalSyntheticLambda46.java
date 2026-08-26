package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public final class CallLogActivity$$ExternalSyntheticLambda46 implements View.OnClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public CallLogActivity$$ExternalSyntheticLambda46(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity.lambda$showCallLinkSheet$36((BottomSheet) this.f$0, (Theme.ResourcesProvider) this.f$1, (ImageView) this.f$2, (ArticleViewer$$ExternalSyntheticLambda20) this.f$3, view);
                break;
            case 1:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$2((String) this.f$1, (String) this.f$2, (String) this.f$3, view);
                break;
            default:
                ((RevenueSharingAdsInfoBottomSheet) this.f$0).lambda$new$0((Utilities.Callback) this.f$3, (Theme.ResourcesProvider) this.f$1, (ImageView) this.f$2, view);
                break;
        }
    }

    public CallLogActivity$$ExternalSyntheticLambda46(RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet, Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider, ImageView imageView) {
        this.$r8$classId = 2;
        this.f$0 = revenueSharingAdsInfoBottomSheet;
        this.f$3 = callback;
        this.f$1 = resourcesProvider;
        this.f$2 = imageView;
    }
}
