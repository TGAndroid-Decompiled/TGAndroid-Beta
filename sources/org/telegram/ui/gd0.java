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
public final class gd0 extends org.telegram.ui.Components.wt0 implements org.telegram.messenger.ls {
    public static final int f45952v0 = 0;
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
    public final org.telegram.ui.Components.zg0 f45953a;
    public int f45954a0;
    public String f45955b;
    public int f45956b0;
    public String f45957c;
    public double f45958c0;
    public String d;
    public double f45959d0;
    public String f45960e;
    public boolean f45961e0;
    public final yq f45962f;
    public boolean f45963f0;
    public String f45964g0;
    public final db0 h;
    public final int f45965h0;
    public int f45966i0;
    public int f45967j0;
    public boolean f45968k0;
    public String f45969l0;
    public String m0;
    public final TextView f45970n;
    public String f45971n0;
    public int f45972o0;
    public String f45973p0;
    public Bundle f45974q0;
    public final TextView f45975r;
    public TLRPC.TL_auth_sentCode f45976r0;
    public final org.telegram.ui.Components.ch0 f45977s;
    public boolean f45978s0;
    public final tc0 f45979t0;
    public final ce0 f45980u0;
    public final ed0 f45981w;
    public final nb0 f45982x;
    public final ed0 f45983y;

