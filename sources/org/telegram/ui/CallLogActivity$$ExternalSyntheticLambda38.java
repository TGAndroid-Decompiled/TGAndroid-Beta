package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteChooserDialog;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0;
import com.stripe.android.Stripe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.BusinessBotButton;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetCell2;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Cells.InviteUserCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.PhotoEditRadioCell;
import org.telegram.ui.Cells.PhotoPickerAlbumsCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Gifts.ActiveAuctionsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.web.BotWebViewContainer;

public final class CallLogActivity$$ExternalSyntheticLambda38 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public CallLogActivity$$ExternalSyntheticLambda38(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        CameraSessionWrapper cameraSession;
        int i = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity$$ExternalSyntheticLambda17) obj).run();
                break;
            case 1:
                ((MediaRouteChooserDialog) obj).dismiss();
                break;
            case 2:
                ((ChatActivity$$ExternalSyntheticLambda17) obj).run();
                break;
            case 3:
                DialogsAdapter dialogsAdapter = (DialogsAdapter) obj;
                MessagesController.getInstance(dialogsAdapter.currentAccount).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                dialogsAdapter.notifyDataSetChanged();
                break;
            case 4:
                ((ArticleViewer$$ExternalSyntheticLambda3) obj).run();
                break;
            case 5:
                ((LocationActivityAdapter) obj).onDirectionClick();
                break;
            case 6:
                StickersSearchAdapter stickersSearchAdapter = (StickersSearchAdapter) obj;
                stickersSearchAdapter.getClass();
                FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view.getParent();
                TLRPC.StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
                if (stickerSet != null && stickersSearchAdapter.installingStickerSets.indexOfKey(stickerSet.set.id) < 0) {
                    long j = stickerSet.set.id;
                    LongSparseArray longSparseArray = stickersSearchAdapter.removingStickerSets;
                    if (longSparseArray.indexOfKey(j) < 0) {
                        if (!featuredStickerSetInfoCell.isInstalled) {
                            stickersSearchAdapter.installStickerSet(stickerSet, featuredStickerSetInfoCell);
                        } else {
                            longSparseArray.put(stickerSet.set.id, stickerSet);
                            stickersSearchAdapter.delegate.val$delegate.onStickerSetRemove(featuredStickerSetInfoCell.getStickerSet());
                        }
                        break;
                    }
                }
                break;
            case 7:
                BotWebViewContainer.MyWebView webView = ((ArticleViewer.PageLayout) obj).webViewContainer.getWebView();
                if (webView != null) {
                    webView.reload();
                }
                break;
            case 8:
                AutoDeleteMessagesActivity autoDeleteMessagesActivity = (AutoDeleteMessagesActivity) obj;
                if (view != autoDeleteMessagesActivity.customTimeButton) {
                    int i2 = ((AutoDeleteMessagesActivity.RadioCellInternal) view).time;
                    if (autoDeleteMessagesActivity.getSelectedTime() == 0 && i2 > 0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(autoDeleteMessagesActivity.getParentActivity(), 0, null);
                        String string = LocaleController.getString(R.string.MessageLifetime);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i2 * 60));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new CrashlyticsCore$$ExternalSyntheticLambda0(28));
                        builder.setPositiveButton(LocaleController.getString(R.string.Enable), new ArticleViewer$$ExternalSyntheticLambda16(19, autoDeleteMessagesActivity, view));
                        builder.show();
                    } else {
                        autoDeleteMessagesActivity.selectRadioButton(view, true);
                    }
                } else {
                    AlertsCreator.createAutoDeleteDatePickerDialog(autoDeleteMessagesActivity.getParentActivity(), null, new Stripe.AnonymousClass1(autoDeleteMessagesActivity, 18));
                }
                break;
            case 9:
                ((AvatarPreviewer.AnonymousClass1) obj).setShowing$1(false);
                break;
            case 10:
                BusinessBotButton businessBotButton = (BusinessBotButton) obj;
                boolean z = businessBotButton.paused;
                businessBotButton.paused = !z;
                businessBotButton.pauseButton.setText(LocaleController.getString(!z ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                AnimatedTextView animatedTextView = businessBotButton.subtitleView;
                animatedTextView.drawable.cancelAnimation();
                animatedTextView.setText(LocaleController.getString(businessBotButton.paused ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (businessBotButton.paused) {
                    businessBotButton.flags |= 1;
                } else {
                    businessBotButton.flags &= -2;
                }
                int i3 = businessBotButton.currentAccount;
                MessagesController.getNotificationsSettings(i3).edit().putInt("dialog_botflags" + businessBotButton.dialogId, businessBotButton.flags).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i3).getInputPeer(businessBotButton.dialogId);
                toggleconnectedbotpaused.paused = businessBotButton.paused;
                ConnectionsManager.getInstance(i3).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 11:
                TL_account.TL_businessChatLink tL_businessChatLink = ((BusinessLinksActivity.BusinessLinkView) obj).businessLink;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    BulletinFactory.of(LaunchActivity.getLastFragment()).createCopyLinkBulletin(false).show();
                }
                break;
            case 12:
                ((CacheControlActivity) obj).clearSelectedFiles();
                break;
            case 13:
                CacheControlActivity.ClearCacheButtonInternal clearCacheButtonInternal = (CacheControlActivity.ClearCacheButtonInternal) obj;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(clearCacheButtonInternal.getContext(), 0, null);
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.ClearCache));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = clearCacheButtonInternal.valueTextView;
                sb.append(TextUtils.isEmpty(animatedTextDrawable.currentText) ? "" : " (" + ((Object) animatedTextDrawable.currentText) + ")");
                String string2 = sb.toString();
                AlertDialog alertDialog2 = builder2.alertDialog;
                alertDialog2.title = string2;
                alertDialog2.message = LocaleController.getString(R.string.StorageUsageInfo);
                builder2.setPositiveButton(clearCacheButtonInternal.textView.currentText, new WindowVisibilityManager$$ExternalSyntheticLambda0(clearCacheButtonInternal, 26));
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                CacheControlActivity.this.showDialog(alertDialog2);
                View button = alertDialog2.getButton(-1);
                if (button instanceof TextView) {
                    int i4 = Theme.key_text_RedRegular;
                    ((TextView) button).setTextColor(Theme.getColor(null, i4, false));
                    button.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.12f, Theme.getColor(null, i4, false))));
                }
                break;
            case 14:
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                cacheControlActivity.collapsed = !cacheControlActivity.collapsed;
                cacheControlActivity.updateRows$1(true);
                cacheControlActivity.updateChart();
                break;
            case 15:
                CachedMediaLayout.MusicAdapter.AnonymousClass1 anonymousClass1 = (CachedMediaLayout.MusicAdapter.AnonymousClass1) obj;
                switch (anonymousClass1.$r8$classId) {
                    case 0:
                        CachedMediaLayout.this.delegate.onItemSelected(null, (CacheModel.FileInfo) anonymousClass1.getTag(), true);
                        break;
                    default:
                        CachedMediaLayout.this.delegate.onItemSelected(null, (CacheModel.FileInfo) anonymousClass1.getTag(), true);
                        break;
                }
                break;
            case 16:
                RLottieImageView rLottieImageView = ((CallLogActivity.EmptyTextProgressView) obj).imageView;
                if (!rLottieImageView.isPlaying()) {
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                }
                break;
            case 17:
                CameraScanActivity cameraScanActivity = (CameraScanActivity) obj;
                CameraView cameraView = cameraScanActivity.cameraView;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) cameraScanActivity.flashButton.getBackground();
                    AnimatorSet animatorSet = cameraScanActivity.flashAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        cameraScanActivity.flashAnimator = null;
                    }
                    cameraScanActivity.flashAnimator = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(shapeDrawable, AnimationProperties.SHAPE_DRAWABLE_ALPHA, cameraScanActivity.flashButton.getTag() == null ? 68 : 34);
                    objectAnimatorOfInt.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda5(cameraScanActivity, i));
                    cameraScanActivity.flashAnimator.playTogether(objectAnimatorOfInt);
                    cameraScanActivity.flashAnimator.setDuration(200L);
                    cameraScanActivity.flashAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    cameraScanActivity.flashAnimator.addListener(new ArticleViewer.AnonymousClass25(cameraScanActivity, 9));
                    cameraScanActivity.flashAnimator.start();
                    if (cameraScanActivity.flashButton.getTag() != null) {
                        cameraScanActivity.flashButton.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                    } else {
                        cameraScanActivity.flashButton.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                    }
                }
                break;
            case 18:
                ((ProfileActivity.ListAdapter.AnonymousClass2) obj).updateCollapse();
                break;
            case 19:
                ActiveGiftAuctionsHintCell activeGiftAuctionsHintCell = (ActiveGiftAuctionsHintCell) obj;
                if (activeGiftAuctionsHintCell.activeAuctions.size() != 1) {
                    new ActiveAuctionsSheet(activeGiftAuctionsHintCell.getContext()).show();
                } else {
                    new AuctionBidSheet(activeGiftAuctionsHintCell.getContext(), null, null, (GiftAuctionController.Auction) activeGiftAuctionsHintCell.activeAuctions.get(0)).show();
                }
                break;
            case 20:
                ((ArchivedStickerSetCell) obj).toggle();
                break;
            case 21:
                RLottieImageView rLottieImageView2 = ((DialogsEmptyCell) obj).imageView;
                if (!rLottieImageView2.isPlaying()) {
                    rLottieImageView2.setProgress(0.0f);
                    rLottieImageView2.playAnimation();
                }
                break;
            case 22:
                ((FeaturedStickerSetCell2) obj).getClass();
                break;
            case 23:
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) obj;
                groupCallUserCell.onMuteClick(groupCallUserCell);
                break;
            case 24:
                ((InviteUserCell) obj).performClick();
                break;
            case 25:
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) obj;
                manageChatUserCell.delegate.onOptionsButtonCheck(manageChatUserCell, true);
                break;
            case 26:
                PhotoEditRadioCell photoEditRadioCell = (PhotoEditRadioCell) obj;
                photoEditRadioCell.getClass();
                photoEditRadioCell.currentColor = photoEditRadioCell.tintShadowColors[((Integer) ((RadioButton) view).getTag()).intValue()];
                photoEditRadioCell.updateSelectedTintButton(true);
                photoEditRadioCell.onClickListener.onClick(photoEditRadioCell);
                break;
            case 27:
                PhotoPickerAlbumsCell photoPickerAlbumsCell = (PhotoPickerAlbumsCell) obj;
                PhotoPickerAlbumsCell.PhotoPickerAlbumsCellDelegate photoPickerAlbumsCellDelegate = photoPickerAlbumsCell.delegate;
                if (photoPickerAlbumsCellDelegate != null) {
                    PhotoAlbumPickerActivity.access$100(PhotoAlbumPickerActivity.this, photoPickerAlbumsCell.albumEntries[((Integer) view.getTag()).intValue()]);
                }
                break;
            case 28:
                SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) obj;
                if (sharedPhotoVideoCell.delegate != null) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    FilteredSearchView.this.onItemClick(sharedPhotoVideoCell.indeces[iIntValue], sharedPhotoVideoCell, sharedPhotoVideoCell.messageObjects[iIntValue], iIntValue);
                }
                break;
            default:
                ((ChannelColorActivity) obj).buttonClick();
                break;
        }
    }
}
