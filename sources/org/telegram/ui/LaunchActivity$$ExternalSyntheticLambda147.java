package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class LaunchActivity$$ExternalSyntheticLambda147 implements RequestDelegate {
    public final int $r8$classId = 3;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final long f$6;

    public LaunchActivity$$ExternalSyntheticLambda147(int i, AlertDialog alertDialog, Context context, long j, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18) {
        this.f$1 = i;
        this.f$0 = alertDialog;
        this.f$2 = context;
        this.f$6 = j;
        this.f$3 = resourcesProvider;
        this.f$5 = botWebViewContainer$$ExternalSyntheticLambda5;
        this.f$4 = oAuthSheet$$ExternalSyntheticLambda18;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda167(launchActivity, tLObject, this.f$1, (String) this.f$2, (String) this.f$3, (TLRPC.User) this.f$4, (String) this.f$5, this.f$6));
                break;
            case 1:
                ((GroupCallActivity) this.f$0).lambda$new$22(this.f$6, (HashSet) this.f$3, (AtomicInteger) this.f$5, this.f$1, (ChatObject.Call) this.f$4, (String) this.f$2, tLObject, tL_error);
                break;
            case 2:
                Activity activity = (Activity) this.f$0;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$2;
                ChatActivity chatActivity = (ChatActivity) this.f$5;
                MessageObject messageObject = (MessageObject) this.f$4;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda15(tLObject, activity, resourcesProvider, this.f$6, (byte[]) this.f$3, chatActivity, messageObject, 0));
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda16(chatActivity, activity, resourcesProvider, messageObject, 0), 200L);
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda91(chatActivity, this.f$1, messageObject), 200L);
                    }
                    break;
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda16(chatActivity, activity, resourcesProvider, messageObject, 1), 200L);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda167(tLObject, this.f$1, (AlertDialog) this.f$0, (Context) this.f$2, this.f$6, (Theme.ResourcesProvider) this.f$3, (BotWebViewContainer$$ExternalSyntheticLambda5) this.f$5, (OAuthSheet$$ExternalSyntheticLambda18) this.f$4));
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda147(Activity activity, Theme.ResourcesProvider resourcesProvider, long j, byte[] bArr, ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.f$0 = activity;
        this.f$2 = resourcesProvider;
        this.f$6 = j;
        this.f$3 = bArr;
        this.f$5 = chatActivity;
        this.f$4 = messageObject;
        this.f$1 = i;
    }

    public LaunchActivity$$ExternalSyntheticLambda147(GroupCallActivity groupCallActivity, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, ChatObject.Call call, String str) {
        this.f$0 = groupCallActivity;
        this.f$6 = j;
        this.f$3 = hashSet;
        this.f$5 = atomicInteger;
        this.f$1 = i;
        this.f$4 = call;
        this.f$2 = str;
    }

    public LaunchActivity$$ExternalSyntheticLambda147(LaunchActivity launchActivity, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.f$0 = launchActivity;
        this.f$1 = i;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = user;
        this.f$5 = str3;
        this.f$6 = j;
    }
}
