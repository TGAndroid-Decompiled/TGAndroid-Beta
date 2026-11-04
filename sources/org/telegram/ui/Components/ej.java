package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ej extends th implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs, qe.b {
    public boolean E;
    public final yi F;
    public final aj G;
    public final gy H;
    public final ai I;
    public final xh J;
    public vi K;
    public boolean L;
    public final qe.a f33404n;
    public final FrameLayout f33405r;
    public final ci.j1 f33406s;
    public final lg.d0 f33407w;
    public final HashMap f33408x;
    public final ArrayList f33409y;

    public ej(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var, biVar);
        this.f33404n = new qe.a(0, this, xq.h, 380L, false);
        this.f33408x = new HashMap();
        this.f33409y = new ArrayList();
        this.E = false;
        this.G = new aj(this, context);
        ai aiVar = new ai(org.telegram.ui.ActionBar.k6.f27878d6, context, e6Var);
        this.I = aiVar;
        aiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33405r = frameLayout;
        xh xhVar = new xh(context, e6Var, this.f38416b);
        this.J = xhVar;
        xhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.bd.M0(2131745777, null);
        bh.g gVar = xhVar.f36302r;
        gVar.setHint(M0);
        gVar.addTextChangedListener(new bh.h(this, 16));
        frameLayout.addView(aiVar, b8.mf.g());
        FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22602m;
        frameLayout.addView(xhVar, d);
        gy gyVar = new gy(context, e6Var);
        this.H = gyVar;
        gyVar.c();
        gyVar.setText(org.telegram.messenger.bd.M0(2131748231, null));
        addView(gyVar, b8.mf.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 15);
        this.f33406s = j1Var;
        setBlur3Capture(j1Var);
        this.d = j1Var;
        this.h = true;
        this.f38419f = true;
        j1Var.r1();
        j1Var.setClipToPadding(false);
        getContext();
        lg.d0 d0Var = new lg.d0(this, org.telegram.messenger.g0.L(9.0f), j1Var, 1);
        this.f33407w = d0Var;
        j1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        j1Var.setHorizontalScrollBarEnabled(false);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.setClipToPadding(false);
        addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yi yiVar = new yi(this, context);
        this.F = yiVar;
        j1Var.setAdapter(yiVar);
        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        j1Var.setOnItemClickListener(new ei.q4(10, this, e6Var));
        j1Var.setOnScrollListener(new ji(this, 2));
        j1Var.setOnItemLongClickListener(new ri(this));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f22602m;
        addView(frameLayout, e10);
        org.telegram.messenger.hs.f(this.f38416b.E3).c(this, org.telegram.messenger.hs.O);
        R();
    }

    public int getCurrentTop() {
        ci.j1 j1Var = this.f33406s;
        if (j1Var.getChildCount() != 0) {
            int i3 = 0;
            View childAt = j1Var.getChildAt(0);
            bj0 bj0Var = (bj0) j1Var.G(childAt);
            if (bj0Var != null) {
                int paddingTop = j1Var.getPaddingTop();
                if (bj0Var.b() == 0 && childAt.getTop() >= 0) {
                    i3 = childAt.getTop();
                }
                return paddingTop - i3;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i3, int i10) {
        int i11;
        bi biVar = this.f38416b;
        if (biVar.f32249m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            biVar.f28614r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    biVar.f28614r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            biVar.f28614r0 = true;
        }
        this.f33406s.q1(0, i11 + org.telegram.messenger.g0.f22602m, 0, this.f38418e);
    }

    @Override
    public final void H(th thVar) {
        this.f33407w.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f33406s.y0(0);
    }

    @Override
    public final boolean L(final boolean z10, final int i3, int i10, final long j10, final boolean z11) {
        HashMap hashMap = this.f33408x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f33409y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        bi biVar = this.f38416b;
        return t4.a0(biVar.E3, biVar.b1(), biVar.X0() + arrayList.size(), new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj2) {
                ej ejVar = ej.this;
                vi viVar = ejVar.K;
                bi biVar2 = ejVar.f38416b;
                String obj3 = biVar2.a1().getText().toString();
                ((Long) obj2).getClass();
                viVar.b(arrayList, obj3, z10, i3, j10, z11);
                biVar2.dismiss();
            }
        }, 0L);
    }

    public final void P(dj djVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f33408x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.bd.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38415a);
            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = a02;
            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
            return;
        }
        ui a10 = ui.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.f33409y;
        int i3 = 1;
        if (containsKey) {
            hashMap.remove(a10);
            arrayList.remove(a10);
            z10 = false;
        } else {
            hashMap.put(a10, obj);
            arrayList.add(a10);
            z10 = true;
        }
        wo woVar = djVar.d;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, true);
        if (!z10) {
            i3 = 2;
        }
        this.f38416b.K1(i3);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 Q(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ej.Q(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void R() {
        boolean z10;
        int i3 = 0;
        if (this.f33406s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i3 = 8;
        }
        this.H.setVisibility(i3);
        S();
    }

    public final void S() {
        View childAt;
        gy gyVar = this.H;
        if (gyVar.getVisibility() != 0 || (childAt = this.f33406s.getChildAt(0)) == null) {
            return;
        }
        gyVar.setTranslationY((childAt.getTop() + (gyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        if (i3 == 0) {
            ai aiVar = this.I;
            aiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            aiVar.setVisibility(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28120q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        yi yiVar;
        if (i3 == org.telegram.messenger.hs.O && (yiVar = this.F) != null) {
            yiVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i3;
        ci.j1 j1Var = this.f33406s;
        if (j1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        } else {
            i3 = 0;
        }
        qe.a aVar = this.f33404n;
        if (top >= 0 && bj0Var != null && bj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i3;
        }
        this.f33405r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f33406s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f33408x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f33409y;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f33408x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        int i3 = org.telegram.ui.ActionBar.k6.f28120q5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33406s, 0, new Class[]{dj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        S();
    }

    @Override
    public final void p() {
        org.telegram.messenger.hs.f(this.f38416b.E3).n(this, org.telegram.messenger.hs.O);
    }

    public void setDelegate(vi viVar) {
        this.K = viVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    public void setupBlurredSearchField(eh.c cVar) {
        xh xhVar = this.J;
        if (xhVar != null) {
            xhVar.setupBlurredBackground(cVar.c(xhVar, b8.cd.a(this.f38415a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            xh xhVar = this.J;
            if (xhVar != null) {
                xhVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
