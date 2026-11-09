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
public final class id0 extends org.telegram.ui.Components.yt0 implements org.telegram.messenger.ls {
    public static final int f46621v0 = 0;
    public final FrameLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final org.telegram.ui.Components.dh0 G;
    public Bundle H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public int N;
    public int O;
    public final org.telegram.ui.Components.ah0 P;
    public final org.telegram.ui.Components.ah0 Q;
    public final org.telegram.ui.Components.ah0 R;
    public boolean S;
    public Timer T;
    public Timer U;
    public int V;
    public final Object W;
    public final org.telegram.ui.Components.ah0 f46622a;
    public int f46623a0;
    public String f46624b;
    public int f46625b0;
    public String f46626c;
    public double f46627c0;
    public String d;
    public double f46628d0;
    public String f46629e;
    public boolean f46630e0;
    public final ar f46631f;
    public boolean f46632f0;
    public String f46633g0;
    public final fb0 h;
    public final int f46634h0;
    public int f46635i0;
    public int f46636j0;
    public boolean f46637k0;
    public String f46638l0;
    public String m0;
    public final TextView f46639n;
    public String f46640n0;
    public int f46641o0;
    public String f46642p0;
    public Bundle f46643q0;
    public final TextView f46644r;
    public TLRPC.TL_auth_sentCode f46645r0;
    public final org.telegram.ui.Components.dh0 f46646s;
    public boolean f46647s0;
    public final vc0 f46648t0;
    public final ee0 f46649u0;
    public final gd0 f46650w;
    public final pb0 f46651x;
    public final gd0 f46652y;

