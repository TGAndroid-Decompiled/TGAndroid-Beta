package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class o51 extends IUpdateLayout {
    public FrameLayout f38109a;
    public RadialProgress2 f38110b;
    public org.telegram.ui.Cells.b2 f38111c;
    public final Activity d;
    public final ViewGroup f38112e;

    public o51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f38112e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.f38112e;
        if (viewGroup != null && this.f38109a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f38109a = frameLayout;
            frameLayout.setVisibility(4);
            this.f38109a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f38109a.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f38109a, c8.ma.e(-1, 44, 83));
            this.f38109a.setOnClickListener(new ci.q(this, i7, 21));
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, activity);
            this.f38111c = b2Var;
            b2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f38111c.setTypeface(org.telegram.messenger.g0.o());
            this.f38111c.setTextColor(-1);
            this.f38111c.setGravity(17);
            this.f38109a.addView(this.f38111c, c8.ma.g());
            this.f38111c.c(org.telegram.messenger.hd.N0(2131754226, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f38111c, null);
            this.f38110b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            this.f38110b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f38110b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f38110b.setAsMini();
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
        if (this.f38112e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f24348a) == null || (i10 = e10.f24349b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f24350c);
            }
            if (d1Var != null) {
                createUpdateUI(i7);
                File g10 = org.telegram.messenger.t0.f26930a.g();
                if (g10 != null && g10.exists()) {
                    this.f38110b.setIcon(15, true, z10);
                    this.f38111c.c(org.telegram.messenger.hd.N0(2131754222, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.h1.e().f24355j;
                    }
                    if (z11) {
                        this.f38110b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f38110b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.h1.e().f24356k;
                        }
                        radialProgress2.p(true, f10);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                            f11 = 0.0f;
                        } else {
                            f11 = org.telegram.messenger.h1.e().f24356k;
                        }
                        this.f38111c.c(org.telegram.messenger.hd.a0(null, null, 2131754223, Integer.valueOf((int) (f11 * 100.0f))), z10, true);
                    } else {
                        this.f38110b.setIcon(2, true, z10);
                        this.f38111c.c(org.telegram.messenger.hd.N0(2131754226, null), z10, true);
                    }
                }
                if (this.f38109a.getTag() == null) {
                    this.f38109a.setVisibility(0);
                    this.f38109a.setTag(1);
                    if (z10) {
                        this.f38109a.animate().translationY(0.0f).setInterpolator(nr.f37961g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f38109a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f38109a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f38109a.setTag(null);
                if (z10) {
                    this.f38109a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(nr.f37961g).setListener(new t11(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f38109a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f38109a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f10;
        if (this.f38109a != null && this.f38111c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                z10 = false;
            } else {
                z10 = org.telegram.messenger.h1.e().f24355j;
            }
            if (z10) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                    f10 = 0.0f;
                } else {
                    f10 = org.telegram.messenger.h1.e().f24356k;
                }
                this.f38110b.p(true, f10);
                this.f38111c.setText(org.telegram.messenger.hd.a0(null, null, 2131754223, Integer.valueOf((int) (f10 * 100.0f))));
                this.f38109a.invalidate();
            }
        }
    }
}
