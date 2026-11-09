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
public final class v80 extends org.telegram.ui.ActionBar.f2 implements ss0, pg.b, org.telegram.messenger.ls {
    public boolean D;
    public boolean E;
    public int F;
    public org.telegram.ui.ActionBar.z0 G;
    public org.telegram.ui.ActionBar.z0 H;
    public org.telegram.ui.ActionBar.z0 I;
    public org.telegram.ui.ne0 J;
    public final qh.b[] K;
    public int L;
    public FrameLayout M;
    public fi.d N;
    public te.a O;
    public View P;
    public bi.u7 Q;
    public u80 R;
    public int S;
    public String T;
    public int U;
    public int f39003a;
    public rs0 f39004b;
    public TLRPC.ChatFull f39005c;
    public TLRPC.UserFull d;
    public long f39006e;
    public long f39007f;
    public String h;
    public String f39008n;
    public int f39009r;
    public org.telegram.ui.ActionBar.f5 f39010s;
    public SparseArray f39011w;
    public org.telegram.ui.ActionBar.z0 f39012x;
    public org.telegram.ui.ActionBar.z0 f39013y;

    public v80(Bundle bundle, rs0 rs0Var) {
        super(bundle);
        this.D = true;
        this.E = true;
        this.F = -12;
        this.K = new qh.b[2];
        this.L = -1;
        this.f39004b = rs0Var;
    }

    public static int a0(v80 v80Var) {
        return v80Var.classGuid;
    }

