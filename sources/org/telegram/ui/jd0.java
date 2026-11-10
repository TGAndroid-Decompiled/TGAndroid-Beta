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
public final class jd0 extends org.telegram.ui.Components.xt0 implements org.telegram.messenger.ls {
    public static final int f46957v0 = 0;
    public final FrameLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.ch0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.zg0 P;
    public final org.telegram.ui.Components.zg0 Q;
    public final org.telegram.ui.Components.zg0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.zg0 f46958a;
    public int f46959a0;
    public String f46960b;
    public int f46961b0;
    public String f46962c;
    public double f46963c0;
    public String d;
    public double f46964d0;
    public String f46965e;
    public boolean f46966e0;
    public final br f46967f;
    public boolean f46968f0;
    public String f46969g0;
    public final gb0 h;
    public final int f46970h0;
    public int f46971i0;
    public int f46972j0;
    public boolean f46973k0;
    public String f46974l0;
    public String m0;
    public final TextView f46975n;
    public String f46976n0;
    public int f46977o0;
    public String f46978p0;
    public Bundle f46979q0;
    public final TextView f46980r;
    public TLRPC.TL_auth_sentCode f46981r0;
    public final org.telegram.ui.Components.ch0 f46982s;
    public boolean f46983s0;
    public final xc0 f46984t0;
    public final fe0 f46985u0;
    public final hd0 f46986w;
    public final qb0 f46987x;
    public final hd0 f46988y;

