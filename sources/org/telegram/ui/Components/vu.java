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
public final class vu implements x91 {
    public final zu f32424a;

    public vu(zu zuVar) {
        this.f32424a = zuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zu zuVar = this.f32424a;
        FrameLayout frameLayout = zuVar.f33644e;
        Activity activity = zuVar.f33647r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(zuVar.f33643c.getAspectRatioView());
            zuVar.N = false;
            zuVar.M = z11;
            if (activity != null) {
                try {
                    zuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
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
        zuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(zuVar.L);
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
        zu zuVar = this.f32424a;
        if (zuVar.f33643c.f()) {
            zuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        zu zuVar = this.f32424a;
        tu tuVar = zuVar.f33642b;
        tuVar.setVisibility(0);
        zuVar.f33648s.setVisibility(0);
        zuVar.v.setVisibility(4);
        tuVar.setKeepScreenOn(true);
        aa1 aa1Var = zuVar.f33643c;
        aa1Var.setVisibility(4);
        aa1Var.getControlsView().setVisibility(4);
        aa1Var.getTextureView().setVisibility(4);
        if (aa1Var.getTextureImageView() != null) {
            aa1Var.getTextureImageView().setVisibility(4);
        }
        zuVar.f33643c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            tuVar.loadUrl(zuVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void e(aa1 aa1Var, boolean z10) {
        Activity activity = this.f32424a.f33647r;
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
        zu zuVar = this.f32424a;
        aa1 aa1Var = zuVar.f33643c;
        int[] iArr = zuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(zuVar.f33647r);
            if (!rg0.x(false, zuVar.f33647r, null, textureView, i10, i11, false)) {
                return null;
            }
            rg0.f30466p0.U = zuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            zuVar.O = true;
            aa1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - zuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = aa1Var.getTextureView();
            ImageView textureImageView = aa1Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) zuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, s6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new r8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f32424a.container;
    }

    @Override
    public final boolean h() {
        return this.f32424a.E();
    }

    @Override
    public final void i(boolean z10, s91 s91Var, float f7, boolean z11) {
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
            zu zuVar = this.f32424a;
            if (zuVar.f33647r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) zuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    zu zuVar2 = this.f32424a;
                    int i10 = zuVar2.L;
                    if (i10 != -2) {
                        zuVar2.f33647r.setRequestedOrientation(i10);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.f32424a.f33644e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f32424a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f32424a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f32424a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f32424a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f32424a.f33643c.getTextureView();
                View controlsView = this.f32424a.f33643c.getControlsView();
                ImageView textureImageView = this.f32424a.f33643c.getTextureImageView();
                uk0 o9 = rg0.o(f7, true);
                float width = o9.f31450c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f31448a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f31449b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f31448a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f31449b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f32424a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f32424a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f32424a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, s6.d, 0);
                FrameLayout frameLayout = this.f32424a.f33644e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, s91Var));
                animatorSet.start();
                return;
            }
            if (this.f32424a.f33644e.getVisibility() == 0) {
                this.f32424a.f33644e.setAlpha(1.0f);
                this.f32424a.f33644e.setVisibility(4);
            }
            s91Var.run();
            this.f32424a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f32424a.f33647r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            zu zuVar3 = this.f32424a;
            zuVar3.setOnShowListener(zuVar3.R);
            uk0 o10 = rg0.o(f7, false);
            TextureView textureView2 = this.f32424a.f33643c.getTextureView();
            ImageView textureImageView2 = this.f32424a.f33643c.getTextureImageView();
            float f10 = o10.f31450c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f31448a);
            textureImageView2.setTranslationY(o10.f31449b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f31448a);
            textureView2.setTranslationY(o10.f31449b);
        } else {
            rg0.j(false);
        }
        this.f32424a.setShowWithoutAnimation(true);
        this.f32424a.show();
        if (z11) {
            zu zuVar4 = this.f32424a;
            zuVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) zuVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f32424a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f32424a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
