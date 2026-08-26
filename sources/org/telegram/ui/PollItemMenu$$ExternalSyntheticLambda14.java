package org.telegram.ui;

import android.view.View;

public final class PollItemMenu$$ExternalSyntheticLambda14 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PollItemMenu$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((PollItemMenu) this.f$0).lambda$new$0(view);
                break;
            case 1:
                PhotoViewer.CaptionTextView.lambda$new$2((PhotoViewer.CaptionScrollView) this.f$0, view);
                break;
            case 2:
                ((PollCreateActivity) this.f$0).deleteItem(view);
                break;
            case 3:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$15(view);
                break;
            case 4:
                ((ProfileActivity2) this.f$0).lambda$fillItems$1(view);
                break;
            case 5:
                ((ProxyListActivity.TextDetailProxyCell) this.f$0).lambda$new$0(view);
                break;
            case 6:
                ((RevenueSharingAdsInfoBottomSheet) this.f$0).lambda$new$3(view);
                break;
            case 7:
                ((SaveToGallerySettingsActivity) this.f$0).lambda$createView$6(view);
                break;
            case 8:
                ((SearchAdsInfoBottomSheet) this.f$0).lambda$new$2(view);
                break;
            case 9:
                ((SecretMediaViewer) this.f$0).lambda$openMedia$3(view);
                break;
            case 10:
                ((SelectChatUserSheet) this.f$0).lambda$new$2(view);
                break;
            case 11:
                ((TodoItemMenu) this.f$0).lambda$new$0(view);
                break;
            case 12:
                ((TooManyCommunitiesActivity) this.f$0).lambda$createView$2(view);
                break;
            default:
                WebAppDisclaimerAlert.lambda$show$3((WebAppDisclaimerAlert) this.f$0, view);
                break;
        }
    }
}
