package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LinkManager$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LinkManager$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleInvoiceSlug$17((TLRPC.TL_inputInvoiceSlug) this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$4((AlertDialog) this.f$1, (MessagesController.DialogFilter) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((GroupStickersActivity.SearchAdapter) this.f$0).lambda$onSearchStickers$1((String) this.f$2, (String) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((MessageStatisticActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$onZoomed$1((String) this.f$2, (StatisticActivity.ZoomCancelable) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$18((UserConfig) this.f$1, (TLRPC.Photo) this.f$2, tLObject, tL_error);
                break;
            case 5:
                ((PrivacyControlActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$3((TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tLObject, tL_error);
                break;
            case 6:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$11((UserConfig) this.f$1, (TLRPC.Photo) this.f$2, tLObject, tL_error);
                break;
            case 7:
                ((TopicCreateFragment.AnonymousClass1) this.f$0).lambda$onItemClick$1((String) this.f$2, (AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((ChangeUsernameActivity) this.f$0).lambda$saveName$10((AlertDialog) this.f$1, (TL_account.updateUsername) this.f$2, tLObject, tL_error);
                break;
            case 9:
                ((ChangeUsernameActivity) this.f$0).lambda$checkUserName$4((String) this.f$2, (TL_account.checkUsername) this.f$1, tLObject, tL_error);
                break;
            case 10:
                ((ChannelCreateActivity) this.f$0).lambda$checkUserName$23((String) this.f$2, (TLRPC.TL_channels_checkUsername) this.f$1, tLObject, tL_error);
                break;
            case 11:
                ((ChatActivity) this.f$0).lambda$didPressPhoneNumber$459((Browser.Progress) this.f$1, (ChatActivity$$ExternalSyntheticLambda129) this.f$2, tLObject, tL_error);
                break;
            case 12:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$343((AlertDialog[]) this.f$1, (TLRPC.TL_messages_editMessage) this.f$2, tLObject, tL_error);
                break;
            case 13:
                ((ChatActivity) this.f$0).lambda$createMenu$274((ChatActivity$$ExternalSyntheticLambda5) this.f$1, (long[]) this.f$2, tLObject, tL_error);
                break;
            case 14:
                ((ChatEditTypeActivity) this.f$0).lambda$checkUserName$24((String) this.f$2, (TLRPC.TL_channels_checkUsername) this.f$1, tLObject, tL_error);
                break;
            case 15:
                ((ContentPreviewViewer) this.f$0).lambda$getMyStickersRemote$17((List) this.f$1, (TLRPC.TL_messages_getMyStickers) this.f$2, tLObject, tL_error);
                break;
            case 16:
                ((DialogsActivity) this.f$0).lambda$showItemOptions$169((TLRPC.TL_attachMenuBot) this.f$1, (LaunchActivity) this.f$2, tLObject, tL_error);
                break;
            case 17:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$47((TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tLObject, tL_error);
                break;
            case 18:
                ((GroupCallActivity) this.f$0).lambda$openShareConferenceLink$82((AlertDialog) this.f$1, (TL_phone.exportGroupCallInvite) this.f$2, tLObject, tL_error);
                break;
            case 19:
                GroupCallActivity.lambda$new$20((ArrayList) this.f$0, (ArrayList) this.f$1, (LinkManager$$ExternalSyntheticLambda22) this.f$2, tLObject, tL_error);
                break;
            case 20:
                ((GroupCallActivity) this.f$0).lambda$new$44((TLRPC.Chat) this.f$1, (TLRPC.InputPeer) this.f$2, tLObject, tL_error);
                break;
            case 21:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$102((LinkManager$$ExternalSyntheticLambda2) this.f$1, (TLRPC.TL_wallPaper) this.f$2, tLObject, tL_error);
                break;
            case 22:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$105((AlertDialog) this.f$1, (LinkManager$$ExternalSyntheticLambda2) this.f$2, tLObject, tL_error);
                break;
            case 23:
                ((LaunchActivity) this.f$0).lambda$handleIntent$14((TLRPC.TL_messages_requestUrlAuth) this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 24:
                ((LocationActivity) this.f$0).lambda$createView$14((AlertDialog[]) this.f$1, (TLRPC.TL_messageMediaVenue) this.f$2, tLObject, tL_error);
                break;
            case 25:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$new$10((Bundle) this.f$1, (TLRPC.TL_auth_resendCode) this.f$2, tLObject, tL_error);
                break;
            case 26:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$onNextPressed$6((Bundle) this.f$1, (TL_account.verifyEmail) this.f$2, tLObject, tL_error);
                break;
            case 27:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$onNextPressed$8((Bundle) this.f$1, (TL_account.sendVerifyEmailCode) this.f$2, tLObject, tL_error);
                break;
            case 28:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$11((TLRPC.TL_inputInvoicePremiumAuthCode) this.f$1, (TLRPC.TL_inputStorePaymentAuthCode) this.f$2, tLObject, tL_error);
                break;
            default:
                ((MessageStatisticActivity) this.f$0).lambda$loadStat$10((String) this.f$2, (TL_stats.TL_loadAsyncGraph) this.f$1, tLObject, tL_error);
                break;
        }
    }

    public LinkManager$$ExternalSyntheticLambda0(Object obj, String str, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = str;
        this.f$1 = obj2;
    }
}
