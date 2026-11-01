package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class n90 extends org.telegram.ui.ActionBar.k2 implements tt0, fg.b, org.telegram.messenger.vs {
    public boolean D;
    public boolean E;
    public int F;
    public org.telegram.ui.ActionBar.b1 G;
    public org.telegram.ui.ActionBar.b1 H;
    public org.telegram.ui.ActionBar.b1 I;
    public org.telegram.ui.qf0 J;
    public final gh.b[] K;
    public int L;
    public FrameLayout M;
    public vh.d N;
    public fe.b O;
    public View P;
    public ag.j0 Q;
    public m90 R;
    public int S;
    public String T;
    public int U;
    public int f28748a;
    public st0 f28749b;
    public TLRPC.ChatFull f28750c;
    public TLRPC.UserFull d;
    public long e;
    public long f28751f;
    public String h;
    public String f28752n;
    public int f28753r;
    public org.telegram.ui.ActionBar.p5 f28754s;
    public SparseArray f28755w;
    public org.telegram.ui.ActionBar.b1 f28756x;
    public org.telegram.ui.ActionBar.b1 f28757y;

    public n90(Bundle bundle, st0 st0Var) {
        super(bundle);
        this.D = true;
        this.E = true;
        this.F = -12;
        this.K = new gh.b[2];
        this.L = -1;
        this.f28749b = st0Var;
    }

    public static int a0(n90 n90Var) {
        return n90Var.classGuid;
    }

    @Override
    public final List G() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.s5 s5Var = ig.k1.f8344m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new fg.a(str.concat(" shape detector learning debug"), new j90(this, 1)));
    }

    @Override
    public final void R() {
        st0 st0Var;
        m90 m90Var = this.R;
        if (m90Var != null && (st0Var = this.f28749b) != null) {
            m90Var.setNewMediaCounts(st0Var.f30442c);
        }
        g0();
    }

    public final void b0() {
        int i10;
        if (this.R == null) {
            return;
        }
        int i11 = 0;
        if (this.J != null) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        m90 m90Var = this.R;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7767b;
        int[] iArr = au0.f24493s2;
        m90Var.j1(ei.b.d(currentActionBarHeight - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(6.666f), ei.b.c(this.mSystemInsets.f7767b), ei.b.c(this.mSystemInsets.d + i10), this.mSystemInsets.d + i10);
        if (this.P != null) {
            int topPanelShift = this.R.getTopPanelShift() + org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7767b;
            if (this.P.getLayoutParams().height != topPanelShift) {
                this.P.getLayoutParams().height = topPanelShift;
                this.P.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i12 = this.mSystemInsets.d;
            layoutParams.height = i12 + i10;
            View view2 = this.navigationBarFadeView;
            if (i12 < org.telegram.messenger.i0.L(40.0f) && i10 <= 0) {
                i11 = 8;
            }
            view2.setVisibility(i11);
            this.navigationBarFadeView.requestLayout();
        }
        c0();
    }

    public final void c0() {
        int i10;
        int i11;
        if (this.J == null) {
            return;
        }
        float f7 = this.O.e;
        float L = org.telegram.messenger.i0.L(72.0f) + this.mSystemInsets.d;
        this.J.setTranslationY((L * f7) + (-i10));
        float f10 = 1.0f - f7;
        this.J.setAlpha(f10);
        org.telegram.ui.qf0 qf0Var = this.J;
        int i12 = 4;
        if (f7 < 1.0f) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        qf0Var.setVisibility(i11);
        this.M.setTranslationY((L * f10) + (-this.mSystemInsets.d));
        this.M.setAlpha(f7);
        FrameLayout frameLayout = this.M;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        frameLayout.setVisibility(i12);
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.R.H0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        ei.b bVar;
        int childCount;
        int i10;
        int i11 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 5));
        jg.l0 l0Var = new jg.l0(this, context, 20);
        this.fragmentView = l0Var;
        if (this.f28748a == 0 && this.e == getUserConfig().e() && this.f28751f == 0 && !getMessagesController().F1().f16116b && getMessagesController().F1().e()) {
            this.S = 11;
        }
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        m90 m90Var = new m90(this, context, this.e, this.f28749b, this.f28750c, this.d, this.S, this, new l90(this), getResourceProvider(), baseSimpleGlass.f6599c);
        this.R = m90Var;
        m90Var.setOnTopPanelShiftChanged(new j90(this, 0));
        this.R.K0.setOpen(true);
        this.R.setPinnedToTop(true);
        l0Var.addView(this.R, w7.b6.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131231245);
            this.f28754s = b10;
            b10.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
            this.f28754s.Y(false, false);
            org.telegram.ui.ActionBar.b1 e = this.f28754s.e(8, 2131232437, org.telegram.messenger.dd.L0(2131748665, null));
            this.H = e;
            e.setOnClickListener(new View.OnClickListener(this) {
                public final n90 f27792b;

                {
                    this.f27792b = this;
                }

                @Override
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    boolean z10;
                    int i12;
                    wb j10;
                    int i13 = r2;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                    n90 n90Var = this.f27792b;
                    switch (i13) {
                        case 0:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.i0(true, M1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean N1 = n90Var.R.N1(null, null);
                            if (N1 != null) {
                                n90Var.i0(N1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = n90Var.D;
                            if (z11 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.f28756x;
                                int i14 = -n90Var.F;
                                n90Var.F = i14;
                                org.telegram.messenger.i0.F3(i14, b1Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.f28756x;
                            boolean z12 = !z11;
                            n90Var.D = z12;
                            b1Var2.setChecked(z12);
                            m90 m90Var2 = n90Var.R;
                            boolean z13 = n90Var.D;
                            boolean z14 = n90Var.E;
                            is0 is0Var = m90Var2.f24511e0;
                            if (is0Var != null && (x4Var2 = is0Var.f32635s) != null) {
                                x4Var2.f49655n = z13;
                                x4Var2.f49656o = z14;
                                x4Var2.d(true);
                            }
                            uq0 uq0Var = m90Var2.f24518g0;
                            if (uq0Var != null && (x4Var = uq0Var.f32635s) != null) {
                                x4Var.f49655n = z13;
                                x4Var.f49656o = z14;
                                x4Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = n90Var.E;
                            if (z15 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.f28757y;
                                int i15 = -n90Var.F;
                                n90Var.F = i15;
                                org.telegram.messenger.i0.F3(i15, b1Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.f28757y;
                            boolean z16 = !z15;
                            n90Var.E = z16;
                            b1Var4.setChecked(z16);
                            m90 m90Var3 = n90Var.R;
                            boolean z17 = n90Var.D;
                            boolean z18 = n90Var.E;
                            is0 is0Var2 = m90Var3.f24511e0;
                            if (is0Var2 != null && (x4Var4 = is0Var2.f32635s) != null) {
                                x4Var4.f49655n = z17;
                                x4Var4.f49656o = z18;
                                x4Var4.d(true);
                            }
                            uq0 uq0Var2 = m90Var3.f24518g0;
                            if (uq0Var2 != null && (x4Var3 = uq0Var2.f32635s) != null) {
                                x4Var3.f49655n = z17;
                                x4Var3.f49656o = z18;
                                x4Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            n90 n90Var2 = this.f27792b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            if (n90Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.f28755w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < n90Var2.f28755w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.kj) n90Var2.f28755w.valueAt(i17)).f16694l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            n90Var2.R.U(false);
                            if (z10) {
                                n90Var2.R.g1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z10, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                if (z10) {
                                    j10 = cc.a0(n90Var2).L(2131623989, org.telegram.messenger.dd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.dd.L0(2131744510, null), org.telegram.messenger.dd.L0(2131743912, null), fpVar).j();
                                } else {
                                    j10 = cc.a0(n90Var2).J(2131623979, org.telegram.messenger.dd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.dd.L0(2131743912, null), 5000, false, fpVar).j();
                                }
                                j10.v = new at(23, n90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.b1 e7 = this.f28754s.e(9, 2131232438, org.telegram.messenger.dd.L0(2131748664, null));
            this.I = e7;
            e7.setOnClickListener(new View.OnClickListener(this) {
                public final n90 f27792b;

                {
                    this.f27792b = this;
                }

                @Override
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    boolean z10;
                    int i12;
                    wb j10;
                    int i13 = r2;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                    n90 n90Var = this.f27792b;
                    switch (i13) {
                        case 0:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.i0(true, M1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean N1 = n90Var.R.N1(null, null);
                            if (N1 != null) {
                                n90Var.i0(N1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = n90Var.D;
                            if (z11 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.f28756x;
                                int i14 = -n90Var.F;
                                n90Var.F = i14;
                                org.telegram.messenger.i0.F3(i14, b1Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.f28756x;
                            boolean z12 = !z11;
                            n90Var.D = z12;
                            b1Var2.setChecked(z12);
                            m90 m90Var2 = n90Var.R;
                            boolean z13 = n90Var.D;
                            boolean z14 = n90Var.E;
                            is0 is0Var = m90Var2.f24511e0;
                            if (is0Var != null && (x4Var2 = is0Var.f32635s) != null) {
                                x4Var2.f49655n = z13;
                                x4Var2.f49656o = z14;
                                x4Var2.d(true);
                            }
                            uq0 uq0Var = m90Var2.f24518g0;
                            if (uq0Var != null && (x4Var = uq0Var.f32635s) != null) {
                                x4Var.f49655n = z13;
                                x4Var.f49656o = z14;
                                x4Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = n90Var.E;
                            if (z15 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.f28757y;
                                int i15 = -n90Var.F;
                                n90Var.F = i15;
                                org.telegram.messenger.i0.F3(i15, b1Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.f28757y;
                            boolean z16 = !z15;
                            n90Var.E = z16;
                            b1Var4.setChecked(z16);
                            m90 m90Var3 = n90Var.R;
                            boolean z17 = n90Var.D;
                            boolean z18 = n90Var.E;
                            is0 is0Var2 = m90Var3.f24511e0;
                            if (is0Var2 != null && (x4Var4 = is0Var2.f32635s) != null) {
                                x4Var4.f49655n = z17;
                                x4Var4.f49656o = z18;
                                x4Var4.d(true);
                            }
                            uq0 uq0Var2 = m90Var3.f24518g0;
                            if (uq0Var2 != null && (x4Var3 = uq0Var2.f32635s) != null) {
                                x4Var3.f49655n = z17;
                                x4Var3.f49656o = z18;
                                x4Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            n90 n90Var2 = this.f27792b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            if (n90Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.f28755w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < n90Var2.f28755w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.kj) n90Var2.f28755w.valueAt(i17)).f16694l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            n90Var2.R.U(false);
                            if (z10) {
                                n90Var2.R.g1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z10, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                if (z10) {
                                    j10 = cc.a0(n90Var2).L(2131623989, org.telegram.messenger.dd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.dd.L0(2131744510, null), org.telegram.messenger.dd.L0(2131743912, null), fpVar).j();
                                } else {
                                    j10 = cc.a0(n90Var2).J(2131623979, org.telegram.messenger.dd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.dd.L0(2131743912, null), 5000, false, fpVar).j();
                                }
                                j10.v = new at(23, n90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.b1 e10 = this.f28754s.e(10, 2131232076, org.telegram.messenger.dd.L0(2131752642, null));
            this.G = e10;
            e10.setEnabled(false);
            this.G.setAlpha(0.5f);
            this.f28754s.a(-1);
            org.telegram.ui.ActionBar.p5 p5Var = this.f28754s;
            org.telegram.ui.ActionBar.b1 d = p5Var.d(6, 0, null, org.telegram.messenger.dd.L0(2131748668, null), true, true, p5Var.m0);
            this.f28756x = d;
            d.setChecked(this.D);
            this.f28756x.setOnClickListener(new View.OnClickListener(this) {
                public final n90 f27792b;

                {
                    this.f27792b = this;
                }

                @Override
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    boolean z10;
                    int i12;
                    wb j10;
                    int i13 = r2;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                    n90 n90Var = this.f27792b;
                    switch (i13) {
                        case 0:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.i0(true, M1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean N1 = n90Var.R.N1(null, null);
                            if (N1 != null) {
                                n90Var.i0(N1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = n90Var.D;
                            if (z11 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.f28756x;
                                int i14 = -n90Var.F;
                                n90Var.F = i14;
                                org.telegram.messenger.i0.F3(i14, b1Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.f28756x;
                            boolean z12 = !z11;
                            n90Var.D = z12;
                            b1Var2.setChecked(z12);
                            m90 m90Var2 = n90Var.R;
                            boolean z13 = n90Var.D;
                            boolean z14 = n90Var.E;
                            is0 is0Var = m90Var2.f24511e0;
                            if (is0Var != null && (x4Var2 = is0Var.f32635s) != null) {
                                x4Var2.f49655n = z13;
                                x4Var2.f49656o = z14;
                                x4Var2.d(true);
                            }
                            uq0 uq0Var = m90Var2.f24518g0;
                            if (uq0Var != null && (x4Var = uq0Var.f32635s) != null) {
                                x4Var.f49655n = z13;
                                x4Var.f49656o = z14;
                                x4Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = n90Var.E;
                            if (z15 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.f28757y;
                                int i15 = -n90Var.F;
                                n90Var.F = i15;
                                org.telegram.messenger.i0.F3(i15, b1Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.f28757y;
                            boolean z16 = !z15;
                            n90Var.E = z16;
                            b1Var4.setChecked(z16);
                            m90 m90Var3 = n90Var.R;
                            boolean z17 = n90Var.D;
                            boolean z18 = n90Var.E;
                            is0 is0Var2 = m90Var3.f24511e0;
                            if (is0Var2 != null && (x4Var4 = is0Var2.f32635s) != null) {
                                x4Var4.f49655n = z17;
                                x4Var4.f49656o = z18;
                                x4Var4.d(true);
                            }
                            uq0 uq0Var2 = m90Var3.f24518g0;
                            if (uq0Var2 != null && (x4Var3 = uq0Var2.f32635s) != null) {
                                x4Var3.f49655n = z17;
                                x4Var3.f49656o = z18;
                                x4Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            n90 n90Var2 = this.f27792b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            if (n90Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.f28755w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < n90Var2.f28755w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.kj) n90Var2.f28755w.valueAt(i17)).f16694l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            n90Var2.R.U(false);
                            if (z10) {
                                n90Var2.R.g1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z10, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                if (z10) {
                                    j10 = cc.a0(n90Var2).L(2131623989, org.telegram.messenger.dd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.dd.L0(2131744510, null), org.telegram.messenger.dd.L0(2131743912, null), fpVar).j();
                                } else {
                                    j10 = cc.a0(n90Var2).J(2131623979, org.telegram.messenger.dd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.dd.L0(2131743912, null), 5000, false, fpVar).j();
                                }
                                j10.v = new at(23, n90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.p5 p5Var2 = this.f28754s;
            org.telegram.ui.ActionBar.b1 d10 = p5Var2.d(7, 0, null, org.telegram.messenger.dd.L0(2131748667, null), true, true, p5Var2.m0);
            this.f28757y = d10;
            d10.setChecked(this.E);
            this.f28757y.setOnClickListener(new View.OnClickListener(this) {
                public final n90 f27792b;

                {
                    this.f27792b = this;
                }

                @Override
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    boolean z10;
                    int i12;
                    wb j10;
                    int i13 = r2;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                    n90 n90Var = this.f27792b;
                    switch (i13) {
                        case 0:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.i0(true, M1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean N1 = n90Var.R.N1(null, null);
                            if (N1 != null) {
                                n90Var.i0(N1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = n90Var.D;
                            if (z11 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.f28756x;
                                int i14 = -n90Var.F;
                                n90Var.F = i14;
                                org.telegram.messenger.i0.F3(i14, b1Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.f28756x;
                            boolean z12 = !z11;
                            n90Var.D = z12;
                            b1Var2.setChecked(z12);
                            m90 m90Var2 = n90Var.R;
                            boolean z13 = n90Var.D;
                            boolean z14 = n90Var.E;
                            is0 is0Var = m90Var2.f24511e0;
                            if (is0Var != null && (x4Var2 = is0Var.f32635s) != null) {
                                x4Var2.f49655n = z13;
                                x4Var2.f49656o = z14;
                                x4Var2.d(true);
                            }
                            uq0 uq0Var = m90Var2.f24518g0;
                            if (uq0Var != null && (x4Var = uq0Var.f32635s) != null) {
                                x4Var.f49655n = z13;
                                x4Var.f49656o = z14;
                                x4Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = n90Var.E;
                            if (z15 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.f28757y;
                                int i15 = -n90Var.F;
                                n90Var.F = i15;
                                org.telegram.messenger.i0.F3(i15, b1Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.f28757y;
                            boolean z16 = !z15;
                            n90Var.E = z16;
                            b1Var4.setChecked(z16);
                            m90 m90Var3 = n90Var.R;
                            boolean z17 = n90Var.D;
                            boolean z18 = n90Var.E;
                            is0 is0Var2 = m90Var3.f24511e0;
                            if (is0Var2 != null && (x4Var4 = is0Var2.f32635s) != null) {
                                x4Var4.f49655n = z17;
                                x4Var4.f49656o = z18;
                                x4Var4.d(true);
                            }
                            uq0 uq0Var2 = m90Var3.f24518g0;
                            if (uq0Var2 != null && (x4Var3 = uq0Var2.f32635s) != null) {
                                x4Var3.f49655n = z17;
                                x4Var3.f49656o = z18;
                                x4Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            n90 n90Var2 = this.f27792b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            if (n90Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.f28755w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < n90Var2.f28755w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.kj) n90Var2.f28755w.valueAt(i17)).f16694l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            n90Var2.R.U(false);
                            if (z10) {
                                n90Var2.R.g1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z10, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                if (z10) {
                                    j10 = cc.a0(n90Var2).L(2131623989, org.telegram.messenger.dd.G(i12, "StorySavedTitle", new Object[0]), org.telegram.messenger.dd.L0(2131744510, null), org.telegram.messenger.dd.L0(2131743912, null), fpVar).j();
                                } else {
                                    j10 = cc.a0(n90Var2).J(2131623979, org.telegram.messenger.dd.G(i12, "StoryArchived", new Object[0]), org.telegram.messenger.dd.L0(2131743912, null), 5000, false, fpVar).j();
                                }
                                j10.v = new at(23, n90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i12 = this.f28748a;
        gh.b[] bVarArr = this.K;
        if (i12 == 1) {
            org.telegram.ui.qf0 qf0Var = new org.telegram.ui.qf0(context, getResourceProvider());
            this.J = qf0Var;
            qf0Var.setClipChildren(false);
            this.J.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            bVarArr[0] = gh.b.c(context, getResourceProvider(), gh.a.Q, 2131746666);
            bVarArr[1] = gh.b.c(context, getResourceProvider(), gh.a.R, 2131746642);
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                bVarArr[i13].setOnClickListener(new bh.f(this, i13, 9));
                this.J.addView(bVarArr[i13]);
                this.J.i(bVarArr[i13], true, false);
            }
            bVar = baseSimpleGlass;
            vg.f c10 = bVar.f6599c.c(this.J, w7.b9.f(getResourceProvider()), false);
            org.telegram.messenger.a30.u(c10, org.telegram.messenger.i0.L(28.0f), 7.666f);
            this.J.setBackground(c10);
            l0Var.addView(this.J, w7.b6.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.M = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
            vh.d dVar = new vh.d(context, getResourceProvider(), true);
            this.N = dVar;
            dVar.i(org.telegram.messenger.dd.L0(2131745926, null), false, true);
            this.N.setShowZero(true);
            this.N.c(0, false);
            this.N.setEnabled(false);
            this.N.setOnClickListener(new View.OnClickListener(this) {
                public final n90 f27792b;

                {
                    this.f27792b = this;
                }

                @Override
                public final void onClick(View view) {
                    th.x4 x4Var;
                    th.x4 x4Var2;
                    th.x4 x4Var3;
                    th.x4 x4Var4;
                    boolean z10;
                    int i122;
                    wb j10;
                    int i132 = r2;
                    org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                    n90 n90Var = this.f27792b;
                    switch (i132) {
                        case 0:
                            Boolean M1 = n90Var.R.M1(null, null);
                            if (M1 != null) {
                                n90Var.i0(true, M1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean N1 = n90Var.R.N1(null, null);
                            if (N1 != null) {
                                n90Var.i0(N1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = n90Var.D;
                            if (z11 && !n90Var.E) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var = n90Var.f28756x;
                                int i14 = -n90Var.F;
                                n90Var.F = i14;
                                org.telegram.messenger.i0.F3(i14, b1Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var2 = n90Var.f28756x;
                            boolean z12 = !z11;
                            n90Var.D = z12;
                            b1Var2.setChecked(z12);
                            m90 m90Var2 = n90Var.R;
                            boolean z13 = n90Var.D;
                            boolean z14 = n90Var.E;
                            is0 is0Var = m90Var2.f24511e0;
                            if (is0Var != null && (x4Var2 = is0Var.f32635s) != null) {
                                x4Var2.f49655n = z13;
                                x4Var2.f49656o = z14;
                                x4Var2.d(true);
                            }
                            uq0 uq0Var = m90Var2.f24518g0;
                            if (uq0Var != null && (x4Var = uq0Var.f32635s) != null) {
                                x4Var.f49655n = z13;
                                x4Var.f49656o = z14;
                                x4Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = n90Var.E;
                            if (z15 && !n90Var.D) {
                                t2Var.a();
                                org.telegram.ui.ActionBar.b1 b1Var3 = n90Var.f28757y;
                                int i15 = -n90Var.F;
                                n90Var.F = i15;
                                org.telegram.messenger.i0.F3(i15, b1Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var4 = n90Var.f28757y;
                            boolean z16 = !z15;
                            n90Var.E = z16;
                            b1Var4.setChecked(z16);
                            m90 m90Var3 = n90Var.R;
                            boolean z17 = n90Var.D;
                            boolean z18 = n90Var.E;
                            is0 is0Var2 = m90Var3.f24511e0;
                            if (is0Var2 != null && (x4Var4 = is0Var2.f32635s) != null) {
                                x4Var4.f49655n = z17;
                                x4Var4.f49656o = z18;
                                x4Var4.d(true);
                            }
                            uq0 uq0Var2 = m90Var3.f24518g0;
                            if (uq0Var2 != null && (x4Var3 = uq0Var2.f32635s) != null) {
                                x4Var3.f49655n = z17;
                                x4Var3.f49656o = z18;
                                x4Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            n90 n90Var2 = this.f27792b;
                            ag.j0 j0Var = n90Var2.Q;
                            if (j0Var != null) {
                                j0Var.run();
                                n90Var2.Q = null;
                            }
                            wb.e();
                            if (n90Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (n90Var2.f28755w != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < n90Var2.f28755w.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.kj) n90Var2.f28755w.valueAt(i17)).f16694l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            n90Var2.R.U(false);
                            if (z10) {
                                n90Var2.R.g1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                n90Var2.getMessagesController().O1().q0(n90Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                n90Var2.Q = new ag.j0(n90Var2, arrayList, z10, 18);
                                org.telegram.ui.fp fpVar = new org.telegram.ui.fp(n90Var2, zArr2, arrayList, zArr, 16);
                                if (z10) {
                                    j10 = cc.a0(n90Var2).L(2131623989, org.telegram.messenger.dd.G(i122, "StorySavedTitle", new Object[0]), org.telegram.messenger.dd.L0(2131744510, null), org.telegram.messenger.dd.L0(2131743912, null), fpVar).j();
                                } else {
                                    j10 = cc.a0(n90Var2).J(2131623979, org.telegram.messenger.dd.G(i122, "StoryArchived", new Object[0]), org.telegram.messenger.dd.L0(2131743912, null), 5000, false, fpVar).j();
                                }
                                j10.v = new at(23, n90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.M.addView(this.N, w7.b6.c(56.0f, -1));
            this.M.setVisibility(4);
            l0Var.addView(this.M, w7.b6.e(-1, 72, 80));
            this.O = new fe.b(0, new px(this, 8), gr.h, 320L, false);
            setBulletinDelegate(new k7(this, 3));
        } else {
            bVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.P = view;
        this.R.y(view);
        View view2 = this.P;
        view2.setBackground(bVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(bVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.qf0 qf0Var2 = this.J;
        if (qf0Var2 != null) {
            childCount = l0Var.indexOfChild(qf0Var2);
        } else {
            childCount = l0Var.getChildCount();
        }
        l0Var.addView(view4, childCount, w7.b6.e(-1, 0, 80));
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        bVar.f6605l = l0Var;
        bVar.f6606m = null;
        bVar.g(l0Var, i5Var, resourceProvider);
        bVar.f6607n = new ei.a(4, this, l0Var);
        this.R.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f28748a == 3 && (i10 = this.f28753r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.dd.H(' ', "FoundStories", i10));
        }
        b0();
        g0();
        if (this.f28748a == 1) {
            if (this.S != 9) {
                i11 = 0;
            }
            org.telegram.ui.qf0 qf0Var3 = this.J;
            if (qf0Var3 != null && this.L != i11) {
                this.L = i11;
                qf0Var3.q(bVarArr[i11], false);
            }
        }
        return l0Var;
    }

    public final boolean d0() {
        int i10 = this.f28748a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            m90 m90Var = this.R;
            if (m90Var != null) {
                m90Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f28750c = chatFull;
    }

    public final void f0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void g0() {
        String str;
        String str2;
        boolean z10;
        int size;
        boolean z11;
        float f7;
        float f10;
        int size2;
        int i10;
        m90 m90Var = this.R;
        if (m90Var != null && this.simpleActionBar != null) {
            int closestTab = m90Var.getClosestTab();
            if (this.f28748a != 3 || closestTab == 8) {
                int[] iArr = this.f28749b.f30442c;
                boolean z12 = org.telegram.messenger.dd.X;
                boolean z13 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        f0(org.telegram.messenger.dd.G(getMessagesController().F1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.R.getPhotosVideosTypeFilter() == 1) {
                                    f0(org.telegram.messenger.dd.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                                    f0(org.telegram.messenger.dd.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    f0(org.telegram.messenger.dd.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                f0(org.telegram.messenger.dd.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                f0(org.telegram.messenger.dd.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                f0(org.telegram.messenger.dd.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                f0(org.telegram.messenger.dd.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                f0(org.telegram.messenger.dd.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i10 = iArr[8]) >= 0) {
                                f0(org.telegram.messenger.dd.G(i10, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                org.telegram.messenger.xo K0 = org.telegram.messenger.wp.r1(this.currentAccount).K0(this.e);
                                if (K0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = K0.f19460b.size() + K0.f19461c;
                                }
                                f0(org.telegram.messenger.dd.G(size2, "Channels", new Object[0]));
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.b1 b1Var = this.I;
                float f11 = 0.5f;
                if (b1Var != null) {
                    b1Var.setEnabled(this.R.J());
                    org.telegram.ui.ActionBar.b1 b1Var2 = this.I;
                    if (b1Var2.isEnabled()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    b1Var2.setAlpha(f10);
                }
                org.telegram.ui.ActionBar.b1 b1Var3 = this.H;
                if (b1Var3 != null) {
                    b1Var3.setEnabled(this.R.I());
                    org.telegram.ui.ActionBar.b1 b1Var4 = this.H;
                    if (b1Var4.isEnabled()) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    b1Var4.setAlpha(f7);
                }
                int l02 = this.R.l0(closestTab);
                if (this.f28748a == 3) {
                    if (l02 > 0) {
                        f0(org.telegram.messenger.dd.H(' ', "FoundStories", l02));
                    }
                } else if (closestTab == 8) {
                    if (l02 > 0) {
                        str2 = org.telegram.messenger.dd.G(l02, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    f0(str2);
                } else {
                    if (l02 > 0) {
                        str = org.telegram.messenger.dd.G(l02, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    f0(str);
                }
                h0(true);
                org.telegram.ui.ActionBar.p5 p5Var = this.f28754s;
                if (p5Var != null) {
                    if (l02 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p5Var.Y(z11, true);
                }
                vh.d dVar = this.N;
                if (dVar != null) {
                    if (!z12 && this.U == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f28755w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(org.telegram.messenger.dd.G(size, "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        dVar.i(org.telegram.messenger.dd.L0(2131745926, null), z10, true);
                    }
                    this.U = closestTab;
                }
                org.telegram.ui.ActionBar.b1 b1Var5 = this.G;
                if (b1Var5 != null) {
                    if (l02 <= 0) {
                        z13 = false;
                    }
                    b1Var5.setEnabled(z13);
                    org.telegram.ui.ActionBar.b1 b1Var6 = this.G;
                    if (z13) {
                        f11 = 1.0f;
                    }
                    b1Var6.setAlpha(f11);
                }
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        if (getLastStoryViewer() != null && getLastStoryViewer().z()) {
            return getLastStoryViewer().e(navigationBarColor);
        }
        return navigationBarColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z10) {
        long j10;
        String str;
        TLRPC.User user;
        int i10 = this.f28748a;
        boolean z11 = true;
        if (i10 == 3) {
            str = this.h;
        } else {
            int i11 = 2131746649;
            if (i10 == 2) {
                str = org.telegram.messenger.dd.L0(2131746649, null);
            } else if (i10 == 1) {
                m90 m90Var = this.R;
                if (m90Var != null && m90Var.getClosestTab() != 9) {
                    z11 = false;
                }
                if (!z11) {
                    i11 = 2131746670;
                }
                str = org.telegram.messenger.dd.L0(i11, null);
            } else {
                if (this.f28751f != 0 && this.e == getUserConfig().e()) {
                    j10 = this.f28751f;
                } else {
                    j10 = this.e;
                }
                if (j10 == 2666000) {
                    str = org.telegram.messenger.dd.L0(2131754252, null);
                } else if (this.f28751f != 0 && j10 == getUserConfig().e()) {
                    str = org.telegram.messenger.dd.L0(2131748318, null);
                } else if (org.telegram.messenger.o5.C(j10)) {
                    TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (j10 & 4294967295L)));
                    if (Z0 != null) {
                        user = getMessagesController().Z1(Long.valueOf(Z0.user_id));
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.o5.E(j10)) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        if (Z1.self) {
                            str = org.telegram.messenger.dd.L0(2131745918, null);
                        } else {
                            str = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
                        }
                    }
                    str = null;
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
                    if (L0 != null) {
                        str = L0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.dd.L0(2131745433, null);
                }
            }
        }
        String str2 = str;
        boolean z12 = z11;
        if (TextUtils.equals(this.T, str2)) {
            return;
        }
        this.T = str2;
        if (z10) {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            i5Var.getClass();
            i5Var.B(str2, z12, 320L, gr.h);
            return;
        }
        this.simpleActionBar.setTitle(str2);
    }

    public final void i0(boolean z10, boolean z11) {
        float f7;
        this.I.setEnabled(z10);
        ViewPropertyAnimator animate = this.I.animate();
        float f10 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
        this.H.setEnabled(z11);
        ViewPropertyAnimator animate2 = this.H.animate();
        if (z11) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).start();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.H0()) {
            return false;
        }
        m90 m90Var = this.R;
        if (m90Var.getSelectedTab() != m90Var.K0.getFirstTabId()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            m90 m90Var = this.R;
            if (m90Var.E1) {
                if (z10) {
                    m90Var.U(false);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        this.f28748a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f28751f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f28752n = getArguments().getString("username", "");
        this.f28753r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f28748a;
        if (i11 == 2) {
            i10 = 9;
        } else if (i11 == 1) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.S = getArguments().getInt("start_from", i10);
        getNotificationCenter().c(this, org.telegram.messenger.at.E0);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().c(this, org.telegram.messenger.at.Z2);
        if (org.telegram.messenger.o5.E(this.e) && this.f28751f == 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.e));
            if (org.telegram.messenger.i20.B(Z1)) {
                getMessagesController().e3(Z1, false, this.classGuid);
                this.d = getMessagesController().a2(this.e);
            }
        }
        if (this.f28749b == null) {
            this.f28749b = new st0(this);
        }
        this.f28749b.f30449y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.E0);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().n(this, org.telegram.messenger.at.Z2);
        ag.j0 j0Var = this.Q;
        if (j0Var != null) {
            this.Q = null;
            org.telegram.messenger.i0.g3(j0Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        b0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
