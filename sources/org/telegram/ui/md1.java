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
public final class md1 extends org.telegram.ui.ActionBar.o2 {
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final z5 I;
    public final j11 J;
    public final sp0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.mm0 f39511a;
    public org.telegram.ui.Components.mm0 f39512b;
    public TextView f39513c;
    public jd1 d;
    public ld1 e;
    public final ArrayList f39514f;
    public final ArrayList h;
    public n41 f39515n;
    public org.telegram.ui.Components.vz f39516r;
    public FrameLayout f39517s;
    public int v;
    public final HashSet f39518w;
    public org.telegram.ui.Cells.oa f39519x;
    public ValueAnimator f39520y;

    public md1(int i10) {
        super(null);
        this.f39514f = new ArrayList();
        this.h = new ArrayList();
        this.f39518w = new HashSet();
        this.H = AndroidUtilities.dp(64.0f);
        this.I = new z5(this, 15);
        this.J = new j11(this, 9);
        this.K = new sp0(this, 22);
        this.arguments = org.telegram.ui.Cells.b1.i(i10, "type");
    }

    public final void U() {
        int x02;
        if (this.f39513c != null && ((x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false)) != this.N || this.O != org.telegram.ui.ActionBar.k6.I.q())) {
            this.O = org.telegram.ui.ActionBar.k6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.k6.E1(this.f39513c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.E1(this.f39513c.getBackground(), org.telegram.ui.ActionBar.a6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h6, false));
        }
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.md1.V():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21404p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21571y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21125a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21145b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21239g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21349m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 8));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gd1(this);
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39511a = mm0Var;
        mm0Var.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39511a;
        jd1 jd1Var = new jd1(this);
        this.d = jd1Var;
        mm0Var2.setAdapter(jd1Var);
        this.f39511a.setClipToPadding(false);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f39511a;
        j11 j11Var = this.J;
        mm0Var3.setOnItemClickListener(j11Var);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f39511a;
        sp0 sp0Var = this.K;
        mm0Var4.setOnItemLongClickListener(sp0Var);
        org.telegram.ui.Components.mm0 mm0Var5 = new org.telegram.ui.Components.mm0(context, null);
        this.f39512b = mm0Var5;
        mm0Var5.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var6 = this.f39512b;
        ld1 ld1Var = new ld1(this);
        this.e = ld1Var;
        mm0Var6.setAdapter(ld1Var);
        this.f39512b.setOnItemClickListener(j11Var);
        this.f39512b.setOnItemLongClickListener(sp0Var);
        this.f39512b.setOnScrollListener(new hd1(this, 0));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f39516r = vzVar;
        vzVar.setShowAtCenter(true);
        this.f39516r.setText(LocaleController.getString(R.string.NoResult));
        this.f39516r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, w7.z5.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f39511a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39517s = frameLayout2;
        frameLayout2.addView(this.f39512b);
        this.f39517s.addView(this.f39516r);
        this.f39517s.setVisibility(8);
        frameLayout.addView(this.f39517s);
        this.d.l();
        this.E = 0.0f;
        AndroidUtilities.runOnUIThread(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.r6.i(i10, view, null);
        n41 n41Var = new n41(context, 5);
        this.f39515n = n41Var;
        n41Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f39513c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
        this.f39513c.setGravity(17);
        this.f39513c.setTextSize(1, 14.0f);
        this.f39513c.setTypeface(AndroidUtilities.bold());
        this.f39513c.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
        frameLayout.addView(this.f39515n, w7.z5.e(-1, 64, 80));
        org.telegram.ui.ActionBar.r6.i(i10, this.f39515n, null);
        this.f39515n.addView(this.f39513c, w7.z5.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f39515n.setVisibility(8);
        this.f39513c.setOnClickListener(new g31(this, 7));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(25, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i10 = org.telegram.ui.ActionBar.k6.f21136ai;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39511a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21273i7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39511a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21291j7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39511a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21311k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39511a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39512b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39512b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39512b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39512b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39516r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21165c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39513c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39513c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Qh));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            U();
            V();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
