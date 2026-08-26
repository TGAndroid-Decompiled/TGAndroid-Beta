package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesUtilities;

public final class ChatActivity$$ExternalSyntheticLambda136 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public ChatActivity$$ExternalSyntheticLambda136(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    @Override
    public final void run() {
        boolean z;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i = 1;
        Object obj = this.f$5;
        Object obj2 = this.f$4;
        Object obj3 = this.f$1;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj5;
                chatActivity.getClass();
                ((ItemOptions) obj3).dontDismiss = true;
                Activity parentActivity = chatActivity.getParentActivity();
                long j = ((TLRPC.TL_messageEntityFormattedDate) obj4).date;
                ScrimOptions scrimOptions = (ScrimOptions) obj;
                long j2 = this.f$2;
                ChatActivity$$ExternalSyntheticLambda299 chatActivity$$ExternalSyntheticLambda299 = new ChatActivity$$ExternalSyntheticLambda299(chatActivity, (ArrayList) obj2, j2, scrimOptions, 0);
                ChatActivity$$ExternalSyntheticLambda112 chatActivity$$ExternalSyntheticLambda112 = new ChatActivity$$ExternalSyntheticLambda112(scrimOptions, i);
                Pattern pattern = AlertsCreator.URL_PATTERN;
                AlertsCreator.createScheduleDatePickerDialog(parentActivity, j2, j, 0, true, chatActivity$$ExternalSyntheticLambda299, chatActivity$$ExternalSyntheticLambda112, new AlertsCreator.ScheduleDatePickerColors(null), null);
                break;
            case 1:
                ((ConnectionsManager) obj5).lambda$sendRequestInternal$7((RequestDelegate) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (RequestDelegateTimestamp) obj, this.f$2);
                break;
            case 2:
                BaseFragment baseFragment = (BaseFragment) obj5;
                if (baseFragment.getContext() != null) {
                    TLObject tLObject = (TLObject) obj3;
                    MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj4;
                    if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                        baseFragment.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                        baseFragment.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                        new FilterCreateActivity.FilterInvitesBottomSheet(baseFragment, dialogFilter, tL_chatlists_exportedInvites.invites).show();
                    } else {
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || dialogFilter.isDefault()) {
                            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(baseFragment), null);
                        } else {
                            new FilterCreateActivity.FilterInvitesBottomSheet(baseFragment, dialogFilter, null).show();
                        }
                    }
                    ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda0 = (ComposeDrawable$$ExternalSyntheticLambda0) obj;
                    if (composeDrawable$$ExternalSyntheticLambda0 != null) {
                        AndroidUtilities.runOnUIThread(composeDrawable$$ExternalSyntheticLambda0, Math.max(0L, 200 - (System.currentTimeMillis() - this.f$2)));
                    }
                    break;
                }
                break;
            case 3:
                ((StarGiftSheet) obj5).lambda$doUpgrade$135((TLObject) obj3, (String) obj4, (TL_stars.InputSavedStarGift) obj2, (TLRPC.TL_error) obj, this.f$2);
                break;
            case 4:
                StarsController starsController = (StarsController) obj5;
                starsController.getClass();
                ((boolean[]) obj3)[0] = true;
                starsController.buyPremiumGift((Utilities.Callback2) obj, this.f$2, (TLObject) obj4, (TLRPC.TL_textWithEntities) obj2);
                break;
            case 5:
                StarsController starsController2 = (StarsController) obj5;
                starsController2.getClass();
                ((boolean[]) obj3)[0] = true;
                starsController2.buyResellingGift((TLRPC.TL_payments_paymentFormStarGift) obj4, (TL_stars.TL_starGiftUnique) obj2, this.f$2, null, true, (Utilities.Callback2) obj);
                break;
            default:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) obj5;
                userStoriesLoadOperation.getClass();
                View view = (View) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                long j3 = this.f$2;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (peerStories.stories.isEmpty()) {
                        z = true;
                    } else {
                        MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().putStories(j3, peerStories);
                        StoriesUtilities.ensureStoryFileLoaded(peerStories, new PhotoViewer$$ExternalSyntheticLambda126(userStoriesLoadOperation, view, j3, (StoriesUtilities.AvatarStoryParams) obj2, 13));
                        z = false;
                    }
                } else {
                    z = true;
                }
                MessagesController messagesController = (MessagesController) obj;
                if (j3 > 0 && (user = messagesController.getUser(Long.valueOf(j3))) != null) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(userStoriesLoadOperation.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j3 < 0 && (chat = messagesController.getChat(Long.valueOf(-j3))) != null) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(userStoriesLoadOperation.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (z) {
                    view.invalidate();
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().setLoading(j3, false);
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda136(Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = tLObject;
        this.f$5 = obj4;
        this.f$2 = j;
    }

    public ChatActivity$$ExternalSyntheticLambda136(StarsController starsController, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Utilities.Callback2 callback2) {
        this.$r8$classId = 5;
        this.f$0 = starsController;
        this.f$1 = zArr;
        this.f$3 = tL_payments_paymentFormStarGift;
        this.f$4 = tL_starGiftUnique;
        this.f$2 = j;
        this.f$5 = callback2;
    }
}
