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
    public final int f30017a;
    public final int f30018b;
    public final Object f30019c;
    public final Object d;

    public xm(int i10, Object obj, Object obj2, int i11) {
        this.f30017a = i11;
        this.f30018b = i10;
        this.f30019c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f30019c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = d31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(d31.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.d0(3);
        }
        int i10 = this.f30018b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ry ryVar = ((org.telegram.ui.vx) this.f30019c).f38488f0;
        ArrayList arrayList = ryVar.R1;
        if (arrayList != null && (i10 = this.f30018b) >= 0 && i10 < arrayList.size()) {
            ryVar.R1.add(i10, dialog);
            ryVar.f36978e0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.py pyVar = (org.telegram.ui.py) this.f30019c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.qy qyVar = pyVar.f36222g;
        org.telegram.ui.ry ryVar = pyVar.h;
        ryVar.S1 = true;
        ryVar.getMessagesController().addDialogToFolder(dialog.f18087id, 0, this.f30018b, 0L);
        ryVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = ryVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = ryVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                ryVar.A4(true, true);
                qyVar.f36637x.D();
                qyVar.q(true);
                ryVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    ryVar.A4(true, true);
                    qyVar.q(true);
                    ryVar.o3();
                    return;
                }
                if (!ryVar.R1.isEmpty()) {
                    ryVar.R1.remove(0);
                }
                qyVar.f36637x.D();
                qyVar.q(true);
                return;
            }
            return;
        }
        qyVar.q(false);
    }

    private final void e() {
        org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.f30019c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.ba(f60Var, this.f30018b, 5));
        b2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f30019c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f30018b;
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
        this.f30017a = i11;
        this.f30019c = obj;
        this.f30018b = i10;
        this.d = obj2;
    }

    public xm(Object obj, Object obj2, int i10, int i11) {
        this.f30017a = i11;
        this.f30019c = obj;
        this.d = obj2;
        this.f30018b = i10;
    }
}
