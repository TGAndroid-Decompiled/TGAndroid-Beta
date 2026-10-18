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
    public final int f37970a;
    public final boolean f37971b;
    public final NotificationCenter.NotificationCenterDelegate f37972c;
    public final Object d;

    public iq(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.f37970a = i10;
        this.f37972c = notificationCenterDelegate;
        this.d = obj;
        this.f37971b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f37970a) {
            case 0:
                jr jrVar = (jr) this.f37972c;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    jrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                jrVar.getClass();
                if (tL_error != null) {
                    q8Var.setChecked(this.f37971b);
                    org.telegram.ui.Components.xc.a0(jrVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                zh.i0 i0Var = (zh.i0) this.f37972c;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = i0Var.f51783a;
                zh.t0 t0Var = i0Var.f51784b;
                boolean z10 = false;
                if (i0Var.f51787n == ((int[]) this.d)[0] && !i0Var.E) {
                    i0Var.f51787n = 0;
                    boolean z11 = this.f37971b;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error2 != null) {
                            str = tL_error2.text;
                        } else {
                            str = null;
                        }
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = i0Var.f51786f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    t0Var.getClass();
                                    t0Var.c1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    return;
                                }
                                return;
                            }
                        }
                        i0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (t0Var.f52101v0) {
                            if (str != null) {
                                str2 = LocaleController.getString(R.string.ErrorOccurred);
                            }
                            t0Var.T0(str2);
                            return;
                        } else if (str != null) {
                            t0Var.c1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i11 = i0Var.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            i0Var.f51786f = tL_exportedNoPaidMessagesToken;
                            i0Var.h = SystemClock.elapsedRealtime();
                            t0Var.setFreeLink(i0Var.c(tL_exportedNoPaidMessagesToken));
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
