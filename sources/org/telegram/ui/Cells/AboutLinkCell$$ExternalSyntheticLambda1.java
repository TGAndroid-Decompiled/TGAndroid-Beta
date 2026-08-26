package org.telegram.ui.Cells;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import android.view.View;
import androidx.mediarouter.app.MediaRouteChooserDialog;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter$$ExternalSyntheticLambda5;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.BusinessBotButton;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda39;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftSentBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Gifts.ActiveAuctionsSheet;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$55$$ExternalSyntheticLambda2;

public final class AboutLinkCell$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public AboutLinkCell$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((AboutLinkCell) this.f$0).lambda$new$0(view);
                break;
            case 1:
                ((MediaRouteChooserDialog) this.f$0).dismiss();
                break;
            case 2:
                ((DialogsAdapter) this.f$0).lambda$onCreateViewHolder$3(view);
                break;
            case 3:
                ((DialogsSearchAdapter$$ExternalSyntheticLambda5) this.f$0).run();
                break;
            case 4:
                ((LocationActivityAdapter) this.f$0).lambda$onCreateViewHolder$0(view);
                break;
            case 5:
                StickersSearchAdapter stickersSearchAdapter = (StickersSearchAdapter) this.f$0;
                stickersSearchAdapter.getClass();
                FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view.getParent();
                TLRPC.StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
                if (stickerSet != null) {
                    if (stickersSearchAdapter.installingStickerSets.indexOfKey(stickerSet.set.id) < 0) {
                        long j = stickerSet.set.id;
                        LongSparseArray longSparseArray = stickersSearchAdapter.removingStickerSets;
                        if (longSparseArray.indexOfKey(j) < 0) {
                            if (!featuredStickerSetInfoCell.isInstalled) {
                                stickersSearchAdapter.installStickerSet(stickerSet, featuredStickerSetInfoCell);
                            } else {
                                longSparseArray.put(stickerSet.set.id, stickerSet);
                                stickersSearchAdapter.delegate.onStickerSetRemove(featuredStickerSetInfoCell.getStickerSet());
                            }
                            break;
                        }
                    }
                }
                break;
            case 6:
                BusinessBotButton businessBotButton = (BusinessBotButton) this.f$0;
                boolean z = businessBotButton.paused;
                businessBotButton.paused = !z;
                businessBotButton.pauseButton.setText(LocaleController.getString(!z ? R.string.BizBotStart : R.string.BizBotStop), true);
                AnimatedTextView animatedTextView = businessBotButton.subtitleView;
                animatedTextView.cancelAnimation();
                animatedTextView.setText(LocaleController.getString(businessBotButton.paused ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true);
                if (businessBotButton.paused) {
                    businessBotButton.flags |= 1;
                } else {
                    businessBotButton.flags &= -2;
                }
                int i = businessBotButton.currentAccount;
                MessagesController.getNotificationsSettings(i).edit().putInt("dialog_botflags" + businessBotButton.dialogId, businessBotButton.flags).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i).getInputPeer(businessBotButton.dialogId);
                toggleconnectedbotpaused.paused = businessBotButton.paused;
                ConnectionsManager.getInstance(i).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 7:
                TL_account.TL_businessChatLink tL_businessChatLink = ((BusinessLinksActivity.BusinessLinkView) this.f$0).businessLink;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    BulletinFactory.of(LaunchActivity.getLastFragment()).createCopyLinkBulletin().show();
                }
                break;
            case 8:
                ActiveGiftAuctionsHintCell activeGiftAuctionsHintCell = (ActiveGiftAuctionsHintCell) this.f$0;
                if (activeGiftAuctionsHintCell.activeAuctions.size() != 1) {
                    new ActiveAuctionsSheet(activeGiftAuctionsHintCell.getContext()).show();
                } else {
                    new AuctionBidSheet(activeGiftAuctionsHintCell.getContext(), null, null, (GiftAuctionController.Auction) activeGiftAuctionsHintCell.activeAuctions.get(0)).show();
                }
                break;
            case 9:
                ((ArchivedStickerSetCell) this.f$0).toggle();
                break;
            case 10:
                RLottieImageView rLottieImageView = ((DialogsEmptyCell) this.f$0).imageView;
                if (!rLottieImageView.isPlaying()) {
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                }
                break;
            case 11:
                ((FeaturedStickerSetCell2) this.f$0).getClass();
                break;
            case 12:
                ((GroupCallUserCell) this.f$0).lambda$new$5(view);
                break;
            case 13:
                ((InviteUserCell) this.f$0).performClick();
                break;
            case 14:
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) this.f$0;
                manageChatUserCell.delegate.onOptionsButtonCheck(manageChatUserCell, true);
                break;
            case 15:
                PhotoEditRadioCell photoEditRadioCell = (PhotoEditRadioCell) this.f$0;
                photoEditRadioCell.getClass();
                photoEditRadioCell.currentColor = photoEditRadioCell.tintShadowColors[((Integer) ((RadioButton) view).getTag()).intValue()];
                photoEditRadioCell.updateSelectedTintButton(true);
                photoEditRadioCell.onClickListener.onClick(photoEditRadioCell);
                break;
            case 16:
                PhotoPickerAlbumsCell photoPickerAlbumsCell = (PhotoPickerAlbumsCell) this.f$0;
                PhotoPickerAlbumsCell.PhotoPickerAlbumsCellDelegate photoPickerAlbumsCellDelegate = photoPickerAlbumsCell.delegate;
                if (photoPickerAlbumsCellDelegate != null) {
                    ((PhotoViewer$55$$ExternalSyntheticLambda2) photoPickerAlbumsCellDelegate).didSelectAlbum(photoPickerAlbumsCell.albumEntries[((Integer) view.getTag()).intValue()]);
                }
                break;
            case 17:
                SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) this.f$0;
                if (sharedPhotoVideoCell.delegate != null) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    sharedPhotoVideoCell.delegate.didClickItem(sharedPhotoVideoCell, sharedPhotoVideoCell.indeces[iIntValue], sharedPhotoVideoCell.messageObjects[iIntValue], iIntValue);
                }
                break;
            case 18:
                ((ColorPickerBottomSheet) this.f$0).lambda$new$1$14(view);
                break;
            case 19:
                ((StoryLinkPreviewDialog) this.f$0).onBackPressed();
                break;
            case 20:
                final PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = (PremiumPreviewGiftLinkBottomSheet) this.f$0;
                if (!premiumPreviewGiftLinkBottomSheet.actionBtn.button.isLoading()) {
                    premiumPreviewGiftLinkBottomSheet.actionBtn.button.setLoading(true);
                    final int i2 = 0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (i2) {
                                case 0:
                                    PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet2 = premiumPreviewGiftLinkBottomSheet;
                                    premiumPreviewGiftLinkBottomSheet2.actionBtn.button.setLoading(false);
                                    premiumPreviewGiftLinkBottomSheet2.lambda$showGiftOfferSheet$15();
                                    AndroidUtilities.runOnUIThread(new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(premiumPreviewGiftLinkBottomSheet2, 1), 200L);
                                    break;
                                default:
                                    premiumPreviewGiftLinkBottomSheet.lambda$init$3((TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i3 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (i3) {
                                case 0:
                                    PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet2 = premiumPreviewGiftLinkBottomSheet;
                                    premiumPreviewGiftLinkBottomSheet2.actionBtn.button.setLoading(false);
                                    premiumPreviewGiftLinkBottomSheet2.lambda$showGiftOfferSheet$15();
                                    AndroidUtilities.runOnUIThread(new PremiumPreviewGiftLinkBottomSheet$$ExternalSyntheticLambda0(premiumPreviewGiftLinkBottomSheet2, 1), 200L);
                                    break;
                                default:
                                    premiumPreviewGiftLinkBottomSheet.lambda$init$3((TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = premiumPreviewGiftLinkBottomSheet.slug;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new BoostRepository$$ExternalSyntheticLambda15(callback2, callback, 1), 2);
                    break;
                }
                break;
            case 21:
                ((PremiumPreviewGiftSentBottomSheet) this.f$0).lambda$init$0(view);
                break;
            case 22:
                GiftInfoAdapter giftInfoAdapter = (GiftInfoAdapter) this.f$0;
                giftInfoAdapter.getClass();
                GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                break;
            case 23:
                ((SelectorHeaderCell) this.f$0).lambda$new$0(view);
                break;
            case 24:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.f$0;
                if (customEmojiReactionsWindow.enterTransitionFinished) {
                    customEmojiReactionsWindow.dismiss();
                }
                break;
            case 25:
                ((ChatActivity$$ExternalSyntheticLambda39) this.f$0).run();
                break;
            case 26:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.f$0;
                groupCallMiniTextureView.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                groupCallMiniTextureView.stopSharingTextView.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 27:
                ((PrivateVideoPreviewDialog) this.f$0).lambda$new$0$12(view);
                break;
            case 28:
                ((PrivateVideoPreviewDialogNew) this.f$0).lambda$new$0$13(view);
                break;
            default:
                if (VoIPService.getSharedInstance() != null) {
                    Context context = (Context) this.f$0;
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    RTMPStreamPipOverlay.instance.dismissInternal$1();
                }
                break;
        }
    }
}