    @Override
    public final List E() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.q5 q5Var = sg.c1.f55039m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new pg.a(str.concat(" shape detector learning debug"), new r80(this, 1)));
    }

    @Override
    public final void Q() {
        rs0 rs0Var;
        u80 u80Var = this.R;
        if (u80Var != null && (rs0Var = this.f39004b) != null) {
            u80Var.setNewMediaCounts(rs0Var.f37795c);
        }
        g0();
    }

    public final void b0() {
        int i7;
        if (this.R == null) {
            return;
        }
        int i10 = 0;
        if (this.J != null) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        u80 u80Var = this.R;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15121b;
        int[] iArr = zs0.f41052s2;
        u80Var.n1(oi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), oi.a.c(this.mSystemInsets.f15121b), oi.a.c(this.mSystemInsets.d + i7), this.mSystemInsets.d + i7);
        if (this.P != null) {
            int topPanelShift = this.R.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15121b;
            if (this.P.getLayoutParams().height != topPanelShift) {
                this.P.getLayoutParams().height = topPanelShift;
                this.P.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i11 = this.mSystemInsets.d;
            layoutParams.height = i11 + i7;
            View view2 = this.navigationBarFadeView;
            if (i11 < org.telegram.messenger.g0.L(40.0f) && i7 <= 0) {
                i10 = 8;
            }
            view2.setVisibility(i10);
            this.navigationBarFadeView.requestLayout();
        }
        c0();
    }

    public final void c0() {
        int i7;
        int i10;
        if (this.J == null) {
            return;
        }
        float f10 = this.O.f55499e;
        float L = org.telegram.messenger.g0.L(72.0f) + this.mSystemInsets.d;
        this.J.setTranslationY((L * f10) + (-i7));
        float f11 = 1.0f - f10;
        this.J.setAlpha(f11);
        org.telegram.ui.ne0 ne0Var = this.J;
        int i11 = 4;
        if (f10 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ne0Var.setVisibility(i10);
        this.M.setTranslationY((L * f11) + (-this.mSystemInsets.d));
        this.M.setAlpha(f10);
        FrameLayout frameLayout = this.M;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        frameLayout.setVisibility(i11);
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.R.K0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        oi.a aVar;
        int childCount;
        int i7;
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 14));
        bi.e5 e5Var = new bi.e5(21, context, this);
        this.fragmentView = e5Var;
        if (this.f39003a == 0 && this.f39006e == getUserConfig().e() && this.f39007f == 0 && !getMessagesController().G1().f26212b && getMessagesController().G1().e()) {
            this.S = 11;
        }
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        u80 u80Var = new u80(this, context, this.f39006e, this.f39004b, this.f39005c, this.d, this.S, this, new t80(this), getResourceProvider(), baseSimpleGlass.f21021c);
        this.R = u80Var;
        u80Var.setOnTopPanelShiftChanged(new r80(this, 0));
        this.R.K0.setOpen(true);
        this.R.setPinnedToTop(true);
        e5Var.addView(this.R, c8.ha.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(0, 2131231244);
            this.f39010s = b10;
            b10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
            this.f39010s.Y(false, false);
            org.telegram.ui.ActionBar.z0 e10 = this.f39010s.e(8, 2131232438, org.telegram.messenger.id.M0(2131748650, null));
            this.H = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final v80 f37983b;

                {
                    this.f37983b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.r6 r6Var;
                    di.r6 r6Var2;
                    di.r6 r6Var3;
                    di.r6 r6Var4;
                    boolean z9;
                    int i11;
                    cc j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    v80 v80Var = this.f37983b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = v80Var.R.Q1(null, null);
                            if (Q1 != null) {
                                v80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = v80Var.R.R1(null, null);
                            if (R1 != null) {
                                v80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z10 = v80Var.D;
                            if (z10 && !v80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = v80Var.f39012x;
                                int i13 = -v80Var.F;
                                v80Var.F = i13;
                                org.telegram.messenger.g0.G3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = v80Var.f39012x;
                            boolean z11 = !z10;
                            v80Var.D = z11;
                            z0Var2.setChecked(z11);
                            u80 u80Var2 = v80Var.R;
                            boolean z12 = v80Var.D;
                            boolean z13 = v80Var.E;
                            ir0 ir0Var = u80Var2.f41071e0;
                            if (ir0Var != null && (r6Var2 = ir0Var.f40145s) != null) {
                                r6Var2.f9699n = z12;
                                r6Var2.f9700o = z13;
                                r6Var2.d(true);
                            }
                            sp0 sp0Var = u80Var2.f41078g0;
                            if (sp0Var != null && (r6Var = sp0Var.f40145s) != null) {
                                r6Var.f9699n = z12;
                                r6Var.f9700o = z13;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z14 = v80Var.E;
                            if (z14 && !v80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = v80Var.f39013y;
                                int i14 = -v80Var.F;
                                v80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = v80Var.f39013y;
                            boolean z15 = !z14;
                            v80Var.E = z15;
                            z0Var4.setChecked(z15);
                            u80 u80Var3 = v80Var.R;
                            boolean z16 = v80Var.D;
                            boolean z17 = v80Var.E;
                            ir0 ir0Var2 = u80Var3.f41071e0;
                            if (ir0Var2 != null && (r6Var4 = ir0Var2.f40145s) != null) {
                                r6Var4.f9699n = z16;
                                r6Var4.f9700o = z17;
                                r6Var4.d(true);
                            }
                            sp0 sp0Var2 = u80Var3.f41078g0;
                            if (sp0Var2 != null && (r6Var3 = sp0Var2.f40145s) != null) {
                                r6Var3.f9699n = z16;
                                r6Var3.f9700o = z17;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            v80 v80Var2 = this.f37983b;
                            bi.u7 u7Var = v80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                v80Var2.Q = null;
                            }
                            cc.e();
                            if (v80Var2.R.getClosestTab() == 9) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (v80Var2.f39011w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < v80Var2.f39011w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) v80Var2.f39011w.valueAt(i16)).f23266l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            v80Var2.R.V(false);
                            if (z9) {
                                v80Var2.R.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                v80Var2.getMessagesController().P1().q0(v80Var2.f39006e, arrayList, false);
                                boolean[] zArr2 = {false};
                                v80Var2.Q = new bi.u7(v80Var2, arrayList, z9, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) v80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                if (z9) {
                                    j3 = hc.a0(v80Var2).L(2131623989, org.telegram.messenger.id.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743887, null), m6Var).j();
                                } else {
                                    j3 = hc.a0(v80Var2).J(2131623979, org.telegram.messenger.id.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743887, null), 5000, false, m6Var).j();
                                }
                                j3.v = new fq(29, v80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e11 = this.f39010s.e(9, 2131232439, org.telegram.messenger.id.M0(2131748649, null));
            this.I = e11;
            e11.setOnClickListener(new View.OnClickListener(this) {
                public final v80 f37983b;

                {
                    this.f37983b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.r6 r6Var;
                    di.r6 r6Var2;
                    di.r6 r6Var3;
                    di.r6 r6Var4;
                    boolean z9;
                    int i11;
                    cc j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    v80 v80Var = this.f37983b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = v80Var.R.Q1(null, null);
                            if (Q1 != null) {
                                v80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = v80Var.R.R1(null, null);
                            if (R1 != null) {
                                v80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z10 = v80Var.D;
                            if (z10 && !v80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = v80Var.f39012x;
                                int i13 = -v80Var.F;
                                v80Var.F = i13;
                                org.telegram.messenger.g0.G3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = v80Var.f39012x;
                            boolean z11 = !z10;
                            v80Var.D = z11;
                            z0Var2.setChecked(z11);
                            u80 u80Var2 = v80Var.R;
                            boolean z12 = v80Var.D;
                            boolean z13 = v80Var.E;
                            ir0 ir0Var = u80Var2.f41071e0;
                            if (ir0Var != null && (r6Var2 = ir0Var.f40145s) != null) {
                                r6Var2.f9699n = z12;
                                r6Var2.f9700o = z13;
                                r6Var2.d(true);
                            }
                            sp0 sp0Var = u80Var2.f41078g0;
                            if (sp0Var != null && (r6Var = sp0Var.f40145s) != null) {
                                r6Var.f9699n = z12;
                                r6Var.f9700o = z13;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z14 = v80Var.E;
                            if (z14 && !v80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = v80Var.f39013y;
                                int i14 = -v80Var.F;
                                v80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = v80Var.f39013y;
                            boolean z15 = !z14;
                            v80Var.E = z15;
                            z0Var4.setChecked(z15);
                            u80 u80Var3 = v80Var.R;
                            boolean z16 = v80Var.D;
                            boolean z17 = v80Var.E;
                            ir0 ir0Var2 = u80Var3.f41071e0;
                            if (ir0Var2 != null && (r6Var4 = ir0Var2.f40145s) != null) {
                                r6Var4.f9699n = z16;
                                r6Var4.f9700o = z17;
                                r6Var4.d(true);
                            }
                            sp0 sp0Var2 = u80Var3.f41078g0;
                            if (sp0Var2 != null && (r6Var3 = sp0Var2.f40145s) != null) {
                                r6Var3.f9699n = z16;
                                r6Var3.f9700o = z17;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            v80 v80Var2 = this.f37983b;
                            bi.u7 u7Var = v80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                v80Var2.Q = null;
                            }
                            cc.e();
                            if (v80Var2.R.getClosestTab() == 9) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (v80Var2.f39011w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < v80Var2.f39011w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) v80Var2.f39011w.valueAt(i16)).f23266l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            v80Var2.R.V(false);
                            if (z9) {
                                v80Var2.R.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                v80Var2.getMessagesController().P1().q0(v80Var2.f39006e, arrayList, false);
                                boolean[] zArr2 = {false};
                                v80Var2.Q = new bi.u7(v80Var2, arrayList, z9, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) v80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                if (z9) {
                                    j3 = hc.a0(v80Var2).L(2131623989, org.telegram.messenger.id.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743887, null), m6Var).j();
                                } else {
                                    j3 = hc.a0(v80Var2).J(2131623979, org.telegram.messenger.id.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743887, null), 5000, false, m6Var).j();
                                }
                                j3.v = new fq(29, v80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e12 = this.f39010s.e(10, 2131232077, org.telegram.messenger.id.M0(2131752642, null));
            this.G = e12;
            e12.setEnabled(false);
            this.G.setAlpha(0.5f);
            this.f39010s.a(-1);
            org.telegram.ui.ActionBar.f5 f5Var = this.f39010s;
            org.telegram.ui.ActionBar.z0 d = f5Var.d(6, 0, null, org.telegram.messenger.id.M0(2131748653, null), true, true, f5Var.m0);
            this.f39012x = d;
            d.setChecked(this.D);
            this.f39012x.setOnClickListener(new View.OnClickListener(this) {
                public final v80 f37983b;

                {
                    this.f37983b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.r6 r6Var;
                    di.r6 r6Var2;
                    di.r6 r6Var3;
                    di.r6 r6Var4;
                    boolean z9;
                    int i11;
                    cc j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    v80 v80Var = this.f37983b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = v80Var.R.Q1(null, null);
                            if (Q1 != null) {
                                v80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = v80Var.R.R1(null, null);
                            if (R1 != null) {
                                v80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z10 = v80Var.D;
                            if (z10 && !v80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = v80Var.f39012x;
                                int i13 = -v80Var.F;
                                v80Var.F = i13;
                                org.telegram.messenger.g0.G3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = v80Var.f39012x;
                            boolean z11 = !z10;
                            v80Var.D = z11;
                            z0Var2.setChecked(z11);
                            u80 u80Var2 = v80Var.R;
                            boolean z12 = v80Var.D;
                            boolean z13 = v80Var.E;
                            ir0 ir0Var = u80Var2.f41071e0;
                            if (ir0Var != null && (r6Var2 = ir0Var.f40145s) != null) {
                                r6Var2.f9699n = z12;
                                r6Var2.f9700o = z13;
                                r6Var2.d(true);
                            }
                            sp0 sp0Var = u80Var2.f41078g0;
                            if (sp0Var != null && (r6Var = sp0Var.f40145s) != null) {
                                r6Var.f9699n = z12;
                                r6Var.f9700o = z13;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z14 = v80Var.E;
                            if (z14 && !v80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = v80Var.f39013y;
                                int i14 = -v80Var.F;
                                v80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = v80Var.f39013y;
                            boolean z15 = !z14;
                            v80Var.E = z15;
                            z0Var4.setChecked(z15);
                            u80 u80Var3 = v80Var.R;
                            boolean z16 = v80Var.D;
                            boolean z17 = v80Var.E;
                            ir0 ir0Var2 = u80Var3.f41071e0;
                            if (ir0Var2 != null && (r6Var4 = ir0Var2.f40145s) != null) {
                                r6Var4.f9699n = z16;
                                r6Var4.f9700o = z17;
                                r6Var4.d(true);
                            }
                            sp0 sp0Var2 = u80Var3.f41078g0;
                            if (sp0Var2 != null && (r6Var3 = sp0Var2.f40145s) != null) {
                                r6Var3.f9699n = z16;
                                r6Var3.f9700o = z17;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            v80 v80Var2 = this.f37983b;
                            bi.u7 u7Var = v80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                v80Var2.Q = null;
                            }
                            cc.e();
                            if (v80Var2.R.getClosestTab() == 9) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (v80Var2.f39011w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < v80Var2.f39011w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) v80Var2.f39011w.valueAt(i16)).f23266l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            v80Var2.R.V(false);
                            if (z9) {
                                v80Var2.R.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                v80Var2.getMessagesController().P1().q0(v80Var2.f39006e, arrayList, false);
                                boolean[] zArr2 = {false};
                                v80Var2.Q = new bi.u7(v80Var2, arrayList, z9, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) v80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                if (z9) {
                                    j3 = hc.a0(v80Var2).L(2131623989, org.telegram.messenger.id.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743887, null), m6Var).j();
                                } else {
                                    j3 = hc.a0(v80Var2).J(2131623979, org.telegram.messenger.id.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743887, null), 5000, false, m6Var).j();
                                }
                                j3.v = new fq(29, v80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.f5 f5Var2 = this.f39010s;
            org.telegram.ui.ActionBar.z0 d2 = f5Var2.d(7, 0, null, org.telegram.messenger.id.M0(2131748652, null), true, true, f5Var2.m0);
            this.f39013y = d2;
            d2.setChecked(this.E);
            this.f39013y.setOnClickListener(new View.OnClickListener(this) {
                public final v80 f37983b;

                {
                    this.f37983b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.r6 r6Var;
                    di.r6 r6Var2;
                    di.r6 r6Var3;
                    di.r6 r6Var4;
                    boolean z9;
                    int i11;
                    cc j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    v80 v80Var = this.f37983b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = v80Var.R.Q1(null, null);
                            if (Q1 != null) {
                                v80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = v80Var.R.R1(null, null);
                            if (R1 != null) {
                                v80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z10 = v80Var.D;
                            if (z10 && !v80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = v80Var.f39012x;
                                int i13 = -v80Var.F;
                                v80Var.F = i13;
                                org.telegram.messenger.g0.G3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = v80Var.f39012x;
                            boolean z11 = !z10;
                            v80Var.D = z11;
                            z0Var2.setChecked(z11);
                            u80 u80Var2 = v80Var.R;
                            boolean z12 = v80Var.D;
                            boolean z13 = v80Var.E;
                            ir0 ir0Var = u80Var2.f41071e0;
                            if (ir0Var != null && (r6Var2 = ir0Var.f40145s) != null) {
                                r6Var2.f9699n = z12;
                                r6Var2.f9700o = z13;
                                r6Var2.d(true);
                            }
                            sp0 sp0Var = u80Var2.f41078g0;
                            if (sp0Var != null && (r6Var = sp0Var.f40145s) != null) {
                                r6Var.f9699n = z12;
                                r6Var.f9700o = z13;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z14 = v80Var.E;
                            if (z14 && !v80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = v80Var.f39013y;
                                int i14 = -v80Var.F;
                                v80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = v80Var.f39013y;
                            boolean z15 = !z14;
                            v80Var.E = z15;
                            z0Var4.setChecked(z15);
                            u80 u80Var3 = v80Var.R;
                            boolean z16 = v80Var.D;
                            boolean z17 = v80Var.E;
                            ir0 ir0Var2 = u80Var3.f41071e0;
                            if (ir0Var2 != null && (r6Var4 = ir0Var2.f40145s) != null) {
                                r6Var4.f9699n = z16;
                                r6Var4.f9700o = z17;
                                r6Var4.d(true);
                            }
                            sp0 sp0Var2 = u80Var3.f41078g0;
                            if (sp0Var2 != null && (r6Var3 = sp0Var2.f40145s) != null) {
                                r6Var3.f9699n = z16;
                                r6Var3.f9700o = z17;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            v80 v80Var2 = this.f37983b;
                            bi.u7 u7Var = v80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                v80Var2.Q = null;
                            }
                            cc.e();
                            if (v80Var2.R.getClosestTab() == 9) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (v80Var2.f39011w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < v80Var2.f39011w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) v80Var2.f39011w.valueAt(i16)).f23266l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            v80Var2.R.V(false);
                            if (z9) {
                                v80Var2.R.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                v80Var2.getMessagesController().P1().q0(v80Var2.f39006e, arrayList, false);
                                boolean[] zArr2 = {false};
                                v80Var2.Q = new bi.u7(v80Var2, arrayList, z9, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) v80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                if (z9) {
                                    j3 = hc.a0(v80Var2).L(2131623989, org.telegram.messenger.id.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743887, null), m6Var).j();
                                } else {
                                    j3 = hc.a0(v80Var2).J(2131623979, org.telegram.messenger.id.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743887, null), 5000, false, m6Var).j();
                                }
                                j3.v = new fq(29, v80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i11 = this.f39003a;
        qh.b[] bVarArr = this.K;
        if (i11 == 1) {
            org.telegram.ui.ne0 ne0Var = new org.telegram.ui.ne0(context, getResourceProvider());
            this.J = ne0Var;
            ne0Var.setClipChildren(false);
            this.J.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.Q, 2131746651);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746627);
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                bVarArr[i12].setOnClickListener(new ai.v(this, i12, 14));
                this.J.addView(bVarArr[i12]);
                this.J.i(bVarArr[i12], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.f21021c.c(this.J, c8.g0.f(getResourceProvider()), false);
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.J.setBackground(c10);
            e5Var.addView(this.J, c8.ha.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.M = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            fi.d dVar = new fi.d(context, getResourceProvider(), true);
            this.N = dVar;
            dVar.i(org.telegram.messenger.id.M0(2131745909, null), false, true);
            this.N.setShowZero(true);
            this.N.c(0, false);
            this.N.setEnabled(false);
            this.N.setOnClickListener(new View.OnClickListener(this) {
                public final v80 f37983b;

                {
                    this.f37983b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.r6 r6Var;
                    di.r6 r6Var2;
                    di.r6 r6Var3;
                    di.r6 r6Var4;
                    boolean z9;
                    int i112;
                    cc j3;
                    int i122 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    v80 v80Var = this.f37983b;
                    switch (i122) {
                        case 0:
                            Boolean Q1 = v80Var.R.Q1(null, null);
                            if (Q1 != null) {
                                v80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = v80Var.R.R1(null, null);
                            if (R1 != null) {
                                v80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z10 = v80Var.D;
                            if (z10 && !v80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = v80Var.f39012x;
                                int i13 = -v80Var.F;
                                v80Var.F = i13;
                                org.telegram.messenger.g0.G3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = v80Var.f39012x;
                            boolean z11 = !z10;
                            v80Var.D = z11;
                            z0Var2.setChecked(z11);
                            u80 u80Var2 = v80Var.R;
                            boolean z12 = v80Var.D;
                            boolean z13 = v80Var.E;
                            ir0 ir0Var = u80Var2.f41071e0;
                            if (ir0Var != null && (r6Var2 = ir0Var.f40145s) != null) {
                                r6Var2.f9699n = z12;
                                r6Var2.f9700o = z13;
                                r6Var2.d(true);
                            }
                            sp0 sp0Var = u80Var2.f41078g0;
                            if (sp0Var != null && (r6Var = sp0Var.f40145s) != null) {
                                r6Var.f9699n = z12;
                                r6Var.f9700o = z13;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z14 = v80Var.E;
                            if (z14 && !v80Var.D) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = v80Var.f39013y;
                                int i14 = -v80Var.F;
                                v80Var.F = i14;
                                org.telegram.messenger.g0.G3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = v80Var.f39013y;
                            boolean z15 = !z14;
                            v80Var.E = z15;
                            z0Var4.setChecked(z15);
                            u80 u80Var3 = v80Var.R;
                            boolean z16 = v80Var.D;
                            boolean z17 = v80Var.E;
                            ir0 ir0Var2 = u80Var3.f41071e0;
                            if (ir0Var2 != null && (r6Var4 = ir0Var2.f40145s) != null) {
                                r6Var4.f9699n = z16;
                                r6Var4.f9700o = z17;
                                r6Var4.d(true);
                            }
                            sp0 sp0Var2 = u80Var3.f41078g0;
                            if (sp0Var2 != null && (r6Var3 = sp0Var2.f40145s) != null) {
                                r6Var3.f9699n = z16;
                                r6Var3.f9700o = z17;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            v80 v80Var2 = this.f37983b;
                            bi.u7 u7Var = v80Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                v80Var2.Q = null;
                            }
                            cc.e();
                            if (v80Var2.R.getClosestTab() == 9) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (v80Var2.f39011w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < v80Var2.f39011w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.ij) v80Var2.f39011w.valueAt(i16)).f23266l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i112 = i15;
                            } else {
                                i112 = 0;
                            }
                            v80Var2.R.V(false);
                            if (z9) {
                                v80Var2.R.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                v80Var2.getMessagesController().P1().q0(v80Var2.f39006e, arrayList, false);
                                boolean[] zArr2 = {false};
                                v80Var2.Q = new bi.u7(v80Var2, arrayList, z9, 21);
                                org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) v80Var2, zArr2, (Object) arrayList, (Object) zArr, 26);
                                if (z9) {
                                    j3 = hc.a0(v80Var2).L(2131623989, org.telegram.messenger.id.G(i112, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743887, null), m6Var).j();
                                } else {
                                    j3 = hc.a0(v80Var2).J(2131623979, org.telegram.messenger.id.G(i112, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743887, null), 5000, false, m6Var).j();
                                }
                                j3.v = new fq(29, v80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.M.addView(this.N, c8.ha.c(56.0f, -1));
            this.M.setVisibility(4);
            e5Var.addView(this.M, c8.ha.e(-1, 72, 80));
            this.O = new te.a(0, new bx(this, 8), xq.h, 320L, false);
            setBulletinDelegate(new ch.v(this, 8));
        } else {
            aVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.P = view;
        this.R.z(view);
        View view2 = this.P;
        view2.setBackground(aVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(aVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.ne0 ne0Var2 = this.J;
        if (ne0Var2 != null) {
            childCount = e5Var.indexOfChild(ne0Var2);
        } else {
            childCount = e5Var.getChildCount();
        }
        e5Var.addView(view4, childCount, c8.ha.e(-1, 0, 80));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        aVar.f21029m = e5Var;
        aVar.f21030n = null;
        aVar.g(e5Var, y4Var, resourceProvider);
        aVar.f21031o = new bi.g(7, this, e5Var);
        this.R.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f39003a == 3 && (i7 = this.f39009r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.f39003a == 1) {
            if (this.S != 9) {
                i10 = 0;
            }
            org.telegram.ui.ne0 ne0Var3 = this.J;
            if (ne0Var3 != null && this.L != i10) {
                this.L = i10;
                ne0Var3.q(bVarArr[i10], false);
            }
        }
        return e5Var;
    }

    public final boolean d0() {
        int i7 = this.f39003a;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.E0 && ((Long) objArr[0]).longValue() == this.f39006e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            u80 u80Var = this.R;
            if (u80Var != null) {
                u80Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f39005c = chatFull;
    }

    public final void f0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void g0() {
        String str;
        String str2;
        boolean z9;
        int size;
        boolean z10;
        float f10;
        float f11;
        int size2;
        int i7;
        u80 u80Var = this.R;
        if (u80Var != null && this.simpleActionBar != null) {
            int closestTab = u80Var.getClosestTab();
            if (this.f39003a != 3 || closestTab == 8) {
                int[] iArr = this.f39004b.f37795c;
                boolean z11 = org.telegram.messenger.id.f23157a0;
                boolean z12 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        f0(org.telegram.messenger.id.G(getMessagesController().G1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.R.getPhotosVideosTypeFilter() == 1) {
                                    f0(org.telegram.messenger.id.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                                    f0(org.telegram.messenger.id.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    f0(org.telegram.messenger.id.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                f0(org.telegram.messenger.id.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                f0(org.telegram.messenger.id.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                f0(org.telegram.messenger.id.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                f0(org.telegram.messenger.id.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                f0(org.telegram.messenger.id.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i7 = iArr[8]) >= 0) {
                                f0(org.telegram.messenger.id.G(i7, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(this.currentAccount).L0(this.f39006e);
                                if (L0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = L0.f25313b.size() + L0.f25314c;
                                }
                                f0(org.telegram.messenger.id.G(size2, "Channels", new Object[0]));
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
                org.telegram.ui.ActionBar.z0 z0Var = this.I;
                float f12 = 0.5f;
                if (z0Var != null) {
                    z0Var.setEnabled(this.R.K());
                    org.telegram.ui.ActionBar.z0 z0Var2 = this.I;
                    if (z0Var2.isEnabled()) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.5f;
                    }
                    z0Var2.setAlpha(f11);
                }
                org.telegram.ui.ActionBar.z0 z0Var3 = this.H;
                if (z0Var3 != null) {
                    z0Var3.setEnabled(this.R.J());
                    org.telegram.ui.ActionBar.z0 z0Var4 = this.H;
                    if (z0Var4.isEnabled()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    z0Var4.setAlpha(f10);
                }
                int m0 = this.R.m0(closestTab);
                if (this.f39003a == 3) {
                    if (m0 > 0) {
                        f0(org.telegram.messenger.id.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    if (m0 > 0) {
                        str2 = org.telegram.messenger.id.G(m0, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    f0(str2);
                } else {
                    if (m0 > 0) {
                        str = org.telegram.messenger.id.G(m0, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    f0(str);
                }
                h0(true);
                org.telegram.ui.ActionBar.f5 f5Var = this.f39010s;
                if (f5Var != null) {
                    if (m0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f5Var.Y(z10, true);
                }
                fi.d dVar = this.N;
                if (dVar != null) {
                    if (!z11 && this.U == closestTab) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f39011w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(org.telegram.messenger.id.G(size, "ArchiveStories", new Object[0]), z9, true);
                    } else {
                        dVar.i(org.telegram.messenger.id.M0(2131745909, null), z9, true);
                    }
                    this.U = closestTab;
                }
                org.telegram.ui.ActionBar.z0 z0Var5 = this.G;
                if (z0Var5 != null) {
                    if (m0 <= 0) {
                        z12 = false;
                    }
                    z0Var5.setEnabled(z12);
                    org.telegram.ui.ActionBar.z0 z0Var6 = this.G;
                    if (z12) {
                        f12 = 1.0f;
                    }
                    z0Var6.setAlpha(f12);
                }
            }
        }
    }

    @Override
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        if (getLastStoryViewer() != null && getLastStoryViewer().y()) {
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

    public final void h0(boolean z9) {
        long j3;
        String str;
        TLRPC.User user;
        int i7 = this.f39003a;
        boolean z10 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            int i10 = 2131746634;
            if (i7 == 2) {
                str = org.telegram.messenger.id.M0(2131746634, null);
            } else if (i7 == 1) {
                u80 u80Var = this.R;
                if (u80Var != null && u80Var.getClosestTab() != 9) {
                    z10 = false;
                }
                if (!z10) {
                    i10 = 2131746655;
                }
                str = org.telegram.messenger.id.M0(i10, null);
            } else {
                if (this.f39007f != 0 && this.f39006e == getUserConfig().e()) {
                    j3 = this.f39007f;
                } else {
                    j3 = this.f39006e;
                }
                if (j3 == 2666000) {
                    str = org.telegram.messenger.id.M0(2131754252, null);
                } else if (this.f39007f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.id.M0(2131748303, null);
                } else if (org.telegram.messenger.m5.C(j3)) {
                    TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (j3 & 4294967295L)));
                    if (a12 != null) {
                        user = getMessagesController().a2(Long.valueOf(a12.user_id));
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.m5.E(j3)) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        if (a22.self) {
                            str = org.telegram.messenger.id.M0(2131745901, null);
                        } else {
                            str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                        }
                    }
                    str = null;
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                    if (M0 != null) {
                        str = M0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.id.M0(2131745415, null);
                }
            }
        }
        String str2 = str;
        boolean z11 = z10;
        if (TextUtils.equals(this.T, str2)) {
            return;
        }
        this.T = str2;
        if (z9) {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            y4Var.getClass();
            y4Var.B(str2, z11, 320L, xq.h);
            return;
        }
        this.simpleActionBar.setTitle(str2);
    }

    public final void i0(boolean z9, boolean z10) {
        float f10;
        this.I.setEnabled(z9);
        ViewPropertyAnimator animate = this.I.animate();
        float f11 = 0.5f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        this.H.setEnabled(z10);
        ViewPropertyAnimator animate2 = this.H.animate();
        if (z10) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).start();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.K0()) {
            return false;
        }
        u80 u80Var = this.R;
        if (u80Var.getSelectedTab() != u80Var.K0.getFirstTabId()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
        } else {
            u80 u80Var = this.R;
            if (u80Var.E1) {
                if (z9) {
                    u80Var.V(false);
                }
            } else {
                return super.onBackPressed(z9);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        this.f39003a = getArguments().getInt("type", 0);
        this.f39006e = getArguments().getLong("dialog_id");
        this.f39007f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f39008n = getArguments().getString("username", "");
        this.f39009r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f39003a;
        if (i10 == 2) {
            i7 = 9;
        } else if (i10 == 1) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.S = getArguments().getInt("start_from", i7);
        getNotificationCenter().c(this, org.telegram.messenger.qs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.Z2);
        if (org.telegram.messenger.m5.E(this.f39006e) && this.f39007f == 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f39006e));
            if (org.telegram.messenger.t10.B(a22)) {
                getMessagesController().g3(a22, false, this.classGuid);
                this.d = getMessagesController().b2(this.f39006e);
            }
        }
        if (this.f39004b == null) {
            this.f39004b = new rs0(this);
        }
        this.f39004b.f37803y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25001f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.Z2);
        bi.u7 u7Var = this.Q;
        if (u7Var != null) {
            this.Q = null;
            org.telegram.messenger.g0.h3(u7Var);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        b0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
