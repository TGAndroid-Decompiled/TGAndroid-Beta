package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qj extends di implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public final jj B;
    public final mj C;
    public final mz D;
    public final ki E;
    public final hi F;
    public gj G;
    public boolean H;
    public final xd.a f28140n;
    public final FrameLayout f28141r;
    public final lh.e1 f28142s;
    public final ej v;
    public final HashMap f28143w;
    public final ArrayList f28144x;
    public boolean f28145y;

    public qj(Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        this.f28140n = new xd.a(0, this, nr.h, 380L, false);
        this.f28143w = new HashMap();
        this.f28144x = new ArrayList();
        this.f28145y = false;
        this.C = new mj(this, context);
        ki kiVar = new ki(context, org.telegram.ui.ActionBar.j6.f19906d6, f6Var);
        this.E = kiVar;
        kiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28141r = frameLayout;
        hi hiVar = new hi(context, f6Var, this.f24278b);
        this.F = hiVar;
        hiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        kg.f fVar = hiVar.f23815r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new cj(this));
        frameLayout.addView(kiVar, k7.b6.g());
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(hiVar, d);
        mz mzVar = new mz(context, f6Var);
        this.D = mzVar;
        mzVar.c();
        mzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(mzVar, k7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 10);
        this.f28142s = e1Var;
        this.f24279c = e1Var;
        this.d = e1Var;
        this.h = true;
        this.f24280f = true;
        e1Var.p1();
        e1Var.setClipToPadding(false);
        getContext();
        ej ejVar = new ej(this, AndroidUtilities.dp(9.0f), e1Var, 0);
        this.v = ejVar;
        e1Var.setLayoutManager(ejVar);
        ejVar.P = false;
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        addView(e1Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        jj jjVar = new jj(this, context);
        this.B = jjVar;
        e1Var.setAdapter(jjVar);
        e1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f24277a));
        e1Var.setOnItemClickListener(new gg.v0(11, this, f6Var));
        e1Var.setOnScrollListener(new eg.f2(this, 19));
        e1Var.setOnItemLongClickListener(new aj(this));
        FrameLayout.LayoutParams e = k7.b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f24278b.G1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        lh.e1 e1Var = this.f28142s;
        if (e1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = e1Var.getChildAt(0);
            el0 el0Var = (el0) e1Var.G(childAt);
            if (el0Var != null) {
                int paddingTop = e1Var.getPaddingTop();
                if (el0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(di diVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f28142s.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z4, int i11, final boolean z10, final long j10) {
        HashMap hashMap = this.f28143w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.G == null) || this.f28145y) {
            return false;
        }
        this.f28145y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f28144x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((fj) obj)));
        }
        li liVar = this.f24278b;
        return z4.b0(liVar.G1, liVar.n1(), liVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                qj qjVar = qj.this;
                gj gjVar = qjVar.G;
                li liVar2 = qjVar.f24278b;
                String obj3 = liVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                gjVar.b(arrayList, obj3, z4, i10, j10, z10);
                liVar2.dismiss();
            }
        }, 0L);
    }

    public final void K(pj pjVar, Object obj) {
        boolean z4;
        HashMap hashMap = this.f28143w;
        if (hashMap.isEmpty() && !this.H) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f24277a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.O = string;
            d2Var.Q = formatString;
            kh.a2.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        fj a2 = fj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f28144x;
        int i10 = 1;
        if (containsKey) {
            hashMap.remove(a2);
            arrayList.remove(a2);
            z4 = false;
        } else {
            hashMap.put(a2, obj);
            arrayList.add(a2);
            z4 = true;
        }
        lp lpVar = pjVar.d;
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z4, true);
        if (!z4) {
            i10 = 2;
        }
        this.f24278b.V1(i10);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            ki kiVar = this.E;
            kiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            kiVar.setVisibility(i11);
        }
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qj.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z4;
        int i10 = 0;
        if (this.f28142s.getAdapter().h() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            i10 = 8;
        }
        this.D.setVisibility(i10);
        O();
    }

    public final void O() {
        View childAt;
        mz mzVar = this.D;
        if (mzVar.getVisibility() != 0 || (childAt = this.f28142s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (jjVar = this.B) != null) {
            jjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        lh.e1 e1Var = this.f28142s;
        if (e1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        el0 el0Var = (el0) e1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        xd.a aVar = this.f28140n;
        if (top >= 0 && el0Var != null && el0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f28141r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28142s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f28143w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f28144x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(M(hashMap.get((fj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f28143w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        t6 t6Var = new t6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19978h6));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        lh.e1 e1Var = this.f28142s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i11 = org.telegram.ui.ActionBar.j6.f20139q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{pj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{pj.class}, new String[]{"statusTextView"}, null, null, -1, t6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{pj.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f24278b.G1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(gj gjVar) {
        this.G = gjVar;
    }

    public void setMultipleSelectionAllowed(boolean z4) {
        this.H = z4;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24278b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ng.a aVar) {
        hi hiVar = this.F;
        if (hiVar != null) {
            hiVar.setupBlurredBackground(aVar.c(hiVar, rg.b.a(this.f24277a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        li liVar = this.f24278b;
        if (liVar.f26726o1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    liVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            liVar.setAllowNestedScroll(true);
        }
        this.f28142s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
