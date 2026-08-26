package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;

public final class SharedMediaLayout$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;

    public SharedMediaLayout$$ExternalSyntheticLambda9(SharedMediaLayout sharedMediaLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedMediaLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.hideFloatingDateView$2();
                break;
            case 1:
                SharedMediaLayout sharedMediaLayout = this.f$0;
                float fDp = AndroidUtilities.dp(14.0f);
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = sharedMediaLayout.topPanelLayout;
                sharedMediaLayout.topLayoutPadding = (int) dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(fDp);
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = sharedMediaLayout.giftsContainer;
                if (anonymousClass13 != null) {
                    anonymousClass13.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f))));
                }
                SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                if (mediaPageArr != null) {
                    for (SharedMediaLayout.MediaPage mediaPage : mediaPageArr) {
                        if (mediaPage != null) {
                            int paddingTop = mediaPage.listView.getPaddingTop();
                            SharedMediaLayout.AnonymousClass19 anonymousClass19 = mediaPage.listView;
                            int paddingLeft = anonymousClass19.getPaddingLeft();
                            int pagePaddingTop = sharedMediaLayout.getPagePaddingTop(mediaPage.selectedType);
                            int paddingRight = mediaPage.listView.getPaddingRight();
                            SharedMediaLayout.AnonymousClass19 anonymousClass110 = mediaPage.listView;
                            int pagePaddingBottom = sharedMediaLayout.getPagePaddingBottom(sharedMediaLayout.isStoriesView());
                            anonymousClass110.hintPaddingBottom = pagePaddingBottom;
                            anonymousClass19.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                            AndroidUtilities.doOnLayout(mediaPage.listView, new OAuthSheet$$ExternalSyntheticLambda17(mediaPage, paddingTop - mediaPage.listView.getPaddingTop(), 5));
                        }
                    }
                }
                break;
            default:
                SharedMediaLayout sharedMediaLayout2 = this.f$0;
                sharedMediaLayout2.showActionMode$1(false);
                sharedMediaLayout2.actionBar.closeSearchField(true);
                sharedMediaLayout2.cantDeleteMessagesCount = 0;
                break;
        }
    }
}
