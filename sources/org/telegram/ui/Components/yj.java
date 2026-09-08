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
public final class yj extends ni implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final sj E;
    public final uj F;
    public final mz G;
    public final ui H;
    public final ri I;
    public pj J;
    public boolean K;
    public final le.b f32958n;
    public final FrameLayout f32959r;
    public final bi.o0 f32960s;
    public final ig.e0 v;
    public final HashMap f32961w;
    public final ArrayList f32962x;
    public boolean f32963y;

    public yj(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f32958n = new le.b(0, this, pr.h, 380L, false);
        this.f32961w = new HashMap();
        this.f32962x = new ArrayList();
        this.f32963y = false;
        this.F = new uj(this, context);
        ui uiVar = new ui(context, org.telegram.ui.ActionBar.j6.f20690d6, f6Var);
        this.H = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32959r = frameLayout;
        ri riVar = new ri(context, f6Var, this.f28780b);
        this.I = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        di.h2 h2Var = riVar.f24549r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new mj(this));
        frameLayout.addView(uiVar, w7.x5.g());
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        mz mzVar = new mz(context, f6Var);
        this.G = mzVar;
        mzVar.c();
        mzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(mzVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 12);
        this.f32960s = o0Var;
        this.f28781c = o0Var;
        this.d = o0Var;
        this.h = true;
        this.f28783f = true;
        o0Var.o1();
        o0Var.setClipToPadding(false);
        getContext();
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(9.0f), o0Var, 1);
        this.v = e0Var;
        o0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setClipToPadding(false);
        addView(o0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        sj sjVar = new sj(this, context);
        this.E = sjVar;
        o0Var.setAdapter(sjVar);
        o0Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f28779a));
        o0Var.setOnItemClickListener(new bi.x5(10, this, f6Var));
        o0Var.setOnScrollListener(new ah.e0(this, 19));
        o0Var.setOnItemLongClickListener(new kj(this));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        NotificationCenter.getInstance(this.f28780b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        bi.o0 o0Var = this.f32960s;
        if (o0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = o0Var.getChildAt(0);
            vk0 vk0Var = (vk0) o0Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = o0Var.getPaddingTop();
                if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            ui uiVar = this.H;
            uiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            uiVar.setVisibility(i11);
        }
    }

    @Override
    public final void G() {
        this.f32960s.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f32961w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f32963y) {
            return false;
        }
        this.f32963y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f32962x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((oj) obj)));
        }
        vi viVar = this.f28780b;
        return e5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                yj yjVar = yj.this;
                pj pjVar = yjVar.J;
                vi viVar2 = yjVar.f28780b;
                String obj3 = viVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                pjVar.c(arrayList, obj3, z10, i10, j3, z11);
                viVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(xj xjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f32961w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28779a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            b2Var.R = string;
            b2Var.T = formatString;
            i2.g.B(R.string.OK, alertDialog$Builder, null);
            return;
        }
        oj a2 = oj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f32962x;
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
        mp mpVar = xjVar.d;
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f28780b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yj.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z10;
        int i10 = 0;
        if (this.f32960s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.G.setVisibility(i10);
        O();
    }

    public final void O() {
        View childAt;
        mz mzVar = this.G;
        if (mzVar.getVisibility() != 0 || (childAt = this.f32960s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sj sjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (sjVar = this.E) != null) {
            sjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        bi.o0 o0Var = this.f32960s;
        if (o0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = o0Var.getChildAt(0);
        vk0 vk0Var = (vk0) o0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f32958n;
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f32959r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32960s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f32961w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f32962x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(M(hashMap.get((oj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f32961w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        z6 z6Var = new z6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20673c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f20762h6));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        bi.o0 o0Var = this.f32960s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20780i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20812k0, null, null, org.telegram.ui.ActionBar.j6.f20691d7));
        int i11 = org.telegram.ui.ActionBar.j6.f20924q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{xj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{xj.class}, new String[]{"statusTextView"}, null, null, -1, z6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{xj.class}, null, org.telegram.ui.ActionBar.j6.f20937r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f28780b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(pj pjVar) {
        this.J = pjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28780b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        ri riVar = this.I;
        if (riVar != null) {
            riVar.setupBlurredBackground(bVar.c(riVar, fh.b.a(this.f28779a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        vi viVar = this.f28780b;
        if (viVar.f31343r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    viVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            viVar.setAllowNestedScroll(true);
        }
        this.f32960s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f28782e);
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
