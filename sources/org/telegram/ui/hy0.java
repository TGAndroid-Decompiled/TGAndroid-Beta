package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hy0 implements RequestDelegate {
    public final int f40009a;
    public final ProfileActivity f40010b;

    public hy0(ProfileActivity profileActivity, int i10) {
        this.f40009a = i10;
        this.f40010b = profileActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i10 = this.f40009a;
        final ProfileActivity profileActivity = this.f40010b;
        switch (i10) {
            case 0:
                int i11 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i12) {
                            case 0:
                                int i13 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                int i14 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i122 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i122) {
                            case 0:
                                int i13 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                int i14 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 2:
                int i13 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i122 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i122) {
                            case 0:
                                int i132 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                int i14 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 3:
                int i14 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i122 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i122) {
                            case 0:
                                int i132 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                int i142 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            case 2:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 != null) {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                    org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 4:
                int i15 = ProfileActivity.R6;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new by0(4, profileActivity, tLObject));
                    return;
                }
                return;
            default:
                if (tLObject instanceof TL_account.TL_password) {
                    profileActivity.H2 = (TL_account.TL_password) tLObject;
                    return;
                }
                int i16 = ProfileActivity.R6;
                profileActivity.getClass();
                return;
        }
    }
}
