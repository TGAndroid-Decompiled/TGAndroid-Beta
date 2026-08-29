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
public final class iu implements p81 {
    public final mu f29474a;

    public iu(mu muVar) {
        this.f29474a = muVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f9, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        mu muVar = this.f29474a;
        FrameLayout frameLayout = muVar.f30766e;
        Activity activity = muVar.f30769r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(muVar.f30765c.getAspectRatioView());
            muVar.J = false;
            muVar.I = z11;
            if (activity != null) {
                try {
                    muVar.H = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
                    viewGroup2.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        muVar.I = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(muVar.H);
                return null;
            } catch (Exception e11) {
                FileLog.e(e11);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        mu muVar = this.f29474a;
        if (muVar.f30765c.f()) {
            muVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        mu muVar = this.f29474a;
        gu guVar = muVar.f30764b;
        guVar.setVisibility(0);
        muVar.f30770s.setVisibility(0);
        muVar.v.setVisibility(4);
        guVar.setKeepScreenOn(true);
        s81 s81Var = muVar.f30765c;
        s81Var.setVisibility(4);
        s81Var.getControlsView().setVisibility(4);
        s81Var.getTextureView().setVisibility(4);
        if (s81Var.getTextureImageView() != null) {
            s81Var.getTextureImageView().setVisibility(4);
        }
        muVar.f30765c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            guVar.loadUrl(muVar.G, hashMap);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void e(s81 s81Var, boolean z10) {
        Activity activity = this.f29474a.f30769r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        mu muVar = this.f29474a;
        s81 s81Var = muVar.f30765c;
        int[] iArr = muVar.A;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(muVar.f30769r);
            if (!bg0.x(false, muVar.f30769r, null, textureView, i10, i11, false)) {
                return null;
            }
            bg0.f27076l0.Q = muVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            muVar.K = true;
            s81Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - muVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = s81Var.getTextureView();
            ImageView textureImageView = s81Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) muVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, r6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new org.telegram.ui.bm(this, 25));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f29474a.container;
    }

    @Override
    public final boolean h() {
        return this.f29474a.F();
    }

    @Override
    public final void i(boolean z10, k81 k81Var, float f9, boolean z11) {
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
            mu muVar = this.f29474a;
            if (muVar.f30769r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) muVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    mu muVar2 = this.f29474a;
                    int i10 = muVar2.H;
                    if (i10 != -2) {
                        muVar2.f30769r.setRequestedOrientation(i10);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (this.f29474a.f30766e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f29474a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f29474a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f29474a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f29474a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f29474a.f30765c.getTextureView();
                View controlsView = this.f29474a.f30765c.getControlsView();
                ImageView textureImageView = this.f29474a.f30765c.getTextureImageView();
                hk0 o10 = bg0.o(f9, true);
                float width = o10.f29197c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f29195a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f29196b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f29195a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f29196b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f29474a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f29474a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f29474a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, r6.d, 0);
                FrameLayout frameLayout = this.f29474a.f30766e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bg.c3(24, this, k81Var));
                animatorSet.start();
                return;
            }
            if (this.f29474a.f30766e.getVisibility() == 0) {
                this.f29474a.f30766e.setAlpha(1.0f);
                this.f29474a.f30766e.setVisibility(4);
            }
            k81Var.run();
            this.f29474a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f29474a.f30769r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            mu muVar3 = this.f29474a;
            muVar3.setOnShowListener(muVar3.N);
            hk0 o11 = bg0.o(f9, false);
            TextureView textureView2 = this.f29474a.f30765c.getTextureView();
            ImageView textureImageView2 = this.f29474a.f30765c.getTextureImageView();
            float f10 = o11.f29197c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o11.f29195a);
            textureImageView2.setTranslationY(o11.f29196b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o11.f29195a);
            textureView2.setTranslationY(o11.f29196b);
        } else {
            bg0.j(false);
        }
        this.f29474a.setShowWithoutAnimation(true);
        this.f29474a.show();
        if (z11) {
            mu muVar4 = this.f29474a;
            muVar4.L = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) muVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f29474a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f29474a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f9, int i10) {
    }
}
