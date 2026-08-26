package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda24 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda24(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onClick(View view) {
        int i;
        final int i2 = 2;
        MessageObject messageObject = null;
        final int iIntValue = 0;
        final int i3 = 1;
        final ChatActivity chatActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity2 = this.f$0;
                LimitReachedBottomSheet.openBoostsForRemoveRestrictions(chatActivity2, chatActivity2.boostsStatus, chatActivity2.canApplyBoosts, chatActivity2.dialog_id, false);
                break;
            case 1:
                chatActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", chatActivity.chatInviterId);
                chatActivity.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (chatActivity.messagesSearchListContainer != null) {
                    chatActivity.showMessagesSearchListView(!chatActivity.animatorSearchResultAsListVisibility.value);
                }
                break;
            case 3:
                chatActivity.setFilterMessages(!chatActivity.chatAdapter.isFiltered, false, true);
                break;
            case 4:
                ChatActivity.AnonymousClass30 anonymousClass30 = chatActivity.mentionContainer;
                if (anonymousClass30 != null) {
                    anonymousClass30.setReversed(true);
                    chatActivity.mentionContainer.getAdapter().isSearchingMentions = true;
                    chatActivity.checkUi_botMenuPosition();
                }
                chatActivity.searchCalendarButton.setVisibility(8);
                chatActivity.searchUserButton.setVisibility(8);
                chatActivity.searchingForUser = true;
                chatActivity.searchingUserMessages = null;
                chatActivity.searchingChatMessages = null;
                chatActivity.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                chatActivity.searchItem.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(chatActivity.searchItem.getSearchField());
                ActionBarMenuItem actionBarMenuItem = chatActivity.searchItem;
                actionBarMenuItem.searchFieldText = null;
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = actionBarMenuItem.searchField;
                if (anonymousClass4 != null) {
                    anonymousClass4.setText("");
                    break;
                }
                break;
            case 5:
                if (chatActivity.getParentActivity() != null) {
                    ActionBarMenuItem actionBarMenuItem2 = chatActivity.searchItem;
                    if (actionBarMenuItem2 != null) {
                        AndroidUtilities.hideKeyboard(actionBarMenuItem2.getSearchField());
                    }
                    chatActivity.showDialog(AlertsCreator.createCalendarPickerDialog(chatActivity.getParentActivity(), new MessagesStorage.IntCallback() {
                        public AnonymousClass61() {
                        }

                        @Override
                        public final void run(int i4) {
                            ChatActivity.this.jumpToDate(i4);
                        }
                    }, chatActivity.themeDelegate).bottomSheet);
                    break;
                }
                break;
            case 6:
                chatActivity.closeMenu(true);
                break;
            case 7:
                MessageObject messageObject2 = chatActivity.selectedObject;
                if (messageObject2 != null) {
                    chatActivity.logSponsoredClicked(messageObject2, false, false);
                    Browser.openUrl(chatActivity.getParentActivity(), Uri.parse(chatActivity.selectedObject.sponsoredUrl), true, false, false, null, null, false, chatActivity.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(chatActivity.selectedObject.sponsoredInfo)) {
                    zzkn.m(R.string.TextCopied, new BulletinFactory(new Bulletin.BulletinWindow(chatActivity.getParentActivity(), null).container, chatActivity.themeDelegate));
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(chatActivity.selectedObject.sponsoredAdditionalInfo)) {
                    zzkn.m(R.string.TextCopied, new BulletinFactory(new Bulletin.BulletinWindow(chatActivity.getParentActivity(), null).container, chatActivity.themeDelegate));
                }
                break;
            case 10:
                if (chatActivity.contentView != null && chatActivity.getParentActivity() != null) {
                    BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(chatActivity.contentView.getContext(), null, false, false);
                    Activity parentActivity = chatActivity.getParentActivity();
                    ChatActivity.ThemeDelegate themeDelegate = chatActivity.themeDelegate;
                    final SponsoredMessageInfoView sponsoredMessageInfoView = new SponsoredMessageInfoView(parentActivity);
                    LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i4 = Theme.key_windowBackgroundWhiteBlackText;
                    textView.setTextColor(Theme.getColor(i4, themeDelegate));
                    textView.setTextSize(1, 20.0f);
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(parentActivity, themeDelegate);
                    linksTextView.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), themeDelegate));
                    linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, themeDelegate));
                    linksTextView.setTextColor(Theme.getColor(i4, themeDelegate));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    linksTextView.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                        @Override
                        public final void run(ClickableSpan clickableSpan) {
                            switch (iIntValue) {
                                case 0:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                                case 1:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                                default:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                            }
                        }
                    });
                    LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(parentActivity, null);
                    linksTextView2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), themeDelegate));
                    linksTextView2.setTextColor(Theme.getColor(i4, themeDelegate));
                    linksTextView2.setTextSize(1, 14.0f);
                    linksTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    linksTextView2.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                        @Override
                        public final void run(ClickableSpan clickableSpan) {
                            switch (i3) {
                                case 0:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                                case 1:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                                default:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                            }
                        }
                    });
                    LinkSpanDrawable.LinksTextView linksTextView3 = new LinkSpanDrawable.LinksTextView(parentActivity, null);
                    linksTextView3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), themeDelegate));
                    linksTextView3.setTextColor(Theme.getColor(i4, themeDelegate));
                    linksTextView3.setTextSize(1, 14.0f);
                    linksTextView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    linksTextView3.setOnLinkPressListener(new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                        @Override
                        public final void run(ClickableSpan clickableSpan) {
                            switch (i2) {
                                case 0:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                                case 1:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                                default:
                                    clickableSpan.onClick(sponsoredMessageInfoView);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i5 = Theme.key_featuredStickers_addButton;
                    paint.setColor(Theme.getColor(i5, themeDelegate));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    VoIPFragment.AnonymousClass5 anonymousClass5 = new VoIPFragment.AnonymousClass5(parentActivity, paint);
                    anonymousClass5.setOnClickListener(new View.OnClickListener() {
                        public final Activity val$context;

                        public AnonymousClass2() {
                            activity = parentActivity;
                        }

                        @Override
                        public final void onClick(View view2) {
                            Browser.openUrl(activity, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                        }
                    });
                    anonymousClass5.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    anonymousClass5.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    anonymousClass5.setTextColor(Theme.getColor(i5, themeDelegate));
                    int color = Theme.getColor(Theme.key_dialogBackground, themeDelegate);
                    anonymousClass5.setBackground(Theme.AdaptiveRipple.createRect(new float[]{4.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
                    anonymousClass5.setTextSize(1, 14.0f);
                    anonymousClass5.setGravity(16);
                    LinkSpanDrawable.LinksTextView linksTextView4 = new LinkSpanDrawable.LinksTextView(parentActivity, null);
                    linksTextView4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), themeDelegate));
                    linksTextView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    linksTextView4.setTextColor(Theme.getColor(i4, themeDelegate));
                    linksTextView4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutM.addView(textView);
                    linksTextView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0, 0, 18, 0, 0));
                    linksTextView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutM.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 0, 0, 24, 0, 0));
                    linksTextView3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutM.addView(linksTextView3, LayoutHelper.createLinear(-1, -2, 0, 0, 24, 0, 0));
                    linearLayoutM.addView(anonymousClass5, LayoutHelper.createLinear(-2, 34, 1, 22, 14, 22, 0));
                    linksTextView4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutM.addView(linksTextView4, LayoutHelper.createLinear(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(sponsoredMessageInfoView.getContext());
                    scrollView.addView(linearLayoutM);
                    sponsoredMessageInfoView.addView(scrollView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    bottomSheetM.customView = sponsoredMessageInfoView;
                    bottomSheetM.show();
                    break;
                }
                break;
            case 11:
                chatActivity.lambda$checkShowBlur$119(view);
                break;
            case 12:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                chatActivity3.showDialog(new PremiumFeatureBottomSheet(chatActivity3, chatActivity3.getParentActivity(), chatActivity3.getCurrentAccount(), false, 28, true, null));
                break;
            case 13:
                ChatActivity chatActivity4 = this.f$0;
                AlertsCreator.showBlockReportSpamAlert(chatActivity4, chatActivity4.dialog_id, chatActivity4.currentUser, chatActivity4.currentChat, chatActivity4.currentEncryptedChat, chatActivity4.reportSpamButton.getTag(R.id.object_tag) != null, chatActivity4.chatInfo, new ChatActivity$$ExternalSyntheticLambda347(chatActivity4, 2), chatActivity4.themeDelegate);
                break;
            case 14:
                chatActivity.lambda$createTopPanel$91();
                break;
            case 15:
                if (chatActivity.forumTopic != null) {
                    TopicsController topicsController = chatActivity.getMessagesController().getTopicsController();
                    long j = chatActivity.currentChat.id;
                    TLRPC.TL_forumTopic tL_forumTopic = chatActivity.forumTopic;
                    int i6 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j, i6, false);
                }
                chatActivity.updateTopicButtons();
                chatActivity.updateBottomOverlay(false);
                chatActivity.updateTopPanel(true);
                break;
            case 16:
                long j2 = chatActivity.dialog_id;
                if (chatActivity.currentEncryptedChat != null) {
                    j2 = chatActivity.currentUser.id;
                }
                chatActivity.shownBotVerification = false;
                chatActivity.getMessagesController().hidePeerSettingsBar(j2, chatActivity.currentUser, chatActivity.currentChat);
                chatActivity.updateTopPanel(true);
                chatActivity.updateInfoTopView(true);
                break;
            case 17:
                ChatActivity chatActivity5 = this.f$0;
                chatActivity5.wasManualScroll = true;
                if (!chatActivity5.isThreadChat() || chatActivity5.isTopic) {
                    int i7 = chatActivity5.currentPinnedMessageId;
                    if (i7 != 0) {
                        if (!chatActivity5.pinnedMessageIds.isEmpty()) {
                            if (i7 == ((Integer) zziq.m(1, chatActivity5.pinnedMessageIds)).intValue()) {
                                iIntValue = ((Integer) chatActivity5.pinnedMessageIds.get(0)).intValue() + 1;
                                chatActivity5.forceScrollToFirst = true;
                            } else {
                                chatActivity5.forceScrollToFirst = false;
                                iIntValue = i7 - 1;
                            }
                        }
                        chatActivity5.forceNextPinnedMessageId = iIntValue;
                        if (!chatActivity5.forceScrollToFirst) {
                            iIntValue = -iIntValue;
                        }
                        chatActivity5.scrollToMessageId(i7, 0, true, 0, true, iIntValue);
                        chatActivity5.updateMessagesVisiblePart$1();
                    }
                } else {
                    chatActivity5.scrollToMessageId((int) chatActivity5.threadMessageId, 0, true, 0, true, 0);
                }
                break;
            case 18:
                chatActivity.openPinnedMessagesList(false);
                break;
            case 19:
                chatActivity.lambda$createPinnedMessageView$116();
                break;
            case 20:
                chatActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", chatActivity.getDialogId());
                chatActivity.presentFragment(new ChatActivity.AnonymousClass56(bundle2));
                break;
            case 21:
                chatActivity.lambda$updateTopPanel$230();
                break;
            case 22:
                chatActivity.lambda$updateTopPanel$231();
                break;
            case 23:
                chatActivity.lambda$createView$32();
                break;
            case 24:
                chatActivity.openForward(false);
                break;
            case 25:
                for (int i8 = 1; i8 >= 0; i8--) {
                    SparseArray[] sparseArrayArr = chatActivity.selectedMessagesIds;
                    if (messageObject == null && sparseArrayArr[i8].size() != 0) {
                        messageObject = (MessageObject) chatActivity.messagesDict[i8].get(sparseArrayArr[i8].keyAt(0));
                    }
                    sparseArrayArr[i8].clear();
                    chatActivity.selectedMessagesCanCopyIds[i8].clear();
                    chatActivity.selectedMessagesCanStarIds[i8].clear();
                }
                chatActivity.hideActionMode();
                if (messageObject != null && ((i = messageObject.messageOwner.id) > 0 || (i < 0 && chatActivity.currentEncryptedChat != null))) {
                    chatActivity.showFieldPanelForReply(messageObject);
                }
                chatActivity.updatePinnedMessageView(0, true);
                chatActivity.updateVisibleRows$1(false);
                chatActivity.updateSelectedMessageReactions();
                break;
            case 26:
                chatActivity.lambda$createView$56();
                break;
            case 27:
                ChatActivity chatActivity6 = this.f$0;
                MessageObject messageObject3 = chatActivity6.editingMessageObject;
                if (messageObject3 != null) {
                    chatActivity6.scrollToMessageId(messageObject3.getId(), 0, true, 0, true, 0);
                }
                break;
            case 28:
                chatActivity.openSearchWithText(chatActivity.isSupportedTags() ? "" : null);
                break;
            default:
                chatActivity.createUndoView();
                chatActivity.undoView.showWithAction(chatActivity.dialog_id, 18, LocaleController.getString(R.string.BroadcastGroupInfo), (Object) null, (Runnable) null, (Runnable) null);
                break;
        }
    }
}
