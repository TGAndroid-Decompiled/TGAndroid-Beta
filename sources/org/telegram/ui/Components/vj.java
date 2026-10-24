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
public final class vj extends ji implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate, ne.d {
    public final pj E;
    public final rj F;
    public final tz G;
    public final qi H;
    public final ni I;
    public mj J;
    public boolean K;
    public final ne.b f31464n;
    public final FrameLayout f31465r;
    public final ai.u1 f31466s;
    public final ig.d0 v;
    public final HashMap f31467w;
    public final ArrayList f31468x;
    public boolean f31469y;

    public vj(Context context, org.telegram.ui.ActionBar.g6 g6Var, ri riVar) {
        super(context, g6Var, riVar);
        this.f31464n = new ne.b(0, this, zr.h, 380L, false);
        this.f31467w = new HashMap();
        this.f31468x = new ArrayList();
        this.f31469y = false;
        this.F = new rj(this, context);
        qi qiVar = new qi(context, org.telegram.ui.ActionBar.k6.f21184d6, g6Var);
        this.H = qiVar;
        qiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31465r = frameLayout;
        ni niVar = new ni(context, g6Var, this.f27704b);
        this.I = niVar;
        niVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ei.e2 e2Var = niVar.f27258r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new jj(this));
        frameLayout.addView(qiVar, w7.z5.g());
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(niVar, d);
        tz tzVar = new tz(context, g6Var);
        this.G = tzVar;
        tzVar.c();
        tzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(tzVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 13);
        this.f31466s = u1Var;
        this.f27705c = u1Var;
        this.d = u1Var;
        this.h = true;
        this.f27706f = true;
        u1Var.t1();
        u1Var.setClipToPadding(false);
        getContext();
        ig.d0 d0Var = new ig.d0(this, AndroidUtilities.dp(9.0f), u1Var, 1);
        this.v = d0Var;
        u1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        u1Var.setHorizontalScrollBarEnabled(false);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        pj pjVar = new pj(this, context);
        this.E = pjVar;
        u1Var.setAdapter(pjVar);
        org.telegram.ui.ActionBar.r6.m(u1Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        u1Var.setOnItemClickListener(new ci.x4(10, this, g6Var));
        u1Var.setOnScrollListener(new ah.d0(this, 23));
        u1Var.setOnItemLongClickListener(new hj(this));
        FrameLayout.LayoutParams e = w7.z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f27704b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    public int getCurrentTop() {
        ai.u1 u1Var = this.f31466s;
        if (u1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = u1Var.getChildAt(0);
            vl0 vl0Var = (vl0) u1Var.G(childAt);
            if (vl0Var != null) {
                int paddingTop = u1Var.getPaddingTop();
                if (vl0Var.b() == 0 && childAt.getTop() >= 0) {
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
        ri riVar = this.f27704b;
        if (riVar.f30193u1.Q() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            riVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    riVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            riVar.setAllowNestedScroll(true);
        }
        this.f31466s.s1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void F(ji jiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31466s.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.f31467w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f31469y) {
            return false;
        }
        this.f31469y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f31468x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((lj) obj)));
        }
        ri riVar = this.f27704b;
        return d5.a0(riVar.M1, riVar.s1(), riVar.o1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                vj vjVar = vj.this;
                mj mjVar = vjVar.J;
                ri riVar2 = vjVar.f27704b;
                String obj3 = riVar2.r1().getText().toString();
                ((Long) obj2).getClass();
                mjVar.b(arrayList, obj3, z10, i10, j10, z11);
                riVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(uj ujVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f31467w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27703a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = formatString;
            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        lj a2 = lj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f31468x;
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
        vp vpVar = ujVar.d;
        if (vpVar.getVisibility() != 0) {
            vpVar.setVisibility(0);
        }
        vpVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f27704b.d2(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vj.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f31466s.getAdapter().h() == 2) {
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
        tz tzVar = this.G;
        if (tzVar.getVisibility() != 0 || (childAt = this.f31466s.getChildAt(0)) == null) {
            return;
        }
        tzVar.setTranslationY((childAt.getTop() + (tzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21421q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pj pjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (pjVar = this.E) != null) {
            pjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.u1 u1Var = this.f31466s;
        if (u1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        vl0 vl0Var = (vl0) u1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        ne.b bVar = this.f31464n;
        if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f31465r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31466s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f31467w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f31468x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((lj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f31467w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21166c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        int i10 = org.telegram.ui.ActionBar.k6.f21421q5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f31466s, 0, new Class[]{uj.class}, new String[]{"nameTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        if (i10 == 0) {
            qi qiVar = this.H;
            qiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            qiVar.setVisibility(i11);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    @Override
    public final void p() {
        NotificationCenter.getInstance(this.f27704b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    public void setDelegate(mj mjVar) {
        this.J = mjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(bh.b bVar) {
        ni niVar = this.I;
        if (niVar != null) {
            niVar.setupBlurredBackground(bVar.c(niVar, fh.c.a(this.f27703a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            ni niVar = this.I;
            if (niVar != null) {
                niVar.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
