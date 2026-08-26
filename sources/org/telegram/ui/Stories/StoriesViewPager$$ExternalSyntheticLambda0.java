package org.telegram.ui.Stories;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$25$$ExternalSyntheticLambda0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.SelectStoriesBottomSheet;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.QRScanner;
import org.telegram.ui.Stories.recorder.RecordControl;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacySelector;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda113;
import org.telegram.ui.Stories.recorder.StoryRecorder$13$$ExternalSyntheticLambda0;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class StoriesViewPager$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, Utilities.Callback5, BaseFragment.PreviewDelegate, RecyclerListView.OnItemLongClickListener, AlertsCreator.ScheduleDatePickerDelegate, CountdownTimer.Callback, FactorAnimator.Target, PaymentFormActivity.PaymentFormCallback, BaseChartView.DateSelectionListener, StoriesListPlaceProvider.LoadNextInterface, StoryViewer.HolderClip, SpoilersClickDetector.OnSpoilerClickedListener, OnApplyWindowInsetsListener, Utilities.Callback2Return, RecyclerAnimationScrollHelper.ScrollListener, UndoStore.UndoStoreDelegate, CameraController.VideoTakeCallback {
    public final int $r8$classId;
    public final Object f$0;

    public StoriesViewPager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public void clip(Canvas canvas, RectF rectF, float f, boolean z) {
        if (z) {
            return;
        }
        Path path = (Path) this.f$0;
        path.rewind();
        float fPow = (float) Math.pow(f, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * fPow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * fPow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        MessageSuggestionOfferSheet messageSuggestionOfferSheet = (MessageSuggestionOfferSheet) this.f$0;
        if (!z) {
            messageSuggestionOfferSheet.getClass();
            return;
        }
        long j = i;
        if (messageSuggestionOfferSheet.selectedTime != j) {
            messageSuggestionOfferSheet.selectedTime = j;
            messageSuggestionOfferSheet.publishingTimeField.setText(MessageSuggestionOfferSheet.formatDateTime(j));
        }
        messageSuggestionOfferSheet.checkButtonEnabled$1(true);
    }

    @Override
    public void historyChanged() {
        StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this.f$0;
        boolean zCanUndo = anonymousClass24.undoStore.canUndo();
        ImageView imageView = anonymousClass24.undoButton;
        imageView.animate().cancel();
        imageView.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(zCanUndo);
        TextView textView = anonymousClass24.undoAllButton;
        textView.animate().cancel();
        textView.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(zCanUndo);
    }

    @Override
    public void loadNext(boolean z) {
        SelfStoryViewsPage.ViewsModel viewsModel = (SelfStoryViewsPage.ViewsModel) this.f$0;
        if (viewsModel != null) {
            viewsModel.loadNext();
        }
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        StoryViewer storyViewer = (StoryViewer) this.f$0;
        storyViewer.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) storyViewer.containerView.getLayoutParams();
        marginLayoutParams.topMargin = storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE ? 0 : windowInsetsCompat.getSystemWindowInsetTop();
        marginLayoutParams.bottomMargin = storyViewer.ATTACHED_FRAGMENT_IS_EDGE_TO_EDGE ? windowInsetsCompat.mImpl.getInsets(2).bottom : windowInsetsCompat.getSystemWindowInsetBottom();
        marginLayoutParams.leftMargin = defaultWindowInsets.left;
        marginLayoutParams.rightMargin = defaultWindowInsets.right;
        StoryViewer.AnonymousClass2 anonymousClass2 = storyViewer.windowView;
        if (anonymousClass2 != null) {
            anonymousClass2.requestLayout();
        }
        StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer.containerView;
        if (anonymousClass3 != null) {
            anonymousClass3.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ProxyListActivity proxyListActivity = ProxyListActivity.this;
                ArrayList arrayList = proxyListActivity.selectedItems;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
                }
                if (SharedConfig.currentProxy == null) {
                    proxyListActivity.useProxyForCalls = false;
                    proxyListActivity.useProxySettings = false;
                }
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i3 = NotificationCenter.proxySettingsChanged;
                globalInstance.removeObserver(proxyListActivity, i3);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i3, new Object[0]);
                NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i3);
                proxyListActivity.updateRows$7(true);
                ProxyListActivity.ListAdapter listAdapter = proxyListActivity.listAdapter;
                if (listAdapter != null) {
                    if (SharedConfig.currentProxy == null) {
                        listAdapter.mObservable.notifyItemRangeChanged(0, 1, 0);
                        ProxyListActivity.ListAdapter listAdapter2 = proxyListActivity.listAdapter;
                        listAdapter2.mObservable.notifyItemRangeChanged(proxyListActivity.callsRow, 1, 0);
                    }
                    proxyListActivity.listAdapter.clearSelected();
                }
                break;
            case 6:
                ((StarGiftSheet) this.f$0).getClass();
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(6, null);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    safeLastFragment.showAsSheet(twoStepVerificationSetupActivity, bottomSheetParams);
                    break;
                }
                break;
            case 23:
                CaptionStory captionStory = (CaptionStory) this.f$0;
                captionStory.getClass();
                StoryRecorder storyRecorder = StoryRecorder.this;
                StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.setupRound(null, null, true);
                }
                StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                if (anonymousClass24 != null) {
                    anonymousClass24.deleteRound();
                }
                StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                if (anonymousClass8 != null) {
                    anonymousClass8.setHasRoundVideo(false);
                }
                StoryEntry storyEntry = storyRecorder.outputEntry;
                if (storyEntry != null) {
                    File file = storyEntry.round;
                    if (file != null) {
                        try {
                            file.delete();
                            break;
                        } catch (Exception unused) {
                        }
                        storyRecorder.outputEntry.round = null;
                    }
                    if (storyRecorder.outputEntry.roundThumb != null) {
                        try {
                            new File(storyRecorder.outputEntry.roundThumb).delete();
                            break;
                        } catch (Exception unused2) {
                        }
                        storyRecorder.outputEntry.roundThumb = null;
                    }
                }
                break;
            default:
                PaintView.this.emojiView.clearRecentEmoji();
                break;
        }
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        View view = ((StarGiftUniqueActionLayout) this.f$0).view;
        if (view instanceof ChatActionCell) {
            ((ChatActionCell) view).invalidateOutbounds();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j) {
        StoryRecorder.AnonymousClass13 anonymousClass13 = (StoryRecorder.AnonymousClass13) this.f$0;
        StoryRecorder storyRecorder = StoryRecorder.this;
        RecordControl recordControl = storyRecorder.recordControl;
        if (recordControl != null) {
            recordControl.stopRecordingLoading(true);
        }
        if (storyRecorder.useDisplayFlashlight()) {
            storyRecorder.flashViews.flashOut();
        }
        if (storyRecorder.outputFile == null || storyRecorder.cameraView == null) {
            return;
        }
        storyRecorder.takingVideo = false;
        storyRecorder.stoppingTakingVideo = false;
        QRScanner qRScanner = storyRecorder.qrScanner;
        if (qRScanner != null) {
            qRScanner.setPaused(false);
        }
        if (j <= 800) {
            storyRecorder.animateRecording(false, true);
            storyRecorder.setAwakeLock(false);
            storyRecorder.videoTimerView.setRecording(false, true);
            RecordControl recordControl2 = storyRecorder.recordControl;
            if (recordControl2 != null) {
                recordControl2.stopRecordingLoading(true);
            }
            try {
                storyRecorder.outputFile.delete();
                storyRecorder.outputFile = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
            }
            return;
        }
        storyRecorder.showVideoTimer(false, true);
        File file = storyRecorder.outputFile;
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.fromCamera = true;
        storyEntry.file = file;
        storyEntry.fileDeletable = true;
        storyEntry.orientation = 0;
        storyEntry.invert = 0;
        storyEntry.isVideo = true;
        storyEntry.duration = j;
        storyEntry.thumbPath = str;
        storyEntry.left = 0.0f;
        storyEntry.right = Math.min(1.0f, 59500.0f / j);
        storyEntry.botId = storyRecorder.botId;
        storyEntry.botLang = storyRecorder.botLang;
        storyEntry.setupMultipleStoriesSelector();
        storyRecorder.animateRecording(false, true);
        storyRecorder.setAwakeLock(false);
        storyRecorder.videoTimerView.setRecording(false, true);
        RecordControl recordControl3 = storyRecorder.recordControl;
        if (recordControl3 != null) {
            recordControl3.stopRecordingLoading(true);
        }
        boolean zHasLayout = storyRecorder.collageLayoutView.hasLayout();
        int i = storyRecorder.currentAccount;
        if (!zHasLayout) {
            storyRecorder.outputEntry = storyEntry;
            StoryPrivacySelector.applySaved(i, storyEntry);
            storyRecorder.fromGallery = false;
            int videoWidth = storyRecorder.cameraView.getVideoWidth();
            int videoHeight = storyRecorder.cameraView.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                storyEntry2.width = videoWidth;
                storyEntry2.height = videoHeight;
                storyEntry2.setupMatrix();
            }
            storyRecorder.navigateToPreviewWithPlayerAwait(0L, new StoryRecorder$13$$ExternalSyntheticLambda0(anonymousClass13, 3));
            return;
        }
        storyRecorder.outputFile = null;
        storyEntry.videoVolume = 1.0f;
        if (storyRecorder.collageLayoutView.push(storyEntry)) {
            StoryEntry storyEntryAsCollage = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
            storyRecorder.outputEntry = storyEntryAsCollage;
            StoryPrivacySelector.applySaved(i, storyEntryAsCollage);
            storyRecorder.fromGallery = false;
            int videoWidth2 = storyRecorder.cameraView.getVideoWidth();
            int videoHeight2 = storyRecorder.cameraView.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                StoryEntry storyEntry3 = storyRecorder.outputEntry;
                storyEntry3.width = videoWidth2;
                storyEntry3.height = videoHeight2;
                storyEntry3.setupMatrix();
            }
        }
        storyRecorder.updateActionBarButtons(true);
    }

    @Override
    public void onInvoiceStatusChanged(int i) {
        switch (this.$r8$classId) {
            case 10:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$0;
                if (i == 1) {
                    callback2.run(Boolean.TRUE, null);
                } else if (i != 3) {
                    callback2.run(Boolean.FALSE, null);
                }
                break;
            case 11:
                OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = (OAuthSheet$$ExternalSyntheticLambda18) this.f$0;
                if (i == 1) {
                    oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.TRUE, null);
                } else if (i != 3) {
                    oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.FALSE, null);
                }
                break;
            default:
                JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3 = (JoinGroupAlert$$ExternalSyntheticLambda3) this.f$0;
                if (i == 1) {
                    joinGroupAlert$$ExternalSyntheticLambda3.run(Boolean.TRUE, null);
                } else if (i != 3) {
                    joinGroupAlert$$ExternalSyntheticLambda3.run(Boolean.FALSE, null);
                }
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, final View view) {
        boolean z;
        boolean zM;
        CombinedDrawable combinedDrawable;
        ItemOptions itemOptions;
        Drawable drawable;
        switch (this.$r8$classId) {
            case 4:
                return ((SelectStoriesBottomSheet) this.f$0).onItemClick(i, view);
            case 14:
                final StatisticActivity statisticActivity = (StatisticActivity) this.f$0;
                StatisticActivity.Adapter adapter = statisticActivity.adapter;
                int i2 = adapter.recentPostsStartRow;
                if (i < i2 || i > adapter.recentPostsEndRow) {
                    int i3 = adapter.topAdminsStartRow;
                    AlertDialog[] alertDialogArr = statisticActivity.progressDialog;
                    if (i < i3 || i > adapter.topAdminsEndRow) {
                        int i4 = adapter.topMembersStartRow;
                        if (i < i4 || i > adapter.topMembersEndRow) {
                            int i5 = adapter.topInviterStartRow;
                            if (i < i5 || i > adapter.topInviterEndRow) {
                                return false;
                            }
                            ((StatisticActivity.MemberData) statisticActivity.topInviters.get(i - i5)).onLongClick(statisticActivity.chat, statisticActivity, alertDialogArr, true);
                        } else {
                            ((StatisticActivity.MemberData) statisticActivity.topMembersVisible.get(i - i4)).onLongClick(statisticActivity.chat, statisticActivity, alertDialogArr, true);
                        }
                    } else {
                        ((StatisticActivity.MemberData) statisticActivity.topAdmins.get(i - i3)).onLongClick(statisticActivity.chat, statisticActivity, alertDialogArr, true);
                    }
                } else {
                    final MessageObject messageObject = ((StatisticActivity.RecentPostInfo) statisticActivity.recentAllSortedDataLoaded.get(i - i2)).message;
                    if (messageObject.isStory()) {
                        return false;
                    }
                    ItemOptions itemOptions2 = new ItemOptions(statisticActivity, view, false, true);
                    final int i6 = 0;
                    itemOptions2.add(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    StatisticActivity statisticActivity2 = statisticActivity;
                                    statisticActivity2.getClass();
                                    statisticActivity2.presentFragment(new MessageStatisticActivity(messageObject));
                                    break;
                                default:
                                    StatisticActivity statisticActivity3 = statisticActivity;
                                    statisticActivity3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", statisticActivity3.chatId);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    statisticActivity3.presentFragment(new ChatActivity(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    final int i7 = 1;
                    itemOptions2.add(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    StatisticActivity statisticActivity2 = statisticActivity;
                                    statisticActivity2.getClass();
                                    statisticActivity2.presentFragment(new MessageStatisticActivity(messageObject));
                                    break;
                                default:
                                    StatisticActivity statisticActivity3 = statisticActivity;
                                    statisticActivity3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", statisticActivity3.chatId);
                                    bundle.putInt("message_id", messageObject.getId());
                                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                    statisticActivity3.presentFragment(new ChatActivity(bundle), false);
                                    break;
                            }
                        }
                    }, false);
                    itemOptions2.setScrimViewBackground(statisticActivity.recyclerListView.getClipBackground(view, false));
                    itemOptions2.show();
                }
                return true;
            case 16:
                final DialogsActivity.AnonymousClass25 anonymousClass25 = (DialogsActivity.AnonymousClass25) this.f$0;
                if (anonymousClass25.collapsedProgress == 0.0f && anonymousClass25.overscrollProgress == 0.0f) {
                    final long j = ((DialogStoriesCell.StoryCell) view).dialogId;
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    MediaDataController.getInstance(((BaseFragment) dialogsActivity).currentAccount).loadHints(true);
                    ItemOptions itemOptions3 = new ItemOptions(dialogsActivity, view, false, true);
                    itemOptions3.viewAdditionalOffsets.set(0, AndroidUtilities.dp(8.0f), 0, 0);
                    itemOptions3.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), dialogsActivity.getThemedColor(Theme.key_windowBackgroundWhite)));
                    itemOptions3.translate(0.0f, AndroidUtilities.dp(8.0f));
                    dialogsActivity.filterOptions = itemOptions3;
                    if (!UserObject.isService(j)) {
                        try {
                            view.performHapticFeedback(0);
                            break;
                        } catch (Exception unused) {
                        }
                        if (j != UserConfig.getInstance(((BaseFragment) dialogsActivity).currentAccount).getClientUserId()) {
                            final TLRPC.User user = dialogsActivity.getMessagesController().getUser(Long.valueOf(j));
                            TLRPC.Chat chat = dialogsActivity.getMessagesController().getChat(Long.valueOf(-j));
                            final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, 0L);
                            int i8 = ((BaseFragment) dialogsActivity).currentAccount;
                            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i8);
                            z = false;
                            if (notificationsSettings.contains("stories_" + j)) {
                                zM = NotificationsController$$ExternalSyntheticOutline0.m("stories_", j, notificationsSettings, true);
                            } else {
                                zM = notificationsSettings.contains("EnableAllStories") ? notificationsSettings.getBoolean("EnableAllStories", true) : NotificationsCustomSettingsActivity.isTop5Peer(i8, j);
                            }
                            boolean z2 = zM;
                            boolean zPremiumFeaturesBlocked = MessagesController.getInstance(((BaseFragment) dialogsActivity).currentAccount).premiumFeaturesBlocked();
                            boolean zIsPremium = UserConfig.getInstance(((BaseFragment) dialogsActivity).currentAccount).isPremium();
                            boolean zHasUnreadStories = MessagesController.getInstance(((BaseFragment) dialogsActivity).currentAccount).getStoriesController().hasUnreadStories(j);
                            boolean zHasLiveStory = MessagesController.getInstance(((BaseFragment) dialogsActivity).currentAccount).getStoriesController().hasLiveStory(j);
                            if (zPremiumFeaturesBlocked || j <= 0 || zIsPremium || (drawable = anonymousClass25.getContext().getDrawable(R.drawable.msg_gallery_locked2)) == null) {
                                chat = chat;
                                combinedDrawable = null;
                            } else {
                                Drawable drawable2 = anonymousClass25.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                if (drawable2 != null) {
                                    drawable2.setColorFilter(new PorterDuffColorFilter(dialogsActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.MULTIPLY));
                                }
                                drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                combinedDrawable = new CombinedDrawable(drawable2, drawable);
                            }
                            CombinedDrawable combinedDrawable2 = combinedDrawable;
                            if (j < 0 && dialogsActivity.getMessagesController().getStoriesController().canPostStories(j)) {
                                final int i9 = 4;
                                dialogsActivity.filterOptions.add(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                                break;
                                            case 1:
                                                DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                                anonymousClass26.getClass();
                                                DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                                break;
                                            case 2:
                                                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                                break;
                                            case 3:
                                                DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                                long j2 = j;
                                                mediaDataController.removePeer(j2);
                                                dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                                break;
                                            case 4:
                                                DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                                break;
                                            case 5:
                                                DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                                anonymousClass27.getClass();
                                                DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                                break;
                                            default:
                                                DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                                anonymousClass28.getClass();
                                                DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                                break;
                                        }
                                    }
                                });
                            }
                            boolean z3 = (user == null || user.contact || !MediaDataController.getInstance(((BaseFragment) dialogsActivity).currentAccount).containsTopPeer(j)) ? false : true;
                            ItemOptions itemOptions4 = dialogsActivity.filterOptions;
                            final int i10 = 5;
                            itemOptions4.addIf(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                            break;
                                        case 1:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            anonymousClass26.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        case 2:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                            break;
                                        case 3:
                                            DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                            long j2 = j;
                                            mediaDataController.removePeer(j2);
                                            dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                            break;
                                        case 4:
                                            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                            break;
                                        case 5:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            anonymousClass27.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                            anonymousClass28.getClass();
                                            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                            break;
                                    }
                                }
                            }, j > 0);
                            final int i11 = 6;
                            itemOptions4.addIf(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                            break;
                                        case 1:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            anonymousClass26.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        case 2:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                            break;
                                        case 3:
                                            DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                            long j2 = j;
                                            mediaDataController.removePeer(j2);
                                            dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                            break;
                                        case 4:
                                            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                            break;
                                        case 5:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            anonymousClass27.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                            anonymousClass28.getClass();
                                            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                            break;
                                    }
                                }
                            }, j > 0);
                            final int i12 = 1;
                            itemOptions4.addIf(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                            break;
                                        case 1:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            anonymousClass26.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        case 2:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                            break;
                                        case 3:
                                            DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                            long j2 = j;
                                            mediaDataController.removePeer(j2);
                                            dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                            break;
                                        case 4:
                                            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                            break;
                                        case 5:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            anonymousClass27.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                            anonymousClass28.getClass();
                                            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                            break;
                                    }
                                }
                            }, j < 0);
                            final int i13 = 0;
                            itemOptions4.addIf(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() {
                                @Override
                                public final void run() {
                                    String strTrim;
                                    TLRPC.User user2 = user;
                                    long j2 = j;
                                    String str = sharedPrefKey;
                                    DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                    switch (i13) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            MessagesController.getNotificationsSettings(((BaseFragment) dialogsActivity2).currentAccount).edit().putBoolean("stories_" + str, false).apply();
                                            dialogsActivity2.getNotificationsController().updateServerNotificationsSettings(j2, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf = strTrim.indexOf(" ");
                                            if (iIndexOf > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf);
                                            }
                                            BulletinFactory.of(dialogsActivity2).createUsersBulletin(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim)), null, null).show();
                                            break;
                                        default:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            MessagesController.getNotificationsSettings(((BaseFragment) dialogsActivity3).currentAccount).edit().putBoolean("stories_" + str, true).apply();
                                            dialogsActivity3.getNotificationsController().updateServerNotificationsSettings(j2, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf2 = strTrim.indexOf(" ");
                                            if (iIndexOf2 > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf2);
                                            }
                                            BulletinFactory.of(dialogsActivity3).createUsersBulletin(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim)), null, null).show();
                                            break;
                                    }
                                }
                            }, z2 && j > 0);
                            itemOptions4.makeMultiline();
                            final int i14 = 1;
                            itemOptions4.addIf(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() {
                                @Override
                                public final void run() {
                                    String strTrim;
                                    TLRPC.User user2 = user;
                                    long j2 = j;
                                    String str = sharedPrefKey;
                                    DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                    switch (i14) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            MessagesController.getNotificationsSettings(((BaseFragment) dialogsActivity2).currentAccount).edit().putBoolean("stories_" + str, false).apply();
                                            dialogsActivity2.getNotificationsController().updateServerNotificationsSettings(j2, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf = strTrim.indexOf(" ");
                                            if (iIndexOf > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf);
                                            }
                                            BulletinFactory.of(dialogsActivity2).createUsersBulletin(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim)), null, null).show();
                                            break;
                                        default:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            MessagesController.getNotificationsSettings(((BaseFragment) dialogsActivity3).currentAccount).edit().putBoolean("stories_" + str, true).apply();
                                            dialogsActivity3.getNotificationsController().updateServerNotificationsSettings(j2, 0L);
                                            strTrim = user2 != null ? user2.first_name.trim() : "";
                                            int iIndexOf2 = strTrim.indexOf(" ");
                                            if (iIndexOf2 > 0) {
                                                strTrim = strTrim.substring(0, iIndexOf2);
                                            }
                                            BulletinFactory.of(dialogsActivity3).createUsersBulletin(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim)), null, null).show();
                                            break;
                                    }
                                }
                            }, !z2 && j > 0);
                            itemOptions4.makeMultiline();
                            boolean z4 = !zPremiumFeaturesBlocked && j > 0 && zIsPremium && zHasUnreadStories && !zHasLiveStory;
                            int i15 = R.drawable.msg_stories_stealth2;
                            int i16 = R.string.ViewAnonymously;
                            final int i17 = 1;
                            itemOptions4.addIf(i15, LocaleController.getString(i16), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            Context context = anonymousClass26.getContext();
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            StealthModeAlert stealthModeAlert = new StealthModeAlert(context, 0.0f, 1, ((BaseFragment) dialogsActivity2).resourceProvider);
                                            stealthModeAlert.listener = new DialogsActivity$25$$ExternalSyntheticLambda14(anonymousClass26, view, 0);
                                            dialogsActivity2.showDialog(stealthModeAlert);
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().stealthMode;
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            View view2 = view;
                                            if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(((BaseFragment) dialogsActivity3).currentAccount).getCurrentTime() >= tL_storiesStealthMode.active_until_date) {
                                                StealthModeAlert stealthModeAlert2 = new StealthModeAlert(anonymousClass27.getContext(), 0.0f, 1, ((BaseFragment) dialogsActivity3).resourceProvider);
                                                stealthModeAlert2.listener = new DialogsActivity$25$$ExternalSyntheticLambda14(anonymousClass27, view2, 1);
                                                dialogsActivity3.showDialog(stealthModeAlert2);
                                            } else if (view2 instanceof DialogStoriesCell.StoryCell) {
                                                dialogsActivity3.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view2, false);
                                            }
                                            break;
                                    }
                                }
                            }, z4);
                            itemOptions4.makeMultiline();
                            boolean z5 = (zPremiumFeaturesBlocked || j <= 0 || zIsPremium || !zHasUnreadStories || zHasLiveStory) ? false : true;
                            String string = LocaleController.getString(i16);
                            final int i18 = 0;
                            Runnable runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            Context context = anonymousClass26.getContext();
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            StealthModeAlert stealthModeAlert = new StealthModeAlert(context, 0.0f, 1, ((BaseFragment) dialogsActivity2).resourceProvider);
                                            stealthModeAlert.listener = new DialogsActivity$25$$ExternalSyntheticLambda14(anonymousClass26, view, 0);
                                            dialogsActivity2.showDialog(stealthModeAlert);
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().stealthMode;
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            View view2 = view;
                                            if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(((BaseFragment) dialogsActivity3).currentAccount).getCurrentTime() >= tL_storiesStealthMode.active_until_date) {
                                                StealthModeAlert stealthModeAlert2 = new StealthModeAlert(anonymousClass27.getContext(), 0.0f, 1, ((BaseFragment) dialogsActivity3).resourceProvider);
                                                stealthModeAlert2.listener = new DialogsActivity$25$$ExternalSyntheticLambda14(anonymousClass27, view2, 1);
                                                dialogsActivity3.showDialog(stealthModeAlert2);
                                            } else if (view2 instanceof DialogStoriesCell.StoryCell) {
                                                dialogsActivity3.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view2, false);
                                            }
                                            break;
                                    }
                                }
                            };
                            if (z5) {
                                itemOptions4.add(i15, combinedDrawable2, string, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
                                itemOptions = itemOptions4;
                            } else {
                                itemOptions = itemOptions4;
                            }
                            itemOptions.makeMultiline();
                            final int i19 = 0;
                            itemOptions.addIf(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i19) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                            break;
                                        case 1:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            anonymousClass26.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        case 2:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                            break;
                                        case 3:
                                            DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                            long j2 = j;
                                            mediaDataController.removePeer(j2);
                                            dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                            break;
                                        case 4:
                                            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                            break;
                                        case 5:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            anonymousClass27.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                            anonymousClass28.getClass();
                                            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                            break;
                                    }
                                }
                            }, (z3 || dialogsActivity.isArchive()) ? false : true);
                            itemOptions.makeMultiline();
                            final int i20 = 2;
                            itemOptions.addIf(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i20) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                            break;
                                        case 1:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            anonymousClass26.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        case 2:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                            break;
                                        case 3:
                                            DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                            long j2 = j;
                                            mediaDataController.removePeer(j2);
                                            dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                            break;
                                        case 4:
                                            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                            break;
                                        case 5:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            anonymousClass27.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                            anonymousClass28.getClass();
                                            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                            break;
                                    }
                                }
                            }, !z3 && dialogsActivity.isArchive());
                            itemOptions.makeMultiline();
                            final int i21 = 3;
                            itemOptions.addIf(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i21) {
                                        case 0:
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity2, j, !dialogsActivity2.isArchive(), 0), 200L);
                                            break;
                                        case 1:
                                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                                            anonymousClass26.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        case 2:
                                            DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda182(dialogsActivity3, j, !dialogsActivity3.isArchive(), 0), 200L);
                                            break;
                                        case 3:
                                            DialogsActivity dialogsActivity4 = DialogsActivity.this;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(((BaseFragment) dialogsActivity4).currentAccount);
                                            long j2 = j;
                                            mediaDataController.removePeer(j2);
                                            dialogsActivity4.getMessagesController().getStoriesController().toggleHidden(j2, true, false);
                                            break;
                                        case 4:
                                            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
                                            break;
                                        case 5:
                                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                                            anonymousClass27.getClass();
                                            DialogsActivity.this.presentFragment(ChatActivity.of(j));
                                            break;
                                        default:
                                            DialogsActivity.AnonymousClass25 anonymousClass28 = anonymousClass25;
                                            anonymousClass28.getClass();
                                            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
                                            break;
                                    }
                                }
                            }, z3);
                        } else if (dialogsActivity.storiesEnabled) {
                            ItemOptions itemOptions5 = dialogsActivity.filterOptions;
                            int i22 = R.drawable.msg_stories_add;
                            String string2 = LocaleController.getString(R.string.AddStory);
                            int i23 = Theme.key_actionBarDefaultSubmenuItemIcon;
                            int i24 = Theme.key_actionBarDefaultSubmenuItem;
                            itemOptions5.add(i22, null, string2, i23, i24, new DialogsActivity$25$$ExternalSyntheticLambda0(anonymousClass25, 0));
                            dialogsActivity.filterOptions.add(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i23, i24, new DialogsActivity$25$$ExternalSyntheticLambda0(anonymousClass25, 1));
                            dialogsActivity.filterOptions.add(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i23, i24, new DialogsActivity$25$$ExternalSyntheticLambda0(anonymousClass25, 2));
                            z = false;
                        } else {
                            DialogsActivity.AnonymousClass25 anonymousClass26 = dialogsActivity.dialogStoriesCell;
                            if (anonymousClass26 != null) {
                                anonymousClass26.makePremiumHint();
                                HintView2 hintView2 = anonymousClass26.premiumHint;
                                if (hintView2 != null) {
                                    if (hintView2.shown) {
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    }
                                    anonymousClass26.premiumHint.show();
                                }
                            }
                        }
                        ItemOptions itemOptions6 = dialogsActivity.filterOptions;
                        itemOptions6.gravity = 3;
                        itemOptions6.translate(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                        itemOptions6.show();
                        return z;
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                return false;
            case 22:
                SharedMediaLayout.AnonymousClass12 anonymousClass12 = ((BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.f$0).this$0;
                if (SharedMediaLayout.this.isActionModeShowed || !(view instanceof SharedPhotoVideoCell2)) {
                    return false;
                }
                MessageObject messageObject2 = ((SharedPhotoVideoCell2) view).getMessageObject();
                if (anonymousClass12.isSelected(messageObject2)) {
                    anonymousClass12.unselect(messageObject2);
                } else {
                    anonymousClass12.select(messageObject2);
                }
                return true;
            default:
                GalleryListView galleryListView = (GalleryListView) this.f$0;
                if (i < 2) {
                    galleryListView.getClass();
                    return false;
                }
                if (galleryListView.onSelectListener == null || !(view instanceof GalleryListView.Cell)) {
                    return false;
                }
                int size = i - 2;
                if (galleryListView.containsDraftFolder) {
                    if (size == 0) {
                        return false;
                    }
                    size = i - 3;
                } else if (galleryListView.containsDrafts) {
                    ArrayList arrayList = galleryListView.drafts;
                    if (size >= 0 && size < arrayList.size()) {
                        return false;
                    }
                    size -= arrayList.size();
                }
                if (size < 0 || size >= galleryListView.photos.size()) {
                    return false;
                }
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                ArrayList arrayList2 = galleryListView.selectedPhotos;
                if (!arrayList2.isEmpty() || galleryListView.multipleOnClick) {
                    return false;
                }
                if (!arrayList2.contains(photoEntry)) {
                    if (arrayList2.size() + 1 > galleryListView.maxCount) {
                        int i25 = -galleryListView.shiftDp;
                        galleryListView.shiftDp = i25;
                        AndroidUtilities.shakeViewSpring(view, i25);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    } else {
                        arrayList2.add(photoEntry);
                    }
                    return true;
                }
                arrayList2.remove(photoEntry);
                AndroidUtilities.updateVisibleRows(galleryListView.listView);
                galleryListView.updateSelectButtonVisible();
                return true;
        }
    }

    @Override
    public void onScroll() {
        ((EmojiBottomSheet.EmojiListView) this.f$0).invalidate();
    }

    @Override
    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        StoryCaptionView.StoryCaptionTextView.TextState textState = (StoryCaptionView.StoryCaptionTextView.TextState) this.f$0;
        StoryCaptionView.StoryCaptionTextView storyCaptionTextView = StoryCaptionView.StoryCaptionTextView.this;
        if (storyCaptionTextView.isSpoilersRevealed) {
            return;
        }
        spoilerEffect.onRippleEndCallback = new StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2(textState, 2);
        float fSqrt = (float) Math.sqrt(Math.pow(storyCaptionTextView.getHeight(), 2.0d) + Math.pow(storyCaptionTextView.getWidth(), 2.0d));
        ArrayList arrayList = textState.spoilers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((SpoilerEffect) obj).startRipple(f, f2, fSqrt, false);
        }
    }

    @Override
    public void onTimerUpdate(long j) {
        ((StarGiftSheet.StarGiftDrawableIcon) this.f$0).updateCountdownText();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        SharedMediaLayout.AnonymousClass12 anonymousClass12 = (SharedMediaLayout.AnonymousClass12) this.f$0;
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        new BotPreviewsEditContainer.ChooseLanguageSheet(anonymousClass12.fragment, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass12, 10)).show();
        return Boolean.TRUE;
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 2:
                UItem uItem = (UItem) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ReportBottomSheet.Page page = (ReportBottomSheet.Page) this.f$0;
                page.getClass();
                if (uItem.viewType == 30) {
                    TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = page.sponsoredOption;
                    ReportBottomSheet reportBottomSheet = ReportBottomSheet.this;
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null) {
                        TLRPC.TL_sponsoredMessageReportOption tL_sponsoredMessageReportOption = tL_channels_sponsoredMessageReportResultChooseOption.options.get(uItem.id);
                        if (tL_sponsoredMessageReportOption != null) {
                            String str = tL_sponsoredMessageReportOption.text;
                            byte[] bArr = tL_sponsoredMessageReportOption.option;
                            int i = ReportBottomSheet.$r8$clinit;
                            reportBottomSheet.submitOption(str, bArr, null);
                        }
                    } else {
                        TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = page.option;
                        if (tL_reportResultChooseOption != null) {
                            TLRPC.TL_messageReportOption tL_messageReportOption = tL_reportResultChooseOption.options.get(uItem.id);
                            if (tL_messageReportOption != null) {
                                String str2 = tL_messageReportOption.text;
                                byte[] bArr2 = tL_messageReportOption.option;
                                int i2 = ReportBottomSheet.$r8$clinit;
                                reportBottomSheet.submitOption(str2, bArr2, null);
                            }
                        } else {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = page.commentOption;
                            if (tL_reportResultAddComment != null) {
                                byte[] bArr3 = tL_reportResultAddComment.option;
                                if (bArr3 != null) {
                                    int i3 = ReportBottomSheet.$r8$clinit;
                                    reportBottomSheet.submitOption(null, bArr3, null);
                                }
                            } else {
                                CharSequence charSequence = uItem.text;
                                int i4 = ReportBottomSheet.$r8$clinit;
                                reportBottomSheet.submitOption(charSequence, null, null);
                            }
                        }
                    }
                }
                break;
            case 9:
                StarsController starsController = (StarsController) this.f$0;
                int i5 = starsController.currentAccount;
                MessagesController.getInstance(i5).putUsers((ArrayList) obj4, true);
                MessagesController.getInstance(i5).putChats((ArrayList) obj5, true);
                starsController.giftsCacheLoaded = true;
                ArrayList arrayList = starsController.gifts;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                ArrayList arrayList2 = starsController.birthdaySortedGifts;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                Collections.sort(arrayList2, Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(11)), new TableModel$$ExternalSyntheticLambda1(12)));
                ArrayList arrayList3 = starsController.sortedGifts;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                Collections.sort(arrayList3, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(13)));
                starsController.giftsHash = ((Integer) obj2).intValue();
                starsController.giftsRemoteTime = ((Long) obj3).longValue();
                starsController.giftsLoading = false;
                NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
                starsController.loadStarGifts();
                break;
            case 13:
                UItem uItem2 = (UItem) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                StarsIntroActivity.StarsTransactionsLayout.Page page2 = (StarsIntroActivity.StarsTransactionsLayout.Page) this.f$0;
                page2.getClass();
                if (uItem2.object instanceof TL_stars.StarsTransaction) {
                    StarsIntroActivity.showTransactionSheet(page2.getContext(), false, 0L, page2.currentAccount, (TL_stars.StarsTransaction) uItem2.object, page2.resourcesProvider);
                }
                break;
            default:
                StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) this.f$0;
                UItem uItem3 = (UItem) obj;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i6 = uItem3.id;
                StoryEntry storyEntry = (StoryEntry) uItem3.object;
                anonymousClass11.showList(false, true);
                StoryRecorder storyRecorder = StoryRecorder.this;
                if (storyEntry != storyRecorder.outputEntry && !storyRecorder.switchingStory) {
                    storyRecorder.storiesSelector.setSelected(i6);
                    storyRecorder.switchingStory = true;
                    VoIPFragment$$ExternalSyntheticLambda9 voIPFragment$$ExternalSyntheticLambda9 = new VoIPFragment$$ExternalSyntheticLambda9(storyRecorder, i6, 3);
                    StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                    StoryEntry storyEntry2 = storyRecorder.outputEntry;
                    if (anonymousClass24 != null && storyEntry2 != null) {
                        if (!anonymousClass24.hasChanges()) {
                            voIPFragment$$ExternalSyntheticLambda9.run();
                        } else {
                            storyEntry2.clearPaint();
                            boolean zHasChanges = anonymousClass24.hasChanges();
                            boolean z = anonymousClass24.renderView.getPainting().hasBlur;
                            Utilities.searchQueue.postRunnable(new StoryRecorder$$ExternalSyntheticLambda113(storyRecorder, anonymousClass24, storyEntry2.resultWidth, storyEntry2.resultHeight, storyEntry2, z, zHasChanges, voIPFragment$$ExternalSyntheticLambda9, 0));
                        }
                    } else {
                        voIPFragment$$ExternalSyntheticLambda9.run();
                    }
                    break;
                }
                break;
        }
    }
}
