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
public final class mj extends ci implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is, te.b {
    public boolean E;
    public final gj F;
    public final ij G;
    public final ny H;
    public final ji I;
    public final gi J;
    public dj K;
    public boolean L;
    public final te.a f37303n;
    public final FrameLayout f37304r;
    public final di.c1 f37305s;
    public final kg.c0 f37306w;
    public final HashMap f37307x;
    public final ArrayList f37308y;

    public mj(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        this.f37303n = new te.a(0, this, er.h, 380L, false);
        this.f37307x = new HashMap();
        this.f37308y = new ArrayList();
        this.E = false;
        this.G = new ij(this, context);
        ji jiVar = new ji(org.telegram.ui.ActionBar.j6.f28849d6, context, e6Var);
        this.I = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37304r = frameLayout;
        gi giVar = new gi(context, e6Var, this.f33607b);
        this.J = giVar;
        giVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.hd.M0(2131745767, null);
        ah.i iVar = giVar.f40202r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new ah.j(this, 18));
        frameLayout.addView(jiVar, c8.ja.g());
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f23603m;
        frameLayout.addView(giVar, d);
        ny nyVar = new ny(context, e6Var);
        this.H = nyVar;
        nyVar.c();
        nyVar.setText(org.telegram.messenger.hd.M0(2131748223, null));
        addView(nyVar, c8.ja.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.c1 c1Var = new di.c1(this, context, e6Var, 15);
        this.f37305s = c1Var;
        setBlur3Capture(c1Var);
        this.d = c1Var;
        this.h = true;
        this.f33610f = true;
        c1Var.r1();
        c1Var.setClipToPadding(false);
        getContext();
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(9.0f), c1Var, 1);
        this.f37306w = c0Var;
        c1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        c1Var.setHorizontalScrollBarEnabled(false);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.setClipToPadding(false);
        addView(c1Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        gj gjVar = new gj(this, context);
        this.F = gjVar;
        c1Var.setAdapter(gjVar);
        org.telegram.ui.ActionBar.q6.l(c1Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        c1Var.setOnItemClickListener(new fi.i4(10, this, e6Var));
        c1Var.setOnScrollListener(new ri(this, 2));
        c1Var.setOnItemLongClickListener(new zi(this));
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f23603m;
        addView(frameLayout, e10);
        org.telegram.messenger.ns.f(this.f33607b.H3).c(this, org.telegram.messenger.ns.O);
        S();
    }

    public int getCurrentTop() {
        di.c1 c1Var = this.f37305s;
        if (c1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = c1Var.getChildAt(0);
            cj0 cj0Var = (cj0) c1Var.G(childAt);
            if (cj0Var != null) {
                int paddingTop = c1Var.getPaddingTop();
                if (cj0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ki kiVar = this.f33607b;
        if (kiVar.f36482p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            kiVar.f29713r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f23609q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.f29713r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.f29713r0 = true;
        }
        this.f37305s.q1(0, i11 + org.telegram.messenger.g0.f23603m, 0, this.f33609e);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ji jiVar = this.I;
            jiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jiVar.setVisibility(i10);
        }
    }

    @Override
    public final void I(ci ciVar) {
        this.f37306w.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f37305s.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        HashMap hashMap = this.f37307x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f37308y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(R(hashMap.get((cj) obj)));
        }
        ki kiVar = this.f33607b;
        return t4.Y(kiVar.H3, kiVar.b1(), kiVar.X0() + arrayList.size(), new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj2) {
                mj mjVar = mj.this;
                dj djVar = mjVar.K;
                ki kiVar2 = mjVar.f33607b;
                String obj3 = kiVar2.a1().getText().toString();
                ((Long) obj2).getClass();
                djVar.c(arrayList, obj3, z10, i7, j3, z11);
                kiVar2.dismiss();
            }
        }, 0L);
    }

    public final void Q(lj ljVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f37307x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.hd.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f33606a);
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = a02;
            i5.c.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        cj a10 = cj.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.f37308y;
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
        fp fpVar = ljVar.d;
        if (fpVar.getVisibility() != 0) {
            fpVar.setVisibility(0);
        }
        fpVar.a(z10, true);
        if (!z10) {
            i7 = 2;
        }
        this.f33607b.K1(i7);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 R(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mj.R(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void S() {
        boolean z10;
        int i7 = 0;
        if (this.f37305s.getAdapter().b() == 2) {
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
        ny nyVar = this.H;
        if (nyVar.getVisibility() != 0 || (childAt = this.f37305s.getChildAt(0)) == null) {
            return;
        }
        nyVar.setTranslationY((childAt.getTop() + (nyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29088q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        if (i7 == org.telegram.messenger.ns.O && (gjVar = this.F) != null) {
            gjVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.c1 c1Var = this.f37305s;
        if (c1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f37303n;
        if (top >= 0 && cj0Var != null && cj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f37304r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f37305s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f37307x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f37308y;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(R(hashMap.get((cj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f37307x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        int i7 = org.telegram.ui.ActionBar.j6.f29088q5;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f37305s, 0, new Class[]{lj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        T();
    }

    @Override
    public final void p() {
        org.telegram.messenger.ns.f(this.f33607b.H3).n(this, org.telegram.messenger.ns.O);
    }

    public void setDelegate(dj djVar) {
        this.K = djVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33607b.f29682b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        gi giVar = this.J;
        if (giVar != null) {
            giVar.setupBlurredBackground(cVar.c(giVar, c8.g0.a(this.f33606a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            gi giVar = this.J;
            if (giVar != null) {
                giVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
