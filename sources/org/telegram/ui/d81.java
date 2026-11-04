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
public final class d81 extends org.telegram.ui.ActionBar.d2 {
    public ValueAnimator E;
    public float F;
    public RadialProgressView G;
    public int H;
    public final int I;
    public final o4 J;
    public final nx0 K;
    public final ci0 L;
    public PorterDuffColorFilter M;
    public int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.tj0 f44593a;
    public org.telegram.ui.Components.tj0 f44594b;
    public TextView f44595c;
    public a81 d;
    public c81 f44596e;
    public final ArrayList f44597f;
    public final ArrayList h;
    public yg0 f44598n;
    public org.telegram.ui.Components.gy f44599r;
    public FrameLayout f44600s;
    public int f44601w;
    public final HashSet f44602x;
    public org.telegram.ui.Cells.ha f44603y;

    public d81(int i3) {
        super(null);
        this.f44597f = new ArrayList();
        this.h = new ArrayList();
        this.f44602x = new HashSet();
        this.I = org.telegram.messenger.g0.L(64.0f);
        this.J = new o4(this, 16);
        this.K = new nx0(this, 8);
        this.L = new ci0(this, 22);
        this.arguments = org.telegram.ui.Cells.f1.k(i3, "type");
    }

    public final void Z() {
        int x02;
        if (this.f44595c != null && ((x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false)) != this.O || this.P != org.telegram.ui.ActionBar.k6.I.q())) {
            this.P = org.telegram.ui.ActionBar.k6.I.q();
            this.O = x02;
            org.telegram.ui.ActionBar.k6.H1(this.f44595c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(this.f44595c.getBackground(), org.telegram.ui.ActionBar.y5.b(x02), true);
        }
        RadialProgressView radialProgressView = this.G;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d81.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27939g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28046m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        this.H = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748986, null));
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 16));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.I = new y71(this);
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f44593a = tj0Var;
        tj0Var.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f44593a;
        a81 a81Var = new a81(this);
        this.d = a81Var;
        tj0Var2.setAdapter(a81Var);
        this.f44593a.setClipToPadding(false);
        org.telegram.ui.Components.tj0 tj0Var3 = this.f44593a;
        nx0 nx0Var = this.K;
        tj0Var3.setOnItemClickListener(nx0Var);
        org.telegram.ui.Components.tj0 tj0Var4 = this.f44593a;
        ci0 ci0Var = this.L;
        tj0Var4.setOnItemLongClickListener(ci0Var);
        org.telegram.ui.Components.tj0 tj0Var5 = new org.telegram.ui.Components.tj0(context, null);
        this.f44594b = tj0Var5;
        tj0Var5.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var6 = this.f44594b;
        c81 c81Var = new c81(this);
        this.f44596e = c81Var;
        tj0Var6.setAdapter(c81Var);
        this.f44594b.setOnItemClickListener(nx0Var);
        this.f44594b.setOnItemLongClickListener(ci0Var);
        this.f44594b.setOnScrollListener(new r11(this, 4));
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f44599r = gyVar;
        gyVar.setShowAtCenter(true);
        this.f44599r.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.f44599r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.G = radialProgressView;
        frameLayout.addView(radialProgressView, b8.mf.c(-2.0f, -2));
        this.d.E();
        this.G.setVisibility(8);
        frameLayout.addView(this.f44593a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44600s = frameLayout2;
        frameLayout2.addView(this.f44594b);
        this.f44600s.addView(this.f44599r);
        this.f44600s.setVisibility(8);
        frameLayout.addView(this.f44600s);
        this.d.f();
        this.F = 0.0f;
        org.telegram.messenger.g0.i3(this.J, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i3, view, null);
        yg0 yg0Var = new yg0(context, 13);
        this.f44598n = yg0Var;
        yg0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f44595c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        this.f44595c.setGravity(17);
        this.f44595c.setTextSize(1, 14.0f);
        this.f44595c.setTypeface(org.telegram.messenger.g0.o());
        this.f44595c.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        frameLayout.addView(this.f44598n, b8.mf.e(-1, 64, 80));
        org.telegram.ui.ActionBar.r6.i(i3, this.f44598n, null);
        this.f44598n.addView(this.f44595c, b8.mf.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f44598n.setVisibility(8);
        this.f44595c.setOnClickListener(new cy0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i3 = org.telegram.ui.ActionBar.k6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44593a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.f27973i7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44593a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f27990j7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44593a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f28008k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44593a, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44594b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44594b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44594b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44594b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44599r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44595c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44595c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Ei));
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
