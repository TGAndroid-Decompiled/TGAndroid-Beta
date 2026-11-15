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
public final class ed0 extends org.telegram.ui.Components.xt0 implements org.telegram.messenger.is {
    public static final int f46720w0 = 0;
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
    public final org.telegram.ui.Components.ch0 f46721a;
    public final Object f46722a0;
    public String f46723b;
    public int f46724b0;
    public String f46725c;
    public int f46726c0;
    public String d;
    public double f46727d0;
    public String f46728e;
    public double f46729e0;
    public final ar f46730f;
    public boolean f46731f0;
    public boolean f46732g0;
    public final db0 h;
    public String f46733h0;
    public final int f46734i0;
    public int f46735j0;
    public int f46736k0;
    public boolean f46737l0;
    public String m0;
    public final TextView f46738n;
    public String f46739n0;
    public String f46740o0;
    public int f46741p0;
    public String f46742q0;
    public final TextView f46743r;
    public Bundle f46744r0;
    public final org.telegram.ui.Components.fh0 f46745s;
    public TLRPC.TL_auth_sentCode f46746s0;
    public boolean f46747t0;
    public final sc0 f46748u0;
    public final ce0 f46749v0;
    public final cd0 f46750w;
    public final nb0 f46751x;
    public final cd0 f46752y;

    public ed0(org.telegram.ui.ce0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed0.<init>(org.telegram.ui.ce0, android.content.Context, int):void");
    }

    public static void n(org.telegram.ui.ed0 r14, android.content.Context r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed0.n(org.telegram.ui.ed0, android.content.Context):void");
    }

