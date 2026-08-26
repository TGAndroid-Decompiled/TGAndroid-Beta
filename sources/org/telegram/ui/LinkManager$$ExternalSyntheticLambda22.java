package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Storage.CacheModel;

public final class LinkManager$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public LinkManager$$ExternalSyntheticLambda22(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$2 = tLObject;
        this.f$3 = obj;
        this.f$1 = tL_error;
        this.f$4 = tLObject2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleInvoiceSlug$16((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLRPC.TL_inputInvoiceSlug) this.f$3, (String) this.f$4);
                break;
            case 1:
                ((ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3) this.f$0).lambda$needOpenInviteLink$1((TLRPC.TL_chatInviteExported) this.f$1, (TLRPC.TL_messages_exportedChatInvite) this.f$2, (boolean[]) this.f$3, (AlertDialog) this.f$4);
                break;
            case 2:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressCustomBotButton$24((TLRPC.Message) this.f$1, (AlertDialog[]) this.f$2, (MessageObject) this.f$3, (OAuthSheet$$ExternalSyntheticLambda18) this.f$4);
                break;
            case 3:
                ((ChatUsersActivity.SearchAdapter) this.f$0).lambda$updateSearchResults$4((ArrayList) this.f$1, (LongSparseArray) this.f$2, (ArrayList) this.f$3, (ArrayList) this.f$4);
                break;
            case 4:
                ((PassportActivity.AnonymousClass3) this.f$0).lambda$onItemClick$5((TLRPC.TL_error) this.f$1, (Runnable) this.f$2, (PassportActivity.ErrorRunnable) this.f$3, (TL_account.verifyEmail) this.f$4);
                break;
            case 5:
                ((PhotoViewer.AnonymousClass77) this.f$0).lambda$onPreDraw$0((ClippingImageView[]) this.f$1, (ArrayList) this.f$2, (Integer) this.f$3, (PhotoViewer.PhotoViewerProvider) this.f$4);
                break;
            case 6:
                ((PrivacyControlActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$2((TLObject) this.f$2, (TLRPC.UserFull) this.f$3, (TL_account.TL_birthday) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 7:
                ((CachedMediaLayout) this.f$0).lambda$checkMessageObjectForAudio$2((CacheModel.FileInfo) this.f$1, (TLRPC.TL_documentAttributeAudio) this.f$2, (String) this.f$4, (String) this.f$3);
                break;
            case 8:
                ((ChangeBioActivity) this.f$0).lambda$saveName$2((AlertDialog) this.f$1, (TLRPC.UserFull) this.f$2, (String) this.f$4, (TLRPC.User) this.f$3);
                break;
            case 9:
                ((ChangeUsernameActivity) this.f$0).lambda$checkUserName$3((String) this.f$4, (TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TL_account.checkUsername) this.f$3);
                break;
            case 10:
                ((ChannelColorActivity) this.f$0).lambda$buttonClick$6((boolean[]) this.f$2, (int[]) this.f$3, (int[]) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 11:
                ((ChannelCreateActivity) this.f$0).lambda$checkUserName$22((String) this.f$4, (TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLRPC.TL_channels_checkUsername) this.f$3);
                break;
            case 12:
                ((ChatActivity) this.f$0).lambda$createMenu$275((boolean[]) this.f$1, (boolean[]) this.f$2, (ImageView) this.f$3, (ImageView) this.f$4);
                break;
            case 13:
                ((ChatEditTypeActivity) this.f$0).lambda$checkUserName$23((String) this.f$4, (TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLRPC.TL_channels_checkUsername) this.f$3);
                break;
            case 14:
                ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$19((TLRPC.TL_error) this.f$1, (TLRPC.InputCheckPasswordSRP) this.f$2, (TwoStepVerificationActivity) this.f$3, (TLRPC.TL_channels_editCreator) this.f$4);
                break;
            case 15:
                ((ContentPreviewViewer) this.f$0).lambda$getMyStickersRemote$16((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (List) this.f$3, (TLRPC.TL_messages_getMyStickers) this.f$4);
                break;
            case 16:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$46((TLObject) this.f$2, (TLRPC.UserFull) this.f$3, (TL_account.TL_birthday) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 17:
                ((GroupCallActivity) this.f$0).lambda$openShareConferenceLink$81((AlertDialog) this.f$3, (TLObject) this.f$2, (TL_phone.exportGroupCallInvite) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 18:
                ((GroupCallActivity) this.f$0).lambda$new$18((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (String) this.f$4);
                break;
            case 19:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$104((TLObject) this.f$2, (AlertDialog) this.f$3, (Runnable) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 20:
                ((LaunchActivity) this.f$0).lambda$processAttachMenuBot$127((DialogsActivity) this.f$1, (BaseFragment) this.f$2, (TLRPC.User) this.f$3, (String) this.f$4);
                break;
            case 21:
                ((LaunchActivity) this.f$0).lambda$handleIntent$13((TLObject) this.f$2, (TLRPC.TL_messages_requestUrlAuth) this.f$3, (String) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 22:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$101((Runnable) this.f$3, (TLObject) this.f$2, (TLRPC.TL_wallPaper) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 23:
                ((LoginActivity) this.f$0).lambda$tryResetAccount$31((TLRPC.TL_error) this.f$1, (String) this.f$4, (String) this.f$2, (String) this.f$3);
                break;
            case 24:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$new$9((TLObject) this.f$2, (Bundle) this.f$3, (TLRPC.TL_error) this.f$1, (TLRPC.TL_auth_resendCode) this.f$4);
                break;
            case 25:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$onNextPressed$7((TLObject) this.f$2, (Bundle) this.f$3, (TLRPC.TL_error) this.f$1, (TL_account.sendVerifyEmailCode) this.f$4);
                break;
            case 26:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$onNextPressed$5((TLObject) this.f$2, (Bundle) this.f$3, (TLRPC.TL_error) this.f$1, (TL_account.verifyEmail) this.f$4);
                break;
            case 27:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$10((TLObject) this.f$2, (TLRPC.TL_inputInvoicePremiumAuthCode) this.f$3, (TLRPC.TL_inputStorePaymentAuthCode) this.f$4, (TLRPC.TL_error) this.f$1);
                break;
            case 28:
                ((MessageStatisticActivity) this.f$0).lambda$loadStat$9((TLRPC.TL_error) this.f$1, (ChartData) this.f$2, (String) this.f$4, (TL_stats.TL_loadAsyncGraph) this.f$3);
                break;
            default:
                ((NewContactBottomSheet) this.f$0).lambda$done$22((TLRPC.TL_contacts_importedContacts) this.f$2, (TLRPC.TL_inputPhoneContact) this.f$3, (TLRPC.TL_error) this.f$1, (TLRPC.TL_contacts_importContacts) this.f$4);
                break;
        }
    }

    public LinkManager$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public LinkManager$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$1 = tL_error;
    }

    public LinkManager$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3, String str, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = str;
        this.f$3 = obj4;
    }

    public LinkManager$$ExternalSyntheticLambda22(Object obj, Object obj2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$2 = tLObject;
        this.f$4 = tLObject2;
        this.f$1 = tL_error;
    }

    public LinkManager$$ExternalSyntheticLambda22(BaseFragment baseFragment, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$4 = str;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tLObject2;
    }

    public LinkManager$$ExternalSyntheticLambda22(LoginActivity loginActivity, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        this.$r8$classId = 23;
        this.f$0 = loginActivity;
        this.f$1 = tL_error;
        this.f$4 = str;
        this.f$2 = str2;
        this.f$3 = str3;
    }
}
