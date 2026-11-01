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
public final class le0 extends org.telegram.ui.Components.av0 implements org.telegram.messenger.vs {
    public static final int f39232v0 = 0;
    public final FrameLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.fi0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.ci0 P;
    public final org.telegram.ui.Components.ci0 Q;
    public final org.telegram.ui.Components.ci0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.ci0 f39233a;
    public int f39234a0;
    public String f39235b;
    public int f39236b0;
    public String f39237c;
    public double f39238c0;
    public String d;
    public double f39239d0;
    public String e;
    public boolean f39240e0;
    public final zr f39241f;
    public boolean f39242f0;
    public String f39243g0;
    public final lc0 h;
    public final int f39244h0;
    public int f39245i0;
    public int f39246j0;
    public boolean f39247k0;
    public String f39248l0;
    public String m0;
    public final TextView f39249n;
    public String f39250n0;
    public int f39251o0;
    public String f39252p0;
    public Bundle f39253q0;
    public final TextView f39254r;
    public TLRPC.TL_auth_sentCode f39255r0;
    public final org.telegram.ui.Components.fi0 f39256s;
    public boolean f39257s0;
    public final zd0 f39258t0;
    public final gf0 f39259u0;
    public final je0 f39260w;
    public final uc0 f39261x;
    public final je0 f39262y;

