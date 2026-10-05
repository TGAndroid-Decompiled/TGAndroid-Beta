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
public final class zm implements Runnable {
    public final int f33581a;
    public final int f33582b;
    public final Object f33583c;
    public final Object d;

    public zm(int i10, Object obj, Object obj2, int i11) {
        this.f33581a = i11;
        this.f33582b = i10;
        this.f33583c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f33583c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = d41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(d41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.e0(3);
        }
        int i10 = this.f33582b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.uy uyVar = ((org.telegram.ui.wx) this.f33583c).f42718f0;
        ArrayList arrayList = uyVar.R1;
        if (arrayList != null && (i10 = this.f33582b) >= 0 && i10 < arrayList.size()) {
            uyVar.R1.add(i10, dialog);
            uyVar.f41435e0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.f33583c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ty tyVar = syVar.f40650g;
        org.telegram.ui.uy uyVar = syVar.h;
        uyVar.S1 = true;
        uyVar.getMessagesController().addDialogToFolder(dialog.f20051id, 0, this.f33582b, 0L);
        uyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = uyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = uyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                uyVar.J4(true, true);
                tyVar.f41055x.D();
                tyVar.q(true);
                uyVar.x3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    uyVar.J4(true, true);
                    tyVar.q(true);
                    uyVar.x3();
                    return;
                }
                if (!uyVar.R1.isEmpty()) {
                    uyVar.R1.remove(0);
                }
                tyVar.f41055x.D();
                tyVar.q(true);
                return;
            }
            return;
        }
        tyVar.q(false);
    }

    private final void e() {
        org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) this.f33583c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.da(h60Var, this.f33582b, 5));
        b2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f33583c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f33582b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm.run():void");
    }

    public zm(Object obj, int i10, Object obj2, int i11) {
        this.f33581a = i11;
        this.f33583c = obj;
        this.f33582b = i10;
        this.d = obj2;
    }

    public zm(Object obj, Object obj2, int i10, int i11) {
        this.f33581a = i11;
        this.f33583c = obj;
        this.d = obj2;
        this.f33582b = i10;
    }
}
