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
public final class me0 extends org.telegram.ui.Components.zu0 implements org.telegram.messenger.us {
    public static final int f39655v0 = 0;
    public final FrameLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.ei0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.bi0 P;
    public final org.telegram.ui.Components.bi0 Q;
    public final org.telegram.ui.Components.bi0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.bi0 f39656a;
    public int f39657a0;
    public String f39658b;
    public int f39659b0;
    public String f39660c;
    public double f39661c0;
    public String d;
    public double f39662d0;
    public String e;
    public boolean f39663e0;
    public final zr f39664f;
    public boolean f39665f0;
    public String f39666g0;
    public final mc0 h;
    public final int f39667h0;
    public int f39668i0;
    public int f39669j0;
    public boolean f39670k0;
    public String f39671l0;
    public String m0;
    public final TextView f39672n;
    public String f39673n0;
    public int f39674o0;
    public String f39675p0;
    public Bundle f39676q0;
    public final TextView f39677r;
    public TLRPC.TL_auth_sentCode f39678r0;
    public final org.telegram.ui.Components.ei0 f39679s;
    public boolean f39680s0;
    public final ae0 f39681t0;
    public final hf0 f39682u0;
    public final ke0 f39683w;
    public final vc0 f39684x;
    public final ke0 f39685y;

