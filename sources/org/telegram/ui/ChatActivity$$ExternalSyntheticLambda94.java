package org.telegram.ui;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.FullyDrawnReporter;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.ChatActivityEnterTopView;
import org.telegram.ui.Components.ChatActivityTopPanelLayout;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PermanentLinkBottomSheet;
import org.telegram.ui.Components.PinnedLineView;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundPageDownButton;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;

public final class ChatActivity$$ExternalSyntheticLambda94 implements ThemeDescription.ThemeDescriptionDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda94(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onAnimationProgress$org$telegram$ui$ActionIntroActivity$$ExternalSyntheticLambda8(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Business$ChatAttachAlertQuickRepliesLayout$$ExternalSyntheticLambda2(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$CacheControlActivity$$ExternalSyntheticLambda4(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$CallLogActivity$$ExternalSyntheticLambda13(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChannelCreateActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatActivity$$ExternalSyntheticLambda94(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatEditActivity$$ExternalSyntheticLambda39(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatEditTypeActivity$$ExternalSyntheticLambda8(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatLinkActivity$$ExternalSyntheticLambda3(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatReactionsEditActivity$$ExternalSyntheticLambda5(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatRightsEditActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ChatUsersActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$AudioPlayerAlert$$ExternalSyntheticLambda17(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$ChatAttachAlertContactsLayout$$ExternalSyntheticLambda2(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$ChatAttachAlertLocationLayout$$ExternalSyntheticLambda6(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$ColorPicker$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$MediaActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$PermanentLinkBottomSheet$$ExternalSyntheticLambda4(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$PollVotesAlert$$ExternalSyntheticLambda2(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$SearchViewPager$$ExternalSyntheticLambda5(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$SimpleThemeDescription$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$StickersAlert$$ExternalSyntheticLambda8(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$TrendingStickersAlert$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ContactAddActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ContactsActivity$$ExternalSyntheticLambda4(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$FilterCreateActivity$$ExternalSyntheticLambda14(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$FilteredSearchView$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$GradientHeaderActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$GroupCreateActivity$$ExternalSyntheticLambda12(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$GroupCreateFinalActivity$$ExternalSyntheticLambda4(float f) {
    }

    @Override
    public final void didSetColor() {
        ChatActivityBlurredRoundPageDownButton chatActivityBlurredRoundPageDownButton;
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButton;
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                ChatActivity.AnonymousClass14 anonymousClass14 = chatActivity.blurredBackgroundColorProvider;
                if (anonymousClass14 != null) {
                    anonymousClass14.updateColors();
                }
                ChatActivity.AnonymousClass14 anonymousClass15 = chatActivity.blurredBackgroundColorProviderWhite;
                if (anonymousClass15 != null) {
                    anonymousClass15.updateColors();
                }
                ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
                if (anonymousClass39 != null) {
                    anonymousClass39.updateColors$1();
                }
                ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
                if (anonymousClass78 != null) {
                    anonymousClass78.checkColors();
                }
                ChatActivity.AnonymousClass21 anonymousClass21 = chatActivity.chatListView;
                if (anonymousClass21 != null) {
                    int childCount = anonymousClass21.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = chatActivity.chatListView.getChildAt(i);
                        if (childAt instanceof ChatMessageCell) {
                            ((ChatMessageCell) childAt).createSelectorDrawable(0);
                        } else if (childAt instanceof ChatActionCell) {
                            ((ChatActionCell) childAt).setInvalidateColors(true);
                        }
                    }
                }
                ChatActivity.AnonymousClass34 anonymousClass34 = chatActivity.messagesSearchListView;
                if (anonymousClass34 != null) {
                    int childCount2 = anonymousClass34.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = chatActivity.messagesSearchListView.getChildAt(i2);
                        if (childAt2 instanceof DialogCell) {
                            ((DialogCell) childAt2).update(0, true);
                        }
                    }
                }
                if (chatActivity.scrimPopupWindowItems != null) {
                    int i3 = 0;
                    while (true) {
                        ActionBarMenuSubItem[] actionBarMenuSubItemArr = chatActivity.scrimPopupWindowItems;
                        if (i3 < actionBarMenuSubItemArr.length) {
                            ActionBarMenuSubItem actionBarMenuSubItem = actionBarMenuSubItemArr[i3];
                            int themedColor = chatActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItem);
                            int themedColor2 = chatActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon);
                            actionBarMenuSubItem.setTextColor(themedColor);
                            actionBarMenuSubItem.setIconColor(themedColor2);
                            chatActivity.scrimPopupWindowItems[i3].setSelectorColor(chatActivity.getThemedColor(Theme.key_dialogButtonSelector));
                            i3++;
                        }
                    }
                }
                ActionBarPopupWindow actionBarPopupWindow = chatActivity.scrimPopupWindow;
                if (actionBarPopupWindow != null) {
                    View contentView = actionBarPopupWindow.getContentView();
                    contentView.setBackgroundColor(chatActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                    contentView.invalidate();
                }
                PinnedLineView pinnedLineView = chatActivity.pinnedLineView;
                if (pinnedLineView != null) {
                    int color = Theme.getColor(Theme.key_chat_topPanelLine, pinnedLineView.resourcesProvider);
                    pinnedLineView.color = color;
                    pinnedLineView.paint.setColor(ColorUtils.setAlphaComponent(color, (int) ((Color.alpha(color) / 255.0f) * 112.0f)));
                    pinnedLineView.selectedPaint.setColor(pinnedLineView.color);
                }
                ChatActivity.AnonymousClass41 anonymousClass41 = chatActivity.chatActivityEnterTopView;
                if (anonymousClass41 != null && anonymousClass41.getEditView() != null) {
                    for (ChatActivityEnterTopView.EditViewButton editViewButton : chatActivity.chatActivityEnterTopView.getEditView().buttons) {
                        editViewButton.updateColors();
                    }
                }
                ActionBarMenuItem actionBarMenuItem = chatActivity.headerItem;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.updateColor();
                }
                ChatActivity.AnonymousClass33 anonymousClass33 = chatActivity.fragmentContextView;
                if (anonymousClass33 != null) {
                    anonymousClass33.updateColors$1();
                }
                ChatActivity.AnonymousClass18 anonymousClass18 = chatActivity.avatarContainer;
                if (anonymousClass18 != null) {
                    StatusDrawable statusDrawable = anonymousClass18.currentTypingDrawable;
                    Theme.ResourcesProvider resourcesProvider = anonymousClass18.resourcesProvider;
                    if (statusDrawable != null) {
                        statusDrawable.setColor(Theme.getColor(Theme.key_chat_status, resourcesProvider));
                    }
                    Drawable drawable = anonymousClass18.emojiStatusDefaultDrawable;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_profile_verifiedBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    }
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = anonymousClass18.botVerificationDrawable;
                    if (swapAnimatedEmojiDrawable != null) {
                        zzli.m(Theme.key_profile_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable);
                    }
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = anonymousClass18.emojiStatusDrawable;
                    if (swapAnimatedEmojiDrawable2 != null) {
                        zzli.m(Theme.key_profile_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable2);
                    }
                    Drawable drawable2 = anonymousClass18.verifiedBackground;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_profile_verifiedBackground, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = anonymousClass18.verifiedCheck;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_profile_verifiedCheck, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    }
                    anonymousClass18.invalidate();
                }
                ChatActivity.ChatActivityFragmentView chatActivityFragmentView = chatActivity.contentView;
                if (chatActivityFragmentView != null) {
                    chatActivityFragmentView.invalidateBlurredViews();
                    QrActivity.AnonymousClass2 anonymousClass2 = chatActivity.contentView.backgroundView;
                    if (anonymousClass2 != null) {
                        anonymousClass2.invalidate();
                    }
                }
                ChatActivityTopPanelLayout chatActivityTopPanelLayout = chatActivity.topPanelLayout;
                if (chatActivityTopPanelLayout != null) {
                    BlurredBackgroundDrawable blurredBackgroundDrawable2 = chatActivityTopPanelLayout.backgroundDrawable;
                    if (blurredBackgroundDrawable2 != null) {
                        blurredBackgroundDrawable2.updateColors();
                    }
                    Color.alpha(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    chatActivityTopPanelLayout.invalidate();
                }
                SuggestEmojiView suggestEmojiView = chatActivity.suggestEmojiPanel;
                if (suggestEmojiView != null) {
                    Paint paint = suggestEmojiView.backgroundPaint;
                    Theme.ResourcesProvider resourcesProvider2 = suggestEmojiView.resourcesProvider;
                    if (paint != null) {
                        paint.setColor(Theme.getColor(Theme.key_chat_stickersHintPanel, resourcesProvider2));
                    }
                    Drawable drawable4 = Theme.chat_gradientLeftDrawable;
                    int i4 = Theme.key_chat_stickersHintPanel;
                    int color2 = Theme.getColor(i4, resourcesProvider2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(color2, mode));
                    Theme.chat_gradientRightDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider2), mode));
                }
                ChatActivity.AnonymousClass18 anonymousClass19 = chatActivity.avatarContainer;
                if (anonymousClass19 != null && anonymousClass19.getTimeItem() != null) {
                    chatActivity.avatarContainer.getTimeItem().invalidate();
                }
                ChatInputViewsContainer chatInputViewsContainer = chatActivity.chatInputViewsContainer;
                if (chatInputViewsContainer != null) {
                    chatInputViewsContainer.blurredBackgroundDrawable.updateColors();
                    chatInputViewsContainer.underKeyboardBackgroundDrawable.updateColors();
                    chatInputViewsContainer.invalidate();
                }
                ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = chatActivity.sideControlsButtonsLayout;
                if (chatActivitySideControlsButtonsLayout != null) {
                    for (ChatActivity.AnonymousClass117 anonymousClass117 : chatActivitySideControlsButtonsLayout.buttonHolders) {
                        if (anonymousClass117 != null && (chatActivityBlurredRoundButton = (chatActivityBlurredRoundPageDownButton = (ChatActivityBlurredRoundPageDownButton) anonymousClass117.val$primaryMessage).buttonView) != null) {
                            chatActivityBlurredRoundButton.updateColors$1();
                            chatActivityBlurredRoundPageDownButton.invalidate();
                        }
                    }
                }
                ChatActivity.AnonymousClass44 anonymousClass44 = chatActivity.bottomChannelButtonsLayout;
                if (anonymousClass44 != null) {
                    for (FullyDrawnReporter fullyDrawnReporter : anonymousClass44.buttonHolders) {
                        if (fullyDrawnReporter != null) {
                            ((ChatActivityBlurredRoundButton) fullyDrawnReporter.lock).updateColors$1();
                        }
                    }
                }
                Iterator it = chatActivity.glassAttachedDrawables.iterator();
                while (it.hasNext()) {
                    ((BlurredBackgroundDrawable) it.next()).updateColors();
                }
                chatActivity.contentView.invalidate();
                Iterator it2 = chatActivity.glassAttachedViews.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                break;
            case 1:
                ((ActionIntroActivity) this.f$0).updateColors$12();
                break;
            case 2:
                ChatActivity.AnonymousClass34 anonymousClass35 = ((ChatAttachAlertQuickRepliesLayout) this.f$0).listView;
                if (anonymousClass35 != null) {
                    int childCount3 = anonymousClass35.getChildCount();
                    for (int i5 = 0; i5 < childCount3; i5++) {
                        anonymousClass35.getChildAt(i5);
                    }
                }
                break;
            case 3:
                DialogCacheBottomSheet dialogCacheBottomSheet = ((CacheControlActivity) this.f$0).bottomSheet;
                if (dialogCacheBottomSheet != null) {
                    dialogCacheBottomSheet.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                }
                break;
            case 4:
                ((CallLogActivity) this.f$0).lambda$getThemeDescriptions$22();
                break;
            case 5:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.f$0;
                LinearLayout linearLayout = channelCreateActivity.adminnedChannelsLayout;
                if (linearLayout != null) {
                    int childCount4 = linearLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount4; i6++) {
                        View childAt3 = channelCreateActivity.adminnedChannelsLayout.getChildAt(i6);
                        if (childAt3 instanceof AdminedChannelCell) {
                            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) childAt3;
                            adminedChannelCell.avatarDrawable.setInfo(adminedChannelCell.currentAccount, adminedChannelCell.currentChannel);
                            adminedChannelCell.avatarImageView.invalidate();
                        }
                    }
                }
                break;
            case 6:
                UserCell.AnonymousClass2 anonymousClass3 = ((ChatEditActivity) this.f$0).avatarImage;
                if (anonymousClass3 != null) {
                    anonymousClass3.invalidate();
                }
                break;
            case 7:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.f$0;
                LinearLayout linearLayout2 = chatEditTypeActivity.adminnedChannelsLayout;
                if (linearLayout2 != null) {
                    int childCount5 = linearLayout2.getChildCount();
                    for (int i7 = 0; i7 < childCount5; i7++) {
                        View childAt4 = chatEditTypeActivity.adminnedChannelsLayout.getChildAt(i7);
                        if (childAt4 instanceof AdminedChannelCell) {
                            AdminedChannelCell adminedChannelCell2 = (AdminedChannelCell) childAt4;
                            adminedChannelCell2.avatarDrawable.setInfo(adminedChannelCell2.currentAccount, adminedChannelCell2.currentChannel);
                            adminedChannelCell2.avatarImageView.invalidate();
                        }
                    }
                }
                chatEditTypeActivity.permanentLinkView.updateColors();
                InviteLinkBottomSheet inviteLinkBottomSheet = chatEditTypeActivity.inviteLinkBottomSheet;
                if (inviteLinkBottomSheet != null) {
                    inviteLinkBottomSheet.updateColors$1();
                }
                break;
            case 8:
                ChatLinkActivity chatLinkActivity = (ChatLinkActivity) this.f$0;
                RecyclerListView recyclerListView = chatLinkActivity.listView;
                if (recyclerListView != null) {
                    int childCount6 = recyclerListView.getChildCount();
                    for (int i8 = 0; i8 < childCount6; i8++) {
                        View childAt5 = chatLinkActivity.listView.getChildAt(i8);
                        if (childAt5 instanceof ManageChatUserCell) {
                            ((ManageChatUserCell) childAt5).update(0);
                        }
                    }
                }
                break;
            case 9:
                ((ChatReactionsEditActivity) this.f$0).updateColors$2();
                break;
            case 10:
                ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) this.f$0;
                ChatActivity.AnonymousClass34 anonymousClass36 = chatRightsEditActivity.listView;
                if (anonymousClass36 != null) {
                    int childCount7 = anonymousClass36.getChildCount();
                    for (int i9 = 0; i9 < childCount7; i9++) {
                        View childAt6 = chatRightsEditActivity.listView.getChildAt(i9);
                        if (childAt6 instanceof UserCell2) {
                            ((UserCell2) childAt6).update();
                        }
                    }
                }
                break;
            case 11:
                ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
                ChatActivity.AnonymousClass34 anonymousClass37 = chatUsersActivity.listView;
                if (anonymousClass37 != null) {
                    int childCount8 = anonymousClass37.getChildCount();
                    for (int i10 = 0; i10 < childCount8; i10++) {
                        View childAt7 = chatUsersActivity.listView.getChildAt(i10);
                        if (childAt7 instanceof ManageChatUserCell) {
                            ((ManageChatUserCell) childAt7).update(0);
                        }
                    }
                }
                break;
            case 12:
                AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.f$0;
                audioPlayerAlert.searchItem.getSearchField().setCursorColor(audioPlayerAlert.getThemedColor(Theme.key_player_actionBarTitle));
                ActionBarMenuItem actionBarMenuItem2 = audioPlayerAlert.repeatButton;
                actionBarMenuItem2.setIconColor(audioPlayerAlert.getThemedColor(((Integer) actionBarMenuItem2.getTag()).intValue()));
                Drawable background = actionBarMenuItem2.getBackground();
                int i11 = Theme.key_listSelector;
                Theme.setSelectorDrawableColor(background, audioPlayerAlert.getThemedColor(i11), true);
                ActionBarMenuItem actionBarMenuItem3 = audioPlayerAlert.optionsButton;
                actionBarMenuItem3.setIconColor(audioPlayerAlert.getThemedColor(Theme.key_player_button));
                Theme.setSelectorDrawableColor(actionBarMenuItem3.getBackground(), audioPlayerAlert.getThemedColor(i11), true);
                int themedColor3 = audioPlayerAlert.getThemedColor(Theme.key_player_progressBackground);
                LineProgressView lineProgressView = audioPlayerAlert.progressView;
                lineProgressView.setBackgroundColor(themedColor3);
                lineProgressView.setProgressColor(audioPlayerAlert.getThemedColor(Theme.key_player_progress));
                audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.shuffleListItem, SharedConfig.shuffleMusic);
                audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.reverseOrderItem, SharedConfig.playOrderReversed);
                audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.repeatListItem, SharedConfig.repeatMode == 1);
                audioPlayerAlert.setMenuItemChecked(audioPlayerAlert.repeatSongItem, SharedConfig.repeatMode == 2);
                int i12 = Theme.key_actionBarDefaultSubmenuBackground;
                actionBarMenuItem2.redrawPopup(audioPlayerAlert.getThemedColor(i12));
                int i13 = Theme.key_actionBarDefaultSubmenuItem;
                actionBarMenuItem3.setPopupItemsColor(audioPlayerAlert.getThemedColor(i13), false);
                actionBarMenuItem3.setPopupItemsColor(audioPlayerAlert.getThemedColor(i13), true);
                actionBarMenuItem3.redrawPopup(audioPlayerAlert.getThemedColor(i12));
                break;
            case 13:
                ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = (ChatAttachAlertContactsLayout) this.f$0;
                ChatActivity.AnonymousClass34 anonymousClass38 = chatAttachAlertContactsLayout.listView;
                if (anonymousClass38 != null) {
                    int childCount9 = anonymousClass38.getChildCount();
                    for (int i14 = 0; i14 < childCount9; i14++) {
                        View childAt8 = anonymousClass38.getChildAt(i14);
                        if (childAt8 instanceof ChatAttachAlertContactsLayout.UserCell) {
                            ((ChatAttachAlertContactsLayout.UserCell) childAt8).update();
                        }
                    }
                }
                ChatAttachAlert.AttachSearchField attachSearchField = chatAttachAlertContactsLayout.searchField;
                if (attachSearchField != null) {
                    attachSearchField.updateColors$1();
                }
                break;
            case 14:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.f$0;
                chatAttachAlertLocationLayout.mapTypeButton.setIconColor(Theme.getColor(Theme.key_location_actionIcon, chatAttachAlertLocationLayout.resourcesProvider));
                chatAttachAlertLocationLayout.mapTypeButton.redrawPopup(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, chatAttachAlertLocationLayout.resourcesProvider));
                chatAttachAlertLocationLayout.mapTypeButton.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, chatAttachAlertLocationLayout.resourcesProvider), true);
                chatAttachAlertLocationLayout.mapTypeButton.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, chatAttachAlertLocationLayout.resourcesProvider), false);
                if (chatAttachAlertLocationLayout.map != null) {
                    if (!Theme.currentTheme.isDark() && AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, chatAttachAlertLocationLayout.resourcesProvider)) >= 0.721f) {
                        if (chatAttachAlertLocationLayout.currentMapStyleDark) {
                            chatAttachAlertLocationLayout.currentMapStyleDark = false;
                            chatAttachAlertLocationLayout.map.setMapStyle(null);
                        }
                    } else if (!chatAttachAlertLocationLayout.currentMapStyleDark) {
                        chatAttachAlertLocationLayout.currentMapStyleDark = true;
                        chatAttachAlertLocationLayout.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                    }
                }
                break;
            case 15:
                ColorPicker colorPicker = (ColorPicker) this.f$0;
                ActionBarMenuItem actionBarMenuItem4 = colorPicker.menuItem;
                actionBarMenuItem4.setIconColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, colorPicker.resourcesProvider));
                Theme.setDrawableColor(Theme.getColor(Theme.key_dialogButtonSelector, colorPicker.resourcesProvider), actionBarMenuItem4.getBackground());
                actionBarMenuItem4.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, colorPicker.resourcesProvider), false);
                actionBarMenuItem4.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, colorPicker.resourcesProvider), true);
                actionBarMenuItem4.redrawPopup(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, colorPicker.resourcesProvider));
                break;
            case 16:
                ((MediaActivity) this.f$0).updateColors$3();
                break;
            case 17:
                ((PermanentLinkBottomSheet) this.f$0).updateColors$10();
                break;
            case 18:
                ((PollVotesAlert) this.f$0).updatePlaceholder();
                break;
            case 19:
                NumberTextView numberTextView = ((SearchViewPager) this.f$0).selectedMessagesCountTextView;
                if (numberTextView != null) {
                    numberTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
                }
                break;
            case 20:
                ((Runnable) this.f$0).run();
                break;
            case 21:
                ((StickersAlert) this.f$0).updateColors(false);
                break;
            case 22:
                ((TrendingStickersLayout) this.f$0).updateColors$1();
                break;
            case 23:
                ((ContactAddActivity) this.f$0).lambda$getThemeDescriptions$23();
                break;
            case 24:
                ((ContactsActivity) this.f$0).lambda$getThemeDescriptions$14();
                break;
            case 25:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.f$0;
                ChatActivity.AnonymousClass34 anonymousClass310 = filterCreateActivity.listView;
                if (anonymousClass310 != null) {
                    int childCount10 = anonymousClass310.getChildCount();
                    for (int i15 = 0; i15 < childCount10; i15++) {
                        View childAt9 = filterCreateActivity.listView.getChildAt(i15);
                        if (childAt9 instanceof UserCell) {
                            ((UserCell) childAt9).update(0);
                        }
                    }
                }
                break;
            case 26:
                CalendarActivity.AnonymousClass5 anonymousClass5 = ((FilteredSearchView) this.f$0).floatingDateView;
                if (anonymousClass5 != null && (blurredBackgroundDrawable = (BlurredBackgroundDrawable) anonymousClass5.val$headerShadowDrawable) != null) {
                    blurredBackgroundDrawable.updateColors();
                    break;
                }
                break;
            case 27:
                ((GradientHeaderActivity) this.f$0).updateColors$13();
                break;
            case 28:
                GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.f$0;
                RecyclerListView recyclerListView2 = groupCreateActivity.listView;
                if (recyclerListView2 != null) {
                    int childCount11 = recyclerListView2.getChildCount();
                    for (int i16 = 0; i16 < childCount11; i16++) {
                        View childAt10 = groupCreateActivity.listView.getChildAt(i16);
                        if (childAt10 instanceof GroupCreateUserCell) {
                            ((GroupCreateUserCell) childAt10).update(0);
                        }
                    }
                }
                FragmentSearchField fragmentSearchField = groupCreateActivity.searchField;
                if (fragmentSearchField != null) {
                    fragmentSearchField.updateColors$1();
                }
                FragmentFloatingButton fragmentFloatingButton = groupCreateActivity.floatingButton;
                if (fragmentFloatingButton != null) {
                    fragmentFloatingButton.updateColors$1();
                }
                break;
            default:
                GroupCreateFinalActivity groupCreateFinalActivity = (GroupCreateFinalActivity) this.f$0;
                RecyclerListView recyclerListView3 = groupCreateFinalActivity.listView;
                if (recyclerListView3 != null) {
                    int childCount12 = recyclerListView3.getChildCount();
                    for (int i17 = 0; i17 < childCount12; i17++) {
                        View childAt11 = groupCreateFinalActivity.listView.getChildAt(i17);
                        if (childAt11 instanceof GroupCreateUserCell) {
                            ((GroupCreateUserCell) childAt11).update(0);
                        }
                    }
                }
                FragmentFloatingButton fragmentFloatingButton2 = groupCreateFinalActivity.floatingButton;
                if (fragmentFloatingButton2 != null) {
                    fragmentFloatingButton2.updateColors$1();
                }
                break;
        }
    }

    @Override
    public final void onAnimationProgress(float f) {
        int i = this.$r8$classId;
    }
}
