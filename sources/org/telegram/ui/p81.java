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
public final class p81 extends org.telegram.ui.ActionBar.f2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final ay0 J;
    public final oi0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.pj0 f48714a;
    public org.telegram.ui.Components.pj0 f48715b;
    public TextView f48716c;
    public m81 d;
    public o81 f48717e;
    public final ArrayList f48718f;
    public final ArrayList h;
    public vq0 f48719n;
    public org.telegram.ui.Components.iy f48720r;
    public FrameLayout f48721s;
    public int f48722w;
    public final HashSet f48723x;
    public org.telegram.ui.Cells.ha f48724y;

    public p81(int i7) {
        super(null);
        this.f48718f = new ArrayList();
        this.h = new ArrayList();
        this.f48723x = new HashSet();
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new ay0(this, 8);
        this.K = new oi0(this, 21);
        this.arguments = rf.b.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f48716c != null && ((x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.m6.I.q())) {
            this.O = org.telegram.ui.ActionBar.m6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.m6.H1(this.f48716c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.m6.H1(this.f48716c.getBackground(), org.telegram.ui.ActionBar.b6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27964h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28111p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27834a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27948g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28058m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748978, null));
        this.actionBar.setActionBarMenuOnItemClick(new qt0(this, 15));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, 2131232486);
        a10.N();
        a10.H = new k81(this);
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f48714a = pj0Var;
        pj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f48714a;
        m81 m81Var = new m81(this);
        this.d = m81Var;
        pj0Var2.setAdapter(m81Var);
        this.f48714a.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f48714a;
        ay0 ay0Var = this.J;
        pj0Var3.setOnItemClickListener(ay0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f48714a;
        oi0 oi0Var = this.K;
        pj0Var4.setOnItemLongClickListener(oi0Var);
        org.telegram.ui.Components.pj0 pj0Var5 = new org.telegram.ui.Components.pj0(context, null);
        this.f48715b = pj0Var5;
        pj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var6 = this.f48715b;
        o81 o81Var = new o81(this);
        this.f48717e = o81Var;
        pj0Var6.setAdapter(o81Var);
        this.f48715b.setOnItemClickListener(ay0Var);
        this.f48715b.setOnItemLongClickListener(oi0Var);
        this.f48715b.setOnScrollListener(new e21(this, 4));
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f48720r = iyVar;
        iyVar.setShowAtCenter(true);
        this.f48720r.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.f48720r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ha.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f48714a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48721s = frameLayout2;
        frameLayout2.addView(this.f48715b);
        this.f48721s.addView(this.f48720r);
        this.f48721s.setVisibility(8);
        frameLayout.addView(this.f48721s);
        this.d.f();
        this.E = 0.0f;
        org.telegram.messenger.g0.i3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.t6.h(i7, view, null);
        vq0 vq0Var = new vq0(context, 11);
        this.f48719n = vq0Var;
        vq0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f48716c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
        this.f48716c.setGravity(17);
        this.f48716c.setTextSize(1, 14.0f);
        this.f48716c.setTypeface(org.telegram.messenger.g0.o());
        this.f48716c.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
        frameLayout.addView(this.f48719n, c8.ha.e(-1, 64, 80));
        org.telegram.ui.ActionBar.t6.h(i7, this.f48719n, null);
        this.f48719n.addView(this.f48716c, c8.ha.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f48719n.setVisibility(8);
        this.f48716c.setOnClickListener(new qy0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        int i7 = org.telegram.ui.ActionBar.m6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48714a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48714a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.f28000j7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48714a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        int i12 = org.telegram.ui.ActionBar.m6.f28020k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48714a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48715b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48715b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48715b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48715b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48720r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48716c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48716c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Ei));
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
