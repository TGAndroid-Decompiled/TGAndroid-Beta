package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class n51 extends IUpdateLayout {
    public FrameLayout f37676a;
    public RadialProgress2 f37677b;
    public org.telegram.ui.Cells.b2 f37678c;
    public final Activity d;
    public final ViewGroup f37679e;

    public n51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f37679e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.f37679e;
        if (viewGroup != null && this.f37676a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f37676a = frameLayout;
            frameLayout.setVisibility(4);
            this.f37676a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f37676a.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f37676a, c8.na.e(-1, 44, 83));
            this.f37676a.setOnClickListener(new ci.q(this, i7, 21));
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, activity);
            this.f37678c = b2Var;
            b2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f37678c.setTypeface(org.telegram.messenger.g0.o());
            this.f37678c.setTextColor(-1);
            this.f37678c.setGravity(17);
            this.f37676a.addView(this.f37678c, c8.na.g());
            this.f37678c.c(org.telegram.messenger.gd.N0(2131754226, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f37678c, null);
            this.f37677b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.n6.Fi;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.n6.x0(null, i10, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            this.f37677b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f37677b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f37677b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i7, boolean z10) {
        org.telegram.messenger.h1 e10;
        String str;
        int i10;
        org.telegram.messenger.d1 d1Var;
        boolean z11;
        float f10;
        float f11;
        if (this.f37679e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f24444a) == null || (i10 = e10.f24445b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f24446c);
            }
            if (d1Var != null) {
                createUpdateUI(i7);
                File g10 = org.telegram.messenger.t0.f27012a.g();
                if (g10 != null && g10.exists()) {
                    this.f37677b.setIcon(15, true, z10);
                    this.f37678c.c(org.telegram.messenger.gd.N0(2131754222, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.h1.e().f24451j;
                    }
                    if (z11) {
                        this.f37677b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f37677b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.h1.e().f24452k;
                        }
                        radialProgress2.p(true, f10);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                            f11 = 0.0f;
                        } else {
                            f11 = org.telegram.messenger.h1.e().f24452k;
                        }
                        this.f37678c.c(org.telegram.messenger.gd.a0(null, null, 2131754223, Integer.valueOf((int) (f11 * 100.0f))), z10, true);
                    } else {
                        this.f37677b.setIcon(2, true, z10);
                        this.f37678c.c(org.telegram.messenger.gd.N0(2131754226, null), z10, true);
                    }
                }
                if (this.f37676a.getTag() == null) {
                    this.f37676a.setVisibility(0);
                    this.f37676a.setTag(1);
                    if (z10) {
                        this.f37676a.animate().translationY(0.0f).setInterpolator(kr.f36859g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f37676a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f37676a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f37676a.setTag(null);
                if (z10) {
                    this.f37676a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(kr.f36859g).setListener(new s11(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f37676a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f37676a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f10;
        if (this.f37676a != null && this.f37678c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                z10 = false;
            } else {
                z10 = org.telegram.messenger.h1.e().f24451j;
            }
            if (z10) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f27012a).q()) {
                    f10 = 0.0f;
                } else {
                    f10 = org.telegram.messenger.h1.e().f24452k;
                }
                this.f37677b.p(true, f10);
                this.f37678c.setText(org.telegram.messenger.gd.a0(null, null, 2131754223, Integer.valueOf((int) (f10 * 100.0f))));
                this.f37676a.invalidate();
            }
        }
    }
}
