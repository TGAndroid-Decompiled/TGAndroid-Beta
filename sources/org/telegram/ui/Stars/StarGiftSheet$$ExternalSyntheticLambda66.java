package org.telegram.ui.Stars;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda4;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesLikeButton;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda60;

public final class StarGiftSheet$$ExternalSyntheticLambda66 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public StarGiftSheet$$ExternalSyntheticLambda66(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() {
        TLRPC.User user;
        boolean z;
        boolean z2;
        Utilities.Callback2 callback2;
        Object obj;
        boolean z3;
        boolean z4;
        Utilities.Callback callback;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        int i = 0;
        int i2 = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) obj4).lambda$show$112((AlertDialog) obj3, (MessageObject) obj2);
                return;
            case 1:
                TimezonesController timezonesController = (TimezonesController) obj4;
                timezonesController.getClass();
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.TL_help_timezonesList) {
                    ArrayList arrayList = timezonesController.timezones;
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject).timezones);
                    SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
                    tLObject.serializeToStream(serializedData);
                    ((SharedPreferences) obj2).edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(timezonesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                timezonesController.loaded = true;
                timezonesController.loading = false;
                return;
            case 2:
                ((ChatActionCell) obj4).lambda$openPremiumGiftPreview$5((TLRPC.TL_premiumGiftOption) obj3, (String) obj2);
                return;
            case 3:
                ((ThemesHorizontalListCell) obj4).lambda$didReceivedNotification$3((Theme.ThemeInfo) obj3, (File) obj2);
                return;
            case 4:
                ((SelectorBottomSheet$$ExternalSyntheticLambda7) obj4).run(new Pair((HashMap) obj3, (ArrayList) obj2));
                return;
            case 5:
                TLObject tLObject2 = (TLObject) obj4;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    MessagesController messagesController = (MessagesController) obj3;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList2 = new ArrayList();
                    while (i < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList2.add(messagesController.getInputPeer(peer));
                        }
                        i++;
                    }
                    ((SelectorBottomSheet$$ExternalSyntheticLambda7) obj2).run(arrayList2);
                    return;
                }
                return;
            case 6:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                if (tL_error != null) {
                    ((Utilities.Callback) obj3).run(tL_error);
                    return;
                } else {
                    ((Utilities.Callback) obj2).run(null);
                    return;
                }
            case 7:
                ((DialogCell$$ExternalSyntheticLambda6) obj4).run(new Pair((HashMap) obj3, (ArrayList) obj2));
                return;
            case 8:
                ((SpoilersTextView) obj4).lambda$dispatchTouchEvent$3((LinkSpanDrawable) obj3, (ClickableSpan) obj2);
                return;
            case 9:
                ((GroupCallRenderersContainer) obj4).lambda$requestFullscreen$3((GroupCallMiniTextureView) obj3, (GroupCallMiniTextureView) obj2);
                return;
            case 10:
                ((ProfileGiftsContainer) obj4).lambda$new$8((TLRPC.TL_error) obj3, (BaseFragment) obj2);
                return;
            case 11:
                ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) obj2;
                if (page.isCollection || !savedStarGift.pinned_to_top || savedStarGift.unsaved) {
                    z = true;
                } else {
                    z = true;
                    giftCell.setPinned(false, true);
                    page.list.togglePinned(savedStarGift, false, false);
                }
                savedStarGift.unsaved ^= z;
                giftCell.setStarsGift(savedStarGift, z, page.isCollection);
                page.parent.collections.updateGiftsUnsaved(savedStarGift, savedStarGift.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = page.list.getInput(savedStarGift);
                savestargift.unsave = savedStarGift.unsaved;
                ConnectionsManager.getInstance(page.currentAccount).sendRequest(savestargift, null);
                return;
            case 12:
                ProfileGiftsContainer.Page page2 = (ProfileGiftsContainer.Page) obj4;
                ProfileGiftsContainer profileGiftsContainer = page2.parent;
                StarsController.GiftsCollections giftsCollections = profileGiftsContainer.collections;
                int i3 = page2.list.collectionId;
                giftsCollections.getClass();
                ArrayList arrayList3 = new ArrayList();
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                arrayList3.add(savedStarGift2);
                giftsCollections.removeGifts(i3, arrayList3);
                ((ItemOptions) obj2).dismiss();
                profileGiftsContainer.updateTabsShown(true);
                TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = profileGiftsContainer.collections.findById(page2.list.collectionId);
                if (tL_starGiftCollectionFindById != null) {
                    BulletinFactory.of(profileGiftsContainer.fragment).createSimpleMultiBulletin(savedStarGift2.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, StarGiftSheet.getGiftName(savedStarGift2.gift), tL_starGiftCollectionFindById.title))).show();
                    return;
                }
                return;
            case 13:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = (ResaleGiftsFragment.ResaleGiftsList) obj4;
                resaleGiftsList.reqId = -1;
                TLObject tLObject3 = (TLObject) obj3;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    int i4 = resaleGiftsList.account;
                    MessagesController.getInstance(i4).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i4).putChats(resalestargifts.chats, false);
                    resaleGiftsList.totalCount = resalestargifts.count;
                    boolean zIsEmpty = TextUtils.isEmpty(((TL_stars.getResaleStarGifts) obj2).offset);
                    ArrayList arrayList4 = resaleGiftsList.gifts;
                    if (zIsEmpty) {
                        arrayList4.clear();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i5 = 0;
                    while (i5 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i5);
                        i5++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    resaleGiftsList.endReached = arrayList4.size() >= resaleGiftsList.totalCount || TextUtils.isEmpty(resalestargifts.next_offset);
                    resaleGiftsList.last_offset = resalestargifts.next_offset;
                    resaleGiftsList.loading = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        ArrayList arrayList7 = resaleGiftsList.modelAttributes;
                        arrayList7.clear();
                        ArrayList arrayList8 = resaleGiftsList.backdropAttributes;
                        arrayList8.clear();
                        ArrayList arrayList9 = resaleGiftsList.patternAttributes;
                        arrayList9.clear();
                        arrayList7.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList8.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList9.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        resaleGiftsList.attributes_hash = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        HashMap map = resaleGiftsList.backdropAttributesCounter;
                        map.clear();
                        HashMap map2 = resaleGiftsList.patternAttributesCounter;
                        map2.clear();
                        HashMap map3 = resaleGiftsList.modelAttributesCounter;
                        map3.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList10 = resalestargifts.counters;
                        int size2 = arrayList10.size();
                        while (i < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList10.get(i);
                            i++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                map.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                map2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                map3.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    Utilities.Callback callback3 = resaleGiftsList.onUpdate;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z2));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                BotStarsActivity botStarsActivity = (BotStarsActivity) obj4;
                botStarsActivity.getClass();
                TLObject tLObject4 = (TLObject) obj3;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    Browser.openUrl((Context) obj2, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new BotStarsActivity$$ExternalSyntheticLambda0(botStarsActivity, 5), 1000L);
                return;
            case 15:
                ((BotStarsActivity) obj4).lambda$loadTonTransactions$17((TLObject) obj3, (TLRPC.TL_error) obj2);
                return;
            case 16:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj4;
                starGiftSheet.getClass();
                Long l = (Long) obj3;
                starGiftSheet.openTransferAlert(l.longValue(), new StarGiftSheet$$ExternalSyntheticLambda140(starGiftSheet, l, (UserSelectorBottomSheet[]) obj2, i));
                return;
            case 17:
                ((StarGiftSheet) obj4).lambda$repollMessage$96((TLObject) obj3, (MessageObject) obj2);
                return;
            case 18:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj4;
                starGiftSheet2.getClass();
                ((Browser.Progress) obj3).end();
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                starGiftSheet2.topView.setResellPrice(AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.STARS));
                ProfileGiftsContainer$Page$$ExternalSyntheticLambda4 profileGiftsContainer$Page$$ExternalSyntheticLambda4 = starGiftSheet2.onGiftUpdatedListener;
                if (profileGiftsContainer$Page$$ExternalSyntheticLambda4 != null) {
                    profileGiftsContainer$Page$$ExternalSyntheticLambda4.run();
                }
                zzkh.m(R.string.Gift2ResaleDisable, new Object[]{starGiftSheet2.getGiftName()}, starGiftSheet2.getBulletinFactory(), R.raw.contact_check);
                return;
            case 19:
                StarGiftSheet starGiftSheet3 = (StarGiftSheet) obj4;
                starGiftSheet3.getClass();
                ((Browser.Progress) obj3).end();
                starGiftSheet3.getBulletinFactory().showForError((TLRPC.TL_error) obj2);
                return;
            case 20:
                ((StarGiftSheet) obj4).lambda$set$55((TL_stars.TL_starGiftUnique) obj3, (String) obj2);
                return;
            case 21:
                ((StarsController) obj4).getClass();
                boolean[] zArr = (boolean[]) obj3;
                if (zArr[0] || (callback2 = (Utilities.Callback2) obj2) == null) {
                    return;
                }
                callback2.run("cancelled", 0L);
                zArr[0] = true;
                return;
            case 22:
                StarsController starsController = (StarsController) obj4;
                boolean z5 = !starsController.balanceLoaded;
                starsController.lastBalanceLoaded = System.currentTimeMillis();
                TLObject tLObject5 = (TLObject) obj3;
                boolean z6 = tLObject5 instanceof TL_stars.StarsStatus;
                int i6 = starsController.currentAccount;
                if (z6) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                    MessagesController.getInstance(i6).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i6).putChats(starsStatus.chats, false);
                    ArrayList[] arrayListArr = starsController.transactions;
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList11 = starsStatus.history;
                        int size3 = arrayList11.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList11.get(i7);
                            i7 += i2;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            Object obj5 = obj2;
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            obj2 = obj5;
                            i2 = 1;
                        }
                        obj = obj2;
                        for (int i8 = 0; i8 < 3; i8++) {
                            boolean zIsEmpty2 = arrayListArr[i8].isEmpty();
                            boolean[] zArr2 = starsController.transactionsExist;
                            zArr2[i8] = !zIsEmpty2 || zArr2[i8];
                            boolean z7 = (starsStatus.flags & 1) == 0;
                            boolean[] zArr3 = starsController.endReached;
                            zArr3[i8] = z7;
                            if (z7) {
                                starsController.loading[i8] = false;
                            }
                            starsController.offset[i8] = zArr3[i8] ? null : starsStatus.next_offset;
                        }
                        z3 = true;
                    } else {
                        obj = obj2;
                        z3 = false;
                    }
                    ArrayList arrayList12 = starsController.subscriptions;
                    if (arrayList12.isEmpty()) {
                        arrayList12.addAll(starsStatus.subscriptions);
                        starsController.subscriptionsLoading = false;
                        starsController.subscriptionsOffset = starsStatus.subscriptions_next_offset;
                        starsController.subscriptionsEndReached = (starsStatus.flags & 4) == 0;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j = starsController.balance.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j != starsAmount.amount) {
                        z5 = true;
                    }
                    starsController.balance = starsAmount;
                    starsController.minus = 0L;
                } else {
                    obj = obj2;
                    z3 = false;
                    z4 = false;
                }
                starsController.balanceLoading = false;
                starsController.balanceLoaded = true;
                if (z5) {
                    NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z3) {
                    NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z4) {
                    NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                ((StarsController) obj4).getClass();
                boolean[] zArr4 = (boolean[]) obj3;
                if (zArr4[0] || (callback = (Utilities.Callback) obj2) == null) {
                    return;
                }
                callback.run("cancelled");
                zArr4[0] = true;
                return;
            case 24:
                StarsController starsController2 = (StarsController) obj4;
                starsController2.getClass();
                for (Integer num : (HashSet) obj3) {
                    num.getClass();
                    starsController2.sendingPaidMessagesIds.remove(num);
                    starsController2.postponedPaidMessages.remove(num);
                }
                ((Runnable) obj2).run();
                return;
            case 25:
                ((boolean[]) obj4)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj3);
                ((BottomSheet[]) obj2)[0].lambda$showGiftOfferSheet$15();
                return;
            case 26:
                PeerStoriesView.AnonymousClass40 anonymousClass40 = (PeerStoriesView.AnonymousClass40) obj4;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass40.this$0;
                anonymousClass1.movingReaction = true;
                boolean[] zArr5 = {false};
                StoriesLikeButton storiesLikeButton = anonymousClass1.storiesLikeButton;
                storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new PeerStoriesView.AnonymousClass16(storiesLikeButton, i2)).setDuration(150L).start();
                int iDp = AndroidUtilities.dp(8.0f);
                StoriesLikeButton storiesLikeButton2 = new StoriesLikeButton(anonymousClass1.getContext(), anonymousClass1.sharedResources);
                anonymousClass1.storiesLikeButton = storiesLikeButton2;
                storiesLikeButton2.setPadding(iDp, iDp, iDp, iDp);
                anonymousClass1.likeButtonContainer.addView(anonymousClass1.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
                AnimatedEmojiDrawable animatedEmojiDrawable2 = anonymousClass1.reactionMoveDrawable;
                if (animatedEmojiDrawable2 != null) {
                    animatedEmojiDrawable2.removeView(anonymousClass1);
                    anonymousClass1.reactionMoveDrawable = null;
                }
                AnimatedEmojiEffect animatedEmojiEffect = anonymousClass1.emojiReactionEffect;
                if (animatedEmojiEffect != null) {
                    animatedEmojiEffect.removeView(anonymousClass1);
                    anonymousClass1.emojiReactionEffect = null;
                }
                anonymousClass1.drawAnimatedEmojiAsMovingReaction = false;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) obj3;
                if (visibleReaction.documentId != 0) {
                    anonymousClass1.drawAnimatedEmojiAsMovingReaction = true;
                    AnimatedEmojiDrawable animatedEmojiDrawable3 = new AnimatedEmojiDrawable(2, anonymousClass1.currentAccount, visibleReaction.documentId);
                    anonymousClass1.reactionMoveDrawable = animatedEmojiDrawable3;
                    animatedEmojiDrawable3.addView(anonymousClass1);
                } else if (visibleReaction.emojicon != null && (tL_availableReaction = MediaDataController.getInstance(anonymousClass1.currentAccount).getReactionsMap().get(visibleReaction.emojicon)) != null) {
                    anonymousClass1.reactionMoveImageReceiver.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    String filterForAroundAnimation = ReactionsEffectOverlay.getFilterForAroundAnimation();
                    ImageReceiver imageReceiver = anonymousClass1.reactionEffectImageReceiver;
                    imageReceiver.setImage(ImageLocation.getForDocument(document3), filterForAroundAnimation, null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                }
                anonymousClass1.storiesLikeButton.setReaction(visibleReaction);
                boolean z8 = anonymousClass1.isChannel;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
                if (z8) {
                    TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                    if (storyItem2.sent_reaction == null) {
                        if (storyItem2.views == null) {
                            storyItem2.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
                        TL_stories.StoryViews storyViews = storyItem3.views;
                        storyViews.reactions_count++;
                        ReactionsUtils.applyForStoryViews(null, storyItem3.sent_reaction, storyViews);
                        anonymousClass1.updateUserViews(true);
                    }
                }
                if (visibleReaction.documentId != 0 && (animatedEmojiDrawable = anonymousClass1.storiesLikeButton.emojiDrawable) != null) {
                    AnimatedEmojiEffect animatedEmojiEffect2 = new AnimatedEmojiEffect(animatedEmojiDrawable, UserConfig.selectedAccount, false, true);
                    anonymousClass1.emojiReactionEffect = animatedEmojiEffect2;
                    animatedEmojiEffect2.setView(anonymousClass1);
                }
                anonymousClass1.storiesController.setStoryReaction(anonymousClass1.dialogId, storyItemHolder.storyItem, visibleReaction);
                int[] iArr = new int[2];
                View view = (View) obj2;
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                anonymousClass1.getLocationInWindow(iArr2);
                anonymousClass1.movingReactionFromX = iArr[0] - iArr2[0];
                anonymousClass1.movingReactionFromY = iArr[1] - iArr2[1];
                anonymousClass1.movingReactionFromSize = view.getMeasuredHeight();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                anonymousClass1.movingReactionProgress = 0.0f;
                anonymousClass1.invalidate();
                StoriesLikeButton storiesLikeButton3 = anonymousClass1.storiesLikeButton;
                storiesLikeButton3.setAllowDrawReaction(false);
                if (visibleReaction.documentId == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon)) != null) {
                    ImageReceiver imageReceiver2 = storiesLikeButton3.animateReactionImageReceiver;
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                valueAnimatorOfFloat.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(anonymousClass40, valueAnimatorOfFloat, zArr5, i));
                valueAnimatorOfFloat.addListener(new PeerStoriesView.AnonymousClass40.AnonymousClass2(anonymousClass40, zArr5, storiesLikeButton3, i));
                valueAnimatorOfFloat.setDuration(220L);
                valueAnimatorOfFloat.start();
                anonymousClass1.showLikesReaction(false);
                return;
            case 27:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) obj4;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) obj3;
                AlertsCreator.createStoriesAlbumEnterNameForCreate(anonymousClass2.getContext(), null, darkThemeResourceProvider, new RichEditor$$ExternalSyntheticLambda60(anonymousClass8, (TL_stories.StoryItem) obj2, darkThemeResourceProvider, 12));
                PeerStoriesView.AnonymousClass8 anonymousClass9 = anonymousClass2.popupMenu;
                if (anonymousClass9 != null) {
                    anonymousClass9.dismiss();
                    return;
                }
                return;
            case 28:
                break;
            default:
                StoriesController storiesController = (StoriesController) obj4;
                storiesController.storyLimitFetched = true;
                TLObject tLObject6 = (TLObject) obj3;
                boolean z9 = tLObject6 instanceof TLRPC.TL_boolTrue;
                int i9 = storiesController.currentAccount;
                if (z9) {
                    storiesController.storyLimitCached = null;
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject6 instanceof TL_stories.canSendStoryCount)) {
                    storiesController.checkStoryError((TLRPC.TL_error) obj2);
                    return;
                } else {
                    storiesController.storyLimitCached = new StoriesController.StoryLimit(1, ((TL_stories.canSendStoryCount) tLObject6).count_remains, -1L);
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
        }
        while (true) {
            StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) obj4;
            Utilities.Callback callback4 = (Utilities.Callback) obj2;
            if (i >= botPreviewsList.messageObjects.size()) {
                callback4.run(null);
                return;
            }
            MessageObject messageObject = (MessageObject) botPreviewsList.messageObjects.get(i);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null && (messageMedia = storyItem.media) != null && (document = ((TL_stories.StoryItem) obj3).media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                callback4.run(document2);
                return;
            }
            i++;
        }
    }
}
