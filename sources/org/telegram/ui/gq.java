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
    public final int f37391a;
    public final boolean f37392b;
    public final NotificationCenter.NotificationCenterDelegate f37393c;
    public final Object d;

    public gq(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.f37391a = i10;
        this.f37393c = notificationCenterDelegate;
        this.d = obj;
        this.f37392b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f37391a) {
            case 0:
                hr hrVar = (hr) this.f37393c;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    hrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                hrVar.getClass();
                if (tL_error != null) {
                    q8Var.setChecked(this.f37392b);
                    org.telegram.ui.Components.xc.a0(hrVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                zh.r0 r0Var = (zh.r0) this.f37393c;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = r0Var.f52093a;
                zh.c1 c1Var = r0Var.f52094b;
                boolean z10 = false;
                if (r0Var.f52097n == ((int[]) this.d)[0] && !r0Var.E) {
                    r0Var.f52097n = 0;
                    boolean z11 = this.f37392b;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error2 != null) {
                            str = tL_error2.text;
                        } else {
                            str = null;
                        }
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = r0Var.f52096f;
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
                        r0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (c1Var.f51912v0) {
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
                    int i11 = r0Var.d;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            z10 = true;
                        }
                        if (z11 == z10) {
                            if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                            }
                            r0Var.f52096f = tL_exportedNoPaidMessagesToken;
                            r0Var.h = SystemClock.elapsedRealtime();
                            c1Var.setFreeLink(r0Var.d(tL_exportedNoPaidMessagesToken));
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
