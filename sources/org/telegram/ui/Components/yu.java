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
public final class yu implements t91 {
    public final cv f32737a;

    public yu(cv cvVar) {
        this.f32737a = cvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        cv cvVar = this.f32737a;
        FrameLayout frameLayout = cvVar.e;
        Activity activity = cvVar.f25268r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(cvVar.f25265c.getAspectRatioView());
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
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) cvVar).containerView;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) cvVar).containerView;
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
        cv cvVar = this.f32737a;
        if (cvVar.f25265c.f()) {
            cvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        cv cvVar = this.f32737a;
        wu wuVar = cvVar.f25264b;
        wuVar.setVisibility(0);
        cvVar.f25269s.setVisibility(0);
        cvVar.v.setVisibility(4);
        wuVar.setKeepScreenOn(true);
        w91 w91Var = cvVar.f25265c;
        w91Var.setVisibility(4);
        w91Var.getControlsView().setVisibility(4);
        w91Var.getTextureView().setVisibility(4);
        if (w91Var.getTextureImageView() != null) {
            w91Var.getTextureImageView().setVisibility(4);
        }
        cvVar.f25265c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            wuVar.loadUrl(cvVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(w91 w91Var, boolean z10) {
        Activity activity = this.f32737a.f25268r;
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
        org.telegram.ui.ActionBar.e3 e3Var;
        cv cvVar = this.f32737a;
        w91 w91Var = cvVar.f25265c;
        int[] iArr = cvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(cvVar.f25268r);
            if (!ah0.x(false, cvVar.f25268r, null, textureView, i10, i11, false)) {
                return null;
            }
            ah0.f24602p0.U = cvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) cvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            cvVar.O = true;
            w91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - cvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) cvVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = w91Var.getTextureView();
            ImageView textureImageView = w91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) cvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) cvVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, t6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new org.telegram.ui.nq(this, 22));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f32737a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f32737a.f25268r;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        f5.A(activity, null, false);
        return false;
    }

    @Override
    public final void i(boolean z10, o91 o91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.e3 e3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.e3 e3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.e3 e3Var3;
        if (z10) {
            cv cvVar = this.f32737a;
            if (cvVar.f25268r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) cvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    cv cvVar2 = this.f32737a;
                    int i10 = cvVar2.L;
                    if (i10 != -2) {
                        cvVar2.f25268r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f32737a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f32737a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f32737a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f32737a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f32737a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f32737a.f25265c.getTextureView();
                View controlsView = this.f32737a.f25265c.getControlsView();
                ImageView textureImageView = this.f32737a.f25265c.getTextureImageView();
                fl0 o10 = ah0.o(f7, true);
                float width = o10.f26278c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f26276a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f26277b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f26276a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f26277b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f32737a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f32737a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f32737a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, t6.d, 0);
                FrameLayout frameLayout = this.f32737a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.me(24, this, o91Var));
                animatorSet.start();
                return;
            }
            if (this.f32737a.e.getVisibility() == 0) {
                this.f32737a.e.setAlpha(1.0f);
                this.f32737a.e.setVisibility(4);
            }
            o91Var.run();
            this.f32737a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f32737a.f25268r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            cv cvVar3 = this.f32737a;
            cvVar3.setOnShowListener(cvVar3.R);
            fl0 o11 = ah0.o(f7, false);
            TextureView textureView2 = this.f32737a.f25265c.getTextureView();
            ImageView textureImageView2 = this.f32737a.f25265c.getTextureImageView();
            float f10 = o11.f26278c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o11.f26276a);
            textureImageView2.setTranslationY(o11.f26277b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o11.f26276a);
            textureView2.setTranslationY(o11.f26277b);
        } else {
            ah0.j(false);
        }
        this.f32737a.setShowWithoutAnimation(true);
        this.f32737a.show();
        if (z11) {
            cv cvVar4 = this.f32737a;
            cvVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) cvVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f32737a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f32737a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