    public le0(org.telegram.ui.gf0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.<init>(org.telegram.ui.gf0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.le0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.n(org.telegram.ui.le0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.ci0 ci0Var) {
        if (ci0Var != null) {
            ci0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            ci0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, i10, false), "Phone");
            ci0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        je0 je0Var = this.f39262y;
        if (je0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (je0Var.getAlpha() != f7) {
                je0Var.animate().cancel();
                je0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f39244h0 != 3) {
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
        int i10;
        gf0 gf0Var = this.f39259u0;
        if (gf0Var.F != 0) {
            gf0Var.finishFragment();
            return false;
        }
        int i11 = this.f39246j0;
        if (i11 != 0) {
            gf0Var.D1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131751264, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("EditNumberInfo", null, 2131751263, this.f39235b));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751336, null), new be0(this, 0));
            gf0Var.showDialog(x1Var);
            return false;
        } else {
            this.f39242f0 = false;
            x(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f39237c;
            i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ag.c3(18), 10);
            u();
            t();
            this.H = null;
            int i12 = org.telegram.messenger.at.f14714g4;
            int i13 = this.f39244h0;
            if (i13 == 15) {
                org.telegram.messenger.at.e().n(this, i12);
            } else if (i13 == 2) {
                org.telegram.messenger.i0.D3(false);
                org.telegram.messenger.at.e().n(this, i12);
            } else if (i13 == 3) {
                org.telegram.messenger.i0.C3(false);
                org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14720h4);
            }
            this.f39240e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f39242f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f39240e0) {
            zr zrVar = this.f39241f;
            if (zrVar.f44045f != null) {
                if (i10 == org.telegram.messenger.at.f14714g4) {
                    zrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == org.telegram.messenger.at.f14720h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.i0.x(this.f39248l0, str)) {
                        if (!this.f39248l0.equals("*")) {
                            this.f39250n0 = str;
                            org.telegram.messenger.i0.T();
                        }
                        h(str);
                        int i12 = CallReceiver.f14359a;
                        org.telegram.messenger.uz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = org.telegram.messenger.at.f14714g4;
        int i11 = this.f39244h0;
        if (i11 == 15) {
            org.telegram.messenger.at.e().n(this, i10);
        } else if (i11 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.at.e().n(this, i10);
        } else if (i11 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14720h4);
        }
        this.f39240e0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f39247k0 = false;
        this.f39242f0 = false;
        if (this.f39246j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f39234a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f39244h0;
        if (i10 != 3 && i10 != 11) {
            return org.telegram.messenger.dd.L0(2131742852, "YourCode");
        }
        return this.f39235b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        gf0 gf0Var = this.f39259u0;
        int i13 = gf0Var.f37471a;
        if (i13 == 11) {
            if (this.f39242f0) {
                return;
            }
        } else if (!this.f39242f0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        zr zrVar = this.f39241f;
        if (str == null) {
            str = zrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            gf0.b1(gf0Var, zrVar, false);
            return;
        }
        int i15 = gf0Var.f37471a;
        if (i15 < 1 || i15 > 4 || !zrVar.e) {
            this.f39242f0 = true;
            int i16 = org.telegram.messenger.at.f14714g4;
            int i17 = this.f39244h0;
            if (i17 == 15) {
                org.telegram.messenger.at.e().n(this, i16);
            } else if (i17 == 2) {
                org.telegram.messenger.i0.D3(false);
                org.telegram.messenger.at.e().n(this, i16);
            } else if (i17 == 3) {
                org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14720h4);
            }
            this.f39240e0 = false;
            int i18 = gf0Var.F;
            if (i18 != 1) {
                if (i18 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f39237c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    zrVar.e = true;
                    bs[] bsVarArr = zrVar.f44045f;
                    int length = bsVarArr.length;
                    while (i14 < length) {
                        bsVarArr[i14].A(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new ae0(this, tL_auth_signIn, 0), 10));
                    gf0Var.E1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f39237c;
                u();
                zrVar.e = true;
                bs[] bsVarArr2 = zrVar.f44045f;
                int length2 = bsVarArr2.length;
                while (i14 < length2) {
                    bsVarArr2[i14].A(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                z(ConnectionsManager.getInstance(i11).sendRequest(changephone, new k(this, 14), 2));
                gf0Var.E1(true, true);
                return;
            }
            this.d = gf0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f39237c;
            u();
            zrVar.e = true;
            bs[] bsVarArr3 = zrVar.f44045f;
            int length3 = bsVarArr3.length;
            while (i14 < length3) {
                bsVarArr3[i14].A(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
            z(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new org.telegram.ui.Components.t20(23, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.ci0 ci0Var = this.f39233a;
        if (ci0Var != null) {
            ci0Var.M(0);
        }
        org.telegram.messenger.i0.h3(new zd0(this, 0), gf0.f37470y0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f39244h0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f39250n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            zr zrVar = this.f39241f;
            if (zrVar.f44045f != null) {
                zrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.f39234a0 = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.V = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39241f.getCode();
        int length = code.length();
        int i10 = this.f39244h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f39250n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(i0.a.i(i10, "smsview_params_"), this.H);
        }
        int i11 = this.f39234a0;
        if (i11 != 0) {
            bundle.putInt("time", i11);
        }
        int i12 = this.V;
        if (i12 != 0) {
            bundle.putInt("open", i12);
        }
    }

    @Override
    public final void m(android.os.Bundle r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        bs[] bsVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        zr zrVar = this.f39241f;
        if (zrVar != null && (bsVarArr = zrVar.f44045f) != null) {
            for (bs bsVar : bsVarArr) {
                if (a() && !org.telegram.messenger.i0.C1()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                bsVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39258t0);
    }

    public final void p(Runnable runnable) {
        if (this.f39244h0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            zr zrVar = this.f39241f;
            bs[] bsVarArr = zrVar.f44045f;
            if (i10 < bsVarArr.length) {
                zrVar.postDelayed(new ee0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                zrVar.postDelayed(new y60(27, this, runnable), (bsVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f39236b0 = 15000;
        int i10 = this.f39234a0;
        if (i10 > 15000) {
            this.f39236b0 = i10;
        }
        this.U = new Timer();
        this.f39239d0 = System.currentTimeMillis();
        this.U.schedule(new ke0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        je0 je0Var = this.f39260w;
        org.telegram.ui.ActionBar.a7.V(je0Var, i10, null);
        je0Var.setTag(2131296386, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new ke0(this, 1), 0L, 1000L);
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void u() {
        je0 je0Var = this.f39260w;
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(je0Var, i10, null);
        this.f39260w.setTag(2131296386, Integer.valueOf(i10));
        try {
            synchronized (this.W) {
                Timer timer = this.T;
                if (timer != null) {
                    timer.cancel();
                    this.T = null;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        if (this.f39259u0.r1()) {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        TextView textView = this.f39249n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        this.f39254r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int i12 = this.f39244h0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.t6.f21312y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21077l6, false);
            int i14 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            gf0.l1(this.L, x03, i14, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            gf0.l1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        }
        q(this.f39233a);
        q(this.P);
        q(this.Q);
        q(this.R);
        zr zrVar = this.f39241f;
        if (zrVar != null) {
            zrVar.invalidate();
        }
        je0 je0Var = this.f39260w;
        Integer num = (Integer) je0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.t6.D6);
        }
        je0Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f39262y.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21171q7, false));
    }

    public final void v() {
        int i10;
        if (!this.f39242f0 && !this.f39247k0) {
            gf0 gf0Var = this.f39259u0;
            if (!gf0Var.f37490p0) {
                this.f39247k0 = true;
                this.f39260w.invalidate();
                this.f39262y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f39235b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f39244h0);
                this.f39242f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f39237c;
                i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new de0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f7;
        zr zrVar = this.f39241f;
        try {
            zrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            bs[] bsVarArr = zrVar.f44045f;
            if (i10 >= bsVarArr.length) {
                break;
            }
            bsVarArr[i10].setText("");
            zrVar.f44045f[i10].z(1.0f);
            i10++;
        }
        uc0 uc0Var = this.f39261x;
        if (uc0Var.getCurrentView() != this.E) {
            uc0Var.showNext();
        }
        zrVar.f44045f[0].requestFocus();
        if (this.f39244h0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        org.telegram.messenger.i0.F3(f7, zrVar, new zd0(this, 7));
        zd0 zd0Var = this.f39258t0;
        removeCallbacks(zd0Var);
        postDelayed(zd0Var, 5000L);
        this.f39257s0 = true;
    }

    public final void x(boolean z10) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f39256s.setAutoRepeat(false);
            org.telegram.ui.Components.ci0 ci0Var = this.Q;
            ci0Var.K(0);
            ci0Var.S(ci0Var.e[0] - 1, new zd0(this, 1));
            return;
        }
        this.f39259u0.t1(z10, true);
    }

    public final void z(int i10) {
        org.telegram.ui.Components.ci0 ci0Var = this.P;
        if (ci0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.ci0 ci0Var2 = this.f39233a;
            if (ci0Var2.f25131a0 != ci0Var2.e[0] - 1) {
                ci0Var2.f25155t0 = new ee0(this, i10, 0);
                return;
            }
            ci0Var.f25155t0 = new zd0(this, 3);
            org.telegram.ui.Components.fi0 fi0Var = this.f39256s;
            fi0Var.setAutoRepeat(false);
            ci0Var.N(0, false, false);
            fi0Var.setAnimation(ci0Var);
            fi0Var.d();
            return;
        }
        this.f39259u0.w1(i10, true);
    }
}
