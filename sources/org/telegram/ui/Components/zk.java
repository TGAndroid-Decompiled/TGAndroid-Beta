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
    public final int f33590a;
    public final int f33591b;
    public final Object f33592c;
    public final Object d;

    public zk(int i10, Object obj, Object obj2, int i11) {
        this.f33590a = i11;
        this.f33591b = i10;
        this.f33592c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new x21((z21) this.f33592c, (bq) this.d, this.f33591b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.f33592c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = j41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(j41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.g0(3);
        }
        int i10 = this.f33591b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ty tyVar = ((org.telegram.ui.xx) this.f33592c).f44157f0;
        ArrayList arrayList = tyVar.R1;
        if (arrayList != null && (i10 = this.f33591b) >= 0 && i10 < arrayList.size()) {
            tyVar.R1.add(i10, dialog);
            tyVar.f42172e0[0].q(true);
        }
    }

    private final void e() {
        org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.f33592c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.sy syVar = ryVar.f41539g;
        org.telegram.ui.ty tyVar = ryVar.h;
        tyVar.S1 = true;
        tyVar.getMessagesController().addDialogToFolder(dialog.f20042id, 0, this.f33591b, 0L);
        tyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = tyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = tyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                tyVar.x4(true, true);
                syVar.f41797x.D();
                syVar.q(true);
                tyVar.l3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    tyVar.x4(true, true);
                    syVar.q(true);
                    tyVar.l3();
                    return;
                }
                if (!tyVar.R1.isEmpty()) {
                    tyVar.R1.remove(0);
                }
                syVar.f41797x.D();
                syVar.q(true);
                return;
            }
            return;
        }
        syVar.q(false);
    }

    private final void f() {
        org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.f33592c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.ca(g60Var, this.f33591b, 5));
        b2VarArr[0].show();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zk.run():void");
    }

    public zk(Object obj, int i10, Object obj2, int i11) {
        this.f33590a = i11;
        this.f33592c = obj;
        this.f33591b = i10;
        this.d = obj2;
    }

    public zk(Object obj, Object obj2, int i10, int i11) {
        this.f33590a = i11;
        this.f33592c = obj;
        this.d = obj2;
        this.f33591b = i10;
    }
}
