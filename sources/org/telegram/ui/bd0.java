package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bd0 implements RequestDelegate {
    public final int f36031a;
    public final dd0 f36032b;

    public bd0(dd0 dd0Var, int i10) {
        this.f36031a = i10;
        this.f36032b = dd0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36031a) {
            case 0:
                final dd0 dd0Var = this.f36032b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dd0 dd0Var2 = dd0Var;
                        switch (i11) {
                            case 0:
                                dd0Var2.getClass();
                                if (tL_error2 == null) {
                                    dd0Var2.f36565n = (TL_account.Password) tLObject2;
                                    dd0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                gf0 gf0Var = dd0Var2.D;
                                gf0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (gf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f33282a |= 256;
                                            obj.f33283b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f33284c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.a01(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.dd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(21, dd0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = gf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.z(tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131742885, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                    return;
                                }
                            default:
                                gf0 gf0Var2 = dd0Var2.D;
                                dd0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bd0(dd0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    gf0Var2.E1(false, true);
                                    dd0Var2.postDelayed(new y60(19, dd0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    gf0Var2.t1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (gf0Var2.getParentActivity() != null) {
                                            dd0Var2.f36561a.setText("");
                                            gf0.b1(gf0Var2, dd0Var2.f36570y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final dd0 dd0Var2 = this.f36032b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dd0 dd0Var22 = dd0Var2;
                        switch (i11) {
                            case 0:
                                dd0Var22.getClass();
                                if (tL_error2 == null) {
                                    dd0Var22.f36565n = (TL_account.Password) tLObject2;
                                    dd0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                gf0 gf0Var = dd0Var22.D;
                                gf0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (gf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f33282a |= 256;
                                            obj.f33283b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f33284c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.a01(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.dd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(21, dd0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = gf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.z(tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131742885, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                    return;
                                }
                            default:
                                gf0 gf0Var2 = dd0Var22.D;
                                dd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bd0(dd0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    gf0Var2.E1(false, true);
                                    dd0Var22.postDelayed(new y60(19, dd0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    gf0Var2.t1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (gf0Var2.getParentActivity() != null) {
                                            dd0Var22.f36561a.setText("");
                                            gf0.b1(gf0Var2, dd0Var22.f36570y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final dd0 dd0Var3 = this.f36032b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dd0 dd0Var22 = dd0Var3;
                        switch (i11) {
                            case 0:
                                dd0Var22.getClass();
                                if (tL_error2 == null) {
                                    dd0Var22.f36565n = (TL_account.Password) tLObject2;
                                    dd0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                gf0 gf0Var = dd0Var22.D;
                                gf0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (gf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f33282a |= 256;
                                            obj.f33283b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f33284c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.a01(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.dd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(21, dd0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = gf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                    int intValue = Utilities.z(tL_error2.text).intValue();
                                    if (intValue < 60) {
                                        G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131742885, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                    return;
                                }
                            default:
                                gf0 gf0Var2 = dd0Var22.D;
                                dd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bd0(dd0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    gf0Var2.E1(false, true);
                                    dd0Var22.postDelayed(new y60(19, dd0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    gf0Var2.t1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (gf0Var2.getParentActivity() != null) {
                                            dd0Var22.f36561a.setText("");
                                            gf0.b1(gf0Var2, dd0Var22.f36570y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
        }
    }
}
