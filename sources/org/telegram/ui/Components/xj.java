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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xj extends li implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, oe.d {
    public final rj E;
    public final tj F;
    public final uz G;
    public final si H;
    public final pi I;
    public oj J;
    public boolean K;
    public final oe.b f34782n;
    public final FrameLayout f34783r;
    public final bi.r1 f34784s;
    public final jg.e0 v;
    public final HashMap f34785w;
    public final ArrayList f34786x;
    public boolean f34787y;

    public xj(Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        this.f34782n = new oe.b(0, this, ds.h, 380L, false);
        this.f34785w = new HashMap();
        this.f34786x = new ArrayList();
        this.f34787y = false;
        this.F = new tj(this, context);
        si siVar = new si(context, org.telegram.ui.ActionBar.y6.f23357d6, u6Var);
        this.H = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34783r = frameLayout;
        pi piVar = new pi(context, u6Var, this.f30254b);
        this.I = piVar;
        piVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        fi.c2 c2Var = piVar.f30347r;
        c2Var.setHint(string);
        c2Var.addTextChangedListener(new lj(this));
        frameLayout.addView(siVar, kb1.k());
        FrameLayout.LayoutParams h = kb1.h(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) h).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(piVar, h);
        uz uzVar = new uz(context, u6Var);
        this.G = uzVar;
        uzVar.c();
        uzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(uzVar, kb1.h(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 13);
        this.f34784s = r1Var;
        setBlur3Capture(r1Var);
        this.d = r1Var;
        this.h = true;
        this.f30256f = true;
        r1Var.u1();
        r1Var.setClipToPadding(false);
        getContext();
        jg.e0 e0Var = new jg.e0(this, AndroidUtilities.dp(9.0f), r1Var, 1);
        this.v = e0Var;
        r1Var.setLayoutManager(e0Var);
        e0Var.P = false;
        r1Var.setHorizontalScrollBarEnabled(false);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setClipToPadding(false);
        addView(r1Var, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        rj rjVar = new rj(this, context);
        this.E = rjVar;
        r1Var.setAdapter(rjVar);
        org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        r1Var.setOnItemClickListener(new di.x4(10, this, u6Var));
        r1Var.setOnScrollListener(new ai.b(this, 27));
        r1Var.setOnItemLongClickListener(new jj(this));
        FrameLayout.LayoutParams i10 = kb1.i(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) i10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, i10);
        NotificationCenter.getInstance(this.f30254b.M1).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    public int getCurrentTop() {
        bi.r1 r1Var = this.f34784s;
        if (r1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = r1Var.getChildAt(0);
            wl0 wl0Var = (wl0) r1Var.G(childAt);
            if (wl0Var != null) {
                int paddingTop = r1Var.getPaddingTop();
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
        ti tiVar = this.f30254b;
        if (tiVar.f33037u1.Q() > AndroidUtilities.dp(20.0f)) {
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
        this.f34784s.t1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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

    @Override
    public final void G(li liVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f34784s.y0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.f34785w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f34787y) {
            return false;
        }
        this.f34787y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f34786x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((nj) obj)));
        }
        ti tiVar = this.f30254b;
        return g5.a0(tiVar.M1, tiVar.t1(), tiVar.p1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                xj xjVar = xj.this;
                oj ojVar = xjVar.J;
                ti tiVar2 = xjVar.f30254b;
                String obj3 = tiVar2.s1().getText().toString();
                ((Long) obj2).getClass();
                ojVar.b(arrayList, obj3, z10, i10, j10, z11);
                tiVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(wj wjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f34785w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30253a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
            e2Var.T = formatString;
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        nj a2 = nj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f34786x;
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
        aq aqVar = wjVar.d;
        if (aqVar.getVisibility() != 0) {
            aqVar.setVisibility(0);
        }
        aqVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f30254b.d2(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xj.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f34784s.getAdapter().h() == 2) {
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
        uz uzVar = this.G;
        if (uzVar.getVisibility() != 0 || (childAt = this.f34784s.getChildAt(0)) == null) {
            return;
        }
        uzVar.setTranslationY((childAt.getTop() + (uzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
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
        bi.r1 r1Var = this.f34784s;
        if (r1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        oe.b bVar = this.f34782n;
        if (top >= 0 && wl0Var != null && wl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f34783r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f34784s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f34785w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f34786x;
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
        return this.f34785w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        int i10 = org.telegram.ui.ActionBar.y6.q5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f34784s, 0, new Class[]{wj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final void o() {
        NotificationCenter.getInstance(this.f30254b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
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
        this.f30254b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ch.b bVar) {
        pi piVar = this.I;
        if (piVar != null) {
            piVar.setupBlurredBackground(bVar.c(piVar, gh.c.a(this.f30253a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            pi piVar = this.I;
            if (piVar != null) {
                piVar.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
