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
public final class dd0 extends org.telegram.ui.Components.vt0 implements org.telegram.messenger.cs {
    public static final int f44634w0 = 0;
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.fh0 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final org.telegram.ui.Components.ch0 Q;
    public final org.telegram.ui.Components.ch0 R;
    public final org.telegram.ui.Components.ch0 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final org.telegram.ui.Components.ch0 f44635a;
    public final Object f44636a0;
    public String f44637b;
    public int f44638b0;
    public String f44639c;
    public int f44640c0;
    public String d;
    public double f44641d0;
    public String f44642e;
    public double f44643e0;
    public final xq f44644f;
    public boolean f44645f0;
    public boolean f44646g0;
    public final za0 h;
    public String f44647h0;
    public final int f44648i0;
    public int f44649j0;
    public int f44650k0;
    public boolean f44651l0;
    public String m0;
    public final TextView f44652n;
    public String f44653n0;
    public String f44654o0;
    public int f44655p0;
    public String f44656q0;
    public final TextView f44657r;
    public Bundle f44658r0;
    public final org.telegram.ui.Components.fh0 f44659s;
    public TLRPC.TL_auth_sentCode f44660s0;
    public boolean f44661t0;
    public final rc0 f44662u0;
    public final xd0 f44663v0;
    public final bd0 f44664w;
    public final kb0 f44665x;
    public final bd0 f44666y;

    public dd0(org.telegram.ui.xd0 r31, android.content.Context r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd0.<init>(org.telegram.ui.xd0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.dd0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd0.n(org.telegram.ui.dd0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.ch0 ch0Var) {
        if (ch0Var != null) {
            ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false), "Bubble");
            int i3 = org.telegram.ui.ActionBar.k6.G6;
            ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i3, false), "Phone");
            ch0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i3, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f10;
        bd0 bd0Var = this.f44666y;
        if (bd0Var != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (bd0Var.getAlpha() != f10) {
                bd0Var.animate().cancel();
                bd0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f44648i0 != 3) {
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
        int i3;
        xd0 xd0Var = this.f44663v0;
        if (xd0Var.G != 0) {
            xd0Var.finishFragment();
            return false;
        }
        int i10 = this.f44650k0;
        if (i10 != 0) {
            xd0Var.D1(i10, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131751264, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("EditNumberInfo", null, 2131751263, this.f44637b));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751336, null), new tc0(this, 0));
            xd0Var.showDialog(s1Var);
            return false;
        } else {
            this.f44646g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f44639c;
            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            ConnectionsManager.getInstance(i3).sendRequest(tL_auth_cancelCode, new ei.u5(23), 10);
            u();
            t();
            this.I = null;
            int i11 = org.telegram.messenger.hs.f23235g4;
            int i12 = this.f44648i0;
            if (i12 == 15) {
                org.telegram.messenger.hs.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.hs.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.D3(false);
                org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23241h4);
            }
            this.f44645f0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f44646g0 = false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (this.f44645f0) {
            xq xqVar = this.f44644f;
            if (xqVar.f52078f != null) {
                if (i3 == org.telegram.messenger.hs.f23235g4) {
                    xqVar.setText("" + objArr[0]);
                    h(null);
                } else if (i3 == org.telegram.messenger.hs.f23241h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.m0, str)) {
                        if (!this.m0.equals("*")) {
                            this.f44654o0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f21219a;
                        org.telegram.messenger.az.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i3 = org.telegram.messenger.hs.f23235g4;
        int i10 = this.f44648i0;
        if (i10 == 15) {
            org.telegram.messenger.hs.e().n(this, i3);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, i3);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23241h4);
        }
        this.f44645f0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f44651l0 = false;
        this.f44646g0 = false;
        if (this.f44650k0 != 0 && (bundle = this.I) != null) {
            bundle.putInt("timeout", this.f44638b0);
        }
    }

    @Override
    public String getHeaderName() {
        int i3 = this.f44648i0;
        if (i3 != 3 && i3 != 11) {
            return org.telegram.messenger.bd.M0(2131742837, "YourCode");
        }
        return this.f44637b;
    }

