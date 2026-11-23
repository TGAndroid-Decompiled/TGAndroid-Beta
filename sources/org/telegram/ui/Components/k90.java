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
public final class k90 extends org.telegram.ui.ActionBar.g2 implements ct0, pg.b, org.telegram.messenger.gs {
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
    public hi.d O;
    public te.a P;
    public View Q;
    public di.p6 R;
    public j90 S;
    public int T;
    public String U;
    public int V;
    public int f36828a;
    public bt0 f36829b;
    public TLRPC.ChatFull f36830c;
    public TLRPC.UserFull d;
    public long f36831e;
    public long f36832f;
    public String h;
    public String f36833n;
    public int f36834r;
    public org.telegram.ui.ActionBar.g5 f36835s;
    public SparseArray f36836w;
    public org.telegram.ui.ActionBar.y0 f36837x;
    public org.telegram.ui.ActionBar.y0 f36838y;

    public k90(Bundle bundle, bt0 bt0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qh.b[2];
        this.M = -1;
        this.f36829b = bt0Var;
    }

    public static int a0(k90 k90Var) {
        return k90Var.classGuid;
    }

    @Override
    public final List F() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.r5 r5Var = sg.b1.f57173m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new pg.a(str.concat(" shape detector learning debug"), new g90(this, 1)));
    }

    @Override
    public final void R() {
        bt0 bt0Var;
        j90 j90Var = this.S;
        if (j90Var != null && (bt0Var = this.f36829b) != null) {
            j90Var.setNewMediaCounts(bt0Var.f33879c);
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
        j90 j90Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15884b;
        int[] iArr = jt0.f36559t2;
        j90Var.n1(ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), ri.a.c(this.mSystemInsets.f15884b), ri.a.c(this.mSystemInsets.d + i7), this.mSystemInsets.d + i7);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15884b;
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
        float f10 = this.P.f57665e;
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 17));
        bi.g3 g3Var = new bi.g3(22, context, this);
        this.fragmentView = g3Var;
        if (this.f36828a == 0 && this.f36831e == getUserConfig().e() && this.f36832f == 0 && !getMessagesController().I1().f26467b && getMessagesController().I1().e()) {
            this.T = 11;
        }
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        j90 j90Var = new j90(this, context, this.f36831e, this.f36829b, this.f36830c, this.d, this.T, this, new i90(this), getResourceProvider(), baseSimpleGlass.f56626c);
        this.S = j90Var;
        j90Var.setOnTopPanelShiftChanged(new g90(this, 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        g3Var.addView(this.S, c8.na.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131231244);
            this.f36835s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
            this.f36835s.Z(false, false);
            org.telegram.ui.ActionBar.y0 e10 = this.f36835s.e(8, 2131232440, org.telegram.messenger.hd.N0(2131748457, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final k90 f35791b;

                {
                    this.f35791b = this;
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
                    k90 k90Var = this.f35791b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = k90Var.E;
                            if (z11 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.f36837x;
                                int i13 = -k90Var.G;
                                k90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.f36837x;
                            boolean z12 = !z11;
                            k90Var.E = z12;
                            y0Var2.setChecked(z12);
                            j90 j90Var2 = k90Var.S;
                            boolean z13 = k90Var.E;
                            boolean z14 = k90Var.F;
                            sr0 sr0Var = j90Var2.f36582f0;
                            if (sr0Var != null && (h6Var2 = sr0Var.f35630s) != null) {
                                h6Var2.f12045n = z13;
                                h6Var2.f12046o = z14;
                                h6Var2.d(true);
                            }
                            eq0 eq0Var = j90Var2.f36588h0;
                            if (eq0Var != null && (h6Var = eq0Var.f35630s) != null) {
                                h6Var.f12045n = z13;
                                h6Var.f12046o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = k90Var.F;
                            if (z15 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.f36838y;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.f36838y;
                            boolean z16 = !z15;
                            k90Var.F = z16;
                            y0Var4.setChecked(z16);
                            j90 j90Var3 = k90Var.S;
                            boolean z17 = k90Var.E;
                            boolean z18 = k90Var.F;
                            sr0 sr0Var2 = j90Var3.f36582f0;
                            if (sr0Var2 != null && (h6Var4 = sr0Var2.f35630s) != null) {
                                h6Var4.f12045n = z17;
                                h6Var4.f12046o = z18;
                                h6Var4.d(true);
                            }
                            eq0 eq0Var2 = j90Var3.f36588h0;
                            if (eq0Var2 != null && (h6Var3 = eq0Var2.f35630s) != null) {
                                h6Var3.f12045n = z17;
                                h6Var3.f12046o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            k90 k90Var2 = this.f35791b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            if (k90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.f36836w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < k90Var2.f36836w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) k90Var2.f36836w.valueAt(i16)).f24182l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z10) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.f36831e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.R = new di.p6(k90Var2, arrayList, z10, 21);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(k90Var2).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.N0(2131744243, null), org.telegram.messenger.hd.N0(2131743644, null), q20Var).j();
                                } else {
                                    j3 = lc.b0(k90Var2).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.N0(2131743644, null), 5000, false, q20Var).j();
                                }
                                j3.v = new fw(19, k90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e11 = this.f36835s.e(9, 2131232441, org.telegram.messenger.hd.N0(2131748456, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) {
                public final k90 f35791b;

                {
                    this.f35791b = this;
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
                    k90 k90Var = this.f35791b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = k90Var.E;
                            if (z11 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.f36837x;
                                int i13 = -k90Var.G;
                                k90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.f36837x;
                            boolean z12 = !z11;
                            k90Var.E = z12;
                            y0Var2.setChecked(z12);
                            j90 j90Var2 = k90Var.S;
                            boolean z13 = k90Var.E;
                            boolean z14 = k90Var.F;
                            sr0 sr0Var = j90Var2.f36582f0;
                            if (sr0Var != null && (h6Var2 = sr0Var.f35630s) != null) {
                                h6Var2.f12045n = z13;
                                h6Var2.f12046o = z14;
                                h6Var2.d(true);
                            }
                            eq0 eq0Var = j90Var2.f36588h0;
                            if (eq0Var != null && (h6Var = eq0Var.f35630s) != null) {
                                h6Var.f12045n = z13;
                                h6Var.f12046o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = k90Var.F;
                            if (z15 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.f36838y;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.f36838y;
                            boolean z16 = !z15;
                            k90Var.F = z16;
                            y0Var4.setChecked(z16);
                            j90 j90Var3 = k90Var.S;
                            boolean z17 = k90Var.E;
                            boolean z18 = k90Var.F;
                            sr0 sr0Var2 = j90Var3.f36582f0;
                            if (sr0Var2 != null && (h6Var4 = sr0Var2.f35630s) != null) {
                                h6Var4.f12045n = z17;
                                h6Var4.f12046o = z18;
                                h6Var4.d(true);
                            }
                            eq0 eq0Var2 = j90Var3.f36588h0;
                            if (eq0Var2 != null && (h6Var3 = eq0Var2.f35630s) != null) {
                                h6Var3.f12045n = z17;
                                h6Var3.f12046o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            k90 k90Var2 = this.f35791b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            if (k90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.f36836w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < k90Var2.f36836w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) k90Var2.f36836w.valueAt(i16)).f24182l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z10) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.f36831e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.R = new di.p6(k90Var2, arrayList, z10, 21);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(k90Var2).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.N0(2131744243, null), org.telegram.messenger.hd.N0(2131743644, null), q20Var).j();
                                } else {
                                    j3 = lc.b0(k90Var2).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.N0(2131743644, null), 5000, false, q20Var).j();
                                }
                                j3.v = new fw(19, k90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e12 = this.f36835s.e(10, 2131232079, org.telegram.messenger.hd.N0(2131752630, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.f36835s.a(-1);
            org.telegram.ui.ActionBar.g5 g5Var = this.f36835s;
            org.telegram.ui.ActionBar.y0 d = g5Var.d(6, 0, null, org.telegram.messenger.hd.N0(2131748460, null), true, true, g5Var.f29884n0);
            this.f36837x = d;
            d.setChecked(this.E);
            this.f36837x.setOnClickListener(new View.OnClickListener(this) {
                public final k90 f35791b;

                {
                    this.f35791b = this;
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
                    k90 k90Var = this.f35791b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = k90Var.E;
                            if (z11 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.f36837x;
                                int i13 = -k90Var.G;
                                k90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.f36837x;
                            boolean z12 = !z11;
                            k90Var.E = z12;
                            y0Var2.setChecked(z12);
                            j90 j90Var2 = k90Var.S;
                            boolean z13 = k90Var.E;
                            boolean z14 = k90Var.F;
                            sr0 sr0Var = j90Var2.f36582f0;
                            if (sr0Var != null && (h6Var2 = sr0Var.f35630s) != null) {
                                h6Var2.f12045n = z13;
                                h6Var2.f12046o = z14;
                                h6Var2.d(true);
                            }
                            eq0 eq0Var = j90Var2.f36588h0;
                            if (eq0Var != null && (h6Var = eq0Var.f35630s) != null) {
                                h6Var.f12045n = z13;
                                h6Var.f12046o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = k90Var.F;
                            if (z15 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.f36838y;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.f36838y;
                            boolean z16 = !z15;
                            k90Var.F = z16;
                            y0Var4.setChecked(z16);
                            j90 j90Var3 = k90Var.S;
                            boolean z17 = k90Var.E;
                            boolean z18 = k90Var.F;
                            sr0 sr0Var2 = j90Var3.f36582f0;
                            if (sr0Var2 != null && (h6Var4 = sr0Var2.f35630s) != null) {
                                h6Var4.f12045n = z17;
                                h6Var4.f12046o = z18;
                                h6Var4.d(true);
                            }
                            eq0 eq0Var2 = j90Var3.f36588h0;
                            if (eq0Var2 != null && (h6Var3 = eq0Var2.f35630s) != null) {
                                h6Var3.f12045n = z17;
                                h6Var3.f12046o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            k90 k90Var2 = this.f35791b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            if (k90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.f36836w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < k90Var2.f36836w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) k90Var2.f36836w.valueAt(i16)).f24182l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z10) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.f36831e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.R = new di.p6(k90Var2, arrayList, z10, 21);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(k90Var2).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.N0(2131744243, null), org.telegram.messenger.hd.N0(2131743644, null), q20Var).j();
                                } else {
                                    j3 = lc.b0(k90Var2).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.N0(2131743644, null), 5000, false, q20Var).j();
                                }
                                j3.v = new fw(19, k90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.g5 g5Var2 = this.f36835s;
            org.telegram.ui.ActionBar.y0 d2 = g5Var2.d(7, 0, null, org.telegram.messenger.hd.N0(2131748459, null), true, true, g5Var2.f29884n0);
            this.f36838y = d2;
            d2.setChecked(this.F);
            this.f36838y.setOnClickListener(new View.OnClickListener(this) {
                public final k90 f35791b;

                {
                    this.f35791b = this;
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
                    k90 k90Var = this.f35791b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = k90Var.E;
                            if (z11 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.f36837x;
                                int i13 = -k90Var.G;
                                k90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.f36837x;
                            boolean z12 = !z11;
                            k90Var.E = z12;
                            y0Var2.setChecked(z12);
                            j90 j90Var2 = k90Var.S;
                            boolean z13 = k90Var.E;
                            boolean z14 = k90Var.F;
                            sr0 sr0Var = j90Var2.f36582f0;
                            if (sr0Var != null && (h6Var2 = sr0Var.f35630s) != null) {
                                h6Var2.f12045n = z13;
                                h6Var2.f12046o = z14;
                                h6Var2.d(true);
                            }
                            eq0 eq0Var = j90Var2.f36588h0;
                            if (eq0Var != null && (h6Var = eq0Var.f35630s) != null) {
                                h6Var.f12045n = z13;
                                h6Var.f12046o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = k90Var.F;
                            if (z15 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.f36838y;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.f36838y;
                            boolean z16 = !z15;
                            k90Var.F = z16;
                            y0Var4.setChecked(z16);
                            j90 j90Var3 = k90Var.S;
                            boolean z17 = k90Var.E;
                            boolean z18 = k90Var.F;
                            sr0 sr0Var2 = j90Var3.f36582f0;
                            if (sr0Var2 != null && (h6Var4 = sr0Var2.f35630s) != null) {
                                h6Var4.f12045n = z17;
                                h6Var4.f12046o = z18;
                                h6Var4.d(true);
                            }
                            eq0 eq0Var2 = j90Var3.f36588h0;
                            if (eq0Var2 != null && (h6Var3 = eq0Var2.f35630s) != null) {
                                h6Var3.f12045n = z17;
                                h6Var3.f12046o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            k90 k90Var2 = this.f35791b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            if (k90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.f36836w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < k90Var2.f36836w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) k90Var2.f36836w.valueAt(i16)).f24182l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z10) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.f36831e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.R = new di.p6(k90Var2, arrayList, z10, 21);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(k90Var2).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.N0(2131744243, null), org.telegram.messenger.hd.N0(2131743644, null), q20Var).j();
                                } else {
                                    j3 = lc.b0(k90Var2).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.N0(2131743644, null), 5000, false, q20Var).j();
                                }
                                j3.v = new fw(19, k90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i11 = this.f36828a;
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
            fh.g c10 = aVar.f56626c.c(this.K, c8.j0.g(getResourceProvider()), false);
            org.telegram.messenger.o10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c10);
            g3Var.addView(this.K, c8.na.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            hi.d dVar = new hi.d(context, getResourceProvider(), true);
            this.O = dVar;
            dVar.i(org.telegram.messenger.hd.N0(2131745713, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final k90 f35791b;

                {
                    this.f35791b = this;
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
                    k90 k90Var = this.f35791b;
                    switch (i122) {
                        case 0:
                            Boolean Q1 = k90Var.S.Q1(null, null);
                            if (Q1 != null) {
                                k90Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = k90Var.S.R1(null, null);
                            if (R1 != null) {
                                k90Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = k90Var.E;
                            if (z11 && !k90Var.F) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = k90Var.f36837x;
                                int i13 = -k90Var.G;
                                k90Var.G = i13;
                                org.telegram.messenger.g0.E3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = k90Var.f36837x;
                            boolean z12 = !z11;
                            k90Var.E = z12;
                            y0Var2.setChecked(z12);
                            j90 j90Var2 = k90Var.S;
                            boolean z13 = k90Var.E;
                            boolean z14 = k90Var.F;
                            sr0 sr0Var = j90Var2.f36582f0;
                            if (sr0Var != null && (h6Var2 = sr0Var.f35630s) != null) {
                                h6Var2.f12045n = z13;
                                h6Var2.f12046o = z14;
                                h6Var2.d(true);
                            }
                            eq0 eq0Var = j90Var2.f36588h0;
                            if (eq0Var != null && (h6Var = eq0Var.f35630s) != null) {
                                h6Var.f12045n = z13;
                                h6Var.f12046o = z14;
                                h6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = k90Var.F;
                            if (z15 && !k90Var.E) {
                                q2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = k90Var.f36838y;
                                int i14 = -k90Var.G;
                                k90Var.G = i14;
                                org.telegram.messenger.g0.E3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = k90Var.f36838y;
                            boolean z16 = !z15;
                            k90Var.F = z16;
                            y0Var4.setChecked(z16);
                            j90 j90Var3 = k90Var.S;
                            boolean z17 = k90Var.E;
                            boolean z18 = k90Var.F;
                            sr0 sr0Var2 = j90Var3.f36582f0;
                            if (sr0Var2 != null && (h6Var4 = sr0Var2.f35630s) != null) {
                                h6Var4.f12045n = z17;
                                h6Var4.f12046o = z18;
                                h6Var4.d(true);
                            }
                            eq0 eq0Var2 = j90Var3.f36588h0;
                            if (eq0Var2 != null && (h6Var3 = eq0Var2.f35630s) != null) {
                                h6Var3.f12045n = z17;
                                h6Var3.f12046o = z18;
                                h6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            k90 k90Var2 = this.f35791b;
                            di.p6 p6Var = k90Var2.R;
                            if (p6Var != null) {
                                p6Var.run();
                                k90Var2.R = null;
                            }
                            gc.e();
                            if (k90Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (k90Var2.f36836w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < k90Var2.f36836w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) k90Var2.f36836w.valueAt(i16)).f24182l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i112 = i15;
                            } else {
                                i112 = 0;
                            }
                            k90Var2.S.V(false);
                            if (z10) {
                                k90Var2.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                k90Var2.getMessagesController().R1().q0(k90Var2.f36831e, arrayList, false);
                                boolean[] zArr2 = {false};
                                k90Var2.R = new di.p6(k90Var2, arrayList, z10, 21);
                                q20 q20Var = new q20(k90Var2, zArr2, arrayList, zArr, 3);
                                if (z10) {
                                    j3 = lc.b0(k90Var2).L(2131623990, org.telegram.messenger.hd.G(i112, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.N0(2131744243, null), org.telegram.messenger.hd.N0(2131743644, null), q20Var).j();
                                } else {
                                    j3 = lc.b0(k90Var2).J(2131623980, org.telegram.messenger.hd.G(i112, "StoryArchived", new Object[0]), org.telegram.messenger.hd.N0(2131743644, null), 5000, false, q20Var).j();
                                }
                                j3.v = new fw(19, k90Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, c8.na.c(56.0f, -1));
            this.N.setVisibility(4);
            g3Var.addView(this.N, c8.na.e(-1, 72, 80));
            this.P = new te.a(0, new ky(this, 7), nr.h, 320L, false);
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
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        aVar.f56634m = g3Var;
        aVar.f56635n = null;
        aVar.g(g3Var, z4Var, resourceProvider);
        aVar.f56636o = new di.f(5, this, g3Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f36828a == 3 && (i7 = this.f36834r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.f36828a == 1) {
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
        int i7 = this.f36828a;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.E0 && ((Long) objArr[0]).longValue() == this.f36831e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            j90 j90Var = this.S;
            if (j90Var != null) {
                j90Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f36830c = chatFull;
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
        j90 j90Var = this.S;
        if (j90Var != null && this.simpleActionBar != null) {
            int closestTab = j90Var.getClosestTab();
            if (this.f36828a != 3 || closestTab == 8) {
                int[] iArr = this.f36829b.f33879c;
                boolean z12 = org.telegram.messenger.hd.f24408a0;
                boolean z13 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        f0(org.telegram.messenger.hd.G(getMessagesController().I1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.S.getPhotosVideosTypeFilter() == 1) {
                                    f0(org.telegram.messenger.hd.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                                    f0(org.telegram.messenger.hd.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    f0(org.telegram.messenger.hd.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                f0(org.telegram.messenger.hd.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                f0(org.telegram.messenger.hd.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                f0(org.telegram.messenger.hd.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                f0(org.telegram.messenger.hd.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                f0(org.telegram.messenger.hd.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i7 = iArr[8]) >= 0) {
                                f0(org.telegram.messenger.hd.G(i7, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                org.telegram.messenger.oo N0 = org.telegram.messenger.np.u1(this.currentAccount).N0(this.f36831e);
                                if (N0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = N0.f26116b.size() + N0.f26117c;
                                }
                                f0(org.telegram.messenger.hd.G(size2, "Channels", new Object[0]));
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
                if (this.f36828a == 3) {
                    if (m0 > 0) {
                        f0(org.telegram.messenger.hd.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    if (m0 > 0) {
                        str2 = org.telegram.messenger.hd.G(m0, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    f0(str2);
                } else {
                    if (m0 > 0) {
                        str = org.telegram.messenger.hd.G(m0, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    f0(str);
                }
                h0(true);
                org.telegram.ui.ActionBar.g5 g5Var = this.f36835s;
                if (g5Var != null) {
                    if (m0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g5Var.Z(z11, true);
                }
                hi.d dVar = this.O;
                if (dVar != null) {
                    if (!z12 && this.V == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f36836w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        dVar.i(org.telegram.messenger.hd.N0(2131745713, null), z10, true);
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
        int i7 = this.f36828a;
        boolean z11 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            int i10 = 2131746438;
            if (i7 == 2) {
                str = org.telegram.messenger.hd.N0(2131746438, null);
            } else if (i7 == 1) {
                j90 j90Var = this.S;
                if (j90Var != null && j90Var.getClosestTab() != 9) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = 2131746459;
                }
                str = org.telegram.messenger.hd.N0(i10, null);
            } else {
                if (this.f36832f != 0 && this.f36831e == getUserConfig().e()) {
                    j3 = this.f36832f;
                } else {
                    j3 = this.f36831e;
                }
                if (j3 == 2666000) {
                    str = org.telegram.messenger.hd.N0(2131754249, null);
                } else if (this.f36832f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.hd.N0(2131748110, null);
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
                            str = org.telegram.messenger.hd.N0(2131745705, null);
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
                    str = org.telegram.messenger.hd.N0(2131745219, null);
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
            z4Var.I(str2, z12, 320L, nr.h);
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
        j90 j90Var = this.S;
        if (j90Var.getSelectedTab() != j90Var.L0.getFirstTabId()) {
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
            j90 j90Var = this.S;
            if (j90Var.F1) {
                if (z10) {
                    j90Var.V(false);
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
        this.f36828a = getArguments().getInt("type", 0);
        this.f36831e = getArguments().getLong("dialog_id");
        this.f36832f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f36833n = getArguments().getString("username", "");
        this.f36834r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f36828a;
        if (i10 == 2) {
            i7 = 9;
        } else if (i10 == 1) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.T = getArguments().getInt("start_from", i7);
        getNotificationCenter().c(this, org.telegram.messenger.ls.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25291i5);
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25248b3);
        if (org.telegram.messenger.n5.E(this.f36831e) && this.f36832f == 0) {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.f36831e));
            if (org.telegram.messenger.p10.C(c22)) {
                getMessagesController().n3(c22, false, this.classGuid);
                this.d = getMessagesController().d2(this.f36831e);
            }
        }
        if (this.f36829b == null) {
            this.f36829b = new bt0(this);
        }
        this.f36829b.f33887y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25291i5);
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25248b3);
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
