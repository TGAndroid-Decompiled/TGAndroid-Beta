package org.telegram.ui.iv;

import android.app.Activity;
import android.content.Context;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.Util;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda28;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesStorage;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.web.BotWebViewContainer;

public final class RichEditor$$ExternalSyntheticLambda48 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public RichEditor$$ExternalSyntheticLambda48(long j, ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$0 = textViewButtonsArr;
    }

    @Override
    public final void run() {
        i = 0;
        int i = 0;
        long j = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                final RichEditor richEditor = (RichEditor) obj;
                AlertsCreator.createScheduleDatePickerDialog(richEditor.getParentActivity(), j, new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i2, int i3) {
                        RichEditor richEditor2 = RichEditor.this;
                        richEditor2.sendMessage(i2, i3, z);
                        MessageSendPreview messageSendPreview = richEditor2.messageSendPreview;
                        if (messageSendPreview != null) {
                            messageSendPreview.dismissInstant();
                            richEditor2.messageSendPreview = null;
                        }
                    }
                }, richEditor.getResourceProvider());
                break;
            case 1:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i2 = Util.SDK_INT;
                DefaultAnalyticsCollector defaultAnalyticsCollector = ExoPlayerImpl.this.analyticsCollector;
                AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = defaultAnalyticsCollector.generateReadingMediaPeriodEventTime();
                defaultAnalyticsCollector.sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1010, new LivePlayer$$ExternalSyntheticLambda8(eventTimeGenerateReadingMediaPeriodEventTime, j));
                break;
            case 2:
                AndroidUtilities.lambda$showProxyAlert$17(j, (ButtonSpan.TextViewButtons[]) obj);
                break;
            case 3:
                ((LocationController) obj).lambda$removeSharingLocation$21(j);
                break;
            case 4:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j);
                break;
            case 5:
                ProxyRotationController.lambda$new$0((SharedConfig.ProxyInfo) obj, j);
                break;
            case 6:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j);
                break;
            case 7:
                ((VideoCapturerDevice) obj).lambda$init$3(j);
                break;
            case 8:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j);
                break;
            case 9:
                SelectorBottomSheet selectorBottomSheet = (SelectorBottomSheet) obj;
                HashSet<Long> hashSet = selectorBottomSheet.selectedIds;
                hashSet.remove(Long.valueOf(j));
                selectorBottomSheet.searchField.updateSpans(true, hashSet, new SelectorBottomSheet$$ExternalSyntheticLambda0(selectorBottomSheet, 4), null);
                selectorBottomSheet.updateList$1(true, false);
                break;
            case 10:
                BulletinFactory.of((StarsIntroActivity) obj).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j)).show(true);
                break;
            case 11:
                BulletinFactory.of((StatisticActivity) obj).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j)).show(true);
                break;
            case 12:
                ((DialogStoriesCell) obj).lambda$openStoryForCell$3(j);
                break;
            case 13:
                PeerStoriesView.AnonymousClass20 anonymousClass20 = (PeerStoriesView.AnonymousClass20) obj;
                anonymousClass20.getClass();
                PeerStoriesView.this.afterMessageSend(j <= 0);
                break;
            case 14:
                AndroidUtilities.runOnUIThread((PeerStoriesView$8$$ExternalSyntheticLambda28) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
                break;
            case 15:
                BaseFragment baseFragmentCreate = StatisticActivity.create(MessagesController.getInstance(((StoriesController) obj).currentAccount).getChat(Long.valueOf(-j)));
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    StoryRecorder storyRecorder = StoryRecorder.instance;
                    if (storyRecorder != null && storyRecorder.isShown) {
                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                        bottomSheetParams.transitionFromLeft = true;
                        lastFragment.showAsSheet(baseFragmentCreate, bottomSheetParams);
                    } else {
                        lastFragment.presentFragment(baseFragmentCreate);
                    }
                }
                break;
            case 16:
                MessagesStorage messagesStorage = ((StoriesStorage) obj).storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j).stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            case 17:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj;
                Context context = page.getContext();
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                AlertsCreator.createStoriesAlbumEnterNameForCreate(context, storyPrivacyBottomSheet.attachedFragment, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider, new LivePlayer$$ExternalSyntheticLambda8(page, j));
                break;
            case 18:
                StoryRecorder storyRecorder2 = (StoryRecorder) obj;
                StoryRecorder.SourceView sourceView = storyRecorder2.fromSourceView;
                if (sourceView != null) {
                    sourceView.show(true);
                    storyRecorder2.fromSourceView = null;
                }
                StoryRecorder.ClosingViewProvider closingViewProvider = storyRecorder2.closingSourceProvider;
                StoryRecorder.SourceView view = closingViewProvider != null ? closingViewProvider.getView(j) : null;
                storyRecorder2.fromSourceView = view;
                if (view != null) {
                    storyRecorder2.openType = view.type;
                    storyRecorder2.containerView.updateBackground();
                    StoryRecorder.AnonymousClass3 anonymousClass3 = storyRecorder2.previewContainer;
                    int i3 = storyRecorder2.openType;
                    if (i3 != 1 && i3 != 0) {
                        i = -14737633;
                    }
                    anonymousClass3.setBackgroundColor(i);
                    storyRecorder2.fromRect.set(storyRecorder2.fromSourceView.screenRect);
                    StoryRecorder.SourceView sourceView2 = storyRecorder2.fromSourceView;
                    storyRecorder2.fromRounding = sourceView2.rounding;
                    sourceView2.hide();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                storyRecorder2.closingSourceProvider = null;
                Activity activity = storyRecorder2.activity;
                if (!(activity instanceof LaunchActivity)) {
                    storyRecorder2.close(true);
                } else {
                    ((LaunchActivity) activity).drawerLayoutContainer.post(new StoryRecorder$$ExternalSyntheticLambda5(storyRecorder2, 6));
                }
                break;
            case 19:
                TimelineView.TimelineDelegate timelineDelegate = ((TimelineView) obj).delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onProgressChange(j, false);
                }
                break;
            case 20:
                ((CommunitySheet) obj).lambda$onLongClickCommunity$5(j);
                break;
            case 21:
                CommunityUtils.PendingRequests pendingRequests = (CommunityUtils.PendingRequests) obj;
                pendingRequests.doCommitRunnable = null;
                pendingRequests.hiddenJoinRequests.remove(j);
                pendingRequests.totalCount++;
                pendingRequests.calcUnreadPendingRequests();
                CommunityUtils.PendingRequests.Delegate delegate = pendingRequests.delegate;
                if (delegate != null) {
                    delegate.updateAdapter();
                }
                break;
            case 22:
                ((ChatAttachAlertRichLayout) obj).lambda$showSendPreview$20(j);
                break;
            default:
                BotWebViewContainer.AnonymousClass6 anonymousClass6 = (BotWebViewContainer.AnonymousClass6) obj;
                anonymousClass6.getClass();
                anonymousClass6.presentFragment(ChatActivity.of(j));
                break;
        }
    }

    public RichEditor$$ExternalSyntheticLambda48(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }
}
