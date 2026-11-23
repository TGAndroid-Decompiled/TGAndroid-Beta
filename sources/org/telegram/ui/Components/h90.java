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
public final class h90 extends org.telegram.ui.ActionBar.g2 implements bt0, pg.b, org.telegram.messenger.fs {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.y0 H;
    public org.telegram.ui.ActionBar.y0 I;
    public org.telegram.ui.ActionBar.y0 J;
    public org.telegram.ui.ne0 K;
    public final qh.b[] L;
    public int M;
    public FrameLayout N;
    public hi.e O;
    public te.a P;
    public View Q;
    public di.p6 R;
    public g90 S;
    public int T;
    public String U;
    public int V;
    public int f35688a;
    public at0 f35689b;
    public TLRPC.ChatFull f35690c;
    public TLRPC.UserFull d;
    public long f35691e;
    public long f35692f;
    public String h;
    public String f35693n;
    public int f35694r;
    public org.telegram.ui.ActionBar.g5 f35695s;
    public SparseArray f35696w;
    public org.telegram.ui.ActionBar.y0 f35697x;
    public org.telegram.ui.ActionBar.y0 f35698y;

    public h90(Bundle bundle, at0 at0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qh.b[2];
        this.M = -1;
        this.f35689b = at0Var;
    }

    public static int a0(h90 h90Var) {
        return h90Var.classGuid;
    }

