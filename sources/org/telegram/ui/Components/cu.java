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
public final class cu implements d81 {
    public final gu f27568a;

    public cu(gu guVar) {
        this.f27568a = guVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i9, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        gu guVar = this.f27568a;
        FrameLayout frameLayout = guVar.f28870e;
        Activity activity = guVar.f28873r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(guVar.f28869c.getAspectRatioView());
            guVar.J = false;
            guVar.I = z11;
            if (activity != null) {
                try {
                    guVar.H = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
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
        guVar.I = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(guVar.H);
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
        gu guVar = this.f27568a;
        if (guVar.f28869c.f()) {
            guVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        gu guVar = this.f27568a;
        au auVar = guVar.f28868b;
        auVar.setVisibility(0);
        guVar.f28874s.setVisibility(0);
        guVar.v.setVisibility(4);
        auVar.setKeepScreenOn(true);
        g81 g81Var = guVar.f28869c;
        g81Var.setVisibility(4);
        g81Var.getControlsView().setVisibility(4);
        g81Var.getTextureView().setVisibility(4);
        if (g81Var.getTextureImageView() != null) {
            g81Var.getTextureImageView().setVisibility(4);
        }
        guVar.f28869c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            auVar.loadUrl(guVar.G, hashMap);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void e(g81 g81Var, boolean z10) {
        Activity activity = this.f27568a.f28873r;
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
    public final TextureView f(View view, boolean z10, int i9, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.e3 e3Var;
        gu guVar = this.f27568a;
        g81 g81Var = guVar.f28869c;
        int[] iArr = guVar.A;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(guVar.f28873r);
            if (!pf0.x(false, guVar.f28873r, null, textureView, i9, i10, false)) {
                return null;
            }
            pf0.f31622l0.Q = guVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            guVar.K = true;
            g81Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - guVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = g81Var.getTextureView();
            ImageView textureImageView = g81Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) guVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, m6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new org.telegram.ui.xp(this, 23));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f27568a.container;
    }

    @Override
    public final boolean h() {
        return this.f27568a.F();
    }

    @Override
    public final void i(boolean z10, y71 y71Var, float f10, boolean z11) {
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
            gu guVar = this.f27568a;
            if (guVar.f28873r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) guVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    gu guVar2 = this.f27568a;
                    int i9 = guVar2.H;
                    if (i9 != -2) {
                        guVar2.f28873r.setRequestedOrientation(i9);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (this.f27568a.f28870e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f27568a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f27568a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f27568a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f27568a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27568a.f28869c.getTextureView();
                View controlsView = this.f27568a.f28869c.getControlsView();
                ImageView textureImageView = this.f27568a.f28869c.getTextureImageView();
                wj0 o6 = pf0.o(f10, true);
                float width = o6.f34235c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o6.f34233a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o6.f34234b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o6.f34233a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o6.f34234b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f27568a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f27568a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f27568a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, m6.d, 0);
                FrameLayout frameLayout = this.f27568a.f28870e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new fg.j(21, this, y71Var));
                animatorSet.start();
                return;
            }
            if (this.f27568a.f28870e.getVisibility() == 0) {
                this.f27568a.f28870e.setAlpha(1.0f);
                this.f27568a.f28870e.setVisibility(4);
            }
            y71Var.run();
            this.f27568a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27568a.f28873r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        if (z11) {
            gu guVar3 = this.f27568a;
            guVar3.setOnShowListener(guVar3.N);
            wj0 o9 = pf0.o(f10, false);
            TextureView textureView2 = this.f27568a.f28869c.getTextureView();
            ImageView textureImageView2 = this.f27568a.f28869c.getTextureImageView();
            float f11 = o9.f34235c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(o9.f34233a);
            textureImageView2.setTranslationY(o9.f34234b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(o9.f34233a);
            textureView2.setTranslationY(o9.f34234b);
        } else {
            pf0.j(false);
        }
        this.f27568a.setShowWithoutAnimation(true);
        this.f27568a.show();
        if (z11) {
            gu guVar4 = this.f27568a;
            guVar4.L = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) guVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27568a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27568a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10, int i9) {
    }
}
