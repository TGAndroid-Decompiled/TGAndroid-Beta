package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class bl implements Runnable {
    public final int f24672a;
    public final int f24673b;
    public final Object f24674c;
    public final Object d;

    public bl(int i10, Object obj, Object obj2, int i11) {
        this.f24672a = i11;
        this.f24673b = i10;
        this.f24674c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new w21((f31) this.f24674c, (dq) this.d, this.f24673b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 1));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.f24674c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = o41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(o41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.e0(3);
        }
        int i10 = this.f24673b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.vy vyVar = ((org.telegram.ui.zx) this.f24674c).f44933f0;
        ArrayList arrayList = vyVar.R1;
        if (arrayList != null && (i10 = this.f24673b) >= 0 && i10 < arrayList.size()) {
            vyVar.R1.add(i10, dialog);
            vyVar.f42905e0[0].q(true);
        }
    }

    private final void e() {
        org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f24674c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.uy uyVar = tyVar.f42316g;
        org.telegram.ui.vy vyVar = tyVar.h;
        vyVar.S1 = true;
        vyVar.getMessagesController().addDialogToFolder(dialog.f19807id, 0, this.f24673b, 0L);
        vyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = vyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = vyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                vyVar.x4(true, true);
                uyVar.f42622x.D();
                uyVar.q(true);
                vyVar.l3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    vyVar.x4(true, true);
                    uyVar.q(true);
                    vyVar.l3();
                    return;
                }
                if (!vyVar.R1.isEmpty()) {
                    vyVar.R1.remove(0);
                }
                uyVar.f42622x.D();
                uyVar.q(true);
                return;
            }
            return;
        }
        uyVar.q(false);
    }

    private final void f() {
        org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.f24674c;
        org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var == null) {
            return;
        }
        a2Var.setOnCancelListener(new org.telegram.ui.fa(i60Var, this.f24673b, 5));
        a2VarArr[0].show();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bl.run():void");
    }

    public bl(Object obj, int i10, Object obj2, int i11) {
        this.f24672a = i11;
        this.f24674c = obj;
        this.f24673b = i10;
        this.d = obj2;
    }

    public bl(Object obj, Object obj2, int i10, int i11) {
        this.f24672a = i11;
        this.f24674c = obj;
        this.d = obj2;
        this.f24673b = i10;
    }
}
