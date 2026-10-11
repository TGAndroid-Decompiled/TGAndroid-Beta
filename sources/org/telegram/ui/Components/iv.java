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
public final class iv implements fa1 {
    public final mv f27469a;

    public iv(mv mvVar) {
        this.f27469a = mvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        mv mvVar = this.f27469a;
        FrameLayout frameLayout = mvVar.f28866e;
        Activity activity = mvVar.f28869r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(mvVar.f28865c.getAspectRatioView());
            mvVar.N = false;
            mvVar.M = z11;
            if (activity != null) {
                try {
                    mvVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.e3) mvVar).containerView;
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
        mvVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.e3) mvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(mvVar.L);
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
        mv mvVar = this.f27469a;
        if (mvVar.f28865c.f()) {
            mvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        mv mvVar = this.f27469a;
        gv gvVar = mvVar.f28864b;
        gvVar.setVisibility(0);
        mvVar.f28870s.setVisibility(0);
        mvVar.v.setVisibility(4);
        gvVar.setKeepScreenOn(true);
        ia1 ia1Var = mvVar.f28865c;
        ia1Var.setVisibility(4);
        ia1Var.getControlsView().setVisibility(4);
        ia1Var.getTextureView().setVisibility(4);
        if (ia1Var.getTextureImageView() != null) {
            ia1Var.getTextureImageView().setVisibility(4);
        }
        mvVar.f28865c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            gvVar.loadUrl(mvVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void e(ia1 ia1Var, boolean z10) {
        Activity activity = this.f27469a.f28869r;
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
        org.telegram.ui.ActionBar.d3 d3Var;
        mv mvVar = this.f27469a;
        ia1 ia1Var = mvVar.f28865c;
        int[] iArr = mvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(mvVar.f28869r);
            if (!ih0.x(false, mvVar.f28869r, null, textureView, i10, i11, false)) {
                return null;
            }
            ih0.f27325p0.U = mvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) mvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            mvVar.O = true;
            ia1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - mvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) mvVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = ia1Var.getTextureView();
            ImageView textureImageView = ia1Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.e3) mvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            d3Var = ((org.telegram.ui.ActionBar.e3) mvVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(d3Var, u6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new t8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f27469a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f27469a.f28869r;
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
    public final void i(boolean z10, aa1 aa1Var, float f7, boolean z11) {
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
            mv mvVar = this.f27469a;
            if (mvVar.f28869r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.e3) mvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    mv mvVar2 = this.f27469a;
                    int i10 = mvVar2.L;
                    if (i10 != -2) {
                        mvVar2.f28869r.setRequestedOrientation(i10);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.f27469a.f28866e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.e3) this.f27469a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.e3) this.f27469a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                d3Var3 = ((org.telegram.ui.ActionBar.e3) this.f27469a).backDrawable;
                d3Var3.setAlpha(0);
            }
            this.f27469a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27469a.f28865c.getTextureView();
                View controlsView = this.f27469a.f28865c.getControlsView();
                ImageView textureImageView = this.f27469a.f28865c.getTextureImageView();
                ol0 o9 = ih0.o(f7, true);
                float width = o9.f29427c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f29425a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f29426b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f29425a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f29426b);
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) this.f27469a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.e3) this.f27469a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                d3Var2 = ((org.telegram.ui.ActionBar.e3) this.f27469a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(d3Var2, u6.d, 0);
                FrameLayout frameLayout = this.f27469a.f28866e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, aa1Var));
                animatorSet.start();
                return;
            }
            if (this.f27469a.f28866e.getVisibility() == 0) {
                this.f27469a.f28866e.setAlpha(1.0f);
                this.f27469a.f28866e.setVisibility(4);
            }
            aa1Var.run();
            this.f27469a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27469a.f28869r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            mv mvVar3 = this.f27469a;
            mvVar3.setOnShowListener(mvVar3.R);
            ol0 o10 = ih0.o(f7, false);
            TextureView textureView2 = this.f27469a.f28865c.getTextureView();
            ImageView textureImageView2 = this.f27469a.f28865c.getTextureImageView();
            float f10 = o10.f29427c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f29425a);
            textureImageView2.setTranslationY(o10.f29426b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f29425a);
            textureView2.setTranslationY(o10.f29426b);
        } else {
            ih0.j(false);
        }
        this.f27469a.setShowWithoutAnimation(true);
        this.f27469a.show();
        if (z11) {
            mv mvVar4 = this.f27469a;
            mvVar4.P = 4;
            d3Var = ((org.telegram.ui.ActionBar.e3) mvVar4).backDrawable;
            d3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f27469a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.f27469a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
