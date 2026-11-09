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
public final class b60 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener, te.b, rh.c {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.d20 F;
    public int G;
    public int H;
    public int I;
    public final te.c f43908a;
    public org.telegram.ui.Components.q00 f43909b;
    public org.telegram.ui.ActionBar.f5 f43910c;
    public z50 d;
    public ScrollView f43911e;
    public a60 f43912f;
    public org.telegram.ui.Components.qj0 h;
    public v4.b0 f43913n;
    public org.telegram.ui.Components.cv0 f43914r;
    public y50 f43915s;
    public ArrayList f43916w;
    public int f43917x;
    public boolean f43918y;

    public b60() {
        super(null);
        this.f43908a = new te.c(3, this, org.telegram.ui.Components.xq.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Z(b60 b60Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        boolean z9 = false;
        if (i7 == 0 && !b60Var.f43918y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(b60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                b60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) b60Var.D.get(contact.f21987b);
            if (d20Var != null) {
                b60Var.f43912f.a(d20Var);
            } else {
                org.telegram.ui.Components.d20 d20Var2 = new org.telegram.ui.Components.d20(b60Var.getParentActivity(), null, contact, true, b60Var.resourceProvider);
                a60 a60Var = b60Var.f43912f;
                ArrayList arrayList = a60Var.f43595c;
                b60 b60Var2 = a60Var.f43597f;
                b60Var2.E.add(d20Var2);
                b60Var2.D.put(d20Var2.getKey(), d20Var2);
                AnimatorSet animatorSet = a60Var.f43593a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    a60Var.f43593a.cancel();
                }
                a60Var.f43594b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                a60Var.f43593a = animatorSet2;
                animatorSet2.addListener(new f30(a60Var, 2));
                a60Var.f43593a.setInterpolator(org.telegram.ui.Components.xq.h);
                a60Var.f43593a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(d20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d20Var2, View.ALPHA, 0.0f, 1.0f));
                a60Var.addView(d20Var2);
                b60Var2.f43911e.post(new jz(a60Var, 15));
                d20Var2.setOnClickListener(b60Var);
            }
            b60Var.f43909b.e(!b60Var.E.isEmpty(), true);
            if (d20Var == null) {
                z9 = true;
            }
            org.telegram.ui.Components.wo woVar = q4Var.f30132e;
            if (woVar != null) {
                woVar.a(z9, true);
            }
        }
    }

    public static void a0(b60 b60Var) {
        ArrayList arrayList = b60Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.d20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f21989e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.f21995l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(b60Var.currentAccount).s(i7));
            b60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        b60Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.y4 b0(b60 b60Var) {
        return b60Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.y4 c0(b60 b60Var) {
        return b60Var.simpleActionBar;
    }

    public static void d0(b60 b60Var) {
        b60Var.f43918y = false;
        y50 y50Var = b60Var.f43915s;
        if (y50Var.h) {
            y50Var.h = false;
            y50Var.f();
        }
        b60Var.f43915s.E(null);
        b60Var.h.setFastScrollVisible(true);
        b60Var.h.setVerticalScrollBarEnabled(false);
        b60Var.f43914r.e(false, true);
        b60Var.f43914r.setStickerType(0);
        b60Var.f43914r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        b60Var.f43914r.f32768e.setText("");
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f43918y = false;
        this.E.clear();
        this.D.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749151, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 9));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(1, 2131232486);
        this.f43910c = b10;
        b10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f43910c;
        f5Var.N();
        f5Var.B0 = new kg.v1(this, 13);
        this.f43910c.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f43911e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f43911e.setClipToPadding(false);
        a60 a60Var = new a60(this, context);
        this.f43912f = a60Var;
        this.f43911e.addView(a60Var, c8.ha.c(-2.0f, -1));
        this.d = new z50(this, context);
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(6);
        mzVar.f36181x = false;
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, mzVar, 0, null);
        this.f43914r = cv0Var;
        cv0Var.addView(mzVar, 0);
        this.f43914r.setAnimateLayoutChange(true);
        this.f43914r.d.setText(org.telegram.messenger.id.M0(2131748223, null));
        this.f43914r.f32768e.setText("");
        this.f43914r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f43913n = new v4.b0(1, false);
        this.f43915s = new y50(this, context);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.h = qj0Var;
        qj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f43914r);
        this.h.setAdapter(this.f43915s);
        this.h.setLayoutManager(this.f43913n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.qj0 qj0Var2 = this.h;
        if (!org.telegram.messenger.id.f23157a0) {
            i7 = 2;
        }
        qj0Var2.setVerticalScrollbarPosition(i7);
        k0Var.addView(this.h, c8.ha.c(-1.0f, -1));
        k0Var.addView(this.f43914r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        y1Var.f28776l = 180;
        y1Var.invalidateSelf();
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.f43909b = q00Var;
        q00Var.f37139c.setImageDrawable(y1Var);
        this.f43909b.e(false, false);
        this.f43909b.setContentDescription(org.telegram.messenger.id.M0(2131748250, null));
        this.f43909b.setOnClickListener(new i40(this, 3));
        y50 y50Var = this.f43915s;
        if (y50Var != null && !this.f43918y) {
            int b11 = y50Var.b();
            org.telegram.ui.Components.cv0 cv0Var2 = this.f43914r;
            if (b11 != 2) {
                i10 = 4;
            }
            cv0Var2.setVisibility(i10);
        }
        k0Var.addView(this.d, c8.ha.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f43909b, org.telegram.ui.Components.q00.b());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41272f1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.cv0 cv0Var;
        if (i7 == org.telegram.messenger.qs.P) {
            f0();
        } else if (i7 == org.telegram.messenger.qs.O && (cv0Var = this.f43914r) != null) {
            cv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.f43908a.f55505f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        oi.a.e(this.h, this.G, this.H, currentActionBarHeight + i7, 0);
        this.f43914r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).f22601a0);
        this.f43916w = arrayList;
        Collections.sort(arrayList, new oe(26));
        org.telegram.ui.Components.cv0 cv0Var = this.f43914r;
        if (cv0Var != null) {
            cv0Var.e(false, true);
        }
        y50 y50Var = this.f43915s;
        if (y50Var != null) {
            y50Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28013l7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28031m7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28048n7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27995k7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28047n6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f43912f, 0, new Class[]{org.telegram.ui.Components.d20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f43912f, 0, new Class[]{org.telegram.ui.Components.d20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ri));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.k1 k1Var) {
        int i7 = k1Var.f54214a.f(8).d;
        this.I = i7;
        org.telegram.ui.Components.q00 q00Var = this.f43909b;
        if (q00Var != null) {
            q00Var.setTranslationY(-Math.max(this.H, i7));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) view;
        if (d20Var.D) {
            this.F = null;
            this.f43912f.a(d20Var);
            this.f43909b.e(!this.E.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.h.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                    boolean containsKey = this.D.containsKey(contact.f21987b);
                    org.telegram.ui.Components.wo woVar = q4Var.f30132e;
                    if (woVar != null) {
                        woVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.d20 d20Var2 = this.F;
        if (d20Var2 != null) {
            d20Var2.a();
        }
        this.F = d20Var;
        d20Var.b();
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
        z50 z50Var = this.d;
        if (z50Var != null) {
            z50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.q00 q00Var = this.f43909b;
        if (q00Var != null) {
            q00Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.qj0 qj0Var = this.h;
            if (qj0Var != null) {
                qj0Var.x1();
            }
            if (this.f43912f != null) {
                for (int i7 = 0; i7 < this.f43912f.getChildCount(); i7++) {
                    View childAt = this.f43912f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.d20) {
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
