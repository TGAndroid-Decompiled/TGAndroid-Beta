package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.ProfileActionsView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Stars.StarsReactionsSheet;

public final class OAuthSheet$$ExternalSyntheticLambda11 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public OAuthSheet$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        RLottieDrawable rLottieDrawable;
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.showing = null;
                BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$0;
                BottomSheet bottomSheet = bottomSheetArr[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    bottomSheetArr[0] = null;
                }
                break;
            case 1:
                BoostsActivity boostsActivity = BoostsActivity.this;
                if (boostsActivity.isDialogVisible) {
                    boostsActivity.isDialogVisible = false;
                    boostsActivity.particlesView.setPaused(false);
                    boostsActivity.contentView.invalidate();
                }
                break;
            case 2:
                AndroidUtilities.hideKeyboard((BusinessLinksActivity.AnonymousClass1) this.f$0);
                break;
            case 3:
                AndroidUtilities.hideKeyboard((QuickRepliesActivity.AnonymousClass3) this.f$0);
                break;
            case 4:
                ((CameraScanActivity.AnonymousClass1) this.f$0).fragment.onFragmentDestroy();
                break;
            case 5:
                ProfileActivity.ListAdapter.AnonymousClass2 anonymousClass2 = ((AboutLinkCell.AnonymousClass2) this.f$0).this$0;
                anonymousClass2.links.clear(true);
                anonymousClass2.pressedLink = null;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass2.longPressedRunnable);
                anonymousClass2.invalidate();
                break;
            case 6:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.f$0;
                if (!channelCreateActivity.imageUpdater.isUploadingImage()) {
                    channelCreateActivity.cameraDrawable.setCustomEndFrame(86);
                    channelCreateActivity.avatarEditor.playAnimation();
                } else {
                    channelCreateActivity.cameraDrawable.setCurrentFrame(0, false, false);
                }
                break;
            case 7:
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$0;
                if (chatMessageCell != null) {
                    chatMessageCell.resetPressedLink(-1);
                }
                break;
            case 8:
                Bulletin bulletin = ((Bulletin[]) this.f$0)[0];
                if (bulletin != null) {
                    bulletin.hide();
                }
                break;
            case 9:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                if (!chatEditActivity.imageUpdater.isUploadingImage()) {
                    chatEditActivity.cameraDrawable.setCustomEndFrame(86);
                    chatEditActivity.setAvatarCell.imageView.playAnimation();
                } else {
                    chatEditActivity.cameraDrawable.setCurrentFrame(0, false, false);
                }
                break;
            case 10:
                ((ChatActivity$$ExternalSyntheticLambda22) this.f$0).run();
                break;
            case 11:
                AndroidUtilities.hideKeyboard((AlertsCreator.AnonymousClass3) this.f$0);
                break;
            case 12:
                ((ChatActivityEnterView) this.f$0).messageSendPreview = null;
                break;
            case 13:
                ((ChatAttachAlert) this.f$0).confirmationAlertShown = false;
                break;
            case 14:
                ((EditTextCaption) this.f$0).lambda$showInputDialog$7(dialogInterface);
                break;
            case 15:
                ((FragmentContextView) this.f$0).checkImport(false);
                break;
            case 16:
                LimitReachedBottomSheet limitReachedBottomSheet = (LimitReachedBottomSheet) this.f$0;
                limitReachedBottomSheet.lockInvalidation = false;
                limitReachedBottomSheet.limitPreviewView.invalidationEnabled = true;
                limitReachedBottomSheet.premiumButtonView.invalidate();
                limitReachedBottomSheet.limitPreviewView.invalidate();
                break;
            case 17:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = (PremiumPreviewBottomSheet) this.f$0;
                StarsReactionsSheet.AnonymousClass6 anonymousClass6 = premiumPreviewBottomSheet.iconTextureView;
                if (anonymousClass6 != null) {
                    anonymousClass6.setDialogVisible(false);
                }
                premiumPreviewBottomSheet.starParticlesView.setPaused(false);
                break;
            case 18:
                AndroidUtilities.hideKeyboard((SearchTagsList.AnonymousClass4) this.f$0);
                break;
            case 19:
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                themeEditorView.editorAlert = null;
                if (themeEditorView.parentActivity != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.windowManager, themeEditorView.windowView, themeEditorView.windowLayoutParams);
                    try {
                        themeEditorView.windowManager.addView(themeEditorView.windowView, themeEditorView.windowLayoutParams);
                        themeEditorView.showWithAnimation();
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 20:
                VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0 = (VoIPFragment$12$$ExternalSyntheticLambda0) this.f$0;
                if (voIPFragment$12$$ExternalSyntheticLambda0 != null) {
                    voIPFragment$12$$ExternalSyntheticLambda0.run();
                }
                break;
            case 21:
                ((MemberRequestsDelegate) this.f$0).previewDialog = null;
                break;
            case 22:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f$0;
                externalActionActivity.setResult(0);
                externalActionActivity.finish();
                break;
            case 23:
                GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) this.f$0;
                if (!groupCreateFinalActivity.imageUpdater.isUploadingImage()) {
                    groupCreateFinalActivity.cameraDrawable.setCustomEndFrame(86);
                    groupCreateFinalActivity.avatarEditor.playAnimation();
                } else {
                    groupCreateFinalActivity.cameraDrawable.setCurrentFrame(0, false, false);
                }
                break;
            case 24:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = (LoginActivity.LoginActivityRegisterView) this.f$0;
                boolean zIsUploadingImage = loginActivityRegisterView.imageUpdater.isUploadingImage();
                RLottieDrawable rLottieDrawable2 = loginActivityRegisterView.cameraDrawable;
                ChannelCreateActivity.AnonymousClass5 anonymousClass5 = loginActivityRegisterView.avatarEditor;
                if (!zIsUploadingImage) {
                    anonymousClass5.setAnimation(rLottieDrawable2);
                    rLottieDrawable2.setCustomEndFrame(86);
                    anonymousClass5.setOnAnimationEndListener(new LoginActivity$$ExternalSyntheticLambda16(loginActivityRegisterView, 2));
                    anonymousClass5.playAnimation();
                } else {
                    anonymousClass5.setAnimation(rLottieDrawable2);
                    rLottieDrawable2.setCurrentFrame(0, false, false);
                    loginActivityRegisterView.isCameraWaitAnimationAllowed = true;
                }
                break;
            case 25:
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 26:
                ((PhotoViewer) this.f$0).visibleDialog = null;
                break;
            case 27:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f$0;
                if (!privacyControlActivity.imageUpdater.isUploadingImage()) {
                    privacyControlActivity.cameraDrawable.setCustomEndFrame(86);
                    privacyControlActivity.setAvatarCell.imageView.playAnimation();
                } else {
                    privacyControlActivity.cameraDrawable.setCurrentFrame(0, false, false);
                }
                break;
            case 28:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                if (!profileActivity.imageUpdater.isUploadingImage()) {
                    profileActivity.cameraDrawable.setCustomEndFrame(86);
                    profileActivity.cellCameraDrawable.setCustomEndFrame(86);
                    ProfileActionsView profileActionsView = profileActivity.actionsView;
                    if (profileActionsView != null) {
                        ProfileActionsView.Action actionFind = ProfileActionsView.find(14, profileActionsView.actions);
                        if (actionFind != null && (rLottieDrawable = actionFind.drawableAnimated) != null) {
                            rLottieDrawable.start();
                        }
                    } else {
                        profileActivity.writeButton.playAnimation();
                    }
                    TextCell textCell = profileActivity.setAvatarCell;
                    if (textCell != null) {
                        textCell.getImageView().playAnimation();
                    }
                } else {
                    profileActivity.cameraDrawable.setCurrentFrame(0, false, false);
                    profileActivity.cellCameraDrawable.setCurrentFrame(0, false, false);
                }
                break;
            default:
                ((SelectAnimatedEmojiDialog) this.f$0).setDim(0.0f);
                break;
        }
    }
}
