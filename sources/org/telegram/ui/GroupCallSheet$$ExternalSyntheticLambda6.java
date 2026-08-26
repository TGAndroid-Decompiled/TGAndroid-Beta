package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import java.io.File;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;
import org.telegram.ui.web.HttpGetFileTask;

public final class GroupCallSheet$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId = 2;
    public final Object f$0;
    public final Object f$1;
    public final TLObject f$2;
    public final int f$3;
    public final Object f$4;
    public final long f$5;
    public final Object f$6;
    public final Object f$7;

    public GroupCallSheet$$ExternalSyntheticLambda6(TLObject tLObject, int i, AlertDialog alertDialog, Context context, long j, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10) {
        this.f$2 = tLObject;
        this.f$3 = i;
        this.f$0 = alertDialog;
        this.f$4 = context;
        this.f$5 = j;
        this.f$1 = resourcesProvider;
        this.f$6 = botWebViewContainer$$ExternalSyntheticLambda5;
        this.f$7 = botBiometry$$ExternalSyntheticLambda10;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GroupCallSheet.lambda$show$0((AlertDialog) this.f$0, (Browser.Progress) this.f$1, this.f$2, this.f$3, (Context) this.f$4, this.f$5, (TLRPC.InputGroupCall) this.f$6, (TLRPC.TL_error) this.f$7);
                break;
            case 1:
                ((LaunchActivity) this.f$0).lambda$processAttachMenuBot$131(this.f$2, this.f$3, (String) this.f$1, (String) this.f$4, (TLRPC.User) this.f$6, (String) this.f$7, this.f$5);
                break;
            default:
                TLObject tLObject = this.f$2;
                boolean z = tLObject instanceof TLRPC.TL_messages_preparedInlineMessage;
                BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10 = (BotBiometry$$ExternalSyntheticLambda10) this.f$7;
                if (!z) {
                    botBiometry$$ExternalSyntheticLambda10.run("MESSAGE_EXPIRED", null);
                } else {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z2 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    AlertDialog alertDialog = (AlertDialog) this.f$0;
                    BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5 = (BotWebViewContainer$$ExternalSyntheticLambda5) this.f$6;
                    int i = this.f$3;
                    Context context = (Context) this.f$4;
                    long j = this.f$5;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$1;
                    if (z2) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str = tL_botInlineMessageMediaWebPage.url;
                            BotShareSheet$$ExternalSyntheticLambda2 botShareSheet$$ExternalSyntheticLambda2 = new BotShareSheet$$ExternalSyntheticLambda2(alertDialog, context, i, j, tL_messages_preparedInlineMessage, resourcesProvider, botWebViewContainer$$ExternalSyntheticLambda5, botBiometry$$ExternalSyntheticLambda10);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            iArr[0] = ConnectionsManager.getInstance(i).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new BotShareSheet$$ExternalSyntheticLambda7(iArr, botShareSheet$$ExternalSyntheticLambda2, notificationCenterDelegateArr, i));
                            alertDialog.setOnCancelListener(new BotShareSheet$$ExternalSyntheticLambda3(new RichTextCell$2$$ExternalSyntheticLambda1(iArr, i, notificationCenterDelegateArr, 25), 0));
                        }
                    }
                    File[] fileArr = new File[1];
                    BotShareSheet$$ExternalSyntheticLambda4 botShareSheet$$ExternalSyntheticLambda4 = new BotShareSheet$$ExternalSyntheticLambda4(alertDialog, context, i, j, tL_messages_preparedInlineMessage, fileArr, resourcesProvider, botWebViewContainer$$ExternalSyntheticLambda5, botBiometry$$ExternalSyntheticLambda10);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str2 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str2, null);
                            String extensionByMimeType = TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : zzii.m(".", httpUrlExtension);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str2) + extensionByMimeType);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new GiftSheet$$ExternalSyntheticLambda4(26, fileArr, botShareSheet$$ExternalSyntheticLambda4), null);
                                httpGetFileTask.file = file;
                                httpGetFileTask.max_size = 8388608L;
                                httpGetFileTask.execute(str2);
                                alertDialog.setOnCancelListener(new BotShareSheet$$ExternalSyntheticLambda3(httpGetFileTask, 2));
                            } else {
                                botShareSheet$$ExternalSyntheticLambda4.run();
                            }
                        }
                    }
                    botShareSheet$$ExternalSyntheticLambda4.run();
                }
                break;
        }
    }

    public GroupCallSheet$$ExternalSyntheticLambda6(AlertDialog alertDialog, Browser.Progress progress, int i, Context context, long j, TLRPC.InputGroupCall inputGroupCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f$0 = alertDialog;
        this.f$1 = progress;
        this.f$2 = tLObject;
        this.f$3 = i;
        this.f$4 = context;
        this.f$5 = j;
        this.f$6 = inputGroupCall;
        this.f$7 = tL_error;
    }

    public GroupCallSheet$$ExternalSyntheticLambda6(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.f$0 = launchActivity;
        this.f$2 = tLObject;
        this.f$3 = i;
        this.f$1 = str;
        this.f$4 = str2;
        this.f$6 = user;
        this.f$7 = str3;
        this.f$5 = j;
    }
}
