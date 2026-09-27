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
public final class ym implements Runnable {
    public final int f30730a;
    public final int f30731b;
    public final Object f30732c;
    public final Object d;

    public ym(int i10, Object obj, Object obj2, int i11) {
        this.f30730a = i11;
        this.f30731b = i10;
        this.f30732c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f30732c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = t31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(t31.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.d0(3);
        }
        int i10 = this.f30731b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ty tyVar = ((org.telegram.ui.ux) this.f30732c).f38373f0;
        ArrayList arrayList = tyVar.R1;
        if (arrayList != null && (i10 = this.f30731b) >= 0 && i10 < arrayList.size()) {
            tyVar.R1.add(i10, dialog);
            tyVar.f37976e0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.f30732c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.sy syVar = ryVar.f37247g;
        org.telegram.ui.ty tyVar = ryVar.h;
        tyVar.S1 = true;
        tyVar.getMessagesController().addDialogToFolder(dialog.f18333id, 0, this.f30731b, 0L);
        tyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = tyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = tyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                tyVar.J4(true, true);
                syVar.f37601x.D();
                syVar.q(true);
                tyVar.x3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    tyVar.J4(true, true);
                    syVar.q(true);
                    tyVar.x3();
                    return;
                }
                if (!tyVar.R1.isEmpty()) {
                    tyVar.R1.remove(0);
                }
                syVar.f37601x.D();
                syVar.q(true);
                return;
            }
            return;
        }
        syVar.q(false);
    }

    private final void e() {
        org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f30732c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new org.telegram.ui.ea(g60Var, this.f30731b, 5));
        c2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f30732c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f30731b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ym.run():void");
    }

    public ym(Object obj, int i10, Object obj2, int i11) {
        this.f30730a = i11;
        this.f30732c = obj;
        this.f30731b = i10;
        this.d = obj2;
    }

    public ym(Object obj, Object obj2, int i10, int i11) {
        this.f30730a = i11;
        this.f30732c = obj;
        this.d = obj2;
        this.f30731b = i10;
    }
}
