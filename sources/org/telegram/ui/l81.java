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
public final class l81 extends org.telegram.ui.ActionBar.e2 {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final m4 J;
    public final ux0 K;
    public final ni0 L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.uj0 f48895a;
    public org.telegram.ui.Components.uj0 f48896b;
    public TextView f48897c;
    public i81 d;
    public k81 f48898e;
    public final ArrayList f48899f;
    public final ArrayList h;
    public eh0 f48900n;
    public org.telegram.ui.Components.ny f48901r;
    public FrameLayout f48902s;
    public int f48903w;
    public final HashSet f48904x;
    public org.telegram.ui.Cells.ha f48905y;

    public l81(int i7) {
        super(null);
        this.f48899f = new ArrayList();
        this.h = new ArrayList();
        this.f48904x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new m4(this, 16);
        this.K = new ux0(this, 8);
        this.L = new ni0(this, 21);
        this.arguments = r.b.f(i7, "type");
    }

    public final void Z() {
        int x02;
        if (this.f48897c != null && ((x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false)) != this.O || this.P != org.telegram.ui.ActionBar.j6.I.q())) {
            this.P = org.telegram.ui.ActionBar.j6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.j6.H1(this.f48897c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.j6.H1(this.f48897c.getBackground(), org.telegram.ui.ActionBar.y5.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28923h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29070p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28907g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29017m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748978, null));
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 16));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232487);
        a10.O();
        a10.I = new g81(this);
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f48895a = uj0Var;
        uj0Var.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.f48895a;
        i81 i81Var = new i81(this);
        this.d = i81Var;
        uj0Var2.setAdapter(i81Var);
        this.f48895a.setClipToPadding(false);
        org.telegram.ui.Components.uj0 uj0Var3 = this.f48895a;
        ux0 ux0Var = this.K;
        uj0Var3.setOnItemClickListener(ux0Var);
        org.telegram.ui.Components.uj0 uj0Var4 = this.f48895a;
        ni0 ni0Var = this.L;
        uj0Var4.setOnItemLongClickListener(ni0Var);
        org.telegram.ui.Components.uj0 uj0Var5 = new org.telegram.ui.Components.uj0(context, null);
        this.f48896b = uj0Var5;
        uj0Var5.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var6 = this.f48896b;
        k81 k81Var = new k81(this);
        this.f48898e = k81Var;
        uj0Var6.setAdapter(k81Var);
        this.f48896b.setOnItemClickListener(ux0Var);
        this.f48896b.setOnItemLongClickListener(ni0Var);
        this.f48896b.setOnScrollListener(new y11(this, 4));
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.f48901r = nyVar;
        nyVar.setShowAtCenter(true);
        this.f48901r.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.f48901r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, c8.ja.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.f48895a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48902s = frameLayout2;
        frameLayout2.addView(this.f48896b);
        this.f48902s.addView(this.f48901r);
        this.f48902s.setVisibility(8);
        frameLayout.addView(this.f48902s);
        this.d.f();
        this.F = 0.0f;
        org.telegram.messenger.g0.i3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 22));
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i7, view, null);
        eh0 eh0Var = new eh0(context, 13);
        this.f48900n = eh0Var;
        eh0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f48897c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        this.f48897c.setGravity(17);
        this.f48897c.setTextSize(1, 14.0f);
        this.f48897c.setTypeface(org.telegram.messenger.g0.o());
        this.f48897c.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
        frameLayout.addView(this.f48900n, c8.ja.e(-1, 64, 80));
        org.telegram.ui.ActionBar.q6.h(i7, this.f48900n, null);
        this.f48900n.addView(this.f48897c, c8.ja.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f48900n.setVisibility(8);
        this.f48897c.setOnClickListener(new ky0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D8));
        int i7 = org.telegram.ui.ActionBar.j6.Ri;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48895a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        int i10 = org.telegram.ui.ActionBar.j6.i7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48895a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f28959j7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48895a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f28979k7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48895a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48896b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48896b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48896b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48896b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48901r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48897c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f48897c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.Hi));
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
