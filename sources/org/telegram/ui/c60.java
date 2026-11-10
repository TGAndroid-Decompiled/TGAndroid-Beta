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
public final class c60 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener, te.b, rh.c {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.c20 F;
    public int G;
    public int H;
    public int I;
    public final te.c f44252a;
    public org.telegram.ui.Components.p00 f44253b;
    public org.telegram.ui.ActionBar.g5 f44254c;
    public a60 d;
    public ScrollView f44255e;
    public b60 f44256f;
    public org.telegram.ui.Components.pj0 h;
    public v4.b0 f44257n;
    public org.telegram.ui.Components.bv0 f44258r;
    public z50 f44259s;
    public ArrayList f44260w;
    public int f44261x;
    public boolean f44262y;

    public c60() {
        super(null);
        this.f44252a = new te.c(3, this, org.telegram.ui.Components.wq.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Z(c60 c60Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        boolean z9 = false;
        if (i7 == 0 && !c60Var.f44262y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(c60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                c60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) c60Var.D.get(contact.f21991b);
            if (c20Var != null) {
                c60Var.f44256f.a(c20Var);
            } else {
                org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(c60Var.getParentActivity(), null, contact, true, c60Var.resourceProvider);
                b60 b60Var = c60Var.f44256f;
                ArrayList arrayList = b60Var.f43936c;
                c60 c60Var2 = b60Var.f43938f;
                c60Var2.E.add(c20Var2);
                c60Var2.D.put(c20Var2.getKey(), c20Var2);
                AnimatorSet animatorSet = b60Var.f43934a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    b60Var.f43934a.cancel();
                }
                b60Var.f43935b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                b60Var.f43934a = animatorSet2;
                animatorSet2.addListener(new g30(b60Var, 2));
                b60Var.f43934a.setInterpolator(org.telegram.ui.Components.wq.h);
                b60Var.f43934a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, View.ALPHA, 0.0f, 1.0f));
                b60Var.addView(c20Var2);
                c60Var2.f44255e.post(new kz(b60Var, 15));
                c20Var2.setOnClickListener(c60Var);
            }
            c60Var.f44253b.e(!c60Var.E.isEmpty(), true);
            if (c20Var == null) {
                z9 = true;
            }
            org.telegram.ui.Components.wo woVar = q4Var.f30143e;
            if (woVar != null) {
                woVar.a(z9, true);
            }
        }
    }

    public static void a0(c60 c60Var) {
        ArrayList arrayList = c60Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.c20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f21993e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.f21999l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(c60Var.currentAccount).s(i7));
            c60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        c60Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.z4 b0(c60 c60Var) {
        return c60Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.z4 c0(c60 c60Var) {
        return c60Var.simpleActionBar;
    }

    public static void d0(c60 c60Var) {
        c60Var.f44262y = false;
        z50 z50Var = c60Var.f44259s;
        if (z50Var.h) {
            z50Var.h = false;
            z50Var.f();
        }
        c60Var.f44259s.E(null);
        c60Var.h.setFastScrollVisible(true);
        c60Var.h.setVerticalScrollBarEnabled(false);
        c60Var.f44258r.e(false, true);
        c60Var.f44258r.setStickerType(0);
        c60Var.f44258r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        c60Var.f44258r.f32368e.setText("");
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f44262y = false;
        this.E.clear();
        this.D.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749151, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.q().b(1, 2131232486);
        this.f44254c = b10;
        b10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f44254c;
        g5Var.N();
        g5Var.B0 = new kg.v1(this, 13);
        this.f44254c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f44255e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f44255e.setClipToPadding(false);
        b60 b60Var = new b60(this, context);
        this.f44256f = b60Var;
        this.f44255e.addView(b60Var, c8.ha.c(-2.0f, -1));
        this.d = new a60(this, context);
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(6);
        lzVar.f35774x = false;
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, lzVar, 0, null);
        this.f44258r = bv0Var;
        bv0Var.addView(lzVar, 0);
        this.f44258r.setAnimateLayoutChange(true);
        this.f44258r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        this.f44258r.f32368e.setText("");
        this.f44258r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f44257n = new v4.b0(1, false);
        this.f44259s = new z50(this, context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.h = pj0Var;
        pj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f44258r);
        this.h.setAdapter(this.f44259s);
        this.h.setLayoutManager(this.f44257n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var2 = this.h;
        if (!org.telegram.messenger.id.f23161a0) {
            i7 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i7);
        k0Var.addView(this.h, c8.ha.c(-1.0f, -1));
        k0Var.addView(this.f44258r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        y1Var.f28788l = 180;
        y1Var.invalidateSelf();
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.f44253b = p00Var;
        p00Var.f36738c.setImageDrawable(y1Var);
        this.f44253b.e(false, false);
        this.f44253b.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.f44253b.setOnClickListener(new j40(this, 3));
        z50 z50Var = this.f44259s;
        if (z50Var != null && !this.f44262y) {
            int b11 = z50Var.b();
            org.telegram.ui.Components.bv0 bv0Var2 = this.f44258r;
            if (b11 != 2) {
                i10 = 4;
            }
            bv0Var2.setVisibility(i10);
        }
        k0Var.addView(this.d, c8.ha.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f44253b, org.telegram.ui.Components.p00.b());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41263f1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.bv0 bv0Var;
        if (i7 == org.telegram.messenger.qs.P) {
            f0();
        } else if (i7 == org.telegram.messenger.qs.O && (bv0Var = this.f44258r) != null) {
            bv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.f44252a.f55504f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        oi.a.e(this.h, this.G, this.H, currentActionBarHeight + i7, 0);
        this.f44258r.setPadding(0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).f22605a0);
        this.f44260w = arrayList;
        Collections.sort(arrayList, new pe(26));
        org.telegram.ui.Components.bv0 bv0Var = this.f44258r;
        if (bv0Var != null) {
            bv0Var.e(false, true);
        }
        z50 z50Var = this.f44259s;
        if (z50Var != null) {
            z50Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28038l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28056m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28073n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28020k7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28072n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44256f, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f44256f, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.k1 k1Var) {
        int i7 = k1Var.f54213a.f(8).d;
        this.I = i7;
        org.telegram.ui.Components.p00 p00Var = this.f44253b;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.H, i7));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (c20Var.D) {
            this.F = null;
            this.f44256f.a(c20Var);
            this.f44253b.e(!this.E.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.h.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                    boolean containsKey = this.D.containsKey(contact.f21991b);
                    org.telegram.ui.Components.wo woVar = q4Var.f30143e;
                    if (woVar != null) {
                        woVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.c20 c20Var2 = this.F;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.F = c20Var;
        c20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.P);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        f0();
        if (!org.telegram.messenger.p10.i(this.currentAccount).H) {
            org.telegram.messenger.g5.r(this.currentAccount).l();
            org.telegram.messenger.p10.i(this.currentAccount).H = true;
            org.telegram.messenger.p10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.P);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.G = i10;
        this.H = i12;
        e0();
        a60 a60Var = this.d;
        if (a60Var != null) {
            a60Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.p00 p00Var = this.f44253b;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.pj0 pj0Var = this.h;
            if (pj0Var != null) {
                pj0Var.x1();
            }
            if (this.f44256f != null) {
                for (int i7 = 0; i7 < this.f44256f.getChildCount(); i7++) {
                    View childAt = this.f44256f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.c20) {
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
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
