package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.BotWebViewContainer;

public final class ShareActivity$$ExternalSyntheticLambda0 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public ShareActivity$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        BotWebViewContainer.Delegate delegate;
        switch (this.$r8$classId) {
            case 0:
                ShareActivity shareActivity = (ShareActivity) this.f$0;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.visibleDialog = null;
                break;
            case 1:
                ((PollItemMenu$$ExternalSyntheticLambda8) this.f$0).run();
                break;
            case 2:
                ((PollItemMenu$$ExternalSyntheticLambda8) this.f$0).run();
                break;
            case 3:
                ((LivePlayer$1$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 4:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                if (dialogInterface == storyViewer.currentDialog) {
                    storyViewer.currentDialog = null;
                    storyViewer.updatePlayingMode();
                }
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) this.f$0;
                themeActivity.sharingProgressDialog = null;
                themeActivity.sharingTheme = null;
                themeActivity.sharingAccent = null;
                break;
            case 6:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f$0;
                twoStepVerificationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            case 7:
                ((VoIPFragment) this.f$0).windowView.finish(330L);
                break;
            case 8:
                ((ChatAttachAlertRichLayout) this.f$0).messageSendPreview = null;
                break;
            case 9:
                ((RichEditor) this.f$0).messageSendPreview = null;
                break;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f$0;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                }
                break;
            case 11:
                BotWebViewContainer botWebViewContainer = BotWebViewContainer.MyWebView.this.botWebViewContainer;
                if (botWebViewContainer != null && (delegate = botWebViewContainer.delegate) != null) {
                    delegate.onCloseRequested();
                    break;
                }
                break;
            default:
                BotWebViewContainer.Delegate delegate2 = BotWebViewContainer.MyWebView.this.botWebViewContainer.delegate;
                if (delegate2 != null) {
                    delegate2.onCloseRequested();
                }
                break;
        }
    }
}
