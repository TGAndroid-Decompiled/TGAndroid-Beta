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
public final class r80 extends org.telegram.ui.ActionBar.d2 implements ps0, qg.b, org.telegram.messenger.cs {
    public boolean E;
    public boolean F;
    public int G;
    public org.telegram.ui.ActionBar.y0 H;
    public org.telegram.ui.ActionBar.y0 I;
    public org.telegram.ui.ActionBar.y0 J;
    public org.telegram.ui.ge0 K;
    public final rh.b[] L;
    public int M;
    public FrameLayout N;
    public gi.d O;
    public qe.a P;
    public View Q;
    public ci.v6 R;
    public q80 S;
    public int T;
    public String U;
    public int V;
    public int f37681a;
    public os0 f37682b;
    public TLRPC.ChatFull f37683c;
    public TLRPC.UserFull d;
    public long f37684e;
    public long f37685f;
    public String h;
    public String f37686n;
    public int f37687r;
    public org.telegram.ui.ActionBar.f5 f37688s;
    public SparseArray f37689w;
    public org.telegram.ui.ActionBar.y0 f37690x;
    public org.telegram.ui.ActionBar.y0 f37691y;

    public r80(Bundle bundle, os0 os0Var) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new rh.b[2];
        this.M = -1;
        this.f37682b = os0Var;
    }

    public static int a0(r80 r80Var) {
        return r80Var.classGuid;
    }

    @Override
    public final List E() {
        String str;
        Activity parentActivity = getParentActivity();
        org.telegram.messenger.q5 q5Var = tg.b1.f55131m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new qg.a(str.concat(" shape detector learning debug"), new n80(this, 1)));
    }

    @Override
    public final void Q() {
        os0 os0Var;
        q80 q80Var = this.S;
        if (q80Var != null && (os0Var = this.f37682b) != null) {
            q80Var.setNewMediaCounts(os0Var.f36936c);
        }
        g0();
    }

    public final void b0() {
        int i3;
        if (this.S == null) {
            return;
        }
        int i10 = 0;
        if (this.K != null) {
            i3 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i3 = 0;
        }
        q80 q80Var = this.S;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f14496b;
        int[] iArr = ws0.f40063t2;
        q80Var.l1(pi.a.d(currentActionBarHeight - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(6.666f), pi.a.c(this.mSystemInsets.f14496b), pi.a.c(this.mSystemInsets.d + i3), this.mSystemInsets.d + i3);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f14496b;
            if (this.Q.getLayoutParams().height != topPanelShift) {
                this.Q.getLayoutParams().height = topPanelShift;
                this.Q.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i11 = this.mSystemInsets.d;
            layoutParams.height = i11 + i3;
            View view2 = this.navigationBarFadeView;
            if (i11 < org.telegram.messenger.g0.L(40.0f) && i3 <= 0) {
                i10 = 8;
            }
            view2.setVisibility(i10);
            this.navigationBarFadeView.requestLayout();
        }
        c0();
    }

    public final void c0() {
        int i3;
        int i10;
        if (this.K == null) {
            return;
        }
        float f10 = this.P.f53840e;
        float L = org.telegram.messenger.g0.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f10) + (-i3));
        float f11 = 1.0f - f10;
        this.K.setAlpha(f11);
        org.telegram.ui.ge0 ge0Var = this.K;
        int i11 = 4;
        if (f10 < 1.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ge0Var.setVisibility(i10);
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
        if (!this.S.J0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        pi.a aVar;
        int childCount;
        int i3;
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 15));
        ai.o2 o2Var = new ai.o2(23, context, this);
        this.fragmentView = o2Var;
        if (this.f37681a == 0 && this.f37684e == getUserConfig().e() && this.f37685f == 0 && !getMessagesController().G1().f24435b && getMessagesController().G1().e()) {
            this.T = 11;
        }
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        q80 q80Var = new q80(this, context, this.f37684e, this.f37682b, this.f37683c, this.d, this.T, this, new p80(this), getResourceProvider(), baseSimpleGlass.f53525c);
        this.S = q80Var;
        q80Var.setOnTopPanelShiftChanged(new n80(this, 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        o2Var.addView(this.S, b8.mf.c(-1.0f, -1));
        if (d0()) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131231244);
            this.f37688s = b10;
            b10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
            this.f37688s.Y(false, false);
            org.telegram.ui.ActionBar.y0 e10 = this.f37688s.e(8, 2131232438, org.telegram.messenger.bd.M0(2131748658, null));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final r80 f36781b;

                {
                    this.f36781b = this;
                }

                @Override
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    boolean z10;
                    int i11;
                    ac j10;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    r80 r80Var = this.f36781b;
                    switch (i12) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = r80Var.E;
                            if (z11 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.f37690x;
                                int i13 = -r80Var.G;
                                r80Var.G = i13;
                                org.telegram.messenger.g0.G3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.f37690x;
                            boolean z12 = !z11;
                            r80Var.E = z12;
                            y0Var2.setChecked(z12);
                            q80 q80Var2 = r80Var.S;
                            boolean z13 = r80Var.E;
                            boolean z14 = r80Var.F;
                            gr0 gr0Var = q80Var2.f40086f0;
                            if (gr0Var != null && (r6Var2 = gr0Var.f38550s) != null) {
                                r6Var2.f10881n = z13;
                                r6Var2.f10882o = z14;
                                r6Var2.d(true);
                            }
                            rp0 rp0Var = q80Var2.f40092h0;
                            if (rp0Var != null && (r6Var = rp0Var.f38550s) != null) {
                                r6Var.f10881n = z13;
                                r6Var.f10882o = z14;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = r80Var.F;
                            if (z15 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.f37691y;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.f37691y;
                            boolean z16 = !z15;
                            r80Var.F = z16;
                            y0Var4.setChecked(z16);
                            q80 q80Var3 = r80Var.S;
                            boolean z17 = r80Var.E;
                            boolean z18 = r80Var.F;
                            gr0 gr0Var2 = q80Var3.f40086f0;
                            if (gr0Var2 != null && (r6Var4 = gr0Var2.f38550s) != null) {
                                r6Var4.f10881n = z17;
                                r6Var4.f10882o = z18;
                                r6Var4.d(true);
                            }
                            rp0 rp0Var2 = q80Var3.f40092h0;
                            if (rp0Var2 != null && (r6Var3 = rp0Var2.f38550s) != null) {
                                r6Var3.f10881n = z17;
                                r6Var3.f10882o = z18;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            r80 r80Var2 = this.f36781b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            if (r80Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.f37689w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < r80Var2.f37689w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.f37689w.valueAt(i16)).f26871l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z10) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.f37684e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z10, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                if (z10) {
                                    j10 = fc.a0(r80Var2).L(2131623989, org.telegram.messenger.bd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j();
                                } else {
                                    j10 = fc.a0(r80Var2).J(2131623979, org.telegram.messenger.bd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j();
                                }
                                j10.v = new j50(4, r80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e11 = this.f37688s.e(9, 2131232439, org.telegram.messenger.bd.M0(2131748657, null));
            this.J = e11;
            e11.setOnClickListener(new View.OnClickListener(this) {
                public final r80 f36781b;

                {
                    this.f36781b = this;
                }

                @Override
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    boolean z10;
                    int i11;
                    ac j10;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    r80 r80Var = this.f36781b;
                    switch (i12) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = r80Var.E;
                            if (z11 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.f37690x;
                                int i13 = -r80Var.G;
                                r80Var.G = i13;
                                org.telegram.messenger.g0.G3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.f37690x;
                            boolean z12 = !z11;
                            r80Var.E = z12;
                            y0Var2.setChecked(z12);
                            q80 q80Var2 = r80Var.S;
                            boolean z13 = r80Var.E;
                            boolean z14 = r80Var.F;
                            gr0 gr0Var = q80Var2.f40086f0;
                            if (gr0Var != null && (r6Var2 = gr0Var.f38550s) != null) {
                                r6Var2.f10881n = z13;
                                r6Var2.f10882o = z14;
                                r6Var2.d(true);
                            }
                            rp0 rp0Var = q80Var2.f40092h0;
                            if (rp0Var != null && (r6Var = rp0Var.f38550s) != null) {
                                r6Var.f10881n = z13;
                                r6Var.f10882o = z14;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = r80Var.F;
                            if (z15 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.f37691y;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.f37691y;
                            boolean z16 = !z15;
                            r80Var.F = z16;
                            y0Var4.setChecked(z16);
                            q80 q80Var3 = r80Var.S;
                            boolean z17 = r80Var.E;
                            boolean z18 = r80Var.F;
                            gr0 gr0Var2 = q80Var3.f40086f0;
                            if (gr0Var2 != null && (r6Var4 = gr0Var2.f38550s) != null) {
                                r6Var4.f10881n = z17;
                                r6Var4.f10882o = z18;
                                r6Var4.d(true);
                            }
                            rp0 rp0Var2 = q80Var3.f40092h0;
                            if (rp0Var2 != null && (r6Var3 = rp0Var2.f38550s) != null) {
                                r6Var3.f10881n = z17;
                                r6Var3.f10882o = z18;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            r80 r80Var2 = this.f36781b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            if (r80Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.f37689w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < r80Var2.f37689w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.f37689w.valueAt(i16)).f26871l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z10) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.f37684e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z10, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                if (z10) {
                                    j10 = fc.a0(r80Var2).L(2131623989, org.telegram.messenger.bd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j();
                                } else {
                                    j10 = fc.a0(r80Var2).J(2131623979, org.telegram.messenger.bd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j();
                                }
                                j10.v = new j50(4, r80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y0 e12 = this.f37688s.e(10, 2131232077, org.telegram.messenger.bd.M0(2131752642, null));
            this.H = e12;
            e12.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.f37688s.a(-1);
            org.telegram.ui.ActionBar.f5 f5Var = this.f37688s;
            org.telegram.ui.ActionBar.y0 d = f5Var.d(6, 0, null, org.telegram.messenger.bd.M0(2131748661, null), true, true, f5Var.f28456n0);
            this.f37690x = d;
            d.setChecked(this.E);
            this.f37690x.setOnClickListener(new View.OnClickListener(this) {
                public final r80 f36781b;

                {
                    this.f36781b = this;
                }

                @Override
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    boolean z10;
                    int i11;
                    ac j10;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    r80 r80Var = this.f36781b;
                    switch (i12) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = r80Var.E;
                            if (z11 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.f37690x;
                                int i13 = -r80Var.G;
                                r80Var.G = i13;
                                org.telegram.messenger.g0.G3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.f37690x;
                            boolean z12 = !z11;
                            r80Var.E = z12;
                            y0Var2.setChecked(z12);
                            q80 q80Var2 = r80Var.S;
                            boolean z13 = r80Var.E;
                            boolean z14 = r80Var.F;
                            gr0 gr0Var = q80Var2.f40086f0;
                            if (gr0Var != null && (r6Var2 = gr0Var.f38550s) != null) {
                                r6Var2.f10881n = z13;
                                r6Var2.f10882o = z14;
                                r6Var2.d(true);
                            }
                            rp0 rp0Var = q80Var2.f40092h0;
                            if (rp0Var != null && (r6Var = rp0Var.f38550s) != null) {
                                r6Var.f10881n = z13;
                                r6Var.f10882o = z14;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = r80Var.F;
                            if (z15 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.f37691y;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.f37691y;
                            boolean z16 = !z15;
                            r80Var.F = z16;
                            y0Var4.setChecked(z16);
                            q80 q80Var3 = r80Var.S;
                            boolean z17 = r80Var.E;
                            boolean z18 = r80Var.F;
                            gr0 gr0Var2 = q80Var3.f40086f0;
                            if (gr0Var2 != null && (r6Var4 = gr0Var2.f38550s) != null) {
                                r6Var4.f10881n = z17;
                                r6Var4.f10882o = z18;
                                r6Var4.d(true);
                            }
                            rp0 rp0Var2 = q80Var3.f40092h0;
                            if (rp0Var2 != null && (r6Var3 = rp0Var2.f38550s) != null) {
                                r6Var3.f10881n = z17;
                                r6Var3.f10882o = z18;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            r80 r80Var2 = this.f36781b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            if (r80Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.f37689w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < r80Var2.f37689w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.f37689w.valueAt(i16)).f26871l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z10) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.f37684e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z10, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                if (z10) {
                                    j10 = fc.a0(r80Var2).L(2131623989, org.telegram.messenger.bd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j();
                                } else {
                                    j10 = fc.a0(r80Var2).J(2131623979, org.telegram.messenger.bd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j();
                                }
                                j10.v = new j50(4, r80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.f5 f5Var2 = this.f37688s;
            org.telegram.ui.ActionBar.y0 d10 = f5Var2.d(7, 0, null, org.telegram.messenger.bd.M0(2131748660, null), true, true, f5Var2.f28456n0);
            this.f37691y = d10;
            d10.setChecked(this.F);
            this.f37691y.setOnClickListener(new View.OnClickListener(this) {
                public final r80 f36781b;

                {
                    this.f36781b = this;
                }

                @Override
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    boolean z10;
                    int i11;
                    ac j10;
                    int i12 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    r80 r80Var = this.f36781b;
                    switch (i12) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = r80Var.E;
                            if (z11 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.f37690x;
                                int i13 = -r80Var.G;
                                r80Var.G = i13;
                                org.telegram.messenger.g0.G3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.f37690x;
                            boolean z12 = !z11;
                            r80Var.E = z12;
                            y0Var2.setChecked(z12);
                            q80 q80Var2 = r80Var.S;
                            boolean z13 = r80Var.E;
                            boolean z14 = r80Var.F;
                            gr0 gr0Var = q80Var2.f40086f0;
                            if (gr0Var != null && (r6Var2 = gr0Var.f38550s) != null) {
                                r6Var2.f10881n = z13;
                                r6Var2.f10882o = z14;
                                r6Var2.d(true);
                            }
                            rp0 rp0Var = q80Var2.f40092h0;
                            if (rp0Var != null && (r6Var = rp0Var.f38550s) != null) {
                                r6Var.f10881n = z13;
                                r6Var.f10882o = z14;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = r80Var.F;
                            if (z15 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.f37691y;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.f37691y;
                            boolean z16 = !z15;
                            r80Var.F = z16;
                            y0Var4.setChecked(z16);
                            q80 q80Var3 = r80Var.S;
                            boolean z17 = r80Var.E;
                            boolean z18 = r80Var.F;
                            gr0 gr0Var2 = q80Var3.f40086f0;
                            if (gr0Var2 != null && (r6Var4 = gr0Var2.f38550s) != null) {
                                r6Var4.f10881n = z17;
                                r6Var4.f10882o = z18;
                                r6Var4.d(true);
                            }
                            rp0 rp0Var2 = q80Var3.f40092h0;
                            if (rp0Var2 != null && (r6Var3 = rp0Var2.f38550s) != null) {
                                r6Var3.f10881n = z17;
                                r6Var3.f10882o = z18;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            r80 r80Var2 = this.f36781b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            if (r80Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.f37689w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < r80Var2.f37689w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.f37689w.valueAt(i16)).f26871l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i11 = i15;
                            } else {
                                i11 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z10) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.f37684e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z10, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                if (z10) {
                                    j10 = fc.a0(r80Var2).L(2131623989, org.telegram.messenger.bd.G(i11, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j();
                                } else {
                                    j10 = fc.a0(r80Var2).J(2131623979, org.telegram.messenger.bd.G(i11, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j();
                                }
                                j10.v = new j50(4, r80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i11 = this.f37681a;
        rh.b[] bVarArr = this.L;
        if (i11 == 1) {
            org.telegram.ui.ge0 ge0Var = new org.telegram.ui.ge0(context, getResourceProvider());
            this.K = ge0Var;
            ge0Var.setClipChildren(false);
            this.K.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            bVarArr[0] = rh.b.c(context, getResourceProvider(), rh.a.R, 2131746659);
            bVarArr[1] = rh.b.c(context, getResourceProvider(), rh.a.S, 2131746635);
            for (int i12 = 0; i12 < bVarArr.length; i12++) {
                bVarArr[i12].setOnClickListener(new bi.q(this, i12, 14));
                this.K.addView(bVarArr[i12]);
                this.K.i(bVarArr[i12], true, false);
            }
            aVar = baseSimpleGlass;
            gh.g c2 = aVar.f53525c.c(this.K, b8.cd.f(getResourceProvider()), false);
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(28.0f), 7.666f);
            this.K.setBackground(c2);
            o2Var.addView(this.K, b8.mf.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            gi.d dVar = new gi.d(context, getResourceProvider(), true);
            this.O = dVar;
            dVar.i(org.telegram.messenger.bd.M0(2131745919, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final r80 f36781b;

                {
                    this.f36781b = this;
                }

                @Override
                public final void onClick(View view) {
                    ei.r6 r6Var;
                    ei.r6 r6Var2;
                    ei.r6 r6Var3;
                    ei.r6 r6Var4;
                    boolean z10;
                    int i112;
                    ac j10;
                    int i122 = r2;
                    org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                    r80 r80Var = this.f36781b;
                    switch (i122) {
                        case 0:
                            Boolean O1 = r80Var.S.O1(null, null);
                            if (O1 != null) {
                                r80Var.i0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = r80Var.S.P1(null, null);
                            if (P1 != null) {
                                r80Var.i0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = r80Var.E;
                            if (z11 && !r80Var.F) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var = r80Var.f37690x;
                                int i13 = -r80Var.G;
                                r80Var.G = i13;
                                org.telegram.messenger.g0.G3(i13, y0Var, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var2 = r80Var.f37690x;
                            boolean z12 = !z11;
                            r80Var.E = z12;
                            y0Var2.setChecked(z12);
                            q80 q80Var2 = r80Var.S;
                            boolean z13 = r80Var.E;
                            boolean z14 = r80Var.F;
                            gr0 gr0Var = q80Var2.f40086f0;
                            if (gr0Var != null && (r6Var2 = gr0Var.f38550s) != null) {
                                r6Var2.f10881n = z13;
                                r6Var2.f10882o = z14;
                                r6Var2.d(true);
                            }
                            rp0 rp0Var = q80Var2.f40092h0;
                            if (rp0Var != null && (r6Var = rp0Var.f38550s) != null) {
                                r6Var.f10881n = z13;
                                r6Var.f10882o = z14;
                                r6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = r80Var.F;
                            if (z15 && !r80Var.E) {
                                p2Var.a();
                                org.telegram.ui.ActionBar.y0 y0Var3 = r80Var.f37691y;
                                int i14 = -r80Var.G;
                                r80Var.G = i14;
                                org.telegram.messenger.g0.G3(i14, y0Var3, null);
                                return;
                            }
                            org.telegram.ui.ActionBar.y0 y0Var4 = r80Var.f37691y;
                            boolean z16 = !z15;
                            r80Var.F = z16;
                            y0Var4.setChecked(z16);
                            q80 q80Var3 = r80Var.S;
                            boolean z17 = r80Var.E;
                            boolean z18 = r80Var.F;
                            gr0 gr0Var2 = q80Var3.f40086f0;
                            if (gr0Var2 != null && (r6Var4 = gr0Var2.f38550s) != null) {
                                r6Var4.f10881n = z17;
                                r6Var4.f10882o = z18;
                                r6Var4.d(true);
                            }
                            rp0 rp0Var2 = q80Var3.f40092h0;
                            if (rp0Var2 != null && (r6Var3 = rp0Var2.f38550s) != null) {
                                r6Var3.f10881n = z17;
                                r6Var3.f10882o = z18;
                                r6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            r80 r80Var2 = this.f36781b;
                            ci.v6 v6Var = r80Var2.R;
                            if (v6Var != null) {
                                v6Var.run();
                                r80Var2.R = null;
                            }
                            ac.e();
                            if (r80Var2.S.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (r80Var2.f37689w != null) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < r80Var2.f37689w.size(); i16++) {
                                    TL_stories.StoryItem storyItem = ((org.telegram.messenger.zi) r80Var2.f37689w.valueAt(i16)).f26871l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i15++;
                                    }
                                }
                                i112 = i15;
                            } else {
                                i112 = 0;
                            }
                            r80Var2.S.V(false);
                            if (z10) {
                                r80Var2.S.i1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i17);
                                    zArr[i17] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                r80Var2.getMessagesController().P1().q0(r80Var2.f37684e, arrayList, false);
                                boolean[] zArr2 = {false};
                                r80Var2.R = new ci.v6(r80Var2, arrayList, z10, 21);
                                v60 v60Var = new v60(r80Var2, zArr2, arrayList, zArr, 2);
                                if (z10) {
                                    j10 = fc.a0(r80Var2).L(2131623989, org.telegram.messenger.bd.G(i112, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743897, null), v60Var).j();
                                } else {
                                    j10 = fc.a0(r80Var2).J(2131623979, org.telegram.messenger.bd.G(i112, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743897, null), 5000, false, v60Var).j();
                                }
                                j10.v = new j50(4, r80Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, b8.mf.c(56.0f, -1));
            this.N.setVisibility(4);
            o2Var.addView(this.N, b8.mf.e(-1, 72, 80));
            this.P = new qe.a(0, new zw(this, 8), xq.h, 320L, false);
            setBulletinDelegate(new ai.h1(this, 9));
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
        org.telegram.ui.ge0 ge0Var2 = this.K;
        if (ge0Var2 != null) {
            childCount = o2Var.indexOfChild(ge0Var2);
        } else {
            childCount = o2Var.getChildCount();
        }
        o2Var.addView(view4, childCount, b8.mf.e(-1, 0, 80));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        aVar.f53532l = o2Var;
        aVar.f53533m = null;
        aVar.g(o2Var, y4Var, resourceProvider);
        aVar.f53534n = new ci.g(5, this, o2Var);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        h0(false);
        if (this.f37681a == 3 && (i3 = this.f37687r) != -1) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.H(' ', "FoundStories", i3));
        }
        b0();
        g0();
        if (this.f37681a == 1) {
            if (this.T != 9) {
                i10 = 0;
            }
            org.telegram.ui.ge0 ge0Var3 = this.K;
            if (ge0Var3 != null && this.M != i10) {
                this.M = i10;
                ge0Var3.q(bVarArr[i10], false);
            }
        }
        return o2Var;
    }

    public final boolean d0() {
        int i3 = this.f37681a;
        if (i3 == 1 || i3 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.E0 && ((Long) objArr[0]).longValue() == this.f37684e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            q80 q80Var = this.S;
            if (q80Var != null) {
                q80Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.f37683c = chatFull;
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
        int i3;
        q80 q80Var = this.S;
        if (q80Var != null && this.simpleActionBar != null) {
            int closestTab = q80Var.getClosestTab();
            if (this.f37681a != 3 || closestTab == 8) {
                int[] iArr = this.f37682b.f36936c;
                boolean z12 = org.telegram.messenger.bd.f21784a0;
                boolean z13 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        f0(org.telegram.messenger.bd.G(getMessagesController().G1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.S.getPhotosVideosTypeFilter() == 1) {
                                    f0(org.telegram.messenger.bd.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                                    f0(org.telegram.messenger.bd.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    f0(org.telegram.messenger.bd.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                f0(org.telegram.messenger.bd.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                f0(org.telegram.messenger.bd.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                f0(org.telegram.messenger.bd.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                f0(org.telegram.messenger.bd.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                f0(org.telegram.messenger.bd.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i3 = iArr[8]) >= 0) {
                                f0(org.telegram.messenger.bd.G(i3, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(this.currentAccount).L0(this.f37684e);
                                if (L0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = L0.f23564b.size() + L0.f23565c;
                                }
                                f0(org.telegram.messenger.bd.G(size2, "Channels", new Object[0]));
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
                if (this.f37681a == 3) {
                    if (m0 > 0) {
                        f0(org.telegram.messenger.bd.H(' ', "FoundStories", m0));
                    }
                } else if (closestTab == 8) {
                    if (m0 > 0) {
                        str2 = org.telegram.messenger.bd.G(m0, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    f0(str2);
                } else {
                    if (m0 > 0) {
                        str = org.telegram.messenger.bd.G(m0, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    f0(str);
                }
                h0(true);
                org.telegram.ui.ActionBar.f5 f5Var = this.f37688s;
                if (f5Var != null) {
                    if (m0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f5Var.Y(z11, true);
                }
                gi.d dVar = this.O;
                if (dVar != null) {
                    if (!z12 && this.V == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.f37689w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(org.telegram.messenger.bd.G(size, "ArchiveStories", new Object[0]), z10, true);
                    } else {
                        dVar.i(org.telegram.messenger.bd.M0(2131745919, null), z10, true);
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
        long j10;
        String str;
        TLRPC.User user;
        int i3 = this.f37681a;
        boolean z11 = true;
        if (i3 == 3) {
            str = this.h;
        } else {
            int i10 = 2131746642;
            if (i3 == 2) {
                str = org.telegram.messenger.bd.M0(2131746642, null);
            } else if (i3 == 1) {
                q80 q80Var = this.S;
                if (q80Var != null && q80Var.getClosestTab() != 9) {
                    z11 = false;
                }
                if (!z11) {
                    i10 = 2131746663;
                }
                str = org.telegram.messenger.bd.M0(i10, null);
            } else {
                if (this.f37685f != 0 && this.f37684e == getUserConfig().e()) {
                    j10 = this.f37685f;
                } else {
                    j10 = this.f37684e;
                }
                if (j10 == 2666000) {
                    str = org.telegram.messenger.bd.M0(2131754252, null);
                } else if (this.f37685f != 0 && j10 == getUserConfig().e()) {
                    str = org.telegram.messenger.bd.M0(2131748311, null);
                } else if (org.telegram.messenger.m5.C(j10)) {
                    TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L)));
                    if (a12 != null) {
                        user = getMessagesController().a2(Long.valueOf(a12.user_id));
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                    }
                    str = null;
                } else if (org.telegram.messenger.m5.E(j10)) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        if (a22.self) {
                            str = org.telegram.messenger.bd.M0(2131745911, null);
                        } else {
                            str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                        }
                    }
                    str = null;
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                    if (M0 != null) {
                        str = M0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = org.telegram.messenger.bd.M0(2131745425, null);
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
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            y4Var.getClass();
            y4Var.A(str2, z12, 320L, xq.h);
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
        if (!this.S.J0()) {
            return false;
        }
        q80 q80Var = this.S;
        if (q80Var.getSelectedTab() != q80Var.L0.getFirstTabId()) {
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
            q80 q80Var = this.S;
            if (q80Var.F1) {
                if (z10) {
                    q80Var.V(false);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3;
        this.f37681a = getArguments().getInt("type", 0);
        this.f37684e = getArguments().getLong("dialog_id");
        this.f37685f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f37686n = getArguments().getString("username", "");
        this.f37687r = getArguments().getInt("storiesCount", -1);
        int i10 = this.f37681a;
        if (i10 == 2) {
            i3 = 9;
        } else if (i10 == 1) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.T = getArguments().getInt("start_from", i3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().c(this, org.telegram.messenger.hs.Z2);
        if (org.telegram.messenger.m5.E(this.f37684e) && this.f37685f == 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f37684e));
            if (org.telegram.messenger.l10.B(a22)) {
                getMessagesController().g3(a22, false, this.classGuid);
                this.d = getMessagesController().b2(this.f37684e);
            }
        }
        if (this.f37682b == null) {
            this.f37682b = new os0(this);
        }
        this.f37682b.f36944y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23230f5);
        getNotificationCenter().n(this, org.telegram.messenger.hs.Z2);
        ci.v6 v6Var = this.R;
        if (v6Var != null) {
            this.R = null;
            org.telegram.messenger.g0.h3(v6Var);
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        b0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
