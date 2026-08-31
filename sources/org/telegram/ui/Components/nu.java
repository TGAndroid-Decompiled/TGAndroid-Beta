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
public final class nu implements c91 {
    public final ru f29627a;

    public nu(ru ruVar) {
        this.f29627a = ruVar;
    }

    @Override
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ru ruVar = this.f29627a;
        FrameLayout frameLayout = ruVar.f30857e;
        Activity activity = ruVar.f30860r;
        if (z4) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(ruVar.f30856c.getAspectRatioView());
            ruVar.K = false;
            ruVar.J = z10;
            if (activity != null) {
                try {
                    ruVar.I = activity.getRequestedOrientation();
                    if (z10) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
                    viewGroup2.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        ruVar.J = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(ruVar.I);
                return null;
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        ru ruVar = this.f29627a;
        if (ruVar.f30856c.f()) {
            ruVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        ru ruVar = this.f29627a;
        lu luVar = ruVar.f30855b;
        luVar.setVisibility(0);
        ruVar.f30861s.setVisibility(0);
        ruVar.v.setVisibility(4);
        luVar.setKeepScreenOn(true);
        f91 f91Var = ruVar.f30856c;
        f91Var.setVisibility(4);
        f91Var.getControlsView().setVisibility(4);
        f91Var.getTextureView().setVisibility(4);
        if (f91Var.getTextureImageView() != null) {
            f91Var.getTextureImageView().setVisibility(4);
        }
        ruVar.f30856c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            luVar.loadUrl(ruVar.H, hashMap);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void e(f91 f91Var, boolean z4) {
        Activity activity = this.f29627a.f30860r;
        if (z4) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.g3 g3Var;
        ru ruVar = this.f29627a;
        f91 f91Var = ruVar.f30856c;
        int[] iArr = ruVar.B;
        if (z4) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(ruVar.f30860r);
            if (!ng0.x(false, ruVar.f30860r, null, textureView, i10, i11, false)) {
                return null;
            }
            ng0.m0.R = ruVar;
            return textureView;
        } else if (!z10) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            ruVar.L = true;
            f91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - ruVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = f91Var.getTextureView();
            ImageView textureImageView = f91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            g3Var = ((org.telegram.ui.ActionBar.h3) ruVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(g3Var, n6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new a9(this, 16));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f29627a.container;
    }

    @Override
    public final boolean h() {
        return this.f29627a.F();
    }

    @Override
    public final void i(boolean z4, x81 x81Var, float f10, boolean z10) {
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
        if (z4) {
            ru ruVar = this.f29627a;
            if (ruVar.f30860r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.h3) ruVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    ru ruVar2 = this.f29627a;
                    int i10 = ruVar2.I;
                    if (i10 != -2) {
                        ruVar2.f30860r.setRequestedOrientation(i10);
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            if (this.f29627a.f30857e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.h3) this.f29627a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.h3) this.f29627a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                g3Var3 = ((org.telegram.ui.ActionBar.h3) this.f29627a).backDrawable;
                g3Var3.setAlpha(0);
            }
            this.f29627a.setOnShowListener(null);
            if (z10) {
                TextureView textureView = this.f29627a.f30856c.getTextureView();
                View controlsView = this.f29627a.f30856c.getControlsView();
                ImageView textureImageView = this.f29627a.f30856c.getTextureImageView();
                tk0 o10 = ng0.o(f10, true);
                float width = o10.f31357c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f31355a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f31356b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f31355a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f31356b);
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) this.f29627a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.h3) this.f29627a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                g3Var2 = ((org.telegram.ui.ActionBar.h3) this.f29627a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var2, n6.d, 0);
                FrameLayout frameLayout = this.f29627a.f30857e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new eg.w2(20, this, x81Var));
                animatorSet.start();
                return;
            }
            if (this.f29627a.f30857e.getVisibility() == 0) {
                this.f29627a.f30857e.setAlpha(1.0f);
                this.f29627a.f30857e.setVisibility(4);
            }
            x81Var.run();
            this.f29627a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f29627a.f30860r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z10) {
            ru ruVar3 = this.f29627a;
            ruVar3.setOnShowListener(ruVar3.O);
            tk0 o11 = ng0.o(f10, false);
            TextureView textureView2 = this.f29627a.f30856c.getTextureView();
            ImageView textureImageView2 = this.f29627a.f30856c.getTextureImageView();
            float f11 = o11.f31357c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(o11.f31355a);
            textureImageView2.setTranslationY(o11.f31356b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(o11.f31355a);
            textureView2.setTranslationY(o11.f31356b);
        } else {
            ng0.j(false);
        }
        this.f29627a.setShowWithoutAnimation(true);
        this.f29627a.show();
        if (z10) {
            ru ruVar4 = this.f29627a;
            ruVar4.M = 4;
            g3Var = ((org.telegram.ui.ActionBar.h3) ruVar4).backDrawable;
            g3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f29627a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f29627a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10, int i10) {
    }
}
