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
public final class ej extends uh implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.vs, fe.e {
    public boolean D;
    public final yi E;
    public final aj F;
    public final xy G;
    public final ih.e H;
    public final yh I;
    public vi J;
    public boolean K;
    public final fe.b f25846n;
    public final FrameLayout f25847r;
    public final ag.b1 f25848s;
    public final ag.d1 f25849w;
    public final HashMap f25850x;
    public final ArrayList f25851y;

    public ej(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context, p6Var, biVar);
        this.f25846n = new fe.b(0, this, gr.h, 380L, false);
        this.f25850x = new HashMap();
        this.f25851y = new ArrayList();
        this.D = false;
        this.F = new aj(this, context);
        ih.e eVar = new ih.e(org.telegram.ui.ActionBar.t6.f20930d6, context, p6Var);
        this.H = eVar;
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25847r = frameLayout;
        yh yhVar = new yh(context, p6Var, this.f30964b);
        this.I = yhVar;
        yhVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        String L0 = org.telegram.messenger.dd.L0(2131745784, null);
        org.telegram.ui.ActionBar.n0 n0Var = yhVar.f26635r;
        n0Var.setHint(L0);
        n0Var.addTextChangedListener(new ag.a1(this, 11));
        frameLayout.addView(eVar, w7.b6.g());
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.i0.f16166m;
        frameLayout.addView(yhVar, d);
        xy xyVar = new xy(context, p6Var);
        this.G = xyVar;
        xyVar.c();
        xyVar.setText(org.telegram.messenger.dd.L0(2131748240, null));
        addView(xyVar, w7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 10);
        this.f25848s = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f30966f = true;
        b1Var.r1();
        b1Var.setClipToPadding(false);
        getContext();
        ag.d1 d1Var = new ag.d1(this, org.telegram.messenger.i0.L(9.0f), b1Var, 1);
        this.f25849w = d1Var;
        b1Var.setLayoutManager(d1Var);
        d1Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yi yiVar = new yi(this, context);
        this.E = yiVar;
        b1Var.setAdapter(yiVar);
        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        b1Var.setOnItemClickListener(new mg.q0(9, this, p6Var));
        b1Var.setOnScrollListener(new ag.u(this, 15));
        b1Var.setOnItemLongClickListener(new ri(this));
        FrameLayout.LayoutParams e = w7.b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += org.telegram.messenger.i0.f16166m;
        addView(frameLayout, e);
        org.telegram.messenger.at.f(this.f30964b.D3).c(this, org.telegram.messenger.at.O);
        Q();
    }

    public int getCurrentTop() {
        ag.b1 b1Var = this.f25848s;
        if (b1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = b1Var.getChildAt(0);
            dk0 dk0Var = (dk0) b1Var.G(childAt);
            if (dk0Var != null) {
                int paddingTop = b1Var.getPaddingTop();
                if (dk0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i10, int i11) {
        int i12;
        bi biVar = this.f30964b;
        if (biVar.f24786l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            i12 = org.telegram.messenger.i0.L(8.0f);
            biVar.f21611q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    biVar.f21611q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            biVar.f21611q0 = true;
        }
        this.f25848s.q1(0, i12 + org.telegram.messenger.i0.f16166m, 0, this.e);
    }

    @Override
    public final void G(uh uhVar) {
        this.f25849w.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f25848s.y0(0);
    }

    @Override
    public final boolean J(final boolean z10, final int i10, int i11, final long j10, final boolean z11) {
        HashMap hashMap = this.f25850x;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.D) {
            return false;
        }
        this.D = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f25851y;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((ui) obj)));
        }
        bi biVar = this.f30964b;
        return s4.a0(biVar.D3, biVar.a1(), biVar.W0() + arrayList.size(), new org.telegram.messenger.r20() {
            @Override
            public final void a(Object obj2) {
                ej ejVar = ej.this;
                vi viVar = ejVar.J;
                bi biVar2 = ejVar.f30964b;
                String obj3 = biVar2.Z0().getText().toString();
                ((Long) obj2).getClass();
                viVar.b(arrayList, obj3, z10, i10, j10, z11);
                biVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(dj djVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f25850x;
        if (hashMap.isEmpty() && !this.K) {
            String a02 = org.telegram.messenger.dd.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f30963a);
            String L0 = org.telegram.messenger.dd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = a02;
            i0.a.w(null, 2131747847, alertDialog$Builder, null);
            return;
        }
        ui a2 = ui.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f25851y;
        int i10 = 1;
        if (containsKey) {
            hashMap.remove(a2);
            arrayList.remove(a2);
            z10 = false;
        } else {
            hashMap.put(a2, obj);
            arrayList.add(a2);
            z10 = true;
        }
        ep epVar = djVar.d;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f30964b.J1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ej.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f25848s.getAdapter().b() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.G.setVisibility(i10);
        R();
    }

    public final void R() {
        View childAt;
        xy xyVar = this.G;
        if (xyVar.getVisibility() != 0 || (childAt = this.f25848s.getChildAt(0)) == null) {
            return;
        }
        xyVar.setTranslationY((childAt.getTop() + (xyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21170q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yi yiVar;
        if (i10 == org.telegram.messenger.at.O && (yiVar = this.E) != null) {
            yiVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ag.b1 b1Var = this.f25848s;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        dk0 dk0Var = (dk0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(8.0f);
        if (top > 0 && dk0Var != null && dk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        fe.b bVar = this.f25846n;
        if (top >= 0 && dk0Var != null && dk0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f25847r.setTranslationY(top);
        return org.telegram.messenger.i0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25848s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f25850x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f25851y;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((ui) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f25850x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        int i10 = org.telegram.ui.ActionBar.t6.f21170q5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f25848s, 0, new Class[]{dj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final void o() {
        org.telegram.messenger.at.f(this.f30964b.D3).n(this, org.telegram.messenger.at.O);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setDelegate(vi viVar) {
        this.J = viVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30964b.f21587b.invalidate();
    }

    public void setupBlurredSearchField(tg.b bVar) {
        yh yhVar = this.I;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(bVar.c(yhVar, w7.b9.a(this.f30963a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            yh yhVar = this.I;
            if (yhVar != null) {
                yhVar.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        if (i10 == 0) {
            ih.e eVar = this.H;
            eVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            eVar.setVisibility(i11);
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
