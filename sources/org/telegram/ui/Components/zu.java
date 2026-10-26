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
public final class zu implements ja1 {
    public final dv f35408a;

    public zu(dv dvVar) {
        this.f35408a = dvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        dv dvVar = this.f35408a;
        FrameLayout frameLayout = dvVar.e;
        Activity activity = dvVar.f27611r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(dvVar.f27608c.getAspectRatioView());
            dvVar.N = false;
            dvVar.M = z11;
            if (activity != null) {
                try {
                    dvVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
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
        dvVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(dvVar.L);
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
        dv dvVar = this.f35408a;
        if (dvVar.f27608c.f()) {
            dvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        dv dvVar = this.f35408a;
        xu xuVar = dvVar.f27607b;
        xuVar.setVisibility(0);
        dvVar.f27612s.setVisibility(0);
        dvVar.v.setVisibility(4);
        xuVar.setKeepScreenOn(true);
        ma1 ma1Var = dvVar.f27608c;
        ma1Var.setVisibility(4);
        ma1Var.getControlsView().setVisibility(4);
        ma1Var.getTextureView().setVisibility(4);
        if (ma1Var.getTextureImageView() != null) {
            ma1Var.getTextureImageView().setVisibility(4);
        }
        dvVar.f27608c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            xuVar.loadUrl(dvVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(ma1 ma1Var, boolean z10) {
        Activity activity = this.f35408a.f27611r;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.j3 j3Var;
        dv dvVar = this.f35408a;
        ma1 ma1Var = dvVar.f27608c;
        int[] iArr = dvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(dvVar.f27611r);
            if (!ch0.x(false, dvVar.f27611r, null, textureView, i10, i11, false)) {
                return null;
            }
            ch0.f27159p0.U = dvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            dvVar.O = true;
            ma1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - dvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = ma1Var.getTextureView();
            ImageView textureImageView = ma1Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            j3Var = ((org.telegram.ui.ActionBar.k3) dvVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(j3Var, v6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new org.telegram.ui.qp(this, 24));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f35408a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f35408a.f27611r;
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
    public final void i(boolean z10, ea1 ea1Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.j3 j3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.j3 j3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.j3 j3Var3;
        if (z10) {
            dv dvVar = this.f35408a;
            if (dvVar.f27611r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.k3) dvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    dv dvVar2 = this.f35408a;
                    int i10 = dvVar2.L;
                    if (i10 != -2) {
                        dvVar2.f27611r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f35408a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.k3) this.f35408a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.k3) this.f35408a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                j3Var3 = ((org.telegram.ui.ActionBar.k3) this.f35408a).backDrawable;
                j3Var3.setAlpha(0);
            }
            this.f35408a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f35408a.f27608c.getTextureView();
                View controlsView = this.f35408a.f27608c.getControlsView();
                ImageView textureImageView = this.f35408a.f27608c.getTextureImageView();
                hl0 o10 = ch0.o(f7, true);
                float width = o10.f29011c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f29009a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f29010b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f29009a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f29010b);
                viewGroup4 = ((org.telegram.ui.ActionBar.k3) this.f35408a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.k3) this.f35408a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                j3Var2 = ((org.telegram.ui.ActionBar.k3) this.f35408a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(j3Var2, v6.d, 0);
                FrameLayout frameLayout = this.f35408a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bi.ce(24, this, ea1Var));
                animatorSet.start();
                return;
            }
            if (this.f35408a.e.getVisibility() == 0) {
                this.f35408a.e.setAlpha(1.0f);
                this.f35408a.e.setVisibility(4);
            }
            ea1Var.run();
            this.f35408a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f35408a.f27611r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            dv dvVar3 = this.f35408a;
            dvVar3.setOnShowListener(dvVar3.R);
            hl0 o11 = ch0.o(f7, false);
            TextureView textureView2 = this.f35408a.f27608c.getTextureView();
            ImageView textureImageView2 = this.f35408a.f27608c.getTextureImageView();
            float f10 = o11.f29011c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o11.f29009a);
            textureImageView2.setTranslationY(o11.f29010b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o11.f29009a);
            textureView2.setTranslationY(o11.f29010b);
        } else {
            ch0.j(false);
        }
        this.f35408a.setShowWithoutAnimation(true);
        this.f35408a.show();
        if (z11) {
            dv dvVar4 = this.f35408a;
            dvVar4.P = 4;
            j3Var = ((org.telegram.ui.ActionBar.k3) dvVar4).backDrawable;
            j3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.f35408a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) this.f35408a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
