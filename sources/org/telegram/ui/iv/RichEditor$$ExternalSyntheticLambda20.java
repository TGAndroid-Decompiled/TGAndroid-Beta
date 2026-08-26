package org.telegram.ui.iv;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda14;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.web.AddressBarList;

public final class RichEditor$$ExternalSyntheticLambda20 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public RichEditor$$ExternalSyntheticLambda20(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        StarGiftPreviewSheet.Attributes attributes;
        Integer num;
        CharSequence charSequenceCoerceToText;
        switch (this.$r8$classId) {
            case 0:
                ((RichEditor) this.f$0).lambda$createView$20((Context) this.f$1, view);
                break;
            case 1:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = ProfileGiftsContainer.SelectGiftsBottomSheet.this;
                StarsController.GiftsList giftsList = selectGiftsBottomSheet.list;
                giftsList.sort_by_date = !giftsList.sort_by_date;
                ((SendMessagesHelper$$ExternalSyntheticLambda7) this.f$1).run();
                selectGiftsBottomSheet.list.invalidate(true);
                break;
            case 2:
                ResaleGiftsFragment resaleGiftsFragment = (ResaleGiftsFragment) this.f$0;
                resaleGiftsFragment.getClass();
                if (((StarsIntroActivity.StarsBalanceView) this.f$1).lastBalance > 0) {
                    resaleGiftsFragment.presentFragment(new StarsIntroActivity());
                    break;
                }
                break;
            case 3:
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$new$3((ResaleGiftsFragment.SelectGiftSheet.State) this.f$1);
                break;
            case 4:
                ((BotStarsActivity) this.f$0).lambda$createView$7((Context) this.f$1, view);
                break;
            case 5:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                giftOfferSheet.getClass();
                String[] strArr = new String[6];
                int i = 0;
                int i2 = 0;
                while (true) {
                    int[] iArr = GiftOfferSheet.ALLOWED_DURATIONS;
                    if (i >= 6) {
                        AlertsCreator.createCustomPicker((Context) this.f$1, LocaleController.getString(R.string.GiftOfferDuration), i2, strArr, new DialogCell$$ExternalSyntheticLambda6(giftOfferSheet, 26));
                    } else {
                        strArr[i] = LocaleController.formatPluralString("GiftOfferHours", iArr[i] / 3600, new Object[0]);
                        if (iArr[i] == giftOfferSheet.selectedDuration) {
                            i2 = i;
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 6:
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = (SellGiftEnterPriceSheet) this.f$0;
                ButtonWithCounterView buttonWithCounterView = sellGiftEnterPriceSheet.buttonView;
                if (buttonWithCounterView.isEnabled() && !buttonWithCounterView.isLoading()) {
                    AndroidUtilities.hideKeyboard(sellGiftEnterPriceSheet.starsCountEditField);
                    buttonWithCounterView.setLoading(true);
                    ((GiftSheet$$ExternalSyntheticLambda4) this.f$1).run(sellGiftEnterPriceSheet.inputAmount);
                    break;
                }
                break;
            case 7:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.f$0;
                int i3 = starGiftPreviewSheet.mode;
                StarGiftPreviewSheet.AnonymousClass4 anonymousClass4 = starGiftPreviewSheet.topView;
                if (i3 == 2) {
                    anonymousClass4.setPreviewingAttributes((ArrayList) this.f$1);
                    starGiftPreviewSheet.setMode(1);
                } else if (i3 == 1) {
                    StarGiftPreviewSheet.Attributes attributes2 = new StarGiftPreviewSheet.Attributes(anonymousClass4.getUpgradeBackdropAttribute(), anonymousClass4.getUpgradePatternAttribute(), anonymousClass4.getUpgradeImageViewAttribute());
                    starGiftPreviewSheet.selectedAttributes = attributes2;
                    anonymousClass4.setPreviewAttributes(attributes2);
                    starGiftPreviewSheet.setMode(2);
                }
                break;
            case 8:
                StarGiftPreviewSheet starGiftPreviewSheet2 = StarGiftPreviewSheet.this;
                int i4 = starGiftPreviewSheet2.mode;
                StarGiftPreviewSheet.AnonymousClass4 anonymousClass5 = starGiftPreviewSheet2.topView;
                if (i4 == 1) {
                    starGiftPreviewSheet2.selectedAttributes = new StarGiftPreviewSheet.Attributes(anonymousClass5.getUpgradeBackdropAttribute(), anonymousClass5.getUpgradePatternAttribute(), anonymousClass5.getUpgradeImageViewAttribute());
                    starGiftPreviewSheet2.setMode(2);
                }
                int i5 = starGiftPreviewSheet2.tabsSelectorView.selectedTab;
                StarGiftPreviewSheet.Attributes attributes3 = starGiftPreviewSheet2.selectedAttributes;
                if (attributes3 != null) {
                    StarGiftPreviewSheet.Attributes attributes4 = (StarGiftPreviewSheet.Attributes) this.f$1;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = attributes3.model;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = attributes3.pattern;
                    if (i5 == 1) {
                        attributes = new StarGiftPreviewSheet.Attributes(attributes4.backdrop, stargiftattributepattern, stargiftattributemodel);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = attributes3.backdrop;
                        if (i5 == 2) {
                            attributes = new StarGiftPreviewSheet.Attributes(stargiftattributebackdrop, attributes4.pattern, stargiftattributemodel);
                        } else if (i5 == 0) {
                            attributes = new StarGiftPreviewSheet.Attributes(stargiftattributebackdrop, stargiftattributepattern, attributes4.model);
                        } else {
                            attributes = null;
                        }
                    }
                } else {
                    attributes = null;
                }
                starGiftPreviewSheet2.selectedAttributes = attributes;
                anonymousClass5.setPreviewAttributes(attributes);
                starGiftPreviewSheet2.updateSelectedForVisibleViews();
                break;
            case 9:
                Browser.openUrlInSystemBrowser(((StarGiftSheet) this.f$0).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.f$1).fragment_listed_url);
                break;
            case 10:
                ((StarGiftSheet) this.f$0).showDeleteDescriptionAlert((CharSequence) this.f$1);
                break;
            case 11:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) this.f$0;
                if (craftTopView.variantsButton.getAlpha() >= 1.0f && !craftTopView.crafting && !craftTopView.failed && craftTopView.previewAttributes != null) {
                    new StarGiftPreviewSheet(craftTopView.getContext(), (Theme.ResourcesProvider) this.f$1, craftTopView.currentAccount, craftTopView.collectionTitle, craftTopView.previewAttributes, true).show();
                    break;
                }
                break;
            case 12:
                Browser.openUrl((Context) this.f$1, ((TL_stars.StarsTransaction) this.f$0).transaction_url);
                break;
            case 13:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                if (livePlayer != null) {
                    int i6 = UserConfig.selectedAccount;
                    int i7 = livePlayer.currentAccount;
                    if (i7 != i6) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity != null) {
                            launchActivity.switchToAccount(i7, true);
                        }
                    }
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        TL_stories.StoryItem storyItemFindStory = MessagesController.getInstance(i7).getStoriesController().findStory(livePlayer.storyId, livePlayer.dialogId);
                        if (storyItemFindStory == null) {
                            storyItemFindStory = livePlayer.storyItem;
                        }
                        if (storyItemFindStory != null) {
                            safeLastFragment.getOrCreateStoryViewer().open(i7, (Context) this.f$1, storyItemFindStory, (StoriesListPlaceProvider) null);
                            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(21), 200L);
                            break;
                        }
                    }
                }
                break;
            case 14:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                StoryCaptionView.Panel panel = (StoryCaptionView.Panel) this.f$1;
                if (panel.peerId == null) {
                    BulletinFactory.of(peerStoriesView.storyContainer, peerStoriesView.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryHidAccount)).setTag(3).show(true);
                } else {
                    Bundle bundle = new Bundle();
                    if (panel.peerId.longValue() >= 0) {
                        bundle.putLong("user_id", panel.peerId.longValue());
                    } else {
                        bundle.putLong("chat_id", -panel.peerId.longValue());
                    }
                    boolean z = panel.isRepostMessage;
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    if (z && (num = panel.messageId) != null) {
                        bundle.putInt("message_id", num.intValue());
                        storyViewer.presentFragment(new ChatActivity(bundle));
                    } else {
                        storyViewer.presentFragment(new ProfileActivity(bundle));
                    }
                }
                break;
            case 15:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.f$0;
                StoryViewer.this.showDialog(new PremiumFeatureBottomSheet(anonymousClass1.storyViewer.fragment, 14, false));
                ((BottomSheet) this.f$1).lambda$showGiftOfferSheet$15();
                break;
            case 16:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                EmojiPacksAlert alert = ((StoryContainsEmojiButton) this.f$1).getAlert();
                if (alert != null) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                    PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass2).delegate;
                    if (delegate != null) {
                        StoryViewer.this.showDialog(alert);
                        anonymousClass2.popupMenu.dismiss();
                    }
                }
                break;
            case 17:
                GalleryListView galleryListView = (GalleryListView) this.f$0;
                galleryListView.selectAlbum((MediaController.AlbumEntry) this.f$1, false);
                galleryListView.dropDownContainer.closeSubMenu();
                break;
            case 18:
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                try {
                    charSequenceCoerceToText = ((ClipboardManager) storyLinkSheet.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(storyLinkSheet.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequenceCoerceToText = null;
                }
                if (charSequenceCoerceToText != null) {
                    EditTextCell editTextCell = storyLinkSheet.urlEditText;
                    editTextCell.editText.setText(charSequenceCoerceToText.toString());
                    EditTextCaption editTextCaption = editTextCell.editText;
                    editTextCaption.setSelection(0, editTextCaption.getText().length());
                }
                ((RichTableCell$$ExternalSyntheticLambda3) this.f$1).run();
                break;
            case 19:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                storyRecorder.getClass();
                new StoryPrivacyBottomSheet.ChoosePeerSheet((Activity) this.f$1, storyRecorder.currentAccount, true, storyRecorder.livePeer, new StoryRecorder$$ExternalSyntheticLambda14(storyRecorder, 20), storyRecorder.resourcesProvider).show();
                break;
            case 20:
                ((AffiliateProgramFragment) this.f$0).lambda$createView$4$1((Context) this.f$1);
                break;
            case 21:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                botWebViewSheet.getClass();
                BotDownloads.FileDownload fileDownload = (BotDownloads.FileDownload) this.f$1;
                if (fileDownload.isDownloading()) {
                    BotDownloads.this.cancel(fileDownload);
                } else {
                    File file = fileDownload.file;
                    if (file != null && file.exists()) {
                        File file2 = fileDownload.file;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.instance, null, true);
                    }
                }
                ItemOptions itemOptions = botWebViewSheet.options;
                if (itemOptions != null) {
                    itemOptions.dismiss();
                    botWebViewSheet.options = null;
                }
                break;
            case 22:
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    safeLastFragment2.presentFragment(ProfileActivity.of(((TL_payments.connectedBotStarRef) this.f$1).bot_id));
                }
                break;
            case 23:
                CommunityInviteOnlySheet communityInviteOnlySheet = (CommunityInviteOnlySheet) this.f$0;
                communityInviteOnlySheet.getClass();
                ((Runnable) this.f$1).run();
                communityInviteOnlySheet.lambda$showGiftOfferSheet$15();
                break;
            default:
                AddressBarList addressBarList = (AddressBarList) this.f$0;
                addressBarList.hideCurrent = true;
                ((ArticleViewer$$ExternalSyntheticLambda26) this.f$1).run();
                addressBarList.listView.adapter.update(true);
                break;
        }
    }

    public RichEditor$$ExternalSyntheticLambda20(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.$r8$classId = 12;
        this.f$1 = context;
        this.f$0 = starsTransaction;
    }
}
