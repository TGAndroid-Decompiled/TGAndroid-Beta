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
public final class ej extends uh implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.ls, te.b {
    public boolean D;
    public final yi E;
    public final aj F;
    public final iy G;
    public final bi H;
    public final yh I;
    public vi J;
    public boolean K;
    public final te.a f33268n;
    public final FrameLayout f33269r;
    public final bi.q1 f33270s;
    public final kg.c0 f33271w;
    public final HashMap f33272x;
    public final ArrayList f33273y;

    public ej(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context, h6Var, ciVar);
        this.f33268n = new te.a(0, this, wq.h, 380L, false);
        this.f33272x = new HashMap();
        this.f33273y = new ArrayList();
        this.D = false;
        this.F = new aj(this, context);
        bi biVar = new bi(org.telegram.ui.ActionBar.m6.f27890d6, context, h6Var);
        this.H = biVar;
        biVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33269r = frameLayout;
        yh yhVar = new yh(context, h6Var, this.f38656b);
        this.I = yhVar;
        yhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        String M0 = org.telegram.messenger.id.M0(2131745767, null);
        ah.i iVar = yhVar.f37446r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new ah.j(this, 16));
        frameLayout.addView(biVar, c8.ha.g());
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.f22561m;
        frameLayout.addView(yhVar, d);
        iy iyVar = new iy(context, h6Var);
        this.G = iyVar;
        iyVar.c();
        iyVar.setText(org.telegram.messenger.id.M0(2131748223, null));
        addView(iyVar, c8.ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, h6Var, 15);
        this.f33270s = q1Var;
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.h = true;
        this.f38659f = true;
        q1Var.r1();
        q1Var.setClipToPadding(false);
        getContext();
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(9.0f), q1Var, 1);
        this.f33271w = c0Var;
        q1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yi yiVar = new yi(this, context);
        this.E = yiVar;
        q1Var.setAdapter(yiVar);
        org.telegram.ui.ActionBar.t6.l(q1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        q1Var.setOnItemClickListener(new di.q4(10, this, h6Var));
        q1Var.setOnScrollListener(new ti(this, 0));
        q1Var.setOnItemLongClickListener(new qi(this));
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.f22561m;
        addView(frameLayout, e10);
        org.telegram.messenger.qs.f(this.f38656b.G3).c(this, org.telegram.messenger.qs.O);
        R();
    }

    public int getCurrentTop() {
        bi.q1 q1Var = this.f33270s;
        if (q1Var.getChildCount() != 0) {
            int i7 = 0;
            View childAt = q1Var.getChildAt(0);
            xi0 xi0Var = (xi0) q1Var.G(childAt);
            if (xi0Var != null) {
                int paddingTop = q1Var.getPaddingTop();
                if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ci ciVar = this.f38656b;
        if (ciVar.f32634o3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            ciVar.f28700q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    ciVar.f28700q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            ciVar.f28700q0 = true;
        }
        this.f33270s.q1(0, i11 + org.telegram.messenger.g0.f22561m, 0, this.f38658e);
    }

    @Override
    public final void H(uh uhVar) {
        this.f33271w.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f33270s.y0(0);
    }

    @Override
    public final boolean L(final boolean z9, final int i7, int i10, final long j3, final boolean z10) {
        HashMap hashMap = this.f33272x;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.D) {
            return false;
        }
        this.D = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f33273y;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        ci ciVar = this.f38656b;
        return u4.Y(ciVar.G3, ciVar.b1(), ciVar.X0() + arrayList.size(), new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj2) {
                ej ejVar = ej.this;
                vi viVar = ejVar.J;
                ci ciVar2 = ejVar.f38656b;
                String obj3 = ciVar2.a1().getText().toString();
                ((Long) obj2).getClass();
                viVar.b(arrayList, obj3, z9, i7, j3, z10);
                ciVar2.dismiss();
            }
        }, 0L);
    }

    public final void P(dj djVar, Object obj) {
        boolean z9;
        HashMap hashMap = this.f33272x;
        if (hashMap.isEmpty() && !this.K) {
            String a02 = org.telegram.messenger.id.a0("AttachContactsSlowMode", null, 2131753978, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f38655a);
            String M0 = org.telegram.messenger.id.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = a02;
            jg.g.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        ui a10 = ui.a(obj);
        boolean containsKey = hashMap.containsKey(a10);
        ArrayList arrayList = this.f33273y;
        int i7 = 1;
        if (containsKey) {
            hashMap.remove(a10);
            arrayList.remove(a10);
            z9 = false;
        } else {
            hashMap.put(a10, obj);
            arrayList.add(a10);
            z9 = true;
        }
        wo woVar = djVar.d;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, true);
        if (!z9) {
            i7 = 2;
        }
        this.f38656b.K1(i7);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 Q(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ej.Q(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void R() {
        boolean z9;
        int i7 = 0;
        if (this.f33270s.getAdapter().b() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i7 = 8;
        }
        this.G.setVisibility(i7);
        S();
    }

    public final void S() {
        View childAt;
        iy iyVar = this.G;
        if (iyVar.getVisibility() != 0 || (childAt = this.f33270s.getChildAt(0)) == null) {
            return;
        }
        iyVar.setTranslationY((childAt.getTop() + (iyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        if (i7 == 0) {
            bi biVar = this.H;
            biVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            biVar.setVisibility(i10);
        }
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28129q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        yi yiVar;
        if (i7 == org.telegram.messenger.qs.O && (yiVar = this.E) != null) {
            yiVar.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i7;
        bi.q1 q1Var = this.f33270s;
        if (q1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        te.a aVar = this.f33268n;
        if (top >= 0 && xi0Var != null && xi0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i7;
        }
        this.f33269r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f33270s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f33272x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f33273y;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(Q(hashMap.get((ui) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f33272x.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        int i7 = org.telegram.ui.ActionBar.m6.f28129q5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f33270s, 0, new Class[]{dj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        S();
    }

    @Override
    public final void p() {
        org.telegram.messenger.qs.f(this.f38656b.G3).n(this, org.telegram.messenger.qs.O);
    }

    public void setDelegate(vi viVar) {
        this.J = viVar;
    }

    public void setMultipleSelectionAllowed(boolean z9) {
        this.K = z9;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38656b.f28672b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        yh yhVar = this.I;
        if (yhVar != null) {
            yhVar.setupBlurredBackground(cVar.c(yhVar, c8.g0.a(this.f38655a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            yh yhVar = this.I;
            if (yhVar != null) {
                yhVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
