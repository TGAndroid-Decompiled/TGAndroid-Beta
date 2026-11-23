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
public final class n81 extends org.telegram.ui.ActionBar.g2 {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final m4 J;
    public final xx0 K;
    public final oi0 L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.ek0 f50261a;
    public org.telegram.ui.Components.ek0 f50262b;
    public TextView f50263c;
    public k81 d;
    public m81 f50264e;
    public final ArrayList f50265f;
    public final ArrayList h;
    public gh0 f50266n;
    public org.telegram.ui.Components.sy f50267r;
    public FrameLayout f50268s;
    public int f50269w;
    public final HashSet f50270x;
    public org.telegram.ui.Cells.ka f50271y;

    public n81(int i7) {
        super(null);
        this.f50265f = new ArrayList();
        this.h = new ArrayList();
        this.f50270x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new m4(this, 16);
        this.K = new xx0(this, 8);
        this.L = new oi0(this, 21);
        this.arguments = p5.c.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f50263c != null && ((x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false)) != this.O || this.P != org.telegram.ui.ActionBar.n6.I.q())) {
            this.P = org.telegram.ui.ActionBar.n6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.n6.H1(this.f50263c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.n6.H1(this.f50263c.getBackground(), org.telegram.ui.ActionBar.b6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29525h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29672p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29509g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29619m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748785, null));
        this.actionBar.setActionBarMenuOnItemClick(new gs0(this, 18));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232491);
        a10.O();
        a10.I = new i81(this);
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f50261a = ek0Var;
        ek0Var.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f50261a;
        k81 k81Var = new k81(this);
        this.d = k81Var;
        ek0Var2.setAdapter(k81Var);
        this.f50261a.setClipToPadding(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f50261a;
        xx0 xx0Var = this.K;
        ek0Var3.setOnItemClickListener(xx0Var);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f50261a;
        oi0 oi0Var = this.L;
        ek0Var4.setOnItemLongClickListener(oi0Var);
        org.telegram.ui.Components.ek0 ek0Var5 = new org.telegram.ui.Components.ek0(context, null);
        this.f50262b = ek0Var5;
        ek0Var5.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var6 = this.f50262b;
        m81 m81Var = new m81(this);
        this.f50264e = m81Var;
        ek0Var6.setAdapter(m81Var);
        this.f50262b.setOnItemClickListener(xx0Var);
        this.f50262b.setOnItemLongClickListener(oi0Var);
        this.f50262b.setOnScrollListener(new b21(this, 4));
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.f50267r = syVar;
        syVar.setShowAtCenter(true);
        this.f50267r.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.f50267r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, c8.na.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.f50261a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50268s = frameLayout2;
        frameLayout2.addView(this.f50262b);
        this.f50268s.addView(this.f50267r);
        this.f50268s.setVisibility(8);
        frameLayout.addView(this.f50268s);
        this.d.f();
        this.F = 0.0f;
        org.telegram.messenger.g0.h3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.u6.h(i7, view, null);
        gh0 gh0Var = new gh0(context, 13);
        this.f50266n = gh0Var;
        gh0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f50263c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        this.f50263c.setGravity(17);
        this.f50263c.setTextSize(1, 14.0f);
        this.f50263c.setTypeface(org.telegram.messenger.g0.o());
        this.f50263c.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
        frameLayout.addView(this.f50266n, c8.na.e(-1, 64, 80));
        org.telegram.ui.ActionBar.u6.h(i7, this.f50266n, null);
        this.f50266n.addView(this.f50263c, c8.na.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f50266n.setVisibility(8);
        this.f50263c.setOnClickListener(new ny0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        int i7 = org.telegram.ui.ActionBar.n6.Ri;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50261a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50261a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.f29561j7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50261a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.f29581k7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50261a, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50262b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50262b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50262b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50262b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50267r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50263c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50263c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.Hi));
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