    public static void q(org.telegram.ui.Components.ch0 ch0Var) {
        if (ch0Var != null) {
            ch0Var.Q(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.P9, false), "Bubble");
            int i7 = org.telegram.ui.ActionBar.j6.G6;
            ch0Var.Q(org.telegram.ui.ActionBar.j6.x0(null, i7, false), "Phone");
            ch0Var.Q(org.telegram.ui.ActionBar.j6.x0(null, i7, false), "Note");
        }
    }

    public void setProblemTextVisible(boolean z10) {
        float f10;
        cd0 cd0Var = this.f46752y;
        if (cd0Var != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (cd0Var.getAlpha() != f10) {
                cd0Var.animate().cancel();
                cd0Var.animate().alpha(f10).setDuration(150L).start();
            }
        }
    }

    @Override
    public final boolean a() {
        if (this.f46734i0 != 3) {
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
        ce0 ce0Var = this.f46749v0;
        if (ce0Var.G != 0) {
            ce0Var.finishFragment();
            return false;
        }
        int i10 = this.f46736k0;
        if (i10 != 0) {
            ce0Var.M1(i10, true, null, true);
            return false;
        } else if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131751263, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("EditNumberInfo", null, 2131751262, this.f46723b));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752041, null), null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751335, null), new uc0(this, 0));
            ce0Var.showDialog(t1Var);
            return false;
        } else {
            this.f46732g0 = false;
            y(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.d;
            tL_auth_cancelCode.phone_code_hash = this.f46725c;
            i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new fi.m5(23), 10);
            u();
            t();
            this.I = null;
            int i11 = org.telegram.messenger.ns.f25503g4;
            int i12 = this.f46734i0;
            if (i12 == 15) {
                org.telegram.messenger.ns.e().n(this, i11);
            } else if (i12 == 2) {
                org.telegram.messenger.g0.D3(false);
                org.telegram.messenger.ns.e().n(this, i11);
            } else if (i12 == 3) {
                org.telegram.messenger.g0.C3(false);
                org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25509h4);
            }
            this.f46731f0 = false;
            return true;
        }
    }

    @Override
    public final void d() {
        this.f46732g0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.f46731f0) {
            ar arVar = this.f46730f;
            if (arVar.f45485f != null) {
                if (i7 == org.telegram.messenger.ns.f25503g4) {
                    arVar.setText("" + objArr[0]);
                    h(null);
                } else if (i7 == org.telegram.messenger.ns.f25509h4) {
                    String str = "" + objArr[0];
                    if (org.telegram.messenger.g0.x(this.m0, str)) {
                        if (!this.m0.equals("*")) {
                            this.f46740o0 = str;
                            org.telegram.messenger.g0.T();
                        }
                        h(str);
                        int i11 = CallReceiver.f22248a;
                        org.telegram.messenger.gz.q().edit().remove("last_call_phone_number").remove("last_call_time").apply();
                    }
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = org.telegram.messenger.ns.f25503g4;
        int i10 = this.f46734i0;
        if (i10 == 15) {
            org.telegram.messenger.ns.e().n(this, i7);
        } else if (i10 == 2) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.ns.e().n(this, i7);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25509h4);
        }
        this.f46731f0 = false;
        u();
        t();
    }

    @Override
    public final void g() {
        Bundle bundle;
        this.f46737l0 = false;
        this.f46732g0 = false;
        if (this.f46736k0 != 0 && (bundle = this.I) != null) {
            bundle.putInt("timeout", this.f46724b0);
        }
    }

    @Override
    public String getHeaderName() {
        int i7 = this.f46734i0;
        if (i7 != 3 && i7 != 11) {
            return org.telegram.messenger.hd.M0(2131742827, "YourCode");
        }
        return this.f46723b;
    }

    @Override
    public final void h(String str) {
        int i7;
        int i10;
        int i11;
        ce0 ce0Var = this.f46749v0;
        int i12 = ce0Var.f46074a;
        if (i12 == 11) {
            if (this.f46732g0) {
                return;
            }
        } else if (!this.f46732g0) {
            if ((i12 < 1 || i12 > 4) && i12 != 15) {
                return;
            }
        } else {
            return;
        }
        ar arVar = this.f46730f;
        if (str == null) {
            str = arVar.getCode();
        }
        int i13 = 0;
        if (TextUtils.isEmpty(str)) {
            ce0.c1(ce0Var, arVar, false);
            return;
        }
        int i14 = ce0Var.f46074a;
        if (i14 < 1 || i14 > 4 || !arVar.f45484e) {
            this.f46732g0 = true;
            int i15 = org.telegram.messenger.ns.f25503g4;
            int i16 = this.f46734i0;
            if (i16 == 15) {
                org.telegram.messenger.ns.e().n(this, i15);
            } else if (i16 == 2) {
                org.telegram.messenger.g0.D3(false);
                org.telegram.messenger.ns.e().n(this, i15);
            } else if (i16 == 3) {
                org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25509h4);
            }
            this.f46731f0 = false;
            int i17 = ce0Var.G;
            if (i17 != 1) {
                if (i17 != 2) {
                    TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                    tL_auth_signIn.phone_number = this.d;
                    tL_auth_signIn.phone_code = str;
                    tL_auth_signIn.phone_code_hash = this.f46725c;
                    tL_auth_signIn.flags |= 1;
                    u();
                    arVar.f45484e = true;
                    dr[] drVarArr = arVar.f45485f;
                    int length = drVarArr.length;
                    while (i13 < length) {
                        drVarArr[i13].B(0.0f);
                        i13++;
                    }
                    i11 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                    z(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_signIn, new tc0(this, tL_auth_signIn, 0), 10));
                    ce0Var.N1(true, true);
                    return;
                }
                TL_account.changePhone changephone = new TL_account.changePhone();
                changephone.phone_number = this.d;
                changephone.phone_code = str;
                changephone.phone_code_hash = this.f46725c;
                u();
                arVar.f45484e = true;
                dr[] drVarArr2 = arVar.f45485f;
                int length2 = drVarArr2.length;
                while (i13 < length2) {
                    drVarArr2[i13].B(0.0f);
                    i13++;
                }
                i10 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                z(ConnectionsManager.getInstance(i10).sendRequest(changephone, new l(this, 13), 2));
                ce0Var.N1(true, true);
                return;
            }
            this.d = ce0Var.H;
            TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
            confirmphone.phone_code = str;
            confirmphone.phone_code_hash = this.f46725c;
            u();
            arVar.f45484e = true;
            dr[] drVarArr3 = arVar.f45485f;
            int length3 = drVarArr3.length;
            while (i13 < length3) {
                drVarArr3[i13].B(0.0f);
                i13++;
            }
            i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
            z(ConnectionsManager.getInstance(i7).sendRequest(confirmphone, new b00(11, this, confirmphone), 2));
        }
    }

    @Override
    public final void j() {
        org.telegram.ui.Components.ch0 ch0Var = this.f46721a;
        if (ch0Var != null) {
            ch0Var.M(0);
        }
        org.telegram.messenger.g0.i3(new sc0(this, 0), ce0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("smsview_params_");
        int i7 = this.f46734i0;
        sb2.append(i7);
        Bundle bundle2 = bundle.getBundle(sb2.toString());
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("catchedPhone");
        if (string != null) {
            this.f46740o0 = string;
        }
        String string2 = bundle.getString("smsview_code_" + i7);
        if (string2 != null) {
            ar arVar = this.f46730f;
            if (arVar.f45485f != null) {
                arVar.setText(string2);
            }
        }
        int i10 = bundle.getInt("time");
        if (i10 != 0) {
            this.f46724b0 = i10;
        }
        int i11 = bundle.getInt("open");
        if (i11 != 0) {
            this.W = i11;
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f46730f.getCode();
        int length = code.length();
        int i7 = this.f46734i0;
        if (length != 0) {
            bundle.putString("smsview_code_" + i7, code);
        }
        String str = this.f46740o0;
        if (str != null) {
            bundle.putString("catchedPhone", str);
        }
        if (this.I != null) {
            bundle.putBundle(i5.c.i(i7, "smsview_params_"), this.I);
        }
        int i10 = this.f46724b0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed0.m(android.os.Bundle, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        dr[] drVarArr;
        boolean z10;
        super.onConfigurationChanged(configuration);
        ar arVar = this.f46730f;
        if (arVar != null && (drVarArr = arVar.f45485f) != null) {
            for (dr drVar : drVarArr) {
                if (a() && !org.telegram.messenger.g0.C1()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                drVar.setShowSoftInputOnFocusCompat(z10);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f46748u0);
    }

    public final void p(Runnable runnable) {
        if (this.f46734i0 == 3) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            ar arVar = this.f46730f;
            dr[] drVarArr = arVar.f45485f;
            if (i7 < drVarArr.length) {
                arVar.postDelayed(new xc0(this, i7, 2), i7 * 75);
                i7++;
            } else {
                arVar.postDelayed(new g50(29, this, runnable), (drVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void r() {
        if (this.V != null) {
            return;
        }
        this.f46726c0 = 15000;
        int i7 = this.f46724b0;
        if (i7 > 15000) {
            this.f46726c0 = i7;
        }
        this.V = new Timer();
        this.f46729e0 = System.currentTimeMillis();
        this.V.schedule(new dd0(this, 0), 0L, 1000L);
    }

    public final void s() {
        if (this.U != null) {
            return;
        }
        int i7 = org.telegram.ui.ActionBar.j6.D6;
        cd0 cd0Var = this.f46750w;
        org.telegram.ui.ActionBar.q6.U(cd0Var, i7, null);
        cd0Var.setTag(2131296386, Integer.valueOf(i7));
        Timer timer = new Timer();
        this.U = timer;
        timer.schedule(new dd0(this, 1), 0L, 1000L);
    }

    public final void t() {
        try {
            synchronized (this.f46722a0) {
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
        cd0 cd0Var = this.f46750w;
        int i7 = org.telegram.ui.ActionBar.j6.D6;
        org.telegram.ui.ActionBar.q6.U(cd0Var, i7, null);
        this.f46750w.setTag(2131296386, Integer.valueOf(i7));
        try {
            synchronized (this.f46722a0) {
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
        if (this.f46749v0.A1()) {
            i7 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.D6;
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        TextView textView = this.f46738n;
        textView.setTextColor(x02);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.P9, false));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f46743r.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        int i11 = this.f46734i0;
        if (i11 == 11) {
            int i12 = org.telegram.ui.ActionBar.j6.f29241y6;
            this.K.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
            this.L.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28996l6, false);
            int i13 = this.O;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ce0.u1(this.M, x03, i13, mode);
            this.O = x03;
            int x04 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            ce0.u1(this.N, x04, this.P, mode);
            this.P = x04;
            this.J.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        }
        q(this.f46721a);
        q(this.Q);
        q(this.R);
        q(this.S);
        ar arVar = this.f46730f;
        if (arVar != null) {
            arVar.invalidate();
        }
        cd0 cd0Var = this.f46750w;
        Integer num = (Integer) cd0Var.getTag();
        if (num == null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.j6.D6);
        }
        cd0Var.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, num.intValue(), false));
        if (i11 != 15) {
            this.f46752y.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
        }
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false));
    }

    public final void v() {
        int i7;
        if (!this.f46732g0 && !this.f46737l0) {
            ce0 ce0Var = this.f46749v0;
            if (!ce0Var.f46097r0) {
                this.f46737l0 = true;
                this.f46750w.invalidate();
                this.f46752y.invalidate();
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.f46723b);
                bundle.putString("ephone", this.f46728e);
                bundle.putString("phoneFormated", this.d);
                bundle.putInt("prevType", this.f46734i0);
                this.f46732g0 = true;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.d;
                tL_auth_resendCode.phone_code_hash = this.f46725c;
                i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                z(ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new wc0(this, bundle, 1), 10));
            }
        }
    }

    public final void w() {
        float f10;
        ar arVar = this.f46730f;
        try {
            arVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        int i7 = 0;
        while (true) {
            dr[] drVarArr = arVar.f45485f;
            if (i7 >= drVarArr.length) {
                break;
            }
            drVarArr[i7].setText("");
            arVar.f45485f[i7].A(1.0f);
            i7++;
        }
        nb0 nb0Var = this.f46751x;
        if (nb0Var.getCurrentView() != this.F) {
            nb0Var.showNext();
        }
        arVar.f45485f[0].requestFocus();
        if (this.f46734i0 == 11) {
            f10 = 3.5f;
        } else {
            f10 = 10.0f;
        }
        org.telegram.messenger.g0.F3(f10, arVar, new sc0(this, 7));
        sc0 sc0Var = this.f46748u0;
        removeCallbacks(sc0Var);
        postDelayed(sc0Var, 5000L);
        this.f46747t0 = true;
    }

    public final void y(boolean z10) {
        if (this.Q != null) {
            if (!this.T) {
                return;
            }
            this.T = false;
            this.f46745s.setAutoRepeat(false);
            org.telegram.ui.Components.ch0 ch0Var = this.R;
            ch0Var.K(0);
            ch0Var.S(ch0Var.f33579e[0] - 1, new sc0(this, 1));
            return;
        }
        this.f46749v0.C1(z10, true);
    }

    public final void z(int i7) {
        org.telegram.ui.Components.ch0 ch0Var = this.Q;
        if (ch0Var != null) {
            if (this.T) {
                return;
            }
            this.T = true;
            org.telegram.ui.Components.ch0 ch0Var2 = this.f46721a;
            if (ch0Var2.f33575b0 != ch0Var2.f33579e[0] - 1) {
                ch0Var2.f33599u0 = new xc0(this, i7, 0);
                return;
            }
            ch0Var.f33599u0 = new sc0(this, 3);
            org.telegram.ui.Components.fh0 fh0Var = this.f46745s;
            fh0Var.setAutoRepeat(false);
            ch0Var.N(0, false, false);
            fh0Var.setAnimation(ch0Var);
            fh0Var.d();
            return;
        }
        this.f46749v0.F1(i7, true);
    }
}
