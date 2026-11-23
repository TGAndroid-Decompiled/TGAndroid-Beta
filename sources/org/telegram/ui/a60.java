package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
public final class a60 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, View.OnClickListener, te.b, rh.c {
    public final HashMap E;
    public final ArrayList F;
    public org.telegram.ui.Components.n20 G;
    public int H;
    public int I;
    public int J;
    public final te.c f45595a;
    public org.telegram.ui.Components.a10 f45596b;
    public org.telegram.ui.ActionBar.g5 f45597c;
    public y50 d;
    public ScrollView f45598e;
    public z50 f45599f;
    public org.telegram.ui.Components.ek0 h;
    public v4.c0 f45600n;
    public org.telegram.ui.Components.mv0 f45601r;
    public x50 f45602s;
    public ArrayList f45603w;
    public int f45604x;
    public boolean f45605y;

    public a60() {
        super(null);
        this.f45595a = new te.c(3, this, org.telegram.ui.Components.kr.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static void Z(a60 a60Var, View view, int i7) {
        org.telegram.ui.Cells.r4 r4Var;
        org.telegram.messenger.f5 contact;
        boolean z10 = false;
        if (i7 == 0 && !a60Var.f45605y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.i5.r(a60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                a60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.r4) && (contact = (r4Var = (org.telegram.ui.Cells.r4) view).getContact()) != null) {
            org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) a60Var.E.get(contact.f23949b);
            if (n20Var != null) {
                a60Var.f45599f.a(n20Var);
            } else {
                org.telegram.ui.Components.n20 n20Var2 = new org.telegram.ui.Components.n20(a60Var.getParentActivity(), null, contact, true, a60Var.resourceProvider);
                z50 z50Var = a60Var.f45599f;
                ArrayList arrayList = z50Var.f54530c;
                a60 a60Var2 = z50Var.f54532f;
                a60Var2.F.add(n20Var2);
                a60Var2.E.put(n20Var2.getKey(), n20Var2);
                AnimatorSet animatorSet = z50Var.f54528a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    z50Var.f54528a.cancel();
                }
                z50Var.f54529b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                z50Var.f54528a = animatorSet2;
                animatorSet2.addListener(new zx(z50Var, 3));
                z50Var.f54528a.setInterpolator(org.telegram.ui.Components.kr.h);
                z50Var.f54528a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(n20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(n20Var2, View.ALPHA, 0.0f, 1.0f));
                z50Var.addView(n20Var2);
                a60Var2.f45598e.post(new kz(z50Var, 15));
                n20Var2.setOnClickListener(a60Var);
            }
            a60Var.f45596b.e(!a60Var.F.isEmpty(), true);
            if (n20Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.lp lpVar = r4Var.f31779e;
            if (lpVar != null) {
                lpVar.a(z10, true);
            }
        }
    }

    public static void a0(a60 a60Var) {
        ArrayList arrayList = a60Var.F;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.f5 contact = ((org.telegram.ui.Components.n20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f23951e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.f23957l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(a60Var.currentAccount).s(i7));
            a60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        a60Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.z4 b0(a60 a60Var) {
        return a60Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.z4 c0(a60 a60Var) {
        return a60Var.simpleActionBar;
    }

    public static void d0(a60 a60Var) {
        a60Var.f45605y = false;
        x50 x50Var = a60Var.f45602s;
        if (x50Var.h) {
            x50Var.h = false;
            x50Var.f();
        }
        a60Var.f45602s.E(null);
        a60Var.h.setFastScrollVisible(true);
        a60Var.h.setVerticalScrollBarEnabled(false);
        a60Var.f45601r.e(false, true);
        a60Var.f45601r.setStickerType(0);
        a60Var.f45601r.d.setText(org.telegram.messenger.gd.N0(2131748030, null));
        a60Var.f45601r.f37553e.setText("");
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            e0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final View S() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f45605y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748958, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 12));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(1, 2131232491);
        this.f45597c = b10;
        b10.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f45597c;
        g5Var.O();
        g5Var.C0 = new bi.x1(this, 14);
        this.f45597c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f45598e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f45598e.setClipToPadding(false);
        z50 z50Var = new z50(this, context);
        this.f45599f = z50Var;
        this.f45598e.addView(z50Var, c8.na.c(-2.0f, -1));
        this.d = new y50(this, context);
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        vzVar.setViewType(6);
        vzVar.f41457x = false;
        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(context, vzVar, 0, null);
        this.f45601r = mv0Var;
        mv0Var.addView(vzVar, 0);
        this.f45601r.setAnimateLayoutChange(true);
        this.f45601r.d.setText(org.telegram.messenger.gd.N0(2131748030, null));
        this.f45601r.f37553e.setText("");
        this.f45601r.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f45600n = new v4.c0(1, false);
        this.f45602s = new x50(this, context);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.h = ek0Var;
        ek0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f45601r);
        this.h.setAdapter(this.f45602s);
        this.h.setLayoutManager(this.f45600n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var2 = this.h;
        if (!org.telegram.messenger.gd.f24314a0) {
            i7 = 2;
        }
        ek0Var2.setVerticalScrollbarPosition(i7);
        k0Var.addView(this.h, c8.na.c(-1.0f, -1));
        k0Var.addView(this.f45601r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.f30315l = 180;
        x1Var.invalidateSelf();
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, this.resourceProvider, false);
        this.f45596b = a10Var;
        a10Var.f33308c.setImageDrawable(x1Var);
        this.f45596b.e(false, false);
        this.f45596b.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        this.f45596b.setOnClickListener(new i40(this, 3));
        x50 x50Var = this.f45602s;
        if (x50Var != null && !this.f45605y) {
            int b11 = x50Var.b();
            org.telegram.ui.Components.mv0 mv0Var2 = this.f45601r;
            if (b11 != 2) {
                i10 = 4;
            }
            mv0Var2.setVisibility(i10);
        }
        k0Var.addView(this.d, c8.na.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f45596b, org.telegram.ui.Components.a10.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43200g1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.mv0 mv0Var;
        if (i7 == org.telegram.messenger.ks.P) {
            f0();
        } else if (i7 == org.telegram.messenger.ks.O && (mv0Var = this.f45601r) != null) {
            mv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.f45595a.f57785f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        ri.a.e(this.h, this.H, this.I, currentActionBarHeight + i7, 0);
        this.f45601r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.i5.r(this.currentAccount).f24686b0);
        this.f45603w = arrayList;
        Collections.sort(arrayList, new pe(24));
        org.telegram.ui.Components.mv0 mv0Var = this.f45601r;
        if (mv0Var != null) {
            mv0Var.e(false, true);
        }
        x50 x50Var = this.f45602s;
        if (x50Var != null) {
            x50Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29599l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29617m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29634n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29581k7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 262148, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29633n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45599f, 0, new Class[]{org.telegram.ui.Components.n20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45599f, 0, new Class[]{org.telegram.ui.Components.n20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ui));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.l1 l1Var) {
        int i7 = l1Var.f56381a.f(8).d;
        this.J = i7;
        org.telegram.ui.Components.a10 a10Var = this.f45596b;
        if (a10Var != null) {
            a10Var.setTranslationY(-Math.max(this.I, i7));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.r4 r4Var;
        org.telegram.messenger.f5 contact;
        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view;
        if (n20Var.E) {
            this.G = null;
            this.f45599f.a(n20Var);
            this.f45596b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.h.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.r4) && (contact = (r4Var = (org.telegram.ui.Cells.r4) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.f23949b);
                    org.telegram.ui.Components.lp lpVar = r4Var.f31779e;
                    if (lpVar != null) {
                        lpVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.n20 n20Var2 = this.G;
        if (n20Var2 != null) {
            n20Var2.a();
        }
        this.G = n20Var;
        n20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.P);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.O);
        f0();
        if (!org.telegram.messenger.i10.i(this.currentAccount).I) {
            org.telegram.messenger.i5.r(this.currentAccount).l();
            org.telegram.messenger.i10.i(this.currentAccount).I = true;
            org.telegram.messenger.i10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.P);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.O);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.H = i10;
        this.I = i12;
        e0();
        y50 y50Var = this.d;
        if (y50Var != null) {
            y50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H);
        }
        org.telegram.ui.Components.a10 a10Var = this.f45596b;
        if (a10Var != null) {
            a10Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.ek0 ek0Var = this.h;
            if (ek0Var != null) {
                ek0Var.x1();
            }
            if (this.f45599f != null) {
                for (int i7 = 0; i7 < this.f45599f.getChildCount(); i7++) {
                    View childAt = this.f45599f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.n20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
