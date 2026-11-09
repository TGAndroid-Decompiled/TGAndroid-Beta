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
public class y50 extends c51 implements org.telegram.messenger.ls {
    public final a0.h K1;
    public final x50 L1;
    public final org.telegram.ui.ActionBar.m1 M1;
    public final t50 N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public AnimatorSet U1;
    public final ArrayList V1;
    public final a0.h W1;
    public boolean X1;
    public float Y1;
    public ValueAnimator Z1;
    public d20 f40600a2;
    public int f40601b2;
    public org.telegram.ui.t40 f40602c2;
    public org.telegram.ui.yr d2;
    public ArrayList f40603e2;
    public int f40604f2;
    public final float f40605g2;
    public final org.telegram.ui.ActionBar.f2 f40606h2;
    public final androidx.mediarouter.app.w f40607i2;
    public int f40608j2;
    public final q00 f40609k2;
    public int f40610l2;
    public final long f40611m2;
    public boolean f40612n2;
    public float f40613o2;
    public boolean f40614p2;
    public TLRPC.TL_chatInviteExported f40615q2;

    public y50(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.V1 = new ArrayList();
        this.W1 = new a0.h();
        this.Y1 = 0.0f;
        this.f40607i2 = new androidx.mediarouter.app.w(this, 11);
        this.K1 = hVar;
        this.f32541x1 = false;
        this.f40606h2 = f2Var;
        this.f40611m2 = j3;
        N();
        this.f32536s1.J.setHint(org.telegram.messenger.id.M0(2131745770, null));
        this.f40605g2 = ViewConfiguration.get(context).getScaledTouchSlop();
        t50 t50Var = new t50(this);
        this.N1 = t50Var;
        this.l1 = t50Var;
        bi.q1 q1Var = this.f32530k1;
        r50 r50Var = new r50(this);
        this.f32531m1 = r50Var;
        q1Var.setAdapter(r50Var);
        this.f32534q1.e(false, false);
        this.f32534q1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.g5.r(i7).f22608e0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28621a).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (a22 != null && !a22.self && !a22.deleted) {
                this.V1.add(a22);
            }
        }
        x50 x50Var = new x50(this, context);
        this.L1 = x50Var;
        this.f32530k1.setOnItemClickListener(new org.telegram.ui.nb(this, j3, f2Var, hVar, context));
        bi.q1 q1Var2 = this.f32530k1;
        v4.k kVar = new v4.k();
        kVar.f57112o = xq.f40458f;
        kVar.f57129e = 150L;
        kVar.f57128c = 150L;
        kVar.d = 150L;
        this.f28633e0 = false;
        q1Var2.setItemAnimator(kVar);
        T0();
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 1);
        this.M1 = m1Var;
        m1Var.setVisibility(8);
        m1Var.setClipChildren(false);
        m1Var.addView(x50Var);
        this.f28624b.addView(m1Var);
        q00 q00Var = new q00(context, g6Var, false);
        this.f40609k2 = q00Var;
        q00Var.setImageResource(2131231195);
        q00Var.setOnClickListener(new bi.p3(this, context, j3, 4));
        q00Var.e(false, false);
        q00Var.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.f28624b.addView(q00Var, q00.b());
        ((ViewGroup.MarginLayoutParams) this.f32534q1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f32534q1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f32534q1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public final a51 I0(Context context) {
        return new o50(this, context);
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f40613o2 = this.f32538u1;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32538u1 - this.f40613o2) < this.f40605g2 && !this.f40612n2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (org.telegram.ui.ActionBar.f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof org.telegram.ui.cn) {
                boolean ra2 = ((org.telegram.ui.cn) f2Var).ra();
                this.f40612n2 = true;
                fq fqVar = new fq(25, this, iVar);
                if (ra2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(fqVar, j3);
                return;
            }
            this.f40612n2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.h3(new bt(iVar, 3));
        }
    }

    @Override
    public final void K() {
        super.K();
        if (this.f40612n2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (f2Var instanceof org.telegram.ui.cn) {
                    ((org.telegram.ui.cn) f2Var).va(true, true);
                }
            }
        }
    }

    @Override
    public final void L0(String str) {
        t50 t50Var = this.N1;
        if (t50Var.h != null) {
            Utilities.f21338g.a(t50Var.h);
            t50Var.h = null;
        }
        t50Var.f38296c.clear();
        t50Var.d.clear();
        t50Var.f38297e.f(null, null);
        t50Var.f38297e.g(null, true, false, false, false, 0L, false, 0, 0);
        t50Var.f();
        if (!TextUtils.isEmpty(str)) {
            v4.g0 adapter = t50Var.f38299n.f32530k1.getAdapter();
            y50 y50Var = t50Var.f38299n;
            pj0 pj0Var = y50Var.l1;
            if (adapter != pj0Var) {
                y50Var.f32530k1.setAdapter(pj0Var);
            }
            t50Var.f38299n.f32534q1.e(true, false);
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            s50 s50Var = new s50(t50Var, str, 0);
            t50Var.h = s50Var;
            p5Var.d(s50Var, 300L);
            return;
        }
        v4.g0 adapter2 = t50Var.f38299n.f32530k1.getAdapter();
        y50 y50Var2 = t50Var.f38299n;
        pj0 pj0Var2 = y50Var2.f32531m1;
        if (adapter2 != pj0Var2) {
            y50Var2.f32530k1.setAdapter(pj0Var2);
        }
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z9) {
        boolean z10;
        boolean z11 = true;
        if (this.W1.m() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X1 != z10) {
            ValueAnimator valueAnimator = this.Z1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Z1.cancel();
            }
            this.X1 = z10;
            org.telegram.ui.ActionBar.m1 m1Var = this.M1;
            if (z10) {
                m1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z9) {
                float f11 = this.Y1;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.Z1 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 27));
                this.Z1.addListener(new t9(13, this, z10));
                this.Z1.setDuration(150L);
                this.Z1.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.Y1 = f10;
                this.f28624b.invalidate();
                if (!z10) {
                    m1Var.setVisibility(8);
                }
            }
            if (!this.X1 && this.d2 == null) {
                z11 = false;
            }
            this.f40609k2.e(z11, z9);
        }
    }

    public final void T0() {
        this.P1 = -1;
        this.Q1 = -1;
        this.O1 = -1;
        this.R1 = -1;
        boolean z9 = true;
        this.T1 = 1;
        if (this.d2 == null) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f28621a);
            long j3 = this.f40611m2;
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.f28621a).N0(j3);
            if ((M0 == null || TextUtils.isEmpty(org.telegram.messenger.t3.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z9 = R0();
            }
            if (z9) {
                int i7 = this.T1;
                this.T1 = i7 + 1;
                this.O1 = i7;
            }
            ArrayList arrayList = this.V1;
            if (arrayList.size() != 0) {
                int i10 = this.T1;
                this.P1 = i10;
                int size = arrayList.size() + i10;
                this.T1 = size;
                this.Q1 = size;
            } else {
                int i11 = this.T1;
                this.T1 = i11 + 1;
                this.R1 = i11;
            }
        } else if (this.f40603e2.size() != 0) {
            int i12 = this.T1;
            this.P1 = i12;
            int size2 = this.f40603e2.size() + i12;
            this.T1 = size2;
            this.Q1 = size2;
        } else {
            int i13 = this.T1;
            this.T1 = i13 + 1;
            this.R1 = i13;
        }
        int i14 = this.T1;
        this.T1 = i14 + 1;
        this.S1 = i14;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25070s && this.d2 != null && this.f40603e2.isEmpty()) {
            this.f40603e2 = new ArrayList(org.telegram.messenger.qp.s1(this.f28621a).E);
            this.f32531m1.f();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.f28621a).n(this, org.telegram.messenger.qs.f25070s);
    }
}
