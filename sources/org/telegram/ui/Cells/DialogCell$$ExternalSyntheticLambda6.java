package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda112;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.Paint.Input;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.inset.KeyboardState;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Gifts.ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public final class DialogCell$$ExternalSyntheticLambda6 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public DialogCell$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        UniversalAdapter universalAdapter;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        int i;
        TLRPC.TL_help_country tL_help_country;
        switch (this.$r8$classId) {
            case 0:
                ((DialogCell) this.f$0).lambda$showPremiumBlocked$5((Object[]) obj);
                break;
            case 1:
                ((DialogsAdapter) this.f$0).onOpenBot((TLRPC.User) obj);
                break;
            case 2:
                ((DialogsSearchAdapter) this.f$0).openBotApp((TLRPC.User) obj);
                break;
            case 3:
                BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.f$0;
                businessIntroActivity.getClass();
                boolean z = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (businessIntroActivity.keyboardVisible != z) {
                    businessIntroActivity.keyboardVisible = z;
                    if (!z) {
                        businessIntroActivity.listView.smoothScrollToPosition(0);
                    }
                    break;
                }
                break;
            case 4:
                AndroidUtilities.forEachViews((RecyclerView) ((ChatAttachAlertQuickRepliesLayout) this.f$0).listView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(2));
                break;
            case 5:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.f$0;
                chatbotsActivity.currentValue = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : chatbotsActivity.currentValue.connected_bots.get(0);
                chatbotsActivity.currentBot = tL_connectedBot;
                chatbotsActivity.selectedBot = tL_connectedBot == null ? null : chatbotsActivity.getMessagesController().getUser(Long.valueOf(chatbotsActivity.currentBot.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = chatbotsActivity.currentBot;
                chatbotsActivity.rights = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = chatbotsActivity.currentBot;
                chatbotsActivity.exclude = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                BusinessRecipientsHelper businessRecipientsHelper = chatbotsActivity.recipientsHelper;
                if (businessRecipientsHelper != null) {
                    businessRecipientsHelper.setValue(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                UniversalRecyclerView universalRecyclerView = chatbotsActivity.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                }
                chatbotsActivity.checkDone$5(true);
                chatbotsActivity.valueSet = true;
                break;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) this.f$0;
                greetMessagesActivity.inactivityDays = greetMessagesActivity.daysOfInactivity[iIntValue];
                greetMessagesActivity.checkDone$1$1(true);
                break;
            case 7:
                AndroidUtilities.hideKeyboard((QuickRepliesActivity.AnonymousClass3) this.f$0);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 8:
                QuickRepliesActivity quickRepliesActivity = (QuickRepliesActivity) this.f$0;
                quickRepliesActivity.getClass();
                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(5, "chatMode");
                bundleM.putLong("user_id", quickRepliesActivity.getUserConfig().getClientUserId());
                bundleM.putString("quick_reply", (String) obj);
                ChatActivity chatActivity = new ChatActivity(bundleM);
                chatActivity.forceEmptyHistory();
                quickRepliesActivity.presentFragment(chatActivity);
                break;
            case 9:
                ((HintDialogCell) this.f$0).updatePremiumBlocked(true);
                break;
            case 10:
                Shape shape = (Shape) obj;
                Input input = (Input) this.f$0;
                RenderView renderView = input.renderView;
                if (shape != null) {
                    float currentWeight = renderView.getCurrentWeight();
                    shape.thickness = currentWeight;
                    double d = input.thicknessSum;
                    if (d > 0.0d) {
                        shape.thickness = (float) ((d / input.thicknessCount) * ((double) currentWeight));
                    }
                    if (shape.brush.getShapeShaderType() == 4) {
                        shape.arrowTriangleLength *= shape.thickness;
                    }
                }
                Painting painting = renderView.getPainting();
                if (painting.helperApplyAnimator == null) {
                    painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda1(painting, shape, 1));
                    break;
                }
                break;
            case 11:
                TextureView textureView = (TextureView) obj;
                PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this.f$0;
                anonymousClass26.textureView = textureView;
                if (textureView != null) {
                    anonymousClass26.container.addView(textureView, 0);
                }
                break;
            case 12:
                StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.f$0;
                storyLinkPreviewDialog.blurBitmap = (Bitmap) obj;
                Paint paint = new Paint(1);
                storyLinkPreviewDialog.blurBitmapPaint = paint;
                Bitmap bitmap = storyLinkPreviewDialog.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                storyLinkPreviewDialog.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.02f : -0.07f);
                storyLinkPreviewDialog.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                storyLinkPreviewDialog.blurMatrix = new Matrix();
                break;
            case 13:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                MessageObject messageObject = (MessageObject) this.f$0;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j = ((long) messageObject.messageOwner.date) * 1000;
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    String forwardedName = messageObject.getForwardedName();
                    if (forwardedName == null) {
                        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-MessageObject.getPeerId(messageObject.messageOwner.peer_id)));
                        forwardedName = chat != null ? chat.title : "";
                    }
                    String str = forwardedName;
                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z2 = chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2);
                    Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(lastFragment.getParentActivity(), lastFragment.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        lottieLayout.setAnimation(R.raw.chats_infotip, 30, 30, new String[0]);
                        lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
                            lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            lottieLayout.setAnimation(R.raw.chats_infotip, 30, 30, new String[0]);
                            lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    lottieLayout.textView.setSingleLine(false);
                    lottieLayout.textView.setMaxLines(2);
                    lottieLayout.setButton(new Bulletin.UndoButton(lastFragment.getParentActivity(), true, lastFragment.getResourceProvider()).setText(LocaleController.getString(R.string.LearnMore)).setUndoAction(new MessagesStorage$$ExternalSyntheticLambda112(payments_giveawayinfo, z2, str, j, tL_messageMediaGiveaway2, lastFragment)));
                    Bulletin.make(lastFragment, lottieLayout, 2750).show();
                    break;
                }
                break;
            case 14:
                ReassignBoostBottomSheet reassignBoostBottomSheet = (ReassignBoostBottomSheet) this.f$0;
                reassignBoostBottomSheet.actionButton.setLoading(false);
                BoostDialogs.showToastError(reassignBoostBottomSheet.getContext(), (TLRPC.TL_error) obj);
                break;
            case 15:
                HashMap map = ((BoostAdapter) this.f$0).chatsParticipantsCount;
                map.clear();
                map.putAll((HashMap) obj);
                break;
            case 16:
                ((GiftInfoAdapter) this.f$0).onObjectClicked((TLObject) obj);
                break;
            case 17:
                HashMap map2 = ((SelectorAdapter) this.f$0).chatsParticipantsCount;
                map2.clear();
                map2.putAll((HashMap) obj);
                break;
            case 18:
                KeyboardState.State state = (KeyboardState.State) obj;
                KeyboardState.State state2 = KeyboardState.State.STATE_FULLY_VISIBLE;
                WindowInsetsStateHolder windowInsetsStateHolder = (WindowInsetsStateHolder) this.f$0;
                if (state == state2 && ((i = windowInsetsStateHolder.inAppKeyboardState) == 2 || i == 3)) {
                    windowInsetsStateHolder.inAppKeyboardState = 1;
                }
                windowInsetsStateHolder.onUpdateListener.run();
                break;
            case 19:
                PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) obj;
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) this.f$0;
                pollAddOptionFieldLayout.attachedMedia = pollAttachedMedia;
                pollAddOptionFieldLayout.attachButton.setAttachedMedia(pollAttachedMedia, true);
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(pollAddOptionFieldLayout, 11), 200L);
                break;
            case 20:
                Pair pair = (Pair) obj;
                CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) this.f$0;
                HashMap map3 = countrySelectBottomSheet.countriesMap;
                map3.putAll((Map) pair.first);
                ArrayList arrayList = countrySelectBottomSheet.countriesLetters;
                arrayList.addAll((Collection) pair.second);
                j$.util.Map.EL.forEach(map3, new SelectorBottomSheet$$ExternalSyntheticLambda16(countrySelectBottomSheet, 1));
                HashSet<String> hashSet = countrySelectBottomSheet.countriesToSelect;
                HashMap map4 = countrySelectBottomSheet.selectedCountries;
                if (hashSet != null) {
                    for (String str2 : hashSet) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                Iterator it = ((List) map3.get((String) obj2)).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        tL_help_country = (TLRPC.TL_help_country) it.next();
                                        if (TextUtils.equals(str2, tL_help_country.iso2)) {
                                        }
                                    }
                                }
                            } else {
                                tL_help_country = null;
                            }
                        }
                        if (tL_help_country != null) {
                            GroupCreateSpan groupCreateSpan = new GroupCreateSpan(countrySelectBottomSheet.getContext(), tL_help_country);
                            groupCreateSpan.setOnClickListener(new CountrySelectBottomSheet$$ExternalSyntheticLambda0(countrySelectBottomSheet, 3));
                            countrySelectBottomSheet.spansContainer.addSpan(groupCreateSpan);
                            map4.put(tL_help_country.iso2, groupCreateSpan);
                        }
                    }
                }
                countrySelectBottomSheet.adapter.update(true);
                countrySelectBottomSheet.button.setCount(map4.size(), true);
                break;
            case 21:
                Bitmap bitmap2 = (Bitmap) obj;
                QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) this.f$0;
                if (quickShareSelectorDrawable.isDestroyed) {
                    quickShareSelectorDrawable.globalBlurBitmap.recycle();
                } else {
                    quickShareSelectorDrawable.globalBlurBitmap = bitmap2;
                    Bitmap bitmap3 = quickShareSelectorDrawable.globalBlurBitmap;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    quickShareSelectorDrawable.bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    quickShareSelectorDrawable.globalBlurBitmapPaint = paint2;
                    paint2.setShader(quickShareSelectorDrawable.bitmapShader);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, Theme.currentTheme.isDark() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.currentTheme.isDark() ? 0.02f : -0.15f);
                    quickShareSelectorDrawable.globalBlurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    Matrix matrix = quickShareSelectorDrawable.bitmapMatrix;
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    quickShareSelectorDrawable.bitmapShader.setLocalMatrix(matrix);
                }
                break;
            case 22:
                ((GiftSheet.StarsBackground) this.f$0).checkParticlesAllowed();
                break;
            case 23:
                ((ResaleGiftsFragment) this.f$0).updateList$1(((Boolean) obj).booleanValue());
                break;
            case 24:
                ((Boolean) obj).getClass();
                ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 = ((ResaleGiftsFragment.SelectGiftSheet.State) this.f$0).currentListener;
                if (resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 != null) {
                    resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7.run();
                }
                break;
            case 25:
                BoostDialogs.showToastError(((SendGiftSheet) this.f$0).getContext(), (TLRPC.TL_error) obj);
                break;
            case 26:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                giftOfferSheet.getClass();
                int i3 = GiftOfferSheet.ALLOWED_DURATIONS[((Integer) obj).intValue()];
                if (giftOfferSheet.selectedDuration != i3) {
                    giftOfferSheet.selectedDuration = i3;
                    giftOfferSheet.publishingTimeField.setText(LocaleController.formatPluralString("GiftOfferHours", i3 / 3600, new Object[0]));
                }
                giftOfferSheet.checkButtonEnabled(true);
                break;
            case 27:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.f$0;
                starGiftPreviewSheet.itemAnimator.endAnimations();
                starGiftPreviewSheet.adapter.update(true);
                break;
            case 28:
                StarGiftSheet.ActionView actionView = (StarGiftSheet.ActionView) this.f$0;
                actionView.getClass();
                actionView.blurMatrix = new Matrix();
                actionView.blurInvertMatrix = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                actionView.blurBitmapShader = bitmapShader2;
                Paint paint3 = actionView.bgPaint;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            default:
                TL_stars.StarGifts starGifts = (TL_stars.StarGifts) obj;
                StarsController starsController = (StarsController) this.f$0;
                starsController.giftsLoading = false;
                starsController.giftsLoaded = true;
                boolean z3 = starGifts instanceof TL_stars.TL_starGifts;
                ArrayList arrayList2 = starsController.gifts;
                if (z3) {
                    TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
                    int i4 = starsController.currentAccount;
                    MessagesController.getInstance(i4).putUsers(tL_starGifts.users, false);
                    MessagesController.getInstance(i4).putChats(tL_starGifts.chats, false);
                    MessagesStorage.getInstance(i4).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
                    arrayList2.clear();
                    arrayList2.addAll(tL_starGifts.gifts);
                    ArrayList arrayList3 = starsController.birthdaySortedGifts;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    Collections.sort(arrayList3, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(9)), new TableModel$$ExternalSyntheticLambda1(10)));
                    ArrayList arrayList4 = starsController.sortedGifts;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList2);
                    Collections.sort(arrayList4, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(11)));
                    starsController.giftsHash = tL_starGifts.hash;
                    starsController.giftsRemoteTime = System.currentTimeMillis();
                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
                    starsController.saveStarGiftsCached(starsController.giftsHash, starsController.giftsRemoteTime, tL_starGifts.gifts);
                } else if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                    int i5 = starsController.giftsHash;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    starsController.giftsRemoteTime = jCurrentTimeMillis;
                    starsController.saveStarGiftsCached(i5, jCurrentTimeMillis, arrayList2);
                }
                break;
        }
    }
}
