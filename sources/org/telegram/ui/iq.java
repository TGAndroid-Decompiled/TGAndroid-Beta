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
    public final int f37952a;
    public final boolean f37953b;
    public final NotificationCenter.NotificationCenterDelegate f37954c;
    public final Object d;

    public iq(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.f37952a = i10;
        this.f37954c = notificationCenterDelegate;
        this.d = obj;
        this.f37953b = z10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        switch (this.f37952a) {
            case 0:
                jr jrVar = (jr) this.f37954c;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    jrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    return;
                }
                jrVar.getClass();
                if (tL_error != null) {
                    q8Var.setChecked(this.f37953b);
                    org.telegram.ui.Components.xc.a0(jrVar).f0(tL_error, false);
                    return;
                }
                return;
            default:
                zh.i0 i0Var = (zh.i0) this.f37954c;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = i0Var.f51738a;
                zh.u0 u0Var = i0Var.f51739b;
                boolean z10 = false;
                if (i0Var.f51742n == ((int[]) this.d)[0] && !i0Var.E) {
                    i0Var.f51742n = 0;
                    boolean z11 = this.f37953b;
                    boolean z12 = true;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str2 = null;
                        if (tL_error2 != null) {
                            str = tL_error2.text;
                        } else {
                            str = null;
                        }
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = i0Var.f51741f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if (tL_exportedNoPaidMessagesToken2.expires == 0) {
                                z12 = false;
                            }
                            if (z12 == z11) {
                                if (str != null) {
                                    u0Var.getClass();
                                    u0Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    return;
                                }
                                return;
                            }
                        }
                        i0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (u0Var.f52060v0) {
                            if (str != null) {
                                str2 = LocaleController.getString(R.string.ErrorOccurred);
                            }
                            u0Var.U0(str2);
                            return;
                        } else if (str != null) {
                            u0Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
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
                            i0Var.f51741f = tL_exportedNoPaidMessagesToken;
                            i0Var.h = SystemClock.elapsedRealtime();
                            u0Var.setFreeLink(i0Var.c(tL_exportedNoPaidMessagesToken));
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
