package org.telegram.ui;

import android.animation.ObjectAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.SelectPeerView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.community.CommunityUtils;

public final class TodoItemMenu$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public TodoItemMenu$$ExternalSyntheticLambda5(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i = 1;
        boolean z = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TodoItemMenu todoItemMenu = (TodoItemMenu) obj;
                todoItemMenu.getClass();
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda0(todoItemMenu, i));
                ChatMessageCell chatMessageCell = todoItemMenu.cell;
                if (chatMessageCell != null) {
                    chatMessageCell.setVisibility(0);
                    if (!z) {
                        ChatMessageCell chatMessageCell2 = todoItemMenu.cell;
                        int todoIndex = chatMessageCell2.getTodoIndex(todoItemMenu.taskId);
                        TodoItemMenu.AnonymousClass7 anonymousClass7 = todoItemMenu.myTaskCell;
                        CheckBoxBase[] checkBoxBaseArr2 = chatMessageCell2.pollCheckBox;
                        if (checkBoxBaseArr2 != null && todoIndex >= 0 && todoIndex < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[todoIndex]) != null && anonymousClass7 != null && (checkBoxBaseArr = anonymousClass7.pollCheckBox) != null && todoIndex >= 0 && todoIndex < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[todoIndex]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.checkAnimator;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.checkAnimator = null;
                            }
                            float f = checkBoxBase2.progress;
                            if (checkBoxBase.progress != f) {
                                checkBoxBase.progress = f;
                                checkBoxBase.invalidate();
                                CheckBoxBase.ProgressDelegate progressDelegate = checkBoxBase.progressDelegate;
                                if (progressDelegate != null) {
                                    progressDelegate.setProgress();
                                }
                            }
                            checkBoxBase.setChecked(-1, checkBoxBase2.isChecked, true);
                        }
                    }
                    ChatMessageCell chatMessageCell3 = todoItemMenu.cell;
                    chatMessageCell3.doNotDrawTaskId = -1;
                    chatMessageCell3.invalidate();
                }
                ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 = todoItemMenu.dismissListener;
                if (chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 != null) {
                    AndroidUtilities.runOnUIThread(chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8);
                    todoItemMenu.dismissListener = null;
                }
                break;
            case 1:
                FilterChatlistActivity filterChatlistActivity = (FilterChatlistActivity) obj;
                filterChatlistActivity.deselectAll$1(filterChatlistActivity.headerCountCell, z);
                break;
            case 2:
                LoginActivity loginActivity = (LoginActivity) obj;
                if (z) {
                    loginActivity.getClass();
                } else {
                    loginActivity.proxyButtonView.setVisibility(8);
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (z) {
                    photoViewer.getClass();
                } else {
                    photoViewer.resetButton.setVisibility(8);
                }
                break;
            case 4:
                ((ProfileActivity) obj).updateListAnimated(z, true);
                break;
            case 5:
                Browser.openUrl(ProfileActivity.this.getParentActivity(), LocaleController.getString(z ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 6:
                QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) obj;
                ChatThemeBottomSheet.Adapter adapter = themeListViewController.adapter;
                if (adapter != null && adapter.items != null) {
                    themeListViewController.setForceDark(z, true);
                    ChatThemeBottomSheet.ChatThemeItem chatThemeItem = themeListViewController.selectedItem;
                    QrActivity qrActivity = QrActivity.this;
                    if (chatThemeItem != null) {
                        themeListViewController.isLightDarkChangeAnimation = true;
                        qrActivity.isCurrentThemeDark = z;
                        qrActivity.onItemSelected(qrActivity.selectedPosition, qrActivity.currentTheme, false);
                    }
                    if (adapter.items != null) {
                        for (int i2 = 0; i2 < adapter.items.size(); i2++) {
                            ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i2)).themeIndex = z ? 1 : 0;
                            ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i2)).icon = qrActivity.getEmojiThemeIcon(((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i2)).chatTheme, z);
                        }
                        qrActivity.tempMotionDrawable = null;
                        adapter.mObservable.notifyChanged();
                    }
                    break;
                }
                break;
            case 7:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) obj;
                if (z) {
                    starGiftPreviewSheet.getClass();
                } else {
                    starGiftPreviewSheet.gradientTop.setVisibility(8);
                }
                break;
            case 8:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj;
                starGiftSheet.getClass();
                starGiftSheet.showHint(AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, starGiftSheet.getGiftName())), starGiftSheet.ownerTextView, true);
                break;
            case 9:
                StarGiftSheet starGiftSheet2 = StarGiftSheet.this;
                TL_stars.SavedStarGift neighbourSavedGift = starGiftSheet2.getNeighbourSavedGift(z);
                if (neighbourSavedGift != null) {
                    starGiftSheet2.firstSet = true;
                    starGiftSheet2.set(neighbourSavedGift, starGiftSheet2.giftsList);
                } else {
                    TL_stars.TL_starGiftUnique neighbourSlugGift = starGiftSheet2.getNeighbourSlugGift(z);
                    if (neighbourSlugGift != null) {
                        starGiftSheet2.firstSet = true;
                        starGiftSheet2.set(neighbourSlugGift.slug, neighbourSlugGift, starGiftSheet2.giftsList);
                    }
                }
                starGiftSheet2.overrideNextIndex = -1;
                Bulletin bulletin = Bulletin.visibleBulletin;
                if (bulletin != null) {
                    bulletin.hide(0L, false);
                }
                break;
            case 10:
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) obj;
                SharedMediaLayout.AnonymousClass12 anonymousClass12 = botPreviewsEditLangContainer.this$0;
                if (z) {
                    new BotPreviewsEditContainer.ChooseLanguageSheet(anonymousClass12.fragment, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass12, 10)).show();
                } else {
                    anonymousClass12.deleteLang(botPreviewsEditLangContainer.list.lang_code);
                }
                break;
            case 11:
                GalleryListView.Cell cell = (GalleryListView.Cell) obj;
                if (z) {
                    cell.getClass();
                } else {
                    cell.checkBoxContainer.setVisibility(8);
                }
                break;
            case 12:
                LivePlayerView livePlayerView = (LivePlayerView) obj;
                livePlayerView.getClass();
                livePlayerView.emptyView.setVisibility(z ? 0 : 8);
                break;
            case 13:
                PaintView paintView = (PaintView) obj;
                if (z) {
                    paintView.getClass();
                } else {
                    paintView.textDim.setVisibility(8);
                }
                break;
            case 14:
                SelectPeerView selectPeerView = (SelectPeerView) obj;
                if (z) {
                    selectPeerView.getClass();
                } else {
                    selectPeerView.setVisibility(8);
                }
                break;
            case 15:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) obj;
                if (z) {
                    anonymousClass24.getClass();
                } else {
                    StoryRecorder.this.playButton.setVisibility(8);
                }
                break;
            default:
                ((CommunityUtils.PendingRequests) obj).onResolveAllJoinRequests(z, false);
                break;
        }
    }
}
