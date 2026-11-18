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
public final class hd0 extends org.telegram.ui.Components.fu0 implements org.telegram.messenger.fs {
    public static final int f48302w0 = 0;
    public final FrameLayout E;
    public final TextView F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.ph0 H;
    public Bundle I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public int O;
    public int P;
    public final org.telegram.ui.Components.mh0 Q;
    public final org.telegram.ui.Components.mh0 R;
    public final org.telegram.ui.Components.mh0 S;
    public boolean T;
    public Timer U;
    public Timer V;
    public int W;
    public final org.telegram.ui.Components.mh0 f48303a;
    public final Object f48304a0;
    public String f48305b;
    public int f48306b0;
    public String f48307c;
    public int f48308c0;
    public String d;
    public double f48309d0;
    public String f48310e;
    public double f48311e0;
    public final br f48312f;
    public boolean f48313f0;
    public boolean f48314g0;
    public final eb0 h;
    public String f48315h0;
    public final int f48316i0;
    public int f48317j0;
    public int f48318k0;
    public boolean f48319l0;
    public String m0;
    public final TextView f48320n;
    public String f48321n0;
    public String f48322o0;
    public int f48323p0;
    public String f48324q0;
    public final TextView f48325r;
    public Bundle f48326r0;
    public final org.telegram.ui.Components.ph0 f48327s;
    public TLRPC.TL_auth_sentCode f48328s0;
    public boolean f48329t0;
    public final tc0 f48330u0;
    public final ee0 f48331v0;
    public final fd0 f48332w;
    public final ob0 f48333x;
    public final fd0 f48334y;

