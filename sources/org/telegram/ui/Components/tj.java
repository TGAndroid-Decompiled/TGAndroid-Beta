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
public final class tj extends ki implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs, te.b {
    public boolean E;
    public final nj F;
    public final pj G;
    public final ty H;
    public final ri I;
    public final oi J;
    public kj K;
    public boolean L;
    public final te.a f40020n;
    public final FrameLayout f40021r;
    public final di.b1 f40022s;
    public final kg.c0 f40023w;
    public final HashMap f40024x;
    public final ArrayList f40025y;

    public tj(Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        this.f40020n = new te.a(0, this, lr.h, 380L, false);
        this.f40024x = new HashMap();
        this.f40025y = new ArrayList();
        this.E = false;
        this.G = new pj(this, context);
        ri riVar = new ri(org.telegram.ui.ActionBar.n6.f29394d6, context, i6Var);
        this.I = riVar;
        riVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40021r = frameLayout;
        oi oiVar = new oi(context, i6Var, this.f36766b);
        this.J = oiVar;
        oiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.gd.M0(2131745572, null);
        ah.i iVar = oiVar.f33845r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new ah.j(this, 19));
        frameLayout.addView(riVar, c8.ma.g());
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24112m;
        frameLayout.addView(oiVar, d);
        ty tyVar = new ty(context, i6Var);
        this.H = tyVar;
        tyVar.c();
        tyVar.setText(org.telegram.messenger.gd.M0(2131748031, null));
        addView(tyVar, c8.ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 15);
        this.f40022s = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f36769f = true;
        b1Var.r1();
        b1Var.setClipToPadding(false);
        getContext();
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 1);
        this.f40023w = c0Var;
        b1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        nj njVar = new nj(this, context);
        this.F = njVar;
        b1Var.setAdapter(njVar);
        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
        b1Var.setOnItemClickListener(new fi.g4(10, this, i6Var));
        b1Var.setOnScrollListener(new oa(this, 3));
        b1Var.setOnItemLongClickListener(new gj(this));
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f24112m;
        addView(frameLayout, e10);
        org.telegram.messenger.ks.f(this.f36766b.H3).c(this, org.telegram.messenger.ks.O);
        S();
    }

    public int getCurrentTop() {
        di.b1 b1Var = this.f40022s;
        if (b1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = b1Var.getChildAt(0);
            kj0 kj0Var = (kj0) b1Var.G(childAt);
            if (kj0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (kj0Var.b() == 0 && childAt.getTop() >= 0) {
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
        si siVar = this.f36766b;
        if (siVar.f39705p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            siVar.f30221r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24118q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    siVar.f30221r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            siVar.f30221r0 = true;
        }
        this.f40022s.q1(0, i11 + org.telegram.messenger.g0.f24112m, 0, this.f36768e);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ri riVar = this.I;
            riVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            riVar.setVisibility(i10);
        }
    }

    @Override
    public final void I(ki kiVar) {
        this.f40023w.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f40022s.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        HashMap hashMap = this.f40024x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f40025y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(R(hashMap.get((jj) obj)));
        }
        si siVar = this.f36766b;
        return b5.Y(siVar.H3, siVar.c1(), siVar.Y0() + arrayList.size(), new org.telegram.messenger.x10() {
            @Override
            public final void a(Object obj2) {
                tj tjVar = tj.this;
                kj kjVar = tjVar.K;
                si siVar2 = tjVar.f36766b;
                String obj3 = siVar2.b1().getText().toString();
                ((Long) obj2).getClass();
                kjVar.b(arrayList, obj3, z10, i7, j3, z11);
                siVar2.dismiss();
            }
        }, 0L);
    }

    public final void Q(sj sjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f40024x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.gd.a0("AttachContactsSlowMode", null, 2131753976, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f36765a);
            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = a02;
            org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
            return;
        }
        jj a10 = jj.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.f40025y;
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
        mp mpVar = sjVar.d;
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, true);
        if (!z10) {
            i7 = 2;
        }
        this.f36766b.L1(i7);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 R(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tj.R(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void S() {
        boolean z10;
        int i7 = 0;
        if (this.f40022s.getAdapter().b() == 2) {
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
        ty tyVar = this.H;
        if (tyVar.getVisibility() != 0 || (childAt = this.f40022s.getChildAt(0)) == null) {
            return;
        }
        tyVar.setTranslationY((childAt.getTop() + (tyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29633q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        nj njVar;
        if (i7 == org.telegram.messenger.ks.O && (njVar = this.F) != null) {
            njVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.b1 b1Var = this.f40022s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f40020n;
        if (top >= 0 && kj0Var != null && kj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f40021r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f40022s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f40024x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f40025y;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(R(hashMap.get((jj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f40024x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29377c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29468h6));
        int i7 = org.telegram.ui.ActionBar.n6.f29633q5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f40022s, 0, new Class[]{sj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        T();
    }

    @Override
    public final void p() {
        org.telegram.messenger.ks.f(this.f36766b.H3).n(this, org.telegram.messenger.ks.O);
    }

    public void setDelegate(kj kjVar) {
        this.K = kjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30190b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        oi oiVar = this.J;
        if (oiVar != null) {
            oiVar.setupBlurredBackground(cVar.c(oiVar, c8.i0.a(this.f36765a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            oi oiVar = this.J;
            if (oiVar != null) {
                oiVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
