package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.web.HttpGetFileTask;
public final class e90 implements Runnable {
    public final int f37759a = 1;
    public final TLObject f37760b;
    public final int f37761c;
    public final long d;
    public final Object f37762e;
    public final Object f37763f;
    public final Object h;
    public final Object f37764n;
    public final Object f37765r;

    public e90(TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        this.f37760b = tLObject;
        this.f37761c = i10;
        this.f37762e = c2Var;
        this.f37763f = context;
        this.d = j10;
        this.h = c6Var;
        this.f37764n = uVar;
        this.f37765r = vVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.tc a02;
        int i10;
        fy fyVar;
        TLObject tLObject;
        String[] split;
        String e10;
        switch (this.f37759a) {
            case 0:
                final LaunchActivity launchActivity = (LaunchActivity) this.f37762e;
                String str = (String) this.f37763f;
                String str2 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.f37765r;
                final String str3 = (String) this.f37764n;
                ArrayList arrayList = launchActivity.f35565b0;
                ArrayList arrayList2 = launchActivity.Z;
                ArrayList arrayList3 = launchActivity.A0;
                TLObject tLObject2 = this.f37760b;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    final int i11 = this.f37761c;
                    MessagesController.getInstance(i11).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.K, tL_attachMenuBot, str, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(o2Var instanceof tn) && !arrayList.isEmpty()) {
                        o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(str2)) {
                        for (String str4 : str2.split(" ")) {
                            if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str4)) {
                                arrayList4.add(str4);
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("dialogsType", 14);
                        bundle.putBoolean("onlySelect", true);
                        bundle.putBoolean("allowGroups", arrayList4.contains("groups"));
                        bundle.putBoolean("allowMegagroups", arrayList4.contains("groups"));
                        bundle.putBoolean("allowLegacyGroups", arrayList4.contains("groups"));
                        bundle.putBoolean("allowUsers", arrayList4.contains("users"));
                        bundle.putBoolean("allowChannels", arrayList4.contains("channels"));
                        bundle.putBoolean("allowBots", arrayList4.contains("bots"));
                        fyVar = new fy(bundle);
                        fyVar.f38379y2 = new m90(launchActivity, user, str3, i11);
                    } else {
                        fyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (fyVar != null) {
                            if (o2Var != null) {
                                o2Var.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(fyVar);
                            return;
                        } else if (o2Var instanceof tn) {
                            tn tnVar = (tn) o2Var;
                            if (tnVar.i() != null) {
                                tLObject = tnVar.i();
                            } else {
                                tLObject = tnVar.f42787e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = org.telegram.ui.Components.tc.a0(o2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                tnVar.W9(user.f22539id, str3, false);
                                return;
                            }
                        } else {
                            a02 = org.telegram.ui.Components.tc.a0(o2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(launchActivity);
                        v6Var.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23156ia, false));
                        v6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false));
                        v6Var.setAttachBot(tL_attachMenuBot);
                        final long j10 = this.d;
                        final fy fyVar2 = fyVar;
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        gi1.a(launchActivity, new f5.d() {
                            @Override
                            public final void accept(Object obj) {
                                Boolean bool = (Boolean) obj;
                                Pattern pattern = LaunchActivity.f35560x1;
                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                int i13 = i11;
                                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(j10);
                                tL_messages_toggleBotInAttachMenu.enabled = true;
                                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gi(LaunchActivity.this, i13, fyVar2, o2Var2, user, str3), 66);
                            }
                        }, null);
                        return;
                    }
                } else {
                    a02 = org.telegram.ui.Components.tc.a0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.x3.s(i10, a02, null);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f37762e;
                Context context = (Context) this.f37763f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f37764n;
                bh.v vVar = (bh.v) this.f37765r;
                TLObject tLObject3 = this.f37760b;
                if (tLObject3 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject3;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z10 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i13 = this.f37761c;
                    long j11 = this.d;
                    if (z10) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str5 = tL_botInlineMessageMediaWebPage.url;
                            ph.w0 w0Var = new ph.w0(c2Var, context, i13, j11, tL_messages_preparedInlineMessage, c6Var, uVar, vVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str5;
                            int[] iArr = {ConnectionsManager.getInstance(i13).sendRequestTyped(getwebpagepreview, new Object(), new jh.i0(iArr, w0Var, notificationCenterDelegateArr, i13, 6))};
                            c2Var.setOnCancelListener(new nh.zb(new ll0(iArr, i13, notificationCenterDelegateArr, 12), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(c2Var, context, i13, j11, tL_messages_preparedInlineMessage, fileArr, c6Var, uVar, vVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str6 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str6, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                e10 = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                e10 = u3.c.e(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str6) + e10);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new yu0(12, fileArr, m70Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str6);
                                c2Var.setOnCancelListener(new nh.zb(httpGetFileTask, 2));
                                return;
                            }
                            m70Var.run();
                            return;
                        }
                    }
                    m70Var.run();
                    return;
                }
                vVar.run("MESSAGE_EXPIRED", null);
                return;
        }
    }

    public e90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.f37762e = launchActivity;
        this.f37760b = tLObject;
        this.f37761c = i10;
        this.f37763f = str;
        this.h = str2;
        this.f37765r = user;
        this.f37764n = str3;
        this.d = j10;
    }
}
