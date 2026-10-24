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
public final class ld1 extends org.telegram.ui.ActionBar.o2 {
    public float E;
    public RadialProgressView F;
    public int G;
    public final int H;
    public final z5 I;
    public final i11 J;
    public final rp0 K;
    public PorterDuffColorFilter L;
    public int M;
    public int N;
    public boolean O;
    public org.telegram.ui.Components.lm0 f39202a;
    public org.telegram.ui.Components.lm0 f39203b;
    public TextView f39204c;
    public id1 d;
    public kd1 e;
    public final ArrayList f39205f;
    public final ArrayList h;
    public m41 f39206n;
    public org.telegram.ui.Components.tz f39207r;
    public FrameLayout f39208s;
    public int v;
    public final HashSet f39209w;
    public org.telegram.ui.Cells.oa f39210x;
    public ValueAnimator f39211y;

    public ld1(int i10) {
        super(null);
        this.f39205f = new ArrayList();
        this.h = new ArrayList();
        this.f39209w = new HashSet();
        this.H = AndroidUtilities.dp(64.0f);
        this.I = new z5(this, 15);
        this.J = new i11(this, 9);
        this.K = new rp0(this, 22);
        this.arguments = org.telegram.ui.Cells.b1.i(i10, "type");
    }

    public final void U() {
        int x02;
        if (this.f39204c != null && ((x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false)) != this.N || this.O != org.telegram.ui.ActionBar.k6.I.q())) {
            this.O = org.telegram.ui.ActionBar.k6.I.q();
            this.N = x02;
            org.telegram.ui.ActionBar.k6.E1(this.f39204c.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.E1(this.f39204c.getBackground(), org.telegram.ui.ActionBar.a6.b(x02), true);
        }
        RadialProgressView radialProgressView = this.F;
        if (radialProgressView != null) {
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21256h6, false));
        }
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ld1.V():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21405p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21126a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21240g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21350m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        this.G = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 8));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new fd1(this);
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f39202a = lm0Var;
        lm0Var.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.lm0 lm0Var2 = this.f39202a;
        id1 id1Var = new id1(this);
        this.d = id1Var;
        lm0Var2.setAdapter(id1Var);
        this.f39202a.setClipToPadding(false);
        org.telegram.ui.Components.lm0 lm0Var3 = this.f39202a;
        i11 i11Var = this.J;
        lm0Var3.setOnItemClickListener(i11Var);
        org.telegram.ui.Components.lm0 lm0Var4 = this.f39202a;
        rp0 rp0Var = this.K;
        lm0Var4.setOnItemLongClickListener(rp0Var);
        org.telegram.ui.Components.lm0 lm0Var5 = new org.telegram.ui.Components.lm0(context, null);
        this.f39203b = lm0Var5;
        lm0Var5.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.lm0 lm0Var6 = this.f39203b;
        kd1 kd1Var = new kd1(this);
        this.e = kd1Var;
        lm0Var6.setAdapter(kd1Var);
        this.f39203b.setOnItemClickListener(i11Var);
        this.f39203b.setOnItemLongClickListener(rp0Var);
        this.f39203b.setOnScrollListener(new gd1(this, 0));
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f39207r = tzVar;
        tzVar.setShowAtCenter(true);
        this.f39207r.setText(LocaleController.getString(R.string.NoResult));
        this.f39207r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.F = radialProgressView;
        frameLayout.addView(radialProgressView, w7.z5.c(-2.0f, -2));
        this.d.E();
        this.F.setVisibility(8);
        frameLayout.addView(this.f39202a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39208s = frameLayout2;
        frameLayout2.addView(this.f39203b);
        this.f39208s.addView(this.f39207r);
        this.f39208s.setVisibility(8);
        frameLayout.addView(this.f39208s);
        this.d.l();
        this.E = 0.0f;
        AndroidUtilities.runOnUIThread(this.I, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new l(this, 23));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i10, view, null);
        m41 m41Var = new m41(context, 5);
        this.f39206n = m41Var;
        m41Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f39204c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
        this.f39204c.setGravity(17);
        this.f39204c.setTextSize(1, 14.0f);
        this.f39204c.setTypeface(AndroidUtilities.bold());
        this.f39204c.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
        frameLayout.addView(this.f39206n, w7.z5.e(-1, 64, 80));
        org.telegram.ui.ActionBar.r6.i(i10, this.f39206n, null);
        this.f39206n.addView(this.f39204c, w7.z5.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f39206n.setVisibility(8);
        this.f39204c.setOnClickListener(new f31(this, 7));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(25, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i10 = org.telegram.ui.ActionBar.k6.f21137ai;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39202a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21274i7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39202a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21292j7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39202a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21312k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39202a, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39203b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39203b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39203b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39203b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39207r, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21166c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39204c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39204c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Qh));
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
