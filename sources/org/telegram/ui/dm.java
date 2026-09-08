package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class dm implements Runnable {
    public final int f35851a;
    public final int f35852b;
    public final Object f35853c;
    public final Object d;

    public dm(int i10, Object obj, Object obj2, int i11) {
        this.f35851a = i11;
        this.f35852b = i10;
        this.f35853c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r11((org.telegram.ui.Components.t11) this.f35853c, (org.telegram.ui.Components.kp) this.d, this.f35852b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.f35853c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = org.telegram.ui.Components.d31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(org.telegram.ui.Components.d31.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.c0(3);
        }
        int i10 = this.f35852b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        uy uyVar = ((yx) this.f35853c).f43259f0;
        ArrayList arrayList = uyVar.R1;
        if (arrayList != null && (i10 = this.f35852b) >= 0 && i10 < arrayList.size()) {
            uyVar.R1.add(i10, dialog);
            uyVar.f41286e0[0].q(true);
        }
    }

    private final void e() {
        sy syVar = (sy) this.f35853c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        ty tyVar = syVar.f40597g;
        uy uyVar = syVar.h;
        uyVar.S1 = true;
        uyVar.getMessagesController().addDialogToFolder(dialog.f19900id, 0, this.f35852b, 0L);
        uyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = uyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = uyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                uyVar.A4(true, true);
                tyVar.f40894x.D();
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
                tyVar.f40894x.D();
                tyVar.q(true);
                return;
            }
            return;
        }
        tyVar.q(false);
    }

    private final void f() {
        j60 j60Var = (j60) this.f35853c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new ba(j60Var, this.f35852b, 5));
        b2VarArr[0].show();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dm.run():void");
    }

    public dm(Object obj, int i10, Object obj2, int i11) {
        this.f35851a = i11;
        this.f35853c = obj;
        this.f35852b = i10;
        this.d = obj2;
    }

    public dm(Object obj, Object obj2, int i10, int i11) {
        this.f35851a = i11;
        this.f35853c = obj;
        this.d = obj2;
        this.f35852b = i10;
    }
}
