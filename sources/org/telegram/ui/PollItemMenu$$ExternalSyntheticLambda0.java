package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.ActionBar.BaseFragment;

public final class PollItemMenu$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public PollItemMenu$$ExternalSyntheticLambda0(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PollItemMenu) this.f$0).lambda$dismiss$16(this.f$1);
                break;
            case 1:
                ((ChatActivity.ChatActivityEnterViewDelegate) this.f$0).lambda$onStickersExpandedChange$3(this.f$1);
                break;
            case 2:
                ((ProfileActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$4(this.f$1);
                break;
            case 3:
                ((QrActivity.ThemeListViewController) this.f$0).lambda$setupLightDarkTheme$3(this.f$1);
                break;
            case 4:
                ChannelMonetizationLayout.lambda$makeLearnSheet$40((Context) this.f$0, this.f$1);
                break;
            case 5:
                ((ChatEditActivity) this.f$0).lambda$createView$16(this.f$1);
                break;
            case 6:
                ((FilterChatlistActivity) this.f$0).lambda$updateHeaderCell$5(this.f$1);
                break;
            case 7:
                ((LoginActivity) this.f$0).lambda$showProxyButton$35(this.f$1);
                break;
            case 8:
                ((PhotoViewer) this.f$0).lambda$updateResetButtonVisibility$106(this.f$1);
                break;
            case 9:
                PremiumPreviewFragment.lambda$buyPremium$9((BaseFragment) this.f$0, this.f$1);
                break;
            case 10:
                ((ProfileActivity) this.f$0).lambda$updateListAnimated$118(this.f$1);
                break;
            default:
                ((TodoItemMenu) this.f$0).lambda$dismiss$15(this.f$1);
                break;
        }
    }
}
