package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public final class BoostsActivity$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BoostsActivity$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onItemClick(int i, View view) {
        Object item;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        Paint.FontMetricsInt fontMetrics;
        AnimatedEmojiSpan animatedEmojiSpan;
        int i3;
        int i4;
        int i5;
        Object obj;
        String str5;
        Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0;
        String str6;
        LocationActivity.LocationActivityDelegate locationActivityDelegate;
        float maxZoomLevel;
        float f;
        int size;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        UItem item2;
        int size2 = -1;
        switch (this.$r8$classId) {
            case 0:
                ((BoostsActivity) this.f$0).lambda$createView$12((Context) this.f$1, view, i);
                break;
            case 1:
                ((ChannelColorActivity) this.f$0).lambda$createView$4((TLRPC.ChatFull) this.f$1, view, i);
                break;
            case 2:
                ChannelColorActivity.Adapter adapter = (ChannelColorActivity.Adapter) this.f$0;
                adapter.getClass();
                ChannelColorActivity.PeerColorPicker peerColorPicker = (ChannelColorActivity.PeerColorPicker) this.f$1;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(peerColorPicker.currentAccount).peerColors;
                int i6 = (peerColors == null || i < 0 || i >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i).id;
                ChannelColorActivity channelColorActivity = ChannelColorActivity.this;
                channelColorActivity.selectedReplyColor = i6;
                channelColorActivity.updateButton(true);
                channelColorActivity.updateMessagesPreview(true);
                channelColorActivity.updateProfilePreview();
                int left = view.getLeft();
                MessageSeenView.AnonymousClass1 anonymousClass1 = peerColorPicker.listView;
                if (left < AndroidUtilities.dp(24.0f) + anonymousClass1.getPaddingLeft()) {
                    anonymousClass1.smoothScrollBy(-((AndroidUtilities.dp(48.0f) + anonymousClass1.getPaddingLeft()) - view.getLeft()), 0, null);
                } else if (view.getWidth() + view.getLeft() > (anonymousClass1.getMeasuredWidth() - anonymousClass1.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    anonymousClass1.smoothScrollBy(RichMessageLayout$$ExternalSyntheticOutline1.m(anonymousClass1.getMeasuredWidth() - anonymousClass1.getPaddingRight(), 48.0f, view.getWidth() + view.getLeft()), 0, null);
                }
                break;
            case 3:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                TLObject tLObject = (TLObject) ((MessageSeenView) this.f$1).users.get(i);
                if (tLObject != null) {
                    chatActivity.closeMenu(true);
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                    }
                    chatActivity.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 4:
                ((ChatRightsEditActivity) this.f$0).lambda$createView$8((Context) this.f$1, view, i);
                break;
            case 5:
                AIEditorAlert.CreateAiStyleAlert createAiStyleAlert = (AIEditorAlert.CreateAiStyleAlert) this.f$0;
                UItem item3 = createAiStyleAlert.adapter.getItem(i - 1);
                if (item3 != null && item3.id == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(createAiStyleAlert.getContext(), 0, (Theme.ResourcesProvider) this.f$1);
                    String string = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivity$$ExternalSyntheticLambda356(createAiStyleAlert, 22));
                    builder.makeRed(-1);
                    builder.show();
                }
                break;
            case 6:
                ((ChatAttachAlert) this.f$0).lambda$new$14((Theme.ResourcesProvider) this.f$1, view);
                break;
            case 7:
                ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = (ChatAttachAlertContactsLayout) this.f$0;
                RecyclerView.Adapter adapter2 = chatAttachAlertContactsLayout.listView.getAdapter();
                ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter = chatAttachAlertContactsLayout.searchAdapter;
                if (adapter2 == shareSearchAdapter) {
                    int i7 = i - 1;
                    if (i7 < 0) {
                        shareSearchAdapter.getClass();
                    } else if (i7 < shareSearchAdapter.searchResult.size()) {
                        item = shareSearchAdapter.searchResult.get(i7);
                    }
                    item = null;
                } else {
                    ChatAttachAlertContactsLayout.ShareAdapter shareAdapter = chatAttachAlertContactsLayout.listAdapter;
                    int sectionForPosition = shareAdapter.getSectionForPosition(i);
                    int positionInSectionForPosition = shareAdapter.getPositionInSectionForPosition(i);
                    if (positionInSectionForPosition >= 0 && sectionForPosition >= 0) {
                        item = shareAdapter.getItem(sectionForPosition, positionInSectionForPosition);
                    }
                }
                if (item != null) {
                    if (chatAttachAlertContactsLayout.selectedContacts.isEmpty()) {
                        if (item instanceof ContactsController.Contact) {
                            ContactsController.Contact contact2 = (ContactsController.Contact) item;
                            TLRPC.User user = contact2.user;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = contact2.first_name;
                                str4 = contact2.last_name;
                            }
                            str2 = str4;
                            str = str3;
                            contact = contact2;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) item;
                            ContactsController.Contact contact3 = new ContactsController.Contact();
                            String str7 = user2.first_name;
                            contact3.first_name = str7;
                            String str8 = user2.last_name;
                            contact3.last_name = str8;
                            contact3.phones.add(user2.phone);
                            contact3.user = user2;
                            contact = contact3;
                            str = str7;
                            str2 = str8;
                        }
                        PhonebookShareAlert phonebookShareAlert = new PhonebookShareAlert(chatAttachAlertContactsLayout.parentAlert.baseFragment, contact, null, null, null, null, str, str2, (Theme.ResourcesProvider) this.f$1);
                        phonebookShareAlert.delegate = new ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1(chatAttachAlertContactsLayout);
                        phonebookShareAlert.show();
                    } else {
                        chatAttachAlertContactsLayout.addOrRemoveSelectedContact((ChatAttachAlertContactsLayout.UserCell) view, item);
                    }
                }
                break;
            case 8:
                JoinCallAlert joinCallAlert = (JoinCallAlert) this.f$0;
                if (!joinCallAlert.animationInProgress) {
                    ArrayList arrayList2 = joinCallAlert.chats;
                    if (arrayList2.get(i) != joinCallAlert.selectedPeer) {
                        joinCallAlert.selectedPeer = (TLRPC.Peer) arrayList2.get(i);
                        boolean z = view instanceof GroupCreateUserCell;
                        if (z) {
                            ((GroupCreateUserCell) view).setChecked(true, true);
                        } else if (view instanceof ShareDialogCell) {
                            ((ShareDialogCell) view).setChecked(true, true);
                            view.invalidate();
                        }
                        JoinCallAlert.AnonymousClass3 anonymousClass3 = joinCallAlert.listView;
                        int childCount = anonymousClass3.getChildCount();
                        int i8 = 0;
                        while (i8 < childCount) {
                            View childAt = anonymousClass3.getChildAt(i8);
                            if (childAt == view) {
                                i2 = 1;
                            } else if (z) {
                                i2 = 1;
                                ((GroupCreateUserCell) childAt).setChecked(false, true);
                            } else {
                                i2 = 1;
                                if (view instanceof ShareDialogCell) {
                                    ((ShareDialogCell) childAt).setChecked(false, true);
                                }
                            }
                            i8 += i2;
                        }
                        if (joinCallAlert.currentType != 0) {
                            joinCallAlert.updateDoneButton((TLRPC.Chat) this.f$1, true);
                        }
                        break;
                    }
                }
                break;
            case 9:
                MentionsContainerView mentionsContainerView = (MentionsContainerView) this.f$0;
                if (i != 0) {
                    MentionsAdapter adapter3 = mentionsContainerView.getAdapter();
                    if (adapter3.foundContextBot == null || adapter3.inlineMediaEnabled) {
                        int i9 = i - 1;
                        Object item4 = mentionsContainerView.getAdapter().getItem(i9);
                        int i10 = mentionsContainerView.getAdapter().resultStartPosition;
                        int i11 = mentionsContainerView.getAdapter().resultLength;
                        String str9 = mentionsContainerView.getAdapter().hintHashtag;
                        MentionsContainerView.Delegate delegate = (MentionsContainerView.Delegate) this.f$1;
                        if (str9 != null && i9 == 1) {
                            TLRPC.Chat chat = mentionsContainerView.getAdapter().chat;
                            if (chat == null && mentionsContainerView.getAdapter().parentFragment != null) {
                                chat = mentionsContainerView.getAdapter().parentFragment.currentChat;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(mentionsContainerView.getAdapter().hintHashtag);
                            delegate.replaceText(i10, i11, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, chat != null ? "@" + ChatObject.getPublicUsername(chat) : "", " "), false);
                        } else if (mentionsContainerView.getAdapter().hintHashtag == null || i9 != 0) {
                            if (item4 instanceof TLRPC.TL_document) {
                                if (view instanceof StickerCell) {
                                    ((StickerCell) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) item4;
                                MentionsAdapter adapter4 = mentionsContainerView.getAdapter();
                                if (adapter4.hintHashtag != null) {
                                    if (i9 < 2) {
                                        obj = null;
                                    } else {
                                        i5 = i - 3;
                                    }
                                    delegate.onStickerSelected(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), obj);
                                } else {
                                    i5 = i9;
                                }
                                ArrayList arrayList3 = adapter4.stickers;
                                if (arrayList3 == null || i5 < 0 || i5 >= arrayList3.size()) {
                                    obj = null;
                                } else {
                                    obj = ((MentionsAdapter.StickerResult) adapter4.stickers.get(i5)).parent;
                                }
                                delegate.onStickerSelected(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), obj);
                            } else if (item4 instanceof TLRPC.Chat) {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) item4);
                                if (publicUsername != null) {
                                    delegate.replaceText(i10, i11, zzij.m("@", publicUsername, " "), false);
                                }
                            } else if (item4 instanceof TLRPC.User) {
                                TLRPC.User user3 = (TLRPC.User) item4;
                                if (UserObject.getPublicUsername(user3) != null) {
                                    delegate.replaceText(i10, i11, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                } else {
                                    SpannableString spannableString = new SpannableString(zzhr.m(UserObject.getFirstName(user3, false), " "));
                                    spannableString.setSpan(new URLSpanUserMention("" + user3.id, 3, null), 0, spannableString.length(), 33);
                                    delegate.replaceText(i10, i11, spannableString, false);
                                }
                            } else if (item4 instanceof String) {
                                delegate.replaceText(i10, i11, item4 + " ", false);
                            } else if (item4 instanceof MediaDataController.KeywordResult) {
                                String str10 = ((MediaDataController.KeywordResult) item4).emoji;
                                delegate.addEmojiToRecent(str10);
                                if (str10 != null) {
                                    try {
                                        if (str10.startsWith("animated_")) {
                                            try {
                                                fontMetrics = delegate.getFontMetrics();
                                            } catch (Exception e) {
                                                FileLog.e((Throwable) e, false);
                                                fontMetrics = null;
                                            }
                                            long j = Long.parseLong(str10.substring(9));
                                            TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentFindDocument));
                                            try {
                                                if (documentFindDocument != null) {
                                                    animatedEmojiSpan = new AnimatedEmojiSpan(documentFindDocument.id, 1.2f, fontMetrics);
                                                    animatedEmojiSpan.document = documentFindDocument;
                                                } else {
                                                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, fontMetrics);
                                                }
                                                spannableString2.setSpan(animatedEmojiSpan, 0, spannableString2.length(), 33);
                                                delegate = delegate;
                                                delegate.replaceText(i10, i11, spannableString2, false);
                                            } catch (Exception unused) {
                                                delegate = delegate;
                                                delegate.replaceText(i10, i11, str10, true);
                                            }
                                        } else {
                                            delegate.replaceText(i10, i11, str10, true);
                                        }
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                } else {
                                    delegate.replaceText(i10, i11, str10, true);
                                }
                                mentionsContainerView.updateVisibility(false);
                            }
                            if (item4 instanceof TLRPC.BotInlineResult) {
                                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item4;
                                if ((!botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals("video") || botInlineResult.document == null))) {
                                    delegate.sendBotInlineResult(botInlineResult, true, 0);
                                } else {
                                    ArrayList arrayList4 = new ArrayList(mentionsContainerView.getAdapter().searchResultBotContext);
                                    mentionsContainerView.botContextResults = arrayList4;
                                    PhotoViewer.getInstance().setParentActivity(null, mentionsContainerView.baseFragment, mentionsContainerView.resourcesProvider);
                                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                                    MentionsAdapter adapter5 = mentionsContainerView.getAdapter();
                                    if (adapter5.hintHashtag != null) {
                                        if (i9 < 2) {
                                            i4 = 0;
                                        } else {
                                            i3 = i - 3;
                                        }
                                        photoViewer.openPhotoForSelect(arrayList4, i4, 3, false, mentionsContainerView.botContextProvider, null);
                                    } else {
                                        i3 = i9;
                                    }
                                    if (adapter5.searchResultBotContext != null && (adapter5.searchResultBotContextSwitch != null || adapter5.searchResultBotWebViewSwitch != null)) {
                                        i3--;
                                    }
                                    i4 = i3;
                                    photoViewer.openPhotoForSelect(arrayList4, i4, 3, false, mentionsContainerView.botContextProvider, null);
                                }
                            }
                        } else {
                            delegate.replaceText(i10, i11, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), mentionsContainerView.getAdapter().hintHashtag, " "), false);
                        }
                    }
                } else {
                    mentionsContainerView.getClass();
                }
                break;
            case 10:
                ((PollVotesAlert) this.f$0).lambda$new$4((Context) this.f$1, view, i);
                break;
            case 11:
                ((BoostViaGiftsBottomSheet) this.f$0).lambda$new$2((BaseFragment) this.f$1, view);
                break;
            case 12:
                ((ReassignBoostBottomSheet) this.f$0).lambda$new$4((TLRPC.Chat) this.f$1, view);
                break;
            case 13:
                ((TranslateAlert3) this.f$0).lambda$new$1$1(i, (Theme.ResourcesProvider) this.f$1);
                break;
            case 14:
                DefaultThemesPreviewCell defaultThemesPreviewCell = (DefaultThemesPreviewCell) this.f$0;
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = (ChatThemeBottomSheet.ChatThemeItem) defaultThemesPreviewCell.adapter.items.get(i);
                Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(defaultThemesPreviewCell.themeIndex)).themeInfo;
                ThemeKey themeKey = chatThemeItem.chatTheme.key;
                if (themeKey == null) {
                    str5 = null;
                } else {
                    String str11 = themeKey.giftSlug;
                    str5 = str11 != null ? str11 : themeKey.emoticon;
                }
                if (!str5.equals("🏠")) {
                    ThemeKey themeKey2 = chatThemeItem.chatTheme.key;
                    if (themeKey2 == null) {
                        str6 = null;
                    } else {
                        String str12 = themeKey2.giftSlug;
                        str6 = str12 != null ? str12 : themeKey2.emoticon;
                    }
                    size2 = str6.equals("🎨") ? ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(defaultThemesPreviewCell.themeIndex)).accentId : -1;
                }
                if (themeInfo == null) {
                    TLRPC.TL_theme tL_theme = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(defaultThemesPreviewCell.themeIndex)).tlTheme;
                    Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) Theme.themesDict.get(Theme.getBaseThemeKey(tL_theme.settings.get(((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(defaultThemesPreviewCell.themeIndex)).settingsIndex)));
                    if (themeInfo2 != null) {
                        Theme.ThemeAccent themeAccentCreateNewAccent = (Theme.ThemeAccent) themeInfo2.accentsByThemeId.get(tL_theme.id);
                        if (themeAccentCreateNewAccent == null) {
                            themeAccentCreateNewAccent = themeInfo2.createNewAccent(tL_theme, baseFragment.getCurrentAccount(), 0);
                        }
                        size2 = themeAccentCreateNewAccent.id;
                        themeInfo2.setCurrentAccentId(size2);
                    }
                    themeInfo = themeInfo2;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, Integer.valueOf(size2));
                defaultThemesPreviewCell.selectedPosition = i;
                int i12 = 0;
                while (i12 < defaultThemesPreviewCell.adapter.items.size()) {
                    ((ChatThemeBottomSheet.ChatThemeItem) defaultThemesPreviewCell.adapter.items.get(i12)).isSelected = i12 == defaultThemesPreviewCell.selectedPosition;
                    i12++;
                }
                defaultThemesPreviewCell.adapter.setSelectedItem(defaultThemesPreviewCell.selectedPosition);
                for (int i13 = 0; i13 < defaultThemesPreviewCell.recyclerView.getChildCount(); i13++) {
                    ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) defaultThemesPreviewCell.recyclerView.getChildAt(i13);
                    if (themeSmallPreviewView != view && (tooltip$$ExternalSyntheticLambda0 = themeSmallPreviewView.animationCancelRunnable) != null) {
                        AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
                        themeSmallPreviewView.animationCancelRunnable.run();
                    }
                }
                ((ThemeSmallPreviewView) view).playEmojiAnimation();
                if (themeInfo != null) {
                    SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    editorEdit.putString((defaultThemesPreviewCell.currentType == 1 || themeInfo.isDark()) ? "lastDarkTheme" : "lastDayTheme", themeInfo.getKey());
                    editorEdit.commit();
                }
                Theme.turnOffAutoNight(baseFragment);
                break;
            case 15:
                ((EditWidgetActivity) this.f$0).lambda$createView$1$2((Context) this.f$1, i);
                break;
            case 16:
                ((GroupCreateActivity) this.f$0).lambda$createView$4$1((Context) this.f$1, view, i);
                break;
            case 17:
                LocationActivity locationActivity = (LocationActivity) this.f$0;
                TLRPC.TL_messageMediaVenue item5 = locationActivity.searchAdapter.getItem(i);
                if (item5 != null && item5.icon != null && locationActivity.locationType == 8 && locationActivity.map != null) {
                    locationActivity.userLocationMoved = true;
                    ((ActionBarMenu) this.f$1).closeSearchField(true);
                    if ("pin".equals(item5.icon)) {
                        maxZoomLevel = locationActivity.map.getMaxZoomLevel();
                        f = 4.0f;
                    } else {
                        maxZoomLevel = locationActivity.map.getMaxZoomLevel();
                        f = 9.0f;
                    }
                    float f2 = maxZoomLevel - f;
                    IMapsProvider.IMap iMap = locationActivity.map;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = item5.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f2));
                    Location location = locationActivity.userLocation;
                    if (location != null) {
                        location.setLatitude(item5.geo.lat);
                        locationActivity.userLocation.setLongitude(item5.geo._long);
                    }
                    LocationActivity.AnonymousClass4 anonymousClass4 = locationActivity.adapter;
                    anonymousClass4.customLocation = locationActivity.userLocation;
                    anonymousClass4.fetchLocationAddress();
                    anonymousClass4.updateCell();
                    break;
                } else if (item5 != null && (locationActivityDelegate = locationActivity.delegate) != null) {
                    locationActivityDelegate.didSelectLocation(item5, locationActivity.locationType, true, 0, 0L);
                    locationActivity.finishFragment();
                    break;
                }
                break;
            case 18:
                ManageLinksActivity manageLinksActivity = (ManageLinksActivity) this.f$0;
                int i14 = manageLinksActivity.creatorRow;
                HashMap map = manageLinksActivity.users;
                if (i == i14) {
                    TLRPC.User user4 = (TLRPC.User) map.get(Long.valueOf(manageLinksActivity.invite.admin_id));
                    if (user4 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", user4.id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        manageLinksActivity.presentFragment(new ProfileActivity(bundle2, null));
                    }
                    break;
                } else if (i == manageLinksActivity.createNewLinkRow) {
                    LinkEditActivity linkEditActivity = new LinkEditActivity(0, manageLinksActivity.currentChatId);
                    linkEditActivity.callback = manageLinksActivity.linkEditActivityCallback;
                    manageLinksActivity.presentFragment(linkEditActivity);
                    break;
                } else {
                    int i15 = manageLinksActivity.linksStartRow;
                    Context context = (Context) this.f$1;
                    if (i >= i15 && i < manageLinksActivity.linksEndRow) {
                        InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(context, (TLRPC.TL_chatInviteExported) manageLinksActivity.invites.get(i - i15), manageLinksActivity.info, map, manageLinksActivity, manageLinksActivity.currentChatId, false, manageLinksActivity.isChannel);
                        manageLinksActivity.inviteLinkBottomSheet = inviteLinkBottomSheet;
                        inviteLinkBottomSheet.canEdit = manageLinksActivity.canEdit;
                        inviteLinkBottomSheet.show();
                        break;
                    } else {
                        int i16 = manageLinksActivity.revokedLinksStartRow;
                        if (i >= i16 && i < manageLinksActivity.revokedLinksEndRow) {
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = new InviteLinkBottomSheet(context, (TLRPC.TL_chatInviteExported) manageLinksActivity.revokedInvites.get(i - i16), manageLinksActivity.info, map, manageLinksActivity, manageLinksActivity.currentChatId, false, manageLinksActivity.isChannel);
                            manageLinksActivity.inviteLinkBottomSheet = inviteLinkBottomSheet2;
                            inviteLinkBottomSheet2.show();
                            break;
                        } else if (i != manageLinksActivity.revokeAllRow) {
                            int i17 = manageLinksActivity.adminsStartRow;
                            if (i >= i17 && i < manageLinksActivity.adminsEndRow) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) manageLinksActivity.admins.get(i - i17);
                                if (map.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    manageLinksActivity.getMessagesController().putUser((TLRPC.User) map.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                ManageLinksActivity manageLinksActivity2 = new ManageLinksActivity(manageLinksActivity.currentChatId, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                manageLinksActivity2.info = manageLinksActivity.info;
                                manageLinksActivity2.invite = null;
                                manageLinksActivity2.isPublic = ChatObject.isPublic(manageLinksActivity2.currentChat);
                                manageLinksActivity2.loadLinks(true);
                                manageLinksActivity.presentFragment(manageLinksActivity2);
                                break;
                            }
                        } else if (!manageLinksActivity.deletingRevokedLinks) {
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(manageLinksActivity.getParentActivity(), 0, null);
                            String string2 = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            AlertDialog alertDialog2 = builder2.alertDialog;
                            alertDialog2.title = string2;
                            alertDialog2.message = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new ManageLinksActivity$$ExternalSyntheticLambda4(manageLinksActivity));
                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            manageLinksActivity.showDialog(alertDialog2);
                            break;
                        }
                    }
                }
                break;
            case 19:
                ((NotificationsSoundActivity) this.f$0).lambda$createView$1((Context) this.f$1, view, i);
                break;
            case 20:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$19((Context) this.f$1, view, i);
                break;
            case 21:
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass2 = (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this.f$0;
                if (i >= 0) {
                    SelfStoryViewsPage.ListAdapter listAdapter = anonymousClass2.listAdapter;
                    if (i < listAdapter.items.size()) {
                        SelfStoryViewsPage.Item item6 = (SelfStoryViewsPage.Item) listAdapter.items.get(i);
                        TL_stories.StoryView storyView = item6.view;
                        boolean z2 = storyView instanceof TL_stories.TL_storyView;
                        StoryViewer storyViewer = (StoryViewer) this.f$1;
                        if (z2) {
                            storyViewer.presentFragment(ProfileActivity.of(storyView.user_id));
                        } else {
                            boolean z3 = storyView instanceof TL_stories.TL_storyViewPublicRepost;
                            SelfStoryViewsPage.AnonymousClass1 anonymousClass5 = anonymousClass2.recyclerListView;
                            if (z3) {
                                storyViewer.fragment.createOverlayStoryViewer().open(UserConfig.selectedAccount, anonymousClass2.getContext(), ((TL_stories.TL_storyViewPublicRepost) item6.view).story, new StoriesListPlaceProvider(anonymousClass5, false));
                            } else {
                                TL_stories.StoryReaction storyReaction = item6.reaction;
                                if (storyReaction instanceof TL_stories.TL_storyReaction) {
                                    storyViewer.presentFragment(ProfileActivity.of(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                    ArrayList arrayList5 = new ArrayList();
                                    SelfStoryViewsPage.ViewsModel viewsModel = anonymousClass2.currentModel;
                                    if (viewsModel == null || (arrayList = viewsModel.reactions) == null) {
                                        size = 0;
                                    } else {
                                        size = arrayList.size();
                                        for (int i18 = 0; i18 < anonymousClass2.currentModel.reactions.size(); i18++) {
                                            TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) anonymousClass2.currentModel.reactions.get(i18);
                                            if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                                storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                                if (storyReaction2 == storyReaction) {
                                                    size2 = arrayList5.size();
                                                }
                                                arrayList5.add(storyItem);
                                            }
                                        }
                                    }
                                    if (size2 < 0 || arrayList5.size() <= 1) {
                                        anonymousClass2.currentRepostsList = null;
                                        storyViewer.fragment.createOverlayStoryViewer().open(UserConfig.selectedAccount, anonymousClass2.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, new StoriesListPlaceProvider(anonymousClass5, false));
                                    } else {
                                        anonymousClass2.currentRepostsList = new StoriesController.StoryRepostsList(anonymousClass2.currentAccount, arrayList5);
                                        anonymousClass2.repostsListConsumedCount = size;
                                        SelfStoryViewsPage.ViewsModel viewsModel2 = anonymousClass2.currentModel;
                                        StoryViewer storyViewerCreateOverlayStoryViewer = storyViewer.fragment.createOverlayStoryViewer();
                                        Context context2 = anonymousClass2.getContext();
                                        StoriesController.StoryRepostsList storyRepostsList = anonymousClass2.currentRepostsList;
                                        StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(anonymousClass5, false);
                                        storiesListPlaceProvider.loadNextInterface = new StoriesViewPager$$ExternalSyntheticLambda0(viewsModel2, 17);
                                        storyViewerCreateOverlayStoryViewer.open(context2, size2, storyRepostsList, storiesListPlaceProvider);
                                    }
                                } else {
                                    boolean z4 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                                    if (z4 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                                        TLRPC.Message message = z4 ? storyReaction.message : storyView.message;
                                        Bundle bundle3 = new Bundle();
                                        long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                                        if (peerDialogId >= 0) {
                                            bundle3.putLong("user_id", peerDialogId);
                                        } else {
                                            bundle3.putLong("chat_id", -peerDialogId);
                                        }
                                        bundle3.putInt("message_id", message.id);
                                        storyViewer.presentFragment(new ChatActivity(bundle3));
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 22:
                BotPreviewsEditContainer.ChooseLanguageSheet chooseLanguageSheet = (BotPreviewsEditContainer.ChooseLanguageSheet) this.f$0;
                UniversalAdapter universalAdapter = chooseLanguageSheet.adapter;
                if (universalAdapter != null && (item2 = universalAdapter.getItem(i - 1)) != null) {
                    Object obj2 = item2.object;
                    if (obj2 instanceof TranslateController.Language) {
                        ((VoIPFragment$$ExternalSyntheticLambda7) this.f$1).run(((TranslateController.Language) obj2).code);
                        chooseLanguageSheet.lambda$showGiftOfferSheet$15();
                    }
                }
                break;
            case 23:
                ((UsersSelectActivity) this.f$0).lambda$createView$1$1((Context) this.f$1, view, i);
                break;
            default:
                ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$0((Context) this.f$1, i);
                break;
        }
    }
}
