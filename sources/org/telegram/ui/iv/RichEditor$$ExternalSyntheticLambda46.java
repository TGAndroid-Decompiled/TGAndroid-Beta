package org.telegram.ui.iv;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.MainTabsLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.web.BotWebViewContainer;

public final class RichEditor$$ExternalSyntheticLambda46 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public RichEditor$$ExternalSyntheticLambda46(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((RichEditor) this.f$0).messageSendPreview = null;
                break;
            case 1:
                AndroidUtilities.hideKeyboard((BusinessLinksActivity.AnonymousClass1) this.f$0);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((QuickRepliesActivity.AnonymousClass3) this.f$0);
                break;
            case 3:
                AboutLinkCell.access$300(AboutLinkCell.this);
                break;
            case 4:
                MainTabsLayout$$ExternalSyntheticLambda0 mainTabsLayout$$ExternalSyntheticLambda0 = (MainTabsLayout$$ExternalSyntheticLambda0) this.f$0;
                if (mainTabsLayout$$ExternalSyntheticLambda0 != null) {
                    mainTabsLayout$$ExternalSyntheticLambda0.run();
                }
                break;
            case 5:
                Runnable runnable = (Runnable) this.f$0;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 6:
                ((MemberRequestsDelegate) this.f$0).lambda$onItemClick$0(dialogInterface);
                break;
            case 7:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f$0);
                break;
            case 8:
                ((StarGiftSheet$$ExternalSyntheticLambda66) this.f$0).run();
                break;
            case 9:
                ((StarGiftSheet$$ExternalSyntheticLambda66) this.f$0).run();
                break;
            case 10:
                ((BotSensors$1$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 11:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                if (dialogInterface == storyViewer.currentDialog) {
                    storyViewer.currentDialog = null;
                    storyViewer.updatePlayingMode();
                }
                break;
            case 12:
                ((ChatAttachAlertRichLayout) this.f$0).messageSendPreview = null;
                break;
            case 13:
                BotWebViewContainer.lambda$onEventReceived$30((Runnable[]) this.f$0, dialogInterface);
                break;
            case 14:
                BotWebViewContainer.MyWebView myWebView = BotWebViewContainer.MyWebView.this;
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer != null && botWebViewContainer.delegate != null) {
                    myWebView.botWebViewContainer.delegate.onCloseRequested(null);
                    break;
                }
                break;
            default:
                BotWebViewContainer.MyWebView.AnonymousClass3 anonymousClass3 = BotWebViewContainer.MyWebView.AnonymousClass3.this;
                if (BotWebViewContainer.MyWebView.this.botWebViewContainer.delegate != null) {
                    BotWebViewContainer.MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                }
                break;
        }
    }
}
