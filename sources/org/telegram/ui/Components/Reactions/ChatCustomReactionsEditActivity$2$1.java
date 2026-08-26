package org.telegram.ui.Components.Reactions;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.IntroActivity;

public final class ChatCustomReactionsEditActivity$2$1 extends AdjustPanLayoutHelper {
    public final IntroActivity.AnonymousClass1 this$1;

    public ChatCustomReactionsEditActivity$2$1(IntroActivity.AnonymousClass1 anonymousClass1, IntroActivity.AnonymousClass1 anonymousClass2) {
        super(anonymousClass2);
        this.this$1 = anonymousClass1;
    }

    @Override
    public final boolean heightAnimationEnabled() {
        IntroActivity.AnonymousClass1 anonymousClass1 = this.this$1;
        INavigationLayout parentLayout = ((ChatCustomReactionsEditActivity) anonymousClass1.this$0).getParentLayout();
        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) anonymousClass1.this$0;
        return (((BaseFragment) chatCustomReactionsEditActivity).inPreviewMode || AndroidUtilities.isTablet() || ((BaseFragment) chatCustomReactionsEditActivity).inBubbleMode || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override
    public final void onPanTranslationUpdate(float f, float f2, boolean z) {
        IntroActivity.AnonymousClass1 anonymousClass1 = this.this$1;
        if (((ChatCustomReactionsEditActivity) anonymousClass1.this$0).getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) ((ChatCustomReactionsEditActivity) anonymousClass1.this$0).getParentLayout()).previewOpenAnimationInProgress;
        }
    }

    @Override
    public final void onTransitionEnd() {
    }

    @Override
    public final void onTransitionStart(int i, boolean z) {
        IntroActivity.AnonymousClass1 anonymousClass1 = this.this$1;
        ((ChatCustomReactionsEditActivity) anonymousClass1.this$0).actionButtonContainer.setVisibility(0);
        ((ChatCustomReactionsEditActivity) anonymousClass1.this$0).actionButtonContainer.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(20, this, z)).start();
    }
}
