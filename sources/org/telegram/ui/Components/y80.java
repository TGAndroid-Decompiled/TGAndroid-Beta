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
public final class y80 extends org.telegram.ui.ActionBar.e2 implements rs0, pg.b, org.telegram.messenger.is {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.z0 H;
    public org.telegram.ui.ActionBar.z0 I;
    public org.telegram.ui.ActionBar.z0 J;
    public org.telegram.ui.le0 K;
    public final qh.b[] L;
    public int M;
    public FrameLayout N;
    public hi.d O;
    public te.a P;
    public View Q;
    public di.m6 R;
    public x80 S;
    public int T;
    public String U;
    public int V;
    public int f41931a;
    public qs0 f41932b;
    public TLRPC.ChatFull f41933c;
    public TLRPC.UserFull d;
    public long f41934e;
    public long f41935f;
    public String h;
    public String f41936n;
    public int f41937r;
    public org.telegram.ui.ActionBar.d5 f41938s;
    public SparseArray f41939w;
    public org.telegram.ui.ActionBar.z0 f41940x;
    public org.telegram.ui.ActionBar.z0 f41941y;

    public y80(Bundle bundle, qs0 qs0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qh.b[2];
        this.M = -1;
        this.f41932b = qs0Var;
    }

    public static int a0(y80 y80Var) {
        return y80Var.classGuid;
    }

