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
public final class wu implements aa1 {
    public final av f32350a;

    public wu(av avVar) {
        this.f32350a = avVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        av avVar = this.f32350a;
        FrameLayout frameLayout = avVar.e;
        Activity activity = avVar.f24814r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(avVar.f24811c.getAspectRatioView());
            avVar.N = false;
            avVar.M = z11;
            if (activity != null) {
                try {
                    avVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.h3) avVar).containerView;
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
        avVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.h3) avVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(avVar.L);
                return null;
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        av avVar = this.f32350a;
        if (avVar.f24811c.f()) {
            avVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        av avVar = this.f32350a;
        uu uuVar = avVar.f24810b;
        uuVar.setVisibility(0);
        avVar.f24815s.setVisibility(0);
        avVar.v.setVisibility(4);
        uuVar.setKeepScreenOn(true);
        da1 da1Var = avVar.f24811c;
        da1Var.setVisibility(4);
        da1Var.getControlsView().setVisibility(4);
        da1Var.getTextureView().setVisibility(4);
        if (da1Var.getTextureImageView() != null) {
            da1Var.getTextureImageView().setVisibility(4);
        }
        avVar.f24811c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            uuVar.loadUrl(avVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(da1 da1Var, boolean z10) {
        Activity activity = this.f32350a.f24814r;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.g3 g3Var;
        av avVar = this.f32350a;
        da1 da1Var = avVar.f24811c;
        int[] iArr = avVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(avVar.f24814r);
            if (!ch0.x(false, avVar.f24814r, null, textureView, i10, i11, false)) {
                return null;
            }
            ch0.f25313p0.U = avVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) avVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            avVar.O = true;
            da1Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - avVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) avVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = da1Var.getTextureView();
            ImageView textureImageView = da1Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.h3) avVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            g3Var = ((org.telegram.ui.ActionBar.h3) avVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(g3Var, r6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new org.telegram.ui.pq(this, 23));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f32350a.container;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f32350a.f24814r;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        d5.A(activity, null, false);
        return false;
    }

    @Override
    public final void i(boolean z10, v91 v91Var, float f7, boolean z11) {
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
        if (z10) {
            av avVar = this.f32350a;
            if (avVar.f24814r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.h3) avVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    av avVar2 = this.f32350a;
                    int i10 = avVar2.L;
                    if (i10 != -2) {
                        avVar2.f24814r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f32350a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.h3) this.f32350a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.h3) this.f32350a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                g3Var3 = ((org.telegram.ui.ActionBar.h3) this.f32350a).backDrawable;
                g3Var3.setAlpha(0);
            }
            this.f32350a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f32350a.f24811c.getTextureView();
                View controlsView = this.f32350a.f24811c.getControlsView();
                ImageView textureImageView = this.f32350a.f24811c.getTextureImageView();
                hl0 o10 = ch0.o(f7, true);
                float width = o10.f27077c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f27075a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f27076b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f27075a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f27076b);
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) this.f32350a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.h3) this.f32350a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                g3Var2 = ((org.telegram.ui.ActionBar.h3) this.f32350a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var2, r6.d, 0);
                FrameLayout frameLayout = this.f32350a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.ne(24, this, v91Var));
                animatorSet.start();
                return;
            }
            if (this.f32350a.e.getVisibility() == 0) {
                this.f32350a.e.setAlpha(1.0f);
                this.f32350a.e.setVisibility(4);
            }
            v91Var.run();
            this.f32350a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f32350a.f24814r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            av avVar3 = this.f32350a;
            avVar3.setOnShowListener(avVar3.R);
            hl0 o11 = ch0.o(f7, false);
            TextureView textureView2 = this.f32350a.f24811c.getTextureView();
            ImageView textureImageView2 = this.f32350a.f24811c.getTextureImageView();
            float f10 = o11.f27077c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o11.f27075a);
            textureImageView2.setTranslationY(o11.f27076b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o11.f27075a);
            textureView2.setTranslationY(o11.f27076b);
        } else {
            ch0.j(false);
        }
        this.f32350a.setShowWithoutAnimation(true);
        this.f32350a.show();
        if (z11) {
            av avVar4 = this.f32350a;
            avVar4.P = 4;
            g3Var = ((org.telegram.ui.ActionBar.h3) avVar4).backDrawable;
            g3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f32350a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f32350a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
