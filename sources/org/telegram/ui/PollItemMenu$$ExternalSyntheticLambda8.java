package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Base64;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.VideoCompressButton;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;

public final class PollItemMenu$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public PollItemMenu$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        ChatActivity.ReplyQuote replyQuote;
        TLRPC.Message message;
        int i;
        Utilities.Callback callback;
        boolean z;
        boolean z2;
        Utilities.Callback2 callback2;
        int i2 = 16;
        int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                PollItemMenu pollItemMenu = (PollItemMenu) this.f$0;
                MessageObject messageObject = pollItemMenu.messageObject;
                byte[] bArr = ((TLRPC.PollAnswer) this.f$2).option;
                if (messageObject == null || (message = messageObject.messageOwner) == null || !(message.media instanceof TLRPC.TL_messageMediaPoll)) {
                    replyQuote = null;
                } else {
                    messageObject.getDialogId();
                    replyQuote = new ChatActivity.ReplyQuote(messageObject, bArr);
                }
                ((ChatActivity) this.f$1).showFieldPanelForReplyQuote(messageObject, replyQuote);
                pollItemMenu.dismiss(false);
                break;
            case 1:
                ((PaymentFormActivity) this.f$0).lambda$checkPassword$72((TL_account.Password) this.f$1, (byte[]) this.f$2);
                break;
            case 2:
                ((PaymentFormActivity) this.f$0).lambda$sendData$68((TLRPC.TL_error) this.f$1, (TLRPC.TL_payments_sendPaymentForm) this.f$2);
                break;
            case 3:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                paymentFormActivity.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.f$1;
                ((PhotoViewer$$ExternalSyntheticLambda7) this.f$2).run();
                paymentFormActivity.setDonePressed(false);
                paymentFormActivity.showEditDoneProgress$3(true, false);
                break;
            case 4:
                String str = (String) this.f$2;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                if (paymentFormActivity2.getParentActivity() != null && ((String) this.f$1).equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        paymentFormActivity2.paymentJson = jSONObject.getJSONObject("credentials").toString();
                        paymentFormActivity2.cardName = jSONObject.getString("title");
                    } catch (Throwable th) {
                        paymentFormActivity2.paymentJson = str;
                        FileLog.e(th);
                    }
                    paymentFormActivity2.goToNextStep();
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                boolean[] zArr = (boolean[]) this.f$1;
                if (!zArr[0]) {
                    ImageView imageView = photoViewer.textureImageView;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    SurfaceView surfaceView = photoViewer.videoSurfaceView;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    zArr[0] = true;
                    ((PhotoViewer$$ExternalSyntheticLambda103) this.f$2).run();
                }
                break;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f$0;
                photoViewer2.getClass();
                ((ImageReceiver.BitmapHolder) this.f$1).release();
                String imageKey = photoViewer2.centerImage.getImageKey();
                String str2 = (String) this.f$2;
                if (str2.equals(imageKey)) {
                    photoViewer2.currentImageHasFace = 2;
                    photoViewer2.currentImageFaceKey = str2;
                }
                break;
            case 7:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f$0;
                photoViewer3.centerImage.setImageBitmap((Bitmap) this.f$1);
                photoViewer3.cutOutBtn.setUndoCutState(true);
                photoViewer3.showStickerMode$1(true, true);
                PhotoViewer$$ExternalSyntheticLambda16 photoViewer$$ExternalSyntheticLambda16 = (PhotoViewer$$ExternalSyntheticLambda16) this.f$2;
                AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda16);
                AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda16, 800L);
                break;
            case 8:
                PhotoViewer.AnonymousClass86 anonymousClass86 = (PhotoViewer.AnonymousClass86) this.f$0;
                PhotoViewer.AnonymousClass86 anonymousClass87 = (PhotoViewer.AnonymousClass86) this.f$1;
                int[] iArr = (int[]) this.f$2;
                PhotoViewer photoViewer4 = PhotoViewer.this;
                if (photoViewer4.parentActivity != null && anonymousClass87 == photoViewer4.currentLoadingVideoRunnable) {
                    photoViewer4.currentLoadingVideoRunnable = null;
                    photoViewer4.audioFramesSize = iArr[5];
                    photoViewer4.videoDuration = iArr[4];
                    photoViewer4.videoFramerate = iArr[7];
                    float f = photoViewer4.bitrate / 8;
                    PhotoViewer photoViewer5 = PhotoViewer.this;
                    photoViewer4.videoFramesSize = (long) ((f * photoViewer5.videoDuration) / 1000.0f);
                    if (photoViewer5.videoConvertSupported) {
                        PhotoViewer photoViewer6 = PhotoViewer.this;
                        photoViewer6.rotationValue = iArr[8];
                        photoViewer6.updateWidthHeightBitrateForCompression();
                        if (PhotoViewer.this.selectedCompression > PhotoViewer.this.compressionsCount - 1) {
                            PhotoViewer photoViewer7 = PhotoViewer.this;
                            photoViewer7.selectedCompression = photoViewer7.compressionsCount - 1;
                        }
                        PhotoViewer photoViewer8 = PhotoViewer.this;
                        if (!photoViewer8.centerImageIsLivePhoto) {
                            VideoCompressButton videoCompressButton = photoViewer8.compressItem;
                            boolean z3 = photoViewer8.compressionsCount > 1;
                            PhotoViewer photoViewer9 = PhotoViewer.this;
                            videoCompressButton.setState(Math.min(photoViewer9.resultWidth, PhotoViewer.this.resultHeight), z3, photoViewer9.muteVideo);
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb = new StringBuilder("compressionsCount = ");
                            sb.append(PhotoViewer.this.compressionsCount);
                            sb.append(" w = ");
                            sb.append(PhotoViewer.this.originalWidth);
                            sb.append(" h = ");
                            sb.append(PhotoViewer.this.originalHeight);
                            sb.append(" r = ");
                            ChatObject$Call$$ExternalSyntheticOutline0.m(sb, PhotoViewer.this.rotationValue);
                        }
                        PhotoViewer.this.qualityChooseView.invalidate();
                    } else {
                        PhotoViewer photoViewer10 = PhotoViewer.this;
                        if (!photoViewer10.centerImageIsLivePhoto) {
                            photoViewer10.compressItem.setState(Math.min(photoViewer10.resultWidth, PhotoViewer.this.resultHeight), false, photoViewer10.muteVideo);
                        }
                        PhotoViewer.this.compressionsCount = 0;
                    }
                    PhotoViewer.this.updateVideoInfo();
                    PhotoViewer.this.updateMuteButton();
                    break;
                }
                break;
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f$0;
                premiumPreviewFragment.getClass();
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (tL_error != null) {
                    BulletinFactory.showError(tL_error);
                } else if (!(((TLObject) this.f$2) instanceof TLRPC.TL_boolTrue)) {
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(premiumPreviewFragment), null);
                }
                break;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                ArrayList arrayList = (ArrayList) this.f$1;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(i4);
                    if (((HashSet) this.f$2).contains(Long.valueOf(user.id))) {
                        i = 1;
                    } else {
                        TLRPC.ChatFull chatFull = profileActivity.chatInfo;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (ChatObject.isChannel(profileActivity.currentChat)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user.id;
                            profileActivity.chatInfo.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user.id;
                            tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                            profileActivity.chatInfo.participants.participants.add(tL_chatParticipant);
                        }
                        i = 1;
                        profileActivity.chatInfo.participants_count++;
                        profileActivity.getMessagesController().putUser(user, false);
                    }
                    i4 += i;
                }
                profileActivity.updateListAnimated(true, false);
                break;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f$0;
                ChatAvatarContainer.AnonymousClass1 anonymousClass1 = ((ChatActivity.AnonymousClass18) this.f$2).avatarImageView;
                ViewGroup viewGroup = (ViewGroup) ((ChatActivity) this.f$1).fragmentView;
                RectF rectF = ViewPositionWatcher.tmpRectF2;
                ViewPositionWatcher.computeRectInParent(anonymousClass1, viewGroup, rectF);
                profileActivity2.prevAvatarTranslation = rectF.left;
                profileActivity2.fixAvatarImageInCenter();
                break;
            case 12:
                BulletinFactory.createRemoveFromChatBulletin((ChannelAdminLogActivity) this.f$0, (TLRPC.User) this.f$1, ((TLRPC.Chat) this.f$2).title).show();
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f$0;
                secretMediaViewer.photoAnimationInProgress = 0;
                secretMediaViewer.imageMoveAnimation = null;
                ChatActivity$$ExternalSyntheticLambda6 chatActivity$$ExternalSyntheticLambda6 = (ChatActivity$$ExternalSyntheticLambda6) this.f$1;
                if (chatActivity$$ExternalSyntheticLambda6 != null) {
                    chatActivity$$ExternalSyntheticLambda6.run();
                }
                IntroActivity.AnonymousClass1 anonymousClass2 = secretMediaViewer.containerView;
                if (anonymousClass2 != null) {
                    anonymousClass2.setLayerType(0, null);
                    secretMediaViewer.containerView.invalidate();
                    SecretMediaViewer.SecretDeleteTimer secretDeleteTimer = secretMediaViewer.secretDeleteTimer;
                    TLRPC.Message message2 = ((MessageObject) this.f$2).messageOwner;
                    long j = message2.destroyTimeMillis;
                    long j2 = message2.ttl;
                    secretDeleteTimer.once = false;
                    secretDeleteTimer.destroyTime = j;
                    secretDeleteTimer.destroyTtl = j2;
                    secretDeleteTimer.drawable.start();
                    secretDeleteTimer.invalidate();
                    if (secretMediaViewer.closeAfterAnimation) {
                        secretMediaViewer.closePhoto(true, true);
                        break;
                    } else if (secretMediaViewer.ignoreDelete && MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) < 3) {
                        secretMediaViewer.showSecretHint();
                        break;
                    }
                }
                break;
            case 14:
                SessionsActivity.AnonymousClass4 anonymousClass4 = (SessionsActivity.AnonymousClass4) this.f$0;
                if (((TLRPC.TL_error) this.f$1) == null) {
                    SessionsActivity sessionsActivity = SessionsActivity.this;
                    ArrayList arrayList2 = sessionsActivity.sessions;
                    TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.f$2;
                    arrayList2.remove(tL_authorization);
                    sessionsActivity.passwordSessions.remove(tL_authorization);
                    sessionsActivity.updateRows$17();
                    SessionsActivity.ListAdapter listAdapter = sessionsActivity.listAdapter;
                    if (listAdapter != null) {
                        listAdapter.mObservable.notifyChanged();
                    }
                    sessionsActivity.loadSessions(true);
                } else {
                    anonymousClass4.getClass();
                }
                break;
            case 15:
                SessionsActivity.AnonymousClass5 anonymousClass5 = (SessionsActivity.AnonymousClass5) this.f$0;
                if (((TLRPC.TL_error) this.f$1) == null) {
                    SessionsActivity sessionsActivity2 = SessionsActivity.this;
                    ArrayList arrayList3 = sessionsActivity2.sessions;
                    TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.f$2;
                    arrayList3.remove(tL_authorization2);
                    sessionsActivity2.passwordSessions.remove(tL_authorization2);
                    sessionsActivity2.updateRows$17();
                    SessionsActivity.ListAdapter listAdapter2 = sessionsActivity2.listAdapter;
                    if (listAdapter2 != null) {
                        listAdapter2.mObservable.notifyChanged();
                    }
                } else {
                    anonymousClass5.getClass();
                }
                break;
            case 16:
                String str3 = (String) this.f$1;
                CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0 = (CameraScanActivity$$ExternalSyntheticLambda0) this.f$2;
                SessionsActivity.AnonymousClass6 anonymousClass6 = (SessionsActivity.AnonymousClass6) this.f$0;
                anonymousClass6.getClass();
                try {
                    byte[] bArrDecode = Base64.decode(str3.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = bArrDecode;
                    SessionsActivity.this.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ProfileActivity$$ExternalSyntheticLambda65(i2, anonymousClass6, cameraScanActivity$$ExternalSyntheticLambda0));
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new SessionsActivity$6$$ExternalSyntheticLambda0(anonymousClass6, 1));
                    cameraScanActivity$$ExternalSyntheticLambda0.run();
                    return;
                }
                break;
            case 17:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                botStarsActivity.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    Browser.openUrl((Context) this.f$2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject).url);
                }
                AndroidUtilities.runOnUIThread(new BotStarsActivity$$ExternalSyntheticLambda1(botStarsActivity, 4), 1000L);
                break;
            case 18:
                ((BotStarsActivity) this.f$0).lambda$loadTonTransactions$17((TLObject) this.f$1, (TLRPC.TL_error) this.f$2);
                break;
            case 19:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                Long l = (Long) this.f$1;
                starGiftSheet.openTransferAlert(l.longValue(), new ArticleViewer$$ExternalSyntheticLambda33(starGiftSheet, l, (UserSelectorBottomSheet[]) this.f$2, i2));
                break;
            case 20:
                ((StarGiftSheet) this.f$0).lambda$repollMessage$96((TLObject) this.f$1, (MessageObject) this.f$2);
                break;
            case 21:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) this.f$0;
                starGiftSheet2.getClass();
                ((Browser.Progress) this.f$1).end(false);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f$2;
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                starGiftSheet2.topView.setResellPrice(AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.STARS));
                ProfileGiftsContainer$Page$$ExternalSyntheticLambda6 profileGiftsContainer$Page$$ExternalSyntheticLambda6 = starGiftSheet2.onGiftUpdatedListener;
                if (profileGiftsContainer$Page$$ExternalSyntheticLambda6 != null) {
                    profileGiftsContainer$Page$$ExternalSyntheticLambda6.run();
                }
                zzks.m(R.string.Gift2ResaleDisable, new Object[]{starGiftSheet2.getGiftName()}, starGiftSheet2.getBulletinFactory(), R.raw.contact_check);
                break;
            case 22:
                StarGiftSheet starGiftSheet3 = (StarGiftSheet) this.f$0;
                starGiftSheet3.getClass();
                ((Browser.Progress) this.f$1).end(false);
                starGiftSheet3.getBulletinFactory().showForError(false, (TLRPC.TL_error) this.f$2);
                break;
            case 23:
                ((StarGiftSheet) this.f$0).lambda$show$112((AlertDialog) this.f$1, (MessageObject) this.f$2);
                break;
            case 24:
                ((StarGiftSheet) this.f$0).lambda$set$55((TL_stars.TL_starGiftUnique) this.f$1, (String) this.f$2);
                break;
            case 25:
                ((StarsController) this.f$0).getClass();
                boolean[] zArr2 = (boolean[]) this.f$1;
                if (!zArr2[0] && (callback = (Utilities.Callback) this.f$2) != null) {
                    callback.run("cancelled");
                    zArr2[0] = true;
                    break;
                }
                break;
            case 26:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                for (Integer num : (HashSet) this.f$1) {
                    num.getClass();
                    starsController.sendingPaidMessagesIds.remove(num);
                    starsController.postponedPaidMessages.remove(num);
                }
                ((Runnable) this.f$2).run();
                break;
            case 27:
                StarsController starsController2 = (StarsController) this.f$0;
                boolean z4 = !starsController2.balanceLoaded;
                starsController2.lastBalanceLoaded = System.currentTimeMillis();
                TLObject tLObject2 = (TLObject) this.f$1;
                boolean z5 = tLObject2 instanceof TL_stars.StarsStatus;
                int i5 = starsController2.currentAccount;
                if (z5) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i5).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i5).putChats(starsStatus.chats, false);
                    ArrayList[] arrayListArr = starsController2.transactions;
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList4 = starsStatus.history;
                        int size2 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            TL_stars.StarsTransaction starsTransaction = arrayList4.get(i6);
                            i6 += i3;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            ArrayList[] arrayListArr2 = arrayListArr;
                            arrayListArr2[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            arrayListArr = arrayListArr2;
                            i3 = 1;
                        }
                        ArrayList[] arrayListArr3 = arrayListArr;
                        for (int i7 = 0; i7 < 3; i7++) {
                            boolean zIsEmpty = arrayListArr3[i7].isEmpty();
                            boolean[] zArr3 = starsController2.transactionsExist;
                            zArr3[i7] = !zIsEmpty || zArr3[i7];
                            boolean z6 = (starsStatus.flags & 1) == 0;
                            boolean[] zArr4 = starsController2.endReached;
                            zArr4[i7] = z6;
                            if (z6) {
                                starsController2.loading[i7] = false;
                            }
                            starsController2.offset[i7] = zArr4[i7] ? null : starsStatus.next_offset;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    ArrayList arrayList5 = starsController2.subscriptions;
                    if (arrayList5.isEmpty()) {
                        arrayList5.addAll(starsStatus.subscriptions);
                        starsController2.subscriptionsLoading = false;
                        starsController2.subscriptionsOffset = starsStatus.subscriptions_next_offset;
                        starsController2.subscriptionsEndReached = (starsStatus.flags & 4) == 0;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = starsController2.balance.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j3 != starsAmount.amount) {
                        z4 = true;
                    }
                    starsController2.balance = starsAmount;
                    starsController2.minus = 0L;
                } else {
                    z = false;
                    z2 = false;
                }
                starsController2.balanceLoading = false;
                starsController2.balanceLoaded = true;
                if (z4) {
                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z) {
                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z2) {
                    NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                Runnable runnable = (Runnable) this.f$2;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 28:
                ((StarsController) this.f$0).getClass();
                boolean[] zArr5 = (boolean[]) this.f$1;
                if (!zArr5[0] && (callback2 = (Utilities.Callback2) this.f$2) != null) {
                    callback2.run("cancelled", 0L);
                    zArr5[0] = true;
                    break;
                }
                break;
            default:
                ((boolean[]) this.f$0)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f$1);
                ((BottomSheet[]) this.f$2)[0].lambda$showGiftOfferSheet$15();
                break;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda8(ProfileActivity profileActivity, ChatActivity.AnonymousClass18 anonymousClass18, ChatActivity chatActivity) {
        this.$r8$classId = 11;
        this.f$0 = profileActivity;
        this.f$2 = anonymousClass18;
        this.f$1 = chatActivity;
    }
}
