package org.telegram.ui;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.FlatCheckBox;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$$ExternalSyntheticLambda130 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$$ExternalSyntheticLambda130(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                MessageObject messageObject = photoViewer.currentMessageObject;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    Bulletin.BulletinWindow bulletinWindow = new Bulletin.BulletinWindow(photoViewer.activityContext, null);
                    new BulletinFactory(bulletinWindow.container, (DarkThemeResourceProvider) this.f$1).createCopyLinkBulletin(false).show();
                }
                return true;
            case 1:
                StakedDiceSheet$$ExternalSyntheticLambda6 stakedDiceSheet$$ExternalSyntheticLambda6 = ((AIEditorAlert.Tabs) this.f$0).onLongClick;
                if (stakedDiceSheet$$ExternalSyntheticLambda6 != null) {
                    return ((Boolean) stakedDiceSheet$$ExternalSyntheticLambda6.run((AIEditorAlert.Tabs.Tab) this.f$1)).booleanValue();
                }
                return false;
            case 2:
                AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.f$0;
                audioPlayerAlert.getClass();
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                ActionBarMenuSlider.SpeedSlider speedSlider = audioPlayerAlert.speedSlider;
                speedSlider.setSpeed(playbackSpeed, false);
                speedSlider.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, (Theme.ResourcesProvider) this.f$1));
                audioPlayerAlert.updatePlaybackButton(false);
                ActionBarMenuItem actionBarMenuItem = audioPlayerAlert.playbackSpeedButton;
                actionBarMenuItem.setDimMenu(0.15f);
                actionBarMenuItem.toggleSubMenu(null, speedSlider);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                ItemOptions itemOptions = (ItemOptions) this.f$0;
                ((DialogsActivity$$ExternalSyntheticLambda8) this.f$1).run();
                if (!itemOptions.dismissWithButtons) {
                    return true;
                }
                itemOptions.dismiss();
                return true;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                long dialogId = profileActivity.getDialogId();
                long j = profileActivity.topicId;
                Theme.ResourcesProvider resourcesProvider = profileActivity.resourcesProvider;
                ImageView imageView = (ImageView) this.f$1;
                ActionBarPopupWindow actionBarPopupWindowShow = BackButtonMenu.show(profileActivity, imageView, dialogId, j, resourcesProvider);
                if (actionBarPopupWindowShow == null) {
                    return false;
                }
                actionBarPopupWindowShow.setOnDismissListener(new ArticleViewer$$ExternalSyntheticLambda67(profileActivity, 5));
                profileActivity.scrimView = imageView;
                profileActivity.dimBehindView(0.3f);
                UndoView undoView = profileActivity.undoView;
                if (undoView == null) {
                    return true;
                }
                undoView.hide(1, true);
                return true;
            case 5:
                StatisticActivity.BaseChartCell.CheckBoxHolder checkBoxHolder = (StatisticActivity.BaseChartCell.CheckBoxHolder) this.f$0;
                FlatCheckBox flatCheckBox = checkBoxHolder.checkBox;
                boolean z = false;
                if (flatCheckBox.enabled) {
                    StatisticActivity.BaseChartCell baseChartCell = StatisticActivity.BaseChartCell.this;
                    baseChartCell.zoomCanceled();
                    ArrayList arrayList = baseChartCell.checkBoxes;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        BaseChartView baseChartView = baseChartCell.zoomedChartView;
                        if (i < size) {
                            ((StatisticActivity.BaseChartCell.CheckBoxHolder) arrayList.get(i)).checkBox.setChecked(false);
                            ((StatisticActivity.BaseChartCell.CheckBoxHolder) arrayList.get(i)).line.enabled = false;
                            if (baseChartCell.data.activeZoom > 0 && i < baseChartView.lines.size()) {
                                ((LineViewData) baseChartView.lines.get(i)).enabled = false;
                            }
                            i++;
                        } else {
                            z = true;
                            flatCheckBox.setChecked(true);
                            ((LineViewData) this.f$1).enabled = true;
                            baseChartCell.chartView.onCheckChanged();
                            if (baseChartCell.data.activeZoom > 0) {
                                ((LineViewData) baseChartView.lines.get(checkBoxHolder.position)).enabled = true;
                                baseChartView.onCheckChanged();
                            }
                        }
                    }
                }
                return z;
            default:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.f$0;
                PeerStoriesView$$ExternalSyntheticLambda3 peerStoriesView$$ExternalSyntheticLambda3 = anonymousClass1.reactionsTooltipRunnable;
                if (peerStoriesView$$ExternalSyntheticLambda3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(peerStoriesView$$ExternalSyntheticLambda3);
                    anonymousClass1.reactionsTooltipRunnable = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                HintView2 hintView2 = anonymousClass1.reactionsLongpressTooltip;
                if (hintView2 != null) {
                    hintView2.hide(true);
                }
                ReactionsContainerLayout reactionsContainerLayout = anonymousClass1.likesReactionLayout;
                if (reactionsContainerLayout == null) {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, anonymousClass1.currentAccount, anonymousClass1.getContext(), lastFragment, new PeerStoriesView.AnonymousClass18(4, anonymousClass1.resourcesProvider));
                    anonymousClass1.likesReactionLayout = reactionsContainerLayout2;
                    reactionsContainerLayout2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    anonymousClass1.addView(anonymousClass1.likesReactionLayout, anonymousClass1.getChildCount() - 1, LayoutHelper.createFrame(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    anonymousClass1.likesReactionLayout.setVisibility(8);
                    anonymousClass1.likesReactionLayout.setDelegate(new PeerStoriesView.AnonymousClass40(anonymousClass1));
                    anonymousClass1.likesReactionLayout.setMessage(null, null, true);
                } else {
                    anonymousClass1.bringChildToFront(reactionsContainerLayout);
                    anonymousClass1.likesReactionLayout.reset();
                }
                anonymousClass1.likesReactionLayout.setFragment(LaunchActivity.getLastFragment());
                ((StoryViewer) this.f$1).windowView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                anonymousClass1.showLikesReaction(true);
                return true;
        }
    }
}
