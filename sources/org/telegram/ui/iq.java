package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class iq implements Utilities.Callback2 {
    public final int f37954a;
    public final boolean f37955b;
    public final NotificationCenter.NotificationCenterDelegate f37956c;
    public final Object d;

    public iq(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.f37954a = i10;
        this.f37956c = notificationCenterDelegate;
        this.d = obj;
        this.f37955b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f37954a) {
            case 0:
                jr jrVar = (jr) this.f37956c;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    jrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                jrVar.getClass();
                if (tL_error != null) {
                    q8Var.setChecked(this.f37955b);
                    org.telegram.ui.Components.xc.a0(jrVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                zh.p0 p0Var = (zh.p0) this.f37956c;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = p0Var.f52076a;
                zh.b1 b1Var = p0Var.f52077b;
                boolean z10 = false;
                if (p0Var.f52080n == ((int[]) this.d)[0] && !p0Var.E) {
                    p0Var.f52080n = 0;
                    boolean z11 = this.f37955b;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error2 != null) {
                            str = tL_error2.text;
                        } else {
                            str = null;
                        }
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = p0Var.f52079f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    b1Var.getClass();
                                    b1Var.W0(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    return;
                                }
                                return;
                            }
                        }
                        p0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (b1Var.f51874v0) {
                            if (str != null) {
                                str2 = LocaleController.getString(R.string.ErrorOccurred);
                            }
                            b1Var.N0(str2);
                            return;
                        } else if (str != null) {
                            b1Var.W0(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i11 = p0Var.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            p0Var.f52079f = tL_exportedNoPaidMessagesToken;
                            p0Var.h = SystemClock.elapsedRealtime();
                            b1Var.setFreeLink(p0Var.c(tL_exportedNoPaidMessagesToken));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
