package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class gq implements Utilities.Callback2 {
    public final int f37384a;
    public final boolean f37385b;
    public final NotificationCenter.NotificationCenterDelegate f37386c;
    public final Object d;

    public gq(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.f37384a = i10;
        this.f37386c = notificationCenterDelegate;
        this.d = obj;
        this.f37385b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f37384a) {
            case 0:
                hr hrVar = (hr) this.f37386c;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    hrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                hrVar.getClass();
                if (tL_error != null) {
                    q8Var.setChecked(this.f37385b);
                    org.telegram.ui.Components.xc.a0(hrVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                zh.q0 q0Var = (zh.q0) this.f37386c;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = q0Var.f52075a;
                zh.c1 c1Var = q0Var.f52076b;
                boolean z10 = false;
                if (q0Var.f52079n == ((int[]) this.d)[0] && !q0Var.E) {
                    q0Var.f52079n = 0;
                    boolean z11 = this.f37385b;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error2 != null) {
                            str = tL_error2.text;
                        } else {
                            str = null;
                        }
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = q0Var.f52078f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    c1Var.getClass();
                                    c1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    return;
                                }
                                return;
                            }
                        }
                        q0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (c1Var.f51907v0) {
                            if (str != null) {
                                str2 = LocaleController.getString(R.string.ErrorOccurred);
                            }
                            c1Var.U0(str2);
                            return;
                        } else if (str != null) {
                            c1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                            return;
                        } else {
                            return;
                        }
                    }
                    int i11 = q0Var.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            q0Var.f52078f = tL_exportedNoPaidMessagesToken;
                            q0Var.h = SystemClock.elapsedRealtime();
                            c1Var.setFreeLink(q0Var.d(tL_exportedNoPaidMessagesToken));
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
