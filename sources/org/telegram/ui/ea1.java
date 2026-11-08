package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ea1 implements RequestDelegate {
    public final int f45250a;
    public final TwoStepVerificationActivity f45251b;

    public ea1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45250a = i7;
        this.f45251b = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45250a) {
            case 0:
                final TwoStepVerificationActivity twoStepVerificationActivity = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i7) {
                            case 0:
                                twoStepVerificationActivity2.t0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
                                    String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746070, null);
                                    twoStepVerificationActivity2.showDialog(u1Var, new q5(twoStepVerificationActivity2, 17));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = org.telegram.messenger.id.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = org.telegram.messenger.id.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = org.telegram.messenger.id.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.id.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity2.B0(org.telegram.messenger.id.M0(2131746096, null), org.telegram.messenger.id.a0("ResetPasswordWait", null, 2131746095, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.I.pending_reset_date = 0;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                }
                                twoStepVerificationActivity2.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i7) {
                            case 0:
                                twoStepVerificationActivity22.t0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
                                    String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746070, null);
                                    twoStepVerificationActivity22.showDialog(u1Var, new q5(twoStepVerificationActivity22, 17));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity22.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity22.D0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = org.telegram.messenger.id.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = org.telegram.messenger.id.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = org.telegram.messenger.id.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.id.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity22.B0(org.telegram.messenger.id.M0(2131746096, null), org.telegram.messenger.id.a0("ResetPasswordWait", null, 2131746095, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity22.I.pending_reset_date = 0;
                                    twoStepVerificationActivity22.D0();
                                    return;
                                }
                                twoStepVerificationActivity22.getClass();
                                return;
                        }
                    }
                });
                return;
            case 3:
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 4:
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 5:
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.f45251b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
