package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
public final class dv implements aa1 {
    public final hv f24189a;

    public dv(hv hvVar) {
        this.f24189a = hvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        hv hvVar = this.f24189a;
        FrameLayout frameLayout = hvVar.e;
        Activity activity = hvVar.f25409r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(hvVar.f25406c.getAspectRatioView());
            hvVar.N = false;
            hvVar.M = z11;
            if (activity != null) {
                try {
                    hvVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
                    viewGroup2.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e) {
                    FileLog.e(e);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        hvVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(hvVar.L);
                return null;
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        hv hvVar = this.f24189a;
        if (hvVar.f25406c.f()) {
            hvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        hv hvVar = this.f24189a;
        bv bvVar = hvVar.f25405b;
        bvVar.setVisibility(0);
        hvVar.f25410s.setVisibility(0);
        hvVar.v.setVisibility(4);
        bvVar.setKeepScreenOn(true);
        da1 da1Var = hvVar.f25406c;
        da1Var.setVisibility(4);
        da1Var.getControlsView().setVisibility(4);
        da1Var.getTextureView().setVisibility(4);
        if (da1Var.getTextureImageView() != null) {
            da1Var.getTextureImageView().setVisibility(4);
        }
        hvVar.f25406c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            bvVar.loadUrl(hvVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(da1 da1Var, boolean z10) {
        Activity activity = this.f24189a.f25409r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.d3 d3Var;
        hv hvVar = this.f24189a;
        da1 da1Var = hvVar.f25406c;
        int[] iArr = hvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(hvVar.f25409r);
            if (!fh0.x(false, hvVar.f25409r, null, textureView, i10, i11, false)) {
                return null;
            }
            fh0.f24733p0.U = hvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            hvVar.O = true;
            da1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - hvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = da1Var.getTextureView();
            ImageView textureImageView = da1Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, property, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, property2, 1.0f);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, property3, iArr[0]);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, property4, iArr[1]);
            viewGroup3 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            d3Var = ((org.telegram.ui.ActionBar.e3) hvVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(d3Var, v6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new l6(this, 20));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f24189a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f24189a.f25409r;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        g5.A(activity, null, false);
        return false;
    }

    @Override
    public final void i(boolean z10, v91 v91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.d3 d3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.d3 d3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.d3 d3Var3;
        if (z10) {
            hv hvVar = this.f24189a;
            if (hvVar.f25409r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.e3) hvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    hv hvVar2 = this.f24189a;
                    int i10 = hvVar2.L;
                    if (i10 != -2) {
                        hvVar2.f25409r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f24189a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.e3) this.f24189a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.e3) this.f24189a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                d3Var3 = ((org.telegram.ui.ActionBar.e3) this.f24189a).backDrawable;
                d3Var3.setAlpha(0);
            }
            this.f24189a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f24189a.f25406c.getTextureView();
                View controlsView = this.f24189a.f25406c.getControlsView();
                ImageView textureImageView = this.f24189a.f25406c.getTextureImageView();
                il0 o10 = fh0.o(f7, true);
                float width = o10.f25655c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f25653a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f25654b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f25653a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f25654b);
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) this.f24189a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.e3) this.f24189a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                d3Var2 = ((org.telegram.ui.ActionBar.e3) this.f24189a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(d3Var2, v6.d, 0);
                FrameLayout frameLayout = this.f24189a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bi.t(23, this, v91Var));
                animatorSet.start();
                return;
            }
            if (this.f24189a.e.getVisibility() == 0) {
                this.f24189a.e.setAlpha(1.0f);
                this.f24189a.e.setVisibility(4);
            }
            v91Var.run();
            this.f24189a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f24189a.f25409r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            hv hvVar3 = this.f24189a;
            hvVar3.setOnShowListener(hvVar3.R);
            il0 o11 = fh0.o(f7, false);
            TextureView textureView2 = this.f24189a.f25406c.getTextureView();
            ImageView textureImageView2 = this.f24189a.f25406c.getTextureImageView();
            float f10 = o11.f25655c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o11.f25653a);
            textureImageView2.setTranslationY(o11.f25654b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o11.f25653a);
            textureView2.setTranslationY(o11.f25654b);
        } else {
            fh0.j(false);
        }
        this.f24189a.setShowWithoutAnimation(true);
        this.f24189a.show();
        if (z11) {
            hv hvVar4 = this.f24189a;
            hvVar4.P = 4;
            d3Var = ((org.telegram.ui.ActionBar.e3) hvVar4).backDrawable;
            d3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f24189a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.f24189a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
