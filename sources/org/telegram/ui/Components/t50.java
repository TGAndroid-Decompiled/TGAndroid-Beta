package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public class t50 extends v41 implements org.telegram.messenger.cs {
    public final a0.h L1;
    public final s50 M1;
    public final org.telegram.ui.ActionBar.k1 N1;
    public final p50 O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public AnimatorSet V1;
    public final ArrayList W1;
    public final a0.h X1;
    public boolean Y1;
    public float Z1;
    public ValueAnimator f38288a2;
    public y10 f38289b2;
    public int c2;
    public org.telegram.ui.m40 f38290d2;
    public org.telegram.ui.ur f38291e2;
    public ArrayList f38292f2;
    public int f38293g2;
    public final float f38294h2;
    public final org.telegram.ui.ActionBar.d2 f38295i2;
    public final androidx.mediarouter.app.w f38296j2;
    public int f38297k2;
    public final l00 f38298l2;
    public int f38299m2;
    public final long f38300n2;
    public boolean f38301o2;
    public float f38302p2;
    public boolean f38303q2;
    public TLRPC.TL_chatInviteExported f38304r2;

    public t50(Context context, int i3, a0.h hVar, long j10, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.W1 = new ArrayList();
        this.X1 = new a0.h();
        this.Z1 = 0.0f;
        this.f38296j2 = new androidx.mediarouter.app.w(this, 11);
        this.L1 = hVar;
        this.f39006y1 = false;
        this.f38295i2 = d2Var;
        this.f38300n2 = j10;
        N();
        this.f39001t1.K.setHint(org.telegram.messenger.bd.M0(2131745780, null));
        this.f38294h2 = ViewConfiguration.get(context).getScaledTouchSlop();
        p50 p50Var = new p50(this);
        this.O1 = p50Var;
        this.m1 = p50Var;
        ci.j1 j1Var = this.f38994l1;
        n50 n50Var = new n50(this);
        this.f38995n1 = n50Var;
        j1Var.setAdapter(n50Var);
        this.f38999r1.e(false, false);
        this.f38999r1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.g5.r(i3).f22653f0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (a22 != null && !a22.self && !a22.deleted) {
                this.W1.add(a22);
            }
        }
        s50 s50Var = new s50(this, context);
        this.M1 = s50Var;
        this.f38994l1.setOnItemClickListener(new org.telegram.ui.lb(this, j10, d2Var, hVar, context));
        ci.j1 j1Var2 = this.f38994l1;
        u4.k kVar = new u4.k();
        kVar.f55597o = xq.f40452f;
        kVar.f55617e = 150L;
        kVar.f55616c = 150L;
        kVar.d = 150L;
        this.f28598f0 = false;
        j1Var2.setItemAnimator(kVar);
        T0();
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(this, context, 1);
        this.N1 = k1Var;
        k1Var.setVisibility(8);
        k1Var.setClipChildren(false);
        k1Var.addView(s50Var);
        this.f28586b.addView(k1Var);
        l00 l00Var = new l00(context, e6Var, false);
        this.f38298l2 = l00Var;
        l00Var.setImageResource(2131231195);
        l00Var.setOnClickListener(new ci.c3(this, context, j10, 4));
        l00Var.e(false, false);
        l00Var.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        this.f28586b.addView(l00Var, l00.b());
        ((ViewGroup.MarginLayoutParams) this.f38999r1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f38999r1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f38999r1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public final t41 I0(Context context) {
        return new k50(this, context);
    }

    @Override
    public final void J0(MotionEvent motionEvent, bh.g gVar) {
        org.telegram.ui.ActionBar.d2 d2Var;
        long j10;
        if (motionEvent.getAction() == 0) {
            this.f38302p2 = this.f39003v1;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f39003v1 - this.f38302p2) < this.f38294h2 && !this.f38301o2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                d2Var = (org.telegram.ui.ActionBar.d2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                d2Var = null;
            }
            if (d2Var instanceof org.telegram.ui.wm) {
                boolean pa2 = ((org.telegram.ui.wm) d2Var).pa();
                this.f38301o2 = true;
                j50 j50Var = new j50(0, this, gVar);
                if (pa2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                org.telegram.messenger.g0.i3(j50Var, j10);
                return;
            }
            this.f38301o2 = true;
            A0(true);
            gVar.requestFocus();
            org.telegram.messenger.g0.h3(new zs(gVar, 3));
        }
    }

    @Override
    public final void K() {
        super.K();
        if (this.f38301o2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (d2Var instanceof org.telegram.ui.wm) {
                    ((org.telegram.ui.wm) d2Var).ta(true, true);
                }
            }
        }
    }

    @Override
    public final void L0(String str) {
        p50 p50Var = this.O1;
        if (p50Var.h != null) {
            Utilities.f21389g.a(p50Var.h);
            p50Var.h = null;
        }
        p50Var.f37065c.clear();
        p50Var.d.clear();
        p50Var.f37066e.f(null, null);
        p50Var.f37066e.g(null, true, false, false, false, 0L, false, 0, 0);
        p50Var.f();
        if (!TextUtils.isEmpty(str)) {
            u4.h0 adapter = p50Var.f37068n.f38994l1.getAdapter();
            t50 t50Var = p50Var.f37068n;
            sj0 sj0Var = t50Var.m1;
            if (adapter != sj0Var) {
                t50Var.f38994l1.setAdapter(sj0Var);
            }
            p50Var.f37068n.f38999r1.e(true, false);
            org.telegram.messenger.p5 p5Var = Utilities.f21389g;
            o50 o50Var = new o50(p50Var, str, 0);
            p50Var.h = o50Var;
            p5Var.e(o50Var, 300L);
            return;
        }
        u4.h0 adapter2 = p50Var.f37068n.f38994l1.getAdapter();
        t50 t50Var2 = p50Var.f37068n;
        sj0 sj0Var2 = t50Var2.f38995n1;
        if (adapter2 != sj0Var2) {
            t50Var2.f38994l1.setAdapter(sj0Var2);
        }
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.X1.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.Y1 != z11) {
            ValueAnimator valueAnimator = this.f38288a2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f38288a2.cancel();
            }
            this.Y1 = z11;
            org.telegram.ui.ActionBar.k1 k1Var = this.N1;
            if (z11) {
                k1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.Z1;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f38288a2 = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 27));
                this.f38288a2.addListener(new s9(13, this, z11));
                this.f38288a2.setDuration(150L);
                this.f38288a2.start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                this.Z1 = f10;
                this.f28586b.invalidate();
                if (!z11) {
                    k1Var.setVisibility(8);
                }
            }
            if (!this.Y1 && this.f38291e2 == null) {
                z12 = false;
            }
            this.f38298l2.e(z12, z10);
        }
    }

    public final void T0() {
        this.Q1 = -1;
        this.R1 = -1;
        this.P1 = -1;
        this.S1 = -1;
        boolean z10 = true;
        this.U1 = 1;
        if (this.f38291e2 == null) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.f28583a);
            long j10 = this.f38300n2;
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j10));
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.f28583a).N0(j10);
            if ((M0 == null || TextUtils.isEmpty(org.telegram.messenger.t3.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z10 = R0();
            }
            if (z10) {
                int i3 = this.U1;
                this.U1 = i3 + 1;
                this.P1 = i3;
            }
            ArrayList arrayList = this.W1;
            if (arrayList.size() != 0) {
                int i10 = this.U1;
                this.Q1 = i10;
                int size = arrayList.size() + i10;
                this.U1 = size;
                this.R1 = size;
            } else {
                int i11 = this.U1;
                this.U1 = i11 + 1;
                this.S1 = i11;
            }
        } else if (this.f38292f2.size() != 0) {
            int i12 = this.U1;
            this.Q1 = i12;
            int size2 = this.f38292f2.size() + i12;
            this.U1 = size2;
            this.R1 = size2;
        } else {
            int i13 = this.U1;
            this.U1 = i13 + 1;
            this.S1 = i13;
        }
        int i14 = this.U1;
        this.U1 = i14 + 1;
        this.T1 = i14;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23298s && this.f38291e2 != null && this.f38292f2.isEmpty()) {
            this.f38292f2 = new ArrayList(org.telegram.messenger.hp.s1(this.f28583a).F);
            this.f38995n1.f();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23298s);
    }
}