    public jd0(org.telegram.ui.fe0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd0.<init>(org.telegram.ui.fe0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.jd0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd0.n(org.telegram.ui.jd0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.zg0 zg0Var) {
        if (zg0Var != null) {
            zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i7, false), "Phone");
            zg0Var.Q(org.telegram.ui.ActionBar.m6.x0(null, i7, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z9) {
        float f10;
        hd0 hd0Var = this.f46988y;
        if (hd0Var != null) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (hd0Var.getAlpha() != f10) {
                hd0Var.animate().cancel();
                hd0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f46970h0 != 3) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z9) {
        int i7;
        fe0 fe0Var = this.f46985u0;
        if (fe0Var.F != 0) {
            fe0Var.finishFragment();
            return false;
        }
        int i10 = this.f46972j0;
        if (i10 != 0) {
            fe0Var.M1(i10, true, null, true);
            return false;
        } else if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751263, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("EditNumberInfo", null, 2131751262, this.f46960b));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751335, null), new zc0(this, 0));
            fe0Var.showDialog(u1Var);
            return false;
        } else {
            this.f46968f0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f46962c;
            i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new di.v5(23), 10);
            u();
            t();
            this.H = null;
            int i11 = org.telegram.messenger.qs.f25010g4;
            int i12 = this.f46970h0;
            if (i12 == 15) {
                org.telegram.messenger.qs.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.D3(false);
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25016h4);
            }
            this.f46966e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f46968f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f46966e0) {
            br brVar = this.f46967f;
            if (brVar.f44118f != null) {
                if (i7 == org.telegram.messenger.qs.f25010g4) {
                    brVar.setText("" + objArr[0]);
                    h(null);
                } else if (i7 == org.telegram.messenger.qs.f25016h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.f46974l0, str)) {
                        if (!this.f46974l0.equals("*")) {
                            this.f46976n0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f21174a;
                        org.telegram.messenger.iz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = org.telegram.messenger.qs.f25010g4;
        int i10 = this.f46970h0;
        if (i10 == 15) {
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25016h4);
        }
        this.f46966e0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f46973k0 = false;
        this.f46968f0 = false;
        if (this.f46972j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f46959a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i7 = this.f46970h0;
        if (i7 != 3 && i7 != 11) {
            return org.telegram.messenger.id.M0(2131742827, "YourCode");
        }
        return this.f46960b;
    }

    @Override
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        fe0 fe0Var = this.f46985u0;
        int i12 = fe0Var.f45692a;
        if (i12 == 11) {
            if (this.f46968f0) {
                return;
            }
        } else if (!this.f46968f0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        br brVar = this.f46967f;
        if (str == null) {
            str = brVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            fe0.c1(fe0Var, brVar, false);
            return;
        }
        int i14 = fe0Var.f45692a;
        if (i14 < 1 || i14 > 4 || !brVar.f44117e) {
            this.f46968f0 = true;
            int i15 = org.telegram.messenger.qs.f25010g4;
            int i16 = this.f46970h0;
            if (i16 == 15) {
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25016h4);
            }
            this.f46966e0 = false;
            int i17 = fe0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f46962c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    brVar.f44117e = true;
                    er[] erVarArr = brVar.f44118f;
                    int length = erVarArr.length;
                    while (i13 < length) {
                        erVarArr[i13].A(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new yc0(this, tL_auth_signIn, 0), 10));
                    fe0Var.N1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f46962c;
                u();
                brVar.f44117e = true;
                er[] erVarArr2 = brVar.f44118f;
                int length2 = erVarArr2.length;
                while (i13 < length2) {
                    erVarArr2[i13].A(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                fe0Var.N1(true, true);
                return;
            }
            this.d = fe0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f46962c;
            u();
            brVar.f44117e = true;
            er[] erVarArr3 = brVar.f44118f;
            int length3 = erVarArr3.length;
            while (i13 < length3) {
                erVarArr3[i13].A(0.0f);
                i13++;
            }
            i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new k50(9, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.zg0 zg0Var = this.f46958a;
        if (zg0Var != null) {
            zg0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new xc0(this, 0), fe0.f45691y0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.f46970h0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f46976n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            br brVar = this.f46967f;
            if (brVar.f44118f != null) {
                brVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f46959a0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.V = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f46967f.getCode();
        int length = code.length();
        int i7 = this.f46970h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.f46976n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(jg.g.j(i7, "smsview_params_"), this.H);
        }
        int i10 = this.f46959a0;
        if (i10 != 0) {
            bundle.putInt("time", i10);
        }
        int i11 = this.V;
        if (i11 != 0) {
            bundle.putInt("open", i11);
        }
    }

    @Override
    public final void m(android.os.Bundle r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        boolean z9;
        super.onConfigurationChanged(configuration);
        br brVar = this.f46967f;
        if (brVar != null && (erVarArr = brVar.f44118f) != null) {
            for (er erVar : erVarArr) {
                if (a() && !org.telegram.messenger.g0.C1()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                erVar.setShowSoftInputOnFocusCompat(z9);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f46984t0);
    }

    public final void p(Runnable runnable) {
        if (this.f46970h0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            br brVar = this.f46967f;
            er[] erVarArr = brVar.f44118f;
            if (i7 < erVarArr.length) {
                brVar.postDelayed(new cd0(this, i7, 2), i7 * 75);
                i7++;
            } else {
                brVar.postDelayed(new tc0(4, this, runnable), (erVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f46961b0 = 15000;
        int i7 = this.f46959a0;
        if (i7 > 15000) {
            this.f46961b0 = i7;
        }
        this.U = new Timer();
        this.f46964d0 = System.currentTimeMillis();
        this.U.schedule(new id0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        hd0 hd0Var = this.f46986w;
        org.telegram.ui.ActionBar.t6.U(hd0Var, i7, null);
        hd0Var.setTag(2131296386, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new id0(this, 1), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.W) {
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

    public final void u() {
        hd0 hd0Var = this.f46986w;
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        org.telegram.ui.ActionBar.t6.U(hd0Var, i7, null);
        this.f46986w.setTag(2131296386, Integer.valueOf(i7));
        try {
            synchronized (this.W) {
                Timer timer = this.T;
                if (timer != null) {
                    timer.cancel();
                    this.T = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        if (this.f46985u0.A1()) {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        TextView textView = this.f46975n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false));
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        this.f46980r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int i11 = this.f46970h0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.m6.f28282y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28037l6, false);
            int i13 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            fe0.u1(this.L, x03, i13, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            fe0.u1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        }
        q(this.f46958a);
        q(this.P);
        q(this.Q);
        q(this.R);
        br brVar = this.f46967f;
        if (brVar != null) {
            brVar.invalidate();
        }
        hd0 hd0Var = this.f46986w;
        Integer num = (Integer) hd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.m6.D6);
        }
        hd0Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f46988y.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28131q7, false));
    }

    public final void v() {
        int i7;
        if (!this.f46968f0 && !this.f46973k0) {
            fe0 fe0Var = this.f46985u0;
            if (!fe0Var.f45712p0) {
                this.f46973k0 = true;
                this.f46986w.invalidate();
                this.f46988y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f46960b);
                bundle.putString("ephone", this.f46965e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f46970h0);
                this.f46968f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f46962c;
                i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new bd0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        br brVar = this.f46967f;
        try {
            brVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            er[] erVarArr = brVar.f44118f;
            if (i7 >= erVarArr.length) {
                break;
            }
            erVarArr[i7].setText("");
            brVar.f44118f[i7].z(1.0f);
            i7++;
        }
        qb0 qb0Var = this.f46987x;
        if (qb0Var.getCurrentView() != this.E) {
            qb0Var.showNext();
        }
        brVar.f44118f[0].requestFocus();
        if (this.f46970h0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.G3(f10, brVar, new xc0(this, 7));
        xc0 xc0Var = this.f46984t0;
        removeCallbacks(xc0Var);
        postDelayed(xc0Var, 5000L);
        this.f46983s0 = true;
    }

    public final void y(boolean z9) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f46982s.setAutoRepeat(false);
            org.telegram.ui.Components.zg0 zg0Var = this.Q;
            zg0Var.K(0);
            zg0Var.S(zg0Var.f40968e[0] - 1, new xc0(this, 1));
            return;
        }
        this.f46985u0.C1(z9, true);
    }

    public final void z(int i7) {
        org.telegram.ui.Components.zg0 zg0Var = this.P;
        if (zg0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.zg0 zg0Var2 = this.f46958a;
            if (zg0Var2.f40962a0 != zg0Var2.f40968e[0] - 1) {
                zg0Var2.f40987t0 = new cd0(this, i7, 0);
                return;
            }
            zg0Var.f40987t0 = new xc0(this, 3);
            org.telegram.ui.Components.ch0 ch0Var = this.f46982s;
            ch0Var.setAutoRepeat(false);
            zg0Var.N(0, false, false);
            ch0Var.setAnimation(zg0Var);
            ch0Var.d();
            return;
        }
        this.f46985u0.F1(i7, true);
    }
}
