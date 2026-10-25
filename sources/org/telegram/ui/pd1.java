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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class pd1 extends org.telegram.ui.ActionBar.r2 {
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final y5 I;
    public final m11 J;
    public final hl0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.mm0 f42468a;
    public org.telegram.ui.Components.mm0 f42469b;
    public TextView f42470c;
    public md1 d;
    public od1 e;
    public final ArrayList f42471f;
    public final ArrayList h;
    public o41 f42472n;
    public org.telegram.ui.Components.uz f42473r;
    public FrameLayout f42474s;
    public int v;
    public final HashSet f42475w;
    public org.telegram.ui.Cells.sa f42476x;
    public ValueAnimator f42477y;

    public pd1(int i10) {
        super(null);
        this.f42471f = new ArrayList();
        this.h = new ArrayList();
        this.f42475w = new HashSet();
        this.H = AndroidUtilities.dp(64.0f);
        this.I = new y5(this, 15);
        this.J = new m11(this, 9);
        this.K = new hl0(this, 23);
        this.arguments = org.telegram.ui.Components.b10.g(i10, "type");
    }

    public final void V() {
        int x02;
        if (this.f42470c != null && ((x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false)) != this.N || this.O != org.telegram.ui.ActionBar.y6.I.q())) {
            this.O = org.telegram.ui.ActionBar.y6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.y6.E1(this.f42470c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.y6.E1(this.f42470c.getBackground(), org.telegram.ui.ActionBar.o6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23426h6, false));
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd1.W():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23579p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23746y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23297a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23412g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new p11(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new kd1(this);
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f42468a = mm0Var;
        mm0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f42468a;
        md1 md1Var = new md1(this);
        this.d = md1Var;
        mm0Var2.setAdapter(md1Var);
        this.f42468a.setClipToPadding(false);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f42468a;
        m11 m11Var = this.J;
        mm0Var3.setOnItemClickListener(m11Var);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f42468a;
        hl0 hl0Var = this.K;
        mm0Var4.setOnItemLongClickListener(hl0Var);
        org.telegram.ui.Components.mm0 mm0Var5 = new org.telegram.ui.Components.mm0(context, null);
        this.f42469b = mm0Var5;
        mm0Var5.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var6 = this.f42469b;
        od1 od1Var = new od1(this);
        this.e = od1Var;
        mm0Var6.setAdapter(od1Var);
        this.f42469b.setOnItemClickListener(m11Var);
        this.f42469b.setOnItemLongClickListener(hl0Var);
        this.f42469b.setOnScrollListener(new x81(this, 2));
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f42473r = uzVar;
        uzVar.setShowAtCenter(true);
        this.f42473r.setText(LocaleController.getString(R.string.NoResult));
        this.f42473r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, org.telegram.ui.Components.gb1.g(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f42468a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42474s = frameLayout2;
        frameLayout2.addView(this.f42469b);
        this.f42474s.addView(this.f42473r);
        this.f42474s.setVisibility(8);
        frameLayout.addView(this.f42474s);
        this.d.l();
        this.E = 0.0f;
        AndroidUtilities.runOnUIThread(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.y6.f23354d6;
        org.telegram.ui.ActionBar.f7.i(i10, view, null);
        o41 o41Var = new o41(context, 5);
        this.f42472n = o41Var;
        o41Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f42470c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        this.f42470c.setGravity(17);
        this.f42470c.setTextSize(1, 14.0f);
        this.f42470c.setTypeface(AndroidUtilities.bold());
        this.f42470c.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
        frameLayout.addView(this.f42472n, org.telegram.ui.Components.gb1.i(-1, 64, 80));
        org.telegram.ui.ActionBar.f7.i(i10, this.f42472n, null);
        this.f42472n.addView(this.f42470c, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f42472n.setVisibility(8);
        this.f42470c.setOnClickListener(new t21(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(25, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        int i10 = org.telegram.ui.ActionBar.y6.f23307ai;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42468a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.f23447i7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42468a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.f23464j7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42468a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        int i13 = org.telegram.ui.ActionBar.y6.f23483k7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42468a, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42469b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42469b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42469b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42469b, 4, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42473r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42470c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42470c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Qh));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V();
            W();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
