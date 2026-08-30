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
public final class m90 implements Runnable {
    public final int f36236a = 1;
    public final TLObject f36237b;
    public final int f36238c;
    public final long d;
    public final Object e;
    public final Object f36239f;
    public final Object h;
    public final Object f36240n;
    public final Object f36241r;

    public m90(TLObject tLObject, int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.u uVar, dh.v vVar) {
        this.f36237b = tLObject;
        this.f36238c = i10;
        this.e = d2Var;
        this.f36239f = context;
        this.d = j10;
        this.h = f6Var;
        this.f36240n = uVar;
        this.f36241r = vVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        oy oyVar;
        TLObject tLObject;
        String[] split;
        String e;
        switch (this.f36236a) {
            case 0:
                final LaunchActivity launchActivity = (LaunchActivity) this.e;
                String str = (String) this.f36239f;
                String str2 = (String) this.h;
                final TLRPC.User user = (TLRPC.User) this.f36241r;
                final String str3 = (String) this.f36240n;
                ArrayList arrayList = launchActivity.f31618c0;
                ArrayList arrayList2 = launchActivity.f31614a0;
                ArrayList arrayList3 = launchActivity.B0;
                TLObject tLObject2 = this.f36237b;
                if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject2;
                    final int i11 = this.f36238c;
                    MessagesController.getInstance(i11).putUsers(tL_attachMenuBotsBot.users, false);
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
                    if (str != null) {
                        LaunchActivity.C0(launchActivity, launchActivity.L, tL_attachMenuBot, str, false);
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList2);
                    if (AndroidUtilities.isTablet() && !(p2Var instanceof xn) && !arrayList.isEmpty()) {
                        p2Var = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList);
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
                        oyVar = new oy(bundle);
                        oyVar.f37131z2 = new u90(launchActivity, user, str3, i11);
                    } else {
                        oyVar = null;
                    }
                    if (!tL_attachMenuBot.inactive) {
                        if (oyVar != null) {
                            if (p2Var != null) {
                                p2Var.dismissCurrentDialog();
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((Dialog) arrayList3.get(i12)).isShowing()) {
                                    ((Dialog) arrayList3.get(i12)).dismiss();
                                }
                            }
                            arrayList3.clear();
                            launchActivity.p0(oyVar);
                            return;
                        } else if (p2Var instanceof xn) {
                            xn xnVar = (xn) p2Var;
                            if (xnVar.i() != null) {
                                tLObject = xnVar.i();
                            } else {
                                tLObject = xnVar.e;
                            }
                            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject)) {
                                a02 = org.telegram.ui.Components.qc.a0(p2Var);
                                i10 = R.string.BotAlreadyAddedToAttachMenu;
                            } else {
                                xnVar.W9(user.f19331id, str3, false);
                                return;
                            }
                        } else {
                            a02 = org.telegram.ui.Components.qc.a0(p2Var);
                            i10 = R.string.BotAlreadyAddedToAttachMenu;
                        }
                    } else {
                        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(launchActivity);
                        r6Var.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20000ia, false));
                        r6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false));
                        r6Var.setAttachBot(tL_attachMenuBot);
                        final long j10 = this.d;
                        final oy oyVar2 = oyVar;
                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        si1.a(launchActivity, new h5.d() {
                            @Override
                            public final void accept(Object obj) {
                                Boolean bool = (Boolean) obj;
                                Pattern pattern = LaunchActivity.f31612y1;
                                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                int i13 = i11;
                                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(j10);
                                tL_messages_toggleBotInAttachMenu.enabled = true;
                                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ki(LaunchActivity.this, i13, oyVar2, p2Var2, user, str3), 66);
                            }
                        }, null);
                        return;
                    }
                } else {
                    a02 = org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList2));
                    i10 = R.string.BotCantAddToAttachMenu;
                }
                org.telegram.messenger.y3.s(i10, a02, null);
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                Context context = (Context) this.f36239f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                org.telegram.ui.web.u uVar = (org.telegram.ui.web.u) this.f36240n;
                dh.v vVar = (dh.v) this.f36241r;
                TLObject tLObject3 = this.f36237b;
                if (tLObject3 instanceof TLRPC.TL_messages_preparedInlineMessage) {
                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) tLObject3;
                    TLRPC.BotInlineMessage botInlineMessage = tL_messages_preparedInlineMessage.result.send_message;
                    boolean z4 = botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage;
                    int i13 = this.f36238c;
                    long j11 = this.d;
                    if (z4) {
                        TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                        if (!TextUtils.isEmpty(tL_botInlineMessageMediaWebPage.url)) {
                            String str5 = tL_botInlineMessageMediaWebPage.url;
                            rh.x0 x0Var = new rh.x0(d2Var, context, i13, j11, tL_messages_preparedInlineMessage, f6Var, uVar, vVar);
                            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str5;
                            int[] iArr = {ConnectionsManager.getInstance(i13).sendRequestTyped(getwebpagepreview, new Object(), new lh.i0(iArr, x0Var, notificationCenterDelegateArr, i13, 6))};
                            d2Var.setOnCancelListener(new ph.wa(new zt0(iArr, i13, notificationCenterDelegateArr, 15), 1));
                            return;
                        }
                    }
                    File[] fileArr = new File[1];
                    org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(d2Var, context, i13, j11, tL_messages_preparedInlineMessage, fileArr, f6Var, uVar, vVar);
                    TLRPC.WebDocument webDocument = tL_messages_preparedInlineMessage.result.content;
                    if (webDocument != null && !TextUtils.isEmpty(webDocument.url)) {
                        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
                        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                        if ((botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaAuto) || (botInlineMessage2 instanceof TLRPC.TL_botInlineMessageMediaWebPage)) {
                            String str6 = botInlineResult.content.url;
                            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str6, null);
                            if (TextUtils.isEmpty(httpUrlExtension)) {
                                e = FileLoader.getExtensionByMimeType(tL_messages_preparedInlineMessage.result.content.mime_type);
                            } else {
                                e = vh.v2.e(".", httpUrlExtension);
                            }
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str6) + e);
                            if (!file.exists()) {
                                HttpGetFileTask httpGetFileTask = new HttpGetFileTask(new org.telegram.ui.web.u1(12, fileArr, r70Var), null);
                                httpGetFileTask.setDestFile(file);
                                httpGetFileTask.setMaxSize(8388608L);
                                httpGetFileTask.execute(str6);
                                d2Var.setOnCancelListener(new ph.wa(httpGetFileTask, 2));
                                return;
                            }
                            r70Var.run();
                            return;
                        }
                    }
                    r70Var.run();
                    return;
                }
                vVar.run("MESSAGE_EXPIRED", null);
                return;
        }
    }

    public m90(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f36237b = tLObject;
        this.f36238c = i10;
        this.f36239f = str;
        this.h = str2;
        this.f36241r = user;
        this.f36240n = str3;
        this.d = j10;
    }
}
