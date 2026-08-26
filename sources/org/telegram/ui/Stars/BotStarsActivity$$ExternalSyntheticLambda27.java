package org.telegram.ui.Stars;

import com.google.android.exoplayer2.util.Consumer;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.TwoStepVerificationActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda27 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final long f$5;

    public BotStarsActivity$$ExternalSyntheticLambda27(BotStarsActivity botStarsActivity, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, long j) {
        this.f$0 = botStarsActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = twoStepVerificationActivity;
        this.f$4 = z;
        this.f$5 = j;
    }

    @Override
    public final void run() {
        Object obj = this.f$3;
        Object obj2 = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                BotStarsActivity botStarsActivity = (BotStarsActivity) obj4;
                botStarsActivity.getClass();
                if (((TLRPC.TL_error) obj2) == null) {
                    TL_account.Password password = (TL_account.Password) ((TLObject) obj3);
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    botStarsActivity.initWithdraw(this.f$4, this.f$5, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
                }
                break;
            case 1:
                PeerStoriesView peerStoriesView = (PeerStoriesView) obj4;
                peerStoriesView.getClass();
                final MessagesController messagesController = (MessagesController) obj2;
                StoriesController storiesController = messagesController.getStoriesController();
                final long j = this.f$5;
                final boolean z = this.f$4;
                storiesController.toggleHidden(j, z, false);
                BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
                final int i = 0;
                undoObject.onUndo = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                messagesController.getStoriesController().toggleHidden(j, !z, false);
                                break;
                            default:
                                messagesController.getStoriesController().toggleHidden(j, z, true);
                                break;
                        }
                    }
                };
                final int i2 = 1;
                undoObject.onAction = new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                messagesController.getStoriesController().toggleHidden(j, !z, false);
                                break;
                            default:
                                messagesController.getStoriesController().toggleHidden(j, z, true);
                                break;
                        }
                    }
                };
                String str = (String) obj;
                BulletinFactory.of(peerStoriesView.topBulletinContainer, peerStoriesView.resourcesProvider).createUsersBulletin(Arrays.asList((TLObject) obj3), !z ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, undoObject).setTag(2).show(true);
                break;
            default:
                StoriesController storiesController2 = (StoriesController) obj4;
                storiesController2.getClass();
                Consumer consumer = (Consumer) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    consumer.accept(Boolean.TRUE);
                } else {
                    boolean zContains = tL_error.text.contains("BOOSTS_REQUIRED");
                    boolean z2 = this.f$4;
                    if (!zContains) {
                        if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                            BaseFragment lastFragment = LaunchActivity.getLastFragment();
                            if (z2 && lastFragment != null) {
                                ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(lastFragment.getContext(), 0, (Theme.ResourcesProvider) obj).setTitle(LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle)).setMessage(LocaleController.getString(R.string.LiveStoryAlreadyStreaming)), null);
                            }
                            consumer.accept(Boolean.FALSE);
                        } else if (!tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                            BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                            if (bulletinFactoryGlobal != null) {
                                bulletinFactoryGlobal.showForError(tL_error);
                            }
                            consumer.accept(Boolean.FALSE);
                        } else {
                            BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                            if (z2 && lastFragment2 != null) {
                                lastFragment2.showDialog(new PremiumFeatureBottomSheet(lastFragment2, lastFragment2.getContext(), lastFragment2.getCurrentAccount(), false, 14, true, null));
                            }
                            consumer.accept(Boolean.FALSE);
                        }
                    } else if (!z2) {
                        consumer.accept(Boolean.FALSE);
                    } else {
                        MessagesController messagesController2 = MessagesController.getInstance(storiesController2.currentAccount);
                        ChannelBoostsController boostsController = messagesController2.getBoostsController();
                        long j2 = this.f$5;
                        boostsController.getBoostsStats(j2, new StarGiftSheet$$ExternalSyntheticLambda105(storiesController2, consumer, messagesController2, j2));
                    }
                }
                break;
        }
    }

    public BotStarsActivity$$ExternalSyntheticLambda27(PeerStoriesView peerStoriesView, MessagesController messagesController, long j, boolean z, String str, TLObject tLObject) {
        this.f$0 = peerStoriesView;
        this.f$1 = messagesController;
        this.f$5 = j;
        this.f$4 = z;
        this.f$3 = str;
        this.f$2 = tLObject;
    }

    public BotStarsActivity$$ExternalSyntheticLambda27(StoriesController storiesController, TLRPC.TL_error tL_error, boolean z, long j, Consumer consumer, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = storiesController;
        this.f$1 = tL_error;
        this.f$4 = z;
        this.f$5 = j;
        this.f$2 = consumer;
        this.f$3 = resourcesProvider;
    }
}
