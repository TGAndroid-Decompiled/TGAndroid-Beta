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
public final class p81 extends org.telegram.ui.ActionBar.g2 {
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
    public org.telegram.ui.Components.ek0 f50782a;
    public org.telegram.ui.Components.ek0 f50783b;
    public TextView f50784c;
    public m81 d;
    public o81 f50785e;
    public final ArrayList f50786f;
    public final ArrayList h;
    public ih0 f50787n;
    public org.telegram.ui.Components.vy f50788r;
    public FrameLayout f50789s;
    public int f50790w;
    public final HashSet f50791x;
    public org.telegram.ui.Cells.ja f50792y;

    public p81(int i7) {
        super(null);
        this.f50786f = new ArrayList();
        this.h = new ArrayList();
        this.f50791x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new m4(this, 16);
        this.K = new zx0(this, 8);
        this.L = new qi0(this, 21);
        this.arguments = p5.c.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f50784c != null && ((x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false)) != this.O || this.P != org.telegram.ui.ActionBar.m6.I.q())) {
            this.P = org.telegram.ui.ActionBar.m6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.m6.H1(this.f50784c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.m6.H1(this.f50784c.getBackground(), org.telegram.ui.ActionBar.a6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29421h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29568p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29739y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29290a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29405g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29515m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748785, null));
        this.actionBar.setActionBarMenuOnItemClick(new is0(this, 18));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232488);
        a10.O();
        a10.I = new k81(this);
        a10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        a10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f50782a = ek0Var;
        ek0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f50782a;
        m81 m81Var = new m81(this);
        this.d = m81Var;
        ek0Var2.setAdapter(m81Var);
        this.f50782a.setClipToPadding(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f50782a;
        zx0 zx0Var = this.K;
        ek0Var3.setOnItemClickListener(zx0Var);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f50782a;
        qi0 qi0Var = this.L;
        ek0Var4.setOnItemLongClickListener(qi0Var);
        org.telegram.ui.Components.ek0 ek0Var5 = new org.telegram.ui.Components.ek0(context, null);
        this.f50783b = ek0Var5;
        ek0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.ek0 ek0Var6 = this.f50783b;
        o81 o81Var = new o81(this);
        this.f50785e = o81Var;
        ek0Var6.setAdapter(o81Var);
        this.f50783b.setOnItemClickListener(zx0Var);
        this.f50783b.setOnItemLongClickListener(qi0Var);
        this.f50783b.setOnScrollListener(new c21(this, 4));
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.f50788r = vyVar;
        vyVar.setShowAtCenter(true);
        this.f50788r.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.f50788r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, c8.na.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.f50782a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50789s = frameLayout2;
        frameLayout2.addView(this.f50783b);
        this.f50789s.addView(this.f50788r);
        this.f50789s.setVisibility(8);
        frameLayout.addView(this.f50789s);
        this.d.f();
        this.F = 0.0f;
        org.telegram.messenger.g0.h3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.t6.h(i7, view, null);
        ih0 ih0Var = new ih0(context, 13);
        this.f50787n = ih0Var;
        ih0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f50784c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
        this.f50784c.setGravity(17);
        this.f50784c.setTextSize(1, 14.0f);
        this.f50784c.setTypeface(org.telegram.messenger.g0.o());
        this.f50784c.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
        frameLayout.addView(this.f50787n, c8.na.e(-1, 64, 80));
        org.telegram.ui.ActionBar.t6.h(i7, this.f50787n, null);
        this.f50787n.addView(this.f50784c, c8.na.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f50787n.setVisibility(8);
        this.f50784c.setOnClickListener(new oy0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        int i7 = org.telegram.ui.ActionBar.m6.Ri;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50782a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50782a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.f29457j7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50782a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        int i12 = org.telegram.ui.ActionBar.m6.f29477k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50782a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50783b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50783b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50783b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50783b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50788r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29330c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50784c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50784c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.Hi));
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
