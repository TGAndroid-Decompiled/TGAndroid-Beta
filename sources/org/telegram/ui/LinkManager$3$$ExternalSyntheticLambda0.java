package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.PhotoViewerWebView$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.PostsSearchContainer;
import org.telegram.ui.Components.PostsSearchContainer$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda29;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesStorage;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.community.CommunitySheet;

public final class LinkManager$3$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public LinkManager$3$$ExternalSyntheticLambda0(long j, ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        this.$r8$classId = 1;
        this.f$1 = j;
        this.f$0 = textViewButtonsArr;
    }

    @Override
    public final void run() {
        Theme.ResourcesProvider darkThemeResourceProvider = null;
        i = 0;
        int i = 0;
        long j = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LinkManager.AnonymousClass3 anonymousClass3 = (LinkManager.AnonymousClass3) obj;
                anonymousClass3.getClass();
                anonymousClass3.presentFragment(ChatActivity.of(j));
                break;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$17(j, (ButtonSpan.TextViewButtons[]) obj);
                break;
            case 2:
                ((LocationController) obj).lambda$removeSharingLocation$21(j);
                break;
            case 3:
                ((NotificationsController) obj).lambda$processIgnoreStories$19(j);
                break;
            case 4:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$6(j);
                break;
            case 5:
                ((VideoCapturerDevice) obj).lambda$init$3(j);
                break;
            case 6:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j);
                break;
            case 7:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) obj;
                dialogsSearchAdapter.getClass();
                try {
                    MessagesStorage.getInstance(dialogsSearchAdapter.currentAccount).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 8:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) obj;
                anonymousClass1.getClass();
                try {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = MessagesStorage.getInstance(anonymousClass1.currentAccount).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, j);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 9:
                ArticleViewer.Sheet sheet = (ArticleViewer.Sheet) obj;
                if (sheet != null) {
                    sheet.dismiss(true);
                }
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(new ChatActivity(FBool.m(j, "user_id")));
                }
                break;
            case 10:
                CacheControlActivity cacheControlActivity = (CacheControlActivity) obj;
                cacheControlActivity.getClass();
                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(cacheControlActivity).createSimpleBulletinWithIconSize(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j)));
                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                bulletinCreateSimpleBulletinWithIconSize.show();
                break;
            case 11:
                ChatActivityEnterView.AnonymousClass77 anonymousClass77 = (ChatActivityEnterView.AnonymousClass77) obj;
                anonymousClass77.getClass();
                anonymousClass77.presentFragment(ChatActivity.of(j));
                break;
            case 12:
                PhotoViewerWebView photoViewerWebView = (PhotoViewerWebView) obj;
                photoViewerWebView.getClass();
                photoViewerWebView.runJsCode("seekTo(" + Math.round(j / 1000.0f) + ", true);");
                AndroidUtilities.runOnUIThread(new PhotoViewerWebView$$ExternalSyntheticLambda2(photoViewerWebView, 1), 100L);
                break;
            case 13:
                PostsSearchContainer postsSearchContainer = (PostsSearchContainer) obj;
                postsSearchContainer.getClass();
                Activity activity = AndroidUtilities.getActivity();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (PhotoViewer.getInstance().isVisible() || (safeLastFragment2 != null && safeLastFragment2.hasShownSheet())) {
                    darkThemeResourceProvider = new DarkThemeResourceProvider();
                } else if (safeLastFragment2 != null) {
                    darkThemeResourceProvider = safeLastFragment2.getResourceProvider();
                }
                new StarsIntroActivity.StarsNeededSheet(activity, darkThemeResourceProvider, this.f$1, 15, "", new PostsSearchContainer$$ExternalSyntheticLambda5(postsSearchContainer, 1), 0L).show();
                break;
            case 14:
                SelectorBottomSheet selectorBottomSheet = (SelectorBottomSheet) obj;
                HashSet hashSet = selectorBottomSheet.selectedIds;
                hashSet.remove(Long.valueOf(j));
                selectorBottomSheet.searchField.updateSpans(true, hashSet, new SelectorBottomSheet$$ExternalSyntheticLambda0(selectorBottomSheet, 4), null);
                selectorBottomSheet.updateList$1(true, false);
                break;
            case 15:
                DialogsActivity dialogsActivity = (DialogsActivity) obj;
                dialogsActivity.setDialogsListFrozen(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(j, 0L));
                dialogsActivity.delegate.didSelectDialogs(dialogsActivity, arrayList, null, false, dialogsActivity.notify, dialogsActivity.scheduleDate, dialogsActivity.scheduleRepeatPeriod, null);
                break;
            case 16:
                ((GroupCallActivity) obj).inviteUserToCall(j, false);
                break;
            case 17:
                MessageAuthorView messageAuthorView = (MessageAuthorView) obj;
                messageAuthorView.getClass();
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.closeMenu(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j);
                if (j == chatActivity.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                chatActivity.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 18:
                ((ArticleViewer$$ExternalSyntheticLambda21) obj).run(Long.valueOf(j));
                break;
            case 19:
                BulletinFactory.of((StarsIntroActivity) obj).createSimpleBulletin(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j), R.raw.stars_topup).show(true);
                break;
            case 20:
                BulletinFactory.of((StatisticActivity) obj).createSimpleBulletin(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j), R.raw.stars_topup).show(true);
                break;
            case 21:
                ((DialogStoriesCell) obj).storiesController.setLoading(j, false);
                break;
            case 22:
                PeerStoriesView.AnonymousClass20 anonymousClass20 = (PeerStoriesView.AnonymousClass20) obj;
                anonymousClass20.getClass();
                PeerStoriesView.this.afterMessageSend(j <= 0);
                break;
            case 23:
                AndroidUtilities.runOnUIThread((PeerStoriesView$8$$ExternalSyntheticLambda29) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
                break;
            case 24:
                BaseFragment baseFragmentCreate = StatisticActivity.create(MessagesController.getInstance(((StoriesController) obj).currentAccount).getChat(Long.valueOf(-j)), true);
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
            case 25:
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
            case 26:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj;
                Context context = page.getContext();
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                AlertsCreator.createStoriesAlbumEnterNameForCreate(context, storyPrivacyBottomSheet.attachedFragment, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider, new LaunchActivity$$ExternalSyntheticLambda112(page, j, 10));
                break;
            case 27:
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
                    ThemePreviewActivity.AnonymousClass14 anonymousClass14 = storyRecorder2.previewContainer;
                    int i2 = storyRecorder2.openType;
                    if (i2 != 1 && i2 != 0) {
                        i = -14737633;
                    }
                    anonymousClass14.setBackgroundColor(i);
                    storyRecorder2.fromRect.set(storyRecorder2.fromSourceView.screenRect);
                    StoryRecorder.SourceView sourceView2 = storyRecorder2.fromSourceView;
                    storyRecorder2.fromRounding = sourceView2.rounding;
                    sourceView2.hide();
                    if (SharedConfig.getDevicePerformanceClass() > 1) {
                        LiteMode.isEnabled(360928);
                    }
                }
                storyRecorder2.closingSourceProvider = null;
                Activity activity2 = storyRecorder2.activity;
                if (!(activity2 instanceof LaunchActivity)) {
                    storyRecorder2.close(true);
                } else {
                    ((LaunchActivity) activity2).drawerLayoutContainer.post(new StoryRecorder$$ExternalSyntheticLambda7(storyRecorder2, 5));
                }
                break;
            case 28:
                TimelineView.TimelineDelegate timelineDelegate = ((TimelineView) obj).delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onProgressChange(j, false);
                }
                break;
            default:
                ((CommunitySheet) obj).lambda$onLongClickCommunity$5(j);
                break;
        }
    }

    public LinkManager$3$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }
}
