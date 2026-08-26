package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.IMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Reactions.AddReactionsSpan;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.CustomReactionEditText;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.StoriesController;

public final class ShareAlert$$ExternalSyntheticLambda29 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ShareAlert$$ExternalSyntheticLambda29(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        int iIndexOf;
        int iGlobalSearchPosition;
        int i;
        int i2 = 4;
        int i3 = 3;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                ShareAlert shareAlert = (ShareAlert) this.f$0;
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject != null) {
                    shareAlert.getClass();
                    shareAlert.exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject;
                    shareAlert.updateLinkTextView();
                    if (shareAlert.copyLinkOnEnd) {
                        shareAlert.copyLink();
                    }
                }
                shareAlert.loadingLink = false;
                break;
            case 1:
                ProfileActionsView profileActionsView = (ProfileActionsView) this.f$0;
                int i4 = profileActionsView.activeCount;
                ArrayList arrayList = (ArrayList) this.f$1;
                int size = arrayList.size();
                profileActionsView.activeCount = size;
                if (i4 != size && profileActionsView.radialGradient != null) {
                    profileActionsView.createColorShader();
                }
                ArrayList arrayList2 = profileActionsView.actions;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    ProfileActionsView.Action action = (ProfileActionsView.Action) arrayList2.get(i5);
                    if (!action.isDeleting || action.isDeleted) {
                        if (ProfileActionsView.find(action.key, arrayList) == null) {
                            LoadingDrawable loadingDrawable = action.loadingDrawable;
                            if (loadingDrawable != null) {
                                loadingDrawable.disappear();
                                action.supportsLoading = z;
                                action.isLoading = z;
                            }
                            action.isDeleting = true;
                            RectF rectF = action.prevRect;
                            float f = rectF.left - 1.0f;
                            ProfileActionsView profileActionsView2 = ProfileActionsView.this;
                            boolean z2 = f <= profileActionsView2.xpadding;
                            boolean z3 = rectF.right + 1.0f >= ((float) profileActionsView2.getMeasuredWidth()) - profileActionsView2.xpadding;
                            if (z2 && z3) {
                                z3 = false;
                                z2 = false;
                            }
                            action.from.set(rectF);
                            RectF rectF2 = action.to;
                            rectF2.set(rectF);
                            if (z2) {
                                rectF2.right = rectF2.left;
                            } else if (z3) {
                                rectF2.left = rectF2.right;
                            } else {
                                int i6 = action.key;
                                if ((i6 == 3 || i6 == 2) && profileActionsView2.mode == 1) {
                                    rectF2.left = rectF2.right;
                                } else {
                                    float fCenterX = rectF2.centerX();
                                    rectF2.right = fCenterX;
                                    rectF2.left = fCenterX;
                                }
                            }
                            action.positionFraction.set(0.0f, true);
                            arrayList.add(action);
                        }
                        i5++;
                        z = false;
                    } else {
                        arrayList.add(action);
                    }
                    i5++;
                    z = false;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                profileActionsView.invalidate();
                break;
            case 2:
                ProfileActionsView.OnActionClickListener onActionClickListener = ((ProfileActionsView) this.f$0).onActionClickListener;
                ProfileActionsView.Action action2 = (ProfileActionsView.Action) this.f$1;
                int i7 = action2.key;
                RectF rectF3 = action2.rect;
                ((ProfileActivity$$ExternalSyntheticLambda7) onActionClickListener).f$0.lambda$createView$17(rectF3.left, rectF3.top, i7);
                break;
            case 3:
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$0;
                if (chatMessageCell != null) {
                    chatMessageCell.invalidate();
                }
                ViewParent viewParent = (ViewParent) this.f$1;
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                }
                break;
            case 4:
                RLottieNative rLottieNative = (RLottieNative) this.f$0;
                if (rLottieNative != null) {
                    rLottieNative.recycle();
                }
                RLottieNative rLottieNative2 = (RLottieNative) this.f$1;
                if (rLottieNative2 != null) {
                    rLottieNative2.recycle();
                }
                break;
            case 5:
                ReactedHeaderView reactedHeaderView = (ReactedHeaderView) this.f$0;
                ArrayList arrayList3 = reactedHeaderView.seenUsers;
                ArrayList arrayList4 = (ArrayList) this.f$1;
                arrayList3.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj = arrayList4.get(i8);
                    i8++;
                    ReactedHeaderView.UserSeen userSeen = (ReactedHeaderView.UserSeen) obj;
                    int i9 = 0;
                    while (true) {
                        ArrayList arrayList5 = reactedHeaderView.users;
                        if (i9 >= arrayList5.size()) {
                            arrayList5.add(userSeen);
                        } else {
                            if (MessageObject.getObjectPeerId(((ReactedHeaderView.UserSeen) arrayList5.get(i9)).user) == MessageObject.getObjectPeerId(userSeen.user)) {
                                if (userSeen.date <= 0) {
                                }
                                ((ReactedHeaderView.UserSeen) arrayList5.get(i9)).date = userSeen.date;
                            }
                            i9++;
                        }
                        break;
                    }
                }
                Consumer consumer = reactedHeaderView.seenCallback;
                if (consumer != null) {
                    consumer.accept(arrayList4);
                }
                reactedHeaderView.loadReactions();
                break;
            case 6:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) this.f$0;
                chatCustomReactionsEditActivity.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatCustomReactionsEditActivity.editText.getText());
                for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
                    if (animatedEmojiSpan == ((AnimatedEmojiSpan) this.f$1)) {
                        int editTextSelectionEnd = chatCustomReactionsEditActivity.editText.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(animatedEmojiSpan);
                        int spanStart = spannableStringBuilder.getSpanStart(animatedEmojiSpan);
                        chatCustomReactionsEditActivity.editText.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass3 = chatCustomReactionsEditActivity.editText;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        anonymousClass3.setSelection(editTextSelectionEnd);
                    }
                    break;
                }
                break;
            case 7:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = (ChatCustomReactionsEditActivity) this.f$0;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = chatCustomReactionsEditActivity2.boostsStatus;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (tL_premium_boostsStatus == null || !tL_error.text.equals("BOOSTS_REQUIRED")) {
                    String pluralString = tL_error.text;
                    if (pluralString.equals("REACTIONS_TOO_MANY")) {
                        pluralString = LocaleController.formatPluralString("ReactionMaxCountError", chatCustomReactionsEditActivity2.maxReactionsCount, new Object[0]);
                    }
                    BulletinFactory.of(chatCustomReactionsEditActivity2).createErrorBulletin(pluralString, null).show();
                } else {
                    ReactionsUtils.showLimitReachedDialogForReactions(-chatCustomReactionsEditActivity2.chatId, chatCustomReactionsEditActivity2.selectedCustomReactions, chatCustomReactionsEditActivity2.boostsStatus);
                }
                break;
            case 8:
                ChatCustomReactionsEditActivity.AnonymousClass5 anonymousClass5 = (ChatCustomReactionsEditActivity.AnonymousClass5) this.f$0;
                anonymousClass5.getClass();
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity3 = ChatCustomReactionsEditActivity.this;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(chatCustomReactionsEditActivity3.editText.getText());
                for (AnimatedEmojiSpan animatedEmojiSpan2 : (AnimatedEmojiSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), AnimatedEmojiSpan.class)) {
                    if (animatedEmojiSpan2 == ((AnimatedEmojiSpan) this.f$1)) {
                        int editTextSelectionEnd2 = chatCustomReactionsEditActivity3.editText.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(animatedEmojiSpan2);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(animatedEmojiSpan2);
                        chatCustomReactionsEditActivity3.editText.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        ChatCustomReactionsEditActivity.AnonymousClass3 anonymousClass4 = chatCustomReactionsEditActivity3.editText;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        anonymousClass4.setSelection(editTextSelectionEnd2);
                    }
                    break;
                }
                break;
            case 9:
                CustomEmojiReactionsWindow customEmojiReactionsWindow = (CustomEmojiReactionsWindow) this.f$0;
                customEmojiReactionsWindow.isShowing = true;
                customEmojiReactionsWindow.containerView.invalidate();
                ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) this.f$1;
                reactionsContainerLayout.prepareAnimation = false;
                reactionsContainerLayout.invalidate();
                customEmojiReactionsWindow.createTransition(true);
                break;
            case 10:
                CustomReactionEditText customReactionEditText = (CustomReactionEditText) this.f$0;
                Editable text = customReactionEditText.getText();
                Editable text2 = customReactionEditText.getText();
                AddReactionsSpan addReactionsSpan = (AddReactionsSpan) this.f$1;
                text.delete(text2.getSpanStart(addReactionsSpan), customReactionEditText.getText().getSpanEnd(addReactionsSpan));
                customReactionEditText.setCursorVisible(true);
                customReactionEditText.setLongClickable(true);
                break;
            case 11:
                ReactionsLayoutInBubble reactionsLayoutInBubble = (ReactionsLayoutInBubble) this.f$0;
                reactionsLayoutInBubble.getClass();
                ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) this.f$1;
                TLRPC.ReactionCount reactionCount = reactionButton.reactionCount;
                BaseCell baseCell = reactionsLayoutInBubble.parentView;
                if (SurfaceContainer$$ExternalSyntheticOutline0.m6m((Object) baseCell)) {
                    ((IMessageCell) baseCell).didPressReactionFromLayout(reactionCount, true, 0.0f, 0.0f);
                }
                reactionButton.bounce.setPressed(false);
                reactionsLayoutInBubble.lastSelectedButton = null;
                reactionsLayoutInBubble.pressed = false;
                reactionsLayoutInBubble.longPressRunnable = null;
                break;
            case 12:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) this.f$0;
                ArrayList arrayList6 = anonymousClass1.sponsoredPeers;
                if (!arrayList6.isEmpty() && (iIndexOf = arrayList6.indexOf((TLRPC.TL_sponsoredPeer) this.f$1)) >= 0 && (iGlobalSearchPosition = anonymousClass1.globalSearchPosition()) < anonymousClass1.getItemCount()) {
                    arrayList6.remove(iIndexOf);
                    int i12 = iGlobalSearchPosition + 1 + iIndexOf;
                    RecyclerView.AdapterDataObservable adapterDataObservable = anonymousClass1.mObservable;
                    adapterDataObservable.notifyItemRangeRemoved(i12, 1);
                    int size4 = anonymousClass1.searchAdapterHelper.globalSearch.size();
                    int size5 = arrayList6.size();
                    if (anonymousClass1.globalSearchCollapsed) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        adapterDataObservable.notifyItemRangeRemoved(iGlobalSearchPosition, 1);
                    }
                }
                break;
            case 13:
                ((SearchViewPager.AnonymousClass1) this.f$0).removeAllAds();
                BulletinFactory.of((DialogsActivity) this.f$1).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                break;
            case 14:
                ((SeekBarAccessibilityDelegate) this.f$0).sendAccessibilityEvent((View) this.f$1, 4);
                break;
            case 15:
                ChatActivityEnterView.AnonymousClass37 anonymousClass37 = (ChatActivityEnterView.AnonymousClass37) this.f$0;
                ChatActivity chatActivity = (ChatActivity) this.f$1;
                if (chatActivity != null) {
                    chatActivity.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    anonymousClass37.dismiss();
                }
                break;
            case 16:
                ((WindowManager) this.f$1).removeView(((ChatActivityEnterView.AnonymousClass37) this.f$0).bulletinContainer);
                break;
            case 17:
                SharedMediaLayout.MediaPage mediaPage = (SharedMediaLayout.MediaPage) this.f$0;
                mediaPage.fastScrollHintView = null;
                mediaPage.fastScrollHideHintRunnable = null;
                SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = (SharedMediaFastScrollTooltip) this.f$1;
                sharedMediaFastScrollTooltip.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new Tooltip.AnonymousClass1(sharedMediaFastScrollTooltip, i2)).start();
                break;
            case 18:
                SharedMediaLayout.AnonymousClass15 anonymousClass15 = ((SharedMediaLayout) this.f$0).storiesContainer;
                if (anonymousClass15 != null) {
                    int i13 = ((StoriesController.StoryAlbum) this.f$1).album_id;
                    anonymousClass15.tabsView.scrollToTab(i13, anonymousClass15.adapter.getItemPosition(i13));
                }
                break;
            case 19:
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(SharedMediaLayout.this.profileActivity);
                int i14 = R.raw.contact_check;
                int i15 = R.string.YouJoinedChannel;
                TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                bulletinFactoryOf.createSimpleBulletinWithIconSize(i14, 36, LocaleController.formatString(i15, chat == null ? "" : chat.title)).show(true);
                break;
            case 20:
                SharedMediaLayout.MediaSearchAdapter mediaSearchAdapter = (SharedMediaLayout.MediaSearchAdapter) this.f$0;
                String str = (String) this.f$1;
                if (!SharedMediaLayout.this.sharedMediaData[mediaSearchAdapter.currentType].messages.isEmpty() && ((i = mediaSearchAdapter.currentType) == 1 || i == 4)) {
                    MessageObject messageObject = (MessageObject) zziq.m(1, SharedMediaLayout.this.sharedMediaData[i].messages);
                    int id = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    mediaSearchAdapter.queryServerSearch(id, str, dialogId, sharedMediaLayout.dialog_id == sharedMediaLayout.profileActivity.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (mediaSearchAdapter.currentType == 3) {
                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                    mediaSearchAdapter.queryServerSearch(0, str, sharedMediaLayout2.dialog_id, sharedMediaLayout2.topicId);
                }
                int i16 = mediaSearchAdapter.currentType;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList7 = new ArrayList(SharedMediaLayout.this.sharedMediaData[mediaSearchAdapter.currentType].messages);
                    mediaSearchAdapter.searchesInProgress++;
                    Utilities.searchQueue.postRunnable(new IntroActivity$$ExternalSyntheticLambda5((Object) mediaSearchAdapter, str, (Object) arrayList7, i3));
                }
                break;
            case 21:
                SharedMediaLayout.MediaSearchAdapter mediaSearchAdapter2 = (SharedMediaLayout.MediaSearchAdapter) this.f$0;
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                if (sharedMediaLayout3.searching) {
                    mediaSearchAdapter2.searchesInProgress--;
                    int itemCount = mediaSearchAdapter2.getItemCount();
                    mediaSearchAdapter2.searchResult = (ArrayList) this.f$1;
                    int itemCount2 = mediaSearchAdapter2.getItemCount();
                    if (mediaSearchAdapter2.searchesInProgress == 0 || itemCount2 != 0) {
                        sharedMediaLayout3.switchToCurrentSelectedMode(false);
                    }
                    int i17 = 0;
                    while (true) {
                        SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout3.mediaPages;
                        if (i17 >= mediaPageArr.length) {
                            mediaSearchAdapter2.mObservable.notifyChanged();
                        } else {
                            SharedMediaLayout.MediaPage mediaPage2 = mediaPageArr[i17];
                            if (mediaPage2.selectedType == mediaSearchAdapter2.currentType) {
                                if (mediaSearchAdapter2.searchesInProgress == 0 && itemCount2 == 0) {
                                    mediaPage2.emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                    mediaPageArr[i17].emptyView.button.setVisibility(8);
                                    mediaPageArr[i17].emptyView.showProgress(false, true);
                                } else if (itemCount == 0) {
                                    sharedMediaLayout3.animateItemsEnter(mediaPage2.listView, 0, null);
                                }
                            }
                            i17++;
                        }
                        break;
                    }
                }
                break;
            case 22:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i18 = NotificationCenter.customStickerCreated;
                TLObject tLObject2 = (TLObject) this.f$1;
                TLRPC.Document document = (TLRPC.Document) this.f$0;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject2, document, null, bool);
                break;
            case 23:
                MessagesController.getInstance(SuggestEmojiView.this.currentAccount).updateEmojiStatus((TLRPC.EmojiStatus) this.f$1);
                break;
            case 24:
                ThanosEffect.ensureRunOnUIThread((PollItemMenu$$ExternalSyntheticLambda8) this.f$0);
                Runnable runnable = (Runnable) this.f$1;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                break;
            case 25:
                TopicsTabsView topicsTabsView = (TopicsTabsView) this.f$0;
                MessagesController.getInstance(topicsTabsView.currentAccount).getTopicsController().deleteTopics(-topicsTabsView.dialogId, (ArrayList) this.f$1);
                int i19 = TopicsTabsView.$r8$clinit;
                break;
            case 26:
                TopicsTabsView topicsTabsView2 = (TopicsTabsView) this.f$0;
                topicsTabsView2.getClass();
                MessagesController.getInstance(topicsTabsView2.currentAccount).loadFullChat(((TLRPC.Updates) this.f$1).chats.get(0).id, 0, true);
                break;
            case 27:
                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = (ChatMessageCell.ChatMessageCellDelegate) this.f$0;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.needShowPremiumBulletin(((TLRPC.TL_messages_transcribedAudio) this.f$1).trial_remains_num > 0 ? 1 : 2);
                }
                break;
            case 28:
                ((TranslateAlert2) this.f$0).lambda$translate$1((TLObject) this.f$1);
                break;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$0;
                if (callback2 != null) {
                    callback2.run((String) this.f$1, Boolean.FALSE);
                }
                break;
        }
    }

    public ShareAlert$$ExternalSyntheticLambda29(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public ShareAlert$$ExternalSyntheticLambda29(TLObject tLObject, TLRPC.Document document) {
        this.$r8$classId = 22;
        this.f$1 = tLObject;
        this.f$0 = document;
    }
}
