package org.telegram.ui;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimatedTextView.AnimatedTextDrawable.Part;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda11;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda50;
import org.telegram.ui.Components.TranscribeButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class VoIPFragment$$ExternalSyntheticLambda37 implements ImageUpdater.ImageUpdaterDelegate, AlertDialog.OnButtonClickListener, AnimatedTextView.AnimatedTextDrawable.RegionCallback, BillingController.ProductDetailsResponseListenerLegacy, RecyclerListView.OnItemLongClickListener, MessagesStorage.BooleanCallback, PurchasesResponseListener, VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public VoIPFragment$$ExternalSyntheticLambda37(int i, TranscribeButton$$ExternalSyntheticLambda0 transcribeButton$$ExternalSyntheticLambda0, INavigationLayout iNavigationLayout, ImageUpdater imageUpdater) {
        this.$r8$classId = 1;
        this.f$1 = i;
        this.f$0 = transcribeButton$$ExternalSyntheticLambda0;
        this.f$2 = iNavigationLayout;
        this.f$3 = imageUpdater;
    }

    @Override
    public boolean canFinishFragment() {
        return true;
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
    }

    @Override
    public void didUploadFailed() {
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        final TranscribeButton$$ExternalSyntheticLambda0 transcribeButton$$ExternalSyntheticLambda0 = (TranscribeButton$$ExternalSyntheticLambda0) this.f$0;
        final ImageUpdater imageUpdater = (ImageUpdater) this.f$3;
        final int i = this.f$1;
        final INavigationLayout iNavigationLayout = (INavigationLayout) this.f$2;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                TLRPC.InputFile inputFile3 = inputFile;
                if (inputFile3 != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile3;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile4 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile4;
                    int i2 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i2 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i3 = i;
                ConnectionsManager.getInstance(i3).sendRequest(tL_photos_uploadProfilePhoto, new GroupCallSheet$$ExternalSyntheticLambda0(i3, photoSize2, photoSize, transcribeButton$$ExternalSyntheticLambda0, iNavigationLayout, 2));
                ChatAttachAlert chatAttachAlert = imageUpdater.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.onPause();
                }
            }
        });
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        TLObject tLObject;
        int i2 = 0;
        int i3 = this.f$1;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        int i4 = 1;
        switch (this.$r8$classId) {
            case 2:
                final ChangeUsernameActivity.AnonymousClass2 anonymousClass2 = (ChangeUsernameActivity.AnonymousClass2) obj3;
                anonymousClass2.getClass();
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                final boolean z = tL_username.active;
                final String str = tL_username.username;
                final boolean z2 = !z;
                ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
                long j = changeUsernameActivity.botId;
                if (j == 0) {
                    TL_account.toggleUsername toggleusername = new TL_account.toggleUsername();
                    toggleusername.username = str;
                    toggleusername.active = z2;
                    tLObject = toggleusername;
                } else {
                    TL_bots.toggleUsername toggleusername2 = new TL_bots.toggleUsername();
                    toggleusername2.bot = MessagesController.getInstance(((BaseFragment) changeUsernameActivity).currentAccount).getInputUser(j);
                    toggleusername2.username = str;
                    toggleusername2.active = z2;
                    tLObject = toggleusername2;
                }
                ConnectionsManager connectionsManager = changeUsernameActivity.getConnectionsManager();
                final int i5 = this.f$1;
                connectionsManager.sendRequest(tLObject, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        ChangeUsernameActivity.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        anonymousClass3.getClass();
                        AndroidUtilities.runOnUIThread(new ChangeUsernameActivity$2$$ExternalSyntheticLambda3(anonymousClass3, str, tLObject2, i5, z2, tL_error, tL_username, z));
                    }
                });
                changeUsernameActivity.loadingUsernames.add(tL_username.username);
                ((ChangeUsernameActivity.UsernameCell) ((View) obj)).setLoading(true);
                break;
            case 4:
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = (CreateRtmpStreamBottomSheet) obj3;
                createRtmpStreamBottomSheet.getClass();
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj2;
                if (!buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i3).sendRequest(getgroupcallstreamrtmpurl, new CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1(createRtmpStreamBottomSheet, buttonWithCounterView, i2));
                    break;
                }
                break;
            case 7:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) obj3;
                AlertDialog[] alertDialogArr = {new AlertDialog(sharedMediaLayout.getContext(), 3, (Theme.ResourcesProvider) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                MessageObject messageObject = (MessageObject) obj;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                tL_poll.id = poll.id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i6 = this.f$1;
                tL_messages_editMessage.peer = MessagesController.getInstance(i6).getInputPeer(sharedMediaLayout.dialog_id);
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda50(alertDialogArr, i6, ConnectionsManager.getInstance(i6).sendRequest(tL_messages_editMessage, new ArticleViewer$$ExternalSyntheticLambda53(sharedMediaLayout, alertDialogArr, i6, tL_messages_editMessage, 3)), i4), 500L);
                break;
            default:
                ((PasskeysActivity) obj3).lambda$openMenu$2((TL_account.Passkey) obj2, (String) obj, i3);
                break;
        }
    }

    @Override
    public void onClicked(VoIpSwitchLayout.VoIpButtonView voIpButtonView) {
        VoIPFragment voIPFragment = (VoIPFragment) this.f$0;
        voIPFragment.getClass();
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment.hideUIRunnable);
            voIPFragment.hideUiRunnableWaiting = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(voIPFragment.activity, false, Integer.valueOf(this.f$1));
            voIPFragment.setSpeakerPhoneAction((VoIpSwitchLayout) this.f$2, (VoIPService) this.f$3);
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        SearchTagsList searchTagsList = (SearchTagsList) this.f$0;
        if (i >= 0) {
            ArrayList arrayList = searchTagsList.items;
            if (i < arrayList.size()) {
                int i2 = this.f$1;
                if (UserConfig.getInstance(i2).isPremium()) {
                    boolean zIsPremium = UserConfig.getInstance(i2).isPremium();
                    BaseFragment baseFragment = (BaseFragment) this.f$2;
                    if (!zIsPremium) {
                        new PremiumFeatureBottomSheet(baseFragment, 24, true).show();
                        return true;
                    }
                    SearchTagsList.TagButton.AnonymousClass1 anonymousClass1 = ((SearchTagsList.TagButton) view).reactionButton;
                    if (anonymousClass1 != null) {
                        anonymousClass1.startAnimation();
                    }
                    SearchTagsList.Item item = (SearchTagsList.Item) arrayList.get(i);
                    ItemOptions itemOptions = new ItemOptions(baseFragment, view, false, true);
                    itemOptions.gravity = 3;
                    itemOptions.add(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(item.name) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new ArticleViewer$$ExternalSyntheticLambda71(searchTagsList, i2, item, (Theme.ResourcesProvider) this.f$3, 21), false);
                    itemOptions.show();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = (ArrayList) this.f$0;
            if (!zHasNext) {
                AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda11((TLRPC.Chat) this.f$2, this.f$1, arrayList, (Utilities.Callback) this.f$3, 1));
                return;
            }
            ProductDetails productDetails = (ProductDetails) it.next();
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                String str = tL_premiumGiftCodeOption.store_product;
                if (str != null && str.equals(productDetails.zzc)) {
                    tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                    tL_premiumGiftCodeOption.currency = oneTimePurchaseOfferDetails.zzc;
                    break;
                }
            }
        }
    }

    @Override
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(billingResult, (BaseFragment) this.f$0, list, this.f$1, (BillingFlowParams$SubscriptionUpdateParams) this.f$2, (PremiumPreviewFragment.SubscriptionTier) this.f$3));
    }

    @Override
    public void onUploadProgressChanged(float f) {
    }

    @Override
    public void run(CharSequence charSequence) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.f$0;
        StaticLayout staticLayoutMakeLayout = animatedTextDrawable.makeLayout(this.f$1 - ((int) Math.ceil(Math.min(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth))), charSequence);
        float f = animatedTextDrawable.currentWidth;
        ArrayList arrayList = (ArrayList) this.f$2;
        AnimatedTextView.AnimatedTextDrawable.Part part = animatedTextDrawable.new Part(staticLayoutMakeLayout, f, arrayList.size());
        AnimatedTextView.AnimatedTextDrawable.Part part2 = animatedTextDrawable.new Part(staticLayoutMakeLayout, animatedTextDrawable.oldWidth, arrayList.size());
        ((ArrayList) this.f$3).add(part);
        arrayList.add(part2);
        float f2 = animatedTextDrawable.currentWidth;
        float f3 = part.width;
        animatedTextDrawable.currentWidth = f2 + f3;
        animatedTextDrawable.oldWidth += f3;
        animatedTextDrawable.currentHeight = Math.max(animatedTextDrawable.currentHeight, staticLayoutMakeLayout.getHeight());
        animatedTextDrawable.oldHeight = Math.max(animatedTextDrawable.oldHeight, staticLayoutMakeLayout.getHeight());
    }

    @Override
    public boolean supportsBulletin() {
        return false;
    }

    public VoIPFragment$$ExternalSyntheticLambda37(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public VoIPFragment$$ExternalSyntheticLambda37(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
        this.f$3 = obj3;
    }

    public VoIPFragment$$ExternalSyntheticLambda37(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = i;
    }

    @Override
    public void run(boolean z) {
        DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
        dialogsActivity.getClass();
        ArrayList arrayList = (ArrayList) this.f$2;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView undoView = dialogsActivity.getUndoView();
        int i = this.f$1;
        if (undoView != null) {
            undoView.showWithAction(arrayList2, i == 102 ? 27 : 26, (Object) null, (Object) null, new DialogsActivity$$ExternalSyntheticLambda87(dialogsActivity, i, arrayList2, z, (HashSet) this.f$3), (Runnable) null);
        }
        dialogsActivity.hideActionMode$1(i == 103);
    }
}
