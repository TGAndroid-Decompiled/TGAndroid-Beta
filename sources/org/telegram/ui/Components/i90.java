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
public final class i90 extends org.telegram.ui.ActionBar.h2 implements zs0, pg.b, org.telegram.messenger.fs {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.z0 H;
    public org.telegram.ui.ActionBar.z0 I;
    public org.telegram.ui.ActionBar.z0 J;
    public org.telegram.ui.ne0 K;
    public final qh.b[] L;
    public int M;
    public FrameLayout N;
    public hi.d O;
    public te.a P;
    public View Q;
    public di.p6 R;
    public h90 S;
    public int T;
    public String U;
    public int V;
    public int f36075a;
    public ys0 f36076b;
    public TLRPC.ChatFull f36077c;
    public TLRPC.UserFull d;
    public long f36078e;
    public long f36079f;
    public String h;
    public String f36080n;
    public int f36081r;
    public org.telegram.ui.ActionBar.h5 f36082s;
    public SparseArray f36083w;
    public org.telegram.ui.ActionBar.z0 f36084x;
    public org.telegram.ui.ActionBar.z0 f36085y;

    public i90(Bundle bundle, ys0 ys0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qh.b[2];
        this.M = -1;
        this.f36076b = ys0Var;
    }

    public static int a0(i90 i90Var) {
        return i90Var.classGuid;
    }

