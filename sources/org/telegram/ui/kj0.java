package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class kj0 implements RequestDelegate {
    public final int f46961a;
    public final mj0 f46962b;

    public kj0(mj0 mj0Var, int i3) {
        this.f46961a = i3;
        this.f46962b = mj0Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46961a) {
            case 0:
                org.telegram.messenger.g0.h3(new lj0(this.f46962b, tLObject, tL_error));
                return;
            case 1:
                final mj0 mj0Var = this.f46962b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        switch (r3) {
                            case 0:
                                mj0 mj0Var2 = mj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                yj0 yj0Var = mj0Var2.f47688e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new kj0(mj0Var2, 4), 8);
                                    return;
                                }
                                if (yj0Var.E == null) {
                                    yj0Var.E = new TL_account.authorizationForm();
                                }
                                mj0Var2.a();
                                return;
                            default:
                                mj0 mj0Var3 = mj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.d2) mj0Var3.f47688e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new kj0(mj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f21387e.c(new hc0(mj0Var3, mj0Var3.f47686b, mj0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final mj0 mj0Var2 = this.f46962b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        switch (r3) {
                            case 0:
                                mj0 mj0Var22 = mj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                yj0 yj0Var = mj0Var22.f47688e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new kj0(mj0Var22, 4), 8);
                                    return;
                                }
                                if (yj0Var.E == null) {
                                    yj0Var.E = new TL_account.authorizationForm();
                                }
                                mj0Var22.a();
                                return;
                            default:
                                mj0 mj0Var3 = mj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.d2) mj0Var3.f47688e).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword2, new kj0(mj0Var3, 3), 8);
                                    return;
                                }
                                Utilities.f21387e.c(new hc0(mj0Var3, mj0Var3.f47686b, mj0Var3.d, 15));
                                return;
                        }
                    }
                });
                return;
            case 3:
                org.telegram.messenger.g0.h3(new lj0(this.f46962b, tL_error, tLObject, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new lj0(this.f46962b, tL_error, tLObject, 2));
                return;
        }
    }
}
