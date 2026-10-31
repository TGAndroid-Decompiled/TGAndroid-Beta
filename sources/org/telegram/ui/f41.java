package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f41 implements RequestDelegate {
    public final int f37177a;
    public final SessionsActivity f37178b;

    public f41(SessionsActivity sessionsActivity, int i10) {
        this.f37177a = i10;
        this.f37178b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37177a) {
            case 0:
                org.telegram.messenger.i0.g3(new wv0(this.f37178b, 21));
                return;
            case 1:
                final SessionsActivity sessionsActivity = this.f37178b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (i10) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.m5.n(null, 2131754285, org.telegram.ui.Components.cc.a0(sessionsActivity2), 2131623989, 36);
                                    } else {
                                        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(sessionsActivity2), 2131624011, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity2), 2131623989, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity2), 2131623989, 36);
                                    sessionsActivity2.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i10 = 0; i10 < 4; i10++) {
                    org.telegram.messenger.d20 i11 = org.telegram.messenger.d20.i(i10);
                    if (i11.p()) {
                        i11.d = false;
                        i11.v(false);
                        org.telegram.messenger.vp.r1(i10).W3(org.telegram.messenger.tz.f18144f, org.telegram.messenger.tz.f18147g);
                        ConnectionsManager.getInstance(i10).setUserId(i11.e());
                    }
                }
                return;
            case 2:
                final SessionsActivity sessionsActivity2 = this.f37178b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i102 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                        switch (i102) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.m5.n(null, 2131754285, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131623989, 36);
                                    } else {
                                        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131624011, 36);
                                    }
                                    sessionsActivity22.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i12 = 0; i12 < 4; i12++) {
                    org.telegram.messenger.d20 i13 = org.telegram.messenger.d20.i(i12);
                    if (i13.p()) {
                        i13.d = false;
                        i13.v(false);
                        org.telegram.messenger.vp.r1(i12).W3(org.telegram.messenger.tz.f18144f, org.telegram.messenger.tz.f18147g);
                        ConnectionsManager.getInstance(i12).setUserId(i13.e());
                    }
                }
                return;
            default:
                final SessionsActivity sessionsActivity3 = this.f37178b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i102 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity3;
                        switch (i102) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.m5.n(null, 2131754285, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131623989, 36);
                                    } else {
                                        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131624011, 36);
                                    }
                                    sessionsActivity22.o0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.o0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.o0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
