package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class xm implements Runnable {
    public final int f30356a;
    public final int f30357b;
    public final Object f30358c;
    public final Object d;

    public xm(int i10, Object obj, Object obj2, int i11) {
        this.f30356a = i11;
        this.f30357b = i10;
        this.f30358c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f30358c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = r31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(r31.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.d0(3);
        }
        int i10 = this.f30357b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.qy qyVar = ((org.telegram.ui.ux) this.f30358c).f38570f0;
        ArrayList arrayList = qyVar.R1;
        if (arrayList != null && (i10 = this.f30357b) >= 0 && i10 < arrayList.size()) {
            qyVar.R1.add(i10, dialog);
            qyVar.f37033e0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.f30358c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.py pyVar = oyVar.f36362g;
        org.telegram.ui.qy qyVar = oyVar.h;
        qyVar.S1 = true;
        qyVar.getMessagesController().addDialogToFolder(dialog.f18339id, 0, this.f30357b, 0L);
        qyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = qyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = qyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                qyVar.A4(true, true);
                pyVar.f36702x.D();
                pyVar.q(true);
                qyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    qyVar.A4(true, true);
                    pyVar.q(true);
                    qyVar.o3();
                    return;
                }
                if (!qyVar.R1.isEmpty()) {
                    qyVar.R1.remove(0);
                }
                pyVar.f36702x.D();
                pyVar.q(true);
                return;
            }
            return;
        }
        pyVar.q(false);
    }

    private final void e() {
        org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.f30358c;
        org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var == null) {
            return;
        }
        a2Var.setOnCancelListener(new org.telegram.ui.ba(d60Var, this.f30357b, 5));
        a2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f30358c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f30357b;
            if (z10) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xm.run():void");
    }

    public xm(Object obj, int i10, Object obj2, int i11) {
        this.f30356a = i11;
        this.f30358c = obj;
        this.f30357b = i10;
        this.d = obj2;
    }

    public xm(Object obj, Object obj2, int i10, int i11) {
        this.f30356a = i11;
        this.f30358c = obj;
        this.d = obj2;
        this.f30357b = i10;
    }
}
