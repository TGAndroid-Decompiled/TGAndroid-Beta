package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class b51 extends IUpdateLayout {
    public FrameLayout f33201a;
    public RadialProgress2 f33202b;
    public org.telegram.ui.Cells.a2 f33203c;
    public final Activity d;
    public final ViewGroup f33204e;

    public b51(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.f33204e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i7) {
        ViewGroup viewGroup = this.f33204e;
        if (viewGroup != null && this.f33201a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f33201a = frameLayout;
            frameLayout.setVisibility(4);
            this.f33201a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
            this.f33201a.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f33201a, c8.ja.e(-1, 44, 83));
            this.f33201a.setOnClickListener(new ci.q(this, i7, 19));
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, activity);
            this.f33203c = a2Var;
            a2Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f33203c.setTypeface(org.telegram.messenger.g0.o());
            this.f33203c.setTextColor(-1);
            this.f33203c.setGravity(17);
            this.f33201a.addView(this.f33203c, c8.ja.g());
            this.f33203c.c(org.telegram.messenger.hd.M0(2131754229, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f33203c, null);
            this.f33202b = radialProgress2;
            int i10 = org.telegram.ui.ActionBar.j6.Fi;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.j6.x0(null, i10, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            this.f33202b.r(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            this.f33202b.setCircleRadius(org.telegram.messenger.g0.L(11.0f));
            this.f33202b.setAsMini();
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
        if (this.f33204e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q() || (str = (e10 = org.telegram.messenger.h1.e()).f24014a) == null || (i10 = e10.f24015b) == 0) {
                d1Var = null;
            } else {
                d1Var = new org.telegram.messenger.d1(str, i10, e10.f24016c);
            }
            if (d1Var != null) {
                createUpdateUI(i7);
                File g10 = org.telegram.messenger.t0.f26599a.g();
                if (g10 != null && g10.exists()) {
                    this.f33202b.setIcon(15, true, z10);
                    this.f33203c.c(org.telegram.messenger.hd.M0(2131754225, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.h1.e().f24021j;
                    }
                    if (z11) {
                        this.f33202b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f33202b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.h1.e().f24022k;
                        }
                        radialProgress2.p(true, f10);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q()) {
                            f11 = 0.0f;
                        } else {
                            f11 = org.telegram.messenger.h1.e().f24022k;
                        }
                        this.f33203c.c(org.telegram.messenger.hd.a0(null, null, 2131754226, Integer.valueOf((int) (f11 * 100.0f))), z10, true);
                    } else {
                        this.f33202b.setIcon(2, true, z10);
                        this.f33203c.c(org.telegram.messenger.hd.M0(2131754229, null), z10, true);
                    }
                }
                if (this.f33201a.getTag() == null) {
                    this.f33201a.setVisibility(0);
                    this.f33201a.setTag(1);
                    if (z10) {
                        this.f33201a.animate().translationY(0.0f).setInterpolator(er.f34421g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f33201a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f33201a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f33201a.setTag(null);
                if (z10) {
                    this.f33201a.animate().translationY(org.telegram.messenger.g0.L(44.0f)).setInterpolator(er.f34421g).setListener(new i11(this, 4)).setDuration(180L).start();
                    return;
                }
                this.f33201a.setTranslationY(org.telegram.messenger.g0.L(44.0f));
                this.f33201a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f10;
        if (this.f33201a != null && this.f33203c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q()) {
                z10 = false;
            } else {
                z10 = org.telegram.messenger.h1.e().f24021j;
            }
            if (z10) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.t0.f26599a).q()) {
                    f10 = 0.0f;
                } else {
                    f10 = org.telegram.messenger.h1.e().f24022k;
                }
                this.f33202b.p(true, f10);
                this.f33203c.setText(org.telegram.messenger.hd.a0(null, null, 2131754226, Integer.valueOf((int) (f10 * 100.0f))));
                this.f33201a.invalidate();
            }
        }
    }
}
