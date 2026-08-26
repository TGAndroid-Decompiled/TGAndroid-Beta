package org.telegram.ui.Stories;

import android.app.Dialog;
import android.view.View;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemePreviewActivity;

public final class PeerStoriesView$8$$ExternalSyntheticLambda8 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$3;

    public PeerStoriesView$8$$ExternalSyntheticLambda8(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = obj3;
    }

    @Override
    public final void onClick(View view) throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                ArrayList arrayList = new ArrayList();
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$1;
                arrayList.add(storyItem);
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                StoriesController storiesController = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController();
                long j = anonymousClass1.dialogId;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) this.f$3;
                boolean z = this.f$2;
                storiesController.updateStoriesPinned(j, arrayList, z, new PeerStoriesView$38$$ExternalSyntheticLambda1(anonymousClass8, storyItem, z, darkThemeResourceProvider));
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass1.popupMenu;
                if (anonymousClass9 != null) {
                    anonymousClass9.dismiss();
                }
                break;
            default:
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = (PremiumFeatureBottomSheet) this.f$0;
                premiumFeatureBottomSheet.getClass();
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                if (baseFragment instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                    chatActivity.closeMenu();
                    ChatAttachAlert chatAttachAlert = chatActivity.chatAttachAlert;
                    if (chatAttachAlert != null) {
                        chatAttachAlert.dismiss(true);
                    }
                }
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                int i = 0;
                while (i < 2) {
                    BaseFragment baseFragment2 = i == 0 ? baseFragment : lastFragment;
                    if (baseFragment2 != null && baseFragment2.getLastStoryViewer() != null) {
                        StoryViewer lastStoryViewer = baseFragment2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.currentDialog;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        BaseFragment.AttachedSheet attachedSheet = lastStoryViewer.currentSheet;
                        if (attachedSheet != null) {
                            attachedSheet.lambda$showGiftOfferSheet$15();
                        }
                        PeerStoriesView currentPeerView = lastStoryViewer.getCurrentPeerView();
                        if (currentPeerView != null) {
                            ReactionsContainerLayout reactionsContainerLayout = currentPeerView.reactionsContainerLayout;
                            if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null) {
                                currentPeerView.reactionsContainerLayout.getReactionsWindow().dismiss();
                            }
                            PeerStoriesView.AnonymousClass27 anonymousClass27 = currentPeerView.shareAlert;
                            if (anonymousClass27 != null) {
                                anonymousClass27.lambda$showGiftOfferSheet$15();
                            }
                            currentPeerView.needEnterText();
                        }
                    }
                    if (baseFragment2 != null && baseFragment2.getVisibleDialog() != null) {
                        baseFragment2.getVisibleDialog().dismiss();
                    }
                    i++;
                }
                boolean z2 = this.f$2;
                PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) this.f$3;
                if (z2 || premiumFeatureBottomSheet.forceAbout) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type));
                    if (baseFragment instanceof ThemePreviewActivity) {
                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                        bottomSheetParams.transitionFromLeft = true;
                        baseFragment.showAsSheet(premiumPreviewFragment, bottomSheetParams);
                    } else if (baseFragment != null) {
                        baseFragment.presentFragment(premiumPreviewFragment);
                    } else {
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            safeLastFragment.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.buyPremium(baseFragment, premiumFeatureBottomSheet.selectedTier, PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type));
                }
                premiumFeatureBottomSheet.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
