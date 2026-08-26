package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AttachBotIntroTopView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;
import org.telegram.ui.web.HttpGetFileTask;

public final class LaunchActivity$$ExternalSyntheticLambda167 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final TLObject f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final long f$7;

    public LaunchActivity$$ExternalSyntheticLambda167(TLObject tLObject, int i, AlertDialog alertDialog, Context context, long j, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18) {
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$0 = alertDialog;
        this.f$3 = context;
        this.f$7 = j;
        this.f$4 = resourcesProvider;
        this.f$6 = botWebViewContainer$$ExternalSyntheticLambda5;
        this.f$5 = oAuthSheet$$ExternalSyntheticLambda18;
    }

    @Override
    public final void run() {
        final DialogsActivity dialogsActivity;
        switch (this.$r8$classId) {
            case 0:
                final LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                TLObject tLObject = this.f$1;
                boolean z = tLObject instanceof TLRPC.TL_attachMenuBotsBot;
                ArrayList arrayList = launchActivity.mainFragmentsStack;
                if (z) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
                    final int i = this.f$2;
                    int i2 = 0;
                    MessagesController.getInstance(i).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    String str = (String) this.f$3;
                    if (str != null) {
                        LaunchActivity.showAttachMenuBot(launchActivity, launchActivity.currentAccount, tL_attachMenuBot, str, false);
                    } else {
                        BaseFragment baseFragment = (BaseFragment) zziq.m(1, arrayList);
                        if (AndroidUtilities.isTablet() && !(baseFragment instanceof ChatActivity)) {
                            ArrayList arrayList2 = launchActivity.rightFragmentsStack;
                            if (!arrayList2.isEmpty()) {
                                baseFragment = (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        String str2 = (String) this.f$4;
                        if (!TextUtils.isEmpty(str2)) {
                            for (String str3 : str2.split(" ")) {
                                if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str3)) {
                                    arrayList3.add(str3);
                                }
                            }
                        }
                        boolean zIsEmpty = arrayList3.isEmpty();
                        final TLRPC.User user = (TLRPC.User) this.f$5;
                        final String str4 = (String) this.f$6;
                        if (zIsEmpty) {
                            dialogsActivity = null;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putInt("dialogsType", 14);
                            bundle.putBoolean("onlySelect", true);
                            bundle.putBoolean("allowGroups", arrayList3.contains("groups"));
                            bundle.putBoolean("allowMegagroups", arrayList3.contains("groups"));
                            bundle.putBoolean("allowLegacyGroups", arrayList3.contains("groups"));
                            bundle.putBoolean("allowUsers", arrayList3.contains("users"));
                            bundle.putBoolean("allowChannels", arrayList3.contains("channels"));
                            bundle.putBoolean("allowBots", arrayList3.contains("bots"));
                            DialogsActivity dialogsActivity2 = new DialogsActivity(bundle);
                            dialogsActivity2.delegate = new LaunchActivity$$ExternalSyntheticLambda107(launchActivity, user, str4, i);
                            dialogsActivity = dialogsActivity2;
                        }
                        if (tL_attachMenuBot.inactive) {
                            AttachBotIntroTopView attachBotIntroTopView = new AttachBotIntroTopView(launchActivity);
                            attachBotIntroTopView.setColor(Theme.getColor(null, Theme.key_chat_attachIcon, false));
                            attachBotIntroTopView.setBackgroundColor(Theme.getColor(null, Theme.key_dialogTopBackground, false));
                            attachBotIntroTopView.setAttachBot(tL_attachMenuBot);
                            final BaseFragment baseFragment2 = baseFragment;
                            final long j = this.f$7;
                            WebAppDisclaimerAlert.show(launchActivity, new Consumer() {
                                @Override
                                public final void accept(Object obj) {
                                    LaunchActivity launchActivity2 = launchActivity;
                                    launchActivity2.getClass();
                                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                    int i3 = i;
                                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i3).getInputUser(j);
                                    tL_messages_toggleBotInAttachMenu.enabled = true;
                                    tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new ArticleViewer$$ExternalSyntheticLambda61(launchActivity2, i3, dialogsActivity, baseFragment2, user, str4), 66);
                                }
                            }, null);
                        } else if (dialogsActivity != null) {
                            if (baseFragment != null) {
                                baseFragment.dismissCurrentDialog();
                            }
                            while (true) {
                                ArrayList arrayList4 = launchActivity.visibleDialogs;
                                if (i2 >= arrayList4.size()) {
                                    arrayList4.clear();
                                    launchActivity.presentFragment(dialogsActivity);
                                } else {
                                    if (((Dialog) arrayList4.get(i2)).isShowing()) {
                                        ((Dialog) arrayList4.get(i2)).dismiss();
                                    }
                                    i2++;
                                }
                            }
                        } else if (baseFragment instanceof ChatActivity) {
                            ChatActivity chatActivity = (ChatActivity) baseFragment;
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, chatActivity.getCurrentUser() != null ? chatActivity.getCurrentUser() : chatActivity.currentChat)) {
                                long j2 = user.id;
                                chatActivity.openAttachMenu();
                                ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
                                if (anonymousClass78 != null) {
                                    anonymousClass78.showBotLayout(j2, str4, false, false);
                                }
                            } else {
                                UserNameResolver$$ExternalSyntheticOutline0.m(R.string.BotAlreadyAddedToAttachMenu, BulletinFactory.of(baseFragment), null);
                            }
                        } else {
                            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.BotAlreadyAddedToAttachMenu, BulletinFactory.of(baseFragment), null);
                        }
                    }
                } else {
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.BotCantAddToAttachMenu, BulletinFactory.of((BaseFragment) zziq.m(1, arrayList)), null);
                }
                break;
            default:
                TLObject tLObject2 = this.f$1;
                boolean z2 = tLObject2 instanceof TLRPC.TL_messages_preparedInlineMessage;
                OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = (OAuthSheet$$ExternalSyntheticLambda18) this.f$5;
                if (z2) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject2;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z3 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    AlertDialog alertDialog = (AlertDialog) this.f$0;
                    BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5 = (BotWebViewContainer$$ExternalSyntheticLambda5) this.f$6;
                    int i3 = this.f$2;
                    Context context = (Context) this.f$3;
                    long j3 = this.f$7;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$4;
                    if (z3) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str5 = tL_botInlineMessageMediaWebPage.url;
                            BotShareSheet$$ExternalSyntheticLambda2 botShareSheet$$ExternalSyntheticLambda2 = new BotShareSheet$$ExternalSyntheticLambda2(alertDialog, context, i3, j3, tL_messages_preparedInlineMessage, resourcesProvider, botWebViewContainer$$ExternalSyntheticLambda5, oAuthSheet$$ExternalSyntheticLambda18);
                            int[] iArr = new int[1];
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str5;
                            iArr[0] = ConnectionsManager.getInstance(i3).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new ArticleViewer$$ExternalSyntheticLambda57(iArr, botShareSheet$$ExternalSyntheticLambda2, notificationCenterDelegateArr, i3, 6));
                            alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(new TodoItemMenu$$ExternalSyntheticLambda2(iArr, i3, notificationCenterDelegateArr, 16), 8));
                        }
                    }
                    File[] fileArr = new File[1];
                    BotShareSheet$$ExternalSyntheticLambda4 botShareSheet$$ExternalSyntheticLambda4 = new BotShareSheet$$ExternalSyntheticLambda4(alertDialog, context, i3, j3, tL_messages_preparedInlineMessage, fileArr, resourcesProvider, botWebViewContainer$$ExternalSyntheticLambda5, oAuthSheet$$ExternalSyntheticLambda18);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str6 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str6, null);
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str6) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type) : zzil.m(".", httpUrlExtension)));
                            if (file.exists()) {
                                botShareSheet$$ExternalSyntheticLambda4.run();
                            } else {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new ThemeActivity$$ExternalSyntheticLambda19(12, fileArr, botShareSheet$$ExternalSyntheticLambda4), null);
                                httpGetFileTask.file = file;
                                httpGetFileTask.max_size = 8388608L;
                                httpGetFileTask.execute(str6);
                                alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(httpGetFileTask, 9));
                            }
                        }
                    }
                    botShareSheet$$ExternalSyntheticLambda4.run();
                } else {
                    oAuthSheet$$ExternalSyntheticLambda18.run("MESSAGE_EXPIRED", null);
                }
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda167(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.f$0 = launchActivity;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = user;
        this.f$6 = str3;
        this.f$7 = j;
    }
}
