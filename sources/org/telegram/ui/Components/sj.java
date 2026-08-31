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
public final class sj extends ei implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public final lj B;
    public final oj C;
    public final oz D;
    public final li E;
    public final ii F;
    public ij G;
    public boolean H;
    public final xd.a f31067n;
    public final FrameLayout f31068r;
    public final mh.d1 f31069s;
    public final gj v;
    public final HashMap f31070w;
    public final ArrayList f31071x;
    public boolean f31072y;

    public sj(Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.f31067n = new xd.a(0, this, pr.h, 380L, false);
        this.f31070w = new HashMap();
        this.f31071x = new ArrayList();
        this.f31072y = false;
        this.C = new oj(this, context);
        li liVar = new li(context, org.telegram.ui.ActionBar.k6.f21659d6, g6Var);
        this.E = liVar;
        liVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31068r = frameLayout;
        ii iiVar = new ii(context, g6Var, this.f26546b);
        this.F = iiVar;
        iiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        lg.f fVar = iiVar.f26172r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new ej(this));
        frameLayout.addView(liVar, k7.c6.g());
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(iiVar, d);
        oz ozVar = new oz(context, g6Var);
        this.D = ozVar;
        ozVar.c();
        ozVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(ozVar, k7.c6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        mh.d1 d1Var = new mh.d1(this, context, g6Var, 10);
        this.f31069s = d1Var;
        this.f26547c = d1Var;
        this.d = d1Var;
        this.h = true;
        this.f26549f = true;
        d1Var.p1();
        d1Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), d1Var, 0);
        this.v = gjVar;
        d1Var.setLayoutManager(gjVar);
        gjVar.P = false;
        d1Var.setHorizontalScrollBarEnabled(false);
        d1Var.setVerticalScrollBarEnabled(false);
        d1Var.setClipToPadding(false);
        addView(d1Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        lj ljVar = new lj(this, context);
        this.B = ljVar;
        d1Var.setAdapter(ljVar);
        d1Var.setGlowColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A5, this.f26545a));
        d1Var.setOnItemClickListener(new hg.v0(10, this, g6Var));
        d1Var.setOnScrollListener(new fg.e2(this, 19));
        d1Var.setOnItemLongClickListener(new cj(this));
        FrameLayout.LayoutParams e6 = k7.c6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e6).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e6);
        NotificationCenter.getInstance(this.f26546b.G1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        mh.d1 d1Var = this.f31069s;
        if (d1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = d1Var.getChildAt(0);
            fl0 fl0Var = (fl0) d1Var.G(childAt);
            if (fl0Var != null) {
                int paddingTop = d1Var.getPaddingTop();
                if (fl0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(ei eiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f31069s.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z4, int i11, final boolean z10, final long j10) {
        HashMap hashMap = this.f31070w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.G == null) || this.f31072y) {
            return false;
        }
        this.f31072y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f31071x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((hj) obj)));
        }
        mi miVar = this.f26546b;
        return z4.b0(miVar.G1, miVar.n1(), miVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                sj sjVar = sj.this;
                ij ijVar = sjVar.G;
                mi miVar2 = sjVar.f26546b;
                String obj3 = miVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                ijVar.b(arrayList, obj3, z4, i10, j10, z10);
                miVar2.dismiss();
            }
        }, 0L);
    }

    public final void K(rj rjVar, Object obj) {
        boolean z4;
        HashMap hashMap = this.f31070w;
        if (hashMap.isEmpty() && !this.H) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26545a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.O = string;
            d2Var.Q = formatString;
            l.d.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        hj a2 = hj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f31071x;
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
        np npVar = rjVar.d;
        if (npVar.getVisibility() != 0) {
            npVar.setVisibility(0);
        }
        npVar.a(z4, true);
        if (!z4) {
            i10 = 2;
        }
        this.f26546b.V1(i10);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        if (i10 == 0) {
            li liVar = this.E;
            liVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            liVar.setVisibility(i11);
        }
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sj.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z4;
        int i10 = 0;
        if (this.f31069s.getAdapter().h() == 2) {
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
        oz ozVar = this.D;
        if (ozVar.getVisibility() != 0 || (childAt = this.f31069s.getChildAt(0)) == null) {
            return;
        }
        ozVar.setTranslationY((childAt.getTop() + (ozVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lj ljVar;
        if (i10 == NotificationCenter.contactsDidLoad && (ljVar = this.B) != null) {
            ljVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        mh.d1 d1Var = this.f31069s;
        if (d1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = d1Var.getChildAt(0);
        fl0 fl0Var = (fl0) d1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        xd.a aVar = this.f31067n;
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f31068r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31069s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f31070w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f31071x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(M(hashMap.get((hj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f31070w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        t6 t6Var = new t6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21642c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21732h6));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        mh.d1 d1Var = this.f31069s;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        int i11 = org.telegram.ui.ActionBar.k6.f21893q5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{rj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{rj.class}, new String[]{"statusTextView"}, null, null, -1, t6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{rj.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f26546b.G1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(ij ijVar) {
        this.G = ijVar;
    }

    public void setMultipleSelectionAllowed(boolean z4) {
        this.H = z4;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(og.a aVar) {
        ii iiVar = this.F;
        if (iiVar != null) {
            iiVar.setupBlurredBackground(aVar.c(iiVar, sg.b.a(this.f26545a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        mi miVar = this.f26546b;
        if (miVar.f29078o1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    miVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            miVar.setAllowNestedScroll(true);
        }
        this.f31069s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f26548e);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