    public gd0(org.telegram.ui.ce0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd0.<init>(org.telegram.ui.ce0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.gd0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd0.n(org.telegram.ui.gd0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.zg0 zg0Var) {
        if (zg0Var != null) {
            zg0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.k6.G6;
            zg0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i7, false), "Phone");
            zg0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i7, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z9) {
        float f10;
        ed0 ed0Var = this.f45983y;
        if (ed0Var != null) {
            if (z9) {
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
        if (this.f45965h0 != 3) {
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
        ce0 ce0Var = this.f45980u0;
        if (ce0Var.F != 0) {
            ce0Var.finishFragment();
            return false;
        }
        int i10 = this.f45967j0;
        if (i10 != 0) {
            ce0Var.M1(i10, true, null, true);
            return false;
        } else if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131751264, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("EditNumberInfo", null, 2131751263, this.f45955b));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751336, null), new vc0(this, 0));
            ce0Var.showDialog(u1Var);
            return false;
        } else {
            this.f45963f0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f45957c;
            i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new di.u5(23), 10);
            u();
            t();
            this.H = null;
            int i11 = org.telegram.messenger.qs.f24997g4;
            int i12 = this.f45965h0;
            if (i12 == 15) {
                org.telegram.messenger.qs.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.D3(false);
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25003h4);
            }
            this.f45961e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f45963f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f45961e0) {
            yq yqVar = this.f45962f;
            if (yqVar.f52309f != null) {
                if (i7 == org.telegram.messenger.qs.f24997g4) {
                    yqVar.setText("" + objArr[0]);
                    h(null);
                } else if (i7 == org.telegram.messenger.qs.f25003h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.f45969l0, str)) {
                        if (!this.f45969l0.equals("*")) {
                            this.f45971n0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f21166a;
                        org.telegram.messenger.iz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = org.telegram.messenger.qs.f24997g4;
        int i10 = this.f45965h0;
        if (i10 == 15) {
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25003h4);
        }
        this.f45961e0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f45968k0 = false;
        this.f45963f0 = false;
        if (this.f45967j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f45954a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i7 = this.f45965h0;
        if (i7 != 3 && i7 != 11) {
            return org.telegram.messenger.hd.M0(2131742828, "YourCode");
        }
        return this.f45955b;
    }

    @Override
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        ce0 ce0Var = this.f45980u0;
        int i12 = ce0Var.f44756a;
        if (i12 == 11) {
            if (this.f45963f0) {
                return;
            }
        } else if (!this.f45963f0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        yq yqVar = this.f45962f;
        if (str == null) {
            str = yqVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            ce0.c1(ce0Var, yqVar, false);
            return;
        }
        int i14 = ce0Var.f44756a;
        if (i14 < 1 || i14 > 4 || !yqVar.f52308e) {
            this.f45963f0 = true;
            int i15 = org.telegram.messenger.qs.f24997g4;
            int i16 = this.f45965h0;
            if (i16 == 15) {
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25003h4);
            }
            this.f45961e0 = false;
            int i17 = ce0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f45957c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    yqVar.f52308e = true;
                    br[] brVarArr = yqVar.f52309f;
                    int length = brVarArr.length;
                    while (i13 < length) {
                        brVarArr[i13].A(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new uc0(this, tL_auth_signIn, 0), 10));
                    ce0Var.N1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f45957c;
                u();
                yqVar.f52308e = true;
                br[] brVarArr2 = yqVar.f52309f;
                int length2 = brVarArr2.length;
                while (i13 < length2) {
                    brVarArr2[i13].A(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                ce0Var.N1(true, true);
                return;
            }
            this.d = ce0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f45957c;
            u();
            yqVar.f52308e = true;
            br[] brVarArr3 = yqVar.f52309f;
            int length3 = brVarArr3.length;
            while (i13 < length3) {
                brVarArr3[i13].A(0.0f);
                i13++;
            }
            i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
            z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new h50(9, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.zg0 zg0Var = this.f45953a;
        if (zg0Var != null) {
            zg0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new tc0(this, 0), ce0.f44755y0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.f45965h0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f45971n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            yq yqVar = this.f45962f;
            if (yqVar.f52309f != null) {
                yqVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f45954a0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.V = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f45962f.getCode();
        int length = code.length();
        int i7 = this.f45965h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.f45971n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(jg.g.j(i7, "smsview_params_"), this.H);
        }
        int i10 = this.f45954a0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        br[] brVarArr;
        boolean z9;
        super.onConfigurationChanged(configuration);
        yq yqVar = this.f45962f;
        if (yqVar != null && (brVarArr = yqVar.f52309f) != null) {
            for (br brVar : brVarArr) {
                if (a() && !org.telegram.messenger.g0.C1()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                brVar.setShowSoftInputOnFocusCompat(z9);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f45979t0);
    }

    public final void p(Runnable runnable) {
        if (this.f45965h0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            yq yqVar = this.f45962f;
            br[] brVarArr = yqVar.f52309f;
            if (i7 < brVarArr.length) {
                yqVar.postDelayed(new yc0(this, i7, 2), i7 * 75);
                i7++;
            } else {
                yqVar.postDelayed(new zc0(3, this, runnable), (brVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f45956b0 = 15000;
        int i7 = this.f45954a0;
        if (i7 > 15000) {
            this.f45956b0 = i7;
        }
        this.U = new Timer();
        this.f45959d0 = System.currentTimeMillis();
        this.U.schedule(new fd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.k6.D6;
        ed0 ed0Var = this.f45981w;
        org.telegram.ui.ActionBar.r6.V(ed0Var, i7, null);
        ed0Var.setTag(2131296386, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new fd0(this, 1), 0L, 1000L);
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
        ed0 ed0Var = this.f45981w;
        int i7 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(ed0Var, i7, null);
        this.f45981w.setTag(2131296386, Integer.valueOf(i7));
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
        if (this.f45980u0.A1()) {
            i7 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        TextView textView = this.f45970n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f45975r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = this.f45965h0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.k6.f28241y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27996l6, false);
            int i13 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ce0.u1(this.L, x03, i13, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ce0.u1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        }
        q(this.f45953a);
        q(this.P);
        q(this.Q);
        q(this.R);
        yq yqVar = this.f45962f;
        if (yqVar != null) {
            yqVar.invalidate();
        }
        ed0 ed0Var = this.f45981w;
        Integer num = (Integer) ed0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.k6.D6);
        }
        ed0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f45983y.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28089q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28090q7, false));
    }

    public final void v() {
        int i7;
        if (!this.f45963f0 && !this.f45968k0) {
            ce0 ce0Var = this.f45980u0;
            if (!ce0Var.f44776p0) {
                this.f45968k0 = true;
                this.f45981w.invalidate();
                this.f45983y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f45955b);
                bundle.putString("ephone", this.f45960e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f45965h0);
                this.f45963f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f45957c;
                i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new xc0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        yq yqVar = this.f45962f;
        try {
            yqVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            br[] brVarArr = yqVar.f52309f;
            if (i7 >= brVarArr.length) {
                break;
            }
            brVarArr[i7].setText("");
            yqVar.f52309f[i7].z(1.0f);
            i7++;
        }
        nb0 nb0Var = this.f45982x;
        if (nb0Var.getCurrentView() != this.E) {
            nb0Var.showNext();
        }
        yqVar.f52309f[0].requestFocus();
        if (this.f45965h0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.G3(f10, yqVar, new tc0(this, 7));
        tc0 tc0Var = this.f45979t0;
        removeCallbacks(tc0Var);
        postDelayed(tc0Var, 5000L);
        this.f45978s0 = true;
    }

    public final void y(boolean z9) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f45977s.setAutoRepeat(false);
            org.telegram.ui.Components.zg0 zg0Var = this.Q;
            zg0Var.K(0);
            zg0Var.S(zg0Var.f40976e[0] - 1, new tc0(this, 1));
            return;
        }
        this.f45980u0.C1(z9, true);
    }

    public final void z(int i7) {
        org.telegram.ui.Components.zg0 zg0Var = this.P;
        if (zg0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.zg0 zg0Var2 = this.f45953a;
            if (zg0Var2.f40970a0 != zg0Var2.f40976e[0] - 1) {
                zg0Var2.f40995t0 = new yc0(this, i7, 0);
                return;
            }
            zg0Var.f40995t0 = new tc0(this, 3);
            org.telegram.ui.Components.ch0 ch0Var = this.f45977s;
            ch0Var.setAutoRepeat(false);
            zg0Var.N(0, false, false);
            ch0Var.setAnimation(zg0Var);
            ch0Var.d();
            return;
        }
        this.f45980u0.F1(i7, true);
    }
}