    @Override
    public final List F() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.q5 q5Var = sg.b1.f56589m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new pg.a(str.concat(" shape detector learning debug"), new t80(this, 1)));
    }

    @Override
    public final void R() {
        qs0 qs0Var;
        x80 x80Var = this.S;
        if (x80Var != null && (qs0Var = this.f41932b) != null) {
            x80Var.setNewMediaCounts(qs0Var.f38760c);
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
        x80 x80Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b;
        int[] iArr = ys0.f42073t2;
        x80Var.n1(ri.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), ri.a.c(this.mSystemInsets.f15575b), ri.a.c(this.mSystemInsets.d + i7), this.mSystemInsets.d + i7);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b;
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
        float f10 = this.P.f57085e;
        float L = org.telegram.messenger.g0.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f10) + (-i7));
        float f11 = 1.0f - f10;
        this.K.setAlpha(f11);
        org.telegram.ui.le0 le0Var = this.K;
        int i11 = 4;
        if (f10 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        le0Var.setVisibility(i10);
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 15));
        bi.g2 g2Var = new bi.g2(22, context, this);
        this.fragmentView = g2Var;
        if (this.f41931a == 0 && this.f41934e == getUserConfig().e() && this.f41935f == 0 && !getMessagesController().G1().f26736b && getMessagesController().G1().e()) {
            this.T = 11;
        }
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        x80 x80Var = new x80(this, context, this.f41934e, this.f41932b, this.f41933c, this.d, this.T, this, new w80(this), getResourceProvider(), baseSimpleGlass.f56042c);
        this.S = x80Var;
        x80Var.setOnTopPanelShiftChanged(new t80(this, 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        g2Var.addView(this.S, c8.ja.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, 2131231244);
            this.f41938s = b10;
            b10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
            this.f41938s.Z(false, false);
            org.telegram.ui.ActionBar.z0 e10 = this.f41938s.e(8, 2131232439, org.telegram.messenger.hd.M0(2131748650, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final y80 f40347b;

                {
                    this.f40347b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    boolean z10;
                    int i11;
                    xb j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    y80 y80Var = this.f40347b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = y80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                y80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = y80Var.S.R1(null, null);
                            if (R1 != null) {
                                y80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = y80Var.E;
                            if (z11 && !y80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = y80Var.f41940x;
                                int i13 = -y80Var.G;
                                y80Var.G = i13;
                                org.telegram.messenger.g0.F3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = y80Var.f41940x;
                            boolean z12 = !z11;
                            y80Var.E = z12;
                            z0Var2.setChecked(z12);
                            x80 x80Var2 = y80Var.S;
                            boolean z13 = y80Var.E;
                            boolean z14 = y80Var.F;
                            ir0 ir0Var = x80Var2.f42096f0;
                            if (ir0Var != null && (k6Var2 = ir0Var.f41149s) != null) {
                                k6Var2.f11949n = z13;
                                k6Var2.f11950o = z14;
                                k6Var2.d(true);
                            }
                            up0 up0Var = x80Var2.f42102h0;
                            if (up0Var != null && (k6Var = up0Var.f41149s) != null) {
                                k6Var.f11949n = z13;
                                k6Var.f11950o = z14;
                                k6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = y80Var.F;
                            if (z15 && !y80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = y80Var.f41941y;
                                int i14 = -y80Var.G;
                                y80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = y80Var.f41941y;
                            boolean z16 = !z15;
                            y80Var.F = z16;
                            z0Var4.setChecked(z16);
                            x80 x80Var3 = y80Var.S;
                            boolean z17 = y80Var.E;
                            boolean z18 = y80Var.F;
                            ir0 ir0Var2 = x80Var3.f42096f0;
                            if (ir0Var2 != null && (k6Var4 = ir0Var2.f41149s) != null) {
                                k6Var4.f11949n = z17;
                                k6Var4.f11950o = z18;
                                k6Var4.d(true);
                            }
                            up0 up0Var2 = x80Var3.f42102h0;
                            if (up0Var2 != null && (k6Var3 = up0Var2.f41149s) != null) {
                                k6Var3.f11949n = z17;
                                k6Var3.f11950o = z18;
                                k6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            di.m6 m6Var = y80Var.R;
                            if (m6Var != null) {
                                m6Var.run();
                                y80Var.R = null;
                            }
                            xb.e();
                            if (y80Var.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (y80Var.f41939w != null) {
                                i11 = 0;
                                for (int i15 = 0; i15 < y80Var.f41939w.size(); i15++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) y80Var.f41939w.valueAt(i15)).f23824l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i11++;
                                    }
                                }
                            } else {
                                i11 = 0;
                            }
                            y80Var.S.V(false);
                            if (z10) {
                                y80Var.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                                    zArr[i16] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                y80Var.getMessagesController().P1().q0(y80Var.f41934e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y80Var.R = new di.m6(y80Var, arrayList, z10, 21);
                                u80 u80Var = new u80(y80Var, zArr2, arrayList, zArr);
                                if (z10) {
                                    j3 = cc.a0(y80Var).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), u80Var).j();
                                } else {
                                    j3 = cc.a0(y80Var).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, u80Var).j();
                                }
                                j3.v = new vs(23, y80Var, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e11 = this.f41938s.e(9, 2131232440, org.telegram.messenger.hd.M0(2131748649, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) {
                public final y80 f40347b;

                {
                    this.f40347b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    boolean z10;
                    int i11;
                    xb j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    y80 y80Var = this.f40347b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = y80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                y80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = y80Var.S.R1(null, null);
                            if (R1 != null) {
                                y80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = y80Var.E;
                            if (z11 && !y80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = y80Var.f41940x;
                                int i13 = -y80Var.G;
                                y80Var.G = i13;
                                org.telegram.messenger.g0.F3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = y80Var.f41940x;
                            boolean z12 = !z11;
                            y80Var.E = z12;
                            z0Var2.setChecked(z12);
                            x80 x80Var2 = y80Var.S;
                            boolean z13 = y80Var.E;
                            boolean z14 = y80Var.F;
                            ir0 ir0Var = x80Var2.f42096f0;
                            if (ir0Var != null && (k6Var2 = ir0Var.f41149s) != null) {
                                k6Var2.f11949n = z13;
                                k6Var2.f11950o = z14;
                                k6Var2.d(true);
                            }
                            up0 up0Var = x80Var2.f42102h0;
                            if (up0Var != null && (k6Var = up0Var.f41149s) != null) {
                                k6Var.f11949n = z13;
                                k6Var.f11950o = z14;
                                k6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = y80Var.F;
                            if (z15 && !y80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = y80Var.f41941y;
                                int i14 = -y80Var.G;
                                y80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = y80Var.f41941y;
                            boolean z16 = !z15;
                            y80Var.F = z16;
                            z0Var4.setChecked(z16);
                            x80 x80Var3 = y80Var.S;
                            boolean z17 = y80Var.E;
                            boolean z18 = y80Var.F;
                            ir0 ir0Var2 = x80Var3.f42096f0;
                            if (ir0Var2 != null && (k6Var4 = ir0Var2.f41149s) != null) {
                                k6Var4.f11949n = z17;
                                k6Var4.f11950o = z18;
                                k6Var4.d(true);
                            }
                            up0 up0Var2 = x80Var3.f42102h0;
                            if (up0Var2 != null && (k6Var3 = up0Var2.f41149s) != null) {
                                k6Var3.f11949n = z17;
                                k6Var3.f11950o = z18;
                                k6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            di.m6 m6Var = y80Var.R;
                            if (m6Var != null) {
                                m6Var.run();
                                y80Var.R = null;
                            }
                            xb.e();
                            if (y80Var.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (y80Var.f41939w != null) {
                                i11 = 0;
                                for (int i15 = 0; i15 < y80Var.f41939w.size(); i15++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) y80Var.f41939w.valueAt(i15)).f23824l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i11++;
                                    }
                                }
                            } else {
                                i11 = 0;
                            }
                            y80Var.S.V(false);
                            if (z10) {
                                y80Var.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                                    zArr[i16] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                y80Var.getMessagesController().P1().q0(y80Var.f41934e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y80Var.R = new di.m6(y80Var, arrayList, z10, 21);
                                u80 u80Var = new u80(y80Var, zArr2, arrayList, zArr);
                                if (z10) {
                                    j3 = cc.a0(y80Var).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), u80Var).j();
                                } else {
                                    j3 = cc.a0(y80Var).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, u80Var).j();
                                }
                                j3.v = new vs(23, y80Var, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.z0 e12 = this.f41938s.e(10, 2131232078, org.telegram.messenger.hd.M0(2131752642, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.f41938s.a(-1);
            org.telegram.ui.ActionBar.d5 d5Var = this.f41938s;
            org.telegram.ui.ActionBar.z0 d = d5Var.d(6, 0, null, org.telegram.messenger.hd.M0(2131748653, null), true, true, d5Var.f29513n0);
            this.f41940x = d;
            d.setChecked(this.E);
            this.f41940x.setOnClickListener(new View.OnClickListener(this) {
                public final y80 f40347b;

                {
                    this.f40347b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    boolean z10;
                    int i11;
                    xb j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    y80 y80Var = this.f40347b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = y80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                y80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = y80Var.S.R1(null, null);
                            if (R1 != null) {
                                y80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = y80Var.E;
                            if (z11 && !y80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = y80Var.f41940x;
                                int i13 = -y80Var.G;
                                y80Var.G = i13;
                                org.telegram.messenger.g0.F3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = y80Var.f41940x;
                            boolean z12 = !z11;
                            y80Var.E = z12;
                            z0Var2.setChecked(z12);
                            x80 x80Var2 = y80Var.S;
                            boolean z13 = y80Var.E;
                            boolean z14 = y80Var.F;
                            ir0 ir0Var = x80Var2.f42096f0;
                            if (ir0Var != null && (k6Var2 = ir0Var.f41149s) != null) {
                                k6Var2.f11949n = z13;
                                k6Var2.f11950o = z14;
                                k6Var2.d(true);
                            }
                            up0 up0Var = x80Var2.f42102h0;
                            if (up0Var != null && (k6Var = up0Var.f41149s) != null) {
                                k6Var.f11949n = z13;
                                k6Var.f11950o = z14;
                                k6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = y80Var.F;
                            if (z15 && !y80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = y80Var.f41941y;
                                int i14 = -y80Var.G;
                                y80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = y80Var.f41941y;
                            boolean z16 = !z15;
                            y80Var.F = z16;
                            z0Var4.setChecked(z16);
                            x80 x80Var3 = y80Var.S;
                            boolean z17 = y80Var.E;
                            boolean z18 = y80Var.F;
                            ir0 ir0Var2 = x80Var3.f42096f0;
                            if (ir0Var2 != null && (k6Var4 = ir0Var2.f41149s) != null) {
                                k6Var4.f11949n = z17;
                                k6Var4.f11950o = z18;
                                k6Var4.d(true);
                            }
                            up0 up0Var2 = x80Var3.f42102h0;
                            if (up0Var2 != null && (k6Var3 = up0Var2.f41149s) != null) {
                                k6Var3.f11949n = z17;
                                k6Var3.f11950o = z18;
                                k6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            di.m6 m6Var = y80Var.R;
                            if (m6Var != null) {
                                m6Var.run();
                                y80Var.R = null;
                            }
                            xb.e();
                            if (y80Var.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (y80Var.f41939w != null) {
                                i11 = 0;
                                for (int i15 = 0; i15 < y80Var.f41939w.size(); i15++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) y80Var.f41939w.valueAt(i15)).f23824l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i11++;
                                    }
                                }
                            } else {
                                i11 = 0;
                            }
                            y80Var.S.V(false);
                            if (z10) {
                                y80Var.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                                    zArr[i16] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                y80Var.getMessagesController().P1().q0(y80Var.f41934e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y80Var.R = new di.m6(y80Var, arrayList, z10, 21);
                                u80 u80Var = new u80(y80Var, zArr2, arrayList, zArr);
                                if (z10) {
                                    j3 = cc.a0(y80Var).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), u80Var).j();
                                } else {
                                    j3 = cc.a0(y80Var).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, u80Var).j();
                                }
                                j3.v = new vs(23, y80Var, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.d5 d5Var2 = this.f41938s;
            org.telegram.ui.ActionBar.z0 d2 = d5Var2.d(7, 0, null, org.telegram.messenger.hd.M0(2131748652, null), true, true, d5Var2.f29513n0);
            this.f41941y = d2;
            d2.setChecked(this.F);
            this.f41941y.setOnClickListener(new View.OnClickListener(this) {
                public final y80 f40347b;

                {
                    this.f40347b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    boolean z10;
                    int i11;
                    xb j3;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    y80 y80Var = this.f40347b;
                    switch (i12) {
                        case 0:
                            Boolean Q1 = y80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                y80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = y80Var.S.R1(null, null);
                            if (R1 != null) {
                                y80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = y80Var.E;
                            if (z11 && !y80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = y80Var.f41940x;
                                int i13 = -y80Var.G;
                                y80Var.G = i13;
                                org.telegram.messenger.g0.F3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = y80Var.f41940x;
                            boolean z12 = !z11;
                            y80Var.E = z12;
                            z0Var2.setChecked(z12);
                            x80 x80Var2 = y80Var.S;
                            boolean z13 = y80Var.E;
                            boolean z14 = y80Var.F;
                            ir0 ir0Var = x80Var2.f42096f0;
                            if (ir0Var != null && (k6Var2 = ir0Var.f41149s) != null) {
                                k6Var2.f11949n = z13;
                                k6Var2.f11950o = z14;
                                k6Var2.d(true);
                            }
                            up0 up0Var = x80Var2.f42102h0;
                            if (up0Var != null && (k6Var = up0Var.f41149s) != null) {
                                k6Var.f11949n = z13;
                                k6Var.f11950o = z14;
                                k6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = y80Var.F;
                            if (z15 && !y80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = y80Var.f41941y;
                                int i14 = -y80Var.G;
                                y80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = y80Var.f41941y;
                            boolean z16 = !z15;
                            y80Var.F = z16;
                            z0Var4.setChecked(z16);
                            x80 x80Var3 = y80Var.S;
                            boolean z17 = y80Var.E;
                            boolean z18 = y80Var.F;
                            ir0 ir0Var2 = x80Var3.f42096f0;
                            if (ir0Var2 != null && (k6Var4 = ir0Var2.f41149s) != null) {
                                k6Var4.f11949n = z17;
                                k6Var4.f11950o = z18;
                                k6Var4.d(true);
                            }
                            up0 up0Var2 = x80Var3.f42102h0;
                            if (up0Var2 != null && (k6Var3 = up0Var2.f41149s) != null) {
                                k6Var3.f11949n = z17;
                                k6Var3.f11950o = z18;
                                k6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            di.m6 m6Var = y80Var.R;
                            if (m6Var != null) {
                                m6Var.run();
                                y80Var.R = null;
                            }
                            xb.e();
                            if (y80Var.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (y80Var.f41939w != null) {
                                i11 = 0;
                                for (int i15 = 0; i15 < y80Var.f41939w.size(); i15++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) y80Var.f41939w.valueAt(i15)).f23824l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i11++;
                                    }
                                }
                            } else {
                                i11 = 0;
                            }
                            y80Var.S.V(false);
                            if (z10) {
                                y80Var.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                                    zArr[i16] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                y80Var.getMessagesController().P1().q0(y80Var.f41934e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y80Var.R = new di.m6(y80Var, arrayList, z10, 21);
                                u80 u80Var = new u80(y80Var, zArr2, arrayList, zArr);
                                if (z10) {
                                    j3 = cc.a0(y80Var).L(2131623990, org.telegram.messenger.hd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), u80Var).j();
                                } else {
                                    j3 = cc.a0(y80Var).J(2131623980, org.telegram.messenger.hd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, u80Var).j();
                                }
                                j3.v = new vs(23, y80Var, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i11 = this.f41931a;
        qh.b[] bVarArr = this.L;
        if (i11 == 1) {
            org.telegram.ui.le0 le0Var = new org.telegram.ui.le0(context, getResourceProvider());
            this.K = le0Var;
            le0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.R, 2131746651);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.S, 2131746627);
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                bVarArr[i12].setOnClickListener(new ci.q(this, i12, 14));
                this.K.addView(bVarArr[i12]);
                this.K.i(bVarArr[i12], true, false);
            }
            aVar = baseSimpleGlass;
            fh.g c10 = aVar.f56042c.c(this.K, c8.g0.f(getResourceProvider()), false);
            org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c10);
            g2Var.addView(this.K, c8.ja.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            hi.d dVar = new hi.d(context, getResourceProvider(), true);
            this.O = dVar;
            dVar.i(org.telegram.messenger.hd.M0(2131745909, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final y80 f40347b;

                {
                    this.f40347b = this;
                }

                @Override
                public final void onClick(View view) {
                    fi.k6 k6Var;
                    fi.k6 k6Var2;
                    fi.k6 k6Var3;
                    fi.k6 k6Var4;
                    boolean z10;
                    int i112;
                    xb j3;
                    int i122 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    y80 y80Var = this.f40347b;
                    switch (i122) {
                        case 0:
                            Boolean Q1 = y80Var.S.Q1(null, null);
                            if (Q1 != null) {
                                y80Var.i0(true, Q1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean R1 = y80Var.S.R1(null, null);
                            if (R1 != null) {
                                y80Var.i0(R1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = y80Var.E;
                            if (z11 && !y80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var = y80Var.f41940x;
                                int i13 = -y80Var.G;
                                y80Var.G = i13;
                                org.telegram.messenger.g0.F3(i13, z0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var2 = y80Var.f41940x;
                            boolean z12 = !z11;
                            y80Var.E = z12;
                            z0Var2.setChecked(z12);
                            x80 x80Var2 = y80Var.S;
                            boolean z13 = y80Var.E;
                            boolean z14 = y80Var.F;
                            ir0 ir0Var = x80Var2.f42096f0;
                            if (ir0Var != null && (k6Var2 = ir0Var.f41149s) != null) {
                                k6Var2.f11949n = z13;
                                k6Var2.f11950o = z14;
                                k6Var2.d(true);
                            }
                            up0 up0Var = x80Var2.f42102h0;
                            if (up0Var != null && (k6Var = up0Var.f41149s) != null) {
                                k6Var.f11949n = z13;
                                k6Var.f11950o = z14;
                                k6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = y80Var.F;
                            if (z15 && !y80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.z0 z0Var3 = y80Var.f41941y;
                                int i14 = -y80Var.G;
                                y80Var.G = i14;
                                org.telegram.messenger.g0.F3(i14, z0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var4 = y80Var.f41941y;
                            boolean z16 = !z15;
                            y80Var.F = z16;
                            z0Var4.setChecked(z16);
                            x80 x80Var3 = y80Var.S;
                            boolean z17 = y80Var.E;
                            boolean z18 = y80Var.F;
                            ir0 ir0Var2 = x80Var3.f42096f0;
                            if (ir0Var2 != null && (k6Var4 = ir0Var2.f41149s) != null) {
                                k6Var4.f11949n = z17;
                                k6Var4.f11950o = z18;
                                k6Var4.d(true);
                            }
                            up0 up0Var2 = x80Var3.f42102h0;
                            if (up0Var2 != null && (k6Var3 = up0Var2.f41149s) != null) {
                                k6Var3.f11949n = z17;
                                k6Var3.f11950o = z18;
                                k6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            di.m6 m6Var = y80Var.R;
                            if (m6Var != null) {
                                m6Var.run();
                                y80Var.R = null;
                            }
                            xb.e();
                            if (y80Var.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (y80Var.f41939w != null) {
                                i112 = 0;
                                for (int i15 = 0; i15 < y80Var.f41939w.size(); i15++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.gj) y80Var.f41939w.valueAt(i15)).f23824l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i112++;
                                    }
                                }
                            } else {
                                i112 = 0;
                            }
                            y80Var.S.V(false);
                            if (z10) {
                                y80Var.S.k1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                                    zArr[i16] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                y80Var.getMessagesController().P1().q0(y80Var.f41934e, arrayList, false);
                                boolean[] zArr2 = {false};
                                y80Var.R = new di.m6(y80Var, arrayList, z10, 21);
                                u80 u80Var = new u80(y80Var, zArr2, arrayList, zArr);
                                if (z10) {
                                    j3 = cc.a0(y80Var).L(2131623990, org.telegram.messenger.hd.G(i112, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743887, null), u80Var).j();
                                } else {
                                    j3 = cc.a0(y80Var).J(2131623980, org.telegram.messenger.hd.G(i112, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743887, null), 5000, false, u80Var).j();
                                }
                                j3.v = new vs(23, y80Var, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, c8.ja.c(56.0f, -1));
            this.N.setVisibility(4);
            g2Var.addView(this.N, c8.ja.e(-1, 72, 80));
            this.P = new te.a(0, new gx(this, 8), er.h, 320L, false);
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
        org.telegram.ui.le0 le0Var2 = this.K;
        if (le0Var2 != null) {
            childCount = g2Var.indexOfChild(le0Var2);
        } else {
            childCount = g2Var.getChildCount();
        }
        g2Var.addView(view4, childCount, c8.ja.e(-1, 0, 80));
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        aVar.f56050m = g2Var;
        aVar.f56051n = null;
        aVar.g(g2Var, w4Var, resourceProvider);
        aVar.f56052o = new di.f(5, this, g2Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f41931a == 3 && (i7 = this.f41937r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.H(' ', "FoundStories", i7));
        }
        b0();
        g0();
        if (this.f41931a == 1) {
            if (this.T != 9) {
                i10 = 0;
            }
            org.telegram.ui.le0 le0Var3 = this.K;
            if (le0Var3 != null && this.M != i10) {
                this.M = i10;
                le0Var3.q(bVarArr[i10], false);
            }
        }
        return g2Var;
    }

    public final boolean d0() {
        int i7 = this.f41931a;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.E0 && ((Long) objArr[0]).longValue() == this.f41934e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            x80 x80Var = this.S;
            if (x80Var != null) {
                x80Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f41933c = chatFull;
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
        x80 x80Var = this.S;
        if (x80Var != null && this.simpleActionBar != null) {
            int closestTab = x80Var.getClosestTab();
            if (this.f41931a != 3 || closestTab == 8) {
                int[] iArr = this.f41932b.f38760c;
                boolean z12 = org.telegram.messenger.hd.f24104a0;
                boolean z13 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        f0(org.telegram.messenger.hd.G(getMessagesController().G1().c(), "SavedDialogsTabCount", new Object[0]));
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
                                org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(this.currentAccount).L0(this.f41934e);
                                if (L0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = L0.f25787b.size() + L0.f25788c;
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
                if (this.f41931a == 3) {
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
                org.telegram.ui.ActionBar.d5 d5Var = this.f41938s;
                if (d5Var != null) {
                    if (m0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d5Var.Z(z11, true);
                }
                hi.d dVar = this.O;
                if (dVar != null) {
                    if (!z12 && this.V == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f41939w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(org.telegram.messenger.hd.G(size, "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        dVar.i(org.telegram.messenger.hd.M0(2131745909, null), z10, true);
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
        int i7 = this.f41931a;
        boolean z11 = true;
        if (i7 == 3) {
            str = this.h;
        } else {
            int i10 = 2131746634;
            if (i7 == 2) {
                str = org.telegram.messenger.hd.M0(2131746634, null);
            } else if (i7 == 1) {
                x80 x80Var = this.S;
                if (x80Var != null && x80Var.getClosestTab() != 9) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = 2131746655;
                }
                str = org.telegram.messenger.hd.M0(i10, null);
            } else {
                if (this.f41935f != 0 && this.f41934e == getUserConfig().e()) {
                    j3 = this.f41935f;
                } else {
                    j3 = this.f41934e;
                }
                if (j3 == 2666000) {
                    str = org.telegram.messenger.hd.M0(2131754252, null);
                } else if (this.f41935f != 0 && j3 == getUserConfig().e()) {
                    str = org.telegram.messenger.hd.M0(2131748303, null);
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
                            str = org.telegram.messenger.hd.M0(2131745901, null);
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
                    str = org.telegram.messenger.hd.M0(2131745415, null);
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
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            w4Var.getClass();
            w4Var.D(str2, z12, 320L, er.h);
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
        x80 x80Var = this.S;
        if (x80Var.getSelectedTab() != x80Var.L0.getFirstTabId()) {
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
            x80 x80Var = this.S;
            if (x80Var.F1) {
                if (z10) {
                    x80Var.V(false);
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
        this.f41931a = getArguments().getInt("type", 0);
        this.f41934e = getArguments().getLong("dialog_id");
        this.f41935f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f41936n = getArguments().getString("username", "");
        this.f41937r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f41931a;
        if (i10 == 2) {
            i7 = 9;
        } else if (i10 == 1) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.T = getArguments().getInt("start_from", i7);
        getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25498f5);
        getNotificationCenter().c(this, org.telegram.messenger.ns.Z2);
        if (org.telegram.messenger.m5.E(this.f41934e) && this.f41935f == 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f41934e));
            if (org.telegram.messenger.q10.B(a22)) {
                getMessagesController().g3(a22, false, this.classGuid);
                this.d = getMessagesController().b2(this.f41934e);
            }
        }
        if (this.f41932b == null) {
            this.f41932b = new qs0(this);
        }
        this.f41932b.f38768y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25498f5);
        getNotificationCenter().n(this, org.telegram.messenger.ns.Z2);
        di.m6 m6Var = this.R;
        if (m6Var != null) {
            this.R = null;
            org.telegram.messenger.g0.h3(m6Var);
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
