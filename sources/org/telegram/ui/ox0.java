package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ox0 implements RequestDelegate {
    public final int f41235a;
    public final ProfileActivity f41236b;

    public ox0(ProfileActivity profileActivity, int i10) {
        this.f41235a = i10;
        this.f41236b = profileActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41235a) {
            case 0:
                final ProfileActivity profileActivity = this.f41236b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error4);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error5);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                final ProfileActivity profileActivity2 = this.f41236b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error4);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error5);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 2:
                final ProfileActivity profileActivity3 = this.f41236b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity3), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity3), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error4);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity3), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error5);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity3), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 3:
                final ProfileActivity profileActivity4 = this.f41236b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity4), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity4), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error4);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity4), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 != null) {
                                    org.telegram.ui.Components.tc.b0(tL_error5);
                                    return;
                                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.x3.s(R.string.UnknownError, org.telegram.ui.Components.tc.a0(profileActivity4), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 4:
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new av0(13, this.f41236b, tLObject));
                    return;
                }
                return;
            default:
                boolean z10 = tLObject instanceof TL_account.TL_password;
                ProfileActivity profileActivity5 = this.f41236b;
                if (z10) {
                    profileActivity5.D2 = (TL_account.TL_password) tLObject;
                    return;
                } else {
                    profileActivity5.getClass();
                    return;
                }
        }
    }
}
