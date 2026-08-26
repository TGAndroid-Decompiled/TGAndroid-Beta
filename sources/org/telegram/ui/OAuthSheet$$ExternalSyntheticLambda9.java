package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.PhotoUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.IntSize;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.TranscribeButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;

    public OAuthSheet$$ExternalSyntheticLambda9(BillingResult billingResult, BaseFragment baseFragment, List list, int i, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        this.$r8$classId = 11;
        this.f$0 = billingResult;
        this.f$5 = baseFragment;
        this.f$1 = (AbstractCollection) list;
        this.f$3 = i;
        this.f$2 = billingFlowParams$SubscriptionUpdateParams;
        this.f$4 = subscriptionTier;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f$0;
                boolean zIsEmpty = tL_urlAuthResultRequest.match_codes.isEmpty();
                OAuthSheet$$ExternalSyntheticLambda8 oAuthSheet$$ExternalSyntheticLambda8 = (OAuthSheet$$ExternalSyntheticLambda8) this.f$4;
                if (!zIsEmpty) {
                    String[] strArr = (String[]) this.f$1;
                    if (TextUtils.isEmpty(strArr[0])) {
                        OAuthSheet.showMatchCodeSheet((Context) this.f$2, this.f$3, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new OAuthSheet$$ExternalSyntheticLambda13(18, strArr, oAuthSheet$$ExternalSyntheticLambda8), true, new ChatActivity$$ExternalSyntheticLambda470(5), ((BaseFragment) this.f$5).getResourceProvider());
                    }
                }
                oAuthSheet$$ExternalSyntheticLambda8.run();
                break;
            case 1:
                ((ChatObject.Call) this.f$0).lambda$loadUnknownParticipants$5(this.f$3, (TLObject) this.f$1, (ChatObject.Call.OnParticipantsLoad) this.f$2, (ArrayList) this.f$4, (HashSet) this.f$5);
                break;
            case 2:
                ((LocaleController) this.f$0).lambda$saveRemoteLocaleStrings$10(this.f$3, (LocaleController.LocaleInfo) this.f$1, (TLRPC.TL_langPackDifference) this.f$2, (HashMap) this.f$4, (Runnable) this.f$5);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$removeMultipleStickerSets$111((boolean[]) this.f$1, (ArrayList) this.f$4, (Context) this.f$2, (BaseFragment) this.f$5, this.f$3);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.f$0;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i = this.f$3;
                    MessagesController.getInstance(i).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && (photoSize2 = (TLRPC.PhotoSize) this.f$1) != null && photoSize2.location != null) {
                            FileLoader.getInstance(i).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize2.location.volume_id);
                            sb.append("_");
                            String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(photoSize2.location.local_id, "@50_50", sb);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(closestPhotoSizeWithSize.location.volume_id);
                            sb2.append("_");
                            ImageLoader.getInstance().replaceImageInCache(strM, SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(i, user, 1), false);
                        }
                        if (closestPhotoSizeWithSize2 != null && (photoSize = (TLRPC.PhotoSize) this.f$2) != null && photoSize.location != null) {
                            FileLoader.getInstance(i).getPathToAttach(photoSize.location, true).renameTo(FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize2, true));
                        }
                        PhotoUtilities.applyPhotoToUser(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i).setCurrentUser(user);
                        UserConfig.getInstance(i).saveConfig(true);
                        ((TranscribeButton$$ExternalSyntheticLambda0) this.f$4).run();
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle));
                        String string = LocaleController.getString(R.string.ApplyAvatarHint);
                        INavigationLayout iNavigationLayout = (INavigationLayout) this.f$5;
                        BulletinFactory.of(((ActionBarLayout) iNavigationLayout).getLastFragment()).createUsersBulletin(Collections.singletonList(user), spannableStringBuilderReplaceTags, AndroidUtilities.replaceSingleTag(string, new ArticleViewer$$ExternalSyntheticLambda74(i, iNavigationLayout, 3)), null).show();
                        break;
                    }
                }
                break;
            case 5:
                IArticleViewer iArticleViewer = (IArticleViewer) this.f$0;
                iArticleViewer.loadingChannel = false;
                if (!((ArticleViewer.WebpageAdapter) this.f$1).blocks.isEmpty()) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$2;
                    ArticleViewer.BlockChannelCell blockChannelCell = (ArticleViewer.BlockChannelCell) this.f$5;
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f$4);
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            blockChannelCell.setState(4, false);
                        } else {
                            int i2 = this.f$3;
                            MessagesController.getInstance(i2).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i2).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i2).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            iArticleViewer.loadedChannel = chat;
                            if (!chat.left || chat.kicked) {
                                blockChannelCell.setState(4, false);
                            } else {
                                blockChannelCell.setState(0, false);
                            }
                        }
                    } else {
                        blockChannelCell.setState(4, false);
                    }
                    break;
                }
                break;
            case 6:
                TLObject tLObject2 = (TLObject) this.f$0;
                boolean z = tLObject2 instanceof TLRPC.Updates;
                AlertDialog alertDialog = (AlertDialog) this.f$1;
                GroupCreateActivity$$ExternalSyntheticLambda7 groupCreateActivity$$ExternalSyntheticLambda7 = (GroupCreateActivity$$ExternalSyntheticLambda7) this.f$5;
                int i3 = this.f$3;
                Context context = (Context) this.f$2;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$4;
                int i4 = 0;
                if (z) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i3).putUsers(updates.users, false);
                    MessagesController.getInstance(i3).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = arrayListFindUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i4 < size) {
                        Object obj = arrayListFindUpdatesAndRemove.get(i4);
                        i4++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    alertDialog.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        CallLogActivity.showCallLinkSheet(context, i3, tL_inputGroupCall, groupCall.invite_link, resourcesProvider, true, true);
                        AndroidUtilities.runOnUIThread(groupCreateActivity$$ExternalSyntheticLambda7);
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i3).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i3).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i3).sendRequest(exportgroupcallinvite, new ArticleViewer$$ExternalSyntheticLambda61(alertDialog, context, i3, exportgroupcallinvite, resourcesProvider, groupCreateActivity$$ExternalSyntheticLambda7));
                } else {
                    alertDialog.dismiss();
                    AndroidUtilities.runOnUIThread(groupCreateActivity$$ExternalSyntheticLambda7);
                }
                break;
            case 7:
                new SelectChatUserSheet((Activity) this.f$0, (TLRPC.Chat) this.f$1, (TLRPC.User) this.f$2, new ArticleViewer$$ExternalSyntheticLambda74(this.f$3, (MessagesStorage.BooleanCallback) this.f$4, 18), (Theme.ResourcesProvider) this.f$5).show();
                break;
            case 8:
                ((BackgroundGradientDrawable) this.f$0).lambda$startDitheringInternal$1((Runnable[]) this.f$1, (Bitmap) this.f$2, (IntSize) this.f$4, this.f$3, (zzms[]) this.f$5);
                break;
            case 9:
                ((PollVotesAlert) this.f$0).lambda$new$0((Integer[]) this.f$1, this.f$3, (TLObject) this.f$2, (ArrayList) this.f$4, (TLRPC.PollAnswerVoters) this.f$5);
                break;
            case 10:
                ((ContactAddActivity) this.f$0).lambda$sendPhotoChangedRequest$21((TLRPC.FileLocation) this.f$1, (TLRPC.InputFile) this.f$2, (TLObject) this.f$4, (TLRPC.FileLocation) this.f$5, this.f$3);
                break;
            case 11:
                if (((BillingResult) this.f$0).zza == 0) {
                    BaseFragment baseFragment = (BaseFragment) this.f$5;
                    MessageSendPreview$15$$ExternalSyntheticLambda0 messageSendPreview$15$$ExternalSyntheticLambda0 = new MessageSendPreview$15$$ExternalSyntheticLambda0(4, baseFragment);
                    ?? r2 = (AbstractCollection) this.f$1;
                    int i5 = this.f$3;
                    BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams = (BillingFlowParams$SubscriptionUpdateParams) this.f$2;
                    if (r2 != 0 && !r2.isEmpty() && !UserConfig.getInstance(i5).isPremium()) {
                        for (Purchase purchase : r2) {
                            if (purchase.getProducts().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.zza;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (billingFlowParams$SubscriptionUpdateParams != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i5).sendRequest(tL_payments_assignPlayMarketTransaction, new ArticleViewer$$ExternalSyntheticLambda53(i5, messageSendPreview$15$$ExternalSyntheticLambda0, baseFragment, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new ChatActivity$$ExternalSyntheticLambda211(messageSendPreview$15$$ExternalSyntheticLambda0, 9));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (billingFlowParams$SubscriptionUpdateParams != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i5).sendRequest(tL_payments_canPurchaseStore, new ArticleViewer$$ExternalSyntheticLambda61(baseFragment, tL_inputStorePaymentPremiumSubscription2, (PremiumPreviewFragment.SubscriptionTier) this.f$4, billingFlowParams$SubscriptionUpdateParams, i5, tL_payments_canPurchaseStore));
                }
                break;
            case 12:
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                TLObject tLObject3 = (TLObject) this.f$1;
                boolean z2 = tLObject3 instanceof TLRPC.ChatInvite;
                BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$2;
                Theme.ResourcesProvider resourcesProvider2 = (Theme.ResourcesProvider) this.f$4;
                if (z2) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject3;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new BulletinFactory(bottomSheetArr[0].topBulletinContainer, resourcesProvider2).createErrorBulletin(LocaleController.getString(R.string.UnknownError), null).show(false);
                    } else {
                        final long j = tL_starsSubscriptionPricing.amount;
                        final int i6 = this.f$3;
                        StarsController.getInstance(i6, false).subscribeTo(((TLRPC.TL_messages_checkChatInvite) this.f$5).hash, chatInvite, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                Long l = (Long) obj3;
                                if (!"paid".equals((String) obj2) || l.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new ChatMessageCell$$ExternalSyntheticLambda5(l, i6, j, 7));
                            }
                        });
                    }
                } else {
                    new BulletinFactory(bottomSheetArr[0].topBulletinContainer, resourcesProvider2).createErrorBulletin(LocaleController.getString(R.string.LinkHashExpired), null).show(false);
                }
                break;
            case 13:
                ((StoryContainsEmojiButton) this.f$0).lambda$load$1((TLObject) this.f$1, this.f$2, (ArrayList) this.f$4, (boolean[]) this.f$5, this.f$3);
                break;
            default:
                String str = (String) this.f$1;
                TLObject tLObject4 = (TLObject) this.f$2;
                int i7 = this.f$3;
                BotWebViewContainer.MyWebView myWebView = (BotWebViewContainer.MyWebView) this.f$5;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str);
                    if (tLObject4 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject4).data).nextValue());
                    } else {
                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$4;
                        if (tL_error2 != null) {
                            jSONObject.put("error", tL_error2.text);
                        }
                    }
                    BotWebViewContainer.notifyEvent(i7, myWebView, "custom_method_invoked", jSONObject);
                } catch (Exception e) {
                    FileLog.e(e);
                    botWebViewContainer.unknownError(null);
                }
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$3 = i;
        this.f$5 = obj5;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, TLObject tLObject, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$2 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
        this.f$3 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, BaseFragment baseFragment, int i) {
        this.$r8$classId = 3;
        this.f$0 = mediaDataController;
        this.f$1 = zArr;
        this.f$4 = arrayList;
        this.f$2 = context;
        this.f$5 = baseFragment;
        this.f$3 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(PollVotesAlert pollVotesAlert, Integer[] numArr, int i, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.$r8$classId = 9;
        this.f$0 = pollVotesAlert;
        this.f$1 = numArr;
        this.f$3 = i;
        this.f$2 = tLObject;
        this.f$4 = arrayList;
        this.f$5 = pollAnswerVoters;
    }
}
