package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class o51 extends IUpdateLayout {
    public FrameLayout f38110a;
    public RadialProgress2 f38111b;
    public org.telegram.ui.Cells.b2 f38112c;
    public final Activity d;
    public final ViewGroup f38113e;

    public o51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f38113e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.f38113e;
        if (viewGroup != null && this.f38110a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f38110a = frameLayout;
            frameLayout.setVisibility(4);
            this.f38110a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f38110a.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f38110a, c8.ma.e(-1, 44, 83));
            this.f38110a.setOnClickListener(new ci.q(this, i7, 21));
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, activity);
            this.f38112c = b2Var;
            b2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f38112c.setTypeface(org.telegram.messenger.g0.o());
            this.f38112c.setTextColor(-1);
            this.f38112c.setGravity(17);
            this.f38110a.addView(this.f38112c, c8.ma.g());
            this.f38112c.c(org.telegram.messenger.hd.N0(2131754226, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f38112c, null);
            this.f38111b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            this.f38111b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f38111b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f38111b.setAsMini();
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
        if (this.f38113e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f24348a) == null || (i10 = e10.f24349b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f24350c);
            }
            if (d1Var != null) {
                createUpdateUI(i7);
                File g10 = org.telegram.messenger.t0.f26930a.g();
                if (g10 != null && g10.exists()) {
                    this.f38111b.setIcon(15, true, z10);
                    this.f38112c.c(org.telegram.messenger.hd.N0(2131754222, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26930a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.h1.e().f24355j;
                    }
                    if (z11) {
                        this.f38111b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f38111b;
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
                        this.f38112c.c(org.telegram.messenger.hd.a0(null, null, 2131754223, Integer.valueOf((int) (f11 * 100.0f))), z10, true);
                    } else {
                        this.f38111b.setIcon(2, true, z10);
                        this.f38112c.c(org.telegram.messenger.hd.N0(2131754226, null), z10, true);
                    }
                }
                if (this.f38110a.getTag() == null) {
                    this.f38110a.setVisibility(0);
                    this.f38110a.setTag(1);
                    if (z10) {
                        this.f38110a.animate().translationY(0.0f).setInterpolator(nr.f37962g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f38110a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f38110a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f38110a.setTag(null);
                if (z10) {
                    this.f38110a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(nr.f37962g).setListener(new t11(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f38110a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f38110a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f10;
        if (this.f38110a != null && this.f38112c != null) {
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
                this.f38111b.p(true, f10);
                this.f38112c.setText(org.telegram.messenger.hd.a0(null, null, 2131754223, Integer.valueOf((int) (f10 * 100.0f))));
                this.f38110a.invalidate();
            }
        }
    }
}
