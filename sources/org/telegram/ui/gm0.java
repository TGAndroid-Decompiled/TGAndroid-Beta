package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class gm0 extends org.telegram.ui.ActionBar.j {

    public final xm0 f38446a;

    public gm0(xm0 xm0Var) {
        this.f38446a = xm0Var;
    }

    @Override
    public final void b(int i10) {
        JSONObject jSONObject;
        String str;
        String string;
        xm0 xm0Var = this.f38446a;
        int i11 = xm0Var.f44482b;
        if (i10 == -1) {
            if (xm0Var.X0(true)) {
                return;
            }
            if (i11 == 0 || i11 == 5) {
                xm0Var.W0(false);
            }
            xm0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (xm0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(xm0Var.getParentActivity(), null);
            String string2 = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            int iIndexOf = string2.indexOf(42);
            int iLastIndexOf = string2.lastIndexOf(42);
            if (iIndexOf != -1 && iLastIndexOf != -1) {
                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), iIndexOf, iLastIndexOf - 1, 33);
            }
            p80Var.setText(spannableStringBuilder);
            p80Var.setTextSize(1, 16.0f);
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180k5, false));
            p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23197l5, false));
            p80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
            alertDialog$Builder.n(p80Var);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            xm0Var.showDialog(alertDialog$Builder.f22702a);
            return;
        }
        if (i10 == 2) {
            if (i11 == 5) {
                xm0Var.B1(false);
                return;
            }
            if (i11 == 7) {
                xm0Var.F1[xm0Var.E1].h(null);
                return;
            }
            zk0 zk0Var = new zk0(this, 3);
            i6 i6Var = new i6(8, this, zk0Var);
            if (i11 == 4) {
                if (xm0Var.f44493f) {
                    string = xm0Var.Z0;
                } else if (xm0.D0(xm0Var)) {
                    return;
                } else {
                    string = xm0Var.U[0].getText().toString();
                }
                ((bm0) xm0Var.f44534x1).c(xm0Var.A, string, null, null, null, null, null, null, null, null, zk0Var, i6Var);
            } else if (i11 == 3) {
                if (xm0Var.f44493f) {
                    str = UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).getCurrentUser().phone;
                } else {
                    if (xm0.D0(xm0Var)) {
                        return;
                    }
                    str = xm0Var.U[1].getText().toString() + xm0Var.U[2].getText().toString();
                }
                ((bm0) xm0Var.f44534x1).c(xm0Var.A, str, null, null, null, null, null, null, null, null, zk0Var, i6Var);
            } else if (i11 == 2) {
                if (!xm0Var.f44505k1.isEmpty() || xm0.D0(xm0Var)) {
                    return;
                }
                if (xm0Var.u1()) {
                    xm0Var.finishFragment();
                    return;
                }
                try {
                    if (xm0Var.f44518r0) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("street_line1", xm0Var.U[0].getText().toString());
                            jSONObject.put("street_line2", xm0Var.U[1].getText().toString());
                            jSONObject.put("post_code", xm0Var.U[2].getText().toString());
                            jSONObject.put("city", xm0Var.U[3].getText().toString());
                            jSONObject.put("state", xm0Var.U[4].getText().toString());
                            jSONObject.put("country_code", xm0Var.f44520s);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                HashMap map = xm0Var.f44522s1;
                if (map != null) {
                    map.clear();
                }
                HashMap map2 = xm0Var.f44524t1;
                if (map2 != null) {
                    map2.clear();
                }
                ((bm0) xm0Var.f44534x1).c(xm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, xm0Var.B, null, xm0Var.f44492e1, xm0Var.f44495f1, xm0Var.f44497g1, null, null, zk0Var, i6Var);
            } else if (i11 == 1) {
                if (!c(zk0Var, i6Var)) {
                    return;
                }
            } else if (i11 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = xm0Var.U[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(verifyemail, new gh.f1(this, zk0Var, i6Var, verifyemail, 14)), ((org.telegram.ui.ActionBar.n2) xm0Var).classGuid);
            }
            xm0Var.N1(true, true);
        }
    }

    public final boolean c(org.telegram.ui.zk0 r33, org.telegram.ui.i6 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gm0.c(org.telegram.ui.zk0, org.telegram.ui.i6):boolean");
    }
}
