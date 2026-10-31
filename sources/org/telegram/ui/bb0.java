package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bb0 extends org.telegram.ui.ActionBar.k2 {
    public FrameLayout f36156a;
    public org.telegram.ui.Components.tk0 f36157b;
    public s4.a0 f36158c;
    public org.telegram.ui.Components.cj0 d;
    public org.telegram.ui.Components.wb e;
    public int f36159f;
    public final s3 h;
    public final boolean[] f36160n;
    public final ArrayList f36161r;
    public final ArrayList f36162s;

    public bb0() {
        super(null);
        this.h = new s3(this, 10);
        this.f36160n = new boolean[3];
        this.f36161r = new ArrayList();
        this.f36162s = new ArrayList();
    }

    public final int Y(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f36159f) {
            return 2;
        }
        return -1;
    }

    public final void Z(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f36162s;
            if (i11 < arrayList.size()) {
                if (((wa0) arrayList.get(i11)).e == i10) {
                    this.f36157b.e1(new i2.q(this, i11, 14), 700, true);
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void a0(int i10) {
        int Y = Y(i10);
        if (Y == -1) {
            return;
        }
        this.f36160n[Y] = true;
        c0();
        b0();
    }

    public final void b0() {
        String a02;
        ArrayList arrayList = this.f36161r;
        arrayList.clear();
        ArrayList arrayList2 = this.f36162s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new wa0(1, 0, null, 0, 0));
        if (org.telegram.messenger.sc.c() <= 0) {
            a02 = org.telegram.messenger.cd.L0(2131748881, null);
        } else if (org.telegram.messenger.sc.c() >= 100) {
            a02 = org.telegram.messenger.cd.L0(2131748880, null);
        } else {
            a02 = org.telegram.messenger.cd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c())));
        }
        arrayList2.add(new wa0(2, 0, a02, 0, 0));
        arrayList2.add(new wa0(0, 0, org.telegram.messenger.cd.L0(2131748858, null), 0, 0));
        arrayList2.add(wa0.c(2131232037, 3, org.telegram.messenger.cd.L0(2131748860, null)));
        boolean[] zArr = this.f36160n;
        if (zArr[0]) {
            arrayList2.add(wa0.b(1, org.telegram.messenger.cd.L0(2131748872, null)));
            arrayList2.add(wa0.b(2, org.telegram.messenger.cd.L0(2131748874, null)));
        }
        arrayList2.add(wa0.c(2131232036, 28700, org.telegram.messenger.cd.L0(2131748865, null)));
        if (zArr[1]) {
            arrayList2.add(wa0.b(16388, org.telegram.messenger.cd.L0(2131748872, null)));
            arrayList2.add(wa0.b(8200, org.telegram.messenger.cd.L0(2131748871, null)));
            arrayList2.add(wa0.b(4112, org.telegram.messenger.cd.L0(2131748874, null)));
        }
        arrayList2.add(wa0.c(2131232016, this.f36159f, org.telegram.messenger.cd.L0(2131748866, null)));
        if (zArr[2]) {
            arrayList2.add(wa0.b(32, org.telegram.messenger.cd.M0("LiteOptionsBackground")));
            if (!org.telegram.messenger.i0.Q1()) {
                arrayList2.add(wa0.b(64, org.telegram.messenger.cd.M0("LiteOptionsTopics")));
            }
            arrayList2.add(wa0.b(128, org.telegram.messenger.cd.M0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.tz.o() < 1) {
                boolean z10 = org.telegram.messenger.v2.f18448a;
            } else {
                arrayList2.add(wa0.b(256, org.telegram.messenger.cd.M0("LiteOptionsBlur2")));
            }
            if (i10 >= 33) {
                if (org.telegram.messenger.tz.o() < 1) {
                    boolean z11 = org.telegram.messenger.v2.f18448a;
                } else {
                    arrayList2.add(wa0.b(262144, org.telegram.messenger.cd.M0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(wa0.b(32768, org.telegram.messenger.cd.M0("LiteOptionsScale")));
            if (org.telegram.ui.Components.h01.c()) {
                arrayList2.add(wa0.b(65536, org.telegram.messenger.cd.M0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(wa0.c(2131232020, 512, org.telegram.messenger.cd.L0(2131748867, null)));
        arrayList2.add(wa0.c(2131232039, 1024, org.telegram.messenger.cd.L0(2131748870, null)));
        arrayList2.add(wa0.c(2131232027, 2048, org.telegram.messenger.cd.L0(2131748873, null)));
        arrayList2.add(wa0.c(2131232526, 131072, org.telegram.messenger.cd.L0(2131748863, null)));
        arrayList2.add(new wa0(2, 0, "", 0, 0));
        arrayList2.add(new wa0(5, 0, org.telegram.messenger.cd.L0(2131748856, null), 0, 1));
        arrayList2.add(new wa0(2, 0, org.telegram.messenger.cd.M0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void c0() {
        boolean z10;
        float f7;
        if (this.f36157b != null) {
            for (int i10 = 0; i10 < this.f36157b.getChildCount(); i10++) {
                View childAt = this.f36157b.getChildAt(i10);
                if (childAt != null) {
                    this.f36157b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f36162s;
                        if (R < arrayList.size()) {
                            wa0 wa0Var = (wa0) arrayList.get(R);
                            int i11 = wa0Var.f7680a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((za0) childAt).a();
                                }
                            } else {
                                ab0 ab0Var = (ab0) childAt;
                                ImageView imageView = ab0Var.e;
                                bb0 bb0Var = ab0Var.D;
                                int i12 = wa0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    ab0Var.f35612w = z10;
                                    if (z10) {
                                        ab0Var.c(wa0Var, true);
                                        int Y = bb0Var.Y(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Y >= 0 && bb0Var.f36160n[Y]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.z20.m(animate.rotation(f7), org.telegram.ui.Components.gr.h, 240L);
                                    }
                                    ab0Var.f35608f.c(org.telegram.messenger.sc.e(i12), true);
                                } else {
                                    ab0Var.h.a(org.telegram.messenger.sc.e(i12), true);
                                }
                                ab0Var.b(org.telegram.messenger.sc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !org.telegram.messenger.sc.f()) {
                this.e.b();
                this.e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747081, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 3));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.f36156a = new FrameLayout(context);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f36157b = tk0Var;
        tk0Var.r1();
        org.telegram.ui.Components.tk0 tk0Var2 = this.f36157b;
        s4.a0 a0Var = new s4.a0();
        this.f36158c = a0Var;
        tk0Var2.setLayoutManager(a0Var);
        org.telegram.ui.Components.tk0 tk0Var3 = this.f36157b;
        org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(this, 2);
        this.d = cj0Var;
        tk0Var3.setAdapter(cj0Var);
        this.f36157b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f36157b.setItemAnimator(jVar);
        this.f36156a.addView(this.f36157b, w7.b6.c(-1.0f, -1));
        this.f36157b.setOnItemClickListener(new tt(this, 17));
        this.fragmentView = this.f36156a;
        if (org.telegram.messenger.i0.Q1()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f36159f = i10;
        b0();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f36157b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.sc.f17896n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.sc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.sc.k();
        org.telegram.ui.Components.f5.t();
        org.telegram.ui.ActionBar.t6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
