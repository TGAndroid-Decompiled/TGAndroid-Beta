package org.telegram.ui;

import android.view.WindowManager;
import androidx.appcompat.widget.TooltipPopup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.RichAIComposeSheet;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.HttpGetFileTask;
import org.telegram.ui.web.WebActionBar;
import org.telegram.ui.web.WebBrowserSettings;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;
import org.webrtc.OrientationHelper;

public final class VoIPFragment$8$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPFragment$8$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment.AnonymousClass8 anonymousClass8 = (VoIPFragment.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (VoIPFragment.this.currentUserIsVideo && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 1:
                VoIPFragment.AnonymousClass11 anonymousClass11 = (VoIPFragment.AnonymousClass11) this.f$0;
                anonymousClass11.this$0.notificationsLocker.unlock();
                VoIPPiPView.instance.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                anonymousClass11.this$0.currentUserCameraFloatingLayout.setCornerRadius(-1.0f);
                anonymousClass11.this$0.callingUserTextureView.renderer.release();
                anonymousClass11.this$0.currentUserTextureView.renderer.release();
                anonymousClass11.this$0.callingUserMiniTextureRenderer.release();
                anonymousClass11.this$0.destroy$1$1();
                VoIPFragment.AnonymousClass1 anonymousClass1 = anonymousClass11.this$0.windowView;
                if (anonymousClass1.getParent() != null) {
                    AndroidUtilities.unlockOrientation(anonymousClass1.activity);
                    WindowManager windowManager = (WindowManager) anonymousClass1.activity.getSystemService("window");
                    anonymousClass1.setVisibility(8);
                    windowManager.removeView(anonymousClass1);
                    OrientationHelper.cameraRotationDisabled = false;
                }
                VoIPPiPView.switchingToPip = false;
                anonymousClass11.this$0.switchingToPip = false;
                VoIPFragment.instance = null;
                break;
            case 2:
                ((VoIPPermissionActivity) this.f$0).finish();
                break;
            case 3:
                ((WallpapersListActivity) this.f$0).loadWallpapers(false);
                break;
            case 4:
                ((BotDownloads.DownloadBulletin.BackgroundDrawable) this.f$0).invalidateSelf();
                break;
            case 5:
                ((BotDownloads.DownloadBulletin.StatusDrawable) this.f$0).invalidateSelf();
                break;
            case 6:
                ((BotDownloads.FileDownload) this.f$0).updateProgress();
                break;
            case 7:
                ((BotSensors.AnonymousClass1) this.f$0).post();
                break;
            case 8:
                ((BotSensors.AnonymousClass1) this.f$0).post();
                break;
            case 9:
                ((BotSensors.AnonymousClass3) this.f$0).post();
                break;
            case 10:
                ((BotSensors.AnonymousClass4) this.f$0).post();
                break;
            case 11:
                ((BotWebViewSheet.WindowView) this.f$0).invalidate();
                break;
            case 12:
                ((AnimationNotificationsLocker) this.f$0).unlock();
                break;
            case 13:
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) this.f$0;
                webViewSwipeContainer.drawnSwipeOffsetY = webViewSwipeContainer.swipeOffsetY;
                break;
            case 14:
                AndroidUtilities.showKeyboard(((RichAIComposeSheet) this.f$0).promptCell.editText);
                break;
            case 15:
                ((RichButtonRowCell.ButtonView) this.f$0).invalidate();
                break;
            case 16:
                TooltipPopup tooltipPopup = (TooltipPopup) this.f$0;
                tooltipPopup.mMessageView = null;
                tooltipPopup.mLayoutParams = null;
                tooltipPopup.mTmpDisplayFrame = null;
                tooltipPopup.mTmpAnchorPos = null;
                tooltipPopup.setBackgroundCell(null);
                break;
            case 17:
                ((RichEditor.DraggingDrawable) this.f$0).invalidateSelf();
                break;
            case 18:
                ((RichEditorHistory) this.f$0).commit();
                break;
            case 19:
                ((AddressBarList) this.f$0).listView.adapter.update(true);
                break;
            case 20:
                AddressBarList.BookmarksList bookmarksList = ((BookmarksFragment.AnonymousClass2) this.f$0).this$0.searchList;
                if (bookmarksList != null) {
                    bookmarksList.load$1();
                }
                break;
            case 21:
                ((EditTextCaption) this.f$0).requestFocus();
                break;
            case 22:
                Browser.openUrl(BotWebViewContainer.MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 23:
                HistoryFragment.AnonymousClass2 anonymousClass2 = (HistoryFragment.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                Utilities.searchQueue.postRunnable(new EglRenderer$$ExternalSyntheticLambda6(anonymousClass2, new ArrayList(HistoryFragment.this.history), HistoryFragment.this.query, 11));
                break;
            case 24:
                ((HttpGetFileTask) this.f$0).progressCallback.run(Float.valueOf(1.0f));
                break;
            case 25:
                ((WebActionBar.ForwardDrawable) this.f$0).invalidateSelf();
                break;
            default:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getClass();
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += WebBrowserSettings.getDirectorySize(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += WebBrowserSettings.getDirectorySize(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda58(webBrowserSettings, length, file3.exists() ? WebBrowserSettings.getDirectorySize(file3, Boolean.TRUE) : 0L, 1));
                break;
        }
    }
}
