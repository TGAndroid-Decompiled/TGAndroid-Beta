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
public final class rm implements Runnable {
    public final int f32338a;
    public final int f32339b;
    public final Object f32340c;
    public final Object d;

    public rm(int i10, Object obj, Object obj2, int i11) {
        this.f32338a = i11;
        this.f32339b = i10;
        this.f32340c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f32340c;
        org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.d;
        HashMap hashMap = t21.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(t21.o(messageObject)));
        }
        if (j1Var != null) {
            j1Var.c0(3);
        }
        int i10 = this.f32339b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.fy fyVar = ((org.telegram.ui.jx) this.f32340c).f39699b0;
        ArrayList arrayList = fyVar.N1;
        if (arrayList != null && (i10 = this.f32339b) >= 0 && i10 < arrayList.size()) {
            fyVar.N1.add(i10, dialog);
            fyVar.f38256a0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.f32340c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ey eyVar = dyVar.f37651g;
        org.telegram.ui.fy fyVar = dyVar.h;
        fyVar.O1 = true;
        fyVar.getMessagesController().addDialogToFolder(dialog.f22396id, 0, this.f32339b, 0L);
        fyVar.O1 = false;
        ArrayList<TLRPC.Dialog> dialogs = fyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = fyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                fyVar.A4(true, true);
                eyVar.f37930x.D();
                eyVar.q(true);
                fyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    fyVar.A4(true, true);
                    eyVar.q(true);
                    fyVar.o3();
                    return;
                }
                if (!fyVar.N1.isEmpty()) {
                    fyVar.N1.remove(0);
                }
                eyVar.f37930x.D();
                eyVar.q(true);
                return;
            }
            return;
        }
        eyVar.q(false);
    }

    private final void e() {
        org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.f32340c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new jh.w(r50Var, this.f32339b, 6));
        c2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f32340c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.f35560x1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f32339b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.run():void");
    }

    public rm(Object obj, int i10, Object obj2, int i11) {
        this.f32338a = i11;
        this.f32340c = obj;
        this.f32339b = i10;
        this.d = obj2;
    }

    public rm(Object obj, Object obj2, int i10, int i11) {
        this.f32338a = i11;
        this.f32340c = obj;
        this.d = obj2;
        this.f32339b = i10;
    }
}
