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
public final class iv implements ea1 {
    public final mv f27461a;

    public iv(mv mvVar) {
        this.f27461a = mvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        mv mvVar = this.f27461a;
        FrameLayout frameLayout = mvVar.f28904e;
        Activity activity = mvVar.f28907r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(mvVar.f28903c.getAspectRatioView());
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
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) mvVar).containerView;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) mvVar).containerView;
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
        mv mvVar = this.f27461a;
        if (mvVar.f28903c.f()) {
            mvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        mv mvVar = this.f27461a;
        gv gvVar = mvVar.f28902b;
        gvVar.setVisibility(0);
        mvVar.f28908s.setVisibility(0);
        mvVar.v.setVisibility(4);
        gvVar.setKeepScreenOn(true);
        ia1 ia1Var = mvVar.f28903c;
        ia1Var.setVisibility(4);
        ia1Var.getControlsView().setVisibility(4);
        ia1Var.getTextureView().setVisibility(4);
        if (ia1Var.getTextureImageView() != null) {
            ia1Var.getTextureImageView().setVisibility(4);
        }
        mvVar.f28903c.g(null, null, null, null, false);
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
        Activity activity = this.f27461a.f28907r;
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
        mv mvVar = this.f27461a;
        ia1 ia1Var = mvVar.f28903c;
        int[] iArr = mvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(mvVar.f28907r);
            if (!hh0.x(false, mvVar.f28907r, null, textureView, i10, i11, false)) {
                return null;
            }
            hh0.f27011p0.U = mvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) mvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            mvVar.O = true;
            ia1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - mvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) mvVar).containerView;
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) mvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) mvVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, u6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new t8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f27461a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f27461a.f28907r;
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
    public final void i(boolean z10, z91 z91Var, float f7, boolean z11) {
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
            mv mvVar = this.f27461a;
            if (mvVar.f28907r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) mvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    mv mvVar2 = this.f27461a;
                    int i10 = mvVar2.L;
                    if (i10 != -2) {
                        mvVar2.f28907r.setRequestedOrientation(i10);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.f27461a.f28904e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f27461a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f27461a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f27461a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f27461a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27461a.f28903c.getTextureView();
                View controlsView = this.f27461a.f28903c.getControlsView();
                ImageView textureImageView = this.f27461a.f28903c.getTextureImageView();
                nl0 o9 = hh0.o(f7, true);
                float width = o9.f29148c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f29146a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f29147b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f29146a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f29147b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f27461a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f27461a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f27461a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, u6.d, 0);
                FrameLayout frameLayout = this.f27461a.f28904e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, z91Var));
                animatorSet.start();
                return;
            }
            if (this.f27461a.f28904e.getVisibility() == 0) {
                this.f27461a.f28904e.setAlpha(1.0f);
                this.f27461a.f28904e.setVisibility(4);
            }
            z91Var.run();
            this.f27461a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27461a.f28907r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            mv mvVar3 = this.f27461a;
            mvVar3.setOnShowListener(mvVar3.R);
            nl0 o10 = hh0.o(f7, false);
            TextureView textureView2 = this.f27461a.f28903c.getTextureView();
            ImageView textureImageView2 = this.f27461a.f28903c.getTextureImageView();
            float f10 = o10.f29148c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f29146a);
            textureImageView2.setTranslationY(o10.f29147b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f29146a);
            textureView2.setTranslationY(o10.f29147b);
        } else {
            hh0.j(false);
        }
        this.f27461a.setShowWithoutAnimation(true);
        this.f27461a.show();
        if (z11) {
            mv mvVar4 = this.f27461a;
            mvVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) mvVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27461a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27461a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
