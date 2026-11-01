package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.ui.IUpdateLayout;
public final class c61 extends IUpdateLayout {
    public FrameLayout f25035a;
    public RadialProgress2 f25036b;
    public org.telegram.ui.Cells.a2 f25037c;
    public final Activity d;
    public final ViewGroup e;

    public c61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.f25035a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f25035a = frameLayout;
            frameLayout.setVisibility(4);
            this.f25035a.setTranslationY(org.telegram.messenger.i0.L(44.0f));
            this.f25035a.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 2, -1));
            viewGroup.addView(this.f25035a, w7.b6.e(-1, 44, 83));
            this.f25035a.setOnClickListener(new bh.f(this, i10, 14));
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, activity);
            this.f25037c = a2Var;
            a2Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.f25037c.setTypeface(org.telegram.messenger.i0.o());
            this.f25037c.setTextColor(-1);
            this.f25037c.setGravity(17);
            this.f25035a.addView(this.f25037c, w7.b6.g());
            this.f25037c.c(org.telegram.messenger.dd.L0(2131754229, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.f25037c, null);
            this.f25036b = radialProgress2;
            int i11 = org.telegram.ui.ActionBar.t6.Ci;
            radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            this.f25036b.r(0, 0, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
            this.f25036b.setCircleRadius(org.telegram.messenger.i0.L(11.0f));
            this.f25036b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i10, boolean z10) {
        org.telegram.messenger.k1 e;
        String str;
        int i11;
        org.telegram.messenger.g1 g1Var;
        boolean z11;
        float f7;
        float f10;
        if (this.e != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q() || (str = (e = org.telegram.messenger.k1.e()).f16538a) == null || (i11 = e.f16539b) == 0) {
                g1Var = null;
            } else {
                g1Var = new org.telegram.messenger.g1(str, i11, e.f16540c);
            }
            if (g1Var != null) {
                createUpdateUI(i10);
                File g10 = org.telegram.messenger.w0.f18944a.g();
                if (g10 != null && g10.exists()) {
                    this.f25036b.setIcon(15, true, z10);
                    this.f25037c.c(org.telegram.messenger.dd.L0(2131754225, null), z10, true);
                } else {
                    if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                        z11 = false;
                    } else {
                        z11 = org.telegram.messenger.k1.e().f16544j;
                    }
                    if (z11) {
                        this.f25036b.setIcon(3, true, z10);
                        RadialProgress2 radialProgress2 = this.f25036b;
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                            f7 = 0.0f;
                        } else {
                            f7 = org.telegram.messenger.k1.e().f16545k;
                        }
                        radialProgress2.p(true, f7);
                        if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                            f10 = 0.0f;
                        } else {
                            f10 = org.telegram.messenger.k1.e().f16545k;
                        }
                        this.f25037c.c(org.telegram.messenger.dd.a0(null, null, 2131754226, Integer.valueOf((int) (f10 * 100.0f))), z10, true);
                    } else {
                        this.f25036b.setIcon(2, true, z10);
                        this.f25037c.c(org.telegram.messenger.dd.L0(2131754229, null), z10, true);
                    }
                }
                if (this.f25035a.getTag() == null) {
                    this.f25035a.setVisibility(0);
                    this.f25035a.setTag(1);
                    if (z10) {
                        this.f25035a.animate().translationY(0.0f).setInterpolator(gr.f26524g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        this.f25035a.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout = this.f25035a;
            if (frameLayout != null && frameLayout.getTag() != null) {
                this.f25035a.setTag(null);
                if (z10) {
                    this.f25035a.animate().translationY(org.telegram.messenger.i0.L(44.0f)).setInterpolator(gr.f26524g).setListener(new q11(this, 5)).setDuration(180L).start();
                    return;
                }
                this.f25035a.setTranslationY(org.telegram.messenger.i0.L(44.0f));
                this.f25035a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        boolean z10;
        float f7;
        if (this.f25035a != null && this.f25037c != null) {
            if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                z10 = false;
            } else {
                z10 = org.telegram.messenger.k1.e().f16544j;
            }
            if (z10) {
                if (!((ApplicationLoaderImpl) org.telegram.messenger.w0.f18944a).q()) {
                    f7 = 0.0f;
                } else {
                    f7 = org.telegram.messenger.k1.e().f16545k;
                }
                this.f25036b.p(true, f7);
                this.f25037c.setText(org.telegram.messenger.dd.a0(null, null, 2131754226, Integer.valueOf((int) (f7 * 100.0f))));
                this.f25035a.invalidate();
            }
        }
    }
}
