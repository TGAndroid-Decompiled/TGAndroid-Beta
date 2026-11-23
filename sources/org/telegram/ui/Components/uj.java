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
public final class uj extends li implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs, te.b {
    public boolean E;
    public final oj F;
    public final qj G;
    public final sy H;
    public final si I;
    public final pi J;
    public lj K;
    public boolean L;
    public final te.a f40388n;
    public final FrameLayout f40389r;
    public final di.b1 f40390s;
    public final kg.d0 f40391w;
    public final HashMap f40392x;
    public final ArrayList f40393y;

    public uj(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context, i6Var, tiVar);
        this.f40388n = new te.a(0, this, kr.h, 380L, false);
        this.f40392x = new HashMap();
        this.f40393y = new ArrayList();
        this.E = false;
        this.G = new qj(this, context);
        si siVar = new si(org.telegram.ui.ActionBar.n6.f29451d6, context, i6Var);
        this.I = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40389r = frameLayout;
        pi piVar = new pi(context, i6Var, this.f37135b);
        this.J = piVar;
        piVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String N0 = org.telegram.messenger.gd.N0(2131745571, null);
        ah.i iVar = piVar.f33883r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new ah.j(this, 19));
        frameLayout.addView(siVar, c8.na.g());
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24220m;
        frameLayout.addView(piVar, d);
        sy syVar = new sy(context, i6Var);
        this.H = syVar;
        syVar.c();
        syVar.setText(org.telegram.messenger.gd.N0(2131748030, null));
        addView(syVar, c8.na.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 15);
        this.f40390s = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f37138f = true;
        b1Var.r1();
        b1Var.setClipToPadding(false);
        getContext();
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 1);
        this.f40391w = d0Var;
        b1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        oj ojVar = new oj(this, context);
        this.F = ojVar;
        b1Var.setAdapter(ojVar);
        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        b1Var.setOnItemClickListener(new fi.g4(10, this, i6Var));
        b1Var.setOnScrollListener(new na(this, 3));
        b1Var.setOnItemLongClickListener(new hj(this));
        FrameLayout.LayoutParams e10 = c8.na.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f24220m;
        addView(frameLayout, e10);
        org.telegram.messenger.ks.f(this.f37135b.H3).c(this, org.telegram.messenger.ks.O);
        S();
    }

    public int getCurrentTop() {
        di.b1 b1Var = this.f40390s;
        if (b1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = b1Var.getChildAt(0);
            mj0 mj0Var = (mj0) b1Var.G(childAt);
            if (mj0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (mj0Var.b() == 0 && childAt.getTop() >= 0) {
                    i7 = childAt.getTop();
                }
                return paddingTop - i7;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i7, int i10) {
        int i11;
        ti tiVar = this.f37135b;
        if (tiVar.f40002p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            tiVar.f30257r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    tiVar.f30257r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            tiVar.f30257r0 = true;
        }
        this.f40390s.q1(0, i11 + org.telegram.messenger.g0.f24220m, 0, this.f37137e);
    }

    @Override
    public final void H(li liVar) {
        this.f40391w.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f40390s.y0(0);
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            si siVar = this.I;
            siVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            siVar.setVisibility(i10);
        }
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        HashMap hashMap = this.f40392x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f40393y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(R(hashMap.get((kj) obj)));
        }
        ti tiVar = this.f37135b;
        return b5.Y(tiVar.H3, tiVar.c1(), tiVar.Y0() + arrayList.size(), new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj2) {
                uj ujVar = uj.this;
                lj ljVar = ujVar.K;
                ti tiVar2 = ujVar.f37135b;
                String obj3 = tiVar2.b1().getText().toString();
                ((Long) obj2).getClass();
                ljVar.c(arrayList, obj3, z10, i7, j3, z11);
                tiVar2.dismiss();
            }
        }, 0L);
    }

    public final void Q(tj tjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f40392x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.gd.a0("AttachContactsSlowMode", null, 2131753975, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37134a);
            String N0 = org.telegram.messenger.gd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = a02;
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
            return;
        }
        kj a10 = kj.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.f40393y;
        int i7 = 1;
        if (containsKey) {
            hashMap.remove(a10);
            arrayList.remove(a10);
            z10 = false;
        } else {
            hashMap.put(a10, obj);
            arrayList.add(a10);
            z10 = true;
        }
        lp lpVar = tjVar.d;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z10, true);
        if (!z10) {
            i7 = 2;
        }
        this.f37135b.L1(i7);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 R(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uj.R(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void S() {
        boolean z10;
        int i7 = 0;
        if (this.f40390s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i7 = 8;
        }
        this.H.setVisibility(i7);
        T();
    }

    public final void T() {
        View childAt;
        sy syVar = this.H;
        if (syVar.getVisibility() != 0 || (childAt = this.f40390s.getChildAt(0)) == null) {
            return;
        }
        syVar.setTranslationY((childAt.getTop() + (syVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29690q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        oj ojVar;
        if (i7 == org.telegram.messenger.ks.O && (ojVar = this.F) != null) {
            ojVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.b1 b1Var = this.f40390s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f40388n;
        if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f40389r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f40390s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f40392x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f40393y;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(R(hashMap.get((kj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f40392x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        int i7 = org.telegram.ui.ActionBar.n6.f29690q5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f40390s, 0, new Class[]{tj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        T();
    }

    @Override
    public final void p() {
        org.telegram.messenger.ks.f(this.f37135b.H3).n(this, org.telegram.messenger.ks.O);
    }

    public void setDelegate(lj ljVar) {
        this.K = ljVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        pi piVar = this.J;
        if (piVar != null) {
            piVar.setupBlurredBackground(cVar.c(piVar, c8.j0.a(this.f37134a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            pi piVar = this.J;
            if (piVar != null) {
                piVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
