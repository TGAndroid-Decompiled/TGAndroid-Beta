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
    public final le.b f30662n;
    public final FrameLayout f30663r;
    public final ai.w0 f30664s;
    public final hg.e0 v;
    public final HashMap f30665w;
    public final ArrayList f30666x;
    public boolean f30667y;

    public yj(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var, viVar);
        this.f30662n = new le.b(0, this, qr.h, 380L, false);
        this.f30665w = new HashMap();
        this.f30666x = new ArrayList();
        this.f30667y = false;
        this.F = new uj(this, context);
        ui uiVar = new ui(context, org.telegram.ui.ActionBar.j6.f19109d6, f6Var);
        this.H = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30663r = frameLayout;
        ri riVar = new ri(context, f6Var, this.f26786b);
        this.I = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.h2 h2Var = riVar.f22811r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new mj(this));
        frameLayout.addView(uiVar, w7.y5.g());
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, d);
        mz mzVar = new mz(context, f6Var);
        this.G = mzVar;
        mzVar.c();
        mzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(mzVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, f6Var, 12);
        this.f30664s = w0Var;
        this.f26787c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f26788f = true;
        w0Var.q1();
        w0Var.setClipToPadding(false);
        getContext();
        hg.e0 e0Var = new hg.e0(this, AndroidUtilities.dp(9.0f), w0Var, 1);
        this.v = e0Var;
        w0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        sj sjVar = new sj(this, context);
        this.E = sjVar;
        w0Var.setAdapter(sjVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f26785a));
        w0Var.setOnItemClickListener(new ai.o6(10, this, f6Var));
        w0Var.setOnScrollListener(new ai.r(this, 19));
        w0Var.setOnItemLongClickListener(new kj(this));
        FrameLayout.LayoutParams e = w7.y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f26786b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f30664s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            il0 il0Var = (il0) w0Var.H(childAt);
            if (il0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (il0Var.b() == 0 && childAt.getTop() >= 0) {
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
    public final void F() {
        this.f30664s.y0(0);
    }

    @Override
    public final void H(int i10, float f7, float f10, le.e eVar) {
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
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f30665w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f30667y) {
            return false;
        }
        this.f30667y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f30666x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((oj) obj)));
        }
        vi viVar = this.f26786b;
        return d5.b0(viVar.J1, viVar.n1(), viVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                yj yjVar = yj.this;
                pj pjVar = yjVar.J;
                vi viVar2 = yjVar.f26786b;
                String obj3 = viVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                pjVar.b(arrayList, obj3, z10, i10, j3, z11);
                viVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(xj xjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f30665w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26785a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            b2Var.R = string;
            b2Var.T = formatString;
            org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
            return;
        }
        oj a2 = oj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f30666x;
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
        np npVar = xjVar.d;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f26786b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yj.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z10;
        int i10 = 0;
        if (this.f30664s.getAdapter().h() == 2) {
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
        if (mzVar.getVisibility() != 0 || (childAt = this.f30664s.getChildAt(0)) == null) {
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
        ai.w0 w0Var = this.f30664s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.H(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f30662n;
        if (top >= 0 && il0Var != null && il0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f30663r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30664s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f30665w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f30666x;
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
        return this.f30665w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        x6 x6Var = new x6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19092c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19181h6));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        ai.w0 w0Var = this.f30664s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        int i11 = org.telegram.ui.ActionBar.j6.f19347q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, new Class[]{xj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, new Class[]{xj.class}, new String[]{"statusTextView"}, null, null, -1, x6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, new Class[]{xj.class}, null, org.telegram.ui.ActionBar.j6.f19360r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f26786b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
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
        this.f26786b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ri riVar = this.I;
        if (riVar != null) {
            riVar.setupBlurredBackground(cVar.c(riVar, eh.b.a(this.f26785a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        vi viVar = this.f26786b;
        if (viVar.f29133r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f30664s.p1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
