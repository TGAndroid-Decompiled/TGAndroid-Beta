package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e21 implements RequestDelegate {
    public final int f44861a;
    public final SessionsActivity f44862b;

    public e21(SessionsActivity sessionsActivity, int i3) {
        this.f44861a = i3;
        this.f44862b = sessionsActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f44861a) {
            case 0:
                org.telegram.messenger.g0.h3(new pu0(this.f44862b, 18));
                return;
            case 1:
                final SessionsActivity sessionsActivity = this.f44862b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (i3) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.k5.o(null, 2131754285, org.telegram.ui.Components.fc.a0(sessionsActivity2), 2131623989, 36);
                                    } else {
                                        org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(sessionsActivity2), 2131624011, 36);
                                    }
                                    sessionsActivity2.p0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.fc.a0(sessionsActivity2), 2131623989, 36);
                                    sessionsActivity2.p0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.fc.a0(sessionsActivity2), 2131623989, 36);
                                    sessionsActivity2.p0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i3 = 0; i3 < 4; i3++) {
                    org.telegram.messenger.h10 i10 = org.telegram.messenger.h10.i(i3);
                    if (i10.p()) {
                        i10.d = false;
                        i10.v(false);
                        org.telegram.messenger.hp.s1(i3).Z3(org.telegram.messenger.az.f21626f, org.telegram.messenger.az.f21629g);
                        ConnectionsManager.getInstance(i3).setUserId(i10.e());
                    }
                }
                return;
            case 2:
                final SessionsActivity sessionsActivity2 = this.f44862b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i32 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                        switch (i32) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.k5.o(null, 2131754285, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131623989, 36);
                                    } else {
                                        org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131624011, 36);
                                    }
                                    sessionsActivity22.p0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.p0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.p0(false);
                                    return;
                                }
                                return;
                        }
                    }
                });
                for (int i11 = 0; i11 < 4; i11++) {
                    org.telegram.messenger.h10 i12 = org.telegram.messenger.h10.i(i11);
                    if (i12.p()) {
                        i12.d = false;
                        i12.v(false);
                        org.telegram.messenger.hp.s1(i11).Z3(org.telegram.messenger.az.f21626f, org.telegram.messenger.az.f21629g);
                        ConnectionsManager.getInstance(i11).setUserId(i12.e());
                    }
                }
                return;
            default:
                final SessionsActivity sessionsActivity3 = this.f44862b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i32 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity3;
                        switch (i32) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.k5.o(null, 2131754285, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131623989, 36);
                                    } else {
                                        org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131624011, 36);
                                    }
                                    sessionsActivity22.p0(false);
                                    return;
                                }
                                return;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.p0(false);
                                    return;
                                }
                                return;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.k5.o(null, 2131754290, org.telegram.ui.Components.fc.a0(sessionsActivity22), 2131623989, 36);
                                    sessionsActivity22.p0(false);
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
