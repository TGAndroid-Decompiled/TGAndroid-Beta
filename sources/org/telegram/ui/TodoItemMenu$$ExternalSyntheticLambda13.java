package org.telegram.ui;

import android.app.Activity;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.SessionsActivity.AnonymousClass6;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda169;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoryMediaAreasView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$9$1;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.CaptionContainerView$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.DownloadButton;
import org.telegram.ui.Stories.recorder.DownloadButton$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda19;

public final class TodoItemMenu$$ExternalSyntheticLambda13 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public TodoItemMenu$$ExternalSyntheticLambda13(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        BaseFragment lastFragment;
        Activity activityFindActivity;
        Utilities.Callback callback;
        switch (this.$r8$classId) {
            case 0:
                ((TodoItemMenu) this.f$0).dismiss(true);
                break;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f$0;
                if (saveToGallerySettingsActivity.isNewException) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.type);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.dialogException;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.type, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 2:
                ((SearchAdsInfoBottomSheet) this.f$0).lambda$new$2$18(view);
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f$0;
                MessageObject messageObject = secretMediaViewer.currentMessageObject;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        HintView2 hintView2 = secretMediaViewer.secretHint;
                        if (!hintView2.shown) {
                            secretMediaViewer.showSecretHint();
                        } else {
                            hintView2.hide(true);
                        }
                    }
                }
                break;
            case 4:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) this.f$0;
                if (selectChatUserSheet.selectedOwner instanceof TLRPC.User) {
                    ButtonWithCounterView buttonWithCounterView = selectChatUserSheet.button;
                    if (!buttonWithCounterView.loading) {
                        buttonWithCounterView.setLoading(true);
                        selectChatUserSheet.initTransfer((TLRPC.User) selectChatUserSheet.selectedOwner, null, null);
                        break;
                    }
                }
                break;
            case 5:
                SessionsActivity sessionsActivity = SessionsActivity.this;
                if (sessionsActivity.getParentActivity() != null) {
                    if (Build.VERSION.SDK_INT >= 23 && sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                    } else {
                        CameraScanActivity.showAsSheet(sessionsActivity.getParentActivity(), 2, sessionsActivity.new AnonymousClass6());
                    }
                    break;
                }
                break;
            case 6:
                ((ExplainStarsSheet) this.f$0).lambda$new$0$40(view);
                break;
            case 7:
                ((MessageSuggestionOfferSheet) this.f$0).lambda$new$1$37(view);
                break;
            case 8:
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = (SellGiftEnterPriceSheet) this.f$0;
                AmountUtils$Currency amountUtils$Currency = sellGiftEnterPriceSheet.inputAmount.currency;
                AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
                if (amountUtils$Currency == amountUtils$Currency2) {
                    amountUtils$Currency2 = AmountUtils$Currency.STARS;
                }
                sellGiftEnterPriceSheet.setAmount$2(AmountUtils$Amount.fromNano(0L, amountUtils$Currency2), true, false, true);
                sellGiftEnterPriceSheet.starsCountEditField.setText("");
                break;
            case 9:
                ((StarGiftPreviewSheet) this.f$0).lambda$new$6$9(view);
                break;
            case 10:
                ((StarGiftSheet$$ExternalSyntheticLambda169) this.f$0).run();
                break;
            case 11:
                ((StarGiftSheet$$ExternalSyntheticLambda169) this.f$0).run();
                break;
            case 12:
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) this.f$0;
                resaleBuyTransferAlert.getClass();
                new StarsIntroActivity.StarsOptionsSheet(resaleBuyTransferAlert.context, resaleBuyTransferAlert.resourcesProvider).show();
                break;
            case 13:
                ((StarGiftSheet.UpgradePricesSheet) this.f$0).lambda$new$0$34(view);
                break;
            case 14:
                ((StarsIntroActivity$$ExternalSyntheticLambda4) this.f$0).run();
                break;
            case 15:
                if (((StarsIntroActivity.StarsBalanceView) ((GradientHeaderActivity.AnonymousClass5) this.f$0).aboveTitleLayout).lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
                break;
            case 16:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                anonymousClass10.setCollapsed(!anonymousClass10.collapsed, true);
                break;
            case 17:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                if (storyViewer != null) {
                    storyViewer.switchToPip$1();
                }
                break;
            case 18:
                ((StealthModeAlert) this.f$0).lambda$showGiftOfferSheet$15();
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (lastFragment2 != null) {
                    lastFragment2.showDialog(new PremiumFeatureBottomSheet(lastFragment2, lastFragment2.getContext(), lastFragment2.getCurrentAccount(), false, 14, false, null));
                }
                break;
            case 19:
                StoryMediaAreasView storyMediaAreasView = (StoryMediaAreasView) this.f$0;
                storyMediaAreasView.onClick(storyMediaAreasView.selectedArea);
                break;
            case 20:
                StoryViewer.AnonymousClass8 anonymousClass8 = (StoryViewer.AnonymousClass8) this.f$0;
                anonymousClass8.this$0.storiesIntro.animate().alpha(0.0f).setDuration(150L).setListener(new StoryViewer$9$1(anonymousClass8, 0)).start();
                break;
            case 21:
                ((LivePlayer$1$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 22:
                ((TodoItemMenu$$ExternalSyntheticLambda5) this.f$0).run();
                break;
            case 23:
                CaptionContainerView captionContainerView = (CaptionContainerView) this.f$0;
                CaptionContainerView.AnonymousClass3 anonymousClass3 = captionContainerView.editText;
                AndroidUtilities.hideKeyboard(anonymousClass3.editText);
                anonymousClass3.hidePopup(true);
                CaptionContainerView$$ExternalSyntheticLambda0 captionContainerView$$ExternalSyntheticLambda0 = captionContainerView.textChangeRunnable;
                AndroidUtilities.cancelRunOnUIThread(captionContainerView$$ExternalSyntheticLambda0);
                captionContainerView$$ExternalSyntheticLambda0.run();
                break;
            case 24:
                ((StoryRecorder.AnonymousClass8) this.f$0).showRemoveRoundAlert();
                break;
            case 25:
                int i = Build.VERSION.SDK_INT;
                DownloadButton downloadButton = (DownloadButton) this.f$0;
                if (i >= 23) {
                    if (i > 28) {
                        downloadButton.getClass();
                        if (BuildVars.NO_SCOPED_STORAGE) {
                            if (downloadButton.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                activityFindActivity = AndroidUtilities.findActivity(downloadButton.getContext());
                                if (activityFindActivity != null) {
                                    activityFindActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                                }
                            }
                        }
                    } else if (downloadButton.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        activityFindActivity = AndroidUtilities.findActivity(downloadButton.getContext());
                        if (activityFindActivity != null) {
                            activityFindActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                        }
                    }
                }
                if (!downloadButton.downloading && downloadButton.currentEntry != null) {
                    if (downloadButton.savedToGalleryUri != null) {
                        if (i >= 30) {
                            downloadButton.getContext().getContentResolver().delete(downloadButton.savedToGalleryUri, null);
                            downloadButton.savedToGalleryUri = null;
                        } else if (i < 29) {
                            try {
                                new File(downloadButton.savedToGalleryUri.toString()).delete();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            downloadButton.savedToGalleryUri = null;
                        }
                    }
                    downloadButton.downloading = true;
                    DownloadButton.PreparingVideoToast preparingVideoToast = downloadButton.toast;
                    if (preparingVideoToast != null) {
                        preparingVideoToast.hide();
                        downloadButton.toast = null;
                    }
                    DownloadButton.BuildingVideo buildingVideo = downloadButton.buildingVideo;
                    if (buildingVideo != null) {
                        buildingVideo.stop(true);
                        downloadButton.buildingVideo = null;
                    }
                    StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda19 = downloadButton.prepare;
                    if (storyRecorder$$ExternalSyntheticLambda19 != null) {
                        downloadButton.preparing = true;
                        storyRecorder$$ExternalSyntheticLambda19.run(new DownloadButton$$ExternalSyntheticLambda4(downloadButton, 0));
                    }
                    downloadButton.updateImage();
                    if (storyRecorder$$ExternalSyntheticLambda19 == null) {
                        downloadButton.onClickInternal();
                    }
                    break;
                }
                break;
            case 26:
                ((TodoItemMenu$$ExternalSyntheticLambda2) this.f$0).run();
                break;
            case 27:
                PreviewButtons previewButtons = PreviewButtons.this;
                if (previewButtons.appearing && (callback = previewButtons.onClickListener) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 28:
                StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = ((StoryPrivacyBottomSheet.HeaderCell) this.f$0).onCloseClickListener;
                if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                    storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                }
                break;
            default:
                ((TodoItemMenu) ((PollItemMenu.AnonymousClass4) this.f$0).this$0).dismiss(true);
                break;
        }
    }
}