    public id0(org.telegram.ui.ee0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.id0.<init>(org.telegram.ui.ee0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.id0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.id0.n(org.telegram.ui.id0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.ah0 ah0Var) {
        if (ah0Var != null) {
            ah0Var.Q(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.l6.G6;
            ah0Var.Q(org.telegram.ui.ActionBar.l6.x0(null, i7, false), "Phone");
            ah0Var.Q(org.telegram.ui.ActionBar.l6.x0(null, i7, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z9) {
        float f10;
        gd0 gd0Var = this.f46652y;
        if (gd0Var != null) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (gd0Var.getAlpha() != f10) {
                gd0Var.animate().cancel();
                gd0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f46634h0 != 3) {
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
        ee0 ee0Var = this.f46649u0;
        if (ee0Var.F != 0) {
            ee0Var.finishFragment();
            return false;
        }
        int i10 = this.f46636j0;
        if (i10 != 0) {
            ee0Var.M1(i10, true, null, true);
            return false;
        } else if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751263, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("EditNumberInfo", null, 2131751262, this.f46624b));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751335, null), new xc0(this, 0));
            ee0Var.showDialog(u1Var);
            return false;
        } else {
            this.f46632f0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f46626c;
            i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new di.v5(23), 10);
            u();
            t();
            this.H = null;
            int i11 = org.telegram.messenger.qs.f25006g4;
            int i12 = this.f46634h0;
            if (i12 == 15) {
                org.telegram.messenger.qs.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.D3(false);
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012h4);
            }
            this.f46630e0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f46632f0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f46630e0) {
            ar arVar = this.f46631f;
            if (arVar.f43768f != null) {
                if (i7 == org.telegram.messenger.qs.f25006g4) {
                    arVar.setText("" + objArr[0]);
                    h(null);
                } else if (i7 == org.telegram.messenger.qs.f25012h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.f46638l0, str)) {
                        if (!this.f46638l0.equals("*")) {
                            this.f46640n0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f21169a;
                        org.telegram.messenger.iz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = org.telegram.messenger.qs.f25006g4;
        int i10 = this.f46634h0;
        if (i10 == 15) {
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012h4);
        }
        this.f46630e0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f46637k0 = false;
        this.f46632f0 = false;
        if (this.f46636j0 != 0 && (bundle = this.H) != null) {
            bundle.putInt("timeout", this.f46623a0);
        }
    }

    @Override
    public String getHeaderName() {
        int i7 = this.f46634h0;
        if (i7 != 3 && i7 != 11) {
            return org.telegram.messenger.id.M0(2131742827, "YourCode");
        }
        return this.f46624b;
    }

    @Override
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        ee0 ee0Var = this.f46649u0;
        int i12 = ee0Var.f45368a;
        if (i12 == 11) {
            if (this.f46632f0) {
                return;
            }
        } else if (!this.f46632f0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        ar arVar = this.f46631f;
        if (str == null) {
            str = arVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            ee0.c1(ee0Var, arVar, false);
            return;
        }
        int i14 = ee0Var.f45368a;
        if (i14 < 1 || i14 > 4 || !arVar.f43767e) {
            this.f46632f0 = true;
            int i15 = org.telegram.messenger.qs.f25006g4;
            int i16 = this.f46634h0;
            if (i16 == 15) {
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.E3(false);
                org.telegram.messenger.qs.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012h4);
            }
            this.f46630e0 = false;
            int i17 = ee0Var.F;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f46626c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    arVar.f43767e = true;
                    dr[] drVarArr = arVar.f43768f;
                    int length = drVarArr.length;
                    while (i13 < length) {
                        drVarArr[i13].A(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new wc0(this, tL_auth_signIn, 0), 10));
                    ee0Var.N1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f46626c;
                u();
                arVar.f43767e = true;
                dr[] drVarArr2 = arVar.f43768f;
                int length2 = drVarArr2.length;
                while (i13 < length2) {
                    drVarArr2[i13].A(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                ee0Var.N1(true, true);
                return;
            }
            this.d = ee0Var.G;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f46626c;
            u();
            arVar.f43767e = true;
            dr[] drVarArr3 = arVar.f43768f;
            int length3 = drVarArr3.length;
            while (i13 < length3) {
                drVarArr3[i13].A(0.0f);
                i13++;
            }
            i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
            z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new j50(9, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.ah0 ah0Var = this.f46622a;
        if (ah0Var != null) {
            ah0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new vc0(this, 0), ee0.f45367y0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.f46634h0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f46640n0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            ar arVar = this.f46631f;
            if (arVar.f43768f != null) {
                arVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f46623a0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.V = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f46631f.getCode();
        int length = code.length();
        int i7 = this.f46634h0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.f46640n0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.H != null) {
            bundle.putBundle(jg.g.j(i7, "smsview_params_"), this.H);
        }
        int i10 = this.f46623a0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.id0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        dr[] drVarArr;
        boolean z9;
        super.onConfigurationChanged(configuration);
        ar arVar = this.f46631f;
        if (arVar != null && (drVarArr = arVar.f43768f) != null) {
            for (dr drVar : drVarArr) {
                if (a() && !org.telegram.messenger.g0.C1()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                drVar.setShowSoftInputOnFocusCompat(z9);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f46648t0);
    }

    public final void p(Runnable runnable) {
        if (this.f46634h0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            ar arVar = this.f46631f;
            dr[] drVarArr = arVar.f43768f;
            if (i7 < drVarArr.length) {
                arVar.postDelayed(new ad0(this, i7, 2), i7 * 75);
                i7++;
            } else {
                arVar.postDelayed(new bd0(3, this, runnable), (drVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.U != null) {
            return;
        }
        this.f46625b0 = 15000;
        int i7 = this.f46623a0;
        if (i7 > 15000) {
            this.f46625b0 = i7;
        }
        this.U = new Timer();
        this.f46628d0 = System.currentTimeMillis();
        this.U.schedule(new hd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.T != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.l6.D6;
        gd0 gd0Var = this.f46650w;
        org.telegram.ui.ActionBar.s6.U(gd0Var, i7, null);
        gd0Var.setTag(2131296386, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new hd0(this, 1), 0L, 1000L);
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
        gd0 gd0Var = this.f46650w;
        int i7 = org.telegram.ui.ActionBar.l6.D6;
        org.telegram.ui.ActionBar.s6.U(gd0Var, i7, null);
        this.f46650w.setTag(2131296386, Integer.valueOf(i7));
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
        if (this.f46649u0.A1()) {
            i7 = org.telegram.ui.ActionBar.l6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        TextView textView = this.f46639n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.P9, false));
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        this.f46644r.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        int i11 = this.f46634h0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.l6.f28257y6;
            this.J.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
            this.K.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28012l6, false);
            int i13 = this.N;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ee0.u1(this.L, x03, i13, mode);
            this.N = x03;
            int x04 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
            ee0.u1(this.M, x04, this.O, mode);
            this.O = x04;
            this.I.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        }
        q(this.f46622a);
        q(this.P);
        q(this.Q);
        q(this.R);
        ar arVar = this.f46631f;
        if (arVar != null) {
            arVar.invalidate();
        }
        gd0 gd0Var = this.f46650w;
        Integer num = (Integer) gd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.l6.D6);
        }
        gd0Var.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f46652y.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false));
        }
        this.E.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28106q7, false));
    }

    public final void v() {
        int i7;
        if (!this.f46632f0 && !this.f46637k0) {
            ee0 ee0Var = this.f46649u0;
            if (!ee0Var.f45388p0) {
                this.f46637k0 = true;
                this.f46650w.invalidate();
                this.f46652y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f46624b);
                bundle.putString("ephone", this.f46629e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f46634h0);
                this.f46632f0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f46626c;
                i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new zc0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        ar arVar = this.f46631f;
        try {
            arVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            dr[] drVarArr = arVar.f43768f;
            if (i7 >= drVarArr.length) {
                break;
            }
            drVarArr[i7].setText("");
            arVar.f43768f[i7].z(1.0f);
            i7++;
        }
        pb0 pb0Var = this.f46651x;
        if (pb0Var.getCurrentView() != this.E) {
            pb0Var.showNext();
        }
        arVar.f43768f[0].requestFocus();
        if (this.f46634h0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.G3(f10, arVar, new vc0(this, 7));
        vc0 vc0Var = this.f46648t0;
        removeCallbacks(vc0Var);
        postDelayed(vc0Var, 5000L);
        this.f46647s0 = true;
    }

    public final void y(boolean z9) {
        if (this.P != null) {
            if (!this.S) {
                return;
            }
            this.S = false;
            this.f46646s.setAutoRepeat(false);
            org.telegram.ui.Components.ah0 ah0Var = this.Q;
            ah0Var.K(0);
            ah0Var.S(ah0Var.f31826e[0] - 1, new vc0(this, 1));
            return;
        }
        this.f46649u0.C1(z9, true);
    }

    public final void z(int i7) {
        org.telegram.ui.Components.ah0 ah0Var = this.P;
        if (ah0Var != null) {
            if (this.S) {
                return;
            }
            this.S = true;
            org.telegram.ui.Components.ah0 ah0Var2 = this.f46622a;
            if (ah0Var2.f31820a0 != ah0Var2.f31826e[0] - 1) {
                ah0Var2.f31845t0 = new ad0(this, i7, 0);
                return;
            }
            ah0Var.f31845t0 = new vc0(this, 3);
            org.telegram.ui.Components.dh0 dh0Var = this.f46646s;
            dh0Var.setAutoRepeat(false);
            ah0Var.N(0, false, false);
            dh0Var.setAnimation(ah0Var);
            dh0Var.d();
            return;
        }
        this.f46649u0.F1(i7, true);
    }
}
