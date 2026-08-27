package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class px0 implements RequestDelegate {

    public final int f41440a;

    public final ProfileActivity f41441b;

    public px0(ProfileActivity profileActivity, int i10) {
        this.f41440a = i10;
        this.f41441b = profileActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41440a) {
            case 0:
                final int i10 = 1;
                final ProfileActivity profileActivity = this.f41441b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity), null);
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity), null);
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity), null);
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 3;
                final ProfileActivity profileActivity2 = this.f41441b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity2), null);
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity2), null);
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity2), null);
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity2), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 0;
                final ProfileActivity profileActivity3 = this.f41441b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity3), null);
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity3), null);
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity3), null);
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity3), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 2;
                final ProfileActivity profileActivity4 = this.f41441b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity4), null);
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity4), null);
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error4);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity4), null);
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.mc.b0(tL_error5);
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(profileActivity4), null);
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zs0(16, this.f41441b, tLObject));
                }
                break;
            default:
                boolean z10 = tLObject instanceof TL_account.TL_password;
                ProfileActivity profileActivity5 = this.f41441b;
                if (!z10) {
                    profileActivity5.getClass();
                } else {
                    profileActivity5.D2 = (TL_account.TL_password) tLObject;
                }
                break;
        }
    }
}
