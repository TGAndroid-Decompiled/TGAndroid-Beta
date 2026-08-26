package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.IMessageCell;
import org.telegram.ui.Cells.MemberRequestCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Reactions.AddReactionsSpan;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.CustomReactionEditText;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.quickforward.QuickShareSelectorOverlayLayout;
import org.telegram.ui.Components.voip.EndCloseLayout;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class GiftSheet$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public GiftSheet$$ExternalSyntheticLambda26(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        int i = 2;
        int i2 = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((GiftSheet.AnonymousClass8) obj2).getBulletinFactory().showForError((TLRPC.TL_error) obj);
                break;
            case 1:
                ((OAuthSheet$$ExternalSyntheticLambda1) obj2).run((ArrayList) obj);
                break;
            case 2:
                ((Utilities.Callback) obj2).run((HashMap) obj);
                break;
            case 3:
                ((SelectorBottomSheet$$ExternalSyntheticLambda3) obj2).run((ArrayList) obj);
                break;
            case 4:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj2).run((TLRPC.TL_error) obj);
                break;
            case 5:
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj2).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(i, (Utilities.Callback) obj, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 6:
                BulletinFactory.of((ChatActivity) obj2).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) obj).stars))).setDuration(5000).show(true);
                break;
            case 7:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = (BoostViaGiftsBottomSheet) obj2;
                boostViaGiftsBottomSheet.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, boostViaGiftsBottomSheet.currentChat, Boolean.TRUE, (TL_stories.PrepaidGiveaway) obj);
                break;
            case 8:
                ((UserSelectorBottomSheet) obj2).lambda$search$0((TLObject) obj);
                break;
            case 9:
                ((DialogCell$$ExternalSyntheticLambda6) obj2).run((TLRPC.Chat) obj);
                break;
            case 10:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) obj2;
                chatCustomReactionsEditActivity.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatCustomReactionsEditActivity.editText.getText());
                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
                int length = animatedEmojiSpanArr.length;
                while (i2 < length) {
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i2];
                    if (animatedEmojiSpan == ((AnimatedEmojiSpan) obj)) {
                        int editTextSelectionEnd = chatCustomReactionsEditActivity.editText.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(animatedEmojiSpan);
                        int spanStart = spannableStringBuilder.getSpanStart(animatedEmojiSpan);
                        chatCustomReactionsEditActivity.editText.getText().delete(spanStart, spanEnd);
                        int i3 = spanEnd - spanStart;
                        ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass3 = chatCustomReactionsEditActivity.editText;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i3;
                        }
                        anonymousClass3.setSelection(editTextSelectionEnd);
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            case 11:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = (ChatCustomReactionsEditActivity) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (chatCustomReactionsEditActivity2.boostsStatus != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity2.chatId, chatCustomReactionsEditActivity2.selectedCustomReactions, chatCustomReactionsEditActivity2.boostsStatus);
                } else {
                    String pluralString = tL_error.text;
                    if (pluralString.equals("REACTIONS_TOO_MANY")) {
                        pluralString = LocaleController.formatPluralString("ReactionMaxCountError", chatCustomReactionsEditActivity2.maxReactionsCount, new Object[0]);
                    }
                    BulletinFactory.of(chatCustomReactionsEditActivity2).createErrorBulletin(pluralString).show();
                }
                break;
            case 12:
                ChatCustomReactionsEditActivity.AnonymousClass5 anonymousClass5 = (ChatCustomReactionsEditActivity.AnonymousClass5) obj2;
                anonymousClass5.getClass();
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity3 = ChatCustomReactionsEditActivity.this;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(chatCustomReactionsEditActivity3.editText.getText());
                AnimatedEmojiSpan[] animatedEmojiSpanArr2 = (AnimatedEmojiSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), AnimatedEmojiSpan.class);
                int length2 = animatedEmojiSpanArr2.length;
                while (i2 < length2) {
                    AnimatedEmojiSpan animatedEmojiSpan2 = animatedEmojiSpanArr2[i2];
                    if (animatedEmojiSpan2 == ((AnimatedEmojiSpan) obj)) {
                        int editTextSelectionEnd2 = chatCustomReactionsEditActivity3.editText.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(animatedEmojiSpan2);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(animatedEmojiSpan2);
                        chatCustomReactionsEditActivity3.editText.getText().delete(spanStart2, spanEnd2);
                        int i4 = spanEnd2 - spanStart2;
                        ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass4 = chatCustomReactionsEditActivity3.editText;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i4;
                        }
                        anonymousClass4.setSelection(editTextSelectionEnd2);
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            case 13:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) obj2;
                customEmojiReactionsWindow.isShowing = true;
                customEmojiReactionsWindow.containerView.invalidate();
                ((ReactionsContainerLayout) obj).prepareAnimation(false);
                customEmojiReactionsWindow.createTransition(true);
                break;
            case 14:
                CustomReactionEditText customReactionEditText = (CustomReactionEditText) obj2;
                AddReactionsSpan addReactionsSpan = (AddReactionsSpan) obj;
                customReactionEditText.getText().delete(customReactionEditText.getText().getSpanStart(addReactionsSpan), customReactionEditText.getText().getSpanEnd(addReactionsSpan));
                customReactionEditText.setCursorVisible(true);
                customReactionEditText.setLongClickable(true);
                break;
            case 15:
                ReactionsLayoutInBubble reactionsLayoutInBubble = (ReactionsLayoutInBubble) obj2;
                reactionsLayoutInBubble.getClass();
                ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) obj;
                TLRPC.ReactionCount reactionCount = reactionButton.reactionCount;
                ViewParent viewParent = reactionsLayoutInBubble.parentView;
                if (Fragment$$ExternalSyntheticOutline0.m82m((Object) viewParent)) {
                    ((IMessageCell) viewParent).didPressReactionFromLayout(reactionCount, true, 0.0f, 0.0f);
                }
                reactionButton.bounce.setPressed(false);
                reactionsLayoutInBubble.lastSelectedButton = null;
                reactionsLayoutInBubble.pressed = false;
                reactionsLayoutInBubble.longPressRunnable = null;
                break;
            case 16:
                QuickShareSelectorOverlayLayout quickShareSelectorOverlayLayout = (QuickShareSelectorOverlayLayout) obj2;
                quickShareSelectorOverlayLayout.drawablesForRemove.add((String) obj);
                quickShareSelectorOverlayLayout.invalidate();
                break;
            case 17:
                ((EndCloseLayout) obj2).endCloseView.setOnClickListener((View.OnClickListener) obj);
                break;
            case 18:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) obj2;
                HashMap<String, Bitmap> map = groupCallMiniTextureView.call.thumbs;
                ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                boolean z = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                map.put(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, (Bitmap) obj);
                break;
            case 19:
                ((GroupCallRenderersContainer) obj2).lambda$requestFullscreen$4((GroupCallMiniTextureView) obj);
                break;
            case 20:
                ((MemberRequestsDelegate) obj2).lambda$onItemClick$1((MemberRequestCell) obj);
                break;
            case 21:
                AcquiredGiftsSheet.AcquiredGiftsCell acquiredGiftsCell = (AcquiredGiftsSheet.AcquiredGiftsCell) obj2;
                acquiredGiftsCell.getClass();
                ((View.OnClickListener) obj).onClick(acquiredGiftsCell);
                break;
            case 22:
                GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) obj2;
                giftCell.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    giftCell.lockView.setVisibility(8);
                }
                break;
            case 23:
                ((ProfileGiftsContainer) obj2).lambda$new$4((TL_stars.TL_starGiftCollection) obj);
                break;
            case 24:
                ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) obj2;
                page.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                BulletinFactory.of(page.parent.fragment).createCopyLinkBulletin(false).show();
                break;
            case 25:
                new StarsIntroActivity.StarsOptionsSheet((Context) obj2, (Theme.ResourcesProvider) obj).show();
                break;
            case 26:
                BotStarsController.ChannelConnectedBots channelConnectedBots = (BotStarsController.ChannelConnectedBots) obj2;
                channelConnectedBots.reqId = 0;
                TLObject tLObject = (TLObject) obj;
                boolean z2 = tLObject instanceof TL_payments.connectedStarRefBots;
                int i5 = channelConnectedBots.currentAccount;
                if (z2) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i5).putUsers(connectedstarrefbots.users, false);
                    int i6 = channelConnectedBots.count;
                    ArrayList arrayList = channelConnectedBots.bots;
                    if (i6 <= 0) {
                        arrayList.clear();
                    }
                    channelConnectedBots.count = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    channelConnectedBots.endReached = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= channelConnectedBots.count;
                } else {
                    channelConnectedBots.error = true;
                    channelConnectedBots.endReached = true;
                }
                channelConnectedBots.loading = false;
                NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(channelConnectedBots.dialogId));
                break;
            case 27:
                BotStarsController.ChannelSuggestedBots channelSuggestedBots = (BotStarsController.ChannelSuggestedBots) obj2;
                channelSuggestedBots.getClass();
                TLObject tLObject2 = (TLObject) obj;
                boolean z3 = tLObject2 instanceof TL_payments.suggestedStarRefBots;
                int i7 = channelSuggestedBots.currentAccount;
                if (z3) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i7).putUsers(suggestedstarrefbots.users, false);
                    int i8 = channelSuggestedBots.count;
                    ArrayList arrayList2 = channelSuggestedBots.bots;
                    if (i8 <= 0) {
                        arrayList2.clear();
                    }
                    channelSuggestedBots.count = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    channelSuggestedBots.lastOffset = suggestedstarrefbots.next_offset;
                    channelSuggestedBots.endReached = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList2.size() >= channelSuggestedBots.count;
                } else {
                    channelSuggestedBots.error = true;
                    channelSuggestedBots.endReached = true;
                }
                channelSuggestedBots.loading = false;
                NotificationCenter.getInstance(i7).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(channelSuggestedBots.dialogId));
                break;
            case 28:
                ((StarGiftSheet) obj2).lambda$repostStory$41((Long) obj);
                break;
            default:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.getClass();
                if (!((StarsController) obj).balanceLoaded) {
                    starGiftSheet.getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
                } else {
                    starGiftSheet.button.setLoading(false);
                    starGiftSheet.doUpgrade();
                }
                break;
        }
    }
}
