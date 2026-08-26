package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.HintsController$Hint;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        boolean z;
        UniversalAdapter universalAdapter;
        ThanosEffect[] thanosEffectArr;
        ThanosEffect thanosEffect;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i = -1;
        MessageObject messageObject = null;
        boolean z2 = true;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj2;
                if (chatActivity.getParentActivity() != null) {
                    chatActivity.guestBotHintView.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    chatActivity.guestBotHintView.setRounding(16.0f);
                    chatActivity.guestBotHintView.setMultilineText(true);
                    chatActivity.guestBotHintView.setText(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    chatActivity.guestBotHintView.setJoint(0.0f, 96.0f);
                    chatActivity.guestBotHintView.setTranslationY(AndroidUtilities.dp(10.0f) + ((((View) obj).getTop() - chatActivity.blurredViewTopOffset) - chatActivity.contentView.getHeight()));
                    chatActivity.contentView.addView(chatActivity.guestBotHintView, LayoutHelper.createFrame(-1, 100, 87));
                    HintView2 hintView2 = chatActivity.guestBotHintView;
                    hintView2.onHidden = new ChatActivity$$ExternalSyntheticLambda22(chatActivity, 6);
                    hintView2.show();
                    HintsController$Hint.GuestBotPrivacy.increment();
                    break;
                }
                break;
            case 1:
                ((ChatMessageCell) obj2).post(new ChatMessageCell$$ExternalSyntheticLambda7(8, (ChatMessageCell) obj));
                break;
            case 2:
                StickerSetCell stickerSetCell = (StickerSetCell) obj2;
                if (stickerSetCell.stickersSet.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetCell.stickersSet;
                    TLRPC.Document document = (TLRPC.Document) obj;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        stickerSetCell.setStickersSet(stickerSetCell.stickersSet, stickerSetCell.needDivider, stickerSetCell.groupSearch);
                    }
                }
                break;
            case 3:
                ((ThemesHorizontalListCell) obj2).checkVisibleTheme((Theme.ThemeInfo) obj);
                break;
            case 4:
                ThemesHorizontalListCell.InnerThemeView innerThemeView = (ThemesHorizontalListCell.InnerThemeView) obj2;
                innerThemeView.getClass();
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_wallPaper) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                    String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                    ThemesHorizontalListCell themesHorizontalListCell = ThemesHorizontalListCell.this;
                    if (!themesHorizontalListCell.loadingThemes.containsKey(attachFileName)) {
                        themesHorizontalListCell.loadingThemes.put(attachFileName, innerThemeView.themeInfo);
                        FileLoader.getInstance(innerThemeView.themeInfo.account).loadFile(wallPaper.document, wallPaper, 1, 1);
                    }
                } else {
                    innerThemeView.themeInfo.badWallpaper = true;
                }
                break;
            case 5:
                ((ChangeUsernameActivity) obj2).lambda$checkUserName$5((String) obj);
                break;
            case 6:
                ChannelAdminLogActivity channelAdminLogActivity = (ChannelAdminLogActivity) obj2;
                channelAdminLogActivity.getClass();
                BulletinFactory.of(channelAdminLogActivity).createSimpleBulletinWithIconSize(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).show(false);
                channelAdminLogActivity.reloadLastMessages();
                break;
            case 7:
                ChannelAdminLogActivity channelAdminLogActivity2 = (ChannelAdminLogActivity) obj2;
                channelAdminLogActivity2.getClass();
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.ChannelAntiSpamFalsePositiveReported, BulletinFactory.of(channelAdminLogActivity2), R.raw.msg_antispam, 36);
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(channelAdminLogActivity2), R.raw.error, 36);
                } else {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(channelAdminLogActivity2), R.raw.error, 36);
                }
                break;
            case 8:
                ChannelBoostLayout channelBoostLayout = (ChannelBoostLayout) obj2;
                channelBoostLayout.boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                LinearLayout linearLayout = channelBoostLayout.progressLayout;
                linearLayout.animate().cancel();
                linearLayout.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new ArticleViewer.AnonymousClass25(channelBoostLayout, 22));
                channelBoostLayout.updateRows(true);
                channelBoostLayout.loadUsers(null);
                break;
            case 9:
                ChannelColorActivity channelColorActivity = (ChannelColorActivity) obj2;
                channelColorActivity.getClass();
                channelColorActivity.presentFragment(StatisticActivity.create((TLRPC.Chat) obj, true));
                break;
            case 10:
                ChannelColorActivity.ThemeChooser themeChooser = ChannelColorActivity.ThemeChooser.this;
                themeChooser.getClass();
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    themeChooser.dataLoaded = true;
                    ArrayList arrayList = themeChooser.items;
                    arrayList.clear();
                    arrayList.add(0, new ChatThemeBottomSheet.ChatThemeItem((EmojiThemes) list.get(0)));
                    TLRPC.WallPaper wallPaper2 = themeChooser.fallbackWallpaper;
                    int i2 = themeChooser.currentAccount;
                    if (wallPaper2 != null && themeChooser.withRemovedStub) {
                        arrayList.add(0, new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createChatThemesRemoved(i2)));
                    }
                    Theme.ResourcesProvider resourcesProvider = themeChooser.resourcesProvider;
                    int iIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                    for (int i3 = 1; i3 < list.size(); i3++) {
                        EmojiThemes emojiThemes = (EmojiThemes) list.get(i3);
                        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
                        emojiThemes.loadPreviewColors(i2);
                        chatThemeItem.themeIndex = iIsDark;
                        arrayList.add(chatThemeItem);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ChatThemeBottomSheet.ChatThemeItem chatThemeItem2 = (ChatThemeBottomSheet.ChatThemeItem) arrayList.get(i4);
                        String str = themeChooser.currentEmoticon;
                        EmojiThemes emojiThemes2 = chatThemeItem2.chatTheme;
                        boolean z3 = TextUtils.equals(str, (emojiThemes2 == null || emojiThemes2.showAsDefaultStub) ? null : emojiThemes2.emoji) || (TextUtils.isEmpty(themeChooser.currentEmoticon) && chatThemeItem2.chatTheme.showAsDefaultStub);
                        chatThemeItem2.isSelected = z3;
                        if (z3) {
                            i = i4;
                        }
                    }
                    ChannelColorActivity.ThemeChooser.AnonymousClass3 anonymousClass3 = themeChooser.adapter;
                    if (anonymousClass3 != null) {
                        anonymousClass3.mObservable.notifyChanged();
                    }
                    MessageSeenView.AnonymousClass1 anonymousClass1 = themeChooser.listView;
                    anonymousClass1.animate().alpha(1.0f).setDuration(150L).start();
                    boolean z4 = themeChooser.dataLoaded;
                    FlickerLoadingView flickerLoadingView = themeChooser.progressView;
                    if (z4) {
                        AndroidUtilities.updateViewVisibilityAnimated(flickerLoadingView, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(flickerLoadingView, true, 1.0f, true, true);
                    }
                    if (i >= 0 && (anonymousClass1.getLayoutManager() instanceof LinearLayoutManager)) {
                        ((LinearLayoutManager) anonymousClass1.getLayoutManager()).scrollToPositionWithOffset(i, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 11:
                ((ChannelCreateActivity) obj2).lambda$checkUserName$24((String) obj);
                break;
            case 12:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    channelCreateActivity.getClass();
                    z = tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") ? false : true;
                }
                channelCreateActivity.canCreatePublic = z;
                break;
            case 13:
                ChannelCreateActivity channelCreateActivity2 = (ChannelCreateActivity) obj2;
                channelCreateActivity2.loadingAdminedChannels = false;
                TLObject tLObject3 = (TLObject) obj;
                if (tLObject3 != null && channelCreateActivity2.getParentActivity() != null) {
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList2 = channelCreateActivity2.adminedChannelCells;
                        if (i5 >= arrayList2.size()) {
                            arrayList2.clear();
                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                            int i6 = 0;
                            while (i6 < tL_messages_chats.chats.size()) {
                                AdminedChannelCell adminedChannelCell = new AdminedChannelCell(channelCreateActivity2.getParentActivity(), new ChannelCreateActivity$$ExternalSyntheticLambda5(channelCreateActivity2, z2 ? 1 : 0), false, 0);
                                adminedChannelCell.setChannel(tL_messages_chats.chats.get(i6), i6 == tL_messages_chats.chats.size() - 1);
                                arrayList2.add(adminedChannelCell);
                                channelCreateActivity2.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
                                i6++;
                            }
                            channelCreateActivity2.updatePrivatePublic();
                        } else {
                            channelCreateActivity2.linearLayout.removeView((View) arrayList2.get(i5));
                            i5++;
                        }
                        break;
                    }
                }
                break;
            case 14:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                channelMonetizationLayout.boostsStatus = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    channelMonetizationLayout.currentBoostLevel = tL_premium_boostsStatus.level;
                }
                UniversalRecyclerView universalRecyclerView = channelMonetizationLayout.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                    break;
                }
                break;
            case 15:
                ((ChannelMonetizationLayout) obj2).applyStarsStats((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 16:
                ChatActivity chatActivity2 = (ChatActivity) obj2;
                if (!chatActivity2.removingFromParent && (thanosEffect = (thanosEffectArr = (ThanosEffect[]) obj)[0]) != null) {
                    thanosEffectArr[0] = null;
                    if (chatActivity2.chatListThanosEffect == thanosEffect) {
                        chatActivity2.chatListThanosEffect = null;
                    }
                    AndroidUtilities.removeFromParent(thanosEffect);
                    break;
                }
                break;
            case 17:
                ((ChatActivity$$ExternalSyntheticLambda155) obj2).run((TLRPC.User) obj);
                break;
            case 18:
                ChatActivity chatActivity3 = (ChatActivity) obj2;
                chatActivity3.getClass();
                int[] iArr = new int[2];
                ChatMessageCell chatMessageCell = (ChatMessageCell) obj;
                chatMessageCell.getLocationInWindow(iArr);
                HintView2 hintView3 = chatActivity3.botMessageHint;
                hintView3.setTranslationY(chatMessageCell.getTimeY() + ((iArr[1] - hintView3.getTop()) - AndroidUtilities.dp(120.0f)));
                chatActivity3.botMessageHint.setJointPx(0.0f, ((((-AndroidUtilities.dp(16.0f)) + iArr[0]) + chatMessageCell.timeX) + chatMessageCell.timeWidth) - (chatMessageCell.signWidth / 2.0f));
                chatActivity3.botMessageHint.show();
                break;
            case 19:
                ((ChatActivity) obj2).lambda$processInlineBotWebView$122((TLRPC.TL_inlineBotWebView) obj);
                break;
            case 20:
                ChatActivity chatActivity4 = (ChatActivity) obj2;
                chatActivity4.getClass();
                int[] iArr2 = (int[]) obj;
                if (iArr2[0] != 0) {
                    chatActivity4.getConnectionsManager().cancelRequest(iArr2[0], true);
                    iArr2[0] = 0;
                }
                break;
            case 21:
                ((ChatActivity) obj2).lambda$openDiscussionMessageChat$382((ChatActivity$$ExternalSyntheticLambda418) obj);
                break;
            case 22:
                ChatActivity chatActivity5 = (ChatActivity) obj2;
                Browser.openUrl(chatActivity5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), chatActivity5.inlineReturn == 0, false);
                break;
            case 23:
                ((ChatActivity) obj2).openSearchWithChat((TLRPC.Chat) obj);
                break;
            case 24:
                ((ChatActivity) obj2).lambda$processSelectedOption$347((TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 25:
                ChatActivity chatActivity6 = (ChatActivity) obj2;
                chatActivity6.getClass();
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    AlertsCreator.showSimpleToast(chatActivity6, LocaleController.getString(R.string.SlowmodeSendError));
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    AlertsCreator.showSimpleToast(chatActivity6, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                } else {
                    AlertsCreator.showSimpleToast(chatActivity6, tL_error2.text);
                }
                break;
            case 26:
                LongSparseArray longSparseArray = (LongSparseArray) obj2;
                if (longSparseArray.size() == 1 && longSparseArray.valueAt(0) != null && ((ArrayList) longSparseArray.valueAt(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) longSparseArray.valueAt(0)).get(0);
                }
                ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464 = (ChatActivity$$ExternalSyntheticLambda464) obj;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i7 = 0; i7 < messageObject.messageOwner.media.webpage.attributes.size(); i7++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i7);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(27, chatActivity$$ExternalSyntheticLambda464, messageObject.messageOwner.media.webpage));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda174(chatActivity$$ExternalSyntheticLambda464, 11));
                break;
            case 27:
                ((ChatActivity$$ExternalSyntheticLambda464) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 28:
                ((ChatActivity) obj2).contentView.removeView((ReactionsContainerLayout) obj);
                break;
            default:
                ChatActivity chatActivity7 = ChatActivity.this;
                MessageObject messageObject2 = (MessageObject) obj;
                MessageObject messageObject3 = (MessageObject) chatActivity7.messagesDict[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) chatActivity7.messagesDict[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                chatActivity7.updateMessageAnimated(messageObject2, true);
                ReactionsEffectOverlay.startAnimation();
                break;
        }
    }
}
