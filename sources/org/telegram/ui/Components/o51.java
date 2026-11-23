package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class o51 extends IUpdateLayout {
    public FrameLayout f38076a;
    public RadialProgress2 f38077b;
    public org.telegram.ui.Cells.b2 f38078c;
    public final Activity d;
    public final ViewGroup f38079e;

    public o51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f38079e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.f38079e;
        if (viewGroup != null && this.f38076a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f38076a = frameLayout;
            frameLayout.setVisibility(4);
            this.f38076a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f38076a.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f38076a, c8.na.e(-1, 44, 83));
            this.f38076a.setOnClickListener(new ci.q(this, i7, 21));
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, activity);
            this.f38078c = b2Var;
            b2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f38078c.setTypeface(org.telegram.messenger.g0.o());
            this.f38078c.setTextColor(-1);
            this.f38078c.setGravity(17);
            this.f38076a.addView(this.f38078c, c8.na.g());
            this.f38078c.c(org.telegram.messenger.hd.N0(2131754226, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f38078c, null);
            this.f38077b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            this.f38077b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f38077b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f38077b.setAsMini();
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
        if (this.f38079e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26894a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f24312a) == null || (i10 = e10.f24313b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f24314c);
            }
            if (d1Var != null) {
                createUpdateUI(i7);
                File g10 = org.telegram.messenger.t0.f26894a.g();
                if (g10 != null && g10.exists()) {
                    this.f38077b.setIcon(15, true, z10);
                    this.f38078c.c(org.telegram.messenger.hd.N0(2131754222, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26894a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.h1.e().f24319j;
                    }
                    if (z11) {
                        this.f38077b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f38077b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26894a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.h1.e().f24320k;
                        }
                        radialProgress2.p(true, f10);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26894a).q()) {
                            f11 = 0.0f;
                        } else {
                            f11 = org.telegram.messenger.h1.e().f24320k;
                        }
                        this.f38078c.c(org.telegram.messenger.hd.a0(null, null, 2131754223, Integer.valueOf((int) (f11 * 100.0f))), z10, true);
                    } else {
                        this.f38077b.setIcon(2, true, z10);
                        this.f38078c.c(org.telegram.messenger.hd.N0(2131754226, null), z10, true);
                    }
                }
                if (this.f38076a.getTag() == null) {
                    this.f38076a.setVisibility(0);
                    this.f38076a.setTag(1);
                    if (z10) {
                        this.f38076a.animate().translationY(0.0f).setInterpolator(nr.f37918g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f38076a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f38076a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f38076a.setTag(null);
                if (z10) {
                    this.f38076a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(nr.f37918g).setListener(new t11(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f38076a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f38076a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f10;
        if (this.f38076a != null && this.f38078c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26894a).q()) {
                z10 = false;
            } else {
                z10 = org.telegram.messenger.h1.e().f24319j;
            }
            if (z10) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26894a).q()) {
                    f10 = 0.0f;
                } else {
                    f10 = org.telegram.messenger.h1.e().f24320k;
                }
                this.f38077b.p(true, f10);
                this.f38078c.setText(org.telegram.messenger.hd.a0(null, null, 2131754223, Integer.valueOf((int) (f10 * 100.0f))));
                this.f38076a.invalidate();
            }
        }
    }
}
