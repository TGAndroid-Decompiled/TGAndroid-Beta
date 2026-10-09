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
public final class hv implements da1 {
    public final lv f27144a;

    public hv(lv lvVar) {
        this.f27144a = lvVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        lv lvVar = this.f27144a;
        FrameLayout frameLayout = lvVar.f28600e;
        Activity activity = lvVar.f28603r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(lvVar.f28599c.getAspectRatioView());
            lvVar.N = false;
            lvVar.M = z11;
            if (activity != null) {
                try {
                    lvVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) lvVar).containerView;
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
        lvVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) lvVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(lvVar.L);
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
        lv lvVar = this.f27144a;
        if (lvVar.f28599c.f()) {
            lvVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        lv lvVar = this.f27144a;
        fv fvVar = lvVar.f28598b;
        fvVar.setVisibility(0);
        lvVar.f28604s.setVisibility(0);
        lvVar.v.setVisibility(4);
        fvVar.setKeepScreenOn(true);
        ha1 ha1Var = lvVar.f28599c;
        ha1Var.setVisibility(4);
        ha1Var.getControlsView().setVisibility(4);
        ha1Var.getTextureView().setVisibility(4);
        if (ha1Var.getTextureImageView() != null) {
            ha1Var.getTextureImageView().setVisibility(4);
        }
        lvVar.f28599c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            fvVar.loadUrl(lvVar.K, hashMap);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void e(ha1 ha1Var, boolean z10) {
        Activity activity = this.f27144a.f28603r;
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
        lv lvVar = this.f27144a;
        ha1 ha1Var = lvVar.f28599c;
        int[] iArr = lvVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(lvVar.f28603r);
            if (!gh0.x(false, lvVar.f28603r, null, textureView, i10, i11, false)) {
                return null;
            }
            gh0.f26700p0.U = lvVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) lvVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            lvVar.O = true;
            ha1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - lvVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) lvVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = ha1Var.getTextureView();
            ImageView textureImageView = ha1Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) lvVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) lvVar).backDrawable;
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
        return this.f27144a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f27144a.f28603r;
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
    public final void i(boolean z10, y91 y91Var, float f7, boolean z11) {
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
            lv lvVar = this.f27144a;
            if (lvVar.f28603r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) lvVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    lv lvVar2 = this.f27144a;
                    int i10 = lvVar2.L;
                    if (i10 != -2) {
                        lvVar2.f28603r.setRequestedOrientation(i10);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.f27144a.f28600e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f27144a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f27144a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f27144a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f27144a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27144a.f28599c.getTextureView();
                View controlsView = this.f27144a.f28599c.getControlsView();
                ImageView textureImageView = this.f27144a.f28599c.getTextureImageView();
                ml0 o9 = gh0.o(f7, true);
                float width = o9.f28856c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f28854a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f28855b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f28854a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f28855b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f27144a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f27144a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f27144a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, u6.d, 0);
                FrameLayout frameLayout = this.f27144a.f28600e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, y91Var));
                animatorSet.start();
                return;
            }
            if (this.f27144a.f28600e.getVisibility() == 0) {
                this.f27144a.f28600e.setAlpha(1.0f);
                this.f27144a.f28600e.setVisibility(4);
            }
            y91Var.run();
            this.f27144a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27144a.f28603r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            lv lvVar3 = this.f27144a;
            lvVar3.setOnShowListener(lvVar3.R);
            ml0 o10 = gh0.o(f7, false);
            TextureView textureView2 = this.f27144a.f28599c.getTextureView();
            ImageView textureImageView2 = this.f27144a.f28599c.getTextureImageView();
            float f10 = o10.f28856c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f28854a);
            textureImageView2.setTranslationY(o10.f28855b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f28854a);
            textureView2.setTranslationY(o10.f28855b);
        } else {
            gh0.j(false);
        }
        this.f27144a.setShowWithoutAnimation(true);
        this.f27144a.show();
        if (z11) {
            lv lvVar4 = this.f27144a;
            lvVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) lvVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27144a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27144a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
