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
public final class cd0 implements RequestDelegate {
    public final int f36443a;
    public final ed0 f36444b;

    public cd0(ed0 ed0Var, int i10) {
        this.f36443a = i10;
        this.f36444b = ed0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36443a) {
            case 0:
                final ed0 ed0Var = this.f36444b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ed0 ed0Var2 = ed0Var;
                        switch (i11) {
                            case 0:
                                ed0Var2.getClass();
                                if (tL_error2 == null) {
                                    ed0Var2.f37027n = (TL_account.Password) tLObject2;
                                    ed0Var2.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                hf0 hf0Var = ed0Var2.D;
                                hf0Var.s1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (hf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f32850a |= 256;
                                            obj.f32851b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f32852c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.zz0(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.cd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(21, ed0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = hf0Var.showDialog(x1Var);
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
                                        G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131742885, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    return;
                                }
                            default:
                                hf0 hf0Var2 = ed0Var2.D;
                                ed0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new cd0(ed0Var2, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    hf0Var2.D1(false, true);
                                    ed0Var2.postDelayed(new f70(18, ed0Var2, tLObject2), 150L);
                                    return;
                                } else {
                                    hf0Var2.s1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (hf0Var2.getParentActivity() != null) {
                                            ed0Var2.f37023a.setText("");
                                            hf0.a1(hf0Var2, ed0Var2.f37032y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            case 1:
                final ed0 ed0Var2 = this.f36444b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ed0 ed0Var22 = ed0Var2;
                        switch (i11) {
                            case 0:
                                ed0Var22.getClass();
                                if (tL_error2 == null) {
                                    ed0Var22.f37027n = (TL_account.Password) tLObject2;
                                    ed0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                hf0 hf0Var = ed0Var22.D;
                                hf0Var.s1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (hf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f32850a |= 256;
                                            obj.f32851b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f32852c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.zz0(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.cd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(21, ed0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = hf0Var.showDialog(x1Var);
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
                                        G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131742885, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    return;
                                }
                            default:
                                hf0 hf0Var2 = ed0Var22.D;
                                ed0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new cd0(ed0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    hf0Var2.D1(false, true);
                                    ed0Var22.postDelayed(new f70(18, ed0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    hf0Var2.s1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (hf0Var2.getParentActivity() != null) {
                                            ed0Var22.f37023a.setText("");
                                            hf0.a1(hf0Var2, ed0Var22.f37032y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                        return;
                                    }
                                }
                        }
                    }
                });
                return;
            default:
                final ed0 ed0Var3 = this.f36444b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        String G2;
                        int i10;
                        int i11 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ed0 ed0Var22 = ed0Var3;
                        switch (i11) {
                            case 0:
                                ed0Var22.getClass();
                                if (tL_error2 == null) {
                                    ed0Var22.f37027n = (TL_account.Password) tLObject2;
                                    ed0Var22.h(null);
                                    return;
                                }
                                return;
                            case 1:
                                hf0 hf0Var = ed0Var22.D;
                                hf0Var.s1(false, true);
                                if (tL_error2 == null) {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (hf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            ?? obj = new Object();
                                            obj.f32850a |= 256;
                                            obj.f32851b = indexOf;
                                            int i12 = lastIndexOf + 1;
                                            obj.f32852c = i12;
                                            valueOf.setSpan(new org.telegram.ui.Components.zz0(obj, 0), indexOf, i12, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.cd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(21, ed0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = hf0Var.showDialog(x1Var);
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
                                        G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                                    }
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131742885, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                                    return;
                                } else {
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    return;
                                }
                            default:
                                hf0 hf0Var2 = ed0Var22.D;
                                ed0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new cd0(ed0Var22, 0), 8);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                    hf0Var2.D1(false, true);
                                    ed0Var22.postDelayed(new f70(18, ed0Var22, tLObject2), 150L);
                                    return;
                                } else {
                                    hf0Var2.s1(false, true);
                                    if (tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (hf0Var2.getParentActivity() != null) {
                                            ed0Var22.f37023a.setText("");
                                            hf0.a1(hf0Var2, ed0Var22.f37032y, true);
                                            return;
                                        }
                                        return;
                                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        int intValue2 = Utilities.z(tL_error2.text).intValue();
                                        if (intValue2 < 60) {
                                            G2 = org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]);
                                        } else {
                                            G2 = org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0]);
                                        }
                                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G2));
                                        return;
                                    } else {
                                        hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
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
