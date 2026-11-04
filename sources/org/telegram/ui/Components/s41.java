package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class s41 extends IUpdateLayout {
    public FrameLayout f37903a;
    public RadialProgress2 f37904b;
    public org.telegram.ui.Cells.a2 f37905c;
    public final Activity d;
    public final ViewGroup f37906e;

    public s41(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f37906e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i3) {
        ViewGroup viewGroup = this.f37906e;
        if (viewGroup != null && this.f37903a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f37903a = frameLayout;
            frameLayout.setVisibility(4);
            this.f37903a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f37903a.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f37903a, b8.mf.e(-1, 44, 83));
            this.f37903a.setOnClickListener(new bi.q(this, i3, 19));
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, activity);
            this.f37905c = a2Var;
            a2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f37905c.setTypeface(org.telegram.messenger.g0.o());
            this.f37905c.setTextColor(-1);
            this.f37905c.setGravity(17);
            this.f37903a.addView(this.f37905c, b8.mf.g());
            this.f37905c.c(org.telegram.messenger.bd.M0(2131754229, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f37905c, null);
            this.f37904b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            this.f37904b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f37904b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f37904b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i3, boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i10;
        org.telegram.messenger.d1 d1Var;
        boolean z11;
        float f10;
        float f11;
        if (this.f37906e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f22819a) == null || (i10 = e10.f22820b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f22821c);
            }
            if (d1Var != null) {
                createUpdateUI(i3);
                File g7 = org.telegram.messenger.t0.f25456a.g();
                if (g7 != null && g7.exists()) {
                    this.f37904b.setIcon(15, true, z10);
                    this.f37905c.c(org.telegram.messenger.bd.M0(2131754225, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.h1.e().f22826j;
                    }
                    if (z11) {
                        this.f37904b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f37904b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.h1.e().f22827k;
                        }
                        radialProgress2.p(true, f10);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                            f11 = 0.0f;
                        } else {
                            f11 = org.telegram.messenger.h1.e().f22827k;
                        }
                        this.f37905c.c(org.telegram.messenger.bd.a0(null, null, 2131754226, Integer.valueOf((int) (f11 * 100.0f))), z10, true);
                    } else {
                        this.f37904b.setIcon(2, true, z10);
                        this.f37905c.c(org.telegram.messenger.bd.M0(2131754229, null), z10, true);
                    }
                }
                if (this.f37903a.getTag() == null) {
                    this.f37903a.setVisibility(0);
                    this.f37903a.setTag(1);
                    if (z10) {
                        this.f37903a.animate().translationY(0.0f).setInterpolator(xq.f40453g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f37903a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f37903a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f37903a.setTag(null);
                if (z10) {
                    this.f37903a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(xq.f40453g).setListener(new j01(this, 5)).setDuration(180L).start();
                    return;
                }
                this.f37903a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f37903a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f10;
        if (this.f37903a != null && this.f37905c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                z10 = false;
            } else {
                z10 = org.telegram.messenger.h1.e().f22826j;
            }
            if (z10) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25456a).q()) {
                    f10 = 0.0f;
                } else {
                    f10 = org.telegram.messenger.h1.e().f22827k;
                }
                this.f37904b.p(true, f10);
                this.f37905c.setText(org.telegram.messenger.bd.a0(null, null, 2131754226, Integer.valueOf((int) (f10 * 100.0f))));
                this.f37903a.invalidate();
            }
        }
    }
}
