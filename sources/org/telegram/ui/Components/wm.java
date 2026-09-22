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
public final class wm implements Runnable {
    public final int f30040a;
    public final int f30041b;
    public final Object f30042c;
    public final Object d;

    public wm(int i10, Object obj, Object obj2, int i11) {
        this.f30040a = i11;
        this.f30041b = i10;
        this.f30042c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f30042c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = u31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(u31.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.d0(3);
        }
        int i10 = this.f30041b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.uy uyVar = ((org.telegram.ui.yx) this.f30042c).f40055f0;
        ArrayList arrayList = uyVar.R1;
        if (arrayList != null && (i10 = this.f30041b) >= 0 && i10 < arrayList.size()) {
            uyVar.R1.add(i10, dialog);
            uyVar.f38277e0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.f30042c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ty tyVar = syVar.f37593g;
        org.telegram.ui.uy uyVar = syVar.h;
        uyVar.S1 = true;
        uyVar.getMessagesController().addDialogToFolder(dialog.f18347id, 0, this.f30041b, 0L);
        uyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = uyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = uyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                uyVar.A4(true, true);
                tyVar.f37913x.D();
                tyVar.q(true);
                uyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    uyVar.A4(true, true);
                    tyVar.q(true);
                    uyVar.o3();
                    return;
                }
                if (!uyVar.R1.isEmpty()) {
                    uyVar.R1.remove(0);
                }
                tyVar.f37913x.D();
                tyVar.q(true);
                return;
            }
            return;
        }
        tyVar.q(false);
    }

    private final void e() {
        org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f30042c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.ca(i60Var, this.f30041b, 5));
        b2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f30042c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f30041b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wm.run():void");
    }

    public wm(Object obj, int i10, Object obj2, int i11) {
        this.f30040a = i11;
        this.f30042c = obj;
        this.f30041b = i10;
        this.d = obj2;
    }

    public wm(Object obj, Object obj2, int i10, int i11) {
        this.f30040a = i11;
        this.f30042c = obj;
        this.d = obj2;
        this.f30041b = i10;
    }
}
