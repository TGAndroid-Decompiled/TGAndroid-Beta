package org.telegram.ui.Business;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.common.base.Splitter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageUnsupportedCell;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.iv.RichEditor;

public final class ChatbotSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ChatbotSheet$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatbotSheet chatbotSheet = (ChatbotSheet) obj;
                UniversalAdapter universalAdapter = chatbotSheet.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                chatbotSheet.checkDone$4(true);
                break;
            case 1:
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) ((RichEditor.AnonymousClass3) obj).this$0;
                chatbotsActivity.listView.adapter.update(true);
                chatbotsActivity.updateSearchLoading();
                break;
            case 2:
                GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) obj;
                greetMessagesActivity.listView.adapter.update(true);
                greetMessagesActivity.checkDone$1$1(true);
                break;
            case 3:
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) obj;
                openingHoursActivity.listView.adapter.update(true);
                openingHoursActivity.checkDone$3(true);
                break;
            case 4:
                ((GiftSheet$$ExternalSyntheticLambda23) obj).run(Boolean.FALSE);
                break;
            case 5:
                NotificationCenter.getInstance(((QuickRepliesController) obj).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 6:
                AboutLinkCell.AnonymousClass3 anonymousClass3 = (AboutLinkCell.AnonymousClass3) obj;
                if (anonymousClass3.thisLoading != null) {
                    AboutLinkCell.this.links.removeLoading(anonymousClass3.thisLoading, true);
                }
                break;
            case 7:
                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = ((ChatMessageUnsupportedCell) obj).delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.didPressAppUpdateButton();
                }
                break;
            case 8:
                ((CollapseTextCell) obj).updateCollapseArrowTranslation();
                break;
            case 9:
                ((EditEmojiTextCell) obj).lambda$hideKeyboardOnEnter$0();
                break;
            case 10:
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) obj;
                if (!(profileSearchCell.getParent() instanceof RecyclerListView)) {
                    profileSearchCell.callOnClick();
                } else {
                    RecyclerListView recyclerListView = (RecyclerListView) profileSearchCell.getParent();
                    recyclerListView.getOnItemClickListener().onItemClick(profileSearchCell, recyclerListView.getChildAdapterPosition(profileSearchCell));
                }
                break;
            case 11:
                ((SharedPhotoVideoCell2) obj).lambda$setStyle$1();
                break;
            case 12:
                ((TextSelectionHelper) obj).lambda$new$1();
                break;
            case 13:
                TextSelectionHelper.this.showActions();
                break;
            case 14:
                Bulletin.hideVisible();
                ((DialogsActivity) obj).presentFragment(new SessionsActivity(0));
                break;
            case 15:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (Theme.ThemeInfo) obj, Boolean.TRUE, null, -1);
                break;
            case 16:
                TopicsFragment topicsFragment = (TopicsFragment) obj;
                if (topicsFragment.getParentLayout() != null) {
                    topicsFragment.switchToChat(true);
                }
                break;
            case 17:
                RenderView.AnonymousClass2 anonymousClass2 = ((Painting.AnonymousClass1) obj).this$0.delegate;
                if (anonymousClass2 != null) {
                    anonymousClass2.contentChanged();
                }
                break;
            case 18:
                Painting painting = ((Painting.AnonymousClass1) obj).this$0;
                if (painting.helperShape != null) {
                    int currentColor = painting.renderView.getCurrentColor();
                    painting.paintStrokeInternal(painting.activePath, false, false);
                    Splitter splitterCommitPathInternal = painting.commitPathInternal(painting.activePath, currentColor, new RectF(painting.activeStrokeBounds));
                    painting.clearStrokeInternal();
                    Shape shape = painting.helperShape;
                    RectF rectF = new RectF();
                    painting.activeStrokeBounds = rectF;
                    shape.getBounds(rectF);
                    painting.restoreSliceInternal(painting.commitShapeInternal(shape, currentColor, new RectF(painting.activeStrokeBounds)), false);
                    painting.restoreSliceInternal(splitterCommitPathInternal, false);
                    painting.commitShapeInternal(shape, currentColor, null);
                    painting.helperShape = null;
                    painting.helperApplyAlpha = 0.0f;
                    painting.helperApplyAnimator = null;
                } else {
                    painting.helperApplyAnimator = null;
                }
                break;
            case 19:
                RenderView.this.delegate.onFirstDraw();
                break;
            case 20:
                UndoStore.UndoStoreDelegate undoStoreDelegate = ((UndoStore) obj).delegate;
                if (undoStoreDelegate != null) {
                    undoStoreDelegate.historyChanged();
                }
                break;
            case 21:
                LPhotoPaintView.lambda$onSwitchSegmentedAnimation$49((PhotoView) obj);
                break;
            case 22:
                PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) obj;
                anonymousClass26.textureViewActive = true;
                anonymousClass26.invalidateAll();
                break;
            case 23:
                ((View) obj).performClick();
                break;
            case 24:
                MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, ((StickerMakerView.StickerUploader) obj).mediaDocument.document, (int) (System.currentTimeMillis() / 1000), false);
                break;
            case 25:
                AndroidUtilities.showKeyboard(((TextPaintView) obj).editText);
                break;
            case 26:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (chat != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    LaunchActivity.getLastFragment().showAsSheet(new BoostsActivity(-chat.id), bottomSheetParams);
                }
                break;
            case 27:
                BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
                if (bulletinFactoryGlobal != null) {
                    bulletinFactoryGlobal.createSimpleBulletinWithIconSize(R.raw.forward, (SpannableStringBuilder) obj, 30).show();
                }
                break;
            case 28:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21) obj).run(null);
                break;
            default:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj).run(null);
                break;
        }
    }
}