    @Override
    public final void h(String str) {
        int i3;
        int i10;
        int i11;
        xd0 xd0Var = this.f44663v0;
        int i12 = xd0Var.f51946a;
        if (i12 == 11) {
            if (this.f44646g0) {
                return;
            }
        } else if (!this.f44646g0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        xq xqVar = this.f44644f;
        if (str == null) {
            str = xqVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            xd0.b1(xd0Var, xqVar, false);
            return;
        }
        int i14 = xd0Var.f51946a;
        if (i14 < 1 || i14 > 4 || !xqVar.f52077e) {
            this.f44646g0 = true;
            int i15 = org.telegram.messenger.hs.f23235g4;
            int i16 = this.f44648i0;
            if (i16 == 15) {
                org.telegram.messenger.hs.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.hs.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23241h4);
            }
            this.f44645f0 = false;
            int i17 = xd0Var.G;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f44639c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    xqVar.f52077e = true;
                    zq[] zqVarArr = xqVar.f52078f;
                    int length = zqVarArr.length;
                    while (i13 < length) {
                        zqVarArr[i13].A(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new sc0(this, tL_auth_signIn, 0), 10));
                    xd0Var.E1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f44639c;
                u();
                xqVar.f52077e = true;
                zq[] zqVarArr2 = xqVar.f52078f;
                int length2 = zqVarArr2.length;
                while (i13 < length2) {
                    zqVarArr2[i13].A(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 14), 2));
                xd0Var.E1(true, true);
                return;
            }
            this.d = xd0Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f44639c;
            u();
            xqVar.f52077e = true;
            zq[] zqVarArr3 = xqVar.f52078f;
            int length3 = zqVarArr3.length;
            while (i13 < length3) {
                zqVarArr3[i13].A(0.0f);
                i13++;
            }
            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            z(ConnectionsManager.getInstance(i3).sendRequest(confirmphone, new xy(12, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.ch0 ch0Var = this.f44635a;
        if (ch0Var != null) {
            ch0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new rc0(this, 0), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i3 = this.f44648i0;
        sb2.append(i3);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f44654o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i3);
        if (string2 != null) {
            xq xqVar = this.f44644f;
            if (xqVar.f52078f != null) {
                xqVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f44638b0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.W = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f44644f.getCode();
        int length = code.length();
        int i3 = this.f44648i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i3, code);
        }
        String str = this.f44654o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(k2.p1.i(i3, "smsview_params_"), this.I);
        }
        int i10 = this.f44638b0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        zq[] zqVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        xq xqVar = this.f44644f;
        if (xqVar != null && (zqVarArr = xqVar.f52078f) != null) {
            for (zq zqVar : zqVarArr) {
                if (a() && !org.telegram.messenger.g0.C1()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zqVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f44662u0);
    }

    public final void p(Runnable runnable) {
        if (this.f44648i0 == 3) {
            runnable.run();
            return;
        }
        int i3 = 0;
        while (true) {
            xq xqVar = this.f44644f;
            zq[] zqVarArr = xqVar.f52078f;
            if (i3 < zqVarArr.length) {
                xqVar.postDelayed(new wc0(this, i3, 2), i3 * 75);
                i3++;
            } else {
                xqVar.postDelayed(new tb0(8, this, runnable), (zqVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.V != null) {
            return;
        }
        this.f44640c0 = 15000;
        int i3 = this.f44638b0;
        if (i3 > 15000) {
            this.f44640c0 = i3;
        }
        this.V = new Timer();
        this.f44643e0 = System.currentTimeMillis();
        this.V.schedule(new cd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.U != null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.D6;
        bd0 bd0Var = this.f44664w;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i3, null);
        bd0Var.setTag(2131296386, Integer.valueOf(i3));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new cd0(this, 1), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.f44636a0) {
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
        bd0 bd0Var = this.f44664w;
        int i3 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i3, null);
        this.f44664w.setTag(2131296386, Integer.valueOf(i3));
        try {
            synchronized (this.f44636a0) {
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
        int i3;
        if (this.f44663v0.r1()) {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        TextView textView = this.f44652n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f44657r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = this.f44648i0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
            this.K.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            this.L.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28026l6, false);
            int i13 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            xd0.l1(this.M, x03, i13, mode);
            this.O = x03;
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            xd0.l1(this.N, x04, this.P, mode);
            this.P = x04;
            this.J.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
        q(this.f44635a);
        q(this.Q);
        q(this.R);
        q(this.S);
        xq xqVar = this.f44644f;
        if (xqVar != null) {
            xqVar.invalidate();
        }
        bd0 bd0Var = this.f44664w;
        Integer num = (Integer) bd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.k6.D6);
        }
        bd0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f44666y.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false));
    }

    public final void v() {
        int i3;
        if (!this.f44646g0 && !this.f44651l0) {
            xd0 xd0Var = this.f44663v0;
            if (!xd0Var.f51967q0) {
                this.f44651l0 = true;
                this.f44664w.invalidate();
                this.f44666y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f44637b);
                bundle.putString("ephone", this.f44642e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f44648i0);
                this.f44646g0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f44639c;
                i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                z(ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode, new vc0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        xq xqVar = this.f44644f;
        try {
            xqVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i3 = 0;
        while (true) {
            zq[] zqVarArr = xqVar.f52078f;
            if (i3 >= zqVarArr.length) {
                break;
            }
            zqVarArr[i3].setText("");
            xqVar.f52078f[i3].z(1.0f);
            i3++;
        }
        kb0 kb0Var = this.f44665x;
        if (kb0Var.getCurrentView() != this.F) {
            kb0Var.showNext();
        }
        xqVar.f52078f[0].requestFocus();
        if (this.f44648i0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.G3(f10, xqVar, new rc0(this, 7));
        rc0 rc0Var = this.f44662u0;
        removeCallbacks(rc0Var);
        postDelayed(rc0Var, 5000L);
        this.f44661t0 = true;
    }

    public final void y(boolean z10) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.f44659s.setAutoRepeat(false);
            org.telegram.ui.Components.ch0 ch0Var = this.R;
            ch0Var.K(0);
            ch0Var.S(ch0Var.f32725e[0] - 1, new rc0(this, 1));
            return;
        }
        this.f44663v0.t1(z10, true);
    }

    public final void z(int i3) {
        org.telegram.ui.Components.ch0 ch0Var = this.Q;
        if (ch0Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            org.telegram.ui.Components.ch0 ch0Var2 = this.f44635a;
            if (ch0Var2.f32721b0 != ch0Var2.f32725e[0] - 1) {
                ch0Var2.f32745u0 = new wc0(this, i3, 0);
                return;
            }
            ch0Var.f32745u0 = new rc0(this, 3);
            org.telegram.ui.Components.fh0 fh0Var = this.f44659s;
            fh0Var.setAutoRepeat(false);
            ch0Var.N(0, false, false);
            fh0Var.setAnimation(ch0Var);
            fh0Var.d();
            return;
        }
        this.f44663v0.w1(i3, true);
    }
}
