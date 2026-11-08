package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class n81 extends org.telegram.ui.ActionBar.f2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final vx0 J;
    public final li0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.pj0 f47996a;
    public org.telegram.ui.Components.pj0 f47997b;
    public TextView f47998c;
    public k81 d;
    public m81 f47999e;
    public final ArrayList f48000f;
    public final ArrayList h;
    public sq0 f48001n;
    public org.telegram.ui.Components.jy f48002r;
    public FrameLayout f48003s;
    public int f48004w;
    public final HashSet f48005x;
    public org.telegram.ui.Cells.ha f48006y;

    public n81(int i7) {
        super(null);
        this.f48000f = new ArrayList();
        this.h = new ArrayList();
        this.f48005x = new HashSet();
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new vx0(this, 8);
        this.K = new li0(this, 21);
        this.arguments = rf.b.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f47998c != null && ((x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.k6.I.q())) {
            this.O = org.telegram.ui.ActionBar.k6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.k6.H1(this.f47998c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(this.f47998c.getBackground(), org.telegram.ui.ActionBar.z5.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27926h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28244y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27796a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28020m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748979, null));
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 15));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.H = new i81(this);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f47996a = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f47996a;
        k81 k81Var = new k81(this);
        this.d = k81Var;
        pj0Var2.setAdapter(k81Var);
        this.f47996a.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f47996a;
        vx0 vx0Var = this.J;
        pj0Var3.setOnItemClickListener(vx0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f47996a;
        li0 li0Var = this.K;
        pj0Var4.setOnItemLongClickListener(li0Var);
        org.telegram.ui.Components.pj0 pj0Var5 = new org.telegram.ui.Components.pj0(context, null);
        this.f47997b = pj0Var5;
        pj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var6 = this.f47997b;
        m81 m81Var = new m81(this);
        this.f47999e = m81Var;
        pj0Var6.setAdapter(m81Var);
        this.f47997b.setOnItemClickListener(vx0Var);
        this.f47997b.setOnItemLongClickListener(li0Var);
        this.f47997b.setOnScrollListener(new b21(this, 4));
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.f48002r = jyVar;
        jyVar.setShowAtCenter(true);
        this.f48002r.setText(org.telegram.messenger.id.M0(2131748168, null));
        this.f48002r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ha.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f47996a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48003s = frameLayout2;
        frameLayout2.addView(this.f47997b);
        this.f48003s.addView(this.f48002r);
        this.f48003s.setVisibility(8);
        frameLayout.addView(this.f48003s);
        this.d.f();
        this.E = 0.0f;
        org.telegram.messenger.g0.i3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.k6.f27852d6;
        org.telegram.ui.ActionBar.r6.i(i7, view, null);
        sq0 sq0Var = new sq0(context, 11);
        this.f48001n = sq0Var;
        sq0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f47998c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        this.f47998c.setGravity(17);
        this.f47998c.setTextSize(1, 14.0f);
        this.f47998c.setTypeface(org.telegram.messenger.g0.o());
        this.f47998c.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        frameLayout.addView(this.f48001n, c8.ha.e(-1, 64, 80));
        org.telegram.ui.ActionBar.r6.i(i7, this.f48001n, null);
        this.f48001n.addView(this.f47998c, c8.ha.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f48001n.setVisibility(8);
        this.f47998c.setOnClickListener(new my0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i7 = org.telegram.ui.ActionBar.k6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47996a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47996a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f27962j7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47996a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f27982k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47996a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47997b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47997b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47997b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47997b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48002r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27835c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47998c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47998c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Z();
            a0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