    @Override
    public final List F() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.r5 r5Var = sg.b1.f57163m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new pg.a(str.concat(" shape detector learning debug"), new e90(this, 1)));
    }

    @Override
    public final void R() {
        ys0 ys0Var;
        h90 h90Var = this.S;
        if (h90Var != null && (ys0Var = this.f36076b) != null) {
            h90Var.setNewMediaCounts(ys0Var.f42628c);
        }
        g0();
    }

    public final void b0() {
        int i7;
        if (this.S == null) {
            return;
        }
        int i10 = 0;
        if (this.K != null) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        h90 h90Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15893b;
        int[] iArr = gt0.f35563t2;
        h90Var.n1(ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), ri.a.c(this.mSystemInsets.f15893b), ri.a.c(this.mSystemInsets.d + i7), this.mSystemInsets.d + i7);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15893b;
            if (this.Q.getLayoutParams().height != topPanelShift) {
                this.Q.getLayoutParams().height = topPanelShift;
                this.Q.requestLayout();
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
        if (this.K == null) {
            return;
        }
        float f10 = this.P.f57657e;
        float L = org.telegram.messenger.g0.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f10) + (-i7));
        float f11 = 1.0f - f10;
        this.K.setAlpha(f11);
        org.telegram.ui.ne0 ne0Var = this.K;
        int i11 = 4;
        if (f10 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ne0Var.setVisibility(i10);
        this.N.setTranslationY((L * f11) + (-this.mSystemInsets.d));
        this.N.setAlpha(f10);
        FrameLayout frameLayout = this.N;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        frameLayout.setVisibility(i11);
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.S.K0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        ri.a aVar;
        int childCount;
        int i7;
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 17));
        bi.a3 a3Var = new bi.a3(22, context, this);
        this.fragmentView = a3Var;
        if (this.f36075a == 0 && this.f36078e == getUserConfig().e() && this.f36079f == 0 && !getMessagesController().I1().f26296b && getMessagesController().I1().e()) {
            this.T = 11;
        }
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        h90 h90Var = new h90(this, context, this.f36078e, this.f36076b, this.f36077c, this.d, this.T, this, new g90(this), getResourceProvider(), baseSimpleGlass.f56616c);
        this.S = h90Var;
        h90Var.setOnTopPanelShiftChanged(new e90(this, 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        a3Var.addView(this.S, c8.ma.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(0, 2131231244);
            this.f36082s = b10;
            b10.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
            this.f36082s.Z(false, false);
            org.telegram.ui.ActionBar.z0 e10 = this.f36082s.e(8, 2131232440, org.telegram.messenger.gd.M0(2131748458, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final i90 f35043b;

                {
                    this.f35043b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    gc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    i90 i90Var = this.f35043b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = i90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                i90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = i90Var.S.R1(null, null);
                            if (R1 != null) {
                                i90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = i90Var.E;
                            if (z11 && !i90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = i90Var.f36084x;
                                int i13 = -i90Var.G;
                                i90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = i90Var.f36084x;
                            boolean z12 = !z11;
                            i90Var.E = z12;
                            z0Var2.setChecked(z12);
                            h90 h90Var2 = i90Var.S;
                            boolean z13 = i90Var.E;
                            boolean z14 = i90Var.F;
                            qr0 qr0Var = h90Var2.f35586f0;
                            if (qr0Var != null && (h6Var2 = qr0Var.f34504s) != null) {
                                h6Var2.f12053n = z13;
                                h6Var2.f12054o = z14;
                                h6Var2.d(true);
                            }
                            cq0 cq0Var = h90Var2.f35592h0;
                            if (cq0Var != null && (h6Var = cq0Var.f34504s) != null) {
                                h6Var.f12053n = z13;
                                h6Var.f12054o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = i90Var.F;
                            if (z15 && !i90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = i90Var.f36085y;
                                int i14 = -i90Var.G;
                                i90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = i90Var.f36085y;
                            boolean z16 = !z15;
                            i90Var.F = z16;
                            z0Var4.setChecked(z16);
                            h90 h90Var3 = i90Var.S;
                            boolean z17 = i90Var.E;
                            boolean z18 = i90Var.F;
                            qr0 qr0Var2 = h90Var3.f35586f0;
                            if (qr0Var2 != null && (h6Var4 = qr0Var2.f34504s) != null) {
                                h6Var4.f12053n = z17;
                                h6Var4.f12054o = z18;
                                h6Var4.d(true);
                            }
                            cq0 cq0Var2 = h90Var3.f35592h0;
                            if (cq0Var2 != null && (h6Var3 = cq0Var2.f34504s) != null) {
                                h6Var3.f12053n = z17;
                                h6Var3.f12054o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            i90 i90Var2 = this.f35043b;
                            di.p6 p6Var = i90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                i90Var2.R = null;
                            }
                            gc.e();
                            if (i90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (i90Var2.f36083w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < i90Var2.f36083w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) i90Var2.f36083w.valueAt(i16)).f23973l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            i90Var2.S.V(false);
                            if (z10) {
                                i90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                i90Var2.getMessagesController().R1().q0(i90Var2.f36078e, arrayList, false);
                                boolean[] zArr2 = {false};
                                i90Var2.R = new di.p6(i90Var2, arrayList, z10, 21);
                                n20 n20Var = new n20(i90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(i90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.M0(2131744249, null), org.telegram.messenger.gd.M0(2131743650, null), n20Var).j();
                                } else {
                                    j3 = lc.b0(i90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.M0(2131743650, null), 5000, false, n20Var).j();
                                }
                                j3.v = new dw(19, i90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e11 = this.f36082s.e(9, 2131232441, org.telegram.messenger.gd.M0(2131748457, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) {
                public final i90 f35043b;

                {
                    this.f35043b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    gc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    i90 i90Var = this.f35043b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = i90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                i90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = i90Var.S.R1(null, null);
                            if (R1 != null) {
                                i90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = i90Var.E;
                            if (z11 && !i90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = i90Var.f36084x;
                                int i13 = -i90Var.G;
                                i90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = i90Var.f36084x;
                            boolean z12 = !z11;
                            i90Var.E = z12;
                            z0Var2.setChecked(z12);
                            h90 h90Var2 = i90Var.S;
                            boolean z13 = i90Var.E;
                            boolean z14 = i90Var.F;
                            qr0 qr0Var = h90Var2.f35586f0;
                            if (qr0Var != null && (h6Var2 = qr0Var.f34504s) != null) {
                                h6Var2.f12053n = z13;
                                h6Var2.f12054o = z14;
                                h6Var2.d(true);
                            }
                            cq0 cq0Var = h90Var2.f35592h0;
                            if (cq0Var != null && (h6Var = cq0Var.f34504s) != null) {
                                h6Var.f12053n = z13;
                                h6Var.f12054o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = i90Var.F;
                            if (z15 && !i90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = i90Var.f36085y;
                                int i14 = -i90Var.G;
                                i90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = i90Var.f36085y;
                            boolean z16 = !z15;
                            i90Var.F = z16;
                            z0Var4.setChecked(z16);
                            h90 h90Var3 = i90Var.S;
                            boolean z17 = i90Var.E;
                            boolean z18 = i90Var.F;
                            qr0 qr0Var2 = h90Var3.f35586f0;
                            if (qr0Var2 != null && (h6Var4 = qr0Var2.f34504s) != null) {
                                h6Var4.f12053n = z17;
                                h6Var4.f12054o = z18;
                                h6Var4.d(true);
                            }
                            cq0 cq0Var2 = h90Var3.f35592h0;
                            if (cq0Var2 != null && (h6Var3 = cq0Var2.f34504s) != null) {
                                h6Var3.f12053n = z17;
                                h6Var3.f12054o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            i90 i90Var2 = this.f35043b;
                            di.p6 p6Var = i90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                i90Var2.R = null;
                            }
                            gc.e();
                            if (i90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (i90Var2.f36083w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < i90Var2.f36083w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) i90Var2.f36083w.valueAt(i16)).f23973l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            i90Var2.S.V(false);
                            if (z10) {
                                i90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                i90Var2.getMessagesController().R1().q0(i90Var2.f36078e, arrayList, false);
                                boolean[] zArr2 = {false};
                                i90Var2.R = new di.p6(i90Var2, arrayList, z10, 21);
                                n20 n20Var = new n20(i90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(i90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.M0(2131744249, null), org.telegram.messenger.gd.M0(2131743650, null), n20Var).j();
                                } else {
                                    j3 = lc.b0(i90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.M0(2131743650, null), 5000, false, n20Var).j();
                                }
                                j3.v = new dw(19, i90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e12 = this.f36082s.e(10, 2131232079, org.telegram.messenger.gd.M0(2131752631, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.f36082s.a(-1);
            org.telegram.ui.ActionBar.h5 h5Var = this.f36082s;
            org.telegram.ui.ActionBar.z0 d = h5Var.d(6, 0, null, org.telegram.messenger.gd.M0(2131748461, null), true, true, h5Var.f29934n0);
            this.f36084x = d;
            d.setChecked(this.E);
            this.f36084x.setOnClickListener(new View.OnClickListener(this) {
                public final i90 f35043b;

                {
                    this.f35043b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    gc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    i90 i90Var = this.f35043b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = i90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                i90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = i90Var.S.R1(null, null);
                            if (R1 != null) {
                                i90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = i90Var.E;
                            if (z11 && !i90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = i90Var.f36084x;
                                int i13 = -i90Var.G;
                                i90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = i90Var.f36084x;
                            boolean z12 = !z11;
                            i90Var.E = z12;
                            z0Var2.setChecked(z12);
                            h90 h90Var2 = i90Var.S;
                            boolean z13 = i90Var.E;
                            boolean z14 = i90Var.F;
                            qr0 qr0Var = h90Var2.f35586f0;
                            if (qr0Var != null && (h6Var2 = qr0Var.f34504s) != null) {
                                h6Var2.f12053n = z13;
                                h6Var2.f12054o = z14;
                                h6Var2.d(true);
                            }
                            cq0 cq0Var = h90Var2.f35592h0;
                            if (cq0Var != null && (h6Var = cq0Var.f34504s) != null) {
                                h6Var.f12053n = z13;
                                h6Var.f12054o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = i90Var.F;
                            if (z15 && !i90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = i90Var.f36085y;
                                int i14 = -i90Var.G;
                                i90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = i90Var.f36085y;
                            boolean z16 = !z15;
                            i90Var.F = z16;
                            z0Var4.setChecked(z16);
                            h90 h90Var3 = i90Var.S;
                            boolean z17 = i90Var.E;
                            boolean z18 = i90Var.F;
                            qr0 qr0Var2 = h90Var3.f35586f0;
                            if (qr0Var2 != null && (h6Var4 = qr0Var2.f34504s) != null) {
                                h6Var4.f12053n = z17;
                                h6Var4.f12054o = z18;
                                h6Var4.d(true);
                            }
                            cq0 cq0Var2 = h90Var3.f35592h0;
                            if (cq0Var2 != null && (h6Var3 = cq0Var2.f34504s) != null) {
                                h6Var3.f12053n = z17;
                                h6Var3.f12054o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            i90 i90Var2 = this.f35043b;
                            di.p6 p6Var = i90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                i90Var2.R = null;
                            }
                            gc.e();
                            if (i90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (i90Var2.f36083w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < i90Var2.f36083w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) i90Var2.f36083w.valueAt(i16)).f23973l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            i90Var2.S.V(false);
                            if (z10) {
                                i90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                i90Var2.getMessagesController().R1().q0(i90Var2.f36078e, arrayList, false);
                                boolean[] zArr2 = {false};
                                i90Var2.R = new di.p6(i90Var2, arrayList, z10, 21);
                                n20 n20Var = new n20(i90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(i90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.M0(2131744249, null), org.telegram.messenger.gd.M0(2131743650, null), n20Var).j();
                                } else {
                                    j3 = lc.b0(i90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.M0(2131743650, null), 5000, false, n20Var).j();
                                }
                                j3.v = new dw(19, i90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.h5 h5Var2 = this.f36082s;
            org.telegram.ui.ActionBar.z0 d2 = h5Var2.d(7, 0, null, org.telegram.messenger.gd.M0(2131748460, null), true, true, h5Var2.f29934n0);
            this.f36085y = d2;
            d2.setChecked(this.F);
            this.f36085y.setOnClickListener(new View.OnClickListener(this) {
                public final i90 f35043b;

                {
                    this.f35043b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    gc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    i90 i90Var = this.f35043b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = i90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                i90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = i90Var.S.R1(null, null);
                            if (R1 != null) {
                                i90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = i90Var.E;
                            if (z11 && !i90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = i90Var.f36084x;
                                int i13 = -i90Var.G;
                                i90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = i90Var.f36084x;
                            boolean z12 = !z11;
                            i90Var.E = z12;
                            z0Var2.setChecked(z12);
                            h90 h90Var2 = i90Var.S;
                            boolean z13 = i90Var.E;
                            boolean z14 = i90Var.F;
                            qr0 qr0Var = h90Var2.f35586f0;
                            if (qr0Var != null && (h6Var2 = qr0Var.f34504s) != null) {
                                h6Var2.f12053n = z13;
                                h6Var2.f12054o = z14;
                                h6Var2.d(true);
                            }
                            cq0 cq0Var = h90Var2.f35592h0;
                            if (cq0Var != null && (h6Var = cq0Var.f34504s) != null) {
                                h6Var.f12053n = z13;
                                h6Var.f12054o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = i90Var.F;
                            if (z15 && !i90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = i90Var.f36085y;
                                int i14 = -i90Var.G;
                                i90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = i90Var.f36085y;
                            boolean z16 = !z15;
                            i90Var.F = z16;
                            z0Var4.setChecked(z16);
                            h90 h90Var3 = i90Var.S;
                            boolean z17 = i90Var.E;
                            boolean z18 = i90Var.F;
                            qr0 qr0Var2 = h90Var3.f35586f0;
                            if (qr0Var2 != null && (h6Var4 = qr0Var2.f34504s) != null) {
                                h6Var4.f12053n = z17;
                                h6Var4.f12054o = z18;
                                h6Var4.d(true);
                            }
                            cq0 cq0Var2 = h90Var3.f35592h0;
                            if (cq0Var2 != null && (h6Var3 = cq0Var2.f34504s) != null) {
                                h6Var3.f12053n = z17;
                                h6Var3.f12054o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            i90 i90Var2 = this.f35043b;
                            di.p6 p6Var = i90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                i90Var2.R = null;
                            }
                            gc.e();
                            if (i90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (i90Var2.f36083w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < i90Var2.f36083w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) i90Var2.f36083w.valueAt(i16)).f23973l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            i90Var2.S.V(false);
                            if (z10) {
                                i90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                i90Var2.getMessagesController().R1().q0(i90Var2.f36078e, arrayList, false);
                                boolean[] zArr2 = {false};
                                i90Var2.R = new di.p6(i90Var2, arrayList, z10, 21);
                                n20 n20Var = new n20(i90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(i90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.M0(2131744249, null), org.telegram.messenger.gd.M0(2131743650, null), n20Var).j();
                                } else {
                                    j3 = lc.b0(i90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.M0(2131743650, null), 5000, false, n20Var).j();
                                }
                                j3.v = new dw(19, i90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i11 = this.f36075a;
        qh.b[] bVarArr = this.L;
        if (i11 == 1) {
            org.telegram.ui.ne0 ne0Var = new org.telegram.ui.ne0(context, getResourceProvider());
            this.K = ne0Var;
            ne0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746456);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.S, 2131746432);
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                bVarArr[i12].setOnClickListener(new ci.q(this, i12, 16));
                this.K.addView(bVarArr[i12]);
                this.K.j(bVarArr[i12], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.f56616c.c(this.K, c8.i0.g(getResourceProvider()), false);
            org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c10);
            a3Var.addView(this.K, c8.ma.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            hi.d dVar = new hi.d(context, getResourceProvider(), true);
            this.O = dVar;
            dVar.i(org.telegram.messenger.gd.M0(2131745714, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final i90 f35043b;

                {
                    this.f35043b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i112;
                    gc j3;
                    int i122 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    i90 i90Var = this.f35043b;
                    switch (i122) {
                        case 0:
                            Boolean Q1 = i90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                i90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = i90Var.S.R1(null, null);
                            if (R1 != null) {
                                i90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = i90Var.E;
                            if (z11 && !i90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = i90Var.f36084x;
                                int i13 = -i90Var.G;
                                i90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = i90Var.f36084x;
                            boolean z12 = !z11;
                            i90Var.E = z12;
                            z0Var2.setChecked(z12);
                            h90 h90Var2 = i90Var.S;
                            boolean z13 = i90Var.E;
                            boolean z14 = i90Var.F;
                            qr0 qr0Var = h90Var2.f35586f0;
                            if (qr0Var != null && (h6Var2 = qr0Var.f34504s) != null) {
                                h6Var2.f12053n = z13;
                                h6Var2.f12054o = z14;
                                h6Var2.d(true);
                            }
                            cq0 cq0Var = h90Var2.f35592h0;
                            if (cq0Var != null && (h6Var = cq0Var.f34504s) != null) {
                                h6Var.f12053n = z13;
                                h6Var.f12054o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = i90Var.F;
                            if (z15 && !i90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = i90Var.f36085y;
                                int i14 = -i90Var.G;
                                i90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = i90Var.f36085y;
                            boolean z16 = !z15;
                            i90Var.F = z16;
                            z0Var4.setChecked(z16);
                            h90 h90Var3 = i90Var.S;
                            boolean z17 = i90Var.E;
                            boolean z18 = i90Var.F;
                            qr0 qr0Var2 = h90Var3.f35586f0;
                            if (qr0Var2 != null && (h6Var4 = qr0Var2.f34504s) != null) {
                                h6Var4.f12053n = z17;
                                h6Var4.f12054o = z18;
                                h6Var4.d(true);
                            }
                            cq0 cq0Var2 = h90Var3.f35592h0;
                            if (cq0Var2 != null && (h6Var3 = cq0Var2.f34504s) != null) {
                                h6Var3.f12053n = z17;
                                h6Var3.f12054o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            i90 i90Var2 = this.f35043b;
                            di.p6 p6Var = i90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                i90Var2.R = null;
                            }
                            gc.e();
                            if (i90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (i90Var2.f36083w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < i90Var2.f36083w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) i90Var2.f36083w.valueAt(i16)).f23973l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i112 = i15;
                            } else {
                                i112 = 0;
                            }
                            i90Var2.S.V(false);
                            if (z10) {
                                i90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                i90Var2.getMessagesController().R1().q0(i90Var2.f36078e, arrayList, false);
                                boolean[] zArr2 = {false};
                                i90Var2.R = new di.p6(i90Var2, arrayList, z10, 21);
                                n20 n20Var = new n20(i90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(i90Var2).L(2131623990, org.telegram.messenger.gd.G(i112, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.M0(2131744249, null), org.telegram.messenger.gd.M0(2131743650, null), n20Var).j();
                                } else {
                                    j3 = lc.b0(i90Var2).J(2131623980, org.telegram.messenger.gd.G(i112, "StoryArchived", new Object[0]), org.telegram.messenger.gd.M0(2131743650, null), 5000, false, n20Var).j();
                                }
                                j3.v = new dw(19, i90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, c8.ma.c(56.0f, -1));
            this.N.setVisibility(4);
            a3Var.addView(this.N, c8.ma.e(-1, 72, 80));
            this.P = new te.a(0, new iy(this, 7), lr.h, 320L, false);
            setBulletinDelegate(new bi.e1(this, 9));
        } else {
            aVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.z(view);
        View view2 = this.Q;
        view2.setBackground(aVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(aVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.ne0 ne0Var2 = this.K;
        if (ne0Var2 != null) {
            childCount = a3Var.indexOfChild(ne0Var2);
        } else {
            childCount = a3Var.getChildCount();
        }
        a3Var.addView(view4, childCount, c8.ma.e(-1, 0, 80));
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        aVar.f56624m = a3Var;
        aVar.f56625n = null;
        aVar.g(a3Var, a5Var, resourceProvider);
        aVar.f56626o = new di.f(5, this, a3Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f36075a == 3 && (i7 = this.f36081r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.f36075a == 1) {
            if (this.T != 9) {
                i10 = 0;
            }
            org.telegram.ui.ne0 ne0Var3 = this.K;
            if (ne0Var3 != null && this.M != i10) {
                this.M = i10;
                ne0Var3.r(bVarArr[i10], false);
            }
        }
        return a3Var;
    }

    public final boolean d0() {
        int i7 = this.f36075a;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.E0 && ((Long) objArr[0]).longValue() == this.f36078e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            h90 h90Var = this.S;
            if (h90Var != null) {
                h90Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f36077c = chatFull;
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
        float f10;
        float f11;
        int size2;
        int i7;
        h90 h90Var = this.S;
        if (h90Var != null && this.simpleActionBar != null) {
            int closestTab = h90Var.getClosestTab();
            if (this.f36075a != 3 || closestTab == 8) {
                int[] iArr = this.f36076b.f42628c;
                boolean z12 = org.telegram.messenger.gd.f24216a0;
                boolean z13 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        f0(org.telegram.messenger.gd.G(getMessagesController().I1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.S.getPhotosVideosTypeFilter() == 1) {
                                    f0(org.telegram.messenger.gd.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                                    f0(org.telegram.messenger.gd.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    f0(org.telegram.messenger.gd.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                f0(org.telegram.messenger.gd.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                f0(org.telegram.messenger.gd.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                f0(org.telegram.messenger.gd.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                f0(org.telegram.messenger.gd.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                f0(org.telegram.messenger.gd.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i7 = iArr[8]) >= 0) {
                                f0(org.telegram.messenger.gd.G(i7, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                org.telegram.messenger.no N0 = org.telegram.messenger.mp.u1(this.currentAccount).N0(this.f36078e);
                                if (N0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = N0.f25955b.size() + N0.f25956c;
                                }
                                f0(org.telegram.messenger.gd.G(size2, "Channels", new Object[0]));
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
                org.telegram.ui.ActionBar.z0 z0Var = this.J;
                float f12 = 0.5f;
                if (z0Var != null) {
                    z0Var.setEnabled(this.S.K());
                    org.telegram.ui.ActionBar.z0 z0Var2 = this.J;
                    if (z0Var2.isEnabled()) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.5f;
                    }
                    z0Var2.setAlpha(f11);
                }
                org.telegram.ui.ActionBar.z0 z0Var3 = this.I;
                if (z0Var3 != null) {
                    z0Var3.setEnabled(this.S.J());
                    org.telegram.ui.ActionBar.z0 z0Var4 = this.I;
                    if (z0Var4.isEnabled()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    z0Var4.setAlpha(f10);
                }
                int m0 = this.S.m0(closestTab);
                if (this.f36075a == 3) {
                    if (m0 > 0) {
                        f0(org.telegram.messenger.gd.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    if (m0 > 0) {
                        str2 = org.telegram.messenger.gd.G(m0, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    f0(str2);
                } else {
                    if (m0 > 0) {
                        str = org.telegram.messenger.gd.G(m0, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    f0(str);
                }
                h0(true);
                org.telegram.ui.ActionBar.h5 h5Var = this.f36082s;
                if (h5Var != null) {
                    if (m0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h5Var.Z(z11, true);
                }
                hi.d dVar = this.O;
                if (dVar != null) {
                    if (!z12 && this.V == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f36083w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(org.telegram.messenger.gd.G(size, "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        dVar.i(org.telegram.messenger.gd.M0(2131745714, null), z10, true);
                    }
                    this.V = closestTab;
                }
                org.telegram.ui.ActionBar.z0 z0Var5 = this.H;
                if (z0Var5 != null) {
                    if (m0 <= 0) {
                        z13 = false;
                    }
                    z0Var5.setEnabled(z13);
                    org.telegram.ui.ActionBar.z0 z0Var6 = this.H;
                    if (z13) {
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
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z10) {
        long j3;
        String str;
        TLRPC.User user;
        int i7 = this.f36075a;
        boolean z11 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            int i10 = 2131746439;
            if (i7 == 2) {
                str = org.telegram.messenger.gd.M0(2131746439, null);
            } else if (i7 == 1) {
                h90 h90Var = this.S;
                if (h90Var != null && h90Var.getClosestTab() != 9) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = 2131746460;
                }
                str = org.telegram.messenger.gd.M0(i10, null);
            } else {
                if (this.f36079f != 0 && this.f36078e == getUserConfig().e()) {
                    j3 = this.f36079f;
                } else {
                    j3 = this.f36078e;
                }
                if (j3 == 2666000) {
                    str = org.telegram.messenger.gd.M0(2131754250, null);
                } else if (this.f36079f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.gd.M0(2131748111, null);
                } else if (org.telegram.messenger.n5.C(j3)) {
                    TLRPC.EncryptedChat c12 = getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L)));
                    if (c12 != null) {
                        user = getMessagesController().c2(Long.valueOf(c12.user_id));
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.n5.E(j3)) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                        if (c22.self) {
                            str = org.telegram.messenger.gd.M0(2131745706, null);
                        } else {
                            str = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
                        }
                    }
                    str = null;
                } else {
                    TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                    if (O0 != null) {
                        str = O0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.gd.M0(2131745220, null);
                }
            }
        }
        String str2 = str;
        boolean z12 = z11;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        if (z10) {
            org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
            a5Var.getClass();
            a5Var.I(str2, z12, 320L, lr.h);
            return;
        }
        this.simpleActionBar.setTitle(str2);
    }

    public final void i0(boolean z10, boolean z11) {
        float f10;
        this.J.setEnabled(z10);
        ViewPropertyAnimator animate = this.J.animate();
        float f11 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).start();
        this.I.setEnabled(z11);
        ViewPropertyAnimator animate2 = this.I.animate();
        if (z11) {
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
        if (!this.S.K0()) {
            return false;
        }
        h90 h90Var = this.S;
        if (h90Var.getSelectedTab() != h90Var.L0.getFirstTabId()) {
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
            h90 h90Var = this.S;
            if (h90Var.F1) {
                if (z10) {
                    h90Var.V(false);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        this.f36075a = getArguments().getInt("type", 0);
        this.f36078e = getArguments().getLong("dialog_id");
        this.f36079f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f36080n = getArguments().getString("username", "");
        this.f36081r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f36075a;
        if (i10 == 2) {
            i7 = 9;
        } else if (i10 == 1) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.T = getArguments().getInt("start_from", i7);
        getNotificationCenter().c(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25129h5);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25092b3);
        if (org.telegram.messenger.n5.E(this.f36078e) && this.f36079f == 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f36078e));
            if (org.telegram.messenger.o10.C(c22)) {
                getMessagesController().n3(c22, false, this.classGuid);
                this.d = getMessagesController().d2(this.f36078e);
            }
        }
        if (this.f36076b == null) {
            this.f36076b = new ys0(this);
        }
        this.f36076b.f42636y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25129h5);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25092b3);
        di.p6 p6Var = this.R;
        if (p6Var != null) {
            this.R = null;
            org.telegram.messenger.g0.g3(p6Var);
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
