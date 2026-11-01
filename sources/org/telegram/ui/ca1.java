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
public final class ca1 extends org.telegram.ui.ActionBar.k2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final jz0 J;
    public final rj0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.uk0 f36270a;
    public org.telegram.ui.Components.uk0 f36271b;
    public TextView f36272c;
    public z91 d;
    public ba1 e;
    public final ArrayList f36273f;
    public final ArrayList h;
    public bg0 f36274n;
    public org.telegram.ui.Components.xy f36275r;
    public FrameLayout f36276s;
    public int f36277w;
    public final HashSet f36278x;
    public org.telegram.ui.Cells.ha f36279y;

    public ca1(int i10) {
        super(null);
        this.f36273f = new ArrayList();
        this.h = new ArrayList();
        this.f36278x = new HashSet();
        this.H = org.telegram.messenger.i0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new jz0(this, 8);
        this.K = new rj0(this, 22);
        this.arguments = org.telegram.ui.Cells.f1.i(i10, "type");
    }

    public final void Z() {
        int x02;
        if (this.f36272c != null && ((x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.t6.I.q())) {
            this.O = org.telegram.ui.ActionBar.t6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.t6.H1(this.f36272c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.t6.H1(this.f36272c.getBackground(), org.telegram.ui.ActionBar.j6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ca1.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20989g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21099m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748988, null));
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 6));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new x91(this);
        a2.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        a2.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f36270a = uk0Var;
        uk0Var.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f36270a;
        z91 z91Var = new z91(this);
        this.d = z91Var;
        uk0Var2.setAdapter(z91Var);
        this.f36270a.setClipToPadding(false);
        org.telegram.ui.Components.uk0 uk0Var3 = this.f36270a;
        jz0 jz0Var = this.J;
        uk0Var3.setOnItemClickListener(jz0Var);
        org.telegram.ui.Components.uk0 uk0Var4 = this.f36270a;
        rj0 rj0Var = this.K;
        uk0Var4.setOnItemLongClickListener(rj0Var);
        org.telegram.ui.Components.uk0 uk0Var5 = new org.telegram.ui.Components.uk0(context, null);
        this.f36271b = uk0Var5;
        uk0Var5.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var6 = this.f36271b;
        ba1 ba1Var = new ba1(this);
        this.e = ba1Var;
        uk0Var6.setAdapter(ba1Var);
        this.f36271b.setOnItemClickListener(jz0Var);
        this.f36271b.setOnItemLongClickListener(rj0Var);
        this.f36271b.setOnScrollListener(new u41(this, 3));
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f36275r = xyVar;
        xyVar.setShowAtCenter(true);
        this.f36275r.setText(org.telegram.messenger.dd.L0(2131748183, null));
        this.f36275r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, w7.b6.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f36270a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36276s = frameLayout2;
        frameLayout2.addView(this.f36271b);
        this.f36276s.addView(this.f36275r);
        this.f36276s.setVisibility(8);
        frameLayout.addView(this.f36276s);
        this.d.f();
        this.E = 0.0f;
        org.telegram.messenger.i0.h3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new k(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i10, view, null);
        bg0 bg0Var = new bg0(context, 14);
        this.f36274n = bg0Var;
        bg0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f36272c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        this.f36272c.setGravity(17);
        this.f36272c.setTextSize(1, 14.0f);
        this.f36272c.setTypeface(org.telegram.messenger.i0.o());
        this.f36272c.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
        frameLayout.addView(this.f36274n, w7.b6.e(-1, 64, 80));
        org.telegram.ui.ActionBar.a7.i(i10, this.f36274n, null);
        this.f36274n.addView(this.f36272c, w7.b6.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f36274n.setVisibility(8);
        this.f36272c.setOnClickListener(new zz0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        int i10 = org.telegram.ui.ActionBar.t6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36270a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.f21022i7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36270a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.f21040j7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36270a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        int i13 = org.telegram.ui.ActionBar.t6.f21060k7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36270a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36271b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36271b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36271b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36271b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36275r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36272c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36272c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ei));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Z();
            a0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
