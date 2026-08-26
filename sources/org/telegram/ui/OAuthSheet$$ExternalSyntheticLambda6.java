package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.ProductDetails;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda104;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda104;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.DraftsController$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class OAuthSheet$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public OAuthSheet$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void onClick(View view) {
        Long lValueOf;
        Long lValueOf2;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z;
        TLRPC.Chat chat;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 1;
        boolean zRelease = false;
        boolean zRelease2 = false;
        switch (this.$r8$classId) {
            case 0:
                BottomSheet bottomSheet = (BottomSheet) this.f$0;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, bottomSheet.getResourcesProvider(), (FrameLayout) this.f$1);
                ArrayList arrayList = (ArrayList) this.f$2;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    int iIntValue = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(iIntValue).getCurrentUser() != null) {
                        itemOptionsMakeOptions.addAccount(iIntValue, ((int[]) this.f$3)[0] == iIntValue, new OAuthSheet$$ExternalSyntheticLambda17((OAuthSheet$$ExternalSyntheticLambda5) this.f$4, iIntValue, 0));
                    }
                }
                itemOptionsMakeOptions.drawScrim = false;
                itemOptionsMakeOptions.onTopOfScrim = true;
                itemOptionsMakeOptions.dimAlpha = 0;
                itemOptionsMakeOptions.gravity = 3;
                itemOptionsMakeOptions.translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                itemOptionsMakeOptions.show();
                break;
            case 1:
                CachedMediaLayout.AnonymousClass1 anonymousClass1 = (CachedMediaLayout.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                CachedMediaLayout.MediaAdapter mediaAdapter = (CachedMediaLayout.MediaAdapter) ((CachedMediaLayout.BaseAdapter) this.f$2);
                CachedMediaLayout.access$600(CachedMediaLayout.this, (CachedMediaLayout.ItemInner) this.f$1, mediaAdapter, (RecyclerListView) this.f$3);
                ActionBarPopupWindow actionBarPopupWindow3 = anonymousClass1.popupWindow;
                if (actionBarPopupWindow3 != null) {
                    actionBarPopupWindow3.dismiss(true);
                }
                break;
            case 2:
                String str = ((String[]) this.f$3)[0];
                final BottomSheet bottomSheet2 = (BottomSheet) this.f$0;
                new ShareAlert((Context) this.f$1, (String) this.f$2, str, (Theme.ResourcesProvider) this.f$4) {
                    public final BottomSheet val$sheet;

                    public AnonymousClass8(Context context, String str2, String str3, Theme.ResourcesProvider resourcesProvider) {
                        super(context, str2, str3, resourcesProvider);
                        bottomSheet = bottomSheet2;
                    }

                    @Override
                    public final void onSend(LongSparseArray longSparseArray, int i3, TLRPC.TL_forumTopic tL_forumTopic2, boolean z3) {
                        String string;
                        if (z3) {
                            if (longSparseArray == null || longSparseArray.size() != 1) {
                                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", longSparseArray == null ? 1 : longSparseArray.size(), new Object[0]));
                            } else {
                                long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                string = (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                            }
                            Bulletin bulletinCreateSimpleBulletinWithIconSize = new BulletinFactory(bottomSheet.topBulletinContainer, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(string));
                            bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletinWithIconSize.show();
                        }
                    }
                }.show();
                break;
            case 3:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(chatActivity.getParentActivity());
                Drawable drawableMutate = chatActivity.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(chatActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindowLayout.setBackground(drawableMutate);
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, chatActivity.getParentActivity(), null, true, true);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                actionBarMenuSubItem.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(chatActivity, (String) this.f$1, (String) this.f$2, (CharSequence) this.f$3, runnableArr, 4));
                actionBarPopupWindowLayout.linearLayout.addView(actionBarMenuSubItem);
                ActionBarPopupWindow actionBarPopupWindow4 = new ActionBarPopupWindow(actionBarPopupWindowLayout);
                Runnable[] runnableArr = {new ChatActivity$$ExternalSyntheticLambda484(actionBarPopupWindow4, 0)};
                actionBarPopupWindow4.pauseNotifications = true;
                actionBarPopupWindow4.dismissAnimationDuration = 220;
                actionBarPopupWindow4.setOutsideTouchable(true);
                actionBarPopupWindow4.setClippingEnabled(true);
                actionBarPopupWindow4.setAnimationStyle(R.style.PopupContextAnimation);
                actionBarPopupWindow4.setFocusable(true);
                BotHelpCell botHelpCell = (BotHelpCell) this.f$4;
                actionBarPopupWindow4.showAsDropDown(botHelpCell, (botHelpCell.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 4:
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                TranslateAlert2.showAlert(chatActivity2.getParentActivity(), chatActivity2, (String) this.f$1, (String) this.f$2, (CharSequence) this.f$3, null, null);
                Runnable runnable = ((Runnable[]) this.f$4)[0];
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 5:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$1;
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) this.f$2;
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.f$3;
                AlertDialog alertDialog = (AlertDialog) this.f$4;
                if (baseFragment.getParentActivity() != null) {
                    if (editTextBoldCursor.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(editTextBoldCursor);
                    } else {
                        if (baseFragment instanceof ThemePreviewActivity) {
                            Theme.applyPreviousTheme();
                            baseFragment.finishFragment();
                        }
                        if (themeAccent != null) {
                            themeInfo.setCurrentAccentId(themeAccent.id);
                            Theme.refreshThemeColors(false, false);
                            Utilities.searchQueue.postRunnable(new AlertsCreator$$ExternalSyntheticLambda104(editTextBoldCursor, alertDialog, baseFragment, zRelease ? 1 : 0));
                        } else {
                            AlertsCreator.processCreate(editTextBoldCursor, alertDialog, baseFragment);
                        }
                    }
                    break;
                }
                break;
            case 6:
                AtomicReference atomicReference = (AtomicReference) this.f$0;
                if (atomicReference.get() != null) {
                    ((ActionBarPopupWindow) atomicReference.getAndSet(null)).dismiss();
                }
                BackButtonMenu.PulledDialog pulledDialog = (BackButtonMenu.PulledDialog) this.f$1;
                if (pulledDialog.stackIndex >= 0) {
                    INavigationLayout iNavigationLayout = (INavigationLayout) this.f$2;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
                    if (actionBarLayout.getFragmentStack() == null || pulledDialog.stackIndex >= actionBarLayout.getFragmentStack().size()) {
                        lValueOf = null;
                        lValueOf2 = null;
                    } else {
                        BaseFragment baseFragment2 = actionBarLayout.getFragmentStack().get(pulledDialog.stackIndex);
                        if (baseFragment2 instanceof ChatActivity) {
                            ChatActivity chatActivity3 = (ChatActivity) baseFragment2;
                            lValueOf2 = Long.valueOf(chatActivity3.getDialogId());
                            lValueOf = Long.valueOf(chatActivity3.getTopicId());
                        } else if (baseFragment2 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) baseFragment2;
                            lValueOf2 = Long.valueOf(profileActivity.getDialogId());
                            lValueOf = Long.valueOf(profileActivity.topicId);
                        } else {
                            lValueOf = null;
                            lValueOf2 = null;
                        }
                    }
                    if ((lValueOf2 == null || lValueOf2.longValue() == pulledDialog.dialogId) && ((tL_forumTopic = (TLRPC.TL_forumTopic) this.f$3) == null || lValueOf == null || tL_forumTopic.id == lValueOf.longValue())) {
                        ActionBarLayout actionBarLayout2 = (ActionBarLayout) iNavigationLayout;
                        if (actionBarLayout2.getFragmentStack() != null) {
                            ArrayList arrayList2 = new ArrayList(actionBarLayout2.getFragmentStack());
                            int size2 = arrayList2.size() - 2;
                            while (true) {
                                int i3 = pulledDialog.stackIndex;
                                if (size2 > i3) {
                                    ((BaseFragment) arrayList2.get(size2)).removeSelfFromStack();
                                    size2--;
                                } else if (i3 < actionBarLayout2.getFragmentStack().size()) {
                                    ((ActionBarLayout) iNavigationLayout).closeLastFragment(true, false);
                                }
                            }
                        }
                    } else {
                        ActionBarLayout actionBarLayout3 = (ActionBarLayout) iNavigationLayout;
                        for (int iM = ArticleViewer.IBlock.CC.m(actionBarLayout3, 2); iM > pulledDialog.stackIndex; iM--) {
                            actionBarLayout3.removeFragmentFromStack(iM);
                        }
                    }
                }
                Class cls = pulledDialog.activity;
                BaseFragment baseFragment3 = (BaseFragment) this.f$4;
                if (cls == ChatActivity.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = pulledDialog.chat;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.id);
                    } else {
                        TLRPC.User user2 = pulledDialog.user;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", pulledDialog.folderId);
                    bundle.putInt("dialog_filter_id", pulledDialog.filterId);
                    TLRPC.TL_forumTopic tL_forumTopic2 = pulledDialog.topic;
                    if (tL_forumTopic2 != null) {
                        baseFragment3.presentFragment(ForumUtilities.getChatActivityForTopic(baseFragment3, pulledDialog.chat.id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        baseFragment3.presentFragment(new ChatActivity(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", pulledDialog.dialogId);
                    baseFragment3.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (pulledDialog.activity == TopicsFragment.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", pulledDialog.chat.id);
                    baseFragment3.presentFragment(new TopicsFragment(bundle3), true);
                }
                if (pulledDialog.activity == DialogsActivity.class) {
                    baseFragment3.presentFragment(new DialogsActivity(null), true);
                }
                break;
            case 7:
                int iIntValue2 = ((Integer) view.getTag()).intValue();
                ((ActionBarPopupWindow) this.f$0).dismiss();
                int iIntValue3 = ((Integer) ((ArrayList) this.f$2).get(iIntValue2)).intValue();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f$1;
                BaseFragment baseFragment4 = (BaseFragment) this.f$3;
                if (iIntValue3 == 1) {
                    StickersDialogs.openStickerPickerDialog(tL_messages_stickerSet, baseFragment4, (Theme.ResourcesProvider) this.f$4);
                } else {
                    ((ChatActivity) baseFragment4).openAttachMenuForCreatingSticker();
                    ContentPreviewViewer.getInstance().stickerSetForCustomSticker = tL_messages_stickerSet;
                }
                break;
            case 8:
                ChatActivity.AnonymousClass55 anonymousClass55 = (ChatActivity.AnonymousClass55) this.f$0;
                String str2 = (String) this.f$1;
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    restrictedLanguages.add(lowerCase);
                    if (restrictedLanguages.size() == 1 && restrictedLanguages.contains(currentLocaleInfo.pluralLangCode)) {
                        RestrictedLanguagesSelectActivity.updateRestrictedLanguages(Boolean.FALSE, null);
                    } else {
                        RestrictedLanguagesSelectActivity.updateRestrictedLanguages(Boolean.FALSE, restrictedLanguages);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                TranslateController translateController = (TranslateController) this.f$2;
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(anonymousClass55.dialogId, true);
                boolean z3 = anonymousClass55.accusative[0];
                String str3 = (String) this.f$3;
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(z3 ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str3) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str3));
                String[] strArr = TranslateAlert2.userAgents;
                if (spannableStringBuilderReplaceTags != null && spannableStringBuilderReplaceTags.length() > 0) {
                    spannableStringBuilderReplaceTags.replace(0, 1, (CharSequence) spannableStringBuilderReplaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = spannableStringBuilderReplaceTags;
                }
                BulletinFactory.of(anonymousClass55.fragment).createSimpleBulletin(R.raw.msg_translate, spannableStringBuilder, new Tooltip$$ExternalSyntheticLambda0(anonymousClass55, 5), LocaleController.getString(R.string.Settings)).show();
                ((ActionBarPopupWindow) this.f$4).dismiss(true);
                break;
            case 9:
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                if (contentPreviewViewer.parentActivity != null) {
                    int iIntValue4 = ((Integer) view.getTag()).intValue();
                    ArrayList arrayList3 = (ArrayList) this.f$2;
                    if (((Integer) arrayList3.get(iIntValue4)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = contentPreviewViewer.stickerSetForCustomSticker;
                        if (tL_messages_stickerSet2 == null) {
                            MessageSeenView.AnonymousClass1 anonymousClass2 = (MessageSeenView.AnonymousClass1) this.f$1;
                            anonymousClass2.requestLayout();
                            ((LinearLayout) this.f$3).requestLayout();
                            anonymousClass2.getAdapter().notifyDataSetChanged();
                            ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$4).getSwipeBack().openForeground(1);
                        } else {
                            ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = contentPreviewViewer.delegate;
                            if (contentPreviewViewerDelegate != null) {
                                contentPreviewViewerDelegate.stickerSetSelected(tL_messages_stickerSet2.set, TextUtils.join("", contentPreviewViewer.selectedEmojis));
                            }
                            contentPreviewViewer.dismissPopupWindow();
                        }
                    } else {
                        if (contentPreviewViewer.delegate != null) {
                            if (((Integer) arrayList3.get(iIntValue4)).intValue() == 1) {
                                contentPreviewViewer.delegate.addToFavoriteSelected(TextUtils.join("", contentPreviewViewer.selectedEmojis));
                            } else if (((Integer) arrayList3.get(iIntValue4)).intValue() == 0) {
                                if (contentPreviewViewer.delegate.isSettingIntroSticker()) {
                                    contentPreviewViewer.delegate.setIntroSticker(TextUtils.join("", contentPreviewViewer.selectedEmojis));
                                } else {
                                    contentPreviewViewer.delegate.sendSticker(TextUtils.join("", contentPreviewViewer.selectedEmojis));
                                }
                            }
                        }
                        contentPreviewViewer.dismissPopupWindow();
                    }
                    break;
                }
                break;
            case 10:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
                ButtonWithCounterView buttonWithCounterView = loginPayView.button;
                if (!buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(loginPayView, 18);
                    FileLog.d("LoginBilling, querying done purchases...");
                    ProductDetails productDetails = (ProductDetails) this.f$1;
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.f$2;
                    BillingController.getInstance().queryPurchases("inapp", new StarsController$$ExternalSyntheticLambda104(loginPayView, (String) this.f$3, tL_inputStorePaymentAuthCode, (TLRPC.TL_payments_canPurchaseStore) this.f$4, new LinkManager$$ExternalSyntheticLambda12(loginPayView, productDetails, pollItemMenu$$ExternalSyntheticLambda14, tL_inputStorePaymentAuthCode, 14)));
                    break;
                }
                break;
            case 11:
                ((BotBiometry$$ExternalSyntheticLambda8) this.f$4).run(Boolean.valueOf(((CheckBoxCell) this.f$1).isChecked()), Boolean.valueOf(((CheckBoxCell) this.f$2).isChecked()), Boolean.valueOf(((CheckBoxCell) this.f$3).isChecked()));
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 12:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.f$0;
                ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass3).delegate).setPopupIsVisible(true);
                anonymousClass3.editStoryItem = null;
                boolean[] zArr = {false};
                if (anonymousClass3.isSelf) {
                    StoriesController storiesController = MessagesController.getInstance(anonymousClass3.currentAccount).getStoriesController();
                    if (storiesController.lastBlocklistRequested == 0) {
                        storiesController.loadBlocklist();
                    }
                    MessagesController.getInstance(anonymousClass3.currentAccount).getStoriesController().loadSendAs();
                    DraftsController draftsController = MessagesController.getInstance(anonymousClass3.currentAccount).getStoriesController().draftsController;
                    if (!draftsController.loaded && !draftsController.loading) {
                        draftsController.loading = true;
                        DraftsController$$ExternalSyntheticLambda1 draftsController$$ExternalSyntheticLambda1 = new DraftsController$$ExternalSyntheticLambda1(draftsController, i);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(draftsController.currentAccount);
                        messagesStorage.getStorageQueue().postRunnable(new EglRenderer$$ExternalSyntheticLambda8(messagesStorage, zRelease, draftsController$$ExternalSyntheticLambda1, 7));
                    }
                }
                boolean z4 = anonymousClass3.isSelf;
                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass3.currentStory;
                if (!z4) {
                    StoriesController storiesController2 = MessagesController.getInstance(anonymousClass3.currentAccount).getStoriesController();
                    TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                    storiesController2.getClass();
                    if (storyItem != null) {
                        long j = storyItem.dialogId;
                        int i4 = storiesController2.currentAccount;
                        z = j != UserConfig.getInstance(i4).getClientUserId() && ((storyItem.dialogId > 0 && (user = MessagesController.getInstance(i4).getUser(Long.valueOf(storyItem.dialogId))) != null && user.bot && user.bot_can_edit) || (storyItem.dialogId < 0 && (chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-storyItem.dialogId))) != null && (chat.creator || (((z2 = storyItem.out) && (tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.post_stories || tL_chatAdminRights2.edit_stories)) || !(z2 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))));
                    }
                }
                boolean z5 = anonymousClass3.isSelf || ((anonymousClass3.isChannel || anonymousClass3.isBotsPreview()) && z);
                boolean z6 = storyItemHolder.isVideo;
                Context context = anonymousClass3.getContext();
                Context context2 = (Context) this.f$3;
                PeerStoriesView.SharedResources sharedResources = (PeerStoriesView.SharedResources) this.f$4;
                DarkThemeResourceProvider darkThemeResourceProvider = (DarkThemeResourceProvider) this.f$1;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = new PeerStoriesView.AnonymousClass8(anonymousClass3, context, darkThemeResourceProvider, darkThemeResourceProvider, (StoryViewer) this.f$2, z6, z5, z, context2, sharedResources, zArr);
                anonymousClass3.popupMenu = anonymousClass8;
                ImageView imageView = anonymousClass3.optionsIconView;
                int iDp = AndroidUtilities.dp(6.0f) + (-ActionBar.getCurrentActionBarHeight());
                anonymousClass8.isShowing = true;
                anonymousClass8.popupWindow.showAsDropDown(imageView, 0, iDp);
                break;
            case 13:
                PeerStoriesView.AnonymousClass8 anonymousClass9 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass9.getClass();
                float alpha = view.getAlpha();
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass4 = anonymousClass9.this$0;
                if (alpha < 1.0f) {
                    int i5 = -anonymousClass4.shiftDp;
                    anonymousClass4.shiftDp = i5;
                    AndroidUtilities.shakeViewSpring(view, i5);
                    new BulletinFactory(anonymousClass4.storyContainer, (DarkThemeResourceProvider) this.f$1).createErrorBulletin("Wait until current upload is complete", null).show();
                    break;
                } else {
                    Activity activityFindActivity = AndroidUtilities.findActivity((Context) this.f$2);
                    if (activityFindActivity != null) {
                        anonymousClass9.edit = true;
                        PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass4.popupMenu;
                        if (anonymousClass10 != null && (actionBarPopupWindow = anonymousClass10.popupWindow) != null) {
                            actionBarPopupWindow.dismiss(true);
                        }
                        ProfileActivity$$ExternalSyntheticLambda149 profileActivity$$ExternalSyntheticLambda149 = new ProfileActivity$$ExternalSyntheticLambda149(anonymousClass9, activityFindActivity, (StoryViewer) this.f$3, (PeerStoriesView.SharedResources) this.f$4, 19);
                        StoryViewer.AnonymousClass5 anonymousClass5 = (StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass4).delegate;
                        StoryViewer.VideoPlayerHolder videoPlayerHolder = StoryViewer.this.playerHolder;
                        if (videoPlayerHolder != null) {
                            zRelease = videoPlayerHolder.release(profileActivity$$ExternalSyntheticLambda149);
                            StoryViewer.this.playerHolder = null;
                        }
                        if (!zRelease) {
                            profileActivity$$ExternalSyntheticLambda149.run();
                        }
                        break;
                    }
                }
                break;
            case 14:
                PeerStoriesView.AnonymousClass8 anonymousClass11 = (PeerStoriesView.AnonymousClass8) this.f$0;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass6 = anonymousClass11.this$0;
                File path = anonymousClass6.currentStory.getPath();
                if (path == null || !path.exists()) {
                    anonymousClass6.showDownloadAlert$1();
                    break;
                } else {
                    Activity activityFindActivity2 = AndroidUtilities.findActivity((Context) this.f$1);
                    if (activityFindActivity2 != null) {
                        anonymousClass11.edit = true;
                        PeerStoriesView.AnonymousClass8 anonymousClass12 = anonymousClass6.popupMenu;
                        if (anonymousClass12 != null && (actionBarPopupWindow2 = anonymousClass12.popupWindow) != null) {
                            actionBarPopupWindow2.dismiss(true);
                        }
                        WebInstantView$4$$ExternalSyntheticLambda0 webInstantView$4$$ExternalSyntheticLambda0 = new WebInstantView$4$$ExternalSyntheticLambda0(anonymousClass11, activityFindActivity2, (TL_stories.StoryItem) this.f$2, (StoryViewer) this.f$3, (PeerStoriesView.SharedResources) this.f$4, 4);
                        StoryViewer.AnonymousClass5 anonymousClass7 = (StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass6).delegate;
                        StoryViewer.VideoPlayerHolder videoPlayerHolder2 = StoryViewer.this.playerHolder;
                        if (videoPlayerHolder2 != null) {
                            zRelease2 = videoPlayerHolder2.release(webInstantView$4$$ExternalSyntheticLambda0);
                            StoryViewer.this.playerHolder = null;
                        }
                        if (!zRelease2) {
                            webInstantView$4$$ExternalSyntheticLambda0.run();
                        }
                        break;
                    }
                }
                break;
            default:
                if (((ButtonWithCounterView) this.f$1).enabled) {
                    boolean[] zArr2 = (boolean[]) this.f$2;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        ((Utilities.Callback) this.f$3).run(((String[]) this.f$4)[0]);
                    }
                    ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, Object obj4, BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$0 = bottomSheet;
    }

    public OAuthSheet$$ExternalSyntheticLambda6(Object obj, ArrayList arrayList, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = arrayList;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }
}
