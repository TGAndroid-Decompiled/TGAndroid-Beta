package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class z41 extends IUpdateLayout {
    public FrameLayout f40853a;
    public RadialProgress2 f40854b;
    public org.telegram.ui.Cells.a2 f40855c;
    public final Activity d;
    public final ViewGroup f40856e;

    public z41(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f40856e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.f40856e;
        if (viewGroup != null && this.f40853a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f40853a = frameLayout;
            frameLayout.setVisibility(4);
            this.f40853a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f40853a.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f40853a, c8.ha.e(-1, 44, 83));
            this.f40853a.setOnClickListener(new ai.v(this, i7, 19));
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, activity);
            this.f40855c = a2Var;
            a2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f40855c.setTypeface(org.telegram.messenger.g0.o());
            this.f40855c.setTextColor(-1);
            this.f40855c.setGravity(17);
            this.f40853a.addView(this.f40855c, c8.ha.g());
            this.f40855c.c(org.telegram.messenger.id.M0(2131754229, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f40855c, null);
            this.f40854b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.m6.Ci;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            this.f40854b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f40854b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f40854b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i7, boolean z9) {
        org.telegram.messenger.h1 e10;
        String str;
        int i10;
        org.telegram.messenger.d1 d1Var;
        boolean z10;
        float f10;
        float f11;
        if (this.f40856e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f22786a) == null || (i10 = e10.f22787b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f22788c);
            }
            if (d1Var != null) {
                createUpdateUI(i7);
                File g10 = org.telegram.messenger.t0.f25569a.g();
                if (g10 != null && g10.exists()) {
                    this.f40854b.setIcon(15, true, z9);
                    this.f40855c.c(org.telegram.messenger.id.M0(2131754225, null), z9, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                        z10 = false;
                    } else {
                        z10 = org.telegram.messenger.h1.e().f22793j;
                    }
                    if (z10) {
                        this.f40854b.setIcon(3, true, z9);
                        RadialProgress2 radialProgress2 = this.f40854b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.h1.e().f22794k;
                        }
                        radialProgress2.p(true, f10);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                            f11 = 0.0f;
                        } else {
                            f11 = org.telegram.messenger.h1.e().f22794k;
                        }
                        this.f40855c.c(org.telegram.messenger.id.a0(null, null, 2131754226, Integer.valueOf((int) (f11 * 100.0f))), z9, true);
                    } else {
                        this.f40854b.setIcon(2, true, z9);
                        this.f40855c.c(org.telegram.messenger.id.M0(2131754229, null), z9, true);
                    }
                }
                if (this.f40853a.getTag() == null) {
                    this.f40853a.setVisibility(0);
                    this.f40853a.setTag(1);
                    if (z9) {
                        this.f40853a.animate().translationY(0.0f).setInterpolator(wq.f40047g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f40853a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f40853a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f40853a.setTag(null);
                if (z9) {
                    this.f40853a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(wq.f40047g).setListener(new f11(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f40853a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f40853a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z9;
        float f10;
        if (this.f40853a != null && this.f40855c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                z9 = false;
            } else {
                z9 = org.telegram.messenger.h1.e().f22793j;
            }
            if (z9) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f25569a).q()) {
                    f10 = 0.0f;
                } else {
                    f10 = org.telegram.messenger.h1.e().f22794k;
                }
                this.f40854b.p(true, f10);
                this.f40855c.setText(org.telegram.messenger.id.a0(null, null, 2131754226, Integer.valueOf((int) (f10 * 100.0f))));
                this.f40853a.invalidate();
            }
        }
    }
}