    public me0(org.telegram.ui.hf0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me0.<init>(org.telegram.ui.hf0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.me0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me0.n(org.telegram.ui.me0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.bi0 bi0Var) {
        if (bi0Var != null) {
            bi0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false), "Bubble");
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            bi0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, i10, false), "Phone");
            bi0Var.Q(org.telegram.ui.ActionBar.t6.x0(null, i10, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f7;
        ke0 ke0Var = this.f39685y;
        if (ke0Var != null) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (ke0Var.getAlpha() != f7) {
                ke0Var.animate().cancel();
                ke0Var.animate().alpha(f7).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f39667h0 != 3) {
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
        hf0 hf0Var = this.f39682u0;
        if (hf0Var.F != 0) {
            hf0Var.finishFragment();
            return false;
        }
        int i11 = this.f39669j0;
        if (i11 != 0) {
            hf0Var.C1(i11, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131751264, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("EditNumberInfo", null, 2131751263, this.f39658b));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751336, null), new ce0(this, 0));
            hf0Var.showDialog(x1Var);
            return false;
        } else {
            this.f39665f0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f39660c;
            i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ag.c3(18), 10);
            u();
            t();
            this.H = null;
            int i12 = org.telegram.messenger.zs.f19618g4;
            int i13 = this.f39667h0;
            if (i13 == 15) {
                org.telegram.messenger.zs.e().n(this, i12);
            } else if (i13 == 2) {
                org.telegram.messenger.i0.D3(false);
                org.telegram.messenger.zs.e().n(this, i12);
            } else if (i13 == 3) {
                org.telegram.messenger.i0.C3(false);
                org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19624h4);
            }
            this.f39663e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f39665f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (this.f39663e0) {
            zr zrVar = this.f39664f;
            if (zrVar.f44219f != null) {
                if (i10 == org.telegram.messenger.zs.f19618g4) {
                    zrVar.setText("" + objArr[0]);
                    h(null);
                } else if (i10 == org.telegram.messenger.zs.f19624h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.i0.x(this.f39671l0, str)) {
                        if (!this.f39671l0.equals("*")) {
                            this.f39673n0 = str;
                            org.telegram.messenger.i0.T();
                        }
                        h(str);
                        int i12 = CallReceiver.f14358a;
                        org.telegram.messenger.tz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = org.telegram.messenger.zs.f19618g4;
        int i11 = this.f39667h0;
        if (i11 == 15) {
            org.telegram.messenger.zs.e().n(this, i10);
        } else if (i11 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, i10);
        } else if (i11 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19624h4);
        }
        this.f39663e0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f39670k0 = false;
        this.f39665f0 = false;
        if (this.f39669j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f39657a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i10 = this.f39667h0;
        if (i10 != 3 && i10 != 11) {
            return org.telegram.messenger.cd.L0(2131742852, "YourCode");
        }
        return this.f39658b;
    }

    @Override
    public final void h(String str) {
        int i10;
        int i11;
        int i12;
        hf0 hf0Var = this.f39682u0;
        int i13 = hf0Var.f37918a;
        if (i13 == 11) {
            if (this.f39665f0) {
                return;
            }
        } else if (!this.f39665f0) {
            if ((i13 < 1 || i13 > 4) && i13 != 15) {
                return;
            }
        } else {
            return;
        }
        zr zrVar = this.f39664f;
        if (str == null) {
            str = zrVar.getCode();
        }
        int i14 = 0;
        if (TextUtils.isEmpty(str)) {
            hf0.a1(hf0Var, zrVar, false);
            return;
        }
        int i15 = hf0Var.f37918a;
        if (i15 < 1 || i15 > 4 || !zrVar.e) {
            this.f39665f0 = true;
            int i16 = org.telegram.messenger.zs.f19618g4;
            int i17 = this.f39667h0;
            if (i17 == 15) {
                org.telegram.messenger.zs.e().n(this, i16);
            } else if (i17 == 2) {
                org.telegram.messenger.i0.D3(false);
                org.telegram.messenger.zs.e().n(this, i16);
            } else if (i17 == 3) {
                org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19624h4);
            }
            this.f39663e0 = false;
            int i18 = hf0Var.F;
            if (i18 != 1) {
                if (i18 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f39660c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    zrVar.e = true;
                    bs[] bsVarArr = zrVar.f44219f;
                    int length = bsVarArr.length;
                    while (i14 < length) {
                        bsVarArr[i14].A(0.0f);
                        i14++;
                    }
                    i12 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i12).sendRequest(tL_auth_signIn, new be0(this, tL_auth_signIn, 0), 10));
                    hf0Var.D1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f39660c;
                u();
                zrVar.e = true;
                bs[] bsVarArr2 = zrVar.f44219f;
                int length2 = bsVarArr2.length;
                while (i14 < length2) {
                    bsVarArr2[i14].A(0.0f);
                    i14++;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                z(ConnectionsManager.getInstance(i11).sendRequest(changephone, new k(this, 14), 2));
                hf0Var.D1(true, true);
                return;
            }
            this.d = hf0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f39660c;
            u();
            zrVar.e = true;
            bs[] bsVarArr3 = zrVar.f44219f;
            int length3 = bsVarArr3.length;
            while (i14 < length3) {
                bsVarArr3[i14].A(0.0f);
                i14++;
            }
            i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
            z(ConnectionsManager.getInstance(i10).sendRequest(confirmphone, new org.telegram.ui.Components.t20(23, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.bi0 bi0Var = this.f39656a;
        if (bi0Var != null) {
            bi0Var.M(0);
        }
        org.telegram.messenger.i0.h3(new ae0(this, 0), hf0.f37917y0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i10 = this.f39667h0;
        sb2.append(i10);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f39673n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i10);
        if (string2 != null) {
            zr zrVar = this.f39664f;
            if (zrVar.f44219f != null) {
                zrVar.setText(string2);
            }
        }
        int i11 = bundle.getInt("time");
        if (i11 != 0) {
            this.f39657a0 = i11;
        }
        int i12 = bundle.getInt("open");
        if (i12 != 0) {
            this.V = i12;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39664f.getCode();
        int length = code.length();
        int i10 = this.f39667h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i10, code);
        }
        String str = this.f39673n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(i0.a.i(i10, "smsview_params_"), this.H);
        }
        int i11 = this.f39657a0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        bs[] bsVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        zr zrVar = this.f39664f;
        if (zrVar != null && (bsVarArr = zrVar.f44219f) != null) {
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
        removeCallbacks(this.f39681t0);
    }

    public final void p(Runnable runnable) {
        if (this.f39667h0 == 3) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            zr zrVar = this.f39664f;
            bs[] bsVarArr = zrVar.f44219f;
            if (i10 < bsVarArr.length) {
                zrVar.postDelayed(new fe0(this, i10, 2), i10 * 75);
                i10++;
            } else {
                zrVar.postDelayed(new f70(26, this, runnable), (bsVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f39659b0 = 15000;
        int i10 = this.f39657a0;
        if (i10 > 15000) {
            this.f39659b0 = i10;
        }
        this.U = new Timer();
        this.f39662d0 = System.currentTimeMillis();
        this.U.schedule(new le0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        ke0 ke0Var = this.f39683w;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i10, null);
        ke0Var.setTag(2131296386, Integer.valueOf(i10));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new le0(this, 1), 0L, 1000L);
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
        ke0 ke0Var = this.f39683w;
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i10, null);
        this.f39683w.setTag(2131296386, Integer.valueOf(i10));
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
        if (this.f39682u0.q1()) {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        TextView textView = this.f39672n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        this.f39677r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int i12 = this.f39667h0;
        if (i12 == 11) {
            int i13 = org.telegram.ui.ActionBar.t6.f21311y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l6, false);
            int i14 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            hf0.k1(this.L, x03, i14, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            hf0.k1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        }
        q(this.f39656a);
        q(this.P);
        q(this.Q);
        q(this.R);
        zr zrVar = this.f39664f;
        if (zrVar != null) {
            zrVar.invalidate();
        }
        ke0 ke0Var = this.f39683w;
        Integer num = (Integer) ke0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.t6.D6);
        }
        ke0Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, num.intValue(), false));
        if (i12 != 15) {
            this.f39685y.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false));
    }