    @Override
    public final List E() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.r5 r5Var = sg.a1.f57281m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new pg.a(str.concat(" shape detector learning debug"), new d90(this, 1)));
    }

    @Override
    public final void R() {
        at0 at0Var;
        g90 g90Var = this.S;
        if (g90Var != null && (at0Var = this.f35689b) != null) {
            g90Var.setNewMediaCounts(at0Var.f33553c);
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
        g90 g90Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15979b;
        int[] iArr = it0.f36087t2;
        g90Var.n1(ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), ri.a.c(this.mSystemInsets.f15979b), ri.a.c(this.mSystemInsets.d + i7), this.mSystemInsets.d + i7);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15979b;
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
        float f10 = this.P.f57779e;
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 17));
        bi.g3 g3Var = new bi.g3(22, context, this);
        this.fragmentView = g3Var;
        if (this.f35688a == 0 && this.f35691e == getUserConfig().e() && this.f35692f == 0 && !getMessagesController().I1().f26388b && getMessagesController().I1().e()) {
            this.T = 11;
        }
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        g90 g90Var = new g90(this, context, this.f35691e, this.f35689b, this.f35690c, this.d, this.T, this, new f90(this), getResourceProvider(), baseSimpleGlass.f56739c);
        this.S = g90Var;
        g90Var.setOnTopPanelShiftChanged(new d90(this, 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        g3Var.addView(this.S, c8.na.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131231247);
            this.f35695s = b10;
            b10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
            this.f35695s.Z(false, false);
            org.telegram.ui.ActionBar.y0 e10 = this.f35695s.e(8, 2131232443, org.telegram.messenger.gd.N0(2131748457, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final h90 f34673b;

                {
                    this.f34673b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    fc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    h90 h90Var = this.f34673b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = h90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                h90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = h90Var.S.R1(null, null);
                            if (R1 != null) {
                                h90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = h90Var.E;
                            if (z11 && !h90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = h90Var.f35697x;
                                int i13 = -h90Var.G;
                                h90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = h90Var.f35697x;
                            boolean z12 = !z11;
                            h90Var.E = z12;
                            y0Var2.setChecked(z12);
                            g90 g90Var2 = h90Var.S;
                            boolean z13 = h90Var.E;
                            boolean z14 = h90Var.F;
                            rr0 rr0Var = g90Var2.f36110f0;
                            if (rr0Var != null && (h6Var2 = rr0Var.f35199s) != null) {
                                h6Var2.f12056n = z13;
                                h6Var2.f12057o = z14;
                                h6Var2.d(true);
                            }
                            dq0 dq0Var = g90Var2.f36116h0;
                            if (dq0Var != null && (h6Var = dq0Var.f35199s) != null) {
                                h6Var.f12056n = z13;
                                h6Var.f12057o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = h90Var.F;
                            if (z15 && !h90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = h90Var.f35698y;
                                int i14 = -h90Var.G;
                                h90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = h90Var.f35698y;
                            boolean z16 = !z15;
                            h90Var.F = z16;
                            y0Var4.setChecked(z16);
                            g90 g90Var3 = h90Var.S;
                            boolean z17 = h90Var.E;
                            boolean z18 = h90Var.F;
                            rr0 rr0Var2 = g90Var3.f36110f0;
                            if (rr0Var2 != null && (h6Var4 = rr0Var2.f35199s) != null) {
                                h6Var4.f12056n = z17;
                                h6Var4.f12057o = z18;
                                h6Var4.d(true);
                            }
                            dq0 dq0Var2 = g90Var3.f36116h0;
                            if (dq0Var2 != null && (h6Var3 = dq0Var2.f35199s) != null) {
                                h6Var3.f12056n = z17;
                                h6Var3.f12057o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            h90 h90Var2 = this.f34673b;
                            di.p6 p6Var = h90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                h90Var2.R = null;
                            }
                            fc.e();
                            if (h90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (h90Var2.f35696w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < h90Var2.f35696w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) h90Var2.f35696w.valueAt(i16)).f24078l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            h90Var2.S.V(false);
                            if (z10) {
                                h90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                h90Var2.getMessagesController().R1().q0(h90Var2.f35691e, arrayList, false);
                                boolean[] zArr2 = {false};
                                h90Var2.R = new di.p6(h90Var2, arrayList, z10, 21);
                                xz xzVar = new xz(h90Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j3 = kc.b0(h90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743640, null), xzVar).j();
                                } else {
                                    j3 = kc.b0(h90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743640, null), 5000, false, xzVar).j();
                                }
                                j3.v = new bt(23, h90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e11 = this.f35695s.e(9, 2131232444, org.telegram.messenger.gd.N0(2131748456, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) {
                public final h90 f34673b;

                {
                    this.f34673b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    fc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    h90 h90Var = this.f34673b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = h90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                h90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = h90Var.S.R1(null, null);
                            if (R1 != null) {
                                h90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = h90Var.E;
                            if (z11 && !h90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = h90Var.f35697x;
                                int i13 = -h90Var.G;
                                h90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = h90Var.f35697x;
                            boolean z12 = !z11;
                            h90Var.E = z12;
                            y0Var2.setChecked(z12);
                            g90 g90Var2 = h90Var.S;
                            boolean z13 = h90Var.E;
                            boolean z14 = h90Var.F;
                            rr0 rr0Var = g90Var2.f36110f0;
                            if (rr0Var != null && (h6Var2 = rr0Var.f35199s) != null) {
                                h6Var2.f12056n = z13;
                                h6Var2.f12057o = z14;
                                h6Var2.d(true);
                            }
                            dq0 dq0Var = g90Var2.f36116h0;
                            if (dq0Var != null && (h6Var = dq0Var.f35199s) != null) {
                                h6Var.f12056n = z13;
                                h6Var.f12057o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = h90Var.F;
                            if (z15 && !h90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = h90Var.f35698y;
                                int i14 = -h90Var.G;
                                h90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = h90Var.f35698y;
                            boolean z16 = !z15;
                            h90Var.F = z16;
                            y0Var4.setChecked(z16);
                            g90 g90Var3 = h90Var.S;
                            boolean z17 = h90Var.E;
                            boolean z18 = h90Var.F;
                            rr0 rr0Var2 = g90Var3.f36110f0;
                            if (rr0Var2 != null && (h6Var4 = rr0Var2.f35199s) != null) {
                                h6Var4.f12056n = z17;
                                h6Var4.f12057o = z18;
                                h6Var4.d(true);
                            }
                            dq0 dq0Var2 = g90Var3.f36116h0;
                            if (dq0Var2 != null && (h6Var3 = dq0Var2.f35199s) != null) {
                                h6Var3.f12056n = z17;
                                h6Var3.f12057o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            h90 h90Var2 = this.f34673b;
                            di.p6 p6Var = h90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                h90Var2.R = null;
                            }
                            fc.e();
                            if (h90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (h90Var2.f35696w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < h90Var2.f35696w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) h90Var2.f35696w.valueAt(i16)).f24078l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            h90Var2.S.V(false);
                            if (z10) {
                                h90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                h90Var2.getMessagesController().R1().q0(h90Var2.f35691e, arrayList, false);
                                boolean[] zArr2 = {false};
                                h90Var2.R = new di.p6(h90Var2, arrayList, z10, 21);
                                xz xzVar = new xz(h90Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j3 = kc.b0(h90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743640, null), xzVar).j();
                                } else {
                                    j3 = kc.b0(h90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743640, null), 5000, false, xzVar).j();
                                }
                                j3.v = new bt(23, h90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e12 = this.f35695s.e(10, 2131232082, org.telegram.messenger.gd.N0(2131752630, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.f35695s.a(-1);
            org.telegram.ui.ActionBar.g5 g5Var = this.f35695s;
            org.telegram.ui.ActionBar.y0 d = g5Var.d(6, 0, null, org.telegram.messenger.gd.N0(2131748460, null), true, true, g5Var.f29975n0);
            this.f35697x = d;
            d.setChecked(this.E);
            this.f35697x.setOnClickListener(new View.OnClickListener(this) {
                public final h90 f34673b;

                {
                    this.f34673b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    fc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    h90 h90Var = this.f34673b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = h90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                h90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = h90Var.S.R1(null, null);
                            if (R1 != null) {
                                h90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = h90Var.E;
                            if (z11 && !h90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = h90Var.f35697x;
                                int i13 = -h90Var.G;
                                h90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = h90Var.f35697x;
                            boolean z12 = !z11;
                            h90Var.E = z12;
                            y0Var2.setChecked(z12);
                            g90 g90Var2 = h90Var.S;
                            boolean z13 = h90Var.E;
                            boolean z14 = h90Var.F;
                            rr0 rr0Var = g90Var2.f36110f0;
                            if (rr0Var != null && (h6Var2 = rr0Var.f35199s) != null) {
                                h6Var2.f12056n = z13;
                                h6Var2.f12057o = z14;
                                h6Var2.d(true);
                            }
                            dq0 dq0Var = g90Var2.f36116h0;
                            if (dq0Var != null && (h6Var = dq0Var.f35199s) != null) {
                                h6Var.f12056n = z13;
                                h6Var.f12057o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = h90Var.F;
                            if (z15 && !h90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = h90Var.f35698y;
                                int i14 = -h90Var.G;
                                h90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = h90Var.f35698y;
                            boolean z16 = !z15;
                            h90Var.F = z16;
                            y0Var4.setChecked(z16);
                            g90 g90Var3 = h90Var.S;
                            boolean z17 = h90Var.E;
                            boolean z18 = h90Var.F;
                            rr0 rr0Var2 = g90Var3.f36110f0;
                            if (rr0Var2 != null && (h6Var4 = rr0Var2.f35199s) != null) {
                                h6Var4.f12056n = z17;
                                h6Var4.f12057o = z18;
                                h6Var4.d(true);
                            }
                            dq0 dq0Var2 = g90Var3.f36116h0;
                            if (dq0Var2 != null && (h6Var3 = dq0Var2.f35199s) != null) {
                                h6Var3.f12056n = z17;
                                h6Var3.f12057o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            h90 h90Var2 = this.f34673b;
                            di.p6 p6Var = h90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                h90Var2.R = null;
                            }
                            fc.e();
                            if (h90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (h90Var2.f35696w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < h90Var2.f35696w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) h90Var2.f35696w.valueAt(i16)).f24078l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            h90Var2.S.V(false);
                            if (z10) {
                                h90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                h90Var2.getMessagesController().R1().q0(h90Var2.f35691e, arrayList, false);
                                boolean[] zArr2 = {false};
                                h90Var2.R = new di.p6(h90Var2, arrayList, z10, 21);
                                xz xzVar = new xz(h90Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j3 = kc.b0(h90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743640, null), xzVar).j();
                                } else {
                                    j3 = kc.b0(h90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743640, null), 5000, false, xzVar).j();
                                }
                                j3.v = new bt(23, h90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.g5 g5Var2 = this.f35695s;
            org.telegram.ui.ActionBar.y0 d2 = g5Var2.d(7, 0, null, org.telegram.messenger.gd.N0(2131748459, null), true, true, g5Var2.f29975n0);
            this.f35698y = d2;
            d2.setChecked(this.F);
            this.f35698y.setOnClickListener(new View.OnClickListener(this) {
                public final h90 f34673b;

                {
                    this.f34673b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i11;
                    fc j3;
                    int i12 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    h90 h90Var = this.f34673b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = h90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                h90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = h90Var.S.R1(null, null);
                            if (R1 != null) {
                                h90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = h90Var.E;
                            if (z11 && !h90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = h90Var.f35697x;
                                int i13 = -h90Var.G;
                                h90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = h90Var.f35697x;
                            boolean z12 = !z11;
                            h90Var.E = z12;
                            y0Var2.setChecked(z12);
                            g90 g90Var2 = h90Var.S;
                            boolean z13 = h90Var.E;
                            boolean z14 = h90Var.F;
                            rr0 rr0Var = g90Var2.f36110f0;
                            if (rr0Var != null && (h6Var2 = rr0Var.f35199s) != null) {
                                h6Var2.f12056n = z13;
                                h6Var2.f12057o = z14;
                                h6Var2.d(true);
                            }
                            dq0 dq0Var = g90Var2.f36116h0;
                            if (dq0Var != null && (h6Var = dq0Var.f35199s) != null) {
                                h6Var.f12056n = z13;
                                h6Var.f12057o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = h90Var.F;
                            if (z15 && !h90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = h90Var.f35698y;
                                int i14 = -h90Var.G;
                                h90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = h90Var.f35698y;
                            boolean z16 = !z15;
                            h90Var.F = z16;
                            y0Var4.setChecked(z16);
                            g90 g90Var3 = h90Var.S;
                            boolean z17 = h90Var.E;
                            boolean z18 = h90Var.F;
                            rr0 rr0Var2 = g90Var3.f36110f0;
                            if (rr0Var2 != null && (h6Var4 = rr0Var2.f35199s) != null) {
                                h6Var4.f12056n = z17;
                                h6Var4.f12057o = z18;
                                h6Var4.d(true);
                            }
                            dq0 dq0Var2 = g90Var3.f36116h0;
                            if (dq0Var2 != null && (h6Var3 = dq0Var2.f35199s) != null) {
                                h6Var3.f12056n = z17;
                                h6Var3.f12057o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            h90 h90Var2 = this.f34673b;
                            di.p6 p6Var = h90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                h90Var2.R = null;
                            }
                            fc.e();
                            if (h90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (h90Var2.f35696w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < h90Var2.f35696w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) h90Var2.f35696w.valueAt(i16)).f24078l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            h90Var2.S.V(false);
                            if (z10) {
                                h90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                h90Var2.getMessagesController().R1().q0(h90Var2.f35691e, arrayList, false);
                                boolean[] zArr2 = {false};
                                h90Var2.R = new di.p6(h90Var2, arrayList, z10, 21);
                                xz xzVar = new xz(h90Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j3 = kc.b0(h90Var2).L(2131623990, org.telegram.messenger.gd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743640, null), xzVar).j();
                                } else {
                                    j3 = kc.b0(h90Var2).J(2131623980, org.telegram.messenger.gd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743640, null), 5000, false, xzVar).j();
                                }
                                j3.v = new bt(23, h90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i11 = this.f35688a;
        qh.b[] bVarArr = this.L;
        if (i11 == 1) {
            org.telegram.ui.ne0 ne0Var = new org.telegram.ui.ne0(context, getResourceProvider());
            this.K = ne0Var;
            ne0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746455);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.S, 2131746431);
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                bVarArr[i12].setOnClickListener(new ci.q(this, i12, 16));
                this.K.addView(bVarArr[i12]);
                this.K.j(bVarArr[i12], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.f56739c.c(this.K, c8.j0.g(getResourceProvider()), false);
            org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c10);
            g3Var.addView(this.K, c8.na.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            hi.e eVar = new hi.e(context, getResourceProvider(), true);
            this.O = eVar;
            eVar.i(org.telegram.messenger.gd.N0(2131745713, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final h90 f34673b;

                {
                    this.f34673b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.h6 h6Var;
                    fi.h6 h6Var2;
                    fi.h6 h6Var3;
                    fi.h6 h6Var4;
                    boolean z10;
                    int i112;
                    fc j3;
                    int i122 = r2;
                    org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                    h90 h90Var = this.f34673b;
                    switch (i122) {
                        case 0:
                            Boolean Q1 = h90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                h90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = h90Var.S.R1(null, null);
                            if (R1 != null) {
                                h90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = h90Var.E;
                            if (z11 && !h90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = h90Var.f35697x;
                                int i13 = -h90Var.G;
                                h90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = h90Var.f35697x;
                            boolean z12 = !z11;
                            h90Var.E = z12;
                            y0Var2.setChecked(z12);
                            g90 g90Var2 = h90Var.S;
                            boolean z13 = h90Var.E;
                            boolean z14 = h90Var.F;
                            rr0 rr0Var = g90Var2.f36110f0;
                            if (rr0Var != null && (h6Var2 = rr0Var.f35199s) != null) {
                                h6Var2.f12056n = z13;
                                h6Var2.f12057o = z14;
                                h6Var2.d(true);
                            }
                            dq0 dq0Var = g90Var2.f36116h0;
                            if (dq0Var != null && (h6Var = dq0Var.f35199s) != null) {
                                h6Var.f12056n = z13;
                                h6Var.f12057o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = h90Var.F;
                            if (z15 && !h90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = h90Var.f35698y;
                                int i14 = -h90Var.G;
                                h90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = h90Var.f35698y;
                            boolean z16 = !z15;
                            h90Var.F = z16;
                            y0Var4.setChecked(z16);
                            g90 g90Var3 = h90Var.S;
                            boolean z17 = h90Var.E;
                            boolean z18 = h90Var.F;
                            rr0 rr0Var2 = g90Var3.f36110f0;
                            if (rr0Var2 != null && (h6Var4 = rr0Var2.f35199s) != null) {
                                h6Var4.f12056n = z17;
                                h6Var4.f12057o = z18;
                                h6Var4.d(true);
                            }
                            dq0 dq0Var2 = g90Var3.f36116h0;
                            if (dq0Var2 != null && (h6Var3 = dq0Var2.f35199s) != null) {
                                h6Var3.f12056n = z17;
                                h6Var3.f12057o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            h90 h90Var2 = this.f34673b;
                            di.p6 p6Var = h90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                h90Var2.R = null;
                            }
                            fc.e();
                            if (h90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (h90Var2.f35696w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < h90Var2.f35696w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.fj) h90Var2.f35696w.valueAt(i16)).f24078l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i112 = i15;
                            } else {
                                i112 = 0;
                            }
                            h90Var2.S.V(false);
                            if (z10) {
                                h90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                h90Var2.getMessagesController().R1().q0(h90Var2.f35691e, arrayList, false);
                                boolean[] zArr2 = {false};
                                h90Var2.R = new di.p6(h90Var2, arrayList, z10, 21);
                                xz xzVar = new xz(h90Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j3 = kc.b0(h90Var2).L(2131623990, org.telegram.messenger.gd.G(i112, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743640, null), xzVar).j();
                                } else {
                                    j3 = kc.b0(h90Var2).J(2131623980, org.telegram.messenger.gd.G(i112, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743640, null), 5000, false, xzVar).j();
                                }
                                j3.v = new bt(23, h90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, c8.na.c(56.0f, -1));
            this.N.setVisibility(4);
            g3Var.addView(this.N, c8.na.e(-1, 72, 80));
            this.P = new te.a(0, new hy(this, 7), kr.h, 320L, false);
            setBulletinDelegate(new bi.i1(this, 9));
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
            childCount = g3Var.indexOfChild(ne0Var2);
        } else {
            childCount = g3Var.getChildCount();
        }
        g3Var.addView(view4, childCount, c8.na.e(-1, 0, 80));
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        aVar.f56747m = g3Var;
        aVar.f56748n = null;
        aVar.g(g3Var, z4Var, resourceProvider);
        aVar.f56749o = new di.f(5, this, g3Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f35688a == 3 && (i7 = this.f35694r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.f35688a == 1) {
            if (this.T != 9) {
                i10 = 0;
            }
            org.telegram.ui.ne0 ne0Var3 = this.K;
            if (ne0Var3 != null && this.M != i10) {
                this.M = i10;
                ne0Var3.r(bVarArr[i10], false);
            }
        }
        return g3Var;
    }

    public final boolean d0() {
        int i7 = this.f35688a;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.E0 && ((Long) objArr[0]).longValue() == this.f35691e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            g90 g90Var = this.S;
            if (g90Var != null) {
                g90Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f35690c = chatFull;
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
        g90 g90Var = this.S;
        if (g90Var != null && this.simpleActionBar != null) {
            int closestTab = g90Var.getClosestTab();
            if (this.f35688a != 3 || closestTab == 8) {
                int[] iArr = this.f35689b.f33553c;
                boolean z12 = org.telegram.messenger.gd.f24314a0;
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
                                org.telegram.messenger.no N0 = org.telegram.messenger.mp.u1(this.currentAccount).N0(this.f35691e);
                                if (N0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = N0.f26049b.size() + N0.f26050c;
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
                org.telegram.ui.ActionBar.y0 y0Var = this.J;
                float f12 = 0.5f;
                if (y0Var != null) {
                    y0Var.setEnabled(this.S.K());
                    org.telegram.ui.ActionBar.y0 y0Var2 = this.J;
                    if (y0Var2.isEnabled()) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.5f;
                    }
                    y0Var2.setAlpha(f11);
                }
                org.telegram.ui.ActionBar.y0 y0Var3 = this.I;
                if (y0Var3 != null) {
                    y0Var3.setEnabled(this.S.J());
                    org.telegram.ui.ActionBar.y0 y0Var4 = this.I;
                    if (y0Var4.isEnabled()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    y0Var4.setAlpha(f10);
                }
                int m0 = this.S.m0(closestTab);
                if (this.f35688a == 3) {
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
                org.telegram.ui.ActionBar.g5 g5Var = this.f35695s;
                if (g5Var != null) {
                    if (m0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g5Var.Z(z11, true);
                }
                hi.e eVar = this.O;
                if (eVar != null) {
                    if (!z12 && this.V == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f35696w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        eVar.i(org.telegram.messenger.gd.G(size, "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        eVar.i(org.telegram.messenger.gd.N0(2131745713, null), z10, true);
                    }
                    this.V = closestTab;
                }
                org.telegram.ui.ActionBar.y0 y0Var5 = this.H;
                if (y0Var5 != null) {
                    if (m0 <= 0) {
                        z13 = false;
                    }
                    y0Var5.setEnabled(z13);
                    org.telegram.ui.ActionBar.y0 y0Var6 = this.H;
                    if (z13) {
                        f12 = 1.0f;
                    }
                    y0Var6.setAlpha(f12);
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
        int i7 = this.f35688a;
        boolean z11 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            int i10 = 2131746438;
            if (i7 == 2) {
                str = org.telegram.messenger.gd.N0(2131746438, null);
            } else if (i7 == 1) {
                g90 g90Var = this.S;
                if (g90Var != null && g90Var.getClosestTab() != 9) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = 2131746459;
                }
                str = org.telegram.messenger.gd.N0(i10, null);
            } else {
                if (this.f35692f != 0 && this.f35691e == getUserConfig().e()) {
                    j3 = this.f35692f;
                } else {
                    j3 = this.f35691e;
                }
                if (j3 == 2666000) {
                    str = org.telegram.messenger.gd.N0(2131754249, null);
                } else if (this.f35692f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.gd.N0(2131748110, null);
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
                            str = org.telegram.messenger.gd.N0(2131745705, null);
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
                    str = org.telegram.messenger.gd.N0(2131745219, null);
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
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            z4Var.getClass();
            z4Var.H(str2, z12, 320L, kr.h);
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
        g90 g90Var = this.S;
        if (g90Var.getSelectedTab() != g90Var.L0.getFirstTabId()) {
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
            g90 g90Var = this.S;
            if (g90Var.F1) {
                if (z10) {
                    g90Var.V(false);
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
        this.f35688a = getArguments().getInt("type", 0);
        this.f35691e = getArguments().getLong("dialog_id");
        this.f35692f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f35693n = getArguments().getString("username", "");
        this.f35694r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f35688a;
        if (i10 == 2) {
            i7 = 9;
        } else if (i10 == 1) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.T = getArguments().getInt("start_from", i7);
        getNotificationCenter().c(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25232i5);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25189b3);
        if (org.telegram.messenger.n5.E(this.f35691e) && this.f35692f == 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f35691e));
            if (org.telegram.messenger.n10.C(c22)) {
                getMessagesController().n3(c22, false, this.classGuid);
                this.d = getMessagesController().d2(this.f35691e);
            }
        }
        if (this.f35689b == null) {
            this.f35689b = new at0(this);
        }
        this.f35689b.f33561y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25232i5);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25189b3);
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
