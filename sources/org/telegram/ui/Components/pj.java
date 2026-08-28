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
public final class pj extends ci implements NotificationCenter.NotificationCenterDelegate, td.b {
    public final ij A;
    public final lj B;
    public final yy C;
    public final ji D;
    public final gi E;
    public fj F;
    public boolean G;
    public final td.a f31677n;
    public final FrameLayout f31678r;
    public final gh.f1 f31679s;
    public final dj v;
    public final HashMap f31680w;
    public final ArrayList f31681x;
    public boolean f31682y;

    public pj(Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.f31677n = new td.a(0, this, gr.h, 380L, false);
        this.f31680w = new HashMap();
        this.f31681x = new ArrayList();
        this.f31682y = false;
        this.B = new lj(this, context);
        ji jiVar = new ji(context, org.telegram.ui.ActionBar.f6.f23001d6, b6Var);
        this.D = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31678r = frameLayout;
        gi giVar = new gi(context, b6Var, this.f27493b);
        this.E = giVar;
        giVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        fg.g gVar = giVar.f30664r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new bj(this));
        frameLayout.addView(jiVar, g7.e6.g());
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(giVar, d);
        yy yyVar = new yy(context, b6Var);
        this.C = yyVar;
        yyVar.c();
        yyVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(yyVar, g7.e6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 12);
        this.f31679s = f1Var;
        this.f27494c = f1Var;
        this.d = f1Var;
        this.h = true;
        this.f27496f = true;
        f1Var.p1();
        f1Var.setClipToPadding(false);
        getContext();
        dj djVar = new dj(this, AndroidUtilities.dp(9.0f), f1Var, 0);
        this.v = djVar;
        f1Var.setLayoutManager(djVar);
        djVar.P = false;
        f1Var.setHorizontalScrollBarEnabled(false);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setClipToPadding(false);
        addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ij ijVar = new ij(this, context);
        this.A = ijVar;
        f1Var.setAdapter(ijVar);
        f1Var.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, this.f27492a));
        f1Var.setOnItemClickListener(new bg.b1(12, this, b6Var));
        f1Var.setOnScrollListener(new bg.o2(this, 25));
        f1Var.setOnItemLongClickListener(new zi(this));
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        NotificationCenter.getInstance(this.f27493b.F1).addObserver(this, NotificationCenter.contactsDidLoad);
        M();
    }

    public int getCurrentTop() {
        gh.f1 f1Var = this.f31679s;
        if (f1Var.getChildCount() != 0) {
            int i9 = 0;
            View childAt = f1Var.getChildAt(0);
            ik0 ik0Var = (ik0) f1Var.G(childAt);
            if (ik0Var != null) {
                int paddingTop = f1Var.getPaddingTop();
                if (ik0Var.b() == 0 && childAt.getTop() >= 0) {
                    i9 = childAt.getTop();
                }
                return paddingTop - i9;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(ci ciVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f31679s.x0(0);
    }

    @Override
    public final boolean H(final int i9, final boolean z10, int i10, final boolean z11, final long j10) {
        HashMap hashMap = this.f31680w;
        int i11 = 0;
        if ((hashMap.size() == 0 && this.F == null) || this.f31682y) {
            return false;
        }
        this.f31682y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f31681x;
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(L(hashMap.get((ej) obj)));
        }
        ki kiVar = this.f27493b;
        return y4.b0(kiVar.F1, kiVar.n1(), kiVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                pj pjVar = pj.this;
                fj fjVar = pjVar.F;
                ki kiVar2 = pjVar.f27493b;
                String obj3 = kiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                fjVar.c(arrayList, obj3, z10, i9, j10, z11);
                kiVar2.dismiss();
            }
        }, 0L);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        if (i9 == 0) {
            ji jiVar = this.D;
            jiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jiVar.setVisibility(i10);
        }
    }

    public final void K(oj ojVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f31680w;
        if (hashMap.isEmpty() && !this.G) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27492a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = formatString;
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        ej a2 = ej.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f31681x;
        int i9 = 1;
        if (containsKey) {
            hashMap.remove(a2);
            arrayList.remove(a2);
            z10 = false;
        } else {
            hashMap.put(a2, obj);
            arrayList.add(a2);
            z10 = true;
        }
        dp dpVar = ojVar.d;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, true);
        if (!z10) {
            i9 = 2;
        }
        this.f27493b.V1(i9);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 L(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pj.L(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void M() {
        boolean z10;
        int i9 = 0;
        if (this.f31679s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i9 = 8;
        }
        this.C.setVisibility(i9);
        N();
    }

    public final void N() {
        View childAt;
        yy yyVar = this.C;
        if (yyVar.getVisibility() != 0 || (childAt = this.f31679s.getChildAt(0)) == null) {
            return;
        }
        yyVar.setTranslationY((childAt.getTop() + (yyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ij ijVar;
        if (i9 == NotificationCenter.contactsDidLoad && (ijVar = this.A) != null) {
            ijVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i9;
        gh.f1 f1Var = this.f31679s;
        if (f1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        } else {
            i9 = 0;
        }
        td.a aVar = this.f31677n;
        if (top >= 0 && ik0Var != null && ik0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i9;
        }
        this.f31678r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31679s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f31680w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f31681x;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            arrayList.add(L(hashMap.get((ej) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f31680w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        s6 s6Var = new s6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        gh.f1 f1Var = this.f31679s;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i10 = org.telegram.ui.ActionBar.f6.f23228q5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{oj.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{oj.class}, new String[]{"statusTextView"}, null, null, -1, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{oj.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f27493b.F1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        N();
    }

    public void setDelegate(fj fjVar) {
        this.F = fjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.G = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ig.a aVar) {
        gi giVar = this.E;
        if (giVar != null) {
            giVar.setupBlurredBackground(aVar.c(giVar, mg.c.a(this.f27492a), false));
        }
    }

    @Override
    public final void y(int i9, int i10) {
        int i11;
        ki kiVar = this.f27493b;
        if (kiVar.f30138n1.R() > AndroidUtilities.dp(20.0f)) {
            i11 = AndroidUtilities.dp(8.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.setAllowNestedScroll(true);
        }
        this.f31679s.o1(0, i11 + AndroidUtilities.statusBarHeight, 0, this.f27495e);
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
