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
public final class ea1 extends org.telegram.ui.ActionBar.k2 {
    public ValueAnimator D;
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final m4 I;
    public final kz0 J;
    public final tj0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.tk0 f36999a;
    public org.telegram.ui.Components.tk0 f37000b;
    public TextView f37001c;
    public ba1 d;
    public da1 e;
    public final ArrayList f37002f;
    public final ArrayList h;
    public dg0 f37003n;
    public org.telegram.ui.Components.xy f37004r;
    public FrameLayout f37005s;
    public int f37006w;
    public final HashSet f37007x;
    public org.telegram.ui.Cells.ha f37008y;

    public ea1(int i10) {
        super(null);
        this.f37002f = new ArrayList();
        this.h = new ArrayList();
        this.f37007x = new HashSet();
        this.H = org.telegram.messenger.i0.L(64.0f);
        this.I = new m4(this, 16);
        this.J = new kz0(this, 8);
        this.K = new tj0(this, 22);
        this.arguments = org.telegram.ui.Cells.f1.i(i10, "type");
    }

    public final void Y() {
        int x02;
        if (this.f37001c != null && ((x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false)) != this.N || this.O != org.telegram.ui.ActionBar.t6.I.q())) {
            this.O = org.telegram.ui.ActionBar.t6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.t6.H1(this.f37001c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.t6.H1(this.f37001c.getBackground(), org.telegram.ui.ActionBar.j6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ea1.Z():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ei));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20872a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20988g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21098m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748988, null));
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 6));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new z91(this);
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f36999a = tk0Var;
        tk0Var.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.f36999a;
        ba1 ba1Var = new ba1(this);
        this.d = ba1Var;
        tk0Var2.setAdapter(ba1Var);
        this.f36999a.setClipToPadding(false);
        org.telegram.ui.Components.tk0 tk0Var3 = this.f36999a;
        kz0 kz0Var = this.J;
        tk0Var3.setOnItemClickListener(kz0Var);
        org.telegram.ui.Components.tk0 tk0Var4 = this.f36999a;
        tj0 tj0Var = this.K;
        tk0Var4.setOnItemLongClickListener(tj0Var);
        org.telegram.ui.Components.tk0 tk0Var5 = new org.telegram.ui.Components.tk0(context, null);
        this.f37000b = tk0Var5;
        tk0Var5.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var6 = this.f37000b;
        da1 da1Var = new da1(this);
        this.e = da1Var;
        tk0Var6.setAdapter(da1Var);
        this.f37000b.setOnItemClickListener(kz0Var);
        this.f37000b.setOnItemLongClickListener(tj0Var);
        this.f37000b.setOnScrollListener(new w41(this, 3));
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f37004r = xyVar;
        xyVar.setShowAtCenter(true);
        this.f37004r.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.f37004r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, w7.b6.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f36999a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f37005s = frameLayout2;
        frameLayout2.addView(this.f37000b);
        this.f37005s.addView(this.f37004r);
        this.f37005s.setVisibility(8);
        frameLayout.addView(this.f37005s);
        this.d.f();
        this.E = 0.0f;
        org.telegram.messenger.i0.h3(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new k(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.a7.i(i10, view, null);
        dg0 dg0Var = new dg0(context, 14);
        this.f37003n = dg0Var;
        dg0Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f37001c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        this.f37001c.setGravity(17);
        this.f37001c.setTextSize(1, 14.0f);
        this.f37001c.setTypeface(org.telegram.messenger.i0.o());
        this.f37001c.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
        frameLayout.addView(this.f37003n, w7.b6.e(-1, 64, 80));
        org.telegram.ui.ActionBar.a7.i(i10, this.f37003n, null);
        this.f37003n.addView(this.f37001c, w7.b6.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f37003n.setVisibility(8);
        this.f37001c.setOnClickListener(new a01(this, 10));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(24, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        int i10 = org.telegram.ui.ActionBar.t6.Oi;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36999a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.f21021i7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36999a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.f21039j7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36999a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        int i13 = org.telegram.ui.ActionBar.t6.f21059k7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36999a, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37000b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37000b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37000b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37000b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37004r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37001c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ci));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37001c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ei));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Y();
            Z();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
