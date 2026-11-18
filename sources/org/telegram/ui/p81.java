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
public final class p81 extends org.telegram.ui.ActionBar.h2 {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final m4 J;
    public final zx0 K;
    public final qi0 L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.ck0 f50815a;
    public org.telegram.ui.Components.ck0 f50816b;
    public TextView f50817c;
    public m81 d;
    public o81 f50818e;
    public final ArrayList f50819f;
    public final ArrayList h;
    public hh0 f50820n;
    public org.telegram.ui.Components.ty f50821r;
    public FrameLayout f50822s;
    public int f50823w;
    public final HashSet f50824x;
    public org.telegram.ui.Cells.ia f50825y;

    public p81(int i7) {
        super(null);
        this.f50819f = new ArrayList();
        this.h = new ArrayList();
        this.f50824x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new m4(this, 16);
        this.K = new zx0(this, 8);
        this.L = new qi0(this, 21);
        this.arguments = p5.c.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f50817c != null && ((x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false)) != this.O || this.P != org.telegram.ui.ActionBar.n6.I.q())) {
            this.P = org.telegram.ui.ActionBar.n6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.n6.H1(this.f50817c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.n6.H1(this.f50817c.getBackground(), org.telegram.ui.ActionBar.b6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29470h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29617p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29339a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29454g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29564m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748786, null));
        this.actionBar.setActionBarMenuOnItemClick(new hs0(this, 18));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, 2131232488);
        a10.O();
        a10.I = new k81(this);
        a10.setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f50815a = ck0Var;
        ck0Var.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.f50815a;
        m81 m81Var = new m81(this);
        this.d = m81Var;
        ck0Var2.setAdapter(m81Var);
        this.f50815a.setClipToPadding(false);
        org.telegram.ui.Components.ck0 ck0Var3 = this.f50815a;
        zx0 zx0Var = this.K;
        ck0Var3.setOnItemClickListener(zx0Var);
        org.telegram.ui.Components.ck0 ck0Var4 = this.f50815a;
        qi0 qi0Var = this.L;
        ck0Var4.setOnItemLongClickListener(qi0Var);
        org.telegram.ui.Components.ck0 ck0Var5 = new org.telegram.ui.Components.ck0(context, null);
        this.f50816b = ck0Var5;
        ck0Var5.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var6 = this.f50816b;
        o81 o81Var = new o81(this);
        this.f50818e = o81Var;
        ck0Var6.setAdapter(o81Var);
        this.f50816b.setOnItemClickListener(zx0Var);
        this.f50816b.setOnItemLongClickListener(qi0Var);
        this.f50816b.setOnScrollListener(new c21(this, 4));
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.f50821r = tyVar;
        tyVar.setShowAtCenter(true);
        this.f50821r.setText(org.telegram.messenger.gd.M0(2131747975, null));
        this.f50821r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ma.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.f50815a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50822s = frameLayout2;
        frameLayout2.addView(this.f50816b);
        this.f50822s.addView(this.f50821r);
        this.f50822s.setVisibility(8);
        frameLayout.addView(this.f50822s);
        this.d.f();
        this.F = 0.0f;
        org.telegram.messenger.g0.h3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.u6.h(i7, view, null);
        hh0 hh0Var = new hh0(context, 13);
        this.f50820n = hh0Var;
        hh0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f50817c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        this.f50817c.setGravity(17);
        this.f50817c.setTextSize(1, 14.0f);
        this.f50817c.setTypeface(org.telegram.messenger.g0.o());
        this.f50817c.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
        frameLayout.addView(this.f50820n, c8.ma.e(-1, 64, 80));
        org.telegram.ui.ActionBar.u6.h(i7, this.f50820n, null);
        this.f50820n.addView(this.f50817c, c8.ma.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f50820n.setVisibility(8);
        this.f50817c.setOnClickListener(new oy0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        int i7 = org.telegram.ui.ActionBar.n6.Ri;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50815a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50815a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.f29506j7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50815a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.f29526k7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50815a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50816b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50816b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50816b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50816b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50821r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29379c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50817c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50817c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.Hi));
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
