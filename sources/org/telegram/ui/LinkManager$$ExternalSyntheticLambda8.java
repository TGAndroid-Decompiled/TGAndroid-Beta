package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TermsOfServiceView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Gifts.ResaleGiftsFragment;

public final class LinkManager$$ExternalSyntheticLambda8 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public LinkManager$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i = 21;
        int i2 = 17;
        int i3 = 4;
        int i4 = 2;
        int i5 = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) obj2;
                linkManager.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(linkManager, tLObject, (String) obj, i5));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(obj2, (Object) tL_error, tLObject, obj, 12));
                break;
            case 2:
                LinkActionView linkActionView = (LinkActionView) obj2;
                linkActionView.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(linkActionView, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((StickerMakerView) obj2, tLObject, (StickerMakerView.StickerUploader) obj, tL_error, 18));
                break;
            case 4:
                PollVotesAlert pollVotesAlert = (PollVotesAlert) obj2;
                pollVotesAlert.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(pollVotesAlert, (PollVotesAlert.VotesList) obj, tLObject, 19));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(tLObject, (MessagesController) obj2, (SelectorBottomSheet$$ExternalSyntheticLambda7) obj, i));
                break;
            case 6:
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    ((MessagesController) obj2).putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    while (i5 < tL_contacts_found.users.size()) {
                        TLRPC.User user = tL_contacts_found.users.get(i5);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList.add(user);
                        }
                        i5++;
                    }
                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(24, (OAuthSheet$$ExternalSyntheticLambda13) obj, arrayList));
                }
                break;
            case 7:
                ShareAlert shareAlert = (ShareAlert) obj2;
                shareAlert.getClass();
                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(shareAlert, tLObject, (Context) obj, i5));
                break;
            case 8:
                StickersAlert stickersAlert = (StickersAlert) obj2;
                stickersAlert.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) stickersAlert, (Object) tL_error, tLObject, obj, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(obj2, (Object) tL_error, tLObject, obj, 24));
                break;
            case 10:
                TermsOfServiceView termsOfServiceView = (TermsOfServiceView) obj2;
                termsOfServiceView.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) termsOfServiceView, obj, tLObject, (Object) tL_error, 25));
                break;
            case 11:
                TranslateAlert2 translateAlert2 = (TranslateAlert2) obj2;
                translateAlert2.getClass();
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) translateAlert2, (Object) tL_error, tLObject, obj, 27));
                break;
            case 12:
                EmojiAnimationsOverlay emojiAnimationsOverlay = (EmojiAnimationsOverlay) obj2;
                emojiAnimationsOverlay.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(emojiAnimationsOverlay, tLObject, (MessageObject) obj, i2));
                break;
            case 13:
                FilterChatlistActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (FilterChatlistActivity.ListAdapter.AnonymousClass1) obj2;
                anonymousClass1.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(27, anonymousClass1, (AlertDialog) obj));
                break;
            case 14:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) obj2;
                filterCreateActivity.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(i4, filterCreateActivity, (AlertDialog) obj));
                break;
            case 15:
                FilterCreateActivity.LinkCell linkCell = (FilterCreateActivity.LinkCell) obj2;
                linkCell.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(linkCell, tL_error, (FilterCreateActivity$LinkCell$$ExternalSyntheticLambda2) obj, i));
                break;
            case 16:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(i3, filtersSetupActivity, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5((SharedMediaLayout.AnonymousClass13) obj2, tL_error, (BaseFragment) obj, 23));
                break;
            case 18:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = (ResaleGiftsFragment.ResaleGiftsList) obj2;
                resaleGiftsList.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(resaleGiftsList, tLObject, (TL_stars.getResaleStarGifts) obj, 26));
                break;
            case 19:
                GroupCallActivity.AvatarUpdaterDelegate avatarUpdaterDelegate = (GroupCallActivity.AvatarUpdaterDelegate) obj2;
                avatarUpdaterDelegate.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(avatarUpdaterDelegate, tL_error, tLObject, (String) obj, 3));
                break;
            case 20:
                GroupStickersActivity.AddEmojiCell.AnonymousClass1 anonymousClass2 = (GroupStickersActivity.AddEmojiCell.AnonymousClass1) obj2;
                if (Objects.equals(GroupStickersActivity.AddEmojiCell.this.lastQuery, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(i2, anonymousClass2, tLObject));
                    break;
                }
                break;
            case 21:
                IntroActivity introActivity = (IntroActivity) obj2;
                introActivity.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(introActivity, (TLRPC.TL_langPackString) langPackString, (String) obj, i5));
                        }
                        break;
                    }
                }
                break;
            case 22:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12((AlertDialog) obj2, tLObject, (ActionIntroActivity) obj, tL_error, 7));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21((LaunchActivity) obj2, tLObject, (Theme.ThemeInfo) obj, i3));
                break;
            case 24:
                LinkManager.AnonymousClass1 anonymousClass3 = (LinkManager.AnonymousClass1) obj2;
                anonymousClass3.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(anonymousClass3, tLObject, (TLRPC.User) obj, 6));
                break;
            case 25:
                LinkManager.AnonymousClass1 anonymousClass4 = (LinkManager.AnonymousClass1) obj2;
                anonymousClass4.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(anonymousClass4, tLObject, (HashSet) obj, tL_error, 8));
                break;
            case 26:
                LoginActivity loginActivity = (LoginActivity) obj2;
                loginActivity.getClass();
                if (tLObject == null || (((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda8(loginActivity, i4));
                } else {
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginActivity, (Bundle) obj, tLObject, false, 10));
                }
                break;
            case 27:
                LoginActivity.LoginActivityRecoverView loginActivityRecoverView = (LoginActivity.LoginActivityRecoverView) obj2;
                loginActivityRecoverView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(loginActivityRecoverView, tLObject, (String) obj, tL_error, 11));
                break;
            case 28:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) obj2;
                loginActivitySmsView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(loginActivitySmsView, tL_error, (TL_account.confirmPhone) obj, 15));
                break;
            default:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) obj2;
                phoneView.getClass();
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(phoneView, tLObject, (HashMap) obj, 20));
                break;
        }
    }
}
