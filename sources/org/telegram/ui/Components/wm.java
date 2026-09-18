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
    public final int f29694a;
    public final int f29695b;
    public final Object f29696c;
    public final Object d;

    public wm(int i10, Object obj, Object obj2, int i11) {
        this.f29694a = i11;
        this.f29695b = i10;
        this.f29696c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f29696c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = f31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(f31.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.d0(3);
        }
        int i10 = this.f29695b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.wy wyVar = ((org.telegram.ui.ay) this.f29696c).f32004f0;
        ArrayList arrayList = wyVar.R1;
        if (arrayList != null && (i10 = this.f29695b) >= 0 && i10 < arrayList.size()) {
            wyVar.R1.add(i10, dialog);
            wyVar.f39221e0[0].q(true);
        }
    }

    private final void c() {
        org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f29696c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.vy vyVar = uyVar.f38247g;
        org.telegram.ui.wy wyVar = uyVar.h;
        wyVar.S1 = true;
        wyVar.getMessagesController().addDialogToFolder(dialog.f18125id, 0, this.f29695b, 0L);
        wyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = wyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = wyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                wyVar.A4(true, true);
                vyVar.f38535x.D();
                vyVar.q(true);
                wyVar.o3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    wyVar.A4(true, true);
                    vyVar.q(true);
                    wyVar.o3();
                    return;
                }
                if (!wyVar.R1.isEmpty()) {
                    wyVar.R1.remove(0);
                }
                vyVar.f38535x.D();
                vyVar.q(true);
                return;
            }
            return;
        }
        vyVar.q(false);
    }

    private final void e() {
        org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) this.f29696c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new org.telegram.ui.da(k60Var, this.f29695b, 5));
        c2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f29696c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f29695b;
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
        this.f29694a = i11;
        this.f29696c = obj;
        this.f29695b = i10;
        this.d = obj2;
    }

    public wm(Object obj, Object obj2, int i10, int i11) {
        this.f29694a = i11;
        this.f29696c = obj;
        this.d = obj2;
        this.f29695b = i10;
    }
}
