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
public final class zj extends ni implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public final tj E;
    public final vj F;
    public final yz G;
    public final ui H;
    public final ri I;
    public qj J;
    public boolean K;
    public final ne.b f31883n;
    public final FrameLayout f31884r;
    public final bi.o0 f31885s;
    public final ig.e0 v;
    public final HashMap f31886w;
    public final ArrayList f31887x;
    public boolean f31888y;

    public zj(Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var, viVar);
        this.f31883n = new ne.b(0, this, es.h, 380L, false);
        this.f31886w = new HashMap();
        this.f31887x = new ArrayList();
        this.f31888y = false;
        this.F = new vj(this, context);
        ui uiVar = new ui(context, org.telegram.ui.ActionBar.g6.f19901d6, c6Var);
        this.H = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31884r = frameLayout;
        ri riVar = new ri(context, c6Var, this.f27671b);
        this.I = riVar;
        riVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        di.g2 g2Var = riVar.f27815r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new nj(this));
        frameLayout.addView(uiVar, w7.a6.g());
        FrameLayout.LayoutParams a2 = w7.a6.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(riVar, a2);
        yz yzVar = new yz(context, c6Var);
        this.G = yzVar;
        yzVar.c();
        yzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(yzVar, w7.a6.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 12);
        this.f31885s = o0Var;
        this.f27672c = o0Var;
        this.d = o0Var;
        this.h = true;
        this.f27673f = true;
        o0Var.p1();
        o0Var.setClipToPadding(false);
        getContext();
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(9.0f), o0Var, 1);
        this.v = e0Var;
        o0Var.setLayoutManager(e0Var);
        e0Var.P = false;
        o0Var.setHorizontalScrollBarEnabled(false);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setClipToPadding(false);
        addView(o0Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        tj tjVar = new tj(this, context);
        this.E = tjVar;
        o0Var.setAdapter(tjVar);
        o0Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A5, this.f27670a));
        o0Var.setOnItemClickListener(new bi.z5(10, this, c6Var));
        o0Var.setOnScrollListener(new ah.d0(this, 19));
        o0Var.setOnItemLongClickListener(new lj(this));
        FrameLayout.LayoutParams e = w7.a6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f27671b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    public int getCurrentTop() {
        bi.o0 o0Var = this.f31885s;
        if (o0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = o0Var.getChildAt(0);
            wl0 wl0Var = (wl0) o0Var.G(childAt);
            if (wl0Var != null) {
                int paddingTop = o0Var.getPaddingTop();
                if (wl0Var.b() == 0 && childAt.getTop() >= 0) {
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
        vi viVar = this.f27671b;
        if (viVar.f30048u1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f31885s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void G(ni niVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31885s.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.f31886w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f31888y) {
            return false;
        }
        this.f31888y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f31887x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((pj) obj)));
        }
        vi viVar = this.f27671b;
        return g5.a0(viVar.M1, viVar.p1(), viVar.l1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                zj zjVar = zj.this;
                qj qjVar = zjVar.J;
                vi viVar2 = zjVar.f27671b;
                String obj3 = viVar2.o1().getText().toString();
                ((Long) obj2).getClass();
                qjVar.c(arrayList, obj3, z10, i10, j10, z11);
                viVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(yj yjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f31886w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27670a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            a2Var.R = string;
            a2Var.T = formatString;
            org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
            return;
        }
        pj a2 = pj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f31887x;
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
        aq aqVar = yjVar.d;
        if (aqVar.getVisibility() != 0) {
            aqVar.setVisibility(0);
        }
        aqVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f27671b.Z1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zj.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f31885s.getAdapter().h() == 2) {
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
        yz yzVar = this.G;
        if (yzVar.getVisibility() != 0 || (childAt = this.f31885s.getChildAt(0)) == null) {
            return;
        }
        yzVar.setTranslationY((childAt.getTop() + (yzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tj tjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (tjVar = this.E) != null) {
            tjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        bi.o0 o0Var = this.f31885s;
        if (o0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = o0Var.getChildAt(0);
        wl0 wl0Var = (wl0) o0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        ne.b bVar = this.f31883n;
        if (top >= 0 && wl0Var != null && wl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f31884r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31885s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f31886w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f31887x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((pj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f31886w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        b7 b7Var = new b7(this, 1);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19883c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f19973h6));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        bi.o0 o0Var = this.f31885s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        int i11 = org.telegram.ui.ActionBar.g6.f20138q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{yj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{yj.class}, new String[]{"statusTextView"}, null, null, -1, b7Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{yj.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    @Override
    public final void o() {
        NotificationCenter.getInstance(this.f27671b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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

    public void setDelegate(qj qjVar) {
        this.J = qjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27671b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        ri riVar = this.I;
        if (riVar != null) {
            riVar.setupBlurredBackground(bVar.c(riVar, fh.b.a(this.f27670a), false));
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
