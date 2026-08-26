package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda87;
import org.telegram.ui.Stories.StoriesUtilities;

public final class ChatActivity$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public ChatActivity$$ExternalSyntheticLambda54(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, int i) {
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
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didLongPressFormattedDate$421((ItemOptions) this.f$1, this.f$2, (TLRPC.TL_messageEntityFormattedDate) this.f$3, (ArrayList) this.f$4, (ScrimOptions) this.f$5);
                break;
            case 1:
                ((ConnectionsManager) this.f$0).lambda$sendRequestInternal$7((RequestDelegate) this.f$1, (TLObject) this.f$3, (TLRPC.TL_error) this.f$4, (RequestDelegateTimestamp) this.f$5, this.f$2);
                break;
            case 2:
                FilterCreateActivity.FilterInvitesBottomSheet.lambda$show$0((BaseFragment) this.f$0, (TLObject) this.f$1, (MessagesController.DialogFilter) this.f$3, (TLRPC.TL_error) this.f$4, (Runnable) this.f$5, this.f$2);
                break;
            case 3:
                ((StarGiftSheet) this.f$0).lambda$doUpgrade$135((TLObject) this.f$1, (String) this.f$3, (TL_stars.InputSavedStarGift) this.f$4, (TLRPC.TL_error) this.f$5, this.f$2);
                break;
            case 4:
                StarsController starsController = (StarsController) this.f$0;
                starsController.getClass();
                ((boolean[]) this.f$1)[0] = true;
                starsController.buyPremiumGift((Utilities.Callback2) this.f$5, this.f$2, (TLObject) this.f$3, (TLRPC.TL_textWithEntities) this.f$4);
                break;
            case 5:
                StarsController starsController2 = (StarsController) this.f$0;
                starsController2.getClass();
                ((boolean[]) this.f$1)[0] = true;
                starsController2.buyResellingGift((TLRPC.TL_payments_paymentFormStarGift) this.f$3, (TL_stars.TL_starGiftUnique) this.f$4, this.f$2, null, true, (Utilities.Callback2) this.f$5);
                break;
            default:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) this.f$0;
                userStoriesLoadOperation.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                long j = this.f$2;
                View view = (View) this.f$3;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (peerStories.stories.isEmpty()) {
                        z = true;
                    } else {
                        MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().putStories(j, peerStories);
                        StoriesUtilities.ensureStoryFileLoaded(peerStories, new StarsController$$ExternalSyntheticLambda87(userStoriesLoadOperation, view, j, (StoriesUtilities.AvatarStoryParams) this.f$4, 4));
                        z = false;
                    }
                } else {
                    z = true;
                }
                MessagesController messagesController = (MessagesController) this.f$5;
                if (j > 0 && (user = messagesController.getUser(Long.valueOf(j))) != null) {
                    user.stories_unavailable = true;
                    MessagesStorage.getInstance(userStoriesLoadOperation.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                    messagesController.putUser(user, false);
                }
                if (j < 0 && (chat = messagesController.getChat(Long.valueOf(-j))) != null) {
                    chat.stories_unavailable = true;
                    MessagesStorage.getInstance(userStoriesLoadOperation.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                    messagesController.putChat(chat, false);
                }
                if (z) {
                    view.invalidate();
                    MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().setLoading(j, false);
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda54(Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = tLObject;
        this.f$5 = obj4;
        this.f$2 = j;
    }

    public ChatActivity$$ExternalSyntheticLambda54(StarsController starsController, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Utilities.Callback2 callback2) {
        this.$r8$classId = 5;
        this.f$0 = starsController;
        this.f$1 = zArr;
        this.f$3 = tL_payments_paymentFormStarGift;
        this.f$4 = tL_starGiftUnique;
        this.f$2 = j;
        this.f$5 = callback2;
    }
}
