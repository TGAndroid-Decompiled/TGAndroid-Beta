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
public class i60 extends q51 implements org.telegram.messenger.fs {
    public final a0.h O1;
    public final h60 P1;
    public final org.telegram.ui.ActionBar.l1 Q1;
    public final d60 R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public int X1;
    public AnimatorSet Y1;
    public final ArrayList Z1;
    public final a0.h f35937a2;
    public boolean f35938b2;
    public float f35939c2;
    public ValueAnimator d2;
    public n20 f35940e2;
    public int f35941f2;
    public org.telegram.ui.t40 f35942g2;
    public org.telegram.ui.zr f35943h2;
    public ArrayList f35944i2;
    public int f35945j2;
    public final float f35946k2;
    public final org.telegram.ui.ActionBar.g2 f35947l2;
    public final androidx.mediarouter.app.w f35948m2;
    public int f35949n2;
    public final a10 f35950o2;
    public int f35951p2;
    public final long f35952q2;
    public boolean f35953r2;
    public float f35954s2;
    public boolean f35955t2;
    public TLRPC.TL_chatInviteExported f35956u2;

    public i60(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.Z1 = new ArrayList();
        this.f35937a2 = new a0.h();
        this.f35939c2 = 0.0f;
        this.f35948m2 = new androidx.mediarouter.app.w(this, 11);
        this.O1 = hVar;
        this.B1 = false;
        this.f35947l2 = g2Var;
        this.f35952q2 = j3;
        O();
        this.f38706w1.K.setHint(org.telegram.messenger.gd.N0(2131745574, null));
        this.f35946k2 = ViewConfiguration.get(context).getScaledTouchSlop();
        d60 d60Var = new d60(this);
        this.R1 = d60Var;
        this.f38699p1 = d60Var;
        di.b1 b1Var = this.f38698o1;
        b60 b60Var = new b60(this);
        this.f38700q1 = b60Var;
        b1Var.setAdapter(b60Var);
        this.f38704u1.e(false, false);
        this.f38704u1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.i5.r(i7).f24693f0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.f30223a).c2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (c22 != null && !c22.self && !c22.deleted) {
                this.Z1.add(c22);
            }
        }
        h60 h60Var = new h60(this, context);
        this.P1 = h60Var;
        this.f38698o1.setOnItemClickListener(new org.telegram.ui.mb(this, j3, g2Var, hVar, context));
        di.b1 b1Var2 = this.f38698o1;
        v4.l lVar = new v4.l();
        lVar.f59296o = kr.f36858f;
        lVar.f59319e = 150L;
        lVar.f59318c = 150L;
        lVar.d = 150L;
        this.f30238f0 = false;
        b1Var2.setItemAnimator(lVar);
        U0();
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(this, context, 1);
        this.Q1 = l1Var;
        l1Var.setVisibility(8);
        l1Var.setClipChildren(false);
        l1Var.addView(h60Var);
        this.f30226b.addView(l1Var);
        a10 a10Var = new a10(context, i6Var, false);
        this.f35950o2 = a10Var;
        a10Var.setImageResource(2131231198);
        a10Var.setOnClickListener(new di.d3(this, context, j3, 4));
        a10Var.e(false, false);
        a10Var.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        this.f30226b.addView(a10Var, a10.b());
        ((ViewGroup.MarginLayoutParams) this.f38704u1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f38704u1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f38704u1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public final o51 J0(Context context) {
        return new y50(this, context);
    }

    @Override
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.g2 g2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f35954s2 = this.f38708y1;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f38708y1 - this.f35954s2) < this.f35946k2 && !this.f35953r2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                g2Var = (org.telegram.ui.ActionBar.g2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                g2Var = null;
            }
            if (g2Var instanceof org.telegram.ui.bn) {
                boolean sa2 = ((org.telegram.ui.bn) g2Var).sa();
                this.f35953r2 = true;
                bt btVar = new bt(19, this, iVar);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(btVar, j3);
                return;
            }
            this.f35953r2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.g3(new i(iVar, 4));
        }
    }

    @Override
    public final void L() {
        super.L();
        if (this.f35953r2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (g2Var instanceof org.telegram.ui.bn) {
                    ((org.telegram.ui.bn) g2Var).wa(true, true);
                }
            }
        }
    }

    @Override
    public final void M0(String str) {
        d60 d60Var = this.R1;
        if (d60Var.h != null) {
            Utilities.f22879g.a(d60Var.h);
            d60Var.h = null;
        }
        d60Var.f34220c.clear();
        d60Var.d.clear();
        d60Var.f34221e.f(null, null);
        d60Var.f34221e.g(null, true, false, false, false, 0L, false, 0, 0);
        d60Var.f();
        if (!TextUtils.isEmpty(str)) {
            v4.i0 adapter = d60Var.f34223n.f38698o1.getAdapter();
            i60 i60Var = d60Var.f34223n;
            dk0 dk0Var = i60Var.f38699p1;
            if (adapter != dk0Var) {
                i60Var.f38698o1.setAdapter(dk0Var);
            }
            d60Var.f34223n.f38704u1.e(true, false);
            org.telegram.messenger.q5 q5Var = Utilities.f22879g;
            c60 c60Var = new c60(d60Var, str, 0);
            d60Var.h = c60Var;
            q5Var.d(c60Var, 300L);
            return;
        }
        v4.i0 adapter2 = d60Var.f34223n.f38698o1.getAdapter();
        i60 i60Var2 = d60Var.f34223n;
        dk0 dk0Var2 = i60Var2.f38700q1;
        if (adapter2 != dk0Var2) {
            i60Var2.f38698o1.setAdapter(dk0Var2);
        }
    }

    public boolean S0() {
        return true;
    }

    public final void T0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f35937a2.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35938b2 != z11) {
            ValueAnimator valueAnimator = this.d2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.d2.cancel();
            }
            this.f35938b2 = z11;
            org.telegram.ui.ActionBar.l1 l1Var = this.Q1;
            if (z11) {
                l1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f35939c2;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.d2 = ofFloat;
                ofFloat.addUpdateListener(new w(this, 29));
                this.d2.addListener(new org.telegram.ui.on(14, this, z11));
                this.d2.setDuration(150L);
                this.d2.start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f35939c2 = f10;
                this.f30226b.invalidate();
                if (!z11) {
                    l1Var.setVisibility(8);
                }
            }
            if (!this.f35938b2 && this.f35943h2 == null) {
                z12 = false;
            }
            this.f35950o2.e(z12, z10);
        }
    }

    public final void U0() {
        this.T1 = -1;
        this.U1 = -1;
        this.S1 = -1;
        this.V1 = -1;
        boolean z10 = true;
        this.X1 = 1;
        if (this.f35943h2 == null) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.f30223a);
            long j3 = this.f35952q2;
            TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.f30223a).P0(j3);
            if ((O0 == null || TextUtils.isEmpty(org.telegram.messenger.v3.K(O0, false))) && (P0 == null || P0.exported_invite == null)) {
                z10 = S0();
            }
            if (z10) {
                int i7 = this.X1;
                this.X1 = i7 + 1;
                this.S1 = i7;
            }
            ArrayList arrayList = this.Z1;
            if (arrayList.size() != 0) {
                int i10 = this.X1;
                this.T1 = i10;
                int size = arrayList.size() + i10;
                this.X1 = size;
                this.U1 = size;
            } else {
                int i11 = this.X1;
                this.X1 = i11 + 1;
                this.V1 = i11;
            }
        } else if (this.f35944i2.size() != 0) {
            int i12 = this.X1;
            this.T1 = i12;
            int size2 = this.f35944i2.size() + i12;
            this.X1 = size2;
            this.U1 = size2;
        } else {
            int i13 = this.X1;
            this.X1 = i13 + 1;
            this.V1 = i13;
        }
        int i14 = this.X1;
        this.X1 = i14 + 1;
        this.W1 = i14;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25283s && this.f35943h2 != null && this.f35944i2.isEmpty()) {
            this.f35944i2 = new ArrayList(org.telegram.messenger.mp.u1(this.f30223a).F);
            this.f38700q1.f();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.f(this.f30223a).n(this, org.telegram.messenger.ks.f25283s);
    }
}
