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
public final class xj extends li implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public final rj E;
    public final tj F;
    public final vz G;
    public final si H;
    public final pi I;
    public oj J;
    public boolean K;
    public final ne.b f32434n;
    public final FrameLayout f32435r;
    public final ai.u1 f32436s;
    public final ig.e0 v;
    public final HashMap f32437w;
    public final ArrayList f32438x;
    public boolean f32439y;

    public xj(Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
        this.f32434n = new ne.b(0, this, bs.h, 380L, false);
        this.f32437w = new HashMap();
        this.f32438x = new ArrayList();
        this.f32439y = false;
        this.F = new tj(this, context);
        si siVar = new si(context, org.telegram.ui.ActionBar.h6.f20990d6, d6Var);
        this.H = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32435r = frameLayout;
        pi piVar = new pi(context, d6Var, this.f28173b);
        this.I = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ei.e2 e2Var = piVar.f27726r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new lj(this));
        frameLayout.addView(siVar, w7.z5.g());
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, d);
        vz vzVar = new vz(context, d6Var);
        this.G = vzVar;
        vzVar.c();
        vzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(vzVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, d6Var, 13);
        this.f32436s = u1Var;
        this.f28174c = u1Var;
        this.d = u1Var;
        this.h = true;
        this.f28175f = true;
        u1Var.p1();
        u1Var.setClipToPadding(false);
        getContext();
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(9.0f), u1Var, 1);
        this.v = e0Var;
        u1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        rj rjVar = new rj(this, context);
        this.E = rjVar;
        u1Var.setAdapter(rjVar);
        u1Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, this.f28172a));
        u1Var.setOnItemClickListener(new ci.y4(10, this, d6Var));
        u1Var.setOnScrollListener(new ah.d0(this, 23));
        u1Var.setOnItemLongClickListener(new jj(this));
        FrameLayout.LayoutParams e = w7.z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f28173b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    public int getCurrentTop() {
        ai.u1 u1Var = this.f32436s;
        if (u1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = u1Var.getChildAt(0);
            tl0 tl0Var = (tl0) u1Var.G(childAt);
            if (tl0Var != null) {
                int paddingTop = u1Var.getPaddingTop();
                if (tl0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ti tiVar = this.f28173b;
        if (tiVar.f30593u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        this.f32436s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void F(li liVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f32436s.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.f32437w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f32439y) {
            return false;
        }
        this.f32439y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f32438x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((nj) obj)));
        }
        ti tiVar = this.f28173b;
        return f5.a0(tiVar.M1, tiVar.p1(), tiVar.l1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                xj xjVar = xj.this;
                oj ojVar = xjVar.J;
                ti tiVar2 = xjVar.f28173b;
                String obj3 = tiVar2.o1().getText().toString();
                ((Long) obj2).getClass();
                ojVar.c(arrayList, obj3, z10, i10, j10, z11);
                tiVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(wj wjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f32437w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28172a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            b2Var.R = string;
            b2Var.T = formatString;
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        nj a2 = nj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f32438x;
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
        xp xpVar = wjVar.d;
        if (xpVar.getVisibility() != 0) {
            xpVar.setVisibility(0);
        }
        xpVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f28173b.Z1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xj.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f32436s.getAdapter().h() == 2) {
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
        vz vzVar = this.G;
        if (vzVar.getVisibility() != 0 || (childAt = this.f32436s.getChildAt(0)) == null) {
            return;
        }
        vzVar.setTranslationY((childAt.getTop() + (vzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rj rjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (rjVar = this.E) != null) {
            rjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.u1 u1Var = this.f32436s;
        if (u1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        tl0 tl0Var = (tl0) u1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && tl0Var != null && tl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        ne.b bVar = this.f32434n;
        if (top >= 0 && tl0Var != null && tl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f32435r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32436s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f32437w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f32438x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((nj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f32437w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        z6 z6Var = new z6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20972c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21062h6));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.u1 u1Var = this.f32436s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        int i11 = org.telegram.ui.ActionBar.h6.f21227q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{wj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{wj.class}, new String[]{"statusTextView"}, null, null, -1, z6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{wj.class}, null, org.telegram.ui.ActionBar.h6.f21241r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    @Override
    public final void o() {
        NotificationCenter.getInstance(this.f28173b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        if (i10 == 0) {
            si siVar = this.H;
            siVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            siVar.setVisibility(i11);
        }
    }

    public void setDelegate(oj ojVar) {
        this.J = ojVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28173b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        pi piVar = this.I;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, fh.c.a(this.f28172a), false));
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
