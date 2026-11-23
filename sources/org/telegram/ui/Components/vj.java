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
public final class vj extends mi implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs, te.b {
    public boolean E;
    public final pj F;
    public final rj G;
    public final vy H;
    public final ti I;
    public final qi J;
    public mj K;
    public boolean L;
    public final te.a f40798n;
    public final FrameLayout f40799r;
    public final di.b1 f40800s;
    public final kg.d0 f40801w;
    public final HashMap f40802x;
    public final ArrayList f40803y;

    public vj(Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        this.f40798n = new te.a(0, this, nr.h, 380L, false);
        this.f40802x = new HashMap();
        this.f40803y = new ArrayList();
        this.E = false;
        this.G = new rj(this, context);
        ti tiVar = new ti(org.telegram.ui.ActionBar.m6.f29347d6, context, h6Var);
        this.I = tiVar;
        tiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40799r = frameLayout;
        qi qiVar = new qi(context, h6Var, this.f37477b);
        this.J = qiVar;
        qiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String N0 = org.telegram.messenger.hd.N0(2131745571, null);
        ah.i iVar = qiVar.f34632r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new ah.j(this, 19));
        frameLayout.addView(tiVar, c8.na.g());
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f24004m;
        frameLayout.addView(qiVar, d);
        vy vyVar = new vy(context, h6Var);
        this.H = vyVar;
        vyVar.c();
        vyVar.setText(org.telegram.messenger.hd.N0(2131748030, null));
        addView(vyVar, c8.na.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, h6Var, 15);
        this.f40800s = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f37480f = true;
        b1Var.r1();
        b1Var.setClipToPadding(false);
        getContext();
        kg.d0 d0Var = new kg.d0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 1);
        this.f40801w = d0Var;
        b1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        pj pjVar = new pj(this, context);
        this.F = pjVar;
        b1Var.setAdapter(pjVar);
        org.telegram.ui.ActionBar.t6.l(b1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        b1Var.setOnItemClickListener(new fi.g4(10, this, h6Var));
        b1Var.setOnScrollListener(new oa(this, 3));
        b1Var.setOnItemLongClickListener(new ij(this));
        FrameLayout.LayoutParams e10 = c8.na.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f24004m;
        addView(frameLayout, e10);
        org.telegram.messenger.ls.f(this.f37477b.H3).c(this, org.telegram.messenger.ls.O);
        S();
    }

    public int getCurrentTop() {
        di.b1 b1Var = this.f40800s;
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
        ui uiVar = this.f37477b;
        if (uiVar.f40398p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            uiVar.f30173r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    uiVar.f30173r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            uiVar.f30173r0 = true;
        }
        this.f40800s.q1(0, i11 + org.telegram.messenger.g0.f24004m, 0, this.f37479e);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            ti tiVar = this.I;
            tiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tiVar.setVisibility(i10);
        }
    }

    @Override
    public final void I(mi miVar) {
        this.f40801w.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f40800s.y0(0);
    }

    @Override
    public final boolean M(final boolean z10, final int i7, int i10, final long j3, final boolean z11) {
        HashMap hashMap = this.f40802x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f40803y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(R(hashMap.get((lj) obj)));
        }
        ui uiVar = this.f37477b;
        return c5.Y(uiVar.H3, uiVar.c1(), uiVar.Y0() + arrayList.size(), new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj2) {
                vj vjVar = vj.this;
                mj mjVar = vjVar.K;
                ui uiVar2 = vjVar.f37477b;
                String obj3 = uiVar2.b1().getText().toString();
                ((Long) obj2).getClass();
                mjVar.b(arrayList, obj3, z10, i7, j3, z11);
                uiVar2.dismiss();
            }
        }, 0L);
    }

    public final void Q(uj ujVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f40802x;
        if (hashMap.isEmpty() && !this.L) {
            String a02 = org.telegram.messenger.hd.a0("AttachContactsSlowMode", null, 2131753975, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f37476a);
            String N0 = org.telegram.messenger.hd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = a02;
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
            return;
        }
        lj a10 = lj.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.f40803y;
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
        op opVar = ujVar.d;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, true);
        if (!z10) {
            i7 = 2;
        }
        this.f37477b.L1(i7);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 R(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vj.R(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void S() {
        boolean z10;
        int i7 = 0;
        if (this.f40800s.getAdapter().b() == 2) {
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
        vy vyVar = this.H;
        if (vyVar.getVisibility() != 0 || (childAt = this.f40800s.getChildAt(0)) == null) {
            return;
        }
        vyVar.setTranslationY((childAt.getTop() + (vyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29586q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        pj pjVar;
        if (i7 == org.telegram.messenger.ls.O && (pjVar = this.F) != null) {
            pjVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        di.b1 b1Var = this.f40800s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f40798n;
        if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f40799r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f40800s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f40802x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f40803y;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(R(hashMap.get((lj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f40802x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29330c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29421h6));
        int i7 = org.telegram.ui.ActionBar.m6.f29586q5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f40800s, 0, new Class[]{uj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        T();
    }

    @Override
    public final void p() {
        org.telegram.messenger.ls.f(this.f37477b.H3).n(this, org.telegram.messenger.ls.O);
    }

    public void setDelegate(mj mjVar) {
        this.K = mjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.L = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37477b.f30142b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        qi qiVar = this.J;
        if (qiVar != null) {
            qiVar.setupBlurredBackground(cVar.c(qiVar, c8.j0.a(this.f37476a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            qi qiVar = this.J;
            if (qiVar != null) {
                qiVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
