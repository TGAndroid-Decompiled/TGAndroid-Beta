package org.telegram.ui.TON;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController$DebugItem;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;

public final class TONIntroActivity$$ExternalSyntheticLambda3 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public TONIntroActivity$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(View view, int i) {
        UItem item;
        switch (this.$r8$classId) {
            case 0:
                ((TONIntroActivity) this.f$0).lambda$createView$1$1(i);
                break;
            case 1:
                ((DialogsSearchAdapter) this.f$0).lambda$onCreateViewHolder$23(view, i);
                break;
            case 2:
                ((ChatAttachAlertQuickRepliesLayout) this.f$0).lambda$new$3(i);
                break;
            case 3:
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                UItem item2 = chatbotSheet.adapter.getItem(i - 1);
                if (item2 != null) {
                    BusinessRecipientsHelper businessRecipientsHelper = chatbotSheet.recipientsHelper;
                    if (!businessRecipientsHelper.onClick(item2)) {
                        int i2 = item2.id;
                        if (i2 == -1) {
                            chatbotSheet.exclude = true;
                            businessRecipientsHelper.exclude = true;
                            chatbotSheet.adapter.update(true);
                            chatbotSheet.checkDone$4(true);
                        } else if (i2 == -2) {
                            chatbotSheet.exclude = false;
                            businessRecipientsHelper.exclude = false;
                            chatbotSheet.adapter.update(true);
                            chatbotSheet.checkDone$4(true);
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((ThemesHorizontalListCell) this.f$0).lambda$new$0(view, i);
                break;
            case 5:
                FloatingDebugView floatingDebugView = (FloatingDebugView) this.f$0;
                Runnable runnable = ((FloatingDebugController$DebugItem) floatingDebugView.debugItems.get(i)).action;
                if (runnable != null) {
                    runnable.run();
                    floatingDebugView.showBigMenu(false);
                }
                break;
            case 6:
                ((LPhotoPaintView) this.f$0).lambda$new$7(view, i);
                break;
            case 7:
                PaintColorsListView paintColorsListView = (PaintColorsListView) this.f$0;
                paintColorsListView.colorListener.accept(Integer.valueOf(paintColorsListView.colorPalette.getColor(i)));
                PersistColorPalette persistColorPalette = paintColorsListView.colorPalette;
                persistColorPalette.brushColor.put(Integer.valueOf(persistColorPalette.currentBrush), Integer.valueOf(persistColorPalette.getColor(i)));
                persistColorPalette.needSaveBrushColor = true;
                break;
            case 8:
                ((MemberRequestsDelegate) this.f$0).onItemClick(view, i);
                break;
            case 9:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = (ProfileGiftsContainer.SelectGiftsBottomSheet) this.f$0;
                UniversalAdapter universalAdapter = selectGiftsBottomSheet.adapter;
                if (universalAdapter != null && (item = universalAdapter.getItem(i - 1)) != null) {
                    Object obj = item.object;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i3 = savedStarGift.msg_id;
                        long j = i3 == 0 ? savedStarGift.saved_id : i3;
                        HashSet hashSet = selectGiftsBottomSheet.selectedGiftIds;
                        if (hashSet.contains(Long.valueOf(j))) {
                            hashSet.remove(Long.valueOf(j));
                            ((GiftSheet.GiftCell) view).setChecked(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j));
                            ((GiftSheet.GiftCell) view).setChecked(true, true);
                        }
                        ButtonWithCounterView buttonWithCounterView = selectGiftsBottomSheet.button;
                        buttonWithCounterView.setEnabled(hashSet.size() > 0);
                        buttonWithCounterView.setCount(hashSet.size(), true);
                    }
                }
                break;
            case 10:
                ((StarsIntroActivity) this.f$0).lambda$createView$1(i);
                break;
            case 11:
                ((StarsIntroActivity.GiftStarsSheet) this.f$0).lambda$new$0$1(i);
                break;
            case 12:
                ((StarsIntroActivity.StarsNeededSheet) this.f$0).lambda$new$0$2(i);
                break;
            case 13:
                ((StarsIntroActivity.StarsOptionsSheet) this.f$0).lambda$new$0$3(i);
                break;
            case 14:
                ((DialogStoriesCell) this.f$0).lambda$new$1$3(view, i);
                break;
            case 15:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.f$0;
                botPreviewsEditLangContainer.getClass();
                if (view instanceof SharedPhotoVideoCell2) {
                    MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
                    BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                    if (!botPreviewsEditContainer.isActionModeShowed()) {
                        StoryViewer orCreateStoryViewer = botPreviewsEditContainer.fragment.getOrCreateStoryViewer();
                        Context context = botPreviewsEditLangContainer.getContext();
                        int id = messageObject.getId();
                        StoriesController.BotPreviewsList botPreviewsList = botPreviewsEditLangContainer.list;
                        int iDp = 0;
                        StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(botPreviewsEditLangContainer.listView, false);
                        if ((botPreviewsEditContainer.fragment instanceof ProfileActivity) && ((ProfileActivity) botPreviewsEditContainer.fragment).myProfile) {
                            iDp = AndroidUtilities.dp(68.0f);
                        }
                        storiesListPlaceProvider.addBottomClip += iDp;
                        orCreateStoryViewer.open(context, id, botPreviewsList, storiesListPlaceProvider);
                    } else if (!botPreviewsEditContainer.isSelected(messageObject)) {
                        botPreviewsEditContainer.select(messageObject);
                    } else {
                        botPreviewsEditContainer.unselect(messageObject);
                    }
                }
                break;
            case 16:
                UniversalAdapter universalAdapter2 = ((TONIntroActivity.StarsNeededSheet) this.f$0).adapter;
                if (universalAdapter2 != null) {
                    universalAdapter2.getItem(i - 1);
                    break;
                }
                break;
            case 17:
                ((AffiliateProgramFragment) this.f$0).lambda$createView$5(i);
                break;
            default:
                CommunityAddOptionsSheet communityAddOptionsSheet = (CommunityAddOptionsSheet) this.f$0;
                int i4 = communityAddOptionsSheet.adapter.getItem(i - 1).id;
                if (i4 == 151) {
                    communityAddOptionsSheet.setIsHidden(false);
                } else if (i4 == 150) {
                    communityAddOptionsSheet.setIsHidden(true);
                }
                break;
        }
    }
}
