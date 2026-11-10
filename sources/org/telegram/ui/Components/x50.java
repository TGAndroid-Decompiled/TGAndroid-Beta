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
public class x50 extends c51 implements org.telegram.messenger.ls {
    public final a0.h N1;
    public final w50 O1;
    public final org.telegram.ui.ActionBar.m1 P1;
    public final s50 Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public AnimatorSet X1;
    public final ArrayList Y1;
    public final a0.h Z1;
    public boolean f40184a2;
    public float f40185b2;
    public ValueAnimator f40186c2;
    public c20 d2;
    public int f40187e2;
    public org.telegram.ui.u40 f40188f2;
    public org.telegram.ui.zr f40189g2;
    public ArrayList f40190h2;
    public int f40191i2;
    public final float f40192j2;
    public final org.telegram.ui.ActionBar.f2 f40193k2;
    public final androidx.mediarouter.app.w f40194l2;
    public int f40195m2;
    public final p00 f40196n2;
    public int f40197o2;
    public final long f40198p2;
    public boolean f40199q2;
    public float f40200r2;
    public boolean f40201s2;
    public TLRPC.TL_chatInviteExported f40202t2;

    public x50(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.Y1 = new ArrayList();
        this.Z1 = new a0.h();
        this.f40185b2 = 0.0f;
        this.f40194l2 = new androidx.mediarouter.app.w(this, 11);
        this.N1 = hVar;
        this.A1 = false;
        this.f40193k2 = f2Var;
        this.f40198p2 = j3;
        N();
        this.f32471v1.J.setHint(org.telegram.messenger.id.M0(2131745770, null));
        this.f40192j2 = ViewConfiguration.get(context).getScaledTouchSlop();
        s50 s50Var = new s50(this);
        this.Q1 = s50Var;
        this.f32464o1 = s50Var;
        bi.q1 q1Var = this.n1;
        q50 q50Var = new q50(this);
        this.f32465p1 = q50Var;
        q1Var.setAdapter(q50Var);
        this.f32469t1.e(false, false);
        this.f32469t1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.g5.r(i7).f22612e0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28669a).a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (a22 != null && !a22.self && !a22.deleted) {
                this.Y1.add(a22);
            }
        }
        w50 w50Var = new w50(this, context);
        this.O1 = w50Var;
        this.n1.setOnItemClickListener(new org.telegram.ui.nb(this, j3, f2Var, hVar, context));
        bi.q1 q1Var2 = this.n1;
        v4.k kVar = new v4.k();
        kVar.f57108o = wq.f40046f;
        kVar.f57125e = 150L;
        kVar.f57124c = 150L;
        kVar.d = 150L;
        this.f28681e0 = false;
        q1Var2.setItemAnimator(kVar);
        T0();
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 1);
        this.P1 = m1Var;
        m1Var.setVisibility(8);
        m1Var.setClipChildren(false);
        m1Var.addView(w50Var);
        this.f28672b.addView(m1Var);
        p00 p00Var = new p00(context, h6Var, false);
        this.f40196n2 = p00Var;
        p00Var.setImageResource(2131231195);
        p00Var.setOnClickListener(new bi.p3(this, context, j3, 4));
        p00Var.e(false, false);
        p00Var.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.f28672b.addView(p00Var, p00.b());
        ((ViewGroup.MarginLayoutParams) this.f32469t1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f32469t1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f32469t1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public final a51 I0(Context context) {
        return new n50(this, context);
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.f2 f2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f40200r2 = this.f32473x1;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32473x1 - this.f40200r2) < this.f40192j2 && !this.f40199q2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (org.telegram.ui.ActionBar.f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof org.telegram.ui.cn) {
                boolean ra2 = ((org.telegram.ui.cn) f2Var).ra();
                this.f40199q2 = true;
                ro roVar = new ro(26, this, iVar);
                if (ra2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.i3(roVar, j3);
                return;
            }
            this.f40199q2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.h3(new at(iVar, 3));
        }
    }

    @Override
    public final void K() {
        super.K();
        if (this.f40199q2) {
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
        s50 s50Var = this.Q1;
        if (s50Var.h != null) {
            Utilities.f21343g.a(s50Var.h);
            s50Var.h = null;
        }
        s50Var.f37869c.clear();
        s50Var.d.clear();
        s50Var.f37870e.f(null, null);
        s50Var.f37870e.g(null, true, false, false, false, 0L, false, 0, 0);
        s50Var.f();
        if (!TextUtils.isEmpty(str)) {
            v4.g0 adapter = s50Var.f37872n.n1.getAdapter();
            x50 x50Var = s50Var.f37872n;
            oj0 oj0Var = x50Var.f32464o1;
            if (adapter != oj0Var) {
                x50Var.n1.setAdapter(oj0Var);
            }
            s50Var.f37872n.f32469t1.e(true, false);
            org.telegram.messenger.p5 p5Var = Utilities.f21343g;
            r50 r50Var = new r50(s50Var, str, 0);
            s50Var.h = r50Var;
            p5Var.d(r50Var, 300L);
            return;
        }
        v4.g0 adapter2 = s50Var.f37872n.n1.getAdapter();
        x50 x50Var2 = s50Var.f37872n;
        oj0 oj0Var2 = x50Var2.f32465p1;
        if (adapter2 != oj0Var2) {
            x50Var2.n1.setAdapter(oj0Var2);
        }
    }

    public boolean R0() {
        return true;
    }

    public final void S0(boolean z9) {
        boolean z10;
        boolean z11 = true;
        if (this.Z1.m() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f40184a2 != z10) {
            ValueAnimator valueAnimator = this.f40186c2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40186c2.cancel();
            }
            this.f40184a2 = z10;
            org.telegram.ui.ActionBar.m1 m1Var = this.P1;
            if (z10) {
                m1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z9) {
                float f11 = this.f40185b2;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f40186c2 = ofFloat;
                ofFloat.addUpdateListener(new d6(this, 27));
                this.f40186c2.addListener(new s9(13, this, z10));
                this.f40186c2.setDuration(150L);
                this.f40186c2.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f40185b2 = f10;
                this.f28672b.invalidate();
                if (!z10) {
                    m1Var.setVisibility(8);
                }
            }
            if (!this.f40184a2 && this.f40189g2 == null) {
                z11 = false;
            }
            this.f40196n2.e(z11, z9);
        }
    }

    public final void T0() {
        this.S1 = -1;
        this.T1 = -1;
        this.R1 = -1;
        this.U1 = -1;
        boolean z9 = true;
        this.W1 = 1;
        if (this.f40189g2 == null) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f28669a);
            long j3 = this.f40198p2;
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.f28669a).N0(j3);
            if ((M0 == null || TextUtils.isEmpty(org.telegram.messenger.t3.K(M0, false))) && (N0 == null || N0.exported_invite == null)) {
                z9 = R0();
            }
            if (z9) {
                int i7 = this.W1;
                this.W1 = i7 + 1;
                this.R1 = i7;
            }
            ArrayList arrayList = this.Y1;
            if (arrayList.size() != 0) {
                int i10 = this.W1;
                this.S1 = i10;
                int size = arrayList.size() + i10;
                this.W1 = size;
                this.T1 = size;
            } else {
                int i11 = this.W1;
                this.W1 = i11 + 1;
                this.U1 = i11;
            }
        } else if (this.f40190h2.size() != 0) {
            int i12 = this.W1;
            this.S1 = i12;
            int size2 = this.f40190h2.size() + i12;
            this.W1 = size2;
            this.T1 = size2;
        } else {
            int i13 = this.W1;
            this.W1 = i13 + 1;
            this.U1 = i13;
        }
        int i14 = this.W1;
        this.W1 = i14 + 1;
        this.V1 = i14;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25074s && this.f40189g2 != null && this.f40190h2.isEmpty()) {
            this.f40190h2 = new ArrayList(org.telegram.messenger.qp.s1(this.f28669a).E);
            this.f32465p1.f();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25074s);
    }
}
