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
public class j60 extends o51 implements org.telegram.messenger.fs {
    public final a0.h O1;
    public final i60 P1;
    public final org.telegram.ui.ActionBar.m1 Q1;
    public final d60 R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public int X1;
    public AnimatorSet Y1;
    public final ArrayList Z1;
    public final a0.h f36352a2;
    public boolean f36353b2;
    public float f36354c2;
    public ValueAnimator d2;
    public m20 f36355e2;
    public int f36356f2;
    public org.telegram.ui.u40 f36357g2;
    public org.telegram.ui.zr f36358h2;
    public ArrayList f36359i2;
    public int f36360j2;
    public final float f36361k2;
    public final org.telegram.ui.ActionBar.h2 f36362l2;
    public final androidx.mediarouter.app.w f36363m2;
    public int f36364n2;
    public final a10 f36365o2;
    public int f36366p2;
    public final long f36367q2;
    public boolean f36368r2;
    public float f36369s2;
    public boolean f36370t2;
    public TLRPC.TL_chatInviteExported f36371u2;

    public j60(Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.Z1 = new ArrayList();
        this.f36352a2 = new a0.h();
        this.f36354c2 = 0.0f;
        this.f36363m2 = new androidx.mediarouter.app.w(this, 11);
        this.O1 = hVar;
        this.B1 = false;
        this.f36362l2 = h2Var;
        this.f36367q2 = j3;
        O();
        this.f37992w1.K.setHint(org.telegram.messenger.gd.M0(2131745575, null));
        this.f36361k2 = ViewConfiguration.get(context).getScaledTouchSlop();
        d60 d60Var = new d60(this);
        this.R1 = d60Var;
        this.f37985p1 = d60Var;
        di.b1 b1Var = this.f37984o1;
        b60 b60Var = new b60(this);
        this.f37986q1 = b60Var;
        b1Var.setAdapter(b60Var);
        this.f37990u1.e(false, false);
        this.f37990u1.setVisibility(8);
        ArrayList arrayList = org.telegram.messenger.i5.r(i7).f24567f0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.f30187a).c2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (c22 != null && !c22.self && !c22.deleted) {
                this.Z1.add(c22);
            }
        }
        i60 i60Var = new i60(this, context);
        this.P1 = i60Var;
        this.f37984o1.setOnItemClickListener(new org.telegram.ui.mb(this, j3, h2Var, hVar, context));
        di.b1 b1Var2 = this.f37984o1;
        v4.k kVar = new v4.k();
        kVar.f59170o = lr.f37208f;
        kVar.f59197e = 150L;
        kVar.f59196c = 150L;
        kVar.d = 150L;
        this.f30202f0 = false;
        b1Var2.setItemAnimator(kVar);
        U0();
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 1);
        this.Q1 = m1Var;
        m1Var.setVisibility(8);
        m1Var.setClipChildren(false);
        m1Var.addView(i60Var);
        this.f30190b.addView(m1Var);
        a10 a10Var = new a10(context, i6Var, false);
        this.f36365o2 = a10Var;
        a10Var.setImageResource(2131231195);
        a10Var.setOnClickListener(new di.d3(this, context, j3, 4));
        a10Var.e(false, false);
        a10Var.setContentDescription(org.telegram.messenger.gd.M0(2131748058, null));
        this.f30190b.addView(a10Var, a10.b());
        ((ViewGroup.MarginLayoutParams) this.f37990u1.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.f37990u1.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.f37990u1.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public final m51 J0(Context context) {
        return new y50(this, context);
    }

    @Override
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.ActionBar.h2 h2Var;
        long j3;
        if (motionEvent.getAction() == 0) {
            this.f36369s2 = this.f37994y1;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f37994y1 - this.f36369s2) < this.f36361k2 && !this.f36368r2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                h2Var = (org.telegram.ui.ActionBar.h2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                h2Var = null;
            }
            if (h2Var instanceof org.telegram.ui.bn) {
                boolean sa2 = ((org.telegram.ui.bn) h2Var).sa();
                this.f36368r2 = true;
                dw dwVar = new dw(15, this, iVar);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                org.telegram.messenger.g0.h3(dwVar, j3);
                return;
            }
            this.f36368r2 = true;
            A0(true);
            iVar.requestFocus();
            org.telegram.messenger.g0.g3(new i(iVar, 4));
        }
    }

    @Override
    public final void L() {
        super.L();
        if (this.f36368r2) {
            Activity W = org.telegram.messenger.g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
                if (h2Var instanceof org.telegram.ui.bn) {
                    ((org.telegram.ui.bn) h2Var).wa(true, true);
                }
            }
        }
    }

    @Override
    public final void M0(String str) {
        d60 d60Var = this.R1;
        if (d60Var.h != null) {
            Utilities.f22781g.a(d60Var.h);
            d60Var.h = null;
        }
        d60Var.f34285c.clear();
        d60Var.d.clear();
        d60Var.f34286e.f(null, null);
        d60Var.f34286e.g(null, true, false, false, false, 0L, false, 0, 0);
        d60Var.f();
        if (!TextUtils.isEmpty(str)) {
            v4.i0 adapter = d60Var.f34288n.f37984o1.getAdapter();
            j60 j60Var = d60Var.f34288n;
            bk0 bk0Var = j60Var.f37985p1;
            if (adapter != bk0Var) {
                j60Var.f37984o1.setAdapter(bk0Var);
            }
            d60Var.f34288n.f37990u1.e(true, false);
            org.telegram.messenger.q5 q5Var = Utilities.f22781g;
            c60 c60Var = new c60(d60Var, str, 0);
            d60Var.h = c60Var;
            q5Var.d(c60Var, 300L);
            return;
        }
        v4.i0 adapter2 = d60Var.f34288n.f37984o1.getAdapter();
        j60 j60Var2 = d60Var.f34288n;
        bk0 bk0Var2 = j60Var2.f37986q1;
        if (adapter2 != bk0Var2) {
            j60Var2.f37984o1.setAdapter(bk0Var2);
        }
    }

    public boolean S0() {
        return true;
    }

    public final void T0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (this.f36352a2.m() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f36353b2 != z11) {
            ValueAnimator valueAnimator = this.d2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.d2.cancel();
            }
            this.f36353b2 = z11;
            org.telegram.ui.ActionBar.m1 m1Var = this.Q1;
            if (z11) {
                m1Var.setVisibility(0);
            }
            float f10 = 0.0f;
            if (z10) {
                float f11 = this.f36354c2;
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
                this.f36354c2 = f10;
                this.f30190b.invalidate();
                if (!z11) {
                    m1Var.setVisibility(8);
                }
            }
            if (!this.f36353b2 && this.f36358h2 == null) {
                z12 = false;
            }
            this.f36365o2.e(z12, z10);
        }
    }

    public final void U0() {
        this.T1 = -1;
        this.U1 = -1;
        this.S1 = -1;
        this.V1 = -1;
        boolean z10 = true;
        this.X1 = 1;
        if (this.f36358h2 == null) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.f30187a);
            long j3 = this.f36367q2;
            TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.f30187a).P0(j3);
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
        } else if (this.f36359i2.size() != 0) {
            int i12 = this.X1;
            this.T1 = i12;
            int size2 = this.f36359i2.size() + i12;
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
        if (i7 == org.telegram.messenger.ks.f25184s && this.f36358h2 != null && this.f36359i2.isEmpty()) {
            this.f36359i2 = new ArrayList(org.telegram.messenger.mp.u1(this.f30187a).F);
            this.f37986q1.f();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.f(this.f30187a).n(this, org.telegram.messenger.ks.f25184s);
    }
}
