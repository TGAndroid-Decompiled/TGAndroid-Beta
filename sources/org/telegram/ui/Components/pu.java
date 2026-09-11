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
public final class pu implements y81 {
    public final tu f29490a;

    public pu(tu tuVar) {
        this.f29490a = tuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        tu tuVar = this.f29490a;
        FrameLayout frameLayout = tuVar.f30709e;
        Activity activity = tuVar.f30712r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(tuVar.f30708c.getAspectRatioView());
            tuVar.N = false;
            tuVar.M = z11;
            if (activity != null) {
                try {
                    tuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
                    viewGroup2.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        tuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(tuVar.L);
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
        tu tuVar = this.f29490a;
        if (tuVar.f30708c.f()) {
            tuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        tu tuVar = this.f29490a;
        nu nuVar = tuVar.f30707b;
        nuVar.setVisibility(0);
        tuVar.f30713s.setVisibility(0);
        tuVar.v.setVisibility(4);
        nuVar.setKeepScreenOn(true);
        b91 b91Var = tuVar.f30708c;
        b91Var.setVisibility(4);
        b91Var.getControlsView().setVisibility(4);
        b91Var.getTextureView().setVisibility(4);
        if (b91Var.getTextureImageView() != null) {
            b91Var.getTextureImageView().setVisibility(4);
        }
        tuVar.f30708c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            nuVar.loadUrl(tuVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void e(b91 b91Var, boolean z10) {
        Activity activity = this.f29490a.f30712r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
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
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        tu tuVar = this.f29490a;
        b91 b91Var = tuVar.f30708c;
        int[] iArr = tuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(tuVar.f30712r);
            if (!eg0.x(false, tuVar.f30712r, null, textureView, i10, i11, false)) {
                return null;
            }
            eg0.f25675p0.U = tuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            tuVar.O = true;
            b91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - tuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = b91Var.getTextureView();
            ImageView textureImageView = b91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) tuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, t6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new j6(this, 20));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f29490a.container;
    }

    @Override
    public final boolean h() {
        return this.f29490a.G();
    }

    @Override
    public final void i(boolean z10, t81 t81Var, float f7, boolean z11) {
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
            tu tuVar = this.f29490a;
            if (tuVar.f30712r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) tuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    tu tuVar2 = this.f29490a;
                    int i10 = tuVar2.L;
                    if (i10 != -2) {
                        tuVar2.f30712r.setRequestedOrientation(i10);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.f29490a.f30709e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f29490a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f29490a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f29490a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f29490a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f29490a.f30708c.getTextureView();
                View controlsView = this.f29490a.f30708c.getControlsView();
                ImageView textureImageView = this.f29490a.f30708c.getTextureImageView();
                hk0 o9 = eg0.o(f7, true);
                float width = o9.f26745c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f26743a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f26744b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f26743a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f26744b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f29490a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f29490a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f29490a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, t6.d, 0);
                FrameLayout frameLayout = this.f29490a.f30709e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bi.t(23, this, t81Var));
                animatorSet.start();
                return;
            }
            if (this.f29490a.f30709e.getVisibility() == 0) {
                this.f29490a.f30709e.setAlpha(1.0f);
                this.f29490a.f30709e.setVisibility(4);
            }
            t81Var.run();
            this.f29490a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f29490a.f30712r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            tu tuVar3 = this.f29490a;
            tuVar3.setOnShowListener(tuVar3.R);
            hk0 o10 = eg0.o(f7, false);
            TextureView textureView2 = this.f29490a.f30708c.getTextureView();
            ImageView textureImageView2 = this.f29490a.f30708c.getTextureImageView();
            float f10 = o10.f26745c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f26743a);
            textureImageView2.setTranslationY(o10.f26744b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f26743a);
            textureView2.setTranslationY(o10.f26744b);
        } else {
            eg0.j(false);
        }
        this.f29490a.setShowWithoutAnimation(true);
        this.f29490a.show();
        if (z11) {
            tu tuVar4 = this.f29490a;
            tuVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) tuVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f29490a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f29490a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
