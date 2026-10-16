package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class gm implements Runnable {
    public final int f36277a;
    public final int f36278b;
    public final Object f36279c;
    public final Object d;

    public gm(int i10, Object obj, Object obj2, int i11) {
        this.f36277a = i11;
        this.f36278b = i10;
        this.f36279c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n21((org.telegram.ui.Components.w21) this.f36279c, (org.telegram.ui.Components.yp) this.d, this.f36278b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 1));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.f36279c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = org.telegram.ui.Components.f41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(org.telegram.ui.Components.f41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.d0(3);
        }
        int i10 = this.f36278b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        yy yyVar = ((dy) this.f36279c).f35151f0;
        ArrayList arrayList = yyVar.R1;
        if (arrayList != null && (i10 = this.f36278b) >= 0 && i10 < arrayList.size()) {
            yyVar.R1.add(i10, dialog);
            yyVar.f42004e0[0].q(true);
        }
    }

    private final void d() {
        wy wyVar = (wy) this.f36279c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        xy xyVar = wyVar.f41380g;
        yy yyVar = wyVar.h;
        yyVar.S1 = true;
        yyVar.getMessagesController().addDialogToFolder(dialog.f18920id, 0, this.f36278b, 0L);
        yyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = yyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf >= 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = yyVar.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                yyVar.y4(true, true);
                xyVar.f41687x.D();
                xyVar.q(true);
                yyVar.m3();
            }
            if (dialogs2.isEmpty()) {
                dialogs.remove(0);
                if (indexOf == 1) {
                    yyVar.y4(true, true);
                    xyVar.q(true);
                    yyVar.m3();
                    return;
                }
                if (!yyVar.R1.isEmpty()) {
                    yyVar.R1.remove(0);
                }
                xyVar.f41687x.D();
                xyVar.q(true);
                return;
            }
            return;
        }
        xyVar.q(false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gm.run():void");
    }

    public gm(Object obj, int i10, Object obj2, int i11) {
        this.f36277a = i11;
        this.f36279c = obj;
        this.f36278b = i10;
        this.d = obj2;
    }

    public gm(Object obj, Object obj2, int i10, int i11) {
        this.f36277a = i11;
        this.f36279c = obj;
        this.d = obj2;
        this.f36278b = i10;
    }
}
