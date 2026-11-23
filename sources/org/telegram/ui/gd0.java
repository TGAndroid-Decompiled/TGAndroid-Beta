package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.CallReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gd0 extends org.telegram.ui.Components.hu0 implements org.telegram.messenger.fs {
    public static final int f48246w0 = 0;
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.qh0 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final org.telegram.ui.Components.nh0 Q;
    public final org.telegram.ui.Components.nh0 R;
    public final org.telegram.ui.Components.nh0 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final org.telegram.ui.Components.nh0 f48247a;
    public final Object f48248a0;
    public String f48249b;
    public int f48250b0;
    public String f48251c;
    public int f48252c0;
    public String d;
    public double f48253d0;
    public String f48254e;
    public double f48255e0;
    public final br f48256f;
    public boolean f48257f0;
    public boolean f48258g0;
    public final db0 h;
    public String f48259h0;
    public final int f48260i0;
    public int f48261j0;
    public int f48262k0;
    public boolean f48263l0;
    public String m0;
    public final TextView f48264n;
    public String f48265n0;
    public String f48266o0;
    public int f48267p0;
    public String f48268q0;
    public final TextView f48269r;
    public Bundle f48270r0;
    public final org.telegram.ui.Components.qh0 f48271s;
    public TLRPC.TL_auth_sentCode f48272s0;
    public boolean f48273t0;
    public final sc0 f48274u0;
    public final de0 f48275v0;
    public final ed0 f48276w;
    public final nb0 f48277x;
    public final ed0 f48278y;

    public gd0(org.telegram.ui.de0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd0.<init>(org.telegram.ui.de0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.gd0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd0.n(org.telegram.ui.gd0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.nh0 nh0Var) {
        if (nh0Var != null) {
            nh0Var.Q(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.n6.G6;
            nh0Var.Q(org.telegram.ui.ActionBar.n6.x0(null, i7, false), "Phone");
            nh0Var.Q(org.telegram.ui.ActionBar.n6.x0(null, i7, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f10;
        ed0 ed0Var = this.f48278y;
        if (ed0Var != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (ed0Var.getAlpha() != f10) {
                ed0Var.animate().cancel();
                ed0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f48260i0 != 3) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        int i7;
        de0 de0Var = this.f48275v0;
        if (de0Var.G != 0) {
            de0Var.finishFragment();
            return false;
        }
        int i10 = this.f48262k0;
        if (i10 != 0) {
            de0Var.M1(i10, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131751251, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("EditNumberInfo", null, 2131751250, this.f48249b));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752029, null), null);
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751323, null), new uc0(this, 0));
            de0Var.showDialog(t1Var);
            return false;
        } else {
            this.f48258g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f48251c;
            i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new fi.l5(23), 10);
            u();
            t();
            this.I = null;
            int i11 = org.telegram.messenger.ks.f25236j4;
            int i12 = this.f48260i0;
            if (i12 == 15) {
                org.telegram.messenger.ks.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.C3(false);
                org.telegram.messenger.ks.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.B3(false);
                org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25242k4);
            }
            this.f48257f0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f48258g0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f48257f0) {
            br brVar = this.f48256f;
            if (brVar.f46491f != null) {
                if (i7 == org.telegram.messenger.ks.f25236j4) {
                    brVar.setText("" + objArr[0]);
                    h(null);
                } else if (i7 == org.telegram.messenger.ks.f25242k4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.m0, str)) {
                        if (!this.m0.equals("*")) {
                            this.f48266o0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f22709a;
                        org.telegram.messenger.bz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void e() {
        int i7 = org.telegram.messenger.ks.f25236j4;
        int i10 = this.f48260i0;
        if (i10 == 15) {
            org.telegram.messenger.ks.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25242k4);
        }
        this.f48257f0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f48263l0 = false;
        this.f48258g0 = false;
        if (this.f48262k0 != 0 && (bundle = this.I) != null) {
            bundle.putInt("timeout", this.f48250b0);
        }
    }

    @Override
    public String getHeaderName() {
        int i7 = this.f48260i0;
        if (i7 != 3 && i7 != 11) {
            return org.telegram.messenger.gd.N0(2131742556, "YourCode");
        }
        return this.f48249b;
    }

    @Override
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        de0 de0Var = this.f48275v0;
        int i12 = de0Var.f47049a;
        if (i12 == 11) {
            if (this.f48258g0) {
                return;
            }
        } else if (!this.f48258g0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        br brVar = this.f48256f;
        if (str == null) {
            str = brVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            de0.c1(de0Var, brVar, false);
            return;
        }
        int i14 = de0Var.f47049a;
        if (i14 < 1 || i14 > 4 || !brVar.f46490e) {
            this.f48258g0 = true;
            int i15 = org.telegram.messenger.ks.f25236j4;
            int i16 = this.f48260i0;
            if (i16 == 15) {
                org.telegram.messenger.ks.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.C3(false);
                org.telegram.messenger.ks.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25242k4);
            }
            this.f48257f0 = false;
            int i17 = de0Var.G;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f48251c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    brVar.f46490e = true;
                    er[] erVarArr = brVar.f46491f;
                    int length = erVarArr.length;
                    while (i13 < length) {
                        erVarArr[i13].B(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new tc0(this, tL_auth_signIn, 0), 10));
                    de0Var.N1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f48251c;
                u();
                brVar.f46490e = true;
                er[] erVarArr2 = brVar.f46491f;
                int length2 = erVarArr2.length;
                while (i13 < length2) {
                    erVarArr2[i13].B(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                de0Var.N1(true, true);
                return;
            }
            this.d = de0Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f48251c;
            u();
            brVar.f46490e = true;
            er[] erVarArr3 = brVar.f46491f;
            int length3 = erVarArr3.length;
            while (i13 < length3) {
                erVarArr3[i13].B(0.0f);
                i13++;
            }
            i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new d00(11, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.nh0 nh0Var = this.f48247a;
        if (nh0Var != null) {
            nh0Var.M(0);
        }
        org.telegram.messenger.g0.h3(new sc0(this, 0), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.f48260i0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f48266o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            br brVar = this.f48256f;
            if (brVar.f46491f != null) {
                brVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f48250b0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.W = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48256f.getCode();
        int length = code.length();
        int i7 = this.f48260i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.f48266o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(i5.c.i(i7, "smsview_params_"), this.I);
        }
        int i10 = this.f48250b0;
        if (i10 != 0) {
            bundle.putInt("time", i10);
        }
        int i11 = this.W;
        if (i11 != 0) {
            bundle.putInt("open", i11);
        }
    }

    @Override
    public final void m(android.os.Bundle r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        br brVar = this.f48256f;
        if (brVar != null && (erVarArr = brVar.f46491f) != null) {
            for (er erVar : erVarArr) {
                if (a() && !org.telegram.messenger.g0.C1()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                erVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f48274u0);
    }

    public final void p(Runnable runnable) {
        if (this.f48260i0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            br brVar = this.f48256f;
            er[] erVarArr = brVar.f46491f;
            if (i7 < erVarArr.length) {
                brVar.postDelayed(new xc0(this, i7, 2), i7 * 75);
                i7++;
            } else {
                brVar.postDelayed(new bd0(0, this, runnable), (erVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.V != null) {
            return;
        }
        this.f48252c0 = 15000;
        int i7 = this.f48250b0;
        if (i7 > 15000) {
            this.f48252c0 = i7;
        }
        this.V = new Timer();
        this.f48255e0 = System.currentTimeMillis();
        this.V.schedule(new fd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.U != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.D6;
        ed0 ed0Var = this.f48276w;
        org.telegram.ui.ActionBar.u6.U(ed0Var, i7, null);
        ed0Var.setTag(2131296388, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new fd0(this, 1), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.f48248a0) {
                Timer timer = this.V;
                if (timer != null) {
                    timer.cancel();
                    this.V = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void u() {
        ed0 ed0Var = this.f48276w;
        int i7 = org.telegram.ui.ActionBar.n6.D6;
        org.telegram.ui.ActionBar.u6.U(ed0Var, i7, null);
        this.f48276w.setTag(2131296388, Integer.valueOf(i7));
        try {
            synchronized (this.f48248a0) {
                Timer timer = this.U;
                if (timer != null) {
                    timer.cancel();
                    this.U = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f48275v0.A1()) {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        TextView textView = this.f48264n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P9, false));
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        this.f48269r.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        int i11 = this.f48260i0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.n6.f29843y6;
            this.K.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
            this.L.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29598l6, false);
            int i13 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            de0.u1(this.M, x03, i13, mode);
            this.O = x03;
            int x04 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            de0.u1(this.N, x04, this.P, mode);
            this.P = x04;
            this.J.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        }
        q(this.f48247a);
        q(this.Q);
        q(this.R);
        q(this.S);
        br brVar = this.f48256f;
        if (brVar != null) {
            brVar.invalidate();
        }
        ed0 ed0Var = this.f48276w;
        Integer num = (Integer) ed0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.n6.D6);
        }
        ed0Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f48278y.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29691q6, false));
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29692q7, false));
    }

    public final void v() {
        int i7;
        if (!this.f48258g0 && !this.f48263l0) {
            de0 de0Var = this.f48275v0;
            if (!de0Var.f47072r0) {
                this.f48263l0 = true;
                this.f48276w.invalidate();
                this.f48278y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f48249b);
                bundle.putString("ephone", this.f48254e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f48260i0);
                this.f48258g0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f48251c;
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new wc0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        br brVar = this.f48256f;
        try {
            brVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            er[] erVarArr = brVar.f46491f;
            if (i7 >= erVarArr.length) {
                break;
            }
            erVarArr[i7].setText("");
            brVar.f46491f[i7].A(1.0f);
            i7++;
        }
        nb0 nb0Var = this.f48277x;
        if (nb0Var.getCurrentView() != this.F) {
            nb0Var.showNext();
        }
        brVar.f46491f[0].requestFocus();
        if (this.f48260i0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.E3(f10, brVar, new sc0(this, 7));
        sc0 sc0Var = this.f48274u0;
        removeCallbacks(sc0Var);
        postDelayed(sc0Var, 5000L);
        this.f48273t0 = true;
    }

    public final void y(boolean z10) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.f48271s.setAutoRepeat(false);
            org.telegram.ui.Components.nh0 nh0Var = this.R;
            nh0Var.K(0);
            nh0Var.S(nh0Var.f37805e[0] - 1, new sc0(this, 1));
            return;
        }
        this.f48275v0.C1(z10, true);
    }

    public final void z(int i7) {
        org.telegram.ui.Components.nh0 nh0Var = this.Q;
        if (nh0Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            org.telegram.ui.Components.nh0 nh0Var2 = this.f48247a;
            if (nh0Var2.f37801b0 != nh0Var2.f37805e[0] - 1) {
                nh0Var2.f37825u0 = new xc0(this, i7, 0);
                return;
            }
            nh0Var.f37825u0 = new sc0(this, 3);
            org.telegram.ui.Components.qh0 qh0Var = this.f48271s;
            qh0Var.setAutoRepeat(false);
            nh0Var.N(0, false, false);
            qh0Var.setAnimation(nh0Var);
            qh0Var.d();
            return;
        }
        this.f48275v0.F1(i7, true);
    }
}