    public final void v() {
        int i10;
        if (!this.f39665f0 && !this.f39670k0) {
            hf0 hf0Var = this.f39682u0;
            if (!hf0Var.f37937p0) {
                this.f39670k0 = true;
                this.f39683w.invalidate();
                this.f39685y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f39658b);
                bundle.putString("ephone", this.e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f39667h0);
                this.f39665f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f39660c;
                i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ee0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f7;
        zr zrVar = this.f39664f;
        try {
            zrVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i10 = 0;
        while (true) {
            bs[] bsVarArr = zrVar.f44219f;
            if (i10 >= bsVarArr.length) {
                break;
            }
            bsVarArr[i10].setText("");
            zrVar.f44219f[i10].z(1.0f);
            i10++;
        }
        vc0 vc0Var = this.f39684x;
        if (vc0Var.getCurrentView() != this.E) {
            vc0Var.showNext();
        }
        zrVar.f44219f[0].requestFocus();
        if (this.f39667h0 == 11) {
            f7 = 3.5f;
        } else {
            f7 = 10.0f;
        }
        org.telegram.messenger.i0.F3(f7, zrVar, new ae0(this, 7));
        ae0 ae0Var = this.f39681t0;
        removeCallbacks(ae0Var);
        postDelayed(ae0Var, 5000L);
        this.f39680s0 = true;
    }

    public final void y(boolean z10) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f39679s.setAutoRepeat(false);
            org.telegram.ui.Components.bi0 bi0Var = this.Q;
            bi0Var.K(0);
            bi0Var.S(bi0Var.e[0] - 1, new ae0(this, 1));
            return;
        }
        this.f39682u0.s1(z10, true);
    }

    public final void z(int i10) {
        org.telegram.ui.Components.bi0 bi0Var = this.P;
        if (bi0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.bi0 bi0Var2 = this.f39656a;
            if (bi0Var2.f24752a0 != bi0Var2.e[0] - 1) {
                bi0Var2.f24776t0 = new fe0(this, i10, 0);
                return;
            }
            bi0Var.f24776t0 = new ae0(this, 3);
            org.telegram.ui.Components.ei0 ei0Var = this.f39679s;
            ei0Var.setAutoRepeat(false);
            bi0Var.N(0, false, false);
            ei0Var.setAnimation(bi0Var);
            ei0Var.d();
            return;
        }
        this.f39682u0.v1(i10, true);
    }
}
