package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class zk implements Runnable {
    public final int f33646a;
    public final int f33647b;
    public final Object f33648c;
    public final Object d;

    public zk(int i10, Object obj, Object obj2, int i11) {
        this.f33646a = i11;
        this.f33647b = i10;
        this.f33648c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new r21((a31) this.f33648c, (bq) this.d, this.f33647b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 1));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.f33648c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = k41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(k41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.g0(3);
        }
        int i10 = this.f33647b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.sy syVar = ((org.telegram.ui.wx) this.f33648c).f43918f0;
        ArrayList arrayList = syVar.R1;
        if (arrayList != null && (i10 = this.f33647b) >= 0 && i10 < arrayList.size()) {
            syVar.R1.add(i10, dialog);
            syVar.f41941e0[0].q(true);
        }
    }

    private final void e() {
        org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f33648c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ry ryVar = qyVar.f41316g;
        org.telegram.ui.sy syVar = qyVar.h;
        syVar.S1 = true;
        syVar.getMessagesController().addDialogToFolder(dialog.f20072id, 0, this.f33647b, 0L);
        syVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = syVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = syVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                syVar.x4(true, true);
                ryVar.f41573x.D();
                ryVar.q(true);
                syVar.l3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    syVar.x4(true, true);
                    ryVar.q(true);
                    syVar.l3();
                    return;
                }
                if (!syVar.R1.isEmpty()) {
                    syVar.R1.remove(0);
                }
                ryVar.f41573x.D();
                ryVar.q(true);
                return;
            }
            return;
        }
        ryVar.q(false);
    }

    private final void f() {
        org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f33648c;
        org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var == null) {
            return;
        }
        a2Var.setOnCancelListener(new org.telegram.ui.ba(g60Var, this.f33647b, 5));
        a2VarArr[0].show();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zk.run():void");
    }

    public zk(Object obj, int i10, Object obj2, int i11) {
        this.f33646a = i11;
        this.f33648c = obj;
        this.f33647b = i10;
        this.d = obj2;
    }

    public zk(Object obj, Object obj2, int i10, int i11) {
        this.f33646a = i11;
        this.f33648c = obj;
        this.d = obj2;
        this.f33647b = i10;
    }
}
