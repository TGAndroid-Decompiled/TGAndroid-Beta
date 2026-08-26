package org.telegram.ui.Stories;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Gifts.GiftSheet;

public final class PeerStoriesView$38$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final Object f$3;

    public PeerStoriesView$38$$ExternalSyntheticLambda1(ChatActivityEnterView chatActivityEnterView, AlertDialog alertDialog, TLRPC.User user, boolean z) {
        this.f$0 = chatActivityEnterView;
        this.f$2 = alertDialog;
        this.f$3 = user;
        this.f$1 = z;
    }

    @Override
    public final void run(Object obj) {
        ReactionsEffectOverlay reactionsEffectOverlay;
        TLRPC.Document documentFindDocument;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                PeerStoriesView.AnonymousClass38 anonymousClass38 = (PeerStoriesView.AnonymousClass38) this.f$0;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                boolean z = this.f$1;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) this.f$2;
                View view = (View) this.f$3;
                if (!z || visibleReaction.emojicon == null) {
                    reactionsEffectOverlay = new ReactionsEffectOverlay(view.getContext(), null, peerStoriesView.reactionsContainerLayout, null, view, peerStoriesView.getMeasuredWidth() / 2.0f, peerStoriesView.getMeasuredHeight() / 2.0f, visibleReaction, peerStoriesView.currentAccount, 2, true);
                } else {
                    try {
                        peerStoriesView.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                    reactionsEffectOverlay = new ReactionsEffectOverlay(view.getContext(), null, peerStoriesView.reactionsContainerLayout, null, view, peerStoriesView.getMeasuredWidth() / 2.0f, peerStoriesView.getMeasuredHeight() / 2.0f, visibleReaction, peerStoriesView.currentAccount, 0, true);
                }
                ReactionsEffectOverlay.currentOverlay = reactionsEffectOverlay;
                int i = R.id.parent_tag;
                ReactionsEffectOverlay.AnonymousClass1 anonymousClass1 = reactionsEffectOverlay.windowView;
                anonymousClass1.setTag(i, 1);
                peerStoriesView.addView(anonymousClass1);
                reactionsEffectOverlay.started = true;
                reactionsEffectOverlay.startTime = System.currentTimeMillis();
                String str = visibleReaction.emojicon;
                PeerStoriesView.StoryItemHolder storyItemHolder = peerStoriesView.currentStory;
                if (str != null) {
                    documentFindDocument = MediaDataController.getInstance(peerStoriesView.currentAccount).getEmojiAnimatedSticker(visibleReaction.emojicon);
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(visibleReaction.emojicon, peerStoriesView.dialogId);
                    sendMessageParamsOf.replyToStoryItem = storyItemHolder.storyItem;
                    sendMessageParamsOf.payStars = l.longValue();
                    SendMessagesHelper.getInstance(peerStoriesView.currentAccount).sendMessage(sendMessageParamsOf);
                } else {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(peerStoriesView.currentAccount, visibleReaction.documentId);
                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
                    if (strFindAnimatedEmojiEmoticon == null) {
                        if (peerStoriesView.reactionsContainerLayout.getReactionsWindow() != null) {
                            peerStoriesView.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                        }
                        peerStoriesView.closeKeyboardOrEmoji();
                    } else {
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(strFindAnimatedEmojiEmoticon, peerStoriesView.dialogId);
                        sendMessageParamsOf2.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = visibleReaction.documentId;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = strFindAnimatedEmojiEmoticon.length();
                        sendMessageParamsOf2.entities.add(tL_messageEntityCustomEmoji);
                        sendMessageParamsOf2.replyToStoryItem = storyItemHolder.storyItem;
                        sendMessageParamsOf2.payStars = l.longValue();
                        SendMessagesHelper.getInstance(peerStoriesView.currentAccount).sendMessage(sendMessageParamsOf2);
                    }
                }
                if (l.longValue() <= 0) {
                    Bulletin bulletinCreateEmojiBulletin = new BulletinFactory(peerStoriesView.storyContainer, peerStoriesView.resourcesProvider).createEmojiBulletin(documentFindDocument, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new LivePlayer$1$$ExternalSyntheticLambda0(anonymousClass38, 9));
                    bulletinCreateEmojiBulletin.duration = 5000;
                    bulletinCreateEmojiBulletin.show();
                }
                if (peerStoriesView.reactionsContainerLayout.getReactionsWindow() != null) {
                    peerStoriesView.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                }
                peerStoriesView.closeKeyboardOrEmoji();
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                chatActivityEnterView.getClass();
                ((AlertDialog) this.f$2).dismiss();
                GiftSheet giftSheet = new GiftSheet(chatActivityEnterView.getContext(), chatActivityEnterView.currentAccount, ((TLRPC.User) this.f$3).id, BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(1, (List) obj)), null);
                giftSheet.birthday = this.f$1;
                giftSheet.adapter.update(false);
                giftSheet.show();
                break;
            default:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) this.f$3;
                PeerStoriesView.AnonymousClass4 anonymousClass4 = anonymousClass2.storyContainer;
                if (!zBooleanValue) {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, new BulletinFactory(anonymousClass4, darkThemeResourceProvider), R.raw.error, 36);
                } else {
                    TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$2;
                    boolean z2 = this.f$1;
                    storyItem.pinned = z2;
                    if (anonymousClass2.isSelf) {
                        new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletinWithIconSize(z2 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z2 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).show();
                    } else if (!z2) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryUnpinnedFromPosts, new BulletinFactory(anonymousClass4, darkThemeResourceProvider), R.raw.chats_archived, 36);
                    } else {
                        new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletin(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).show();
                    }
                }
                break;
        }
    }

    public PeerStoriesView$38$$ExternalSyntheticLambda1(PeerStoriesView.AnonymousClass38 anonymousClass38, boolean z, ReactionsLayoutInBubble.VisibleReaction visibleReaction, View view) {
        this.f$0 = anonymousClass38;
        this.f$1 = z;
        this.f$2 = visibleReaction;
        this.f$3 = view;
    }

    public PeerStoriesView$38$$ExternalSyntheticLambda1(PeerStoriesView.AnonymousClass8 anonymousClass8, TL_stories.StoryItem storyItem, boolean z, DarkThemeResourceProvider darkThemeResourceProvider) {
        this.f$0 = anonymousClass8;
        this.f$2 = storyItem;
        this.f$1 = z;
        this.f$3 = darkThemeResourceProvider;
    }
}
