package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.Cells.AvailableReactionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarConstructorFragment;
import org.telegram.ui.Components.AvatarConstructorFragment$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.AvatarConstructorFragment.AnonymousClass11;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CreateGroupCallBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.EmojiView.AnonymousClass31;
import org.telegram.ui.Components.FiltersListBottomSheet;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController$DebugItem;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharingLocationsAlert;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.UItem;

public final class ChatLinkActivity$$ExternalSyntheticLambda4 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatLinkActivity$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(int i, final View view) {
        TLRPC.Chat chat;
        String string;
        String string2;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        AvatarConstructorFragment.BackgroundGradient backgroundGradient;
        TLRPC.StickerSet stickerSet;
        int i2;
        String str;
        ReactedUsersListView.OnCustomEmojiSelectedListener onCustomEmojiSelectedListener;
        long j;
        int i3 = 7;
        int i4 = 10;
        int i5 = 3;
        int i6 = 2;
        ?? r13 = -1;
        Object item = null;
        ?? r15 = 0;
        int i7 = 1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                final ChatLinkActivity chatLinkActivity = (ChatLinkActivity) obj;
                if (chatLinkActivity.getParentActivity() != null) {
                    RecyclerView.Adapter adapter = chatLinkActivity.listView.getAdapter();
                    ChatLinkActivity.SearchAdapter searchAdapter = chatLinkActivity.searchAdapter;
                    if (adapter == searchAdapter) {
                        chat = (TLRPC.Chat) searchAdapter.searchResult.get(i);
                    } else {
                        int i8 = chatLinkActivity.chatStartRow;
                        chat = (i < i8 || i >= chatLinkActivity.chatEndRow) ? null : (TLRPC.Chat) chatLinkActivity.chats.get(i - i8);
                    }
                    boolean z = chatLinkActivity.isChannel;
                    if (chat != null) {
                        if (z && chatLinkActivity.info.linked_chat_id == 0) {
                            chatLinkActivity.showLinkAlert(chat, true);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            chatLinkActivity.presentFragment(new ChatActivity(bundle));
                        }
                        break;
                    } else if (i == chatLinkActivity.createChatRow) {
                        if (z && chatLinkActivity.info.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{chatLinkActivity.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = chatLinkActivity.currentChat;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
                            groupCreateFinalActivity.delegate = new GroupCreateFinalActivity.GroupCreateFinalActivityDelegate() {
                                public AnonymousClass3() {
                                }

                                @Override
                                public final void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity2, long j2) {
                                    ChatLinkActivity chatLinkActivity2 = ChatLinkActivity.this;
                                    chatLinkActivity2.linkChat(chatLinkActivity2.getMessagesController().getChat(Long.valueOf(j2)), groupCreateFinalActivity2);
                                }
                            };
                            chatLinkActivity.presentFragment(groupCreateFinalActivity);
                            break;
                        } else if (!chatLinkActivity.chats.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) chatLinkActivity.chats.get(0);
                            AlertDialog.Builder builder = new AlertDialog.Builder(chatLinkActivity.getParentActivity(), 0, null);
                            if (z) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                string2 = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                string2 = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            alertDialog.message = AndroidUtilities.replaceTags(string2);
                            builder.setPositiveButton(LocaleController.getString(R.string.DiscussionUnlink), new ChatActivity$$ExternalSyntheticLambda356(chatLinkActivity, 18));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            chatLinkActivity.showDialog(alertDialog);
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) obj;
                if (view instanceof HintDialogCell) {
                    HintDialogCell hintDialogCell = (HintDialogCell) view;
                    if (hintDialogCell.premiumBlocked) {
                        DialogsActivity.AnonymousClass48 anonymousClass48 = dialogsSearchAdapter.delegate;
                        if (anonymousClass48 != null) {
                            DialogsActivity.this.showPremiumBlockedToast$2(hintDialogCell.getDialogId(), view);
                        }
                    }
                }
                DialogsActivity.AnonymousClass48 anonymousClass49 = dialogsSearchAdapter.delegate;
                if (anonymousClass49 != null) {
                    long jLongValue = ((Long) view.getTag()).longValue();
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    if (!dialogsActivity.onlySelect) {
                        Bundle bundle3 = new Bundle();
                        if (DialogObject.isUserDialog(jLongValue)) {
                            bundle3.putLong("user_id", jLongValue);
                        } else {
                            bundle3.putLong("chat_id", -jLongValue);
                        }
                        dialogsActivity.closeSearch$1();
                        if (AndroidUtilities.isTablet() && dialogsActivity.viewPages != null) {
                            int i9 = 0;
                            while (true) {
                                DialogsActivity.ViewPage[] viewPageArr = dialogsActivity.viewPages;
                                if (i9 < viewPageArr.length) {
                                    DialogsActivity.AnonymousClass19 anonymousClass19 = viewPageArr[i9].dialogsAdapter;
                                    dialogsActivity.openedDialogId.dialogId = jLongValue;
                                    anonymousClass19.openedDialogId = jLongValue;
                                    i9++;
                                } else {
                                    dialogsActivity.updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                                }
                            }
                        }
                        if (dialogsActivity.searchString == null) {
                            if (dialogsActivity.getMessagesController().checkCanOpenChat(bundle3, dialogsActivity)) {
                                dialogsActivity.presentFragment(new ChatActivity(bundle3));
                            }
                        } else if (dialogsActivity.getMessagesController().checkCanOpenChat(bundle3, dialogsActivity)) {
                            dialogsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            dialogsActivity.presentFragment(new ChatActivity(bundle3));
                        }
                        break;
                    } else if (dialogsActivity.validateSlowModeDialog(jLongValue)) {
                        if (!dialogsActivity.selectedDialogs.isEmpty()) {
                            dialogsActivity.findAndUpdateCheckBox(jLongValue, dialogsActivity.addOrRemoveSelectedDialog(jLongValue, null));
                            dialogsActivity.updateSelectedCount();
                            ((BaseFragment) dialogsActivity).actionBar.closeSearchField(true);
                        } else {
                            DialogsActivity.this.didSelectResult(jLongValue, 0L, true, null);
                        }
                        break;
                    }
                }
                break;
            case 2:
                ArchiveSettingsActivity archiveSettingsActivity = (ArchiveSettingsActivity) obj;
                if (i >= 0) {
                    ArrayList arrayList = archiveSettingsActivity.items;
                    if (i < arrayList.size()) {
                        int i10 = ((ArchiveSettingsActivity.ItemInner) arrayList.get(i)).id;
                        if (i10 == 1) {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings = archiveSettingsActivity.settings;
                            boolean z2 = !globalPrivacySettings.keep_archived_unmuted;
                            globalPrivacySettings.keep_archived_unmuted = z2;
                            ((TextCheckCell) view).setChecked(z2);
                            archiveSettingsActivity.changed = true;
                        } else if (i10 == 4) {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = archiveSettingsActivity.settings;
                            boolean z3 = !globalPrivacySettings2.keep_archived_folders;
                            globalPrivacySettings2.keep_archived_folders = z3;
                            ((TextCheckCell) view).setChecked(z3);
                            archiveSettingsActivity.changed = true;
                        } else if (i10 == 7) {
                            if (archiveSettingsActivity.getUserConfig().isPremium() || archiveSettingsActivity.getMessagesController().autoarchiveAvailable || archiveSettingsActivity.settings.archive_and_mute_new_noncontact_peers) {
                                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = archiveSettingsActivity.settings;
                                boolean z4 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                                globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z4;
                                ((TextCheckCell) view).setChecked(z4);
                                archiveSettingsActivity.changed = true;
                            } else {
                                Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(archiveSettingsActivity.getParentActivity(), archiveSettingsActivity.getResourceProvider());
                                LinkSpanDrawable.LinksTextView linksTextView = simpleLayout.textView;
                                linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), Theme.key_undo_cancelColor, 0, new ArticleViewer$$ExternalSyntheticLambda3(archiveSettingsActivity, i5)));
                                linksTextView.setSingleLine(false);
                                linksTextView.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                                simpleLayout.imageView.setImageResource(R.drawable.msg_settings_premium);
                                Bulletin.make(archiveSettingsActivity, simpleLayout, 3500).show();
                                int i11 = -archiveSettingsActivity.shiftDp;
                                archiveSettingsActivity.shiftDp = i11;
                                AndroidUtilities.shakeViewSpring(view, i11);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                final ArchivedStickersActivity archivedStickersActivity = (ArchivedStickersActivity) obj;
                if (i >= archivedStickersActivity.stickersStartRow && i < archivedStickersActivity.stickersEndRow && archivedStickersActivity.getParentActivity() != null) {
                    final TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) archivedStickersActivity.sets.get(i - archivedStickersActivity.stickersStartRow);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    StickersAlert stickersAlert = new StickersAlert(archivedStickersActivity.getParentActivity(), archivedStickersActivity, inputStickerSet, null, null, null);
                    stickersAlert.installDelegate = new StickersAlert.StickersAlertInstallDelegate() {
                        @Override
                        public final void onStickerSetInstalled() {
                            ProgressButton progressButton = ((ArchivedStickerSetCell) view).addButton;
                            if (progressButton != null) {
                                progressButton.setDrawProgress(true, true);
                            }
                            LongSparseArray longSparseArray = ArchivedStickersActivity.this.installingStickerSets;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            longSparseArray.put(stickerSetCovered2, stickerSetCovered2.set.id);
                        }
                    };
                    archivedStickersActivity.showDialog(stickersAlert);
                    break;
                }
                break;
            case 4:
                ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = (ChatAttachAlertQuickRepliesLayout) obj;
                RecyclerView.Adapter adapter2 = chatAttachAlertQuickRepliesLayout.listView.getAdapter();
                ChatAttachAlertQuickRepliesLayout.ShareSearchAdapter shareSearchAdapter = chatAttachAlertQuickRepliesLayout.searchAdapter;
                if (adapter2 == shareSearchAdapter) {
                    int i12 = i - 1;
                    if (i12 < 0) {
                        shareSearchAdapter.getClass();
                    } else if (i12 < shareSearchAdapter.searchResult.size()) {
                        item = shareSearchAdapter.searchResult.get(i12);
                    }
                } else {
                    ChatAttachAlertQuickRepliesLayout.ShareAdapter shareAdapter = chatAttachAlertQuickRepliesLayout.listAdapter;
                    int sectionForPosition = shareAdapter.getSectionForPosition(i);
                    int positionInSectionForPosition = shareAdapter.getPositionInSectionForPosition(i);
                    if (positionInSectionForPosition >= 0 && sectionForPosition >= 0) {
                        item = shareAdapter.getItem(sectionForPosition, positionInSectionForPosition);
                    }
                }
                if (item instanceof QuickRepliesController.QuickReply) {
                    ChatAttachAlert chatAttachAlert = chatAttachAlertQuickRepliesLayout.parentAlert;
                    if (UserConfig.getInstance(chatAttachAlert.currentAccount).isPremium()) {
                        AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), ((QuickRepliesController.QuickReply) item).getMessagesCount(), new ArticleViewer$$ExternalSyntheticLambda21(i3, chatAttachAlertQuickRepliesLayout, (QuickRepliesController.QuickReply) item), 0L);
                    } else if (chatAttachAlert.baseFragment != null) {
                        new PremiumFeatureBottomSheet(chatAttachAlert.baseFragment, chatAttachAlertQuickRepliesLayout.getContext(), chatAttachAlert.currentAccount, true, 31, false, null).show();
                    }
                }
                break;
            case 5:
                ChatbotSheet chatbotSheet = (ChatbotSheet) obj;
                UItem item2 = chatbotSheet.adapter.getItem(i - 1);
                if (item2 != null) {
                    BusinessRecipientsHelper businessRecipientsHelper = chatbotSheet.recipientsHelper;
                    if (!businessRecipientsHelper.onClick(item2)) {
                        int i13 = item2.id;
                        if (i13 == -1) {
                            chatbotSheet.exclude = true;
                            businessRecipientsHelper.exclude = true;
                            chatbotSheet.adapter.update(true);
                            chatbotSheet.checkDone$5(true);
                        } else if (i13 == -2) {
                            chatbotSheet.exclude = false;
                            businessRecipientsHelper.exclude = false;
                            chatbotSheet.adapter.update(true);
                            chatbotSheet.checkDone$5(true);
                        }
                        break;
                    }
                }
                break;
            case 6:
                ThemesHorizontalListCell themesHorizontalListCell = (ThemesHorizontalListCell) obj;
                themesHorizontalListCell.getClass();
                themesHorizontalListCell.selectTheme(((ThemesHorizontalListCell.InnerThemeView) view).themeInfo);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    themesHorizontalListCell.smoothScrollBy(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > themesHorizontalListCell.getMeasuredWidth()) {
                    themesHorizontalListCell.smoothScrollBy(right - themesHorizontalListCell.getMeasuredWidth(), 0, null);
                }
                break;
            case 7:
                ChannelColorActivity.ThemeChooser themeChooser = (ChannelColorActivity.ThemeChooser) obj;
                if (i < 0) {
                    themeChooser.getClass();
                    break;
                } else {
                    ArrayList arrayList2 = themeChooser.items;
                    if (i < arrayList2.size()) {
                        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) arrayList2.get(i);
                        EmojiThemes emojiThemes = chatThemeItem.chatTheme;
                        themeChooser.setSelectedEmoticon((emojiThemes == null || emojiThemes.showAsDefaultStub) ? null : emojiThemes.emoji, true);
                        int left2 = view.getLeft();
                        MessageSeenView.AnonymousClass1 anonymousClass1 = themeChooser.listView;
                        if (left2 < AndroidUtilities.dp(24.0f) + anonymousClass1.getPaddingLeft()) {
                            anonymousClass1.smoothScrollBy(-((AndroidUtilities.dp(48.0f) + anonymousClass1.getPaddingLeft()) - view.getLeft()), 0, null);
                        } else if (view.getWidth() + view.getLeft() > (anonymousClass1.getMeasuredWidth() - anonymousClass1.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                            anonymousClass1.smoothScrollBy(RichMessageLayout$$ExternalSyntheticOutline1.m(anonymousClass1.getMeasuredWidth() - anonymousClass1.getPaddingRight(), 48.0f, view.getWidth() + view.getLeft()), 0, null);
                        }
                        Utilities.Callback callback = themeChooser.onEmoticonSelected;
                        if (callback != null) {
                            EmojiThemes emojiThemes2 = chatThemeItem.chatTheme;
                            if (emojiThemes2 != null && !emojiThemes2.showAsDefaultStub) {
                                item = emojiThemes2.emoji;
                            }
                            callback.run(item);
                        }
                        break;
                    }
                }
                break;
            case 8:
                ChatReactionsEditActivity chatReactionsEditActivity = (ChatReactionsEditActivity) obj;
                boolean z5 = chatReactionsEditActivity.isChannel;
                if (i > (z5 ? 1 : 2)) {
                    AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
                    ArrayList arrayList3 = chatReactionsEditActivity.availableReactions;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i - (z5 ? 2 : 3));
                    boolean zContains = chatReactionsEditActivity.chatReactions.contains(tL_availableReaction.reaction);
                    boolean z6 = !zContains;
                    if (zContains) {
                        chatReactionsEditActivity.chatReactions.remove(tL_availableReaction.reaction);
                        if (chatReactionsEditActivity.chatReactions.isEmpty()) {
                            ChatReactionsEditActivity.AnonymousClass2 anonymousClass2 = chatReactionsEditActivity.listAdapter;
                            if (anonymousClass2 != null) {
                                anonymousClass2.mObservable.notifyItemRangeRemoved(chatReactionsEditActivity.isChannel ? 1 : 2, arrayList3.size() + 1);
                            }
                            chatReactionsEditActivity.setCheckedEnableReactionCell(2, true);
                        }
                    } else {
                        chatReactionsEditActivity.chatReactions.add(tL_availableReaction.reaction);
                    }
                    Switch r1 = availableReactionCell.switchView;
                    if (r1 != null) {
                        r1.setChecked(r1.drawIconType, z6, true);
                    }
                    CheckBox2 checkBox2 = availableReactionCell.checkBox;
                    if (checkBox2 != null) {
                        checkBox2.checkBoxBase.setChecked(-1, z6, true);
                    }
                    break;
                }
                break;
            case 9:
                ((AIEditorAlert) obj).adapter.getItem(i - 1);
                break;
            case 10:
                ((AIEditorAlert.AiStyleAlert) obj).adapter.getItem(i - 1);
                break;
            case 11:
                AvatarConstructorFragment.BackgroundSelectView backgroundSelectView = (AvatarConstructorFragment.BackgroundSelectView) obj;
                backgroundSelectView.getClass();
                boolean z7 = view instanceof AvatarConstructorFragment.GradientSelectorView;
                AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                AppIconsSelectorCell.AnonymousClass1 anonymousClass3 = backgroundSelectView.adapter;
                if (z7) {
                    AvatarConstructorFragment.GradientSelectorView gradientSelectorView = (AvatarConstructorFragment.GradientSelectorView) view;
                    if (!gradientSelectorView.isCustom) {
                        AvatarConstructorFragment.BackgroundGradient backgroundGradient2 = gradientSelectorView.backgroundGradient;
                        backgroundSelectView.selectedItemId = backgroundGradient2.stableId;
                        avatarConstructorFragment.previewView.setGradient(backgroundGradient2, false);
                        if (anonymousClass3 != null) {
                            anonymousClass3.mObservable.notifyChanged();
                        }
                        avatarConstructorFragment.updateButton$7();
                    }
                }
                if (backgroundSelectView.selectedItemId != 1 && (backgroundGradient = backgroundSelectView.customSelectedGradient) != null) {
                    backgroundSelectView.selectedItemId = 1;
                    avatarConstructorFragment.previewView.setGradient(backgroundGradient, true);
                    if (anonymousClass3 != null) {
                        anonymousClass3.mObservable.notifyChanged();
                    }
                    avatarConstructorFragment.updateButton$7();
                    break;
                } else if (avatarConstructorFragment.bottomSheet == null) {
                    if (!avatarConstructorFragment.previewView.expanded) {
                        avatarConstructorFragment.setExpanded(true, true, true);
                    }
                    AvatarConstructorFragment.BackgroundGradient backgroundGradient3 = avatarConstructorFragment.previewView.backgroundGradient;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(avatarConstructorFragment.getParentActivity(), avatarConstructorFragment.getClassGuid());
                    AvatarConstructorFragment.AnonymousClass11 anonymousClass11 = avatarConstructorFragment.new AnonymousClass11(avatarConstructorFragment.getParentActivity());
                    avatarConstructorFragment.bottomSheet = anonymousClass11;
                    anonymousClass11.fixNavigationBar();
                    avatarConstructorFragment.bottomSheet.pauseAllHeavyOperations = false;
                    avatarConstructorFragment.drawForBlur = true;
                    avatarConstructorFragment.colorPickerPreviewView.setBackground(new BitmapDrawable(avatarConstructorFragment.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(avatarConstructorFragment.fragmentView, 12.0f, 10)));
                    avatarConstructorFragment.drawForBlur = false;
                    avatarConstructorFragment.colorPickerPreviewView.setVisibility(0);
                    avatarConstructorFragment.colorPickerPreviewView.setAlpha(0.0f);
                    avatarConstructorFragment.colorPickerInAnimatoin = true;
                    avatarConstructorFragment.fragmentView.invalidate();
                    avatarConstructorFragment.colorPickerPreviewView.animate().setListener(new AvatarConstructorFragment.AnonymousClass9(avatarConstructorFragment, i7)).alpha(1.0f).setDuration(200L).start();
                    avatarConstructorFragment.colorPickerGradient = new AvatarConstructorFragment.BackgroundGradient();
                    GLIconSettingsView.AnonymousClass3.AnonymousClass2 anonymousClass4 = new GLIconSettingsView.AnonymousClass3.AnonymousClass2(avatarConstructorFragment.getParentActivity(), r15, new AvatarConstructorFragment$$ExternalSyntheticLambda3(avatarConstructorFragment, i6), i7);
                    AvatarConstructorFragment.BackgroundGradient backgroundGradient4 = avatarConstructorFragment.previewView.backgroundGradient;
                    if (backgroundGradient4 != null) {
                        AvatarConstructorFragment.BackgroundGradient backgroundGradient5 = avatarConstructorFragment.colorPickerGradient;
                        int i14 = backgroundGradient4.color4;
                        backgroundGradient5.color4 = i14;
                        anonymousClass4.setColor(i14, 3);
                        AvatarConstructorFragment.BackgroundGradient backgroundGradient6 = avatarConstructorFragment.colorPickerGradient;
                        int i15 = avatarConstructorFragment.previewView.backgroundGradient.color3;
                        backgroundGradient6.color3 = i15;
                        anonymousClass4.setColor(i15, 2);
                        AvatarConstructorFragment.BackgroundGradient backgroundGradient7 = avatarConstructorFragment.colorPickerGradient;
                        int i16 = avatarConstructorFragment.previewView.backgroundGradient.color2;
                        backgroundGradient7.color2 = i16;
                        anonymousClass4.setColor(i16, 1);
                        AvatarConstructorFragment.BackgroundGradient backgroundGradient8 = avatarConstructorFragment.colorPickerGradient;
                        int i17 = avatarConstructorFragment.previewView.backgroundGradient.color1;
                        backgroundGradient8.color1 = i17;
                        anonymousClass4.setColor(i17, 0);
                    }
                    AvatarConstructorFragment.BackgroundGradient backgroundGradient9 = avatarConstructorFragment.colorPickerGradient;
                    if (backgroundGradient9.color4 != 0) {
                        i5 = 4;
                    } else if (backgroundGradient9.color3 == 0) {
                        i5 = backgroundGradient9.color2 != 0 ? 2 : 1;
                    }
                    anonymousClass4.setType(-1, 4, i5, false);
                    avatarConstructorFragment.previewView.setGradient(avatarConstructorFragment.colorPickerGradient, true);
                    avatarConstructorFragment.updateButton$7();
                    ?? linearLayout = new LinearLayout(avatarConstructorFragment.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(anonymousClass4);
                    FrameLayout frameLayout = new FrameLayout(avatarConstructorFragment.getParentActivity());
                    frameLayout.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
                    TextView textView2 = new TextView(avatarConstructorFragment.getParentActivity());
                    textView2.setTextSize(1, 14.0f);
                    textView2.setText(LocaleController.getString(R.string.SetColor));
                    textView2.setGravity(17);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                    frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2, 17));
                    linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(i4, avatarConstructorFragment, zArr));
                    avatarConstructorFragment.bottomSheet.setCustomView(linearLayout);
                    AvatarConstructorFragment.AnonymousClass11 anonymousClass12 = avatarConstructorFragment.bottomSheet;
                    anonymousClass12.smoothKeyboardAnimationEnabled = true;
                    anonymousClass12.setDimBehind(false);
                    avatarConstructorFragment.bottomSheet.show();
                    avatarConstructorFragment.isLightStatusBar();
                    break;
                }
                break;
            case 12:
                ((ChatThemeBottomSheet) obj).lambda$new$2(i, view);
                break;
            case 13:
                CreateGroupCallBottomSheet createGroupCallBottomSheet = (CreateGroupCallBottomSheet) obj;
                if (i > 3) {
                    createGroupCallBottomSheet.selectedPeer = (TLRPC.Peer) createGroupCallBottomSheet.chats.get(i - 4);
                    if (view instanceof GroupCreateUserCell) {
                        ((GroupCreateUserCell) view).setChecked(true, true);
                    }
                    int i18 = 0;
                    while (true) {
                        RecyclerListView recyclerListView = createGroupCallBottomSheet.recyclerListView;
                        if (i18 < recyclerListView.getChildCount()) {
                            View childAt = recyclerListView.getChildAt(i18);
                            if (childAt != view && (childAt instanceof GroupCreateUserCell)) {
                                ((GroupCreateUserCell) childAt).setChecked(false, true);
                            }
                            i18++;
                        }
                    }
                } else {
                    createGroupCallBottomSheet.getClass();
                }
                break;
            case 14:
                EmojiView.EmojiGridAdapter emojiGridAdapter = (EmojiView.EmojiGridAdapter) obj;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList4 = new ArrayList();
                    EmojiView emojiView = EmojiView.this;
                    int i19 = emojiView.currentAccount;
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                    while (r15 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = featuredEmojiSets.get(r15);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                r13 = r15;
                            }
                        }
                        r13 = r13;
                        r15++;
                    }
                    MediaDataController.getInstance(i19).markFeaturedStickersAsRead(true, true);
                    Context context = emojiView.getContext();
                    BaseFragment baseFragment = emojiView.fragment;
                    EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(baseFragment, context, baseFragment == null ? emojiView.resourcesProvider : baseFragment.getResourceProvider(), arrayList4);
                    if (r13 >= 0) {
                        emojiPacksAlert.highlightIndex = r13 == true ? 1 : 0;
                    }
                    if (baseFragment == null) {
                        emojiPacksAlert.show();
                    } else {
                        baseFragment.showDialog(emojiPacksAlert);
                    }
                }
                break;
            case 15:
                TLRPC.StickerSetCovered stickerSetCovered4 = (TLRPC.StickerSetCovered) view.getTag();
                EmojiView emojiView2 = EmojiView.this;
                emojiView2.delegate.showTrendingStickersAlert(new TrendingStickersLayout(emojiView2.getContext(), emojiView2.new AnonymousClass31(), emojiView2.primaryInstallingStickerSets, emojiView2.installingStickerSets, emojiView2.removingStickerSets, stickerSetCovered4, emojiView2.resourcesProvider));
                break;
            case 16:
                ((FiltersListBottomSheet) obj).lambda$new$0$1(i, view);
                break;
            case 17:
                FloatingDebugView floatingDebugView = (FloatingDebugView) obj;
                Runnable runnable = ((FloatingDebugController$DebugItem) floatingDebugView.debugItems.get(i)).action;
                if (runnable != null) {
                    runnable.run();
                    floatingDebugView.showBigMenu(false);
                }
                break;
            case 18:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) obj;
                folderBottomSheet.getClass();
                if ((view instanceof GroupCreateUserCell) && (i2 = (i - 1) - folderBottomSheet.usersStartRow) >= 0) {
                    ArrayList arrayList5 = folderBottomSheet.peers;
                    if (i2 < arrayList5.size()) {
                        long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i2));
                        ArrayList arrayList6 = folderBottomSheet.selectedPeers;
                        if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                            arrayList6.add(Long.valueOf(peerDialogId));
                            ((GroupCreateUserCell) view).setChecked(true, true);
                        } else if (folderBottomSheet.alreadyJoined.contains(Long.valueOf(peerDialogId))) {
                            int i20 = -folderBottomSheet.shiftDp;
                            folderBottomSheet.shiftDp = i20;
                            AndroidUtilities.shakeViewSpring(view, i20);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            ArrayList arrayList7 = new ArrayList();
                            BaseFragment baseFragment2 = folderBottomSheet.baseFragment;
                            if (peerDialogId >= 0) {
                                arrayList7.add(baseFragment2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                                str = "beep boop.";
                            } else {
                                TLRPC.Chat chat4 = baseFragment2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                                String string3 = ChatObject.isChannelAndNotMegaGroup(chat4) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                                arrayList7.add(chat4);
                                str = string3;
                            }
                            if (folderBottomSheet.lastClickedDialogId != peerDialogId || System.currentTimeMillis() - folderBottomSheet.lastClicked > 1500) {
                                folderBottomSheet.lastClickedDialogId = peerDialogId;
                                folderBottomSheet.lastClicked = System.currentTimeMillis();
                                Bulletin bulletinCreateChatsBulletin = new BulletinFactory(folderBottomSheet.bulletinContainer, null).createChatsBulletin(str, arrayList7);
                                bulletinCreateChatsBulletin.duration = 1500;
                                bulletinCreateChatsBulletin.show();
                            }
                        } else {
                            arrayList6.remove(Long.valueOf(peerDialogId));
                            ((GroupCreateUserCell) view).setChecked(false, true);
                        }
                        folderBottomSheet.updateCount(true);
                        folderBottomSheet.updateHeaderCell();
                        folderBottomSheet.announceSelection(false);
                        break;
                    }
                }
                break;
            case 19:
                GroupVoipInviteAlert groupVoipInviteAlert = (GroupVoipInviteAlert) obj;
                if (i == groupVoipInviteAlert.addNewRow) {
                    GroupCallActivity.this.getLink(true);
                    groupVoipInviteAlert.lambda$showGiftOfferSheet$15();
                    break;
                } else if (view instanceof ManageChatUserCell) {
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                    if (!groupVoipInviteAlert.invitedUsers.contains(Long.valueOf(manageChatUserCell.getUserId()))) {
                        GroupCallActivity.this.inviteUserToCall(manageChatUserCell.getUserId(), true);
                        break;
                    }
                }
                break;
            case 20:
                PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) obj;
                PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
                anonymousClass67.textOptionsView.setTypeface(paintTypeface.key);
                PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(anonymousClass67.currentAccount);
                String str2 = paintTypeface.key;
                persistColorPalette.currentTypeface = str2;
                persistColorPalette.mConfig.edit().putString("typeface", str2).apply();
                EntityView entityView = anonymousClass67.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    ((TextPaintView) entityView).setTypeface(paintTypeface);
                }
                anonymousClass67.showTypefaceMenu(false);
                break;
            case 21:
                PaintColorsListView paintColorsListView = (PaintColorsListView) obj;
                paintColorsListView.colorListener.accept(Integer.valueOf(paintColorsListView.colorPalette.getColor(i)));
                PersistColorPalette persistColorPalette2 = paintColorsListView.colorPalette;
                persistColorPalette2.brushColor.put(Integer.valueOf(persistColorPalette2.currentBrush), Integer.valueOf(persistColorPalette2.getColor(i)));
                persistColorPalette2.needSaveBrushColor = true;
                break;
            case 22:
                ((LimitReachedBottomSheet) obj).lambda$onViewCreated$5(view);
                break;
            case 23:
                PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass13 = (PremiumFeatureBottomSheet.AnonymousClass11) obj;
                if (view != null) {
                    anonymousClass13.drawEffectForView(view, true);
                    anonymousClass13.haptic = false;
                    anonymousClass13.smoothScrollBy(0, view.getTop() - ((anonymousClass13.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                }
                break;
            case 24:
                ReactedUsersListView reactedUsersListView = (ReactedUsersListView) obj;
                int itemViewType = reactedUsersListView.adapter.getItemViewType(i);
                if (itemViewType == 0) {
                    ReactedUsersListView.OnProfileSelectedListener onProfileSelectedListener = reactedUsersListView.onProfileSelectedListener;
                    if (onProfileSelectedListener != null) {
                        ArrayList arrayList8 = reactedUsersListView.userReactions;
                        onProfileSelectedListener.onProfileSelected(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i));
                    }
                    break;
                } else if (itemViewType == 1 && (onCustomEmojiSelectedListener = reactedUsersListView.onCustomEmojiSelectedListener) != null) {
                    onCustomEmojiSelectedListener.showCustomEmojiAlert(reactedUsersListView.customEmojiStickerSets);
                    break;
                }
                break;
            case 25:
                ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) obj;
                ReactionsContainerLayout.ReactionsContainerDelegate reactionsContainerDelegate = reactionsContainerLayout.delegate;
                if (reactionsContainerDelegate != null && (view instanceof ReactionsContainerLayout.ReactionHolderView)) {
                    reactionsContainerDelegate.onReactionClicked(reactionsContainerLayout, ((ReactionsContainerLayout.ReactionHolderView) view).currentReaction, false, false);
                    break;
                }
                break;
            case 26:
                HintDialogCell hintDialogCell2 = (HintDialogCell) view;
                ShareAlert shareAlert = ShareAlert.this;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) shareAlert).currentAccount).hints.get(i);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j2 = peer.user_id;
                if (j2 != 0) {
                    j = j2;
                } else {
                    long j3 = peer.channel_id;
                    if (j3 != 0) {
                        j = -j3;
                    } else {
                        j3 = peer.chat_id;
                        if (j3 != 0) {
                            j = -j3;
                        } else {
                            j = 0;
                        }
                    }
                }
                if (!hintDialogCell2.premiumBlocked) {
                    tL_dialog.id = j;
                    shareAlert.selectDialog(null, tL_dialog);
                    boolean z8 = shareAlert.selectedDialogs.indexOfKey(j) >= 0;
                    if (hintDialogCell2.drawCheckbox) {
                        hintDialogCell2.checkBox.checkBoxBase.setChecked(-1, z8, true);
                    }
                } else {
                    shareAlert.showPremiumBlockedToast$1(j, hintDialogCell2);
                }
                break;
            case 27:
                ((SharingLocationsAlert) obj).lambda$new$0$3(i);
                break;
            case 28:
                ((StarAppsSheet) obj).lambda$new$0$12(i);
                break;
            default:
                StickerCategoriesListView stickerCategoriesListView = (StickerCategoriesListView) obj;
                if (i < 1) {
                    stickerCategoriesListView.getClass();
                    break;
                } else {
                    StickerCategoriesListView.EmojiCategory[] emojiCategoryArr = stickerCategoriesListView.categories;
                    if (emojiCategoryArr != null) {
                        StickerCategoriesListView.EmojiCategory emojiCategory = emojiCategoryArr[i - 1];
                        int iDp = AndroidUtilities.dp(64.0f);
                        if (stickerCategoriesListView.getMeasuredWidth() - view.getRight() < iDp) {
                            stickerCategoriesListView.smoothScrollBy(iDp - (stickerCategoriesListView.getMeasuredWidth() - view.getRight()), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
                        } else if (view.getLeft() < iDp) {
                            stickerCategoriesListView.smoothScrollBy(-(iDp - view.getLeft()), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
                        }
                        Utilities.Callback callback2 = stickerCategoriesListView.onCategoryClick;
                        if (callback2 != null) {
                            callback2.run(emojiCategory);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
