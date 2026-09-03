package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
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
public final class ku implements b91 {
    public final ou f26398a;

    public ku(ou ouVar) {
        this.f26398a = ouVar;
    }

    @Override
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ou ouVar = this.f26398a;
        FrameLayout frameLayout = ouVar.e;
        Activity activity = ouVar.f27655r;
        if (z4) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(ouVar.f27652c.getAspectRatioView());
            ouVar.K = false;
            ouVar.J = z10;
            if (activity != null) {
                try {
                    ouVar.I = activity.getRequestedOrientation();
                    if (z10) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.g3) ouVar).containerView;
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
        ouVar.J = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.g3) ouVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(ouVar.I);
                return null;
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        ou ouVar = this.f26398a;
        if (ouVar.f27652c.f()) {
            ouVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        ou ouVar = this.f26398a;
        iu iuVar = ouVar.f27651b;
        iuVar.setVisibility(0);
        ouVar.f27656s.setVisibility(0);
        ouVar.v.setVisibility(4);
        iuVar.setKeepScreenOn(true);
        e91 e91Var = ouVar.f27652c;
        e91Var.setVisibility(4);
        e91Var.getControlsView().setVisibility(4);
        e91Var.getTextureView().setVisibility(4);
        if (e91Var.getTextureImageView() != null) {
            e91Var.getTextureImageView().setVisibility(4);
        }
        ouVar.f27652c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            iuVar.loadUrl(ouVar.H, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(e91 e91Var, boolean z4) {
        Activity activity = this.f26398a.f27655r;
        if (z4) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.f3 f3Var;
        ou ouVar = this.f26398a;
        e91 e91Var = ouVar.f27652c;
        int[] iArr = ouVar.B;
        if (z4) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(ouVar.f27655r);
            if (!mg0.x(false, ouVar.f27655r, null, textureView, i10, i11, false)) {
                return null;
            }
            mg0.m0.R = ouVar;
            return textureView;
        } else if (!z10) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) ouVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            ouVar.L = true;
            e91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - ouVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) ouVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = e91Var.getTextureView();
            ImageView textureImageView = e91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.g3) ouVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            f3Var = ((org.telegram.ui.ActionBar.g3) ouVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(f3Var, n6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new a9(this, 16));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f26398a.container;
    }

    @Override
    public final boolean h() {
        return this.f26398a.F();
    }

    @Override
    public final void i(boolean z4, w81 w81Var, float f10, boolean z10) {
        org.telegram.ui.ActionBar.f3 f3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.f3 f3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.f3 f3Var3;
        if (z4) {
            ou ouVar = this.f26398a;
            if (ouVar.f27655r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.g3) ouVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    ou ouVar2 = this.f26398a;
                    int i10 = ouVar2.I;
                    if (i10 != -2) {
                        ouVar2.f27655r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f26398a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.g3) this.f26398a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.g3) this.f26398a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                f3Var3 = ((org.telegram.ui.ActionBar.g3) this.f26398a).backDrawable;
                f3Var3.setAlpha(0);
            }
            this.f26398a.setOnShowListener(null);
            if (z10) {
                TextureView textureView = this.f26398a.f27652c.getTextureView();
                View controlsView = this.f26398a.f27652c.getControlsView();
                ImageView textureImageView = this.f26398a.f27652c.getTextureImageView();
                rk0 o10 = mg0.o(f10, true);
                float width = o10.f28485c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f28483a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f28484b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f28483a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f28484b);
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) this.f26398a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.g3) this.f26398a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                f3Var2 = ((org.telegram.ui.ActionBar.g3) this.f26398a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(f3Var2, n6.d, 0);
                FrameLayout frameLayout = this.f26398a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new dg.y2(20, this, w81Var));
                animatorSet.start();
                return;
            }
            if (this.f26398a.e.getVisibility() == 0) {
                this.f26398a.e.setAlpha(1.0f);
                this.f26398a.e.setVisibility(4);
            }
            w81Var.run();
            this.f26398a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f26398a.f27655r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z10) {
            ou ouVar3 = this.f26398a;
            ouVar3.setOnShowListener(ouVar3.O);
            rk0 o11 = mg0.o(f10, false);
            TextureView textureView2 = this.f26398a.f27652c.getTextureView();
            ImageView textureImageView2 = this.f26398a.f27652c.getTextureImageView();
            float f11 = o11.f28485c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(o11.f28483a);
            textureImageView2.setTranslationY(o11.f28484b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(o11.f28483a);
            textureView2.setTranslationY(o11.f28484b);
        } else {
            mg0.j(false);
        }
        this.f26398a.setShowWithoutAnimation(true);
        this.f26398a.show();
        if (z10) {
            ou ouVar4 = this.f26398a;
            ouVar4.M = 4;
            f3Var = ((org.telegram.ui.ActionBar.g3) ouVar4).backDrawable;
            f3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f26398a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f26398a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10, int i10) {
    }
}
