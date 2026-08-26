package org.telegram.ui;

import android.text.SpannableString;
import com.google.android.exoplayer2.util.Consumer;
import com.google.zxing.BinaryBitmap;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;

public final class GroupCallActivity$$ExternalSyntheticLambda88 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$3;
    public final long f$4;
    public final Object f$5;

    public GroupCallActivity$$ExternalSyntheticLambda88(ChatActivityEnterView.AnonymousClass79 anonymousClass79, EditTextCaption editTextCaption, String str, TLRPC.Document document, long j, boolean z) {
        this.f$0 = anonymousClass79;
        this.f$1 = editTextCaption;
        this.f$3 = str;
        this.f$5 = document;
        this.f$4 = j;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        AnimatedEmojiSpan animatedEmojiSpan;
        long j = this.f$4;
        boolean z = this.f$2;
        Object obj = this.f$5;
        Object obj2 = this.f$3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((GroupCallActivity) obj4).lambda$inviteUserToCall$62((AlertDialog[]) obj3, this.f$2, (TLRPC.TL_error) obj2, this.f$4, (TL_phone.inviteToGroupCall) obj);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                EditTextCaption editTextCaption = (EditTextCaption) obj3;
                if (editTextCaption == null) {
                    return;
                }
                int selectionEnd = editTextCaption.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    chatActivityEnterView.innerTextChange = 2;
                    String str = (String) obj2;
                    if (str == null) {
                        str = "😀";
                    }
                    SpannableString spannableString = new SpannableString(str);
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, editTextCaption.getPaint().getFontMetricsInt());
                        animatedEmojiSpan.document = document;
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, editTextCaption.getPaint().getFontMetricsInt());
                    }
                    if (!z) {
                        animatedEmojiSpan.fromEmojiKeyboard = true;
                    }
                    animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    editTextCaption.setText(editTextCaption.getText().insert(selectionEnd, spannableString));
                    editTextCaption.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                } finally {
                    chatActivityEnterView.innerTextChange = 0;
                }
            case 2:
                final ProfileActivity.AnonymousClass6 anonymousClass6 = (ProfileActivity.AnonymousClass6) obj4;
                ProfileActivity profileActivity = ProfileActivity.this;
                ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(profileActivity.userId, -j, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z, null);
                final DialogsActivity dialogsActivity = (DialogsActivity) obj;
                chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                    @Override
                    public final void didChangeOwner(TLRPC.User user) {
                    }

                    @Override
                    public final void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str2) {
                        AnonymousClass6 anonymousClass7 = AnonymousClass6.this;
                        ProfileActivity.this.disableProfileAnimation = true;
                        dialogsActivity.removeSelfFromStack();
                        NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                        ProfileActivity profileActivity2 = ProfileActivity.this;
                        int i2 = NotificationCenter.closeChats;
                        notificationCenter.removeObserver(profileActivity2, i2);
                        ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                    }
                };
                profileActivity.presentFragment(chatRightsEditActivity);
                return;
            case 3:
                BotStarsActivity botStarsActivity = (BotStarsActivity) obj4;
                botStarsActivity.getClass();
                if (((TLRPC.TL_error) obj2) == null) {
                    TL_account.Password password = (TL_account.Password) ((TLObject) obj3);
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    twoStepVerificationActivity.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    botStarsActivity.initWithdraw(this.f$2, this.f$4, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                PeerStoriesView peerStoriesView = (PeerStoriesView) obj4;
                peerStoriesView.getClass();
                final MessagesController messagesController = (MessagesController) obj3;
                StoriesController storiesController = messagesController.getStoriesController();
                final long j2 = this.f$4;
                final boolean z2 = this.f$2;
                storiesController.toggleHidden(j2, z2, false);
                BinaryBitmap binaryBitmap = new BinaryBitmap(24);
                final int i = 0;
                binaryBitmap.binarizer = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                messagesController.getStoriesController().toggleHidden(j2, !z2, false);
                                break;
                            default:
                                messagesController.getStoriesController().toggleHidden(j2, z2, true);
                                break;
                        }
                    }
                };
                final int i2 = 1;
                binaryBitmap.matrix = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                messagesController.getStoriesController().toggleHidden(j2, !z2, false);
                                break;
                            default:
                                messagesController.getStoriesController().toggleHidden(j2, z2, true);
                                break;
                        }
                    }
                };
                String str2 = (String) obj2;
                Bulletin bulletinCreateUsersBulletin = new BulletinFactory(peerStoriesView.topBulletinContainer, peerStoriesView.resourcesProvider).createUsersBulletin(Arrays.asList((TLObject) obj), !z2 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str2, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str2, null, 10))), null, binaryBitmap);
                bulletinCreateUsersBulletin.tag = 2;
                bulletinCreateUsersBulletin.show(true);
                return;
            default:
                StoriesController storiesController2 = (StoriesController) obj4;
                storiesController2.getClass();
                Consumer consumer = (Consumer) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    consumer.accept(Boolean.TRUE);
                    return;
                }
                if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                    if (!z) {
                        consumer.accept(Boolean.FALSE);
                        return;
                    }
                    MessagesController messagesController2 = MessagesController.getInstance(storiesController2.currentAccount);
                    ChannelBoostsController boostsController = messagesController2.getBoostsController();
                    long j3 = this.f$4;
                    boostsController.getBoostsStats(j3, new ChatEditActivity$$ExternalSyntheticLambda65(storiesController2, consumer, messagesController2, j3, 3));
                    return;
                }
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (z && lastFragment != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), 0, (Theme.ResourcesProvider) obj);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                    }
                    consumer.accept(Boolean.FALSE);
                    return;
                }
                if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                    BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                    if (bulletinFactoryGlobal != null) {
                        bulletinFactoryGlobal.showForError(false, tL_error);
                    }
                    consumer.accept(Boolean.FALSE);
                    return;
                }
                BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                if (z && lastFragment2 != null) {
                    lastFragment2.showDialog(new PremiumFeatureBottomSheet(lastFragment2, lastFragment2.getContext(), lastFragment2.getCurrentAccount(), false, 14, true, null));
                }
                consumer.accept(Boolean.FALSE);
                return;
        }
    }

    public GroupCallActivity$$ExternalSyntheticLambda88(GroupCallActivity groupCallActivity, AlertDialog[] alertDialogArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f$0 = groupCallActivity;
        this.f$1 = alertDialogArr;
        this.f$2 = z;
        this.f$3 = tL_error;
        this.f$4 = j;
        this.f$5 = invitetogroupcall;
    }

    public GroupCallActivity$$ExternalSyntheticLambda88(ProfileActivity.AnonymousClass6 anonymousClass6, long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z, DialogsActivity dialogsActivity) {
        this.f$0 = anonymousClass6;
        this.f$4 = j;
        this.f$1 = tL_chatAdminRights;
        this.f$3 = str;
        this.f$2 = z;
        this.f$5 = dialogsActivity;
    }

    public GroupCallActivity$$ExternalSyntheticLambda88(BotStarsActivity botStarsActivity, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, long j) {
        this.f$0 = botStarsActivity;
        this.f$3 = tL_error;
        this.f$1 = tLObject;
        this.f$5 = twoStepVerificationActivity;
        this.f$2 = z;
        this.f$4 = j;
    }

    public GroupCallActivity$$ExternalSyntheticLambda88(PeerStoriesView peerStoriesView, MessagesController messagesController, long j, boolean z, String str, TLObject tLObject) {
        this.f$0 = peerStoriesView;
        this.f$1 = messagesController;
        this.f$4 = j;
        this.f$2 = z;
        this.f$3 = str;
        this.f$5 = tLObject;
    }

    public GroupCallActivity$$ExternalSyntheticLambda88(StoriesController storiesController, TLRPC.TL_error tL_error, boolean z, long j, Consumer consumer, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = storiesController;
        this.f$3 = tL_error;
        this.f$2 = z;
        this.f$4 = j;
        this.f$1 = consumer;
        this.f$5 = resourcesProvider;
    }
}
