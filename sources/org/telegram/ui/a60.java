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
    public org.telegram.ui.Components.p20 G;
    public int H;
    public int I;
    public int J;
    public final te.c f45507a;
    public org.telegram.ui.Components.c10 f45508b;
    public org.telegram.ui.ActionBar.g5 f45509c;
    public y50 d;
    public ScrollView f45510e;
    public z50 f45511f;
    public org.telegram.ui.Components.ek0 h;
    public v4.c0 f45512n;
    public org.telegram.ui.Components.nv0 f45513r;
    public x50 f45514s;
    public ArrayList f45515w;
    public int f45516x;
    public boolean f45517y;

    public a60() {
        super(null);
        this.f45507a = new te.c(3, this, org.telegram.ui.Components.nr.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static void Z(a60 a60Var, View view, int i7) {
        org.telegram.ui.Cells.r4 r4Var;
        org.telegram.messenger.f5 contact;
        boolean z10 = false;
        if (i7 == 0 && !a60Var.f45517y) {
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
            org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) a60Var.E.get(contact.f23866b);
            if (p20Var != null) {
                a60Var.f45511f.a(p20Var);
            } else {
                org.telegram.ui.Components.p20 p20Var2 = new org.telegram.ui.Components.p20(a60Var.getParentActivity(), null, contact, true, a60Var.resourceProvider);
                z50 z50Var = a60Var.f45511f;
                ArrayList arrayList = z50Var.f54438c;
                a60 a60Var2 = z50Var.f54440f;
                a60Var2.F.add(p20Var2);
                a60Var2.E.put(p20Var2.getKey(), p20Var2);
                AnimatorSet animatorSet = z50Var.f54436a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    z50Var.f54436a.cancel();
                }
                z50Var.f54437b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                z50Var.f54436a = animatorSet2;
                animatorSet2.addListener(new ay(z50Var, 3));
                z50Var.f54436a.setInterpolator(org.telegram.ui.Components.nr.h);
                z50Var.f54436a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(p20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p20Var2, View.ALPHA, 0.0f, 1.0f));
                z50Var.addView(p20Var2);
                a60Var2.f45510e.post(new lz(z50Var, 15));
                p20Var2.setOnClickListener(a60Var);
            }
            a60Var.f45508b.e(!a60Var.F.isEmpty(), true);
            if (p20Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.op opVar = r4Var.f31726e;
            if (opVar != null) {
                opVar.a(z10, true);
            }
        }
    }

    public static void a0(a60 a60Var) {
        ArrayList arrayList = a60Var.F;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.f5 contact = ((org.telegram.ui.Components.p20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f23868e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.f23874l;
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
        a60Var.f45517y = false;
        x50 x50Var = a60Var.f45514s;
        if (x50Var.h) {
            x50Var.h = false;
            x50Var.f();
        }
        a60Var.f45514s.E(null);
        a60Var.h.setFastScrollVisible(true);
        a60Var.h.setVerticalScrollBarEnabled(false);
        a60Var.f45513r.e(false, true);
        a60Var.f45513r.setStickerType(0);
        a60Var.f45513r.d.setText(org.telegram.messenger.gd.N0(2131748030, null));
        a60Var.f45513r.f37991e.setText("");
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29770y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f45517y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748958, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 12));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(1, 2131232488);
        this.f45509c = b10;
        b10.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f45509c;
        g5Var.O();
        g5Var.C0 = new bi.w1(this, 14);
        this.f45509c.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f45510e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f45510e.setClipToPadding(false);
        z50 z50Var = new z50(this, context);
        this.f45511f = z50Var;
        this.f45510e.addView(z50Var, c8.ma.c(-2.0f, -1));
        this.d = new y50(this, context);
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(6);
        yzVar.f42613x = false;
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 0, null);
        this.f45513r = nv0Var;
        nv0Var.addView(yzVar, 0);
        this.f45513r.setAnimateLayoutChange(true);
        this.f45513r.d.setText(org.telegram.messenger.gd.N0(2131748030, null));
        this.f45513r.f37991e.setText("");
        this.f45513r.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f45512n = new v4.c0(1, false);
        this.f45514s = new x50(this, context);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.h = ek0Var;
        ek0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f45513r);
        this.h.setAdapter(this.f45514s);
        this.h.setLayoutManager(this.f45512n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var2 = this.h;
        if (!org.telegram.messenger.gd.f24241a0) {
            i7 = 2;
        }
        ek0Var2.setVerticalScrollbarPosition(i7);
        k0Var.addView(this.h, c8.ma.c(-1.0f, -1));
        k0Var.addView(this.f45513r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.f30253l = 180;
        x1Var.invalidateSelf();
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, this.resourceProvider, false);
        this.f45508b = c10Var;
        c10Var.f33973c.setImageDrawable(x1Var);
        this.f45508b.e(false, false);
        this.f45508b.setContentDescription(org.telegram.messenger.gd.N0(2131748057, null));
        this.f45508b.setOnClickListener(new j40(this, 3));
        x50 x50Var = this.f45514s;
        if (x50Var != null && !this.f45517y) {
            int b11 = x50Var.b();
            org.telegram.ui.Components.nv0 nv0Var2 = this.f45513r;
            if (b11 != 2) {
                i10 = 4;
            }
            nv0Var2.setVisibility(i10);
        }
        k0Var.addView(this.d, c8.ma.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f45508b, org.telegram.ui.Components.c10.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f43121g1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.nv0 nv0Var;
        if (i7 == org.telegram.messenger.ks.P) {
            f0();
        } else if (i7 == org.telegram.messenger.ks.O && (nv0Var = this.f45513r) != null) {
            nv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.f45507a.f57702f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        ri.a.e(this.h, this.H, this.I, currentActionBarHeight + i7, 0);
        this.f45513r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.i5.r(this.currentAccount).f24588b0);
        this.f45515w = arrayList;
        Collections.sort(arrayList, new pe(24));
        org.telegram.ui.Components.nv0 nv0Var = this.f45513r;
        if (nv0Var != null) {
            nv0Var.e(false, true);
        }
        x50 x50Var = this.f45514s;
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
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29526l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29544m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29561n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29508k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 262148, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29560n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45511f, 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45511f, 0, new Class[]{org.telegram.ui.Components.p20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ui));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.l1 l1Var) {
        int i7 = l1Var.f56299a.f(8).d;
        this.J = i7;
        org.telegram.ui.Components.c10 c10Var = this.f45508b;
        if (c10Var != null) {
            c10Var.setTranslationY(-Math.max(this.I, i7));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.r4 r4Var;
        org.telegram.messenger.f5 contact;
        org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) view;
        if (p20Var.E) {
            this.G = null;
            this.f45511f.a(p20Var);
            this.f45508b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.h.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.r4) && (contact = (r4Var = (org.telegram.ui.Cells.r4) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.f23866b);
                    org.telegram.ui.Components.op opVar = r4Var.f31726e;
                    if (opVar != null) {
                        opVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.p20 p20Var2 = this.G;
        if (p20Var2 != null) {
            p20Var2.a();
        }
        this.G = p20Var;
        p20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.P);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.O);
        f0();
        if (!org.telegram.messenger.j10.i(this.currentAccount).I) {
            org.telegram.messenger.i5.r(this.currentAccount).l();
            org.telegram.messenger.j10.i(this.currentAccount).I = true;
            org.telegram.messenger.j10.i(this.currentAccount).v(false);
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
        org.telegram.ui.Components.c10 c10Var = this.f45508b;
        if (c10Var != null) {
            c10Var.setTranslationY(-Math.max(this.I, this.J));
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
            if (this.f45511f != null) {
                for (int i7 = 0; i7 < this.f45511f.getChildCount(); i7++) {
                    View childAt = this.f45511f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.p20) {
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
    public final void O() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
