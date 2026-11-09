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
public final class o81 extends org.telegram.ui.ActionBar.f2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final zx0 J;
    public final ni0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.qj0 f48399a;
    public org.telegram.ui.Components.qj0 f48400b;
    public TextView f48401c;
    public l81 d;
    public n81 f48402e;
    public final ArrayList f48403f;
    public final ArrayList h;
    public uq0 f48404n;
    public org.telegram.ui.Components.jy f48405r;
    public FrameLayout f48406s;
    public int f48407w;
    public final HashSet f48408x;
    public org.telegram.ui.Cells.ha f48409y;

    public o81(int i7) {
        super(null);
        this.f48403f = new ArrayList();
        this.h = new ArrayList();
        this.f48408x = new HashSet();
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new zx0(this, 8);
        this.K = new ni0(this, 21);
        this.arguments = rf.b.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f48401c != null && ((x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.l6.I.q())) {
            this.O = org.telegram.ui.ActionBar.l6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.l6.H1(this.f48401c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.l6.H1(this.f48401c.getBackground(), org.telegram.ui.ActionBar.a6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27939h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28086p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27809a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27923g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28033m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748978, null));
        this.actionBar.setActionBarMenuOnItemClick(new pt0(this, 15));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.r().a(0, 2131232486);
        a10.N();
        a10.H = new j81(this);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f48399a = qj0Var;
        qj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var2 = this.f48399a;
        l81 l81Var = new l81(this);
        this.d = l81Var;
        qj0Var2.setAdapter(l81Var);
        this.f48399a.setClipToPadding(false);
        org.telegram.ui.Components.qj0 qj0Var3 = this.f48399a;
        zx0 zx0Var = this.J;
        qj0Var3.setOnItemClickListener(zx0Var);
        org.telegram.ui.Components.qj0 qj0Var4 = this.f48399a;
        ni0 ni0Var = this.K;
        qj0Var4.setOnItemLongClickListener(ni0Var);
        org.telegram.ui.Components.qj0 qj0Var5 = new org.telegram.ui.Components.qj0(context, null);
        this.f48400b = qj0Var5;
        qj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var6 = this.f48400b;
        n81 n81Var = new n81(this);
        this.f48402e = n81Var;
        qj0Var6.setAdapter(n81Var);
        this.f48400b.setOnItemClickListener(zx0Var);
        this.f48400b.setOnItemLongClickListener(ni0Var);
        this.f48400b.setOnScrollListener(new d21(this, 4));
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.f48405r = jyVar;
        jyVar.setShowAtCenter(true);
        this.f48405r.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.f48405r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ha.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f48399a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48406s = frameLayout2;
        frameLayout2.addView(this.f48400b);
        this.f48406s.addView(this.f48405r);
        this.f48406s.setVisibility(8);
        frameLayout.addView(this.f48406s);
        this.d.f();
        this.E = 0.0f;
        org.telegram.messenger.g0.i3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.s6.h(i7, view, null);
        uq0 uq0Var = new uq0(context, 11);
        this.f48404n = uq0Var;
        uq0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f48401c = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
        this.f48401c.setGravity(17);
        this.f48401c.setTextSize(1, 14.0f);
        this.f48401c.setTypeface(org.telegram.messenger.g0.o());
        this.f48401c.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 4.0f));
        frameLayout.addView(this.f48404n, c8.ha.e(-1, 64, 80));
        org.telegram.ui.ActionBar.s6.h(i7, this.f48404n, null);
        this.f48404n.addView(this.f48401c, c8.ha.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f48404n.setVisibility(8);
        this.f48401c.setOnClickListener(new py0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D8));
        int i7 = org.telegram.ui.ActionBar.l6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48399a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        int i10 = org.telegram.ui.ActionBar.l6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48399a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        int i11 = org.telegram.ui.ActionBar.l6.f27975j7;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48399a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        int i12 = org.telegram.ui.ActionBar.l6.f27995k7;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48399a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48400b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48400b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48400b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48400b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48405r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27848c7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48401c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f48401c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.Ei));
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
