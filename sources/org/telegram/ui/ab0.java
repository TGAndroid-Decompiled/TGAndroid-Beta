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
public final class ab0 extends org.telegram.ui.ActionBar.k2 {
    public FrameLayout f35735a;
    public org.telegram.ui.Components.uk0 f35736b;
    public s4.a0 f35737c;
    public org.telegram.ui.Components.dj0 d;
    public org.telegram.ui.Components.wb e;
    public int f35738f;
    public final s3 h;
    public final boolean[] f35739n;
    public final ArrayList f35740r;
    public final ArrayList f35741s;

    public ab0() {
        super(null);
        this.h = new s3(this, 10);
        this.f35739n = new boolean[3];
        this.f35740r = new ArrayList();
        this.f35741s = new ArrayList();
    }

    public final int Z(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f35738f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f35741s;
            if (i11 < arrayList.size()) {
                if (((va0) arrayList.get(i11)).e == i10) {
                    this.f35736b.e1(new i2.q(this, i11, 14), 700, true);
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void b0(int i10) {
        int Z = Z(i10);
        if (Z == -1) {
            return;
        }
        this.f35739n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f35740r;
        arrayList.clear();
        ArrayList arrayList2 = this.f35741s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new va0(1, 0, null, 0, 0));
        if (org.telegram.messenger.tc.c() <= 0) {
            a02 = org.telegram.messenger.dd.L0(2131748881, null);
        } else if (org.telegram.messenger.tc.c() >= 100) {
            a02 = org.telegram.messenger.dd.L0(2131748880, null);
        } else {
            a02 = org.telegram.messenger.dd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.tc.c())));
        }
        arrayList2.add(new va0(2, 0, a02, 0, 0));
        arrayList2.add(new va0(0, 0, org.telegram.messenger.dd.L0(2131748858, null), 0, 0));
        arrayList2.add(va0.c(2131232037, 3, org.telegram.messenger.dd.L0(2131748860, null)));
        boolean[] zArr = this.f35739n;
        if (zArr[0]) {
            arrayList2.add(va0.b(1, org.telegram.messenger.dd.L0(2131748872, null)));
            arrayList2.add(va0.b(2, org.telegram.messenger.dd.L0(2131748874, null)));
        }
        arrayList2.add(va0.c(2131232036, 28700, org.telegram.messenger.dd.L0(2131748865, null)));
        if (zArr[1]) {
            arrayList2.add(va0.b(16388, org.telegram.messenger.dd.L0(2131748872, null)));
            arrayList2.add(va0.b(8200, org.telegram.messenger.dd.L0(2131748871, null)));
            arrayList2.add(va0.b(4112, org.telegram.messenger.dd.L0(2131748874, null)));
        }
        arrayList2.add(va0.c(2131232016, this.f35738f, org.telegram.messenger.dd.L0(2131748866, null)));
        if (zArr[2]) {
            arrayList2.add(va0.b(32, org.telegram.messenger.dd.M0("LiteOptionsBackground")));
            if (!org.telegram.messenger.i0.Q1()) {
                arrayList2.add(va0.b(64, org.telegram.messenger.dd.M0("LiteOptionsTopics")));
            }
            arrayList2.add(va0.b(128, org.telegram.messenger.dd.M0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.uz.o() < 1) {
                boolean z10 = org.telegram.messenger.v2.f18578a;
            } else {
                arrayList2.add(va0.b(256, org.telegram.messenger.dd.M0("LiteOptionsBlur2")));
            }
            if (i10 >= 33) {
                if (org.telegram.messenger.uz.o() < 1) {
                    boolean z11 = org.telegram.messenger.v2.f18578a;
                } else {
                    arrayList2.add(va0.b(262144, org.telegram.messenger.dd.M0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(va0.b(32768, org.telegram.messenger.dd.M0("LiteOptionsScale")));
            if (org.telegram.ui.Components.i01.c()) {
                arrayList2.add(va0.b(65536, org.telegram.messenger.dd.M0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(va0.c(2131232020, 512, org.telegram.messenger.dd.L0(2131748867, null)));
        arrayList2.add(va0.c(2131232039, 1024, org.telegram.messenger.dd.L0(2131748870, null)));
        arrayList2.add(va0.c(2131232027, 2048, org.telegram.messenger.dd.L0(2131748873, null)));
        arrayList2.add(va0.c(2131232526, 131072, org.telegram.messenger.dd.L0(2131748863, null)));
        arrayList2.add(new va0(2, 0, "", 0, 0));
        arrayList2.add(new va0(5, 0, org.telegram.messenger.dd.L0(2131748856, null), 0, 1));
        arrayList2.add(new va0(2, 0, org.telegram.messenger.dd.M0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747081, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 3));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.f35735a = new FrameLayout(context);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f35736b = uk0Var;
        uk0Var.r1();
        org.telegram.ui.Components.uk0 uk0Var2 = this.f35736b;
        s4.a0 a0Var = new s4.a0();
        this.f35737c = a0Var;
        uk0Var2.setLayoutManager(a0Var);
        org.telegram.ui.Components.uk0 uk0Var3 = this.f35736b;
        org.telegram.ui.Components.dj0 dj0Var = new org.telegram.ui.Components.dj0(this, 2);
        this.d = dj0Var;
        uk0Var3.setAdapter(dj0Var);
        this.f35736b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        this.f35736b.setItemAnimator(jVar);
        this.f35735a.addView(this.f35736b, w7.b6.c(-1.0f, -1));
        this.f35736b.setOnItemClickListener(new st(this, 17));
        this.fragmentView = this.f35735a;
        if (org.telegram.messenger.i0.Q1()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f35738f = i10;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        float f7;
        if (this.f35736b != null) {
            for (int i10 = 0; i10 < this.f35736b.getChildCount(); i10++) {
                View childAt = this.f35736b.getChildAt(i10);
                if (childAt != null) {
                    this.f35736b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f35741s;
                        if (R < arrayList.size()) {
                            va0 va0Var = (va0) arrayList.get(R);
                            int i11 = va0Var.f7681a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((ya0) childAt).a();
                                }
                            } else {
                                za0 za0Var = (za0) childAt;
                                ImageView imageView = za0Var.e;
                                ab0 ab0Var = za0Var.D;
                                int i12 = va0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    za0Var.f43869w = z10;
                                    if (z10) {
                                        za0Var.c(va0Var, true);
                                        int Z = ab0Var.Z(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && ab0Var.f35739n[Z]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.a30.m(animate.rotation(f7), org.telegram.ui.Components.gr.h, 240L);
                                    }
                                    za0Var.f43865f.c(org.telegram.messenger.tc.e(i12), true);
                                } else {
                                    za0Var.h.a(org.telegram.messenger.tc.e(i12), true);
                                }
                                za0Var.b(org.telegram.messenger.tc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !org.telegram.messenger.tc.f()) {
                this.e.b();
                this.e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f35736b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.tc.f18247n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.tc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.tc.k();
        org.telegram.ui.Components.f5.t();
        org.telegram.ui.ActionBar.t6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
