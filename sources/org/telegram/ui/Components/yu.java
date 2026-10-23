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
public final class yu implements aa1 {
    public final cv f33041a;

    public yu(cv cvVar) {
        this.f33041a = cvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        cv cvVar = this.f33041a;
        FrameLayout frameLayout = cvVar.e;
        Activity activity = cvVar.f25432r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(cvVar.f25429c.getAspectRatioView());
            cvVar.N = false;
            cvVar.M = z11;
            if (activity != null) {
                try {
                    cvVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.h3) cvVar).containerView;
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
        cvVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.h3) cvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(cvVar.L);
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
        cv cvVar = this.f33041a;
        if (cvVar.f25429c.f()) {
            cvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        cv cvVar = this.f33041a;
        wu wuVar = cvVar.f25428b;
        wuVar.setVisibility(0);
        cvVar.f25433s.setVisibility(0);
        cvVar.v.setVisibility(4);
        wuVar.setKeepScreenOn(true);
        da1 da1Var = cvVar.f25429c;
        da1Var.setVisibility(4);
        da1Var.getControlsView().setVisibility(4);
        da1Var.getTextureView().setVisibility(4);
        if (da1Var.getTextureImageView() != null) {
            da1Var.getTextureImageView().setVisibility(4);
        }
        cvVar.f25429c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            wuVar.loadUrl(cvVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(da1 da1Var, boolean z10) {
        Activity activity = this.f33041a.f25432r;
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
        org.telegram.ui.ActionBar.g3 g3Var;
        cv cvVar = this.f33041a;
        da1 da1Var = cvVar.f25429c;
        int[] iArr = cvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(cvVar.f25432r);
            if (!dh0.x(false, cvVar.f25432r, null, textureView, i10, i11, false)) {
                return null;
            }
            dh0.f25631p0.U = cvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) cvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            cvVar.O = true;
            da1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - cvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) cvVar).containerView;
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
            viewGroup3 = ((org.telegram.ui.ActionBar.h3) cvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            g3Var = ((org.telegram.ui.ActionBar.h3) cvVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(g3Var, t6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new org.telegram.ui.pq(this, 23));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f33041a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f33041a.f25432r;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        f5.B(activity, null, false);
        return false;
    }

    @Override
    public final void i(boolean z10, v91 v91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.g3 g3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.g3 g3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.g3 g3Var3;
        if (z10) {
            cv cvVar = this.f33041a;
            if (cvVar.f25432r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.h3) cvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    cv cvVar2 = this.f33041a;
                    int i10 = cvVar2.L;
                    if (i10 != -2) {
                        cvVar2.f25432r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f33041a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.h3) this.f33041a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.h3) this.f33041a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                g3Var3 = ((org.telegram.ui.ActionBar.h3) this.f33041a).backDrawable;
                g3Var3.setAlpha(0);
            }
            this.f33041a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f33041a.f25429c.getTextureView();
                View controlsView = this.f33041a.f25429c.getControlsView();
                ImageView textureImageView = this.f33041a.f25429c.getTextureImageView();
                il0 o10 = dh0.o(f7, true);
                float width = o10.f27366c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f27364a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f27365b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f27364a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f27365b);
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) this.f33041a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.h3) this.f33041a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                g3Var2 = ((org.telegram.ui.ActionBar.h3) this.f33041a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var2, t6.d, 0);
                FrameLayout frameLayout = this.f33041a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.ne(24, this, v91Var));
                animatorSet.start();
                return;
            }
            if (this.f33041a.e.getVisibility() == 0) {
                this.f33041a.e.setAlpha(1.0f);
                this.f33041a.e.setVisibility(4);
            }
            v91Var.run();
            this.f33041a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f33041a.f25432r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            cv cvVar3 = this.f33041a;
            cvVar3.setOnShowListener(cvVar3.R);
            il0 o11 = dh0.o(f7, false);
            TextureView textureView2 = this.f33041a.f25429c.getTextureView();
            ImageView textureImageView2 = this.f33041a.f25429c.getTextureImageView();
            float f10 = o11.f27366c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o11.f27364a);
            textureImageView2.setTranslationY(o11.f27365b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o11.f27364a);
            textureView2.setTranslationY(o11.f27365b);
        } else {
            dh0.j(false);
        }
        this.f33041a.setShowWithoutAnimation(true);
        this.f33041a.show();
        if (z11) {
            cv cvVar4 = this.f33041a;
            cvVar4.P = 4;
            g3Var = ((org.telegram.ui.ActionBar.h3) cvVar4).backDrawable;
            g3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f33041a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f33041a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