    public hd0(org.telegram.ui.ee0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hd0.<init>(org.telegram.ui.ee0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.hd0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hd0.n(org.telegram.ui.hd0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.mh0 mh0Var) {
        if (mh0Var != null) {
            mh0Var.Q(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.n6.G6;
            mh0Var.Q(org.telegram.ui.ActionBar.n6.x0(null, i7, false), "Phone");
            mh0Var.Q(org.telegram.ui.ActionBar.n6.x0(null, i7, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f10;
        fd0 fd0Var = this.f48334y;
        if (fd0Var != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (fd0Var.getAlpha() != f10) {
                fd0Var.animate().cancel();
                fd0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f48316i0 != 3) {
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
        ee0 ee0Var = this.f48331v0;
        if (ee0Var.G != 0) {
            ee0Var.finishFragment();
            return false;
        }
        int i10 = this.f48318k0;
        if (i10 != 0) {
            ee0Var.M1(i10, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131751252, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("EditNumberInfo", null, 2131751251, this.f48305b));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751324, null), new vc0(this, 0));
            ee0Var.showDialog(u1Var);
            return false;
        } else {
            this.f48314g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f48307c;
            i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new fi.k5(23), 10);
            u();
            t();
            this.I = null;
            int i11 = org.telegram.messenger.ks.f25137j4;
            int i12 = this.f48316i0;
            if (i12 == 15) {
                org.telegram.messenger.ks.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.C3(false);
                org.telegram.messenger.ks.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.B3(false);
                org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25143k4);
            }
            this.f48313f0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f48314g0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f48313f0) {
            br brVar = this.f48312f;
            if (brVar.f46274f != null) {
                if (i7 == org.telegram.messenger.ks.f25137j4) {
                    brVar.setText("" + objArr[0]);
                    h(null);
                } else if (i7 == org.telegram.messenger.ks.f25143k4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.m0, str)) {
                        if (!this.m0.equals("*")) {
                            this.f48322o0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f22611a;
                        org.telegram.messenger.bz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = org.telegram.messenger.ks.f25137j4;
        int i10 = this.f48316i0;
        if (i10 == 15) {
            org.telegram.messenger.ks.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25143k4);
        }
        this.f48313f0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f48319l0 = false;
        this.f48314g0 = false;
        if (this.f48318k0 != 0 && (bundle = this.I) != null) {
            bundle.putInt("timeout", this.f48306b0);
        }
    }

    @Override
    public String getHeaderName() {
        int i7 = this.f48316i0;
        if (i7 != 3 && i7 != 11) {
            return org.telegram.messenger.gd.M0(2131742569, "YourCode");
        }
        return this.f48305b;
    }

    @Override
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        ee0 ee0Var = this.f48331v0;
        int i12 = ee0Var.f47177a;
        if (i12 == 11) {
            if (this.f48314g0) {
                return;
            }
        } else if (!this.f48314g0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        br brVar = this.f48312f;
        if (str == null) {
            str = brVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            ee0.c1(ee0Var, brVar, false);
            return;
        }
        int i14 = ee0Var.f47177a;
        if (i14 < 1 || i14 > 4 || !brVar.f46273e) {
            this.f48314g0 = true;
            int i15 = org.telegram.messenger.ks.f25137j4;
            int i16 = this.f48316i0;
            if (i16 == 15) {
                org.telegram.messenger.ks.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.C3(false);
                org.telegram.messenger.ks.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25143k4);
            }
            this.f48313f0 = false;
            int i17 = ee0Var.G;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f48307c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    brVar.f46273e = true;
                    er[] erVarArr = brVar.f46274f;
                    int length = erVarArr.length;
                    while (i13 < length) {
                        erVarArr[i13].B(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new uc0(this, tL_auth_signIn, 0), 10));
                    ee0Var.N1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f48307c;
                u();
                brVar.f46273e = true;
                er[] erVarArr2 = brVar.f46274f;
                int length2 = erVarArr2.length;
                while (i13 < length2) {
                    erVarArr2[i13].B(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                ee0Var.N1(true, true);
                return;
            }
            this.d = ee0Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f48307c;
            u();
            brVar.f46273e = true;
            er[] erVarArr3 = brVar.f46274f;
            int length3 = erVarArr3.length;
            while (i13 < length3) {
                erVarArr3[i13].B(0.0f);
                i13++;
            }
            i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
            z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new e00(11, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.mh0 mh0Var = this.f48303a;
        if (mh0Var != null) {
            mh0Var.M(0);
        }
        org.telegram.messenger.g0.h3(new tc0(this, 0), ee0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.f48316i0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f48322o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            br brVar = this.f48312f;
            if (brVar.f46274f != null) {
                brVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f48306b0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.W = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f48312f.getCode();
        int length = code.length();
        int i7 = this.f48316i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.f48322o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(i5.c.i(i7, "smsview_params_"), this.I);
        }
        int i10 = this.f48306b0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hd0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        br brVar = this.f48312f;
        if (brVar != null && (erVarArr = brVar.f46274f) != null) {
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
        removeCallbacks(this.f48330u0);
    }

    public final void p(Runnable runnable) {
        if (this.f48316i0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            br brVar = this.f48312f;
            er[] erVarArr = brVar.f46274f;
            if (i7 < erVarArr.length) {
                brVar.postDelayed(new yc0(this, i7, 2), i7 * 75);
                i7++;
            } else {
                brVar.postDelayed(new o60(24, this, runnable), (erVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.V != null) {
            return;
        }
        this.f48308c0 = 15000;
        int i7 = this.f48306b0;
        if (i7 > 15000) {
            this.f48308c0 = i7;
        }
        this.V = new Timer();
        this.f48311e0 = System.currentTimeMillis();
        this.V.schedule(new gd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.U != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.n6.D6;
        fd0 fd0Var = this.f48332w;
        org.telegram.ui.ActionBar.u6.U(fd0Var, i7, null);
        fd0Var.setTag(2131296386, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new gd0(this, 1), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.f48304a0) {
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
        fd0 fd0Var = this.f48332w;
        int i7 = org.telegram.ui.ActionBar.n6.D6;
        org.telegram.ui.ActionBar.u6.U(fd0Var, i7, null);
        this.f48332w.setTag(2131296386, Integer.valueOf(i7));
        try {
            synchronized (this.f48304a0) {
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
        if (this.f48331v0.A1()) {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        TextView textView = this.f48320n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P9, false));
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        this.f48325r.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        int i11 = this.f48316i0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.n6.f29786y6;
            this.K.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
            this.L.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29541l6, false);
            int i13 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ee0.u1(this.M, x03, i13, mode);
            this.O = x03;
            int x04 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            ee0.u1(this.N, x04, this.P, mode);
            this.P = x04;
            this.J.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        }
        q(this.f48303a);
        q(this.Q);
        q(this.R);
        q(this.S);
        br brVar = this.f48312f;
        if (brVar != null) {
            brVar.invalidate();
        }
        fd0 fd0Var = this.f48332w;
        Integer num = (Integer) fd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.n6.D6);
        }
        fd0Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f48334y.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29634q6, false));
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29635q7, false));
    }

    public final void v() {
        int i7;
        if (!this.f48314g0 && !this.f48319l0) {
            ee0 ee0Var = this.f48331v0;
            if (!ee0Var.f47200r0) {
                this.f48319l0 = true;
                this.f48332w.invalidate();
                this.f48334y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f48305b);
                bundle.putString("ephone", this.f48310e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f48316i0);
                this.f48314g0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f48307c;
                i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new xc0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        br brVar = this.f48312f;
        try {
            brVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            er[] erVarArr = brVar.f46274f;
            if (i7 >= erVarArr.length) {
                break;
            }
            erVarArr[i7].setText("");
            brVar.f46274f[i7].A(1.0f);
            i7++;
        }
        ob0 ob0Var = this.f48333x;
        if (ob0Var.getCurrentView() != this.F) {
            ob0Var.showNext();
        }
        brVar.f46274f[0].requestFocus();
        if (this.f48316i0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.E3(f10, brVar, new tc0(this, 7));
        tc0 tc0Var = this.f48330u0;
        removeCallbacks(tc0Var);
        postDelayed(tc0Var, 5000L);
        this.f48329t0 = true;
    }

    public final void y(boolean z10) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.f48327s.setAutoRepeat(false);
            org.telegram.ui.Components.mh0 mh0Var = this.R;
            mh0Var.K(0);
            mh0Var.S(mh0Var.f37486e[0] - 1, new tc0(this, 1));
            return;
        }
        this.f48331v0.C1(z10, true);
    }

    public final void z(int i7) {
        org.telegram.ui.Components.mh0 mh0Var = this.Q;
        if (mh0Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            org.telegram.ui.Components.mh0 mh0Var2 = this.f48303a;
            if (mh0Var2.f37482b0 != mh0Var2.f37486e[0] - 1) {
                mh0Var2.f37506u0 = new yc0(this, i7, 0);
                return;
            }
            mh0Var.f37506u0 = new tc0(this, 3);
            org.telegram.ui.Components.ph0 ph0Var = this.f48327s;
            ph0Var.setAutoRepeat(false);
            mh0Var.N(0, false, false);
            ph0Var.setAnimation(mh0Var);
            ph0Var.d();
            return;
        }
        this.f48331v0.F1(i7, true);
    }
}
